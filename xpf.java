import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_5900;

public class xpf implements dj {
   public class_5900 dc;
   public static final MethodHandle[] puq = new MethodHandle[1723433444 << (-1855770225 | -2061302335) ^ -1057882111];
   transient String myMetaphor;

   public xpf(class_5900 var1) {
      this.JNT<invokedynamic>(this, var1);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = puq[(((var10 ^ 2125460273) - 586880738 ^ 324661709) + 744145509 + 2099035428 + 347843186 - 635763087 ^ 2045404078) - 1454387684 ^ 291512150];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = (-1307044972 >>> -1077330233 | 0) & 1175028872;

         label241:
         while(true) {
            int var18 = var17;
            var10001 = var14;
            int var15 = var18;
            int var19 = var10001.length();
            var10002 = var10001;
            var17 = var19;
            var10003 = var10002;
            var18 = var17;
            var17 = var15;
            var14 = var10003;
            if (var17 >= var18) {
               String var5 = var10003.toString();
               var13 = (String)var3[2];
               var10001 = new StringBuilder;
               var10003 = var10001;
               var10002 = var10001;
               var16 = var13;
               var14 = var10002;
               var10003.<init>(var16);
               var17 = -804065592 + 450429211 ^ -353636381;

               while(true) {
                  var18 = var17;
                  var10001 = var14;
                  var15 = var18;
                  var19 = var10001.length();
                  var10002 = var10001;
                  var17 = var19;
                  var10003 = var10002;
                  var18 = var17;
                  var17 = var15;
                  var14 = var10003;
                  char var20;
                  if (var17 >= var18) {
                     Class var6 = Class.forName(var10003.toString(), false, xpf.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = (-1436018505 | -1436018505) ^ -1436018505;

                     while(true) {
                        var18 = var17;
                        var10001 = var14;
                        var15 = var18;
                        var19 = var10001.length();
                        var10002 = var10001;
                        var17 = var19;
                        var10003 = var10002;
                        var18 = var17;
                        var17 = var15;
                        var14 = var10003;
                        if (var17 >= var18) {
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), xpf.class.getClassLoader()).returnType();
                           switch(((var4 + 994646912 + 889450096 + 220939099 + 840263837 ^ 230693272 ^ 51896930) - 1830168607 - 117148615 ^ 732272386) + 2137524327) {
                           case 214538533:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label241;
                           case 682739492:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label241;
                           case 1159514335:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label241;
                           case 1337517779:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label241;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var20 = var10003.charAt(var17);
                        var10003.setCharAt(var17, (char)((((((((((((var20 & '\uf000') >> 12 | var20 << 4) & '\uf800') >> 11 | ((var20 & '\uf000') >> 12 | var20 << 4) << 5) ^ 187) & '\uffc0') >> 6 | (((((var20 & '\uf000') >> 12 | var20 << 4) & '\uf800') >> 11 | ((var20 & '\uf000') >> 12 | var20 << 4) << 5) ^ 187) << 10) + 131 + 197 & '￼') >> 2 | (((((((var20 & '\uf000') >> 12 | var20 << 4) & '\uf800') >> 11 | ((var20 & '\uf000') >> 12 | var20 << 4) << 5) ^ 187) & '\uffc0') >> 6 | (((((var20 & '\uf000') >> 12 | var20 << 4) & '\uf800') >> 11 | ((var20 & '\uf000') >> 12 | var20 << 4) << 5) ^ 187) << 10) + 131 + 197 << 14) - 83 & '\uffff') >> 0 | (((((((((var20 & '\uf000') >> 12 | var20 << 4) & '\uf800') >> 11 | ((var20 & '\uf000') >> 12 | var20 << 4) << 5) ^ 187) & '\uffc0') >> 6 | (((((var20 & '\uf000') >> 12 | var20 << 4) & '\uf800') >> 11 | ((var20 & '\uf000') >> 12 | var20 << 4) << 5) ^ 187) << 10) + 131 + 197 & '￼') >> 2 | (((((((var20 & '\uf000') >> 12 | var20 << 4) & '\uf800') >> 11 | ((var20 & '\uf000') >> 12 | var20 << 4) << 5) ^ 187) & '\uffc0') >> 6 | (((((var20 & '\uf000') >> 12 | var20 << 4) & '\uf800') >> 11 | ((var20 & '\uf000') >> 12 | var20 << 4) << 5) ^ 187) << 10) + 131 + 197 << 14) - 83 << 16) ^ 224));
                        var17 += (1853898845 + 1853898845 | 1) & 49942273;
                     }
                  }

                  var18 = var10003.charAt(var17) ^ 235 ^ 227;
                  var18 = ((((((((var18 & '￠') >> 5 | var18 << 11) ^ 126) & '￠') >> 5 | (((var18 & '￠') >> 5 | var18 << 11) ^ 126) << 11) ^ 145) & 'ﾀ') >> 7 | ((((((var18 & '￠') >> 5 | var18 << 11) ^ 126) & '￠') >> 5 | (((var18 & '￠') >> 5 | var18 << 11) ^ 126) << 11) ^ 145) << 9) + 228;
                  int var10004 = (var18 & '\uf800') >> 11;
                  var19 = var18;
                  var18 = var10004 | var18 << 5;
                  var10004 = ((var10004 | var19 << 5) & 'ﰀ') >> 10;
                  var19 = var18;
                  var20 = (char)(var10004 | var18 << 6);
                  var14.setCharAt(var17, (char)(var10004 | var19 << 6));
                  var17 += (-1658791890 | -1938634052 | 1) & 34406721;
               }
            }

            var18 = (var10003.charAt(var17) - 212 ^ 21) - 124 ^ 42;
            var10003.setCharAt(var17, (char)((((((((var18 & '\uf800') >> 11 | var18 << 5) & '\uf800') >> 11 | ((var18 & '\uf800') >> 11 | var18 << 5) << 5) ^ 72) + 251 & '耀') >> 15 | (((((var18 & '\uf800') >> 11 | var18 << 5) & '\uf800') >> 11 | ((var18 & '\uf800') >> 11 | var18 << 5) << 5) ^ 72) + 251 << 1) ^ 146));
            var17 += -1150393827 + -1150393827 ^ 1994179643;
         }
      }

      if (!var11) {
         puq[(((var10 ^ 2125460273) - 586880738 ^ 324661709) + 744145509 + 2099035428 + 347843186 - 635763087 ^ 2045404078) - 1454387684 ^ 291512150] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
