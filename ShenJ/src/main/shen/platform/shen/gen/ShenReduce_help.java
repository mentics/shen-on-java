package shen.gen;



import com.mentics.shen.*;

public class ShenReduce_help {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-reduce_help");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v494) throws Exception {
return defined(v494);
}};
public static Object defined(final Object v494) throws Exception {


final Object i2160;
if ((boolean)(v494 instanceof Cons)) {



final Object i2158;
if ((boolean)(((Cons)v494).head instanceof Cons)) {



final Object i2156;
if ((boolean)Lang.equals(RuntimeContext.symbol("/."), ((Cons)((Cons)v494).head).head)) {




final Object i2154;
if ((boolean)(((Cons)((Cons)v494).head).tail instanceof Cons)) {





final Object i2152;
if ((boolean)(((Cons)((Cons)((Cons)v494).head).tail).head instanceof Cons)) {





final Object i2150;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).head)) {






final Object i2148;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail instanceof Cons)) {







final Object i2146;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail instanceof Cons)) {







final Object i2144;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail).tail)) {





final Object i2142;
if ((boolean)(((Cons)((Cons)((Cons)v494).head).tail).tail instanceof Cons)) {





final Object i2140;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).tail)) {



final Object i2138;
if ((boolean)(((Cons)v494).tail instanceof Cons)) {



final Object i2137;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v494).tail).tail)) {

i2137 = true;
} else {

i2137 = false;

}
i2138 = i2137;
} else {

i2138 = false;

}
final Object i2139;
if ((boolean)i2138) {

i2139 = true;
} else {

i2139 = false;

}
i2140 = i2139;
} else {

i2140 = false;

}
final Object i2141;
if ((boolean)i2140) {

i2141 = true;
} else {

i2141 = false;

}
i2142 = i2141;
} else {

i2142 = false;

}
final Object i2143;
if ((boolean)i2142) {

i2143 = true;
} else {

i2143 = false;

}
i2144 = i2143;
} else {

i2144 = false;

}
final Object i2145;
if ((boolean)i2144) {

i2145 = true;
} else {

i2145 = false;

}
i2146 = i2145;
} else {

i2146 = false;

}
final Object i2147;
if ((boolean)i2146) {

i2147 = true;
} else {

i2147 = false;

}
i2148 = i2147;
} else {

i2148 = false;

}
final Object i2149;
if ((boolean)i2148) {

i2149 = true;
} else {

i2149 = false;

}
i2150 = i2149;
} else {

i2150 = false;

}
final Object i2151;
if ((boolean)i2150) {

i2151 = true;
} else {

i2151 = false;

}
i2152 = i2151;
} else {

i2152 = false;

}
final Object i2153;
if ((boolean)i2152) {

i2153 = true;
} else {

i2153 = false;

}
i2154 = i2153;
} else {

i2154 = false;

}
final Object i2155;
if ((boolean)i2154) {

i2155 = true;
} else {

i2155 = false;

}
i2156 = i2155;
} else {

i2156 = false;

}
final Object i2157;
if ((boolean)i2156) {

i2157 = true;
} else {

i2157 = false;

}
i2158 = i2157;
} else {

i2158 = false;

}
final Object i2159;
if ((boolean)i2158) {

i2159 = true;
} else {

i2159 = false;

}
i2160 = i2159;
} else {

i2160 = false;

}
final Object i2320;
if ((boolean)i2160) {



final Object f2161 = ShenAdd_test.LAMBDA.apply(new Cons(RuntimeContext.symbol("cons?"), ((Cons)v494).tail));
























final Object f2163 = ShenEbr.LAMBDA.apply(((Cons)((Cons)v494).tail).head, ((Cons)((Cons)((Cons)v494).head).tail).head, ((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).head);









final Object abstraction2162 = new Cons(RuntimeContext.symbol("/."), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).head, new Cons(new Cons(RuntimeContext.symbol("/."), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail).head, new Cons(f2163, Nil.NIL))), Nil.NIL)));















final Object application2164 = new Cons(new Cons(abstraction2162, new Cons(new Cons(RuntimeContext.symbol("hd"), ((Cons)v494).tail), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("tl"), ((Cons)v494).tail), Nil.NIL));
final Object f2165 = ShenReduce_help.LAMBDA.apply(application2164);


final Object f2166 = Do.LAMBDA.apply(f2161, f2165);

i2320 = f2166;
} else {


final Object i2190;
if ((boolean)(v494 instanceof Cons)) {



final Object i2188;
if ((boolean)(((Cons)v494).head instanceof Cons)) {



final Object i2186;
if ((boolean)Lang.equals(RuntimeContext.symbol("/."), ((Cons)((Cons)v494).head).head)) {




final Object i2184;
if ((boolean)(((Cons)((Cons)v494).head).tail instanceof Cons)) {





final Object i2182;
if ((boolean)(((Cons)((Cons)((Cons)v494).head).tail).head instanceof Cons)) {





final Object i2180;
if ((boolean)Lang.equals(RuntimeContext.symbol("@p"), ((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).head)) {






final Object i2178;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail instanceof Cons)) {







final Object i2176;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail instanceof Cons)) {







final Object i2174;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail).tail)) {





final Object i2172;
if ((boolean)(((Cons)((Cons)((Cons)v494).head).tail).tail instanceof Cons)) {





final Object i2170;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).tail)) {



final Object i2168;
if ((boolean)(((Cons)v494).tail instanceof Cons)) {



final Object i2167;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v494).tail).tail)) {

i2167 = true;
} else {

i2167 = false;

}
i2168 = i2167;
} else {

i2168 = false;

}
final Object i2169;
if ((boolean)i2168) {

i2169 = true;
} else {

i2169 = false;

}
i2170 = i2169;
} else {

i2170 = false;

}
final Object i2171;
if ((boolean)i2170) {

i2171 = true;
} else {

i2171 = false;

}
i2172 = i2171;
} else {

i2172 = false;

}
final Object i2173;
if ((boolean)i2172) {

i2173 = true;
} else {

i2173 = false;

}
i2174 = i2173;
} else {

i2174 = false;

}
final Object i2175;
if ((boolean)i2174) {

i2175 = true;
} else {

i2175 = false;

}
i2176 = i2175;
} else {

i2176 = false;

}
final Object i2177;
if ((boolean)i2176) {

i2177 = true;
} else {

i2177 = false;

}
i2178 = i2177;
} else {

i2178 = false;

}
final Object i2179;
if ((boolean)i2178) {

i2179 = true;
} else {

i2179 = false;

}
i2180 = i2179;
} else {

i2180 = false;

}
final Object i2181;
if ((boolean)i2180) {

i2181 = true;
} else {

i2181 = false;

}
i2182 = i2181;
} else {

i2182 = false;

}
final Object i2183;
if ((boolean)i2182) {

i2183 = true;
} else {

i2183 = false;

}
i2184 = i2183;
} else {

i2184 = false;

}
final Object i2185;
if ((boolean)i2184) {

i2185 = true;
} else {

i2185 = false;

}
i2186 = i2185;
} else {

i2186 = false;

}
final Object i2187;
if ((boolean)i2186) {

i2187 = true;
} else {

i2187 = false;

}
i2188 = i2187;
} else {

i2188 = false;

}
final Object i2189;
if ((boolean)i2188) {

i2189 = true;
} else {

i2189 = false;

}
i2190 = i2189;
} else {

i2190 = false;

}
final Object i2319;
if ((boolean)i2190) {



final Object f2191 = ShenAdd_test.LAMBDA.apply(new Cons(RuntimeContext.symbol("tuple?"), ((Cons)v494).tail));
























final Object f2193 = ShenEbr.LAMBDA.apply(((Cons)((Cons)v494).tail).head, ((Cons)((Cons)((Cons)v494).head).tail).head, ((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).head);









final Object abstraction2192 = new Cons(RuntimeContext.symbol("/."), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).head, new Cons(new Cons(RuntimeContext.symbol("/."), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail).head, new Cons(f2193, Nil.NIL))), Nil.NIL)));















final Object application2194 = new Cons(new Cons(abstraction2192, new Cons(new Cons(RuntimeContext.symbol("fst"), ((Cons)v494).tail), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("snd"), ((Cons)v494).tail), Nil.NIL));
final Object f2195 = ShenReduce_help.LAMBDA.apply(application2194);


final Object f2196 = Do.LAMBDA.apply(f2191, f2195);

i2319 = f2196;
} else {


final Object i2220;
if ((boolean)(v494 instanceof Cons)) {



final Object i2218;
if ((boolean)(((Cons)v494).head instanceof Cons)) {



final Object i2216;
if ((boolean)Lang.equals(RuntimeContext.symbol("/."), ((Cons)((Cons)v494).head).head)) {




final Object i2214;
if ((boolean)(((Cons)((Cons)v494).head).tail instanceof Cons)) {





final Object i2212;
if ((boolean)(((Cons)((Cons)((Cons)v494).head).tail).head instanceof Cons)) {





final Object i2210;
if ((boolean)Lang.equals(RuntimeContext.symbol("@v"), ((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).head)) {






final Object i2208;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail instanceof Cons)) {







final Object i2206;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail instanceof Cons)) {







final Object i2204;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail).tail)) {





final Object i2202;
if ((boolean)(((Cons)((Cons)((Cons)v494).head).tail).tail instanceof Cons)) {





final Object i2200;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).tail)) {



final Object i2198;
if ((boolean)(((Cons)v494).tail instanceof Cons)) {



final Object i2197;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v494).tail).tail)) {

i2197 = true;
} else {

i2197 = false;

}
i2198 = i2197;
} else {

i2198 = false;

}
final Object i2199;
if ((boolean)i2198) {

i2199 = true;
} else {

i2199 = false;

}
i2200 = i2199;
} else {

i2200 = false;

}
final Object i2201;
if ((boolean)i2200) {

i2201 = true;
} else {

i2201 = false;

}
i2202 = i2201;
} else {

i2202 = false;

}
final Object i2203;
if ((boolean)i2202) {

i2203 = true;
} else {

i2203 = false;

}
i2204 = i2203;
} else {

i2204 = false;

}
final Object i2205;
if ((boolean)i2204) {

i2205 = true;
} else {

i2205 = false;

}
i2206 = i2205;
} else {

i2206 = false;

}
final Object i2207;
if ((boolean)i2206) {

i2207 = true;
} else {

i2207 = false;

}
i2208 = i2207;
} else {

i2208 = false;

}
final Object i2209;
if ((boolean)i2208) {

i2209 = true;
} else {

i2209 = false;

}
i2210 = i2209;
} else {

i2210 = false;

}
final Object i2211;
if ((boolean)i2210) {

i2211 = true;
} else {

i2211 = false;

}
i2212 = i2211;
} else {

i2212 = false;

}
final Object i2213;
if ((boolean)i2212) {

i2213 = true;
} else {

i2213 = false;

}
i2214 = i2213;
} else {

i2214 = false;

}
final Object i2215;
if ((boolean)i2214) {

i2215 = true;
} else {

i2215 = false;

}
i2216 = i2215;
} else {

i2216 = false;

}
final Object i2217;
if ((boolean)i2216) {

i2217 = true;
} else {

i2217 = false;

}
i2218 = i2217;
} else {

i2218 = false;

}
final Object i2219;
if ((boolean)i2218) {

i2219 = true;
} else {

i2219 = false;

}
i2220 = i2219;
} else {

i2220 = false;

}
final Object i2318;
if ((boolean)i2220) {



final Object f2221 = ShenAdd_test.LAMBDA.apply(new Cons(RuntimeContext.symbol("shen-+vector?"), ((Cons)v494).tail));
























final Object f2223 = ShenEbr.LAMBDA.apply(((Cons)((Cons)v494).tail).head, ((Cons)((Cons)((Cons)v494).head).tail).head, ((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).head);









final Object abstraction2222 = new Cons(RuntimeContext.symbol("/."), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).head, new Cons(new Cons(RuntimeContext.symbol("/."), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail).head, new Cons(f2223, Nil.NIL))), Nil.NIL)));















final Object application2224 = new Cons(new Cons(abstraction2222, new Cons(new Cons(RuntimeContext.symbol("hdv"), ((Cons)v494).tail), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("tlv"), ((Cons)v494).tail), Nil.NIL));
final Object f2225 = ShenReduce_help.LAMBDA.apply(application2224);


final Object f2226 = Do.LAMBDA.apply(f2221, f2225);

i2318 = f2226;
} else {


final Object i2250;
if ((boolean)(v494 instanceof Cons)) {



final Object i2248;
if ((boolean)(((Cons)v494).head instanceof Cons)) {



final Object i2246;
if ((boolean)Lang.equals(RuntimeContext.symbol("/."), ((Cons)((Cons)v494).head).head)) {




final Object i2244;
if ((boolean)(((Cons)((Cons)v494).head).tail instanceof Cons)) {





final Object i2242;
if ((boolean)(((Cons)((Cons)((Cons)v494).head).tail).head instanceof Cons)) {





final Object i2240;
if ((boolean)Lang.equals(RuntimeContext.symbol("@s"), ((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).head)) {






final Object i2238;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail instanceof Cons)) {







final Object i2236;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail instanceof Cons)) {







final Object i2234;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail).tail)) {





final Object i2232;
if ((boolean)(((Cons)((Cons)((Cons)v494).head).tail).tail instanceof Cons)) {





final Object i2230;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).tail)) {



final Object i2228;
if ((boolean)(((Cons)v494).tail instanceof Cons)) {



final Object i2227;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v494).tail).tail)) {

i2227 = true;
} else {

i2227 = false;

}
i2228 = i2227;
} else {

i2228 = false;

}
final Object i2229;
if ((boolean)i2228) {

i2229 = true;
} else {

i2229 = false;

}
i2230 = i2229;
} else {

i2230 = false;

}
final Object i2231;
if ((boolean)i2230) {

i2231 = true;
} else {

i2231 = false;

}
i2232 = i2231;
} else {

i2232 = false;

}
final Object i2233;
if ((boolean)i2232) {

i2233 = true;
} else {

i2233 = false;

}
i2234 = i2233;
} else {

i2234 = false;

}
final Object i2235;
if ((boolean)i2234) {

i2235 = true;
} else {

i2235 = false;

}
i2236 = i2235;
} else {

i2236 = false;

}
final Object i2237;
if ((boolean)i2236) {

i2237 = true;
} else {

i2237 = false;

}
i2238 = i2237;
} else {

i2238 = false;

}
final Object i2239;
if ((boolean)i2238) {

i2239 = true;
} else {

i2239 = false;

}
i2240 = i2239;
} else {

i2240 = false;

}
final Object i2241;
if ((boolean)i2240) {

i2241 = true;
} else {

i2241 = false;

}
i2242 = i2241;
} else {

i2242 = false;

}
final Object i2243;
if ((boolean)i2242) {

i2243 = true;
} else {

i2243 = false;

}
i2244 = i2243;
} else {

i2244 = false;

}
final Object i2245;
if ((boolean)i2244) {

i2245 = true;
} else {

i2245 = false;

}
i2246 = i2245;
} else {

i2246 = false;

}
final Object i2247;
if ((boolean)i2246) {

i2247 = true;
} else {

i2247 = false;

}
i2248 = i2247;
} else {

i2248 = false;

}
final Object i2249;
if ((boolean)i2248) {

i2249 = true;
} else {

i2249 = false;

}
i2250 = i2249;
} else {

i2250 = false;

}
final Object i2317;
if ((boolean)i2250) {



final Object f2251 = ShenAdd_test.LAMBDA.apply(new Cons(RuntimeContext.symbol("shen-+string?"), ((Cons)v494).tail));
























final Object f2253 = ShenEbr.LAMBDA.apply(((Cons)((Cons)v494).tail).head, ((Cons)((Cons)((Cons)v494).head).tail).head, ((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).head);









final Object abstraction2252 = new Cons(RuntimeContext.symbol("/."), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).head, new Cons(new Cons(RuntimeContext.symbol("/."), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v494).head).tail).head).tail).tail).head, new Cons(f2253, Nil.NIL))), Nil.NIL)));




















final Object application2254 = new Cons(new Cons(abstraction2252, new Cons(new Cons(RuntimeContext.symbol("pos"), new Cons(((Cons)((Cons)v494).tail).head, new Cons(0, Nil.NIL))), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("tlstr"), ((Cons)v494).tail), Nil.NIL));
final Object f2255 = ShenReduce_help.LAMBDA.apply(application2254);


final Object f2256 = Do.LAMBDA.apply(f2251, f2255);

i2317 = f2256;
} else {


final Object i2273;
if ((boolean)(v494 instanceof Cons)) {



final Object i2271;
if ((boolean)(((Cons)v494).head instanceof Cons)) {



final Object i2269;
if ((boolean)Lang.equals(RuntimeContext.symbol("/."), ((Cons)((Cons)v494).head).head)) {




final Object i2267;
if ((boolean)(((Cons)((Cons)v494).head).tail instanceof Cons)) {





final Object i2265;
if ((boolean)(((Cons)((Cons)((Cons)v494).head).tail).tail instanceof Cons)) {





final Object i2263;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).tail)) {



final Object i2261;
if ((boolean)(((Cons)v494).tail instanceof Cons)) {



final Object i2259;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v494).tail).tail)) {



final Object f2257 = VariableQ.LAMBDA.apply(((Cons)((Cons)((Cons)v494).head).tail).head);


final Object i2258;
if ((boolean)!((boolean)f2257)) {

i2258 = true;
} else {

i2258 = false;

}
i2259 = i2258;
} else {

i2259 = false;

}
final Object i2260;
if ((boolean)i2259) {

i2260 = true;
} else {

i2260 = false;

}
i2261 = i2260;
} else {

i2261 = false;

}
final Object i2262;
if ((boolean)i2261) {

i2262 = true;
} else {

i2262 = false;

}
i2263 = i2262;
} else {

i2263 = false;

}
final Object i2264;
if ((boolean)i2263) {

i2264 = true;
} else {

i2264 = false;

}
i2265 = i2264;
} else {

i2265 = false;

}
final Object i2266;
if ((boolean)i2265) {

i2266 = true;
} else {

i2266 = false;

}
i2267 = i2266;
} else {

i2267 = false;

}
final Object i2268;
if ((boolean)i2267) {

i2268 = true;
} else {

i2268 = false;

}
i2269 = i2268;
} else {

i2269 = false;

}
final Object i2270;
if ((boolean)i2269) {

i2270 = true;
} else {

i2270 = false;

}
i2271 = i2270;
} else {

i2271 = false;

}
final Object i2272;
if ((boolean)i2271) {

i2272 = true;
} else {

i2272 = false;

}
i2273 = i2272;
} else {

i2273 = false;

}
final Object i2316;
if ((boolean)i2273) {








final Object f2274 = ShenAdd_test.LAMBDA.apply(new Cons(RuntimeContext.symbol("="), new Cons(((Cons)((Cons)((Cons)v494).head).tail).head, ((Cons)v494).tail)));




final Object f2275 = ShenReduce_help.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).head);
final Object f2276 = Do.LAMBDA.apply(f2274, f2275);

i2316 = f2276;
} else {


final Object i2290;
if ((boolean)(v494 instanceof Cons)) {



final Object i2288;
if ((boolean)(((Cons)v494).head instanceof Cons)) {



final Object i2286;
if ((boolean)Lang.equals(RuntimeContext.symbol("/."), ((Cons)((Cons)v494).head).head)) {




final Object i2284;
if ((boolean)(((Cons)((Cons)v494).head).tail instanceof Cons)) {





final Object i2282;
if ((boolean)(((Cons)((Cons)((Cons)v494).head).tail).tail instanceof Cons)) {





final Object i2280;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).tail)) {



final Object i2278;
if ((boolean)(((Cons)v494).tail instanceof Cons)) {



final Object i2277;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v494).tail).tail)) {

i2277 = true;
} else {

i2277 = false;

}
i2278 = i2277;
} else {

i2278 = false;

}
final Object i2279;
if ((boolean)i2278) {

i2279 = true;
} else {

i2279 = false;

}
i2280 = i2279;
} else {

i2280 = false;

}
final Object i2281;
if ((boolean)i2280) {

i2281 = true;
} else {

i2281 = false;

}
i2282 = i2281;
} else {

i2282 = false;

}
final Object i2283;
if ((boolean)i2282) {

i2283 = true;
} else {

i2283 = false;

}
i2284 = i2283;
} else {

i2284 = false;

}
final Object i2285;
if ((boolean)i2284) {

i2285 = true;
} else {

i2285 = false;

}
i2286 = i2285;
} else {

i2286 = false;

}
final Object i2287;
if ((boolean)i2286) {

i2287 = true;
} else {

i2287 = false;

}
i2288 = i2287;
} else {

i2288 = false;

}
final Object i2289;
if ((boolean)i2288) {

i2289 = true;
} else {

i2289 = false;

}
i2290 = i2289;
} else {

i2290 = false;

}
final Object i2315;
if ((boolean)i2290) {









final Object f2291 = ShenEbr.LAMBDA.apply(((Cons)((Cons)v494).tail).head, ((Cons)((Cons)((Cons)v494).head).tail).head, ((Cons)((Cons)((Cons)((Cons)v494).head).tail).tail).head);
final Object f2292 = ShenReduce_help.LAMBDA.apply(f2291);

i2315 = f2292;
} else {


final Object i2300;
if ((boolean)(v494 instanceof Cons)) {


final Object i2298;
if ((boolean)Lang.equals(RuntimeContext.symbol("where"), ((Cons)v494).head)) {



final Object i2296;
if ((boolean)(((Cons)v494).tail instanceof Cons)) {




final Object i2294;
if ((boolean)(((Cons)((Cons)v494).tail).tail instanceof Cons)) {




final Object i2293;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v494).tail).tail).tail)) {

i2293 = true;
} else {

i2293 = false;

}
i2294 = i2293;
} else {

i2294 = false;

}
final Object i2295;
if ((boolean)i2294) {

i2295 = true;
} else {

i2295 = false;

}
i2296 = i2295;
} else {

i2296 = false;

}
final Object i2297;
if ((boolean)i2296) {

i2297 = true;
} else {

i2297 = false;

}
i2298 = i2297;
} else {

i2298 = false;

}
final Object i2299;
if ((boolean)i2298) {

i2299 = true;
} else {

i2299 = false;

}
i2300 = i2299;
} else {

i2300 = false;

}
final Object i2314;
if ((boolean)i2300) {


final Object f2301 = ShenAdd_test.LAMBDA.apply(((Cons)((Cons)v494).tail).head);



final Object f2302 = ShenReduce_help.LAMBDA.apply(((Cons)((Cons)((Cons)v494).tail).tail).head);
final Object f2303 = Do.LAMBDA.apply(f2301, f2302);

i2314 = f2303;
} else {


final Object i2307;
if ((boolean)(v494 instanceof Cons)) {



final Object i2305;
if ((boolean)(((Cons)v494).tail instanceof Cons)) {



final Object i2304;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v494).tail).tail)) {

i2304 = true;
} else {

i2304 = false;

}
i2305 = i2304;
} else {

i2305 = false;

}
final Object i2306;
if ((boolean)i2305) {

i2306 = true;
} else {

i2306 = false;

}
i2307 = i2306;
} else {

i2307 = false;

}
final Object i2313;
if ((boolean)i2307) {

final Object f2309 = ShenReduce_help.LAMBDA.apply(((Cons)v494).head);

final Object z2308 = f2309;


final Object i2311;
if ((boolean)Lang.equals(((Cons)v494).head, z2308)) {

i2311 = v494;
} else {



final Object f2310 = ShenReduce_help.LAMBDA.apply(new Cons(z2308, ((Cons)v494).tail));

i2311 = f2310;

}

i2313 = i2311;
} else {

final Object i2312;
if ((boolean)true) {

i2312 = v494;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2313 = i2312;

}
i2314 = i2313;

}
i2315 = i2314;

}
i2316 = i2315;

}
i2317 = i2316;

}
i2318 = i2317;

}
i2319 = i2318;

}
i2320 = i2319;

}
    return i2320;

}
}
