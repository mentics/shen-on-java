package shen.gen;



import com.mentics.shen.*;

public class NameToClassName {

public static final Symbol SYMBOL = RuntimeContext.symbol("name->class-name");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6919) throws Exception {
return defined(v6919);
}};
public static Object defined(final Object v6919) throws Exception {

final Object i7025;
if ((boolean)Lang.equals("", v6919)) {

i7025 = "";
} else {

final Object i7024;
if ((boolean)true) {
final Object f7012 = Hdstr.LAMBDA.apply(v6919);

final Object first7011 = f7012;


final Object rest7013 = ((String)v6919).substring(1);
final Object f7014 = LetterQ.LAMBDA.apply(first7011);

final Object i7023;
if ((boolean)f7014) {
final Object f7015 = UstringUpcase.LAMBDA.apply(first7011);
final Object f7016 = Explode.LAMBDA.apply(rest7013);
final Object f7017 = JavifyLoop.LAMBDA.apply(f7016);
final Object f7018 = Ats.LAMBDA.apply(f7015, f7017);

i7023 = f7018;
} else {

final Object i7022;
if ((boolean)true) {
final Object f7019 = EnsureValidChar.LAMBDA.apply(first7011);
final Object f7020 = NameToMethodName.LAMBDA.apply(rest7013);
final Object f7021 = Ats.LAMBDA.apply(f7019, f7020);

i7022 = f7021;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7023 = i7022;

}


i7024 = i7023;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7025 = i7024;

}
    return i7025;

}
}
