import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

// $FF: synthetic class
public class ok {
   // $FF: synthetic field
   public static int[] dqk;
   public static final MethodHandle[] odr;
   transient String myMetaphor;

   static {
      // $FF: Couldn't be decompiled
   }

   public static Object _/* $FF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = odr[(var10 + 125903002 ^ 278469410 ^ 354074437) - 1072138472 - 744588763 - 787593799 - 1214992931 + 1114349751 - 882268636 + 1510367563];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var12 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var15 = var12;
         StringBuilder var13 = var10002;
         var10003.<init>(var15);
         int var16 = (-241799273 << 928368515 | 0) & 856195138;

         label228:
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
               var16 = -677982581 >>> (1774095855 ^ 1774095855) ^ -677982581;

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
                  char var19;
                  if (var16 >= var17) {
                     MethodType var6 = MethodType.fromMethodDescriptorString(var10003.toString(), ok.class.getClassLoader());
                     var12 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var15 = var12;
                     var13 = var10002;
                     var10003.<init>(var15);
                     var16 = 444776935 + -2119169508 ^ -1674392573;

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
                           Class var7 = Class.forName(var10003.toString(), false, ok.class.getClassLoader());
                           switch(((var4 - 2034788343 - 540252744 ^ 831900629) + 356760271 + 1322883638 - 1109243637 ^ 1695798260) + 1403198989 + 1605281851 - 1692281915) {
                           case 544955635:
                              var10000 = var0.findConstructor(var7, var6);
                              break label228;
                           case 1573683094:
                              var10000 = var0.findSpecial(var7, var5, var6, ok.class);
                              break label228;
                           case 1653384285:
                           case 2017049937:
                              var10000 = var0.findVirtual(var7, var5, var6);
                              break label228;
                           case 1860811274:
                              var10000 = var0.findStatic(var7, var5, var6);
                              break label228;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var17 = ((var10003.charAt(var16) ^ 113) - 154 ^ 70 ^ 83) + 105;
                        var17 = ((((var17 & '\uffff') >> 0 | var17 << 16) + 8 & '\uf800') >> 11 | ((var17 & '\uffff') >> 0 | var17 << 16) + 8 << 5) ^ 131;
                        int var10004 = (var17 & 'ﾀ') >> 7;
                        var18 = var17;
                        var19 = (char)(var10004 | var17 << 9);
                        var13.setCharAt(var16, (char)(var10004 | var18 << 9));
                        var16 += (1488658353 >> -1757721317 | 0) & 1028331669;
                     }
                  }

                  var19 = var10003.charAt(var16);
                  var10003.setCharAt(var16, (char)((((((((((var19 & '\ufff0') >> 4 | var19 << 12) - 104 ^ 149) & '￠') >> 5 | (((var19 & '\ufff0') >> 4 | var19 << 12) - 104 ^ 149) << 11) - 179 - 54 - 56 & 'ﰀ') >> 10 | (((((var19 & '\ufff0') >> 4 | var19 << 12) - 104 ^ 149) & '￠') >> 5 | (((var19 & '\ufff0') >> 4 | var19 << 12) - 104 ^ 149) << 11) - 179 - 54 - 56 << 6) & '￼') >> 2 | (((((((var19 & '\ufff0') >> 4 | var19 << 12) - 104 ^ 149) & '￠') >> 5 | (((var19 & '\ufff0') >> 4 | var19 << 12) - 104 ^ 149) << 11) - 179 - 54 - 56 & 'ﰀ') >> 10 | (((((var19 & '\ufff0') >> 4 | var19 << 12) - 104 ^ 149) & '￠') >> 5 | (((var19 & '\ufff0') >> 4 | var19 << 12) - 104 ^ 149) << 11) - 179 - 54 - 56 << 6) << 14) ^ 26));
                  var16 += (899710930 - -142825389 | 1) & -2116288383;
               }
            }

            var17 = var10003.charAt(var16) - 142 - 234 ^ 130;
            var10003.setCharAt(var16, (char)((((var17 & '\uf800') >> 11 | var17 << 5) + 53 - 207 + 183 + 247 ^ 85) - 9));
            var16 += 139265724 >>> 768488009 ^ 272002;
         }
      }

      odr[(var10 + 125903002 ^ 278469410 ^ 354074437) - 1072138472 - 744588763 - 787593799 - 1214992931 + 1114349751 - 882268636 + 1510367563] = var10000;
      MethodHandle var11 = var10000.asType(var2);
      return new MutableCallSite(var11);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = odr[((var10 - 2071316884 - 1650581614 - 980455720 ^ 645263886) + 377555992 ^ 1016855624 ^ 1137193032) - 559782910 + 2029640199 - 83682765];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = (943396784 ^ 943396784 | 0) & -1613071266;

         label245:
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
               var17 = (-1125538526 * 915150332 | 0) & 605620227;

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
                     Class var6 = Class.forName(var10003.toString(), false, ok.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = 1417634318 + 1865505992 * (1417634318 >> 1865505992) ^ -737403234;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), ok.class.getClassLoader()).returnType();
                           switch((var4 + 74240898 + 1544149059 + 608851404 - 197611980 + 1022929559 - 1083985187 ^ 1797253916) + 2106112289 + 1094471829 - 1725971293) {
                           case 181688941:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label245;
                           case 202274346:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label245;
                           case 1025395629:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label245;
                           case 1760868663:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label245;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var18 = (var10003.charAt(var17) ^ 159) + 183 + 60;
                        var18 = ((((((((var18 & '\uf800') >> 11 | var18 << 5) & '\ufff0') >> 4 | ((var18 & '\uf800') >> 11 | var18 << 5) << 12) & 0) >> 16 | ((((var18 & '\uf800') >> 11 | var18 << 5) & '\ufff0') >> 4 | ((var18 & '\uf800') >> 11 | var18 << 5) << 12) << 0) & '\ufff0') >> 4 | ((((((var18 & '\uf800') >> 11 | var18 << 5) & '\ufff0') >> 4 | ((var18 & '\uf800') >> 11 | var18 << 5) << 12) & 0) >> 16 | ((((var18 & '\uf800') >> 11 | var18 << 5) & '\ufff0') >> 4 | ((var18 & '\uf800') >> 11 | var18 << 5) << 12) << 0) << 12) ^ 44;
                        int var10004 = (var18 & '\ufffe') >> 1;
                        var19 = var18;
                        var18 = var10004 | var18 << 15;
                        var10004 = ((var10004 | var19 << 15) & '\uffc0') >> 6;
                        var19 = var18;
                        var20 = (char)(var10004 | var18 << 10);
                        var14.setCharAt(var17, (char)(var10004 | var19 << 10));
                        var17 += (561615781 - 561615781 | 1) & 1996550475;
                     }
                  }

                  var20 = var10003.charAt(var17);
                  var10003.setCharAt(var17, (char)((((((var20 & '\ufffe') >> 1 | var20 << 15) + 119 ^ 1 ^ 132) - 3 - 184 & 'ﾀ') >> 7 | (((var20 & '\ufffe') >> 1 | var20 << 15) + 119 ^ 1 ^ 132) - 3 - 184 << 9) - 72 + 82 ^ 157));
                  var17 += (-1733220091 | -1269206603 | 1) & 1074136129;
               }
            }

            var18 = (var10003.charAt(var17) ^ 166 ^ 226) + 12;
            var10003.setCharAt(var17, (char)(((((((((((var18 & '\uffff') >> 0 | var18 << 16) ^ 14) & 'ﰀ') >> 10 | (((var18 & '\uffff') >> 0 | var18 << 16) ^ 14) << 6) & '\ufff8') >> 3 | (((((var18 & '\uffff') >> 0 | var18 << 16) ^ 14) & 'ﰀ') >> 10 | (((var18 & '\uffff') >> 0 | var18 << 16) ^ 14) << 6) << 13) & 'ﾀ') >> 7 | (((((((var18 & '\uffff') >> 0 | var18 << 16) ^ 14) & 'ﰀ') >> 10 | (((var18 & '\uffff') >> 0 | var18 << 16) ^ 14) << 6) & '\ufff8') >> 3 | (((((var18 & '\uffff') >> 0 | var18 << 16) ^ 14) & 'ﰀ') >> 10 | (((var18 & '\uffff') >> 0 | var18 << 16) ^ 14) << 6) << 13) << 9) ^ 120) - 90));
            var17 += (-1191942014 + -32716770 * -679562128 | 1) & 35790921;
         }
      }

      if (!var11) {
         odr[((var10 - 2071316884 - 1650581614 - 980455720 ^ 645263886) + 377555992 ^ 1016855624 ^ 1137193032) - 559782910 + 2029640199 - 83682765] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
