package shen.gen;



import com.mentics.shen.*;

public class ShenElimDefine {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-elim-define");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v657) throws Exception {
return defined(v657);
}};
public static Object defined(final Object v657) throws Exception {


final Object i640;
if ((boolean)(v657 instanceof Cons)) {


final Object i638;
if ((boolean)Lang.equals(RuntimeContext.symbol("define"), ((Cons)v657).head)) {



final Object i637;
if ((boolean)(((Cons)v657).tail instanceof Cons)) {

i637 = true;
} else {

i637 = false;

}
i638 = i637;
} else {

i638 = false;

}
final Object i639;
if ((boolean)i638) {

i639 = true;
} else {

i639 = false;

}
i640 = i639;
} else {

i640 = false;

}
final Object i647;
if ((boolean)i640) {




final Object f641 = ShenShenToKl.LAMBDA.apply(((Cons)((Cons)v657).tail).head, ((Cons)((Cons)v657).tail).tail);

i647 = f641;
} else {


final Object i646;
if ((boolean)(v657 instanceof Cons)) {
final Lambda l643 = new Lambda1() {
  public Object apply(final Object v658) throws Exception {
    final Object f642 = ShenElimDefine.LAMBDA.apply(v658);

    return f642;
  }
};final Object f644 = Map.LAMBDA.apply(l643, v657);

i646 = f644;
} else {

final Object i645;
if ((boolean)true) {

i645 = v657;
} else {

throw new SimpleError((String)"True condition not found.");


}
i646 = i645;

}
i647 = i646;

}
    return i647;

}
}
