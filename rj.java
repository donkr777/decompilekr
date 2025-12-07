import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_332;

public class rj implements dj {
   public class_332 ryr;
   public float vsy;
   public static final MethodHandle[] ztn = new MethodHandle[(579278401 & 1076645234 | 2) & 621463979];
   transient String myMetaphor;

   public rj(class_332 var1, float var2) {
      this.JNT<invokedynamic>(this, var1);
      this.JNT<invokedynamic>(this, var2);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = ztn[var10 - 1806118161 + 1279879448 + 194519750 + 1695163868 + 844398863 - 141196373 + 1062216095 + 1136500529 ^ 769922286 ^ 549357546];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = -66567025 & 729707104 ^ 671629312;

         label239:
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
            char var20;
            if (var17 >= var18) {
               String var5 = var10003.toString();
               var13 = (String)var3[2];
               var10001 = new StringBuilder;
               var10003 = var10001;
               var10002 = var10001;
               var16 = var13;
               var14 = var10002;
               var10003.<init>(var16);
               var17 = 402431421 ^ 1801142619 ^ 2091375846;

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
                     Class var6 = Class.forName(var10003.toString(), false, rj.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = 484076530 << 1844296355 ^ -422355056;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), rj.class.getClassLoader()).returnType();
                           switch(((var4 ^ 1592174962 ^ 443798009 ^ 1949941924) + 2034606632 - 1401553457 - 2064442659 ^ 752702385) + 85318543 ^ 1254387533 ^ 1193961523) {
                           case 605122205:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label239;
                           case 1346836041:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label239;
                           case 1367492665:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label239;
                           case 1991733867:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label239;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var20 = var10003.charAt(var17);
                        var10003.setCharAt(var17, (char)(((((((((((var20 & '\uf800') >> 11 | var20 << 5) & '쀀') >> 14 | ((var20 & '\uf800') >> 11 | var20 << 5) << 2) & '쀀') >> 14 | ((((var20 & '\uf800') >> 11 | var20 << 5) & '쀀') >> 14 | ((var20 & '\uf800') >> 11 | var20 << 5) << 2) << 2) - 146 + 180 & 0) >> 16 | ((((((var20 & '\uf800') >> 11 | var20 << 5) & '쀀') >> 14 | ((var20 & '\uf800') >> 11 | var20 << 5) << 2) & '쀀') >> 14 | ((((var20 & '\uf800') >> 11 | var20 << 5) & '쀀') >> 14 | ((var20 & '\uf800') >> 11 | var20 << 5) << 2) << 2) - 146 + 180 << 0) + 74 & '\ufff8') >> 3 | ((((((((var20 & '\uf800') >> 11 | var20 << 5) & '쀀') >> 14 | ((var20 & '\uf800') >> 11 | var20 << 5) << 2) & '쀀') >> 14 | ((((var20 & '\uf800') >> 11 | var20 << 5) & '쀀') >> 14 | ((var20 & '\uf800') >> 11 | var20 << 5) << 2) << 2) - 146 + 180 & 0) >> 16 | ((((((var20 & '\uf800') >> 11 | var20 << 5) & '쀀') >> 14 | ((var20 & '\uf800') >> 11 | var20 << 5) << 2) & '쀀') >> 14 | ((((var20 & '\uf800') >> 11 | var20 << 5) & '쀀') >> 14 | ((var20 & '\uf800') >> 11 | var20 << 5) << 2) << 2) - 146 + 180 << 0) + 74 << 13) - 106 ^ 112));
                        var17 += 1331747187 >> 1220863855 ^ '黀';
                     }
                  }

                  var18 = var10003.charAt(var17) ^ 200;
                  var10003.setCharAt(var17, (char)(((((((((((var18 & '\ue000') >> 13 | var18 << 3) & '￠') >> 5 | ((var18 & '\ue000') >> 13 | var18 << 3) << 11) & 'ﰀ') >> 10 | ((((var18 & '\ue000') >> 13 | var18 << 3) & '￠') >> 5 | ((var18 & '\ue000') >> 13 | var18 << 3) << 11) << 6) & 'ﾀ') >> 7 | ((((((var18 & '\ue000') >> 13 | var18 << 3) & '￠') >> 5 | ((var18 & '\ue000') >> 13 | var18 << 3) << 11) & 'ﰀ') >> 10 | ((((var18 & '\ue000') >> 13 | var18 << 3) & '￠') >> 5 | ((var18 & '\ue000') >> 13 | var18 << 3) << 11) << 6) << 9) & '耀') >> 15 | ((((((((var18 & '\ue000') >> 13 | var18 << 3) & '￠') >> 5 | ((var18 & '\ue000') >> 13 | var18 << 3) << 11) & 'ﰀ') >> 10 | ((((var18 & '\ue000') >> 13 | var18 << 3) & '￠') >> 5 | ((var18 & '\ue000') >> 13 | var18 << 3) << 11) << 6) & 'ﾀ') >> 7 | ((((((var18 & '\ue000') >> 13 | var18 << 3) & '￠') >> 5 | ((var18 & '\ue000') >> 13 | var18 << 3) << 11) & 'ﰀ') >> 10 | ((((var18 & '\ue000') >> 13 | var18 << 3) & '￠') >> 5 | ((var18 & '\ue000') >> 13 | var18 << 3) << 11) << 6) << 9) << 1) - 225 - 227 ^ 243 ^ 53));
                  var17 += (-440315473 | -440315473 | 1) & 3538945;
               }
            }

            var18 = ((var10003.charAt(var17) + 252 - 155 ^ 155 ^ 20) + 114 ^ 229) - 220;
            var18 = ((var18 & 'ﰀ') >> 10 | var18 << 6) - 77;
            int var10004 = (var18 & '\uffff') >> 0;
            var19 = var18;
            var20 = (char)(var10004 | var18 << 16);
            var14.setCharAt(var17, (char)(var10004 | var19 << 16));
            var17 += (-350175091 * -324880270 | 1) & 583551025;
         }
      }

      if (!var11) {
         ztn[var10 - 1806118161 + 1279879448 + 194519750 + 1695163868 + 844398863 - 141196373 + 1062216095 + 1136500529 ^ 769922286 ^ 549357546] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
