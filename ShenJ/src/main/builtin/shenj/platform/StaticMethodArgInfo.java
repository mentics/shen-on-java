package shenj.platform;

import static com.mentics.shenj.Lang.*;
import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.ShenjUtil.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.mentics.shenj.Cons;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda2;
import com.mentics.shenj.Lang;
import com.mentics.shenj.Nil;
import com.mentics.shenj.ShenException;
import com.mentics.shenj.ShenjUtil;
import com.mentics.shenj.Symbol;
import com.mentics.util.StringUtil;


/**
 * Returns a tuple (return type name:String, args string:String)
 * Return type currently only checks if it's void or not.
 */
public class StaticMethodArgInfo {
    public static final Symbol SYMBOL = symbol("shenj.platform/static-method-arg-info");
    public static Lambda LAMBDA = new Lambda2() {
        public Object apply(final Object call, final Object theArgs) throws Exception {
            Object[] args = theArgs == Nil.NIL ? EMPTY_OBJECT_ARRAY : ((Cons) theArgs).toArray();

            String methodName = StringUtil.lastToken(".", (String) call);
            String className = StringUtil.removeLastToken(".", (String) call);

            Class<?> cls = currentContext.get().getClass(className);
            String argString = null;
            String returnType = null;
            for (Method method : cls.getMethods()) {
                // Must be static method and matching name
                if ((method.getModifiers() & Modifier.STATIC) == 0 || !methodName.equals(method.getName())) {
                    continue;
                }

                Class<?>[] types = method.getParameterTypes();
                if (types.length == 0 && args.length == 0) {
                    return tuple(method.getReturnType().getName(), "");
                }
                String newArgString = ShenjUtil.makeArgString(types, makeTypePairList(args));
                if (newArgString != null) {
                    if (argString != null) {
                        throw new ShenException("Ambiguous static method for signature " + call + " " + args);
                    } else {
                        argString = newArgString;
                        returnType = method.getReturnType().getName();
                    }
                }
            }
            if (argString != null) {
                return tuple(returnType, argString);
            } else {
                throw new ShenException("No static method found for: " + cls.getName() + " " + call + " " + theArgs);
            }
        }
    };
}
