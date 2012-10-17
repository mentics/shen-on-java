package shen.gen;



import com.mentics.shen.*;

public class ShenTStar {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-t*");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v550, final Object v551, final Object v552, final Object v553) throws Exception {
return defined(v550, v551, v552, v553);
}};
public static Object defined(final Object v550, final Object v551, final Object v552, final Object v553) throws Exception {
final Object f48 = ShenCatchpoint.LAMBDA.apply();

final Object throwcontrol47 = f48;
final Object f51 = ShenNewpv.LAMBDA.apply(v552);

final Object error50 = f51;
final Object f52 = ShenIncinfs.LAMBDA.apply();
final Object f53 = ShenMaxinfexceededQ.LAMBDA.apply();
final Lambda l56 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f54 = ShenErrormaxinfs.LAMBDA.apply();
final Object f55 = Bind.LAMBDA.apply(error50, f54, v552, v553);

    return f55;
  }
};final Object f57 = Fwhen.LAMBDA.apply(f53, v552, l56);
final Object f58 = Do.LAMBDA.apply(f52, f57);


final Object case49 = f58;

final Object i104;
if ((boolean)Lang.equals(case49, false)) {
final Object f61 = ShenLazyderef.LAMBDA.apply(v550, v552);

final Object v54460 = f61;

final Object i67;
if ((boolean)Lang.equals(RuntimeContext.symbol("fail"), v54460)) {
final Object f62 = ShenIncinfs.LAMBDA.apply();
final Lambda l64 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f63 = ShenPrologFailure.LAMBDA.apply(v552, v553);

    return f63;
  }
};final Object f65 = Cut.LAMBDA.apply(throwcontrol47, v552, l64);
final Object f66 = Do.LAMBDA.apply(f62, f65);

i67 = f66;
} else {

i67 = false;

}

final Object case59 = i67;

final Object i103;
if ((boolean)Lang.equals(case59, false)) {
final Object f70 = ShenLazyderef.LAMBDA.apply(v550, v552);

final Object v54569 = f70;


final Object i90;
if ((boolean)(v54569 instanceof Cons)) {


final Object x71 = ((Cons)v54569).head;

final Object f73 = ShenLazyderef.LAMBDA.apply(((Cons)v54569).tail, v552);

final Object v54672 = f73;


final Object i89;
if ((boolean)(v54672 instanceof Cons)) {

final Object f75 = ShenLazyderef.LAMBDA.apply(((Cons)v54672).head, v552);

final Object v54774 = f75;

final Object i88;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), v54774)) {

final Object f77 = ShenLazyderef.LAMBDA.apply(((Cons)v54672).tail, v552);

final Object v54876 = f77;


final Object i87;
if ((boolean)(v54876 instanceof Cons)) {


final Object a78 = ((Cons)v54876).head;

final Object f80 = ShenLazyderef.LAMBDA.apply(((Cons)v54876).tail, v552);

final Object v54979 = f80;

final Object i86;
if ((boolean)Lang.equals(Nil.NIL, v54979)) {
final Object f81 = ShenIncinfs.LAMBDA.apply();
final Lambda l83 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f82 = ShenThStar.LAMBDA.apply(x71, a78, v551, v552, v553);

    return f82;
  }
};final Object f84 = Cut.LAMBDA.apply(throwcontrol47, v552, l83);
final Object f85 = Do.LAMBDA.apply(f81, f84);

i86 = f85;
} else {

i86 = false;

}


i87 = i86;
} else {

i87 = false;

}

i88 = i87;
} else {

i88 = false;

}

i89 = i88;
} else {

i89 = false;

}


i90 = i89;
} else {

i90 = false;

}

final Object case68 = i90;

final Object i102;
if ((boolean)Lang.equals(case68, false)) {
final Object f92 = ShenNewpv.LAMBDA.apply(v552);

final Object hyps91 = f92;
final Object f94 = ShenNewpv.LAMBDA.apply(v552);

final Object datatypes93 = f94;
final Object f95 = ShenIncinfs.LAMBDA.apply();
final Lambda l99 = new Lambda0() {
  public Object apply() throws Exception {
    
final Lambda l97 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f96 = ShenUdefsStar.LAMBDA.apply(v550, v551, datatypes93, v552, v553);

    return f96;
  }
};final Object f98 = Bind.LAMBDA.apply(datatypes93, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*datatypes*")), v552, l97);

    return f98;
  }
};final Object f100 = ShenShow.LAMBDA.apply(v550, hyps91, v552, l99);
final Object f101 = Do.LAMBDA.apply(f95, f100);



i102 = f101;
} else {

i102 = case68;

}

i103 = i102;
} else {

i103 = case59;

}

i104 = i103;
} else {

i104 = case49;

}
final Object f105 = ShenCutpoint.LAMBDA.apply(throwcontrol47, i104);


    return f105;

}
}
