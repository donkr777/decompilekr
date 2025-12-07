import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class lk implements dj {
   public class_1297 pxb;
   public CallbackInfoReturnable bd;
   public static final MethodHandle[] upb = new MethodHandle[372516102 & -2016957754 ^ 100933636];
   transient String myMetaphor;

   public lk(class_1297 var1, CallbackInfoReturnable var2) {
      this.JNT<invokedynamic>(this, var1);
      this.JNT<invokedynamic>(this, var2);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = upb[(var10 + 1497126797 - 1698463854 + 2120602987 + 39030813 - 1354843935 ^ 1997637951) + 1767973297 + 1730456476 + 1876120317 ^ 1755665265];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = (911452019 ^ 894225122 | 0) & -866123256;

         label247:
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
            int var10004;
            if (var17 >= var18) {
               String var5 = var10003.toString();
               var13 = (String)var3[2];
               var10001 = new StringBuilder;
               var10003 = var10001;
               var10002 = var10001;
               var16 = var13;
               var14 = var10002;
               var10003.<init>(var16);
               var17 = 728515621 - (728515621 + 728515621) ^ -728515621;

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
                     Class var6 = Class.forName(var10003.toString(), false, lk.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = (-331727017 | -825243414 & -331727017 | 0) & 12648488;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), lk.class.getClassLoader()).returnType();
                           switch((var4 + 929540448 ^ 260183242) + 246506780 + 291990129 + 693236675 - 1644941267 + 304133646 - 211446119 ^ 1356300631 ^ 676600414) {
                           case 419856003:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label247;
                           case 608933537:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label247;
                           case 1491579936:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label247;
                           case 1740500834:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label247;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var20 = var10003.charAt(var17);
                        var10003.setCharAt(var17, (char)((((((((((((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) & 'ﰀ') >> 10 | ((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) << 6) & '\ufff0') >> 4 | ((((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) & 'ﰀ') >> 10 | ((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) << 6) << 12) + 211 & '耀') >> 15 | ((((((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) & 'ﰀ') >> 10 | ((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) << 6) & '\ufff0') >> 4 | ((((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) & 'ﰀ') >> 10 | ((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) << 6) << 12) + 211 << 1) & '︀') >> 9 | ((((((((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) & 'ﰀ') >> 10 | ((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) << 6) & '\ufff0') >> 4 | ((((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) & 'ﰀ') >> 10 | ((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) << 6) << 12) + 211 & '耀') >> 15 | ((((((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) & 'ﰀ') >> 10 | ((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) << 6) & '\ufff0') >> 4 | ((((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) & 'ﰀ') >> 10 | ((((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) & '耀') >> 15 | ((((var20 & '\ufff8') >> 3 | var20 << 13) & '쀀') >> 14 | ((var20 & '\ufff8') >> 3 | var20 << 13) << 2) << 1) << 6) << 12) + 211 << 1) << 7) ^ 3) - 163));
                        var17 += -271749695 ^ 1339295643 ^ -1608947109;
                     }
                  }

                  var18 = var10003.charAt(var17) + 221;
                  var18 = (((((((var18 & '\ue000') >> 13 | var18 << 3) & '\uf000') >> 12 | ((var18 & '\ue000') >> 13 | var18 << 3) << 4) - 49 & 'ﰀ') >> 10 | ((((var18 & '\ue000') >> 13 | var18 << 3) & '\uf000') >> 12 | ((var18 & '\ue000') >> 13 | var18 << 3) << 4) - 49 << 6) ^ 141) + 199 + 86;
                  var10004 = (var18 & '\ufff0') >> 4;
                  var19 = var18;
                  var18 = var10004 | var18 << 12;
                  var10004 = ((var10004 | var19 << 12) & 'ﰀ') >> 10;
                  var19 = var18;
                  var20 = (char)(var10004 | var18 << 6);
                  var14.setCharAt(var17, (char)(var10004 | var19 << 6));
                  var17 += -1362491635 >>> 672085458 ^ 11187;
               }
            }

            var20 = var10003.charAt(var17);
            var18 = ((((var20 & '耀') >> 15 | var20 << 1) & '\uf000') >> 12 | ((var20 & '耀') >> 15 | var20 << 1) << 4) + 112 + 207 ^ 162;
            var10004 = (var18 & '\ufff0') >> 4;
            var19 = var18;
            var18 = var10004 | var18 << 12;
            var10004 = ((var10004 | var19 << 12) & '\ufff8') >> 3;
            var19 = var18;
            var18 = var10004 | var18 << 13;
            var10004 = ((var10004 | var19 << 13) & '\uf800') >> 11;
            var19 = var18;
            var18 = var10004 | var18 << 5;
            var10004 = ((var10004 | var19 << 5) & '￼') >> 2;
            var19 = var18;
            var18 = var10004 | var18 << 14;
            var10004 = ((var10004 | var19 << 14) & 'ﰀ') >> 10;
            var19 = var18;
            var20 = (char)(var10004 | var18 << 6);
            var14.setCharAt(var17, (char)(var10004 | var19 << 6));
            var17 += -1267322053 >>> -2085532162 ^ 3;
         }
      }

      if (!var11) {
         upb[(var10 + 1497126797 - 1698463854 + 2120602987 + 39030813 - 1354843935 ^ 1997637951) + 1767973297 + 1730456476 + 1876120317 ^ 1755665265] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
