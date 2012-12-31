package shenj.platform;

import static com.mentics.shenj.Lang.*;
import static com.mentics.shenj.Nil.*;
import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.ShenjUtil.*;

import java.lang.reflect.Constructor;
import java.util.List;

import com.mentics.shenj.Cons;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda2;
import com.mentics.shenj.Nil;
import com.mentics.shenj.ShenException;
import com.mentics.shenj.Symbol;
import com.mentics.util.StringUtil;


public class ConstructorArgString {
    public static final Symbol SYMBOL = symbol("shenj.platform/constructor-arg-string");
    public static Lambda LAMBDA = new Lambda2() {
        public Object apply(final Object call, final Object theArgs) throws Exception {
            if (theArgs == Nil.NIL) {
                return "";
            }
            Object[] args = theArgs == NIL ? EMPTY_OBJECT_ARRAY : ((Cons) theArgs).toArray();
            List<String[]> argsPairList = makeTypePairList(args);

            String className = call.toString();
            Class<?> cls = currentContext.get().getClass(className);
            
            String argString = null;
            for (Constructor<?> constructor : cls.getConstructors()) {
                Class<?>[] types = constructor.getParameterTypes();
                String newArgString = makeArgString(types, argsPairList);
                if (newArgString != null) {
                    if (argString != null) {
                        throw new ShenException("Ambiguous constructors for signature " + call + " "
                                + StringUtil.toString(args));
                    } else {
                        argString = newArgString;
                    }
                }
            }
            if (argString != null) {
                return argString;
            } else {
                throw new ShenException("No constructor found for: " + call + ", " + theArgs);
            }
        }
    };
}
