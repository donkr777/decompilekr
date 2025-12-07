import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

// $FF: synthetic class
public class b {
   // $FF: synthetic field
   public static int[] zu;
   public static final MethodHandle[] thg;
   transient String myMetaphor;

   static {
      // $FF: Couldn't be decompiled
   }

   public static Object _/* $FF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = thg[(var10 - 1687072564 - 488633107 ^ 946435591 ^ 1148537470 ^ 35672653 ^ 672203477 ^ 1693929873 ^ 1614024691) - 646953079 ^ 1678406987];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var12 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var15 = var12;
         StringBuilder var13 = var10002;
         var10003.<init>(var15);
         int var16 = (866038246 | -1289753386 ^ -1289753386 | 0) & 1080115712;

         label204:
         while(true) {
            int var17 = var16;
            var10001 = var13;
            int var14 = var17;
            int var18 = var10001.length();
            var10002 = var10001;
            var16 = var18;
            var10003 = var10002;
            var17 = var16;
            var16 = var14;
            var13 = var10003;
            if (var16 >= var17) {
               String var5 = var10003.toString();
               var12 = (String)var3[2];
               var10001 = new StringBuilder;
               var10003 = var10001;
               var10002 = var10001;
               var15 = var12;
               var13 = var10002;
               var10003.<init>(var15);
               var16 = -195751189 ^ 1994178165 ^ -2104906594;

               while(true) {
                  var17 = var16;
                  var10001 = var13;
                  var14 = var17;
                  var18 = var10001.length();
                  var10002 = var10001;
                  var16 = var18;
                  var10003 = var10002;
                  var17 = var16;
                  var16 = var14;
                  var13 = var10003;
                  if (var16 >= var17) {
                     MethodType var6 = MethodType.fromMethodDescriptorString(var10003.toString(), b.class.getClassLoader());
                     var12 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var15 = var12;
                     var13 = var10002;
                     var10003.<init>(var15);
                     var16 = (1470249266 >> 481211758 | 0) & 2001502579;

                     while(true) {
                        var17 = var16;
                        var10001 = var13;
                        var14 = var17;
                        var18 = var10001.length();
                        var10002 = var10001;
                        var16 = var18;
                        var10003 = var10002;
                        var17 = var16;
                        var16 = var14;
                        var13 = var10003;
                        if (var16 >= var17) {
                           Class var7 = Class.forName(var10003.toString(), false, b.class.getClassLoader());
                           switch((var4 ^ 965650149 ^ 1516721801 ^ 123499650 ^ 120413927) - 1155653463 - 1360647381 + 949751286 + 823177999 - 1071383073 ^ 1653554251) {
                           case 228434220:
                           case 892762990:
                              var10000 = var0.findVirtual(var7, var5, var6);
                              break label204;
                           case 884398687:
                              var10000 = var0.findStatic(var7, var5, var6);
                              break label204;
                           case 1517069505:
                              var10000 = var0.findSpecial(var7, var5, var6, b.class);
                              break label204;
                           case 1765596360:
                              var10000 = var0.findConstructor(var7, var6);
                              break label204;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        char var19 = var10003.charAt(var16);
                        var17 = (((((var19 & '￼') >> 2 | var19 << 14) ^ 149) & '\uffc0') >> 6 | (((var19 & '￼') >> 2 | var19 << 14) ^ 149) << 10) + 31 + 148 + 93 + 238 + 10 ^ 190;
                        int var10004 = (var17 & '\uffff') >> 0;
                        var18 = var17;
                        var19 = (char)(var10004 | var17 << 16);
                        var13.setCharAt(var16, (char)(var10004 | var18 << 16));
                        var16 += -2061627236 << -782096092 ^ 1373702593;
                     }
                  }

                  var17 = var10003.charAt(var16) ^ 184;
                  var10003.setCharAt(var16, (char)((((((((((var17 & '\uffc0') >> 6 | var17 << 10) ^ 137 ^ 15) & '쀀') >> 14 | (((var17 & '\uffc0') >> 6 | var17 << 10) ^ 137 ^ 15) << 2) & 'ﾀ') >> 7 | (((((var17 & '\uffc0') >> 6 | var17 << 10) ^ 137 ^ 15) & '쀀') >> 14 | (((var17 & '\uffc0') >> 6 | var17 << 10) ^ 137 ^ 15) << 2) << 9) - 89 & '\ufff0') >> 4 | (((((((var17 & '\uffc0') >> 6 | var17 << 10) ^ 137 ^ 15) & '쀀') >> 14 | (((var17 & '\uffc0') >> 6 | var17 << 10) ^ 137 ^ 15) << 2) & 'ﾀ') >> 7 | (((((var17 & '\uffc0') >> 6 | var17 << 10) ^ 137 ^ 15) & '쀀') >> 14 | (((var17 & '\uffc0') >> 6 | var17 << 10) ^ 137 ^ 15) << 2) << 9) - 89 << 12) + 12 ^ 166));
                  var16 += (-993811568 & -993811568 | 1) & 974668833;
               }
            }

            var17 = var10003.charAt(var16) + 157;
            var10003.setCharAt(var16, (char)((((((((((((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) & 0) >> 16 | ((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) << 0) ^ 31) & '\uffc0') >> 6 | (((((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) & 0) >> 16 | ((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) << 0) ^ 31) << 10) & '\uffc0') >> 6 | (((((((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) & 0) >> 16 | ((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) << 0) ^ 31) & '\uffc0') >> 6 | (((((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) & 0) >> 16 | ((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) << 0) ^ 31) << 10) << 10) + 57 & 'ﾀ') >> 7 | (((((((((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) & 0) >> 16 | ((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) << 0) ^ 31) & '\uffc0') >> 6 | (((((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) & 0) >> 16 | ((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) << 0) ^ 31) << 10) & '\uffc0') >> 6 | (((((((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) & 0) >> 16 | ((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) << 0) ^ 31) & '\uffc0') >> 6 | (((((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) & 0) >> 16 | ((((var17 & '\uffc0') >> 6 | var17 << 10) & '\ue000') >> 13 | ((var17 & '\uffc0') >> 6 | var17 << 10) << 3) << 0) ^ 31) << 10) << 10) + 57 << 9) ^ 178));
            var16 += -1764580459 ^ -1555445766 ^ 899376238;
         }
      }

      thg[(var10 - 1687072564 - 488633107 ^ 946435591 ^ 1148537470 ^ 35672653 ^ 672203477 ^ 1693929873 ^ 1614024691) - 646953079 ^ 1678406987] = var10000;
      MethodHandle var11 = var10000.asType(var2);
      return new MutableCallSite(var11);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = thg[(((var10 - 245689177 ^ 1012812675) + 1007010903 ^ 189364448) + 114711545 - 147968131 - 1608503738 ^ 366777969) + 558671926 - 1904824474];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = -1400875839 ^ -2144441491 & 526563484 ^ -1398637363;

         label232:
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
               var17 = 100874906 + 1396844163 ^ 1497719069;

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
                  int var10004;
                  char var20;
                  if (var17 >= var18) {
                     Class var6 = Class.forName(var10003.toString(), false, b.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = (-1580858230 ^ -1723264179 | 0) & 1180723200;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), b.class.getClassLoader()).returnType();
                           switch(((var4 ^ 381677989) - 1853480892 + 758328470 ^ 1074269308 ^ 237430690) + 472695136 + 1427508101 + 160385666 - 1619211193 ^ 1774339786) {
                           case 399129368:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label232;
                           case 1116585047:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label232;
                           case 1450984636:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label232;
                           case 1916811916:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label232;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var18 = var10003.charAt(var17) ^ 69;
                        var18 = (((((((((((var18 & '耀') >> 15 | var18 << 1) & '︀') >> 9 | ((var18 & '耀') >> 15 | var18 << 1) << 7) ^ 218) & '\ufffe') >> 1 | (((((var18 & '耀') >> 15 | var18 << 1) & '︀') >> 9 | ((var18 & '耀') >> 15 | var18 << 1) << 7) ^ 218) << 15) & '耀') >> 15 | (((((((var18 & '耀') >> 15 | var18 << 1) & '︀') >> 9 | ((var18 & '耀') >> 15 | var18 << 1) << 7) ^ 218) & '\ufffe') >> 1 | (((((var18 & '耀') >> 15 | var18 << 1) & '︀') >> 9 | ((var18 & '耀') >> 15 | var18 << 1) << 7) ^ 218) << 15) << 1) - 210 & '\uffff') >> 0 | (((((((((var18 & '耀') >> 15 | var18 << 1) & '︀') >> 9 | ((var18 & '耀') >> 15 | var18 << 1) << 7) ^ 218) & '\ufffe') >> 1 | (((((var18 & '耀') >> 15 | var18 << 1) & '︀') >> 9 | ((var18 & '耀') >> 15 | var18 << 1) << 7) ^ 218) << 15) & '耀') >> 15 | (((((((var18 & '耀') >> 15 | var18 << 1) & '︀') >> 9 | ((var18 & '耀') >> 15 | var18 << 1) << 7) ^ 218) & '\ufffe') >> 1 | (((((var18 & '耀') >> 15 | var18 << 1) & '︀') >> 9 | ((var18 & '耀') >> 15 | var18 << 1) << 7) ^ 218) << 15) << 1) - 210 << 16) - 173;
                        var10004 = (var18 & '\uffc0') >> 6;
                        var19 = var18;
                        var20 = (char)(var10004 | var18 << 10);
                        var14.setCharAt(var17, (char)(var10004 | var19 << 10));
                        var17 += 1415823702 * 1604417051 ^ 1656293395;
                     }
                  }

                  var18 = var10003.charAt(var17) + 169;
                  var18 = (((((((((var18 & 'ﰀ') >> 10 | var18 << 6) & '\uffc0') >> 6 | ((var18 & 'ﰀ') >> 10 | var18 << 6) << 10) ^ 84) & '耀') >> 15 | (((((var18 & 'ﰀ') >> 10 | var18 << 6) & '\uffc0') >> 6 | ((var18 & 'ﰀ') >> 10 | var18 << 6) << 10) ^ 84) << 1) - 248 & '￼') >> 2 | (((((((var18 & 'ﰀ') >> 10 | var18 << 6) & '\uffc0') >> 6 | ((var18 & 'ﰀ') >> 10 | var18 << 6) << 10) ^ 84) & '耀') >> 15 | (((((var18 & 'ﰀ') >> 10 | var18 << 6) & '\uffc0') >> 6 | ((var18 & 'ﰀ') >> 10 | var18 << 6) << 10) ^ 84) << 1) - 248 << 14) - 51;
                  var10004 = (var18 & '\ufff0') >> 4;
                  var19 = var18;
                  var18 = var10004 | var18 << 12;
                  var10004 = ((var10004 | var19 << 12) & '\ue000') >> 13;
                  var19 = var18;
                  var20 = (char)(var10004 | var18 << 3);
                  var14.setCharAt(var17, (char)(var10004 | var19 << 3));
                  var17 += -627589345 >>> -627589345 + 739929862 ^ 114605561;
               }
            }

            var18 = var10003.charAt(var17) + 125 + 231 ^ 233;
            var10003.setCharAt(var17, (char)((((((var18 & '￠') >> 5 | var18 << 11) - 79 + 218 + 139 ^ 132) & 'ﰀ') >> 10 | (((var18 & '￠') >> 5 | var18 << 11) - 79 + 218 + 139 ^ 132) << 6) - 185));
            var17 += (561146340 * -885095885 | 1) & 1124473985;
         }
      }

      if (!var11) {
         thg[(((var10 - 245689177 ^ 1012812675) + 1007010903 ^ 189364448) + 114711545 - 147968131 - 1608503738 ^ 366777969) + 558671926 - 1904824474] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
