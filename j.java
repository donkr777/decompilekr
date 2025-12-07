import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_1792;

public class j extends gb {
   public class_1792 mg;
   public class_1792 t;
   public static final MethodHandle[] plg = new MethodHandle[(1380492317 + 130442066 | 5) & -2142195705];
   transient String myMetaphor;

   public j(String var1, class_1792 var2) {
      super(var1);
      this.JNT<invokedynamic>(this, var2);
      this.JNT<invokedynamic>(this, var2);
   }

   public class_1792 p() {
      return this.JNT<invokedynamic>(this);
   }

   public void wk(class_1792 var1) {
      this.JNT<invokedynamic>(this, var1);
   }

   public class_1792 pr() {
      return this.JNT<invokedynamic>(this);
   }

   public void tk() {
      this.JNT<invokedynamic>(this, this.JNT<invokedynamic>(this));
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = plg[(((var10 ^ 880564909 ^ 2003172550 ^ 1545262532) + 1703921307 + 1749504838 ^ 1110679676) + 1741132982 ^ 1824844835) + 447319638 + 672324776];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = -2010961035 ^ 1796057102 ^ -483490949;

         label254:
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
               var17 = (-1283772546 ^ 1263282980 | 0) & 96473120;

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
                     Class var6 = Class.forName(var10003.toString(), false, j.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = (1206636783 >> (1206636783 ^ 1206636783) | 0) & 671089680;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), j.class.getClassLoader()).returnType();
                           switch(((var4 + 1276332914 - 200253108 + 1187718170 ^ 1936389605) - 789415757 ^ 19654609 ^ 178494817 ^ 30775845 ^ 1912542560) - 85933868) {
                           case 782212841:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label254;
                           case 1051246013:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label254;
                           case 1320484535:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label254;
                           case 1544747419:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label254;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var18 = var10003.charAt(var17) ^ 216;
                        var18 = ((((((((var18 & '\ue000') >> 13 | var18 << 3) + 135 & '耀') >> 15 | ((var18 & '\ue000') >> 13 | var18 << 3) + 135 << 1) & '￼') >> 2 | ((((var18 & '\ue000') >> 13 | var18 << 3) + 135 & '耀') >> 15 | ((var18 & '\ue000') >> 13 | var18 << 3) + 135 << 1) << 14) - 92 & '\uf000') >> 12 | ((((((var18 & '\ue000') >> 13 | var18 << 3) + 135 & '耀') >> 15 | ((var18 & '\ue000') >> 13 | var18 << 3) + 135 << 1) & '￼') >> 2 | ((((var18 & '\ue000') >> 13 | var18 << 3) + 135 & '耀') >> 15 | ((var18 & '\ue000') >> 13 | var18 << 3) + 135 << 1) << 14) - 92 << 4) - 177 + 150;
                        var10004 = (var18 & '￠') >> 5;
                        var19 = var18;
                        var20 = (char)(var10004 | var18 << 11);
                        var14.setCharAt(var17, (char)(var10004 | var19 << 11));
                        var17 += (160646724 * 1788728001 | 1) & -2002772423;
                     }
                  }

                  var20 = var10003.charAt(var17);
                  var10003.setCharAt(var17, (char)(((((((((((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) & '\ufff8') >> 3 | ((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) << 13) & '쀀') >> 14 | ((((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) & '\ufff8') >> 3 | ((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) << 13) << 2) & 'ﰀ') >> 10 | ((((((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) & '\ufff8') >> 3 | ((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) << 13) & '쀀') >> 14 | ((((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) & '\ufff8') >> 3 | ((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) << 13) << 2) << 6) & '\uf800') >> 11 | ((((((((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) & '\ufff8') >> 3 | ((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) << 13) & '쀀') >> 14 | ((((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) & '\ufff8') >> 3 | ((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) << 13) << 2) & 'ﰀ') >> 10 | ((((((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) & '\ufff8') >> 3 | ((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) << 13) & '쀀') >> 14 | ((((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) & '\ufff8') >> 3 | ((((var20 & '\ufff0') >> 4 | var20 << 12) - 124 & '\ufffe') >> 1 | ((var20 & '\ufff0') >> 4 | var20 << 12) - 124 << 15) << 13) << 2) << 6) << 5) - 238 ^ 84 ^ 161));
                  var17 += (-1311362001 + (-1311362001 >> -1311362001) | 0) & 103434273;
               }
            }

            var20 = var10003.charAt(var17);
            var18 = ((((((((((((var20 & '耀') >> 15 | var20 << 1) & '￠') >> 5 | ((var20 & '耀') >> 15 | var20 << 1) << 11) ^ 20) & '\ufff8') >> 3 | (((((var20 & '耀') >> 15 | var20 << 1) & '￠') >> 5 | ((var20 & '耀') >> 15 | var20 << 1) << 11) ^ 20) << 13) & 'ﰀ') >> 10 | (((((((var20 & '耀') >> 15 | var20 << 1) & '￠') >> 5 | ((var20 & '耀') >> 15 | var20 << 1) << 11) ^ 20) & '\ufff8') >> 3 | (((((var20 & '耀') >> 15 | var20 << 1) & '￠') >> 5 | ((var20 & '耀') >> 15 | var20 << 1) << 11) ^ 20) << 13) << 6) + 170 & 'ﾀ') >> 7 | (((((((((var20 & '耀') >> 15 | var20 << 1) & '￠') >> 5 | ((var20 & '耀') >> 15 | var20 << 1) << 11) ^ 20) & '\ufff8') >> 3 | (((((var20 & '耀') >> 15 | var20 << 1) & '￠') >> 5 | ((var20 & '耀') >> 15 | var20 << 1) << 11) ^ 20) << 13) & 'ﰀ') >> 10 | (((((((var20 & '耀') >> 15 | var20 << 1) & '￠') >> 5 | ((var20 & '耀') >> 15 | var20 << 1) << 11) ^ 20) & '\ufff8') >> 3 | (((((var20 & '耀') >> 15 | var20 << 1) & '￠') >> 5 | ((var20 & '耀') >> 15 | var20 << 1) << 11) ^ 20) << 13) << 6) + 170 << 9) ^ 20) + 55;
            var10004 = (var18 & 'ﾀ') >> 7;
            var19 = var18;
            var20 = (char)(var10004 | var18 << 9);
            var14.setCharAt(var17, (char)(var10004 | var19 << 9));
            var17 += 2080117799 * 2080117799 ^ 677256688;
         }
      }

      if (!var11) {
         plg[(((var10 ^ 880564909 ^ 2003172550 ^ 1545262532) + 1703921307 + 1749504838 ^ 1110679676) + 1741132982 ^ 1824844835) + 447319638 + 672324776] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
