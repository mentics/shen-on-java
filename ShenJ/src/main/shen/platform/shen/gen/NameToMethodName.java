package shen.gen;



import com.mentics.shen.*;

public class NameToMethodName {

public static final Symbol SYMBOL = RuntimeContext.symbol("name->method-name");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6918) throws Exception {
return defined(v6918);
}};
public static Object defined(final Object v6918) throws Exception {

final Object i7010;
if ((boolean)Lang.equals("", v6918)) {

i7010 = "";
} else {

final Object i7009;
if ((boolean)true) {
final Object f7003 = Hdstr.LAMBDA.apply(v6918);
final Object f7004 = EnsureValidChar.LAMBDA.apply(f7003);
final Object f7005 = UstringDowncase.LAMBDA.apply(f7004);


final Object f7006 = Explode.LAMBDA.apply(((String)v6918).substring(1));
final Object f7007 = JavifyLoop.LAMBDA.apply(f7006);

final Object f7008 = EnsureNotReserved.LAMBDA.apply(((String)f7005 + (String)f7007));

i7009 = f7008;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7010 = i7009;

}
    return i7010;

}
}
