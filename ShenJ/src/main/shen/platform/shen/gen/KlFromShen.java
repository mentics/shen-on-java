package shen.gen;



import com.mentics.shen.*;

public class KlFromShen {

public static final Symbol SYMBOL = RuntimeContext.symbol("kl-from-shen");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6906) throws Exception {
return defined(v6906);
}};
public static Object defined(final Object v6906) throws Exception {
final Lambda l6974 = new Lambda1() {
  public Object apply(final Object v6905) throws Exception {
    final Object f6973 = Macroexpand.LAMBDA.apply(v6905);

    return f6973;
  }
};final Object f6975 = ShenWalk.LAMBDA.apply(l6974, v6906);

final Object x6972 = f6975;
final Object f6977 = ShenPackagedQ.LAMBDA.apply(x6972);

final Object i6979;
if ((boolean)f6977) {
final Object f6978 = PackageContents.LAMBDA.apply(x6972);

i6979 = f6978;
} else {

i6979 = x6972;

}
final Object x6976 = i6979;
final Object f6980 = ShenProcInputPlus.LAMBDA.apply(x6976);
final Object f6981 = ShenElimDefine.LAMBDA.apply(f6980);



    return f6981;

}
}
