package shen.gen;



import com.mentics.shen.*;

public class WriteSource {

public static final Symbol SYMBOL = RuntimeContext.symbol("write-source");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v7232, final Object v7233) throws Exception {
return defined(v7232, v7233);
}};
public static Object defined(final Object v7232, final Object v7233) throws Exception {
final Object f7300 = Ats.LAMBDA.apply("/", v7232);
final Object f7301 = Ats.LAMBDA.apply("n", f7300);
final Object f7302 = Ats.LAMBDA.apply("e", f7301);
final Object f7303 = Ats.LAMBDA.apply("g", f7302);
final Object f7304 = Ats.LAMBDA.apply("/", f7303);
final Object f7305 = Ats.LAMBDA.apply("n", f7304);
final Object f7306 = Ats.LAMBDA.apply("e", f7305);
final Object f7307 = Ats.LAMBDA.apply("h", f7306);
final Object f7308 = Ats.LAMBDA.apply("s", f7307);
final Object f7309 = Ats.LAMBDA.apply("/", f7308);
final Object f7310 = Ats.LAMBDA.apply("n", f7309);
final Object f7311 = Ats.LAMBDA.apply("e", f7310);
final Object f7312 = Ats.LAMBDA.apply("g", f7311);

final Object file7299 = f7312;
final Object f7313 = WriteStringToFile.LAMBDA.apply(file7299, v7233);
final Object f7314 = Do.LAMBDA.apply(f7313, file7299);


    return f7314;

}
}
