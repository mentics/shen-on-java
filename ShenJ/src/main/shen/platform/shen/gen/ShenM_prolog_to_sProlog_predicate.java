package shen.gen;



import com.mentics.shen.*;

public class ShenM_prolog_to_sProlog_predicate {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-m_prolog_to_s-prolog_predicate");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1225) throws Exception {
return defined(v1225);
}};
public static Object defined(final Object v1225) throws Exception {

final Object i2991;
if ((boolean)Lang.equals(RuntimeContext.symbol("="), v1225)) {

i2991 = RuntimeContext.symbol("unify");
} else {

final Object i2990;
if ((boolean)Lang.equals(RuntimeContext.symbol("=!"), v1225)) {

i2990 = RuntimeContext.symbol("unify!");
} else {

final Object i2989;
if ((boolean)Lang.equals(RuntimeContext.symbol("=="), v1225)) {

i2989 = RuntimeContext.symbol("identical");
} else {

final Object i2988;
if ((boolean)true) {

i2988 = v1225;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2989 = i2988;

}
i2990 = i2989;

}
i2991 = i2990;

}
    return i2991;

}
}
