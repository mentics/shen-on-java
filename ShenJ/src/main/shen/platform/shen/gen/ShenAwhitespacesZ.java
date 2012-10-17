package shen.gen;



import com.mentics.shen.*;

public class ShenAwhitespacesZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<whitespaces>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1061) throws Exception {
return defined(v1061);
}};
public static Object defined(final Object v1061) throws Exception {
final Object f5686 = ShenAwhitespaceZ.LAMBDA.apply(v1061);

final Object parse_AwhitespaceZ5685 = f5686;


final Object i5692;
if ((boolean)!((boolean)Lang.equals(null, parse_AwhitespaceZ5685))) {
final Object f5688 = ShenAwhitespacesZ.LAMBDA.apply(parse_AwhitespaceZ5685);

final Object parse_AwhitespacesZ5687 = f5688;


final Object i5691;
if ((boolean)!((boolean)Lang.equals(null, parse_AwhitespacesZ5687))) {
final Object f5689 = Fst.LAMBDA.apply(parse_AwhitespacesZ5687);
final Object f5690 = ShenReassemble.LAMBDA.apply(f5689, RuntimeContext.symbol("shen-skip"));

i5691 = f5690;
} else {

i5691 = null;

}

i5692 = i5691;
} else {

i5692 = null;

}

final Object result5684 = i5692;

final Object i5700;
if ((boolean)Lang.equals(result5684, null)) {
final Object f5695 = ShenAwhitespaceZ.LAMBDA.apply(v1061);

final Object parse_AwhitespaceZ5694 = f5695;


final Object i5698;
if ((boolean)!((boolean)Lang.equals(null, parse_AwhitespaceZ5694))) {
final Object f5696 = Fst.LAMBDA.apply(parse_AwhitespaceZ5694);
final Object f5697 = ShenReassemble.LAMBDA.apply(f5696, RuntimeContext.symbol("shen-skip"));

i5698 = f5697;
} else {

i5698 = null;

}

final Object result5693 = i5698;

final Object i5699;
if ((boolean)Lang.equals(result5693, null)) {

i5699 = null;
} else {

i5699 = result5693;

}

i5700 = i5699;
} else {

i5700 = result5684;

}

    return i5700;

}
}
