package shen.gen;



import com.mentics.shen.*;

public class BoundQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("bound?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v947) throws Exception {
return defined(v947);
}};
public static Object defined(final Object v947) throws Exception {
final Object f1116 = SymbolQ.LAMBDA.apply(v947);

final Object i1123;
if ((boolean)f1116) {
Object t1119;
try {


t1119 = RuntimeContext.globalProperties.get(v947);
} catch (Throwable t) {
final Lambda l1118 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return RuntimeContext.symbol("shen-this-symbol-is-unbound");
  }
};
t1119 = l1118.apply(t);
}
final Object t1120 = t1119;

final Object val1117 = t1120;

final Object i1121;
if ((boolean)Lang.equals(val1117, RuntimeContext.symbol("shen-this-symbol-is-unbound"))) {

i1121 = false;
} else {

i1121 = true;

}

final Object i1122;
if ((boolean)i1121) {

i1122 = true;
} else {

i1122 = false;

}
i1123 = i1122;
} else {

i1123 = false;

}
    return i1123;

}
}
