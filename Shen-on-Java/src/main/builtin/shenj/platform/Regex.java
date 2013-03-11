package shenj.platform;

import static com.mentics.shenj.ShenjRuntime.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda3;
import com.mentics.shenj.Symbol;


public class Regex {
    public static final Symbol SYMBOL = symbol("shenj.platform/regex-replace");
    public static Lambda LAMBDA = new Lambda3() {
        public Object apply(final Object regex, final Object string, final Object replace) throws Exception {
            Pattern pat = Pattern.compile((String) regex);
            Matcher matcher = pat.matcher((String) string);
            return matcher.replaceAll((String)replace);
        }
    };
}
