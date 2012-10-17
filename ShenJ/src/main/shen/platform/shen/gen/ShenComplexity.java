package shen.gen;



import com.mentics.shen.*;

public class ShenComplexity {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-complexity");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1220) throws Exception {
return defined(v1220);
}};
public static Object defined(final Object v1220) throws Exception {


final Object i2862;
if ((boolean)(v1220 instanceof Cons)) {


final Object i2860;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1220).head)) {



final Object i2858;
if ((boolean)(((Cons)v1220).tail instanceof Cons)) {




final Object i2856;
if ((boolean)(((Cons)((Cons)v1220).tail).head instanceof Cons)) {




final Object i2854;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)((Cons)((Cons)v1220).tail).head).head)) {





final Object i2852;
if ((boolean)(((Cons)((Cons)((Cons)v1220).tail).head).tail instanceof Cons)) {






final Object i2850;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v1220).tail).head).tail).tail instanceof Cons)) {






final Object i2848;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)v1220).tail).head).tail).tail).tail)) {




final Object i2846;
if ((boolean)(((Cons)((Cons)v1220).tail).tail instanceof Cons)) {




final Object i2845;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1220).tail).tail).tail)) {

i2845 = true;
} else {

i2845 = false;

}
i2846 = i2845;
} else {

i2846 = false;

}
final Object i2847;
if ((boolean)i2846) {

i2847 = true;
} else {

i2847 = false;

}
i2848 = i2847;
} else {

i2848 = false;

}
final Object i2849;
if ((boolean)i2848) {

i2849 = true;
} else {

i2849 = false;

}
i2850 = i2849;
} else {

i2850 = false;

}
final Object i2851;
if ((boolean)i2850) {

i2851 = true;
} else {

i2851 = false;

}
i2852 = i2851;
} else {

i2852 = false;

}
final Object i2853;
if ((boolean)i2852) {

i2853 = true;
} else {

i2853 = false;

}
i2854 = i2853;
} else {

i2854 = false;

}
final Object i2855;
if ((boolean)i2854) {

i2855 = true;
} else {

i2855 = false;

}
i2856 = i2855;
} else {

i2856 = false;

}
final Object i2857;
if ((boolean)i2856) {

i2857 = true;
} else {

i2857 = false;

}
i2858 = i2857;
} else {

i2858 = false;

}
final Object i2859;
if ((boolean)i2858) {

i2859 = true;
} else {

i2859 = false;

}
i2860 = i2859;
} else {

i2860 = false;

}
final Object i2861;
if ((boolean)i2860) {

i2861 = true;
} else {

i2861 = false;

}
i2862 = i2861;
} else {

i2862 = false;

}
final Object i2930;
if ((boolean)i2862) {


final Object f2863 = ShenComplexity.LAMBDA.apply(((Cons)((Cons)v1220).tail).head);

i2930 = f2863;
} else {


final Object i2875;
if ((boolean)(v1220 instanceof Cons)) {


final Object i2873;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1220).head)) {



final Object i2871;
if ((boolean)(((Cons)v1220).tail instanceof Cons)) {




final Object i2869;
if ((boolean)(((Cons)((Cons)v1220).tail).head instanceof Cons)) {




final Object i2867;
if ((boolean)(((Cons)((Cons)v1220).tail).tail instanceof Cons)) {




final Object i2865;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), ((Cons)((Cons)((Cons)v1220).tail).tail).head)) {




final Object i2864;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1220).tail).tail).tail)) {

i2864 = true;
} else {

i2864 = false;

}
i2865 = i2864;
} else {

i2865 = false;

}
final Object i2866;
if ((boolean)i2865) {

i2866 = true;
} else {

i2866 = false;

}
i2867 = i2866;
} else {

i2867 = false;

}
final Object i2868;
if ((boolean)i2867) {

i2868 = true;
} else {

i2868 = false;

}
i2869 = i2868;
} else {

i2869 = false;

}
final Object i2870;
if ((boolean)i2869) {

i2870 = true;
} else {

i2870 = false;

}
i2871 = i2870;
} else {

i2871 = false;

}
final Object i2872;
if ((boolean)i2871) {

i2872 = true;
} else {

i2872 = false;

}
i2873 = i2872;
} else {

i2873 = false;

}
final Object i2874;
if ((boolean)i2873) {

i2874 = true;
} else {

i2874 = false;

}
i2875 = i2874;
} else {

i2875 = false;

}
final Object i2929;
if ((boolean)i2875) {










final Object f2876 = ShenComplexity.LAMBDA.apply(new Cons(RuntimeContext.symbol("mode"), new Cons(((Cons)((Cons)((Cons)v1220).tail).head).head, ((Cons)((Cons)v1220).tail).tail)));










final Object f2877 = ShenComplexity.LAMBDA.apply(new Cons(RuntimeContext.symbol("mode"), new Cons(((Cons)((Cons)((Cons)v1220).tail).head).tail, ((Cons)((Cons)v1220).tail).tail)));



i2929 = Primitives.multiply.apply(2, Primitives.multiply.apply(f2876, f2877));
} else {


final Object i2889;
if ((boolean)(v1220 instanceof Cons)) {


final Object i2887;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1220).head)) {



final Object i2885;
if ((boolean)(((Cons)v1220).tail instanceof Cons)) {




final Object i2883;
if ((boolean)(((Cons)((Cons)v1220).tail).head instanceof Cons)) {




final Object i2881;
if ((boolean)(((Cons)((Cons)v1220).tail).tail instanceof Cons)) {




final Object i2879;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), ((Cons)((Cons)((Cons)v1220).tail).tail).head)) {




final Object i2878;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1220).tail).tail).tail)) {

i2878 = true;
} else {

i2878 = false;

}
i2879 = i2878;
} else {

i2879 = false;

}
final Object i2880;
if ((boolean)i2879) {

i2880 = true;
} else {

i2880 = false;

}
i2881 = i2880;
} else {

i2881 = false;

}
final Object i2882;
if ((boolean)i2881) {

i2882 = true;
} else {

i2882 = false;

}
i2883 = i2882;
} else {

i2883 = false;

}
final Object i2884;
if ((boolean)i2883) {

i2884 = true;
} else {

i2884 = false;

}
i2885 = i2884;
} else {

i2885 = false;

}
final Object i2886;
if ((boolean)i2885) {

i2886 = true;
} else {

i2886 = false;

}
i2887 = i2886;
} else {

i2887 = false;

}
final Object i2888;
if ((boolean)i2887) {

i2888 = true;
} else {

i2888 = false;

}
i2889 = i2888;
} else {

i2889 = false;

}
final Object i2928;
if ((boolean)i2889) {









final Object f2890 = ShenComplexity.LAMBDA.apply(new Cons(RuntimeContext.symbol("mode"), new Cons(((Cons)((Cons)((Cons)v1220).tail).head).head, ((Cons)((Cons)v1220).tail).tail)));










final Object f2891 = ShenComplexity.LAMBDA.apply(new Cons(RuntimeContext.symbol("mode"), new Cons(((Cons)((Cons)((Cons)v1220).tail).head).tail, ((Cons)((Cons)v1220).tail).tail)));


i2928 = Primitives.multiply.apply(f2890, f2891);
} else {


final Object i2902;
if ((boolean)(v1220 instanceof Cons)) {


final Object i2900;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1220).head)) {



final Object i2898;
if ((boolean)(((Cons)v1220).tail instanceof Cons)) {




final Object i2896;
if ((boolean)(((Cons)((Cons)v1220).tail).tail instanceof Cons)) {




final Object i2894;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1220).tail).tail).tail)) {


final Object f2892 = VariableQ.LAMBDA.apply(((Cons)((Cons)v1220).tail).head);

final Object i2893;
if ((boolean)f2892) {

i2893 = true;
} else {

i2893 = false;

}
i2894 = i2893;
} else {

i2894 = false;

}
final Object i2895;
if ((boolean)i2894) {

i2895 = true;
} else {

i2895 = false;

}
i2896 = i2895;
} else {

i2896 = false;

}
final Object i2897;
if ((boolean)i2896) {

i2897 = true;
} else {

i2897 = false;

}
i2898 = i2897;
} else {

i2898 = false;

}
final Object i2899;
if ((boolean)i2898) {

i2899 = true;
} else {

i2899 = false;

}
i2900 = i2899;
} else {

i2900 = false;

}
final Object i2901;
if ((boolean)i2900) {

i2901 = true;
} else {

i2901 = false;

}
i2902 = i2901;
} else {

i2902 = false;

}
final Object i2927;
if ((boolean)i2902) {

i2927 = 1;
} else {


final Object i2912;
if ((boolean)(v1220 instanceof Cons)) {


final Object i2910;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1220).head)) {



final Object i2908;
if ((boolean)(((Cons)v1220).tail instanceof Cons)) {




final Object i2906;
if ((boolean)(((Cons)((Cons)v1220).tail).tail instanceof Cons)) {




final Object i2904;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), ((Cons)((Cons)((Cons)v1220).tail).tail).head)) {




final Object i2903;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1220).tail).tail).tail)) {

i2903 = true;
} else {

i2903 = false;

}
i2904 = i2903;
} else {

i2904 = false;

}
final Object i2905;
if ((boolean)i2904) {

i2905 = true;
} else {

i2905 = false;

}
i2906 = i2905;
} else {

i2906 = false;

}
final Object i2907;
if ((boolean)i2906) {

i2907 = true;
} else {

i2907 = false;

}
i2908 = i2907;
} else {

i2908 = false;

}
final Object i2909;
if ((boolean)i2908) {

i2909 = true;
} else {

i2909 = false;

}
i2910 = i2909;
} else {

i2910 = false;

}
final Object i2911;
if ((boolean)i2910) {

i2911 = true;
} else {

i2911 = false;

}
i2912 = i2911;
} else {

i2912 = false;

}
final Object i2926;
if ((boolean)i2912) {

i2926 = 2;
} else {


final Object i2922;
if ((boolean)(v1220 instanceof Cons)) {


final Object i2920;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1220).head)) {



final Object i2918;
if ((boolean)(((Cons)v1220).tail instanceof Cons)) {




final Object i2916;
if ((boolean)(((Cons)((Cons)v1220).tail).tail instanceof Cons)) {




final Object i2914;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), ((Cons)((Cons)((Cons)v1220).tail).tail).head)) {




final Object i2913;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1220).tail).tail).tail)) {

i2913 = true;
} else {

i2913 = false;

}
i2914 = i2913;
} else {

i2914 = false;

}
final Object i2915;
if ((boolean)i2914) {

i2915 = true;
} else {

i2915 = false;

}
i2916 = i2915;
} else {

i2916 = false;

}
final Object i2917;
if ((boolean)i2916) {

i2917 = true;
} else {

i2917 = false;

}
i2918 = i2917;
} else {

i2918 = false;

}
final Object i2919;
if ((boolean)i2918) {

i2919 = true;
} else {

i2919 = false;

}
i2920 = i2919;
} else {

i2920 = false;

}
final Object i2921;
if ((boolean)i2920) {

i2921 = true;
} else {

i2921 = false;

}
i2922 = i2921;
} else {

i2922 = false;

}
final Object i2925;
if ((boolean)i2922) {

i2925 = 1;
} else {

final Object i2924;
if ((boolean)true) {






final Object f2923 = ShenComplexity.LAMBDA.apply(new Cons(RuntimeContext.symbol("mode"), new Cons(v1220, new Cons(RuntimeContext.symbol("+"), Nil.NIL))));

i2924 = f2923;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2925 = i2924;

}
i2926 = i2925;

}
i2927 = i2926;

}
i2928 = i2927;

}
i2929 = i2928;

}
i2930 = i2929;

}
    return i2930;

}
}
