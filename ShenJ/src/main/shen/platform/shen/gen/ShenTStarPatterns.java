package shen.gen;



import com.mentics.shen.*;

public class ShenTStarPatterns {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-t*-patterns");
public static final Lambda LAMBDA = new Lambda6() {
public Object apply(final Object v898, final Object v899, final Object v900, final Object v901, final Object v902, final Object v903) throws Exception {
return defined(v898, v899, v900, v901, v902, v903);
}};
public static Object defined(final Object v898, final Object v899, final Object v900, final Object v901, final Object v902, final Object v903) throws Exception {
final Object f2896 = ShenCatchpoint.LAMBDA.apply();

final Object throwcontrol2895 = f2896;
final Object f2899 = ShenLazyderef.LAMBDA.apply(v898, v902);

final Object v4842898 = f2899;

final Object i2916;
if ((boolean)Lang.equals(Nil.NIL, v4842898)) {
final Object f2901 = ShenLazyderef.LAMBDA.apply(v900, v902);

final Object v4852900 = f2901;

final Object i2915;
if ((boolean)Lang.equals(Nil.NIL, v4852900)) {
final Object f2902 = ShenIncinfs.LAMBDA.apply();
final Object f2903 = UnifyBang.LAMBDA.apply(v901, v899, v902, v903);
final Object f2904 = Do.LAMBDA.apply(f2902, f2903);

i2915 = f2904;
} else {
final Object f2905 = ShenPvarQ.LAMBDA.apply(v4852900);

final Object i2914;
if ((boolean)f2905) {
final Object f2906 = ShenBindv.LAMBDA.apply(v4852900, Nil.NIL, v902);
final Object f2908 = ShenIncinfs.LAMBDA.apply();
final Object f2909 = UnifyBang.LAMBDA.apply(v901, v899, v902, v903);
final Object f2910 = Do.LAMBDA.apply(f2908, f2909);

final Object result2907 = f2910;
final Object f2911 = ShenUnbindv.LAMBDA.apply(v4852900, v902);
final Object f2912 = Do.LAMBDA.apply(f2911, result2907);

final Object f2913 = Do.LAMBDA.apply(f2906, f2912);

i2914 = f2913;
} else {

i2914 = false;

}
i2915 = i2914;

}

i2916 = i2915;
} else {

i2916 = false;

}

final Object case2897 = i2916;

final Object i3199;
if ((boolean)Lang.equals(case2897, false)) {
final Object f2918 = ShenLazyderef.LAMBDA.apply(v898, v902);

final Object v4862917 = f2918;


final Object i3198;
if ((boolean)(v4862917 instanceof Cons)) {


final Object pattern4782919 = ((Cons)v4862917).head;


final Object patterns2920 = ((Cons)v4862917).tail;
final Object f2922 = ShenLazyderef.LAMBDA.apply(v899, v902);

final Object v4872921 = f2922;


final Object i3197;
if ((boolean)(v4872921 instanceof Cons)) {


final Object a4792923 = ((Cons)v4872921).head;

final Object f2925 = ShenLazyderef.LAMBDA.apply(((Cons)v4872921).tail, v902);

final Object v4882924 = f2925;


final Object i3196;
if ((boolean)(v4882924 instanceof Cons)) {

final Object f2927 = ShenLazyderef.LAMBDA.apply(((Cons)v4882924).head, v902);

final Object v4892926 = f2927;

final Object i3195;
if ((boolean)Lang.equals(RuntimeContext.symbol("-->"), v4892926)) {

final Object f2929 = ShenLazyderef.LAMBDA.apply(((Cons)v4882924).tail, v902);

final Object v4902928 = f2929;


final Object i3194;
if ((boolean)(v4902928 instanceof Cons)) {


final Object b2930 = ((Cons)v4902928).head;

final Object f2932 = ShenLazyderef.LAMBDA.apply(((Cons)v4902928).tail, v902);

final Object v4912931 = f2932;

final Object i3193;
if ((boolean)Lang.equals(Nil.NIL, v4912931)) {
final Object f2934 = ShenLazyderef.LAMBDA.apply(v900, v902);

final Object v4922933 = f2934;


final Object i3192;
if ((boolean)(v4922933 instanceof Cons)) {

final Object f2936 = ShenLazyderef.LAMBDA.apply(((Cons)v4922933).head, v902);

final Object v4932935 = f2936;


final Object i3161;
if ((boolean)(v4932935 instanceof Cons)) {


final Object pattern2937 = ((Cons)v4932935).head;

final Object f2939 = ShenLazyderef.LAMBDA.apply(((Cons)v4932935).tail, v902);

final Object v4942938 = f2939;


final Object i3131;
if ((boolean)(v4942938 instanceof Cons)) {

final Object f2941 = ShenLazyderef.LAMBDA.apply(((Cons)v4942938).head, v902);

final Object v4952940 = f2941;

final Object i3103;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), v4952940)) {

final Object f2943 = ShenLazyderef.LAMBDA.apply(((Cons)v4942938).tail, v902);

final Object v4962942 = f2943;


final Object i3018;
if ((boolean)(v4962942 instanceof Cons)) {


final Object a2944 = ((Cons)v4962942).head;

final Object f2946 = ShenLazyderef.LAMBDA.apply(((Cons)v4962942).tail, v902);

final Object v4972945 = f2946;

final Object i2990;
if ((boolean)Lang.equals(Nil.NIL, v4972945)) {


final Object hyp2947 = ((Cons)v4922933).tail;
final Object f2949 = ShenNewpv.LAMBDA.apply(v902);

final Object assume2948 = f2949;
final Object f2950 = ShenIncinfs.LAMBDA.apply();
final Lambda l2962 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2960 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2958 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2956 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2954 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2952 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2951 = ShenTStarPatterns.LAMBDA.apply(patterns2920, b2930, hyp2947, v901, v902, v903);

    return f2951;
  }
};final Object f2953 = Cut.LAMBDA.apply(throwcontrol2895, v902, l2952);

    return f2953;
  }
};final Object f2955 = ShenThStar.LAMBDA.apply(pattern2937, a2944, assume2948, v902, l2954);

    return f2955;
  }
};final Object f2957 = Cut.LAMBDA.apply(throwcontrol2895, v902, l2956);

    return f2957;
  }
};final Object f2959 = ShenTStarAssume.LAMBDA.apply(pattern2937, assume2948, v902, l2958);

    return f2959;
  }
};final Object f2961 = UnifyBang.LAMBDA.apply(pattern2937, pattern4782919, v902, l2960);

    return f2961;
  }
};final Object f2963 = UnifyBang.LAMBDA.apply(a2944, a4792923, v902, l2962);
final Object f2964 = Do.LAMBDA.apply(f2950, f2963);



i2990 = f2964;
} else {
final Object f2965 = ShenPvarQ.LAMBDA.apply(v4972945);

final Object i2989;
if ((boolean)f2965) {
final Object f2966 = ShenBindv.LAMBDA.apply(v4972945, Nil.NIL, v902);


final Object hyp2968 = ((Cons)v4922933).tail;
final Object f2970 = ShenNewpv.LAMBDA.apply(v902);

final Object assume2969 = f2970;
final Object f2971 = ShenIncinfs.LAMBDA.apply();
final Lambda l2983 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2981 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2979 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2977 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2975 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2973 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2972 = ShenTStarPatterns.LAMBDA.apply(patterns2920, b2930, hyp2968, v901, v902, v903);

    return f2972;
  }
};final Object f2974 = Cut.LAMBDA.apply(throwcontrol2895, v902, l2973);

    return f2974;
  }
};final Object f2976 = ShenThStar.LAMBDA.apply(pattern2937, a2944, assume2969, v902, l2975);

    return f2976;
  }
};final Object f2978 = Cut.LAMBDA.apply(throwcontrol2895, v902, l2977);

    return f2978;
  }
};final Object f2980 = ShenTStarAssume.LAMBDA.apply(pattern2937, assume2969, v902, l2979);

    return f2980;
  }
};final Object f2982 = UnifyBang.LAMBDA.apply(pattern2937, pattern4782919, v902, l2981);

    return f2982;
  }
};final Object f2984 = UnifyBang.LAMBDA.apply(a2944, a4792923, v902, l2983);
final Object f2985 = Do.LAMBDA.apply(f2971, f2984);



final Object result2967 = f2985;
final Object f2986 = ShenUnbindv.LAMBDA.apply(v4972945, v902);
final Object f2987 = Do.LAMBDA.apply(f2986, result2967);

final Object f2988 = Do.LAMBDA.apply(f2966, f2987);

i2989 = f2988;
} else {

i2989 = false;

}
i2990 = i2989;

}


i3018 = i2990;
} else {
final Object f2991 = ShenPvarQ.LAMBDA.apply(v4962942);

final Object i3017;
if ((boolean)f2991) {
final Object f2993 = ShenNewpv.LAMBDA.apply(v902);

final Object a2992 = f2993;


final Object f2994 = ShenBindv.LAMBDA.apply(v4962942, new Cons(a2992, Nil.NIL), v902);


final Object hyp2996 = ((Cons)v4922933).tail;
final Object f2998 = ShenNewpv.LAMBDA.apply(v902);

final Object assume2997 = f2998;
final Object f2999 = ShenIncinfs.LAMBDA.apply();
final Lambda l3011 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3009 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3007 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3005 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3003 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3001 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3000 = ShenTStarPatterns.LAMBDA.apply(patterns2920, b2930, hyp2996, v901, v902, v903);

    return f3000;
  }
};final Object f3002 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3001);

    return f3002;
  }
};final Object f3004 = ShenThStar.LAMBDA.apply(pattern2937, a2992, assume2997, v902, l3003);

    return f3004;
  }
};final Object f3006 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3005);

    return f3006;
  }
};final Object f3008 = ShenTStarAssume.LAMBDA.apply(pattern2937, assume2997, v902, l3007);

    return f3008;
  }
};final Object f3010 = UnifyBang.LAMBDA.apply(pattern2937, pattern4782919, v902, l3009);

    return f3010;
  }
};final Object f3012 = UnifyBang.LAMBDA.apply(a2992, a4792923, v902, l3011);
final Object f3013 = Do.LAMBDA.apply(f2999, f3012);



final Object result2995 = f3013;
final Object f3014 = ShenUnbindv.LAMBDA.apply(v4962942, v902);
final Object f3015 = Do.LAMBDA.apply(f3014, result2995);

final Object f3016 = Do.LAMBDA.apply(f2994, f3015);


i3017 = f3016;
} else {

i3017 = false;

}
i3018 = i3017;

}

i3103 = i3018;
} else {
final Object f3019 = ShenPvarQ.LAMBDA.apply(v4952940);

final Object i3102;
if ((boolean)f3019) {
final Object f3020 = ShenBindv.LAMBDA.apply(v4952940, RuntimeContext.symbol(":"), v902);

final Object f3023 = ShenLazyderef.LAMBDA.apply(((Cons)v4942938).tail, v902);

final Object v4983022 = f3023;


final Object i3098;
if ((boolean)(v4983022 instanceof Cons)) {


final Object a3024 = ((Cons)v4983022).head;

final Object f3026 = ShenLazyderef.LAMBDA.apply(((Cons)v4983022).tail, v902);

final Object v4993025 = f3026;

final Object i3070;
if ((boolean)Lang.equals(Nil.NIL, v4993025)) {


final Object hyp3027 = ((Cons)v4922933).tail;
final Object f3029 = ShenNewpv.LAMBDA.apply(v902);

final Object assume3028 = f3029;
final Object f3030 = ShenIncinfs.LAMBDA.apply();
final Lambda l3042 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3040 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3038 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3036 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3034 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3032 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3031 = ShenTStarPatterns.LAMBDA.apply(patterns2920, b2930, hyp3027, v901, v902, v903);

    return f3031;
  }
};final Object f3033 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3032);

    return f3033;
  }
};final Object f3035 = ShenThStar.LAMBDA.apply(pattern2937, a3024, assume3028, v902, l3034);

    return f3035;
  }
};final Object f3037 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3036);

    return f3037;
  }
};final Object f3039 = ShenTStarAssume.LAMBDA.apply(pattern2937, assume3028, v902, l3038);

    return f3039;
  }
};final Object f3041 = UnifyBang.LAMBDA.apply(pattern2937, pattern4782919, v902, l3040);

    return f3041;
  }
};final Object f3043 = UnifyBang.LAMBDA.apply(a3024, a4792923, v902, l3042);
final Object f3044 = Do.LAMBDA.apply(f3030, f3043);



i3070 = f3044;
} else {
final Object f3045 = ShenPvarQ.LAMBDA.apply(v4993025);

final Object i3069;
if ((boolean)f3045) {
final Object f3046 = ShenBindv.LAMBDA.apply(v4993025, Nil.NIL, v902);


final Object hyp3048 = ((Cons)v4922933).tail;
final Object f3050 = ShenNewpv.LAMBDA.apply(v902);

final Object assume3049 = f3050;
final Object f3051 = ShenIncinfs.LAMBDA.apply();
final Lambda l3063 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3061 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3059 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3057 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3055 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3053 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3052 = ShenTStarPatterns.LAMBDA.apply(patterns2920, b2930, hyp3048, v901, v902, v903);

    return f3052;
  }
};final Object f3054 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3053);

    return f3054;
  }
};final Object f3056 = ShenThStar.LAMBDA.apply(pattern2937, a3024, assume3049, v902, l3055);

    return f3056;
  }
};final Object f3058 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3057);

    return f3058;
  }
};final Object f3060 = ShenTStarAssume.LAMBDA.apply(pattern2937, assume3049, v902, l3059);

    return f3060;
  }
};final Object f3062 = UnifyBang.LAMBDA.apply(pattern2937, pattern4782919, v902, l3061);

    return f3062;
  }
};final Object f3064 = UnifyBang.LAMBDA.apply(a3024, a4792923, v902, l3063);
final Object f3065 = Do.LAMBDA.apply(f3051, f3064);



final Object result3047 = f3065;
final Object f3066 = ShenUnbindv.LAMBDA.apply(v4993025, v902);
final Object f3067 = Do.LAMBDA.apply(f3066, result3047);

final Object f3068 = Do.LAMBDA.apply(f3046, f3067);

i3069 = f3068;
} else {

i3069 = false;

}
i3070 = i3069;

}


i3098 = i3070;
} else {
final Object f3071 = ShenPvarQ.LAMBDA.apply(v4983022);

final Object i3097;
if ((boolean)f3071) {
final Object f3073 = ShenNewpv.LAMBDA.apply(v902);

final Object a3072 = f3073;


final Object f3074 = ShenBindv.LAMBDA.apply(v4983022, new Cons(a3072, Nil.NIL), v902);


final Object hyp3076 = ((Cons)v4922933).tail;
final Object f3078 = ShenNewpv.LAMBDA.apply(v902);

final Object assume3077 = f3078;
final Object f3079 = ShenIncinfs.LAMBDA.apply();
final Lambda l3091 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3089 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3087 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3085 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3083 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3081 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3080 = ShenTStarPatterns.LAMBDA.apply(patterns2920, b2930, hyp3076, v901, v902, v903);

    return f3080;
  }
};final Object f3082 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3081);

    return f3082;
  }
};final Object f3084 = ShenThStar.LAMBDA.apply(pattern2937, a3072, assume3077, v902, l3083);

    return f3084;
  }
};final Object f3086 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3085);

    return f3086;
  }
};final Object f3088 = ShenTStarAssume.LAMBDA.apply(pattern2937, assume3077, v902, l3087);

    return f3088;
  }
};final Object f3090 = UnifyBang.LAMBDA.apply(pattern2937, pattern4782919, v902, l3089);

    return f3090;
  }
};final Object f3092 = UnifyBang.LAMBDA.apply(a3072, a4792923, v902, l3091);
final Object f3093 = Do.LAMBDA.apply(f3079, f3092);



final Object result3075 = f3093;
final Object f3094 = ShenUnbindv.LAMBDA.apply(v4983022, v902);
final Object f3095 = Do.LAMBDA.apply(f3094, result3075);

final Object f3096 = Do.LAMBDA.apply(f3074, f3095);


i3097 = f3096;
} else {

i3097 = false;

}
i3098 = i3097;

}

final Object result3021 = i3098;
final Object f3099 = ShenUnbindv.LAMBDA.apply(v4952940, v902);
final Object f3100 = Do.LAMBDA.apply(f3099, result3021);

final Object f3101 = Do.LAMBDA.apply(f3020, f3100);

i3102 = f3101;
} else {

i3102 = false;

}
i3103 = i3102;

}

i3131 = i3103;
} else {
final Object f3104 = ShenPvarQ.LAMBDA.apply(v4942938);

final Object i3130;
if ((boolean)f3104) {
final Object f3106 = ShenNewpv.LAMBDA.apply(v902);

final Object a3105 = f3106;




final Object f3107 = ShenBindv.LAMBDA.apply(v4942938, new Cons(RuntimeContext.symbol(":"), new Cons(a3105, Nil.NIL)), v902);


final Object hyp3109 = ((Cons)v4922933).tail;
final Object f3111 = ShenNewpv.LAMBDA.apply(v902);

final Object assume3110 = f3111;
final Object f3112 = ShenIncinfs.LAMBDA.apply();
final Lambda l3124 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3122 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3120 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3118 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3116 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3114 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3113 = ShenTStarPatterns.LAMBDA.apply(patterns2920, b2930, hyp3109, v901, v902, v903);

    return f3113;
  }
};final Object f3115 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3114);

    return f3115;
  }
};final Object f3117 = ShenThStar.LAMBDA.apply(pattern2937, a3105, assume3110, v902, l3116);

    return f3117;
  }
};final Object f3119 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3118);

    return f3119;
  }
};final Object f3121 = ShenTStarAssume.LAMBDA.apply(pattern2937, assume3110, v902, l3120);

    return f3121;
  }
};final Object f3123 = UnifyBang.LAMBDA.apply(pattern2937, pattern4782919, v902, l3122);

    return f3123;
  }
};final Object f3125 = UnifyBang.LAMBDA.apply(a3105, a4792923, v902, l3124);
final Object f3126 = Do.LAMBDA.apply(f3112, f3125);



final Object result3108 = f3126;
final Object f3127 = ShenUnbindv.LAMBDA.apply(v4942938, v902);
final Object f3128 = Do.LAMBDA.apply(f3127, result3108);

final Object f3129 = Do.LAMBDA.apply(f3107, f3128);


i3130 = f3129;
} else {

i3130 = false;

}
i3131 = i3130;

}


i3161 = i3131;
} else {
final Object f3132 = ShenPvarQ.LAMBDA.apply(v4932935);

final Object i3160;
if ((boolean)f3132) {
final Object f3134 = ShenNewpv.LAMBDA.apply(v902);

final Object pattern3133 = f3134;
final Object f3136 = ShenNewpv.LAMBDA.apply(v902);

final Object a3135 = f3136;






final Object f3137 = ShenBindv.LAMBDA.apply(v4932935, new Cons(pattern3133, new Cons(RuntimeContext.symbol(":"), new Cons(a3135, Nil.NIL))), v902);


final Object hyp3139 = ((Cons)v4922933).tail;
final Object f3141 = ShenNewpv.LAMBDA.apply(v902);

final Object assume3140 = f3141;
final Object f3142 = ShenIncinfs.LAMBDA.apply();
final Lambda l3154 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3152 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3150 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3148 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3146 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3144 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3143 = ShenTStarPatterns.LAMBDA.apply(patterns2920, b2930, hyp3139, v901, v902, v903);

    return f3143;
  }
};final Object f3145 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3144);

    return f3145;
  }
};final Object f3147 = ShenThStar.LAMBDA.apply(pattern3133, a3135, assume3140, v902, l3146);

    return f3147;
  }
};final Object f3149 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3148);

    return f3149;
  }
};final Object f3151 = ShenTStarAssume.LAMBDA.apply(pattern3133, assume3140, v902, l3150);

    return f3151;
  }
};final Object f3153 = UnifyBang.LAMBDA.apply(pattern3133, pattern4782919, v902, l3152);

    return f3153;
  }
};final Object f3155 = UnifyBang.LAMBDA.apply(a3135, a4792923, v902, l3154);
final Object f3156 = Do.LAMBDA.apply(f3142, f3155);



final Object result3138 = f3156;
final Object f3157 = ShenUnbindv.LAMBDA.apply(v4932935, v902);
final Object f3158 = Do.LAMBDA.apply(f3157, result3138);

final Object f3159 = Do.LAMBDA.apply(f3137, f3158);



i3160 = f3159;
} else {

i3160 = false;

}
i3161 = i3160;

}

i3192 = i3161;
} else {
final Object f3162 = ShenPvarQ.LAMBDA.apply(v4922933);

final Object i3191;
if ((boolean)f3162) {
final Object f3164 = ShenNewpv.LAMBDA.apply(v902);

final Object pattern3163 = f3164;
final Object f3166 = ShenNewpv.LAMBDA.apply(v902);

final Object a3165 = f3166;
final Object f3168 = ShenNewpv.LAMBDA.apply(v902);

final Object hyp3167 = f3168;








final Object f3169 = ShenBindv.LAMBDA.apply(v4922933, new Cons(new Cons(pattern3163, new Cons(RuntimeContext.symbol(":"), new Cons(a3165, Nil.NIL))), hyp3167), v902);
final Object f3172 = ShenNewpv.LAMBDA.apply(v902);

final Object assume3171 = f3172;
final Object f3173 = ShenIncinfs.LAMBDA.apply();
final Lambda l3185 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3183 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3181 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3179 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3177 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3175 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3174 = ShenTStarPatterns.LAMBDA.apply(patterns2920, b2930, hyp3167, v901, v902, v903);

    return f3174;
  }
};final Object f3176 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3175);

    return f3176;
  }
};final Object f3178 = ShenThStar.LAMBDA.apply(pattern3163, a3165, assume3171, v902, l3177);

    return f3178;
  }
};final Object f3180 = Cut.LAMBDA.apply(throwcontrol2895, v902, l3179);

    return f3180;
  }
};final Object f3182 = ShenTStarAssume.LAMBDA.apply(pattern3163, assume3171, v902, l3181);

    return f3182;
  }
};final Object f3184 = UnifyBang.LAMBDA.apply(pattern3163, pattern4782919, v902, l3183);

    return f3184;
  }
};final Object f3186 = UnifyBang.LAMBDA.apply(a3165, a4792923, v902, l3185);
final Object f3187 = Do.LAMBDA.apply(f3173, f3186);


final Object result3170 = f3187;
final Object f3188 = ShenUnbindv.LAMBDA.apply(v4922933, v902);
final Object f3189 = Do.LAMBDA.apply(f3188, result3170);

final Object f3190 = Do.LAMBDA.apply(f3169, f3189);




i3191 = f3190;
} else {

i3191 = false;

}
i3192 = i3191;

}

i3193 = i3192;
} else {

i3193 = false;

}


i3194 = i3193;
} else {

i3194 = false;

}

i3195 = i3194;
} else {

i3195 = false;

}

i3196 = i3195;
} else {

i3196 = false;

}


i3197 = i3196;
} else {

i3197 = false;

}



i3198 = i3197;
} else {

i3198 = false;

}

i3199 = i3198;
} else {

i3199 = case2897;

}
final Object f3200 = ShenCutpoint.LAMBDA.apply(throwcontrol2895, i3199);


    return f3200;

}
}
