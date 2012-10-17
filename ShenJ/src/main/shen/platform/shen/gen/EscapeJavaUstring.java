package shen.gen;



import com.mentics.shen.*;

public class EscapeJavaUstring {

public static final Symbol SYMBOL = RuntimeContext.symbol("escape-java-ustring");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6922) throws Exception {
return defined(v6922);
}};
public static Object defined(final Object v6922) throws Exception {

final Object i7104;
if ((boolean)Lang.equals("\"", v6922)) {

i7104 = "\\\"";
} else {

final Object i7103;
if ((boolean)Lang.equals("\r", v6922)) {

i7103 = "\\r";
} else {

final Object i7102;
if ((boolean)Lang.equals("\n", v6922)) {

i7102 = "\\n";
} else {

final Object i7101;
if ((boolean)Lang.equals("\\", v6922)) {

i7101 = "\\\\";
} else {

final Object i7100;
if ((boolean)true) {

i7100 = v6922;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7101 = i7100;

}
i7102 = i7101;

}
i7103 = i7102;

}
i7104 = i7103;

}
    return i7104;

}
}
