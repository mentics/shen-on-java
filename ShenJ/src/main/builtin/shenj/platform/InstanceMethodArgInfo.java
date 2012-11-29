package shenj.platform;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.ShenjUtil.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import com.mentics.shenj.ArrayUtil;
import com.mentics.shenj.Cons;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda2;
import com.mentics.shenj.ShenException;
import com.mentics.shenj.Symbol;


/**
 * Returns a tuple (return type name:String, args string:String)
 * Return type currently only checks if it's void or not.
 */
public class InstanceMethodArgInfo {
    public static final Symbol SYMBOL = symbol("shenj.platform/instance-method-arg-info");
    public static Lambda LAMBDA = new Lambda2() {
        public Object apply(final Object call, final Object theArgs) throws Exception {
            Object[] args = ((Cons) theArgs).toArray();

            if (!args[0].equals(SPLITTER)) {
                throw new ShenException("Please specify type with [instance expression]:type for " + call + " "
                        + Arrays.deepToString(args));
            }

            String methodName = (String) call;

            Class<?> cls = currentContext.get().getClass(stripSymbolCall(args[1].toString()));
            String argString = null;
            String returnType = null;
            for (Method method : cls.getMethods()) {
                // Ignore static methods and look for matching name
                if ((method.getModifiers() & Modifier.STATIC) != 0 || !methodName.equals(method.getName())) {
                    continue;
                }

                Class<?>[] types = method.getParameterTypes();
                if (types.length == 0 && args.length == 0) {
                    return tuple(method.getReturnType(), "");
                }
                String newArgString = makeArgString(types, makeTypePairList(ArrayUtil.removeFirst(2, args)));
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
                return tuple(returnType, argString);
            } else {
                throw new ShenException("No method found for: " + cls.getName() + " " + call + " " + theArgs);
            }
        }
    };
}
