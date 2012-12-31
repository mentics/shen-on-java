package shenj.platform;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.ShenjUtil.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.mentics.shenj.ArrayUtil;
import com.mentics.shenj.Cons;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda2;
import com.mentics.shenj.ShenException;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.inner.Context;
import com.mentics.util.StringUtil;


/**
 * Returns a tuple (return type name:String, args string:String)
 * Return type currently only checks if it's void or not.
 */
public class InstanceMethodArgInfo {
    public static final Symbol SYMBOL = symbol("shenj.platform/instance-method-arg-info");
    public static Lambda LAMBDA = new Lambda2() {
        public Object apply(final Object first, final Object theArgs) throws Exception {
            Object[] args =  theArgs instanceof Cons ? ((Cons) theArgs).toArray() : new Object[0];

            String call = (String)first;
            String methodName = StringUtil.lastToken(".", call);
            String receiverType = call.substring(0, call.length() - methodName.length()-1);

            Class<?> cls = Context.loadClass(receiverType);
            String argString = null;
            String returnType = null;
            for (Method method : cls.getMethods()) {
                // Ignore static methods and look for matching name
                if ((method.getModifiers() & Modifier.STATIC) != 0 || !methodName.equals(method.getName())) {
                    continue;
                }

                Class<?>[] types = method.getParameterTypes();
                if (types.length == 0 && args.length == 0) {
                    return tuple(method.getReturnType(), "", receiverType);
                }
                String newArgString = makeArgString(types, makeTypePairList(ArrayUtil.removeFirst(1, args)));
                if (newArgString != null) {
                    if (argString != null) {
                        throw new ShenException("Ambiguous method for signature " + call + " " + args);
                    } else {
                        argString = newArgString;
                        returnType = method.getReturnType().getName();
                    }
                }
            }
            if (argString != null) {
                return tuple(returnType, argString, receiverType);
            } else {
                throw new ShenException("No method found for: " + cls.getName() + " " + call + " " + theArgs);
            }
        }
    };
}
