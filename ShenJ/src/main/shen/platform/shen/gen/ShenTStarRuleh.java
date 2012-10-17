package shen.gen;



import com.mentics.shen.*;

public class ShenTStarRuleh {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-t*-ruleh");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v891, final Object v892, final Object v893, final Object v894, final Object v895) throws Exception {
return defined(v891, v892, v893, v894, v895);
}};
public static Object defined(final Object v891, final Object v892, final Object v893, final Object v894, final Object v895) throws Exception {
final Object f2862 = ShenCatchpoint.LAMBDA.apply();

final Object throwcontrol2861 = f2862;
final Object f2864 = ShenLazyderef.LAMBDA.apply(v891, v894);

final Object v5032863 = f2864;


final Object i2890;
if ((boolean)(v5032863 instanceof Cons)) {


final Object patterns2865 = ((Cons)v5032863).head;

final Object f2867 = ShenLazyderef.LAMBDA.apply(((Cons)v5032863).tail, v894);

final Object v5042866 = f2867;


final Object i2889;
if ((boolean)(v5042866 instanceof Cons)) {


final Object result2868 = ((Cons)v5042866).head;

final Object f2870 = ShenLazyderef.LAMBDA.apply(((Cons)v5042866).tail, v894);

final Object v5052869 = f2870;

final Object i2888;
if ((boolean)Lang.equals(Nil.NIL, v5052869)) {
final Object f2872 = ShenNewpv.LAMBDA.apply(v894);

final Object newHyp2871 = f2872;
final Object f2874 = ShenNewpv.LAMBDA.apply(v894);

final Object b2873 = f2874;
final Object f2876 = ShenNewpv.LAMBDA.apply(v894);

final Object allHyp2875 = f2876;
final Object f2877 = ShenIncinfs.LAMBDA.apply();
final Lambda l2885 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2883 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2881 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2879 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2878 = ShenThStar.LAMBDA.apply(result2868, b2873, allHyp2875, v894, v895);

    return f2878;
  }
};final Object f2880 = Cut.LAMBDA.apply(throwcontrol2861, v894, l2879);

    return f2880;
  }
};final Object f2882 = ShenConc.LAMBDA.apply(newHyp2871, v893, allHyp2875, v894, l2881);

    return f2882;
  }
};final Object f2884 = Cut.LAMBDA.apply(throwcontrol2861, v894, l2883);

    return f2884;
  }
};final Object f2886 = ShenTStarPatterns.LAMBDA.apply(patterns2865, v892, newHyp2871, b2873, v894, l2885);
final Object f2887 = Do.LAMBDA.apply(f2877, f2886);




i2888 = f2887;
} else {

i2888 = false;

}


i2889 = i2888;
} else {

i2889 = false;

}


i2890 = i2889;
} else {

i2890 = false;

}
final Object f2891 = ShenCutpoint.LAMBDA.apply(throwcontrol2861, i2890);


    return f2891;

}
}
