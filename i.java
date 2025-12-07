import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

// $FF: synthetic class
public class i {
   // $FF: synthetic field
   public static int[] zu;
   public static final MethodHandle[] fbj;
   transient String myMetaphor;

   static {
      // $FF: Couldn't be decompiled
   }

   public static Object _/* $FF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = fbj[((var10 - 812437159 ^ 1420661855) + 2049217437 - 927873810 + 1335910277 + 1593049244 - 46199198 - 1704007095 ^ 348831127) - 1477545890];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var12 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var15 = var12;
         StringBuilder var13 = var10002;
         var10003.<init>(var15);
         int var16 = (-347013026 * -347013026 | 0) & 268619089;

         label242:
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
            char var19;
            int var10004;
            if (var16 >= var17) {
               String var5 = var10003.toString();
               var12 = (String)var3[2];
               var10001 = new StringBuilder;
               var10003 = var10001;
               var10002 = var10001;
               var15 = var12;
               var13 = var10002;
               var10003.<init>(var15);
               var16 = -398910146 & -1414742973 >>> -1414742973 ^ 3216648;

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
                     MethodType var6 = MethodType.fromMethodDescriptorString(var10003.toString(), i.class.getClassLoader());
                     var12 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var15 = var12;
                     var13 = var10002;
                     var10003.<init>(var15);
                     var16 = (-1666160978 ^ 174525879 | 0) & 562210;

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
                           Class var7 = Class.forName(var10003.toString(), false, i.class.getClassLoader());
                           switch((var4 + 156533379 + 959948897 + 422798382 + 1084336280 ^ 106220505 ^ 1445466141) - 1661890487 ^ 1616247773 ^ 1352015495 ^ 1053809040) {
                           case 63152669:
                              var10000 = var0.findStatic(var7, var5, var6);
                              break label242;
                           case 133901286:
                           case 401864173:
                              var10000 = var0.findVirtual(var7, var5, var6);
                              break label242;
                           case 1884848142:
                              var10000 = var0.findConstructor(var7, var6);
                              break label242;
                           case 2034196513:
                              var10000 = var0.findSpecial(var7, var5, var6, i.class);
                              break label242;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var17 = var10003.charAt(var16) ^ 77;
                        var17 = (((((var17 & '쀀') >> 14 | var17 << 2) & '￠') >> 5 | ((var17 & '쀀') >> 14 | var17 << 2) << 11) ^ 87 ^ 236 ^ 30 ^ 107) - 51;
                        var10004 = (var17 & '\uffff') >> 0;
                        var18 = var17;
                        var17 = var10004 | var17 << 16;
                        var10004 = ((var10004 | var18 << 16) & '￼') >> 2;
                        var18 = var17;
                        var19 = (char)(var10004 | var17 << 14);
                        var13.setCharAt(var16, (char)(var10004 | var18 << 14));
                        var16 += 935561078 + 898846931 ^ 1834408008;
                     }
                  }

                  var17 = var10003.charAt(var16) + 171 - 226;
                  var10003.setCharAt(var16, (char)(((((((((var17 & '\ufff8') >> 3 | var17 << 13) + 204 + 251 & 0) >> 16 | ((var17 & '\ufff8') >> 3 | var17 << 13) + 204 + 251 << 0) & '\uf800') >> 11 | ((((var17 & '\ufff8') >> 3 | var17 << 13) + 204 + 251 & 0) >> 16 | ((var17 & '\ufff8') >> 3 | var17 << 13) + 204 + 251 << 0) << 5) & 0) >> 16 | ((((((var17 & '\ufff8') >> 3 | var17 << 13) + 204 + 251 & 0) >> 16 | ((var17 & '\ufff8') >> 3 | var17 << 13) + 204 + 251 << 0) & '\uf800') >> 11 | ((((var17 & '\ufff8') >> 3 | var17 << 13) + 204 + 251 & 0) >> 16 | ((var17 & '\ufff8') >> 3 | var17 << 13) + 204 + 251 << 0) << 5) << 0) ^ 156 ^ 160));
                  var16 += (1792172950 | 1792172950 ^ 1792172950 | 1) & -2079521687;
               }
            }

            var17 = var10003.charAt(var16) + 187 + 218 - 28 - 247;
            var17 = ((((((var17 & '￼') >> 2 | var17 << 14) & 'ﰀ') >> 10 | ((var17 & '￼') >> 2 | var17 << 14) << 6) & 'ﰀ') >> 10 | ((((var17 & '￼') >> 2 | var17 << 14) & 'ﰀ') >> 10 | ((var17 & '￼') >> 2 | var17 << 14) << 6) << 6) ^ 159;
            var10004 = (var17 & '￼') >> 2;
            var18 = var17;
            var17 = var10004 | var17 << 14;
            var10004 = ((var10004 | var18 << 14) & '￼') >> 2;
            var18 = var17;
            var19 = (char)(var10004 | var17 << 14);
            var13.setCharAt(var16, (char)(var10004 | var18 << 14));
            var16 += (-2010390529 | -1590386024 | 0) & 1409286145;
         }
      }

      fbj[((var10 - 812437159 ^ 1420661855) + 2049217437 - 927873810 + 1335910277 + 1593049244 - 46199198 - 1704007095 ^ 348831127) - 1477545890] = var10000;
      MethodHandle var11 = var10000.asType(var2);
      return new MutableCallSite(var11);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = fbj[(((var10 ^ 1554136970) + 709433703 ^ 326830794 ^ 1764106137) - 1071249216 ^ 1182179433 ^ 1748606727) + 567856430 + 1042329171 + 1657722884];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = (1310965342 * 1310965342 | 0) & 479728977;

         label266:
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
               var17 = 603051789 >> 603051789 ^ 73614;

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
                     Class var6 = Class.forName(var10003.toString(), false, i.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = -399703480 + -371574893 ^ -771278373;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), i.class.getClassLoader()).returnType();
                           switch(var4 - 966775825 + 1868111819 - 1463425327 - 1436669109 + 1533847112 - 178252793 + 1251718902 - 549023945 ^ 309977434 ^ 404656107) {
                           case 854546689:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label266;
                           case 1101977479:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label266;
                           case 1186945778:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label266;
                           case 1838773765:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label266;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var18 = var10003.charAt(var17) - 72 + 103 - 14;
                        var18 = ((((var18 & '\ufff8') >> 3 | var18 << 13) - 178 & 'ﰀ') >> 10 | ((var18 & '\ufff8') >> 3 | var18 << 13) - 178 << 6) + 235 + 228 + 83;
                        int var10004 = (var18 & 'ﰀ') >> 10;
                        var19 = var18;
                        var20 = (char)(var10004 | var18 << 6);
                        var14.setCharAt(var17, (char)(var10004 | var19 << 6));
                        var17 += (-1457946600 & 993494829 | 1) & -1796590043;
                     }
                  }

                  var20 = var10003.charAt(var17);
                  var10003.setCharAt(var17, (char)(((((((((((var20 & '︀') >> 9 | var20 << 7) & '\uffc0') >> 6 | ((var20 & '︀') >> 9 | var20 << 7) << 10) - 96 + 57 & '\ufff0') >> 4 | ((((var20 & '︀') >> 9 | var20 << 7) & '\uffc0') >> 6 | ((var20 & '︀') >> 9 | var20 << 7) << 10) - 96 + 57 << 12) & '\ufff8') >> 3 | ((((((var20 & '︀') >> 9 | var20 << 7) & '\uffc0') >> 6 | ((var20 & '︀') >> 9 | var20 << 7) << 10) - 96 + 57 & '\ufff0') >> 4 | ((((var20 & '︀') >> 9 | var20 << 7) & '\uffc0') >> 6 | ((var20 & '︀') >> 9 | var20 << 7) << 10) - 96 + 57 << 12) << 13) & '\uf800') >> 11 | ((((((((var20 & '︀') >> 9 | var20 << 7) & '\uffc0') >> 6 | ((var20 & '︀') >> 9 | var20 << 7) << 10) - 96 + 57 & '\ufff0') >> 4 | ((((var20 & '︀') >> 9 | var20 << 7) & '\uffc0') >> 6 | ((var20 & '︀') >> 9 | var20 << 7) << 10) - 96 + 57 << 12) & '\ufff8') >> 3 | ((((((var20 & '︀') >> 9 | var20 << 7) & '\uffc0') >> 6 | ((var20 & '︀') >> 9 | var20 << 7) << 10) - 96 + 57 & '\ufff0') >> 4 | ((((var20 & '︀') >> 9 | var20 << 7) & '\uffc0') >> 6 | ((var20 & '︀') >> 9 | var20 << 7) << 10) - 96 + 57 << 12) << 13) << 5) - 163 + 213 + 135));
                  var17 += 426318930 - 426318930 ^ 1;
               }
            }

            var18 = var10003.charAt(var17) + 192;
            var10003.setCharAt(var17, (char)(((((((((((var18 & '￼') >> 2 | var18 << 14) ^ 155) + 231 & 0) >> 16 | (((var18 & '￼') >> 2 | var18 << 14) ^ 155) + 231 << 0) ^ 99) - 119 & 0) >> 16 | ((((((var18 & '￼') >> 2 | var18 << 14) ^ 155) + 231 & 0) >> 16 | (((var18 & '￼') >> 2 | var18 << 14) ^ 155) + 231 << 0) ^ 99) - 119 << 0) & '\ufff8') >> 3 | ((((((((var18 & '￼') >> 2 | var18 << 14) ^ 155) + 231 & 0) >> 16 | (((var18 & '￼') >> 2 | var18 << 14) ^ 155) + 231 << 0) ^ 99) - 119 & 0) >> 16 | ((((((var18 & '￼') >> 2 | var18 << 14) ^ 155) + 231 & 0) >> 16 | (((var18 & '￼') >> 2 | var18 << 14) ^ 155) + 231 << 0) ^ 99) - 119 << 0) << 13) + 135));
            var17 += -1936731489 - -824792133 ^ -1111939355;
         }
      }

      if (!var11) {
         fbj[(((var10 ^ 1554136970) + 709433703 ^ 326830794 ^ 1764106137) - 1071249216 ^ 1182179433 ^ 1748606727) + 567856430 + 1042329171 + 1657722884] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
