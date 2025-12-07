import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_4587;

public class oe implements dj {
   public class_4587 wdg;
   public ab wel;
   public float wjk;
   public double fa;
   public double lg;
   public double ul;
   public static final MethodHandle[] miv = new MethodHandle[(1012358812 >> 1012358812 | 6) & -818887074];
   transient String myMetaphor;

   public oe(class_4587 var1, ab var2, float var3, double var4, double var6, double var8) {
      this.JNT<invokedynamic>(this, var1);
      this.JNT<invokedynamic>(this, var2);
      this.JNT<invokedynamic>(this, var3);
      this.JNT<invokedynamic>(this, var4);
      this.JNT<invokedynamic>(this, var6);
      this.JNT<invokedynamic>(this, var8);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = miv[((var10 ^ 589610636) - 312516880 - 1316786525 - 1995752741 + 720954196 - 1605443608 + 1433496311 ^ 1297421321) + 1574302842 - 1957602411];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = 2122526339 << (-2030333531 << -2030333531) ^ 2122526339;

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
            int var10004;
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
               var17 = (-2100109241 | -1069159021) ^ -1026036265;

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
                     Class var6 = Class.forName(var10003.toString(), false, oe.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = 872819808 << -1325084449 ^ 0;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), oe.class.getClassLoader()).returnType();
                           switch((((var4 ^ 1617023895) + 1806923962 - 825750309 - 2134231993 - 670176611 ^ 634129610) + 782337790 - 744694369 ^ 1357299832) + 1657591214) {
                           case 134916957:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label241;
                           case 1522092962:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label241;
                           case 1998406791:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label241;
                           case 2002386991:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label241;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var18 = var10003.charAt(var17) ^ 67;
                        var10003.setCharAt(var17, (char)((((((((((((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) & '\ue000') >> 13 | ((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) << 3) & '\ufff0') >> 4 | ((((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) & '\ue000') >> 13 | ((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) << 3) << 12) & 'ﰀ') >> 10 | ((((((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) & '\ue000') >> 13 | ((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) << 3) & '\ufff0') >> 4 | ((((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) & '\ue000') >> 13 | ((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) << 3) << 12) << 6) + 150 ^ 119) & '￠') >> 5 | (((((((((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) & '\ue000') >> 13 | ((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) << 3) & '\ufff0') >> 4 | ((((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) & '\ue000') >> 13 | ((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) << 3) << 12) & 'ﰀ') >> 10 | ((((((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) & '\ue000') >> 13 | ((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) << 3) & '\ufff0') >> 4 | ((((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) & '\ue000') >> 13 | ((((var18 & '耀') >> 15 | var18 << 1) & 0) >> 16 | ((var18 & '耀') >> 15 | var18 << 1) << 0) << 3) << 12) << 6) + 150 ^ 119) << 11) + 21));
                        var17 += (816509386 | -1263268503 | 0) & 20971521;
                     }
                  }

                  var18 = var10003.charAt(var17) + 77 - 218 + 161 ^ 205;
                  var18 = ((((var18 & '쀀') >> 14 | var18 << 2) & '\ufff8') >> 3 | ((var18 & '쀀') >> 14 | var18 << 2) << 13) - 110 - 209 - 150;
                  var10004 = (var18 & '\ufffe') >> 1;
                  var19 = var18;
                  var20 = (char)(var10004 | var18 << 15);
                  var14.setCharAt(var17, (char)(var10004 | var19 << 15));
                  var17 += (-18304351 | -962658556 | 1) & 25;
               }
            }

            var20 = var10003.charAt(var17);
            var18 = ((((var20 & '\ue000') >> 13 | var20 << 3) + 40 - 167 - 77 ^ 166) + 130 ^ 26 ^ 212) - 213;
            var10004 = (var18 & '\ufffe') >> 1;
            var19 = var18;
            var20 = (char)(var10004 | var18 << 15);
            var14.setCharAt(var17, (char)(var10004 | var19 << 15));
            var17 += (-1935792467 - 683864032 | 1) & 470073601;
         }
      }

      if (!var11) {
         miv[((var10 ^ 589610636) - 312516880 - 1316786525 - 1995752741 + 720954196 - 1605443608 + 1433496311 ^ 1297421321) + 1574302842 - 1957602411] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
