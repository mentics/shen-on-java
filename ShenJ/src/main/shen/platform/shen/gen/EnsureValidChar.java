package shen.gen;



import com.mentics.shen.*;

public class EnsureValidChar {

public static final Symbol SYMBOL = RuntimeContext.symbol("ensure-valid-char");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6921) throws Exception {
return defined(v6921);
}};
public static Object defined(final Object v6921) throws Exception {

final Object i7099;
if ((boolean)Lang.equals("*", v6921)) {

i7099 = "Star";
} else {

final Object i7098;
if ((boolean)Lang.equals("/", v6921)) {

i7098 = "Slash";
} else {

final Object i7097;
if ((boolean)Lang.equals("?", v6921)) {

i7097 = "Q";
} else {

final Object i7096;
if ((boolean)Lang.equals("+", v6921)) {

i7096 = "Plus";
} else {

final Object i7095;
if ((boolean)Lang.equals("_", v6921)) {

i7095 = "_";
} else {

final Object i7094;
if ((boolean)Lang.equals("@", v6921)) {

i7094 = "At";
} else {

final Object i7093;
if ((boolean)Lang.equals("<", v6921)) {

i7093 = "A";
} else {

final Object i7092;
if ((boolean)Lang.equals(">", v6921)) {

i7092 = "Z";
} else {

final Object i7091;
if ((boolean)Lang.equals("-", v6921)) {

i7091 = "Hyphen";
} else {

final Object i7090;
if ((boolean)Lang.equals("=", v6921)) {

i7090 = "Equal";
} else {

final Object i7089;
if ((boolean)Lang.equals("!", v6921)) {

i7089 = "Bang";
} else {

final Object i7088;
if ((boolean)Lang.equals("~", v6921)) {

i7088 = "Tilde";
} else {

final Object i7087;
if ((boolean)true) {
final Object f7082 = DigitQ.LAMBDA.apply(v6921);

final Object i7085;
if ((boolean)f7082) {

i7085 = true;
} else {
final Object f7083 = LetterQ.LAMBDA.apply(v6921);

final Object i7084;
if ((boolean)f7083) {

i7084 = true;
} else {

i7084 = false;

}
i7085 = i7084;

}
final Object i7086;
if ((boolean)i7085) {

i7086 = v6921;
} else {

i7086 = "TOxDO";

}
i7087 = i7086;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7088 = i7087;

}
i7089 = i7088;

}
i7090 = i7089;

}
i7091 = i7090;

}
i7092 = i7091;

}
i7093 = i7092;

}
i7094 = i7093;

}
i7095 = i7094;

}
i7096 = i7095;

}
i7097 = i7096;

}
i7098 = i7097;

}
i7099 = i7098;

}
    return i7099;

}
}
