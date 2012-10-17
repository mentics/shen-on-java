package shen.gen;



import com.mentics.shen.*;

public class ShenBy_hypothesis {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-by_hypothesis");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v831, final Object v832, final Object v833, final Object v834, final Object v835) throws Exception {
return defined(v831, v832, v833, v834, v835);
}};
public static Object defined(final Object v831, final Object v832, final Object v833, final Object v834, final Object v835) throws Exception {
final Object f2578 = ShenLazyderef.LAMBDA.apply(v833, v834);

final Object v5272577 = f2578;


final Object i2601;
if ((boolean)(v5272577 instanceof Cons)) {

final Object f2580 = ShenLazyderef.LAMBDA.apply(((Cons)v5272577).head, v834);

final Object v5282579 = f2580;


final Object i2600;
if ((boolean)(v5282579 instanceof Cons)) {


final Object y2581 = ((Cons)v5282579).head;

final Object f2583 = ShenLazyderef.LAMBDA.apply(((Cons)v5282579).tail, v834);

final Object v5292582 = f2583;


final Object i2599;
if ((boolean)(v5292582 instanceof Cons)) {

final Object f2585 = ShenLazyderef.LAMBDA.apply(((Cons)v5292582).head, v834);

final Object v5302584 = f2585;

final Object i2598;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), v5302584)) {

final Object f2587 = ShenLazyderef.LAMBDA.apply(((Cons)v5292582).tail, v834);

final Object v5312586 = f2587;


final Object i2597;
if ((boolean)(v5312586 instanceof Cons)) {


final Object b2588 = ((Cons)v5312586).head;

final Object f2590 = ShenLazyderef.LAMBDA.apply(((Cons)v5312586).tail, v834);

final Object v5322589 = f2590;

final Object i2596;
if ((boolean)Lang.equals(Nil.NIL, v5322589)) {
final Object f2591 = ShenIncinfs.LAMBDA.apply();
final Lambda l2593 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2592 = UnifyBang.LAMBDA.apply(v832, b2588, v834, v835);

    return f2592;
  }
};final Object f2594 = Identical.LAMBDA.apply(v831, y2581, v834, l2593);
final Object f2595 = Do.LAMBDA.apply(f2591, f2594);

i2596 = f2595;
} else {

i2596 = false;

}


i2597 = i2596;
} else {

i2597 = false;

}

i2598 = i2597;
} else {

i2598 = false;

}

i2599 = i2598;
} else {

i2599 = false;

}


i2600 = i2599;
} else {

i2600 = false;

}

i2601 = i2600;
} else {

i2601 = false;

}

final Object case2576 = i2601;

final Object i2609;
if ((boolean)Lang.equals(case2576, false)) {
final Object f2603 = ShenLazyderef.LAMBDA.apply(v833, v834);

final Object v5332602 = f2603;


final Object i2608;
if ((boolean)(v5332602 instanceof Cons)) {


final Object hyp2604 = ((Cons)v5332602).tail;
final Object f2605 = ShenIncinfs.LAMBDA.apply();
final Object f2606 = ShenBy_hypothesis.LAMBDA.apply(v831, v832, hyp2604, v834, v835);
final Object f2607 = Do.LAMBDA.apply(f2605, f2606);


i2608 = f2607;
} else {

i2608 = false;

}

i2609 = i2608;
} else {

i2609 = case2576;

}

    return i2609;

}
}
