package shen.gen;



import com.mentics.shen.*;

public class ShenAsimple_patternZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<simple_pattern>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v405) throws Exception {
return defined(v405);
}};
public static Object defined(final Object v405) throws Exception {
final Object f1815 = Fst.LAMBDA.apply(v405);


final Object i1824;
if ((boolean)(f1815 instanceof Cons)) {
final Object f1816 = Fst.LAMBDA.apply(v405);

final Object f1817 = Snd.LAMBDA.apply(v405);
final Object f1818 = ShenReassemble.LAMBDA.apply(((Cons)f1816).tail, f1817);
final Object f1819 = Fst.LAMBDA.apply(f1818);
final Object f1820 = Fst.LAMBDA.apply(v405);


final Object i1822;
if ((boolean)Lang.equals(((Cons)f1820).head, RuntimeContext.symbol("_"))) {
final Object f1821 = Gensym.LAMBDA.apply(RuntimeContext.symbol("X"));

i1822 = f1821;
} else {

i1822 = null;

}final Object f1823 = ShenReassemble.LAMBDA.apply(f1819, i1822);

i1824 = f1823;
} else {

i1824 = null;

}
final Object result1814 = i1824;

final Object i1838;
if ((boolean)Lang.equals(result1814, null)) {
final Object f1826 = Fst.LAMBDA.apply(v405);


final Object i1836;
if ((boolean)(f1826 instanceof Cons)) {
final Object f1827 = Fst.LAMBDA.apply(v405);

final Object f1828 = Snd.LAMBDA.apply(v405);
final Object f1829 = ShenReassemble.LAMBDA.apply(((Cons)f1827).tail, f1828);
final Object f1830 = Fst.LAMBDA.apply(f1829);
final Object f1831 = Fst.LAMBDA.apply(v405);





final Object f1832 = ElementQ.LAMBDA.apply(((Cons)f1831).head, new Cons(RuntimeContext.symbol("->"), new Cons(RuntimeContext.symbol("<-"), Nil.NIL)));

final Object i1834;
if ((boolean)f1832) {

i1834 = null;
} else {
final Object f1833 = Fst.LAMBDA.apply(v405);


i1834 = ((Cons)f1833).head;

}final Object f1835 = ShenReassemble.LAMBDA.apply(f1830, i1834);

i1836 = f1835;
} else {

i1836 = null;

}
final Object result1825 = i1836;

final Object i1837;
if ((boolean)Lang.equals(result1825, null)) {

i1837 = null;
} else {

i1837 = result1825;

}

i1838 = i1837;
} else {

i1838 = result1814;

}

    return i1838;

}
}
