import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class ep implements dj {
   public class_1297 pxb;
   public CallbackInfoReturnable xhk;
   public static final MethodHandle[] kae = new MethodHandle[(1806789044 ^ 1806789044 | 2) & 1773081670];
   transient String myMetaphor;

   public ep(class_1297 var1, CallbackInfoReturnable var2) {
      this.JNT<invokedynamic>(this, var1);
      this.JNT<invokedynamic>(this, var2);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = kae[var10 + 661365937 + 399601913 - 2073704038 - 1730842143 + 366664502 + 390881012 - 1890262452 - 1874440030 + 1829256374 + 1959597705];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = -1381489670 & 1147274062 ^ 69206858;

         label240:
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
               var17 = 1137506446 >>> -1982331307 ^ 542;

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
                     Class var6 = Class.forName(var10003.toString(), false, ep.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = (1425740040 - 782547723 | 0) & 1361577984;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), ep.class.getClassLoader()).returnType();
                           switch(((var4 + 1213143176 + 398883912 ^ 1350511014) - 1134792281 + 1638592909 + 1184893660 - 1318843772 ^ 195862001) + 688978297 + 677286780) {
                           case 225276375:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label240;
                           case 872454586:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label240;
                           case 894911616:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label240;
                           case 972531858:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label240;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var18 = var10003.charAt(var17) + 51 + 215;
                        var18 = ((((((var18 & '￠') >> 5 | var18 << 11) ^ 158) & '\uffff') >> 0 | (((var18 & '￠') >> 5 | var18 << 11) ^ 158) << 16) - 40 ^ 218) - 116 ^ 133;
                        int var10004 = (var18 & '\uffc0') >> 6;
                        var19 = var18;
                        var20 = (char)(var10004 | var18 << 10);
                        var14.setCharAt(var17, (char)(var10004 | var19 << 10));
                        var17 += 1801928701 & 1604014941 ^ 1258492764;
                     }
                  }

                  var18 = var10003.charAt(var17) + 221 ^ 219;
                  var10003.setCharAt(var17, (char)(((((((((var18 & 0) >> 16 | var18 << 0) & '\uffc0') >> 6 | ((var18 & 0) >> 16 | var18 << 0) << 10) & '￠') >> 5 | ((((var18 & 0) >> 16 | var18 << 0) & '\uffc0') >> 6 | ((var18 & 0) >> 16 | var18 << 0) << 10) << 11) + 145 ^ 222) + 51 ^ 146) - 20));
                  var17 += 734455199 - -237444888 ^ 971900086;
               }
            }

            var20 = var10003.charAt(var17);
            var10003.setCharAt(var17, (char)(((((((((((var20 & 'ﰀ') >> 10 | var20 << 6) & '\ufffe') >> 1 | ((var20 & 'ﰀ') >> 10 | var20 << 6) << 15) - 112 & 'ﾀ') >> 7 | ((((var20 & 'ﰀ') >> 10 | var20 << 6) & '\ufffe') >> 1 | ((var20 & 'ﰀ') >> 10 | var20 << 6) << 15) - 112 << 9) - 252 & 'ﰀ') >> 10 | ((((((var20 & 'ﰀ') >> 10 | var20 << 6) & '\ufffe') >> 1 | ((var20 & 'ﰀ') >> 10 | var20 << 6) << 15) - 112 & 'ﾀ') >> 7 | ((((var20 & 'ﰀ') >> 10 | var20 << 6) & '\ufffe') >> 1 | ((var20 & 'ﰀ') >> 10 | var20 << 6) << 15) - 112 << 9) - 252 << 6) - 40 & '\uffc0') >> 6 | ((((((((var20 & 'ﰀ') >> 10 | var20 << 6) & '\ufffe') >> 1 | ((var20 & 'ﰀ') >> 10 | var20 << 6) << 15) - 112 & 'ﾀ') >> 7 | ((((var20 & 'ﰀ') >> 10 | var20 << 6) & '\ufffe') >> 1 | ((var20 & 'ﰀ') >> 10 | var20 << 6) << 15) - 112 << 9) - 252 & 'ﰀ') >> 10 | ((((((var20 & 'ﰀ') >> 10 | var20 << 6) & '\ufffe') >> 1 | ((var20 & 'ﰀ') >> 10 | var20 << 6) << 15) - 112 & 'ﾀ') >> 7 | ((((var20 & 'ﰀ') >> 10 | var20 << 6) & '\ufffe') >> 1 | ((var20 & 'ﰀ') >> 10 | var20 << 6) << 15) - 112 << 9) - 252 << 6) - 40 << 10) + 168 + 160));
            var17 += (990316750 >> -196694614 | 1) & 1665146921;
         }
      }

      if (!var11) {
         kae[var10 + 661365937 + 399601913 - 2073704038 - 1730842143 + 366664502 + 390881012 - 1890262452 - 1874440030 + 1829256374 + 1959597705] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
