package shen.gen;



import com.mentics.shen.*;

public class ShenLinearise_X {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-linearise_X");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v454, final Object v455, final Object v456) throws Exception {
return defined(v454, v455, v456);
}};
public static Object defined(final Object v454, final Object v455, final Object v456) throws Exception {

final Object i2026;
if ((boolean)Lang.equals(v456, v454)) {

i2026 = v455;
} else {


final Object i2025;
if ((boolean)(v456 instanceof Cons)) {

final Object f2021 = ShenLinearise_X.LAMBDA.apply(v454, v455, ((Cons)v456).head);

final Object l2020 = f2021;


final Object i2023;
if ((boolean)Lang.equals(l2020, ((Cons)v456).head)) {



final Object f2022 = ShenLinearise_X.LAMBDA.apply(v454, v455, ((Cons)v456).tail);


i2023 = new Cons(((Cons)v456).head, f2022);
} else {




i2023 = new Cons(l2020, ((Cons)v456).tail);

}

i2025 = i2023;
} else {

final Object i2024;
if ((boolean)true) {

i2024 = v456;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2025 = i2024;

}
i2026 = i2025;

}
    return i2026;

}
}
