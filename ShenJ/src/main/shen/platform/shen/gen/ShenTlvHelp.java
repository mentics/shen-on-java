package shen.gen;



import com.mentics.shen.*;

public class ShenTlvHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-tlv-help");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v758, final Object v759, final Object v760, final Object v761) throws Exception {
return defined(v758, v759, v760, v761);
}};
public static Object defined(final Object v758, final Object v759, final Object v760, final Object v761) throws Exception {

final Object i867;
if ((boolean)Lang.equals(v760, v759)) {


final Object f863 = ShenCopyfromvector.LAMBDA.apply(v758, v761, v760, Primitives.minus.apply(v760, 1));

i867 = f863;
} else {

final Object i866;
if ((boolean)true) {




final Object f864 = ShenCopyfromvector.LAMBDA.apply(v758, v761, v759, Primitives.minus.apply(v759, 1));
final Object f865 = ShenTlvHelp.LAMBDA.apply(v758, Primitives.plus.apply(v759, 1), v760, f864);

i866 = f865;
} else {

throw new SimpleError((String)"True condition not found.");


}
i867 = i866;

}
    return i867;

}
}
