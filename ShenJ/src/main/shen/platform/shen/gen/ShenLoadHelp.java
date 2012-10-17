package shen.gen;



import com.mentics.shen.*;

public class ShenLoadHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-load-help");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1656, final Object v1657) throws Exception {
return defined(v1656, v1657);
}};
public static Object defined(final Object v1656, final Object v1657) throws Exception {

final Object i4231;
if ((boolean)Lang.equals(false, v1656)) {
final Lambda l4209 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f4206 = ShenEvalWithoutMacros.LAMBDA.apply(x);
final Object f4207 = Atp.LAMBDA.apply(f4206, Nil.NIL);
final Object f4208 = Intoutput.LAMBDA.apply("~S~%", f4207);

    return f4208;
  }
};final Object f4210 = Map.LAMBDA.apply(l4209, v1657);

i4231 = f4210;
} else {

final Object i4230;
if ((boolean)true) {
final Lambda l4213 = new Lambda1() {
  public Object apply(final Object v1658) throws Exception {
    final Object f4212 = ShenRemoveSynonyms.LAMBDA.apply(v1658);

    return f4212;
  }
};final Object f4214 = Mapcan.LAMBDA.apply(l4213, v1657);

final Object removeSynonyms4211 = f4214;
final Lambda l4217 = new Lambda1() {
  public Object apply(final Object v1659) throws Exception {
    final Object f4216 = ShenTypetable.LAMBDA.apply(v1659);

    return f4216;
  }
};final Object f4218 = Mapcan.LAMBDA.apply(l4217, removeSynonyms4211);

final Object table4215 = f4218;
final Lambda l4221 = new Lambda1() {
  public Object apply(final Object v1660) throws Exception {
    final Object f4220 = ShenAssumetype.LAMBDA.apply(v1660);

    return f4220;
  }
};final Object f4222 = Map.LAMBDA.apply(l4221, table4215);

final Object assume4219 = f4222;
Object t4228;
try {
final Lambda l4224 = new Lambda1() {
  public Object apply(final Object v1661) throws Exception {
    final Object f4223 = ShenTypecheckAndLoad.LAMBDA.apply(v1661);

    return f4223;
  }
};final Object f4225 = Map.LAMBDA.apply(l4224, removeSynonyms4211);

t4228 = f4225;
} catch (Throwable t) {
final Lambda l4227 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    final Object f4226 = ShenUnwindTypes.LAMBDA.apply(e, table4215);

    return f4226;
  }
};
t4228 = l4227.apply(t);
}
final Object t4229 = t4228;




i4230 = t4229;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4231 = i4230;

}
    return i4231;

}
}
