import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

// $FF: synthetic class
public class bu {
   // $FF: synthetic field
   public static int[] fh;
   public static final MethodHandle[] abo;
   transient String myMetaphor;

   static {
      // $FF: Couldn't be decompiled
   }

   public static Object _/* $FF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = abo[((var10 ^ 1039579223 ^ 528681695 ^ 1579815352 ^ 196162292 ^ 504198903) - 859473954 ^ 491177078) + 750603754 + 242214187 ^ 1828690548];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var12 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var15 = var12;
         StringBuilder var13 = var10002;
         var10003.<init>(var15);
         int var16 = 1245595154 ^ 1523723005 ^ 283929839;

         label237:
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
            if (var16 >= var17) {
               String var5 = var10003.toString();
               var12 = (String)var3[2];
               var10001 = new StringBuilder;
               var10003 = var10001;
               var10002 = var10001;
               var15 = var12;
               var13 = var10002;
               var10003.<init>(var15);
               var16 = (-1829025585 >> -368339418 | 0) & 8389188;

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
                     MethodType var6 = MethodType.fromMethodDescriptorString(var10003.toString(), bu.class.getClassLoader());
                     var12 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var15 = var12;
                     var13 = var10002;
                     var10003.<init>(var15);
                     var16 = (1957752335 | 1632131668 | 0) & 134610944;

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
                           Class var7 = Class.forName(var10003.toString(), false, bu.class.getClassLoader());
                           switch((var4 ^ 1934330897 ^ 669684382) + 1841372946 - 912565764 + 1367007094 + 1379722191 + 1137454623 + 587891090 - 534141787 - 1785379726) {
                           case 194761073:
                           case 1529261339:
                              var10000 = var0.findVirtual(var7, var5, var6);
                              break label237;
                           case 296883589:
                              var10000 = var0.findStatic(var7, var5, var6);
                              break label237;
                           case 446690973:
                              var10000 = var0.findConstructor(var7, var6);
                              break label237;
                           case 1081709852:
                              var10000 = var0.findSpecial(var7, var5, var6, bu.class);
                              break label237;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var17 = var10003.charAt(var16) ^ 132 ^ 73;
                        var10003.setCharAt(var16, (char)((((((((var17 & '￠') >> 5 | var17 << 11) - 6 + 70 & '\ufff0') >> 4 | ((var17 & '￠') >> 5 | var17 << 11) - 6 + 70 << 12) ^ 119) & '￼') >> 2 | (((((var17 & '￠') >> 5 | var17 << 11) - 6 + 70 & '\ufff0') >> 4 | ((var17 & '￠') >> 5 | var17 << 11) - 6 + 70 << 12) ^ 119) << 14) - 14 ^ 243));
                        var16 += 383999529 >>> (383999529 | 1244575263) ^ 1;
                     }
                  }

                  var17 = (var10003.charAt(var16) ^ 207) - 13;
                  var17 = (((((((((var17 & 0) >> 16 | var17 << 0) & '\ufffe') >> 1 | ((var17 & 0) >> 16 | var17 << 0) << 15) ^ 136) - 150 & '\uffff') >> 0 | (((((var17 & 0) >> 16 | var17 << 0) & '\ufffe') >> 1 | ((var17 & 0) >> 16 | var17 << 0) << 15) ^ 136) - 150 << 16) & '\uffc0') >> 6 | (((((((var17 & 0) >> 16 | var17 << 0) & '\ufffe') >> 1 | ((var17 & 0) >> 16 | var17 << 0) << 15) ^ 136) - 150 & '\uffff') >> 0 | (((((var17 & 0) >> 16 | var17 << 0) & '\ufffe') >> 1 | ((var17 & 0) >> 16 | var17 << 0) << 15) ^ 136) - 150 << 16) << 10) + 170;
                  int var10004 = (var17 & '\uffff') >> 0;
                  var18 = var17;
                  var19 = (char)(var10004 | var17 << 16);
                  var13.setCharAt(var16, (char)(var10004 | var18 << 16));
                  var16 += (-1497631269 + 1314951946 | 0) & 35808777;
               }
            }

            var19 = var10003.charAt(var16);
            var10003.setCharAt(var16, (char)((((((((((((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) & 'ﰀ') >> 10 | ((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) << 6) + 230 ^ 83 ^ 36) & 0) >> 16 | (((((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) & 'ﰀ') >> 10 | ((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) << 6) + 230 ^ 83 ^ 36) << 0) & '￠') >> 5 | (((((((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) & 'ﰀ') >> 10 | ((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) << 6) + 230 ^ 83 ^ 36) & 0) >> 16 | (((((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) & 'ﰀ') >> 10 | ((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) << 6) + 230 ^ 83 ^ 36) << 0) << 11) & '\ufff8') >> 3 | (((((((((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) & 'ﰀ') >> 10 | ((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) << 6) + 230 ^ 83 ^ 36) & 0) >> 16 | (((((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) & 'ﰀ') >> 10 | ((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) << 6) + 230 ^ 83 ^ 36) << 0) & '￠') >> 5 | (((((((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) & 'ﰀ') >> 10 | ((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) << 6) + 230 ^ 83 ^ 36) & 0) >> 16 | (((((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) & 'ﰀ') >> 10 | ((((var19 & '︀') >> 9 | var19 << 7) & 0) >> 16 | ((var19 & '︀') >> 9 | var19 << 7) << 0) << 6) + 230 ^ 83 ^ 36) << 0) << 11) << 13) + 108));
            var16 += (22863787 >>> 1428912625 | 1) & 1402831169;
         }
      }

      abo[((var10 ^ 1039579223 ^ 528681695 ^ 1579815352 ^ 196162292 ^ 504198903) - 859473954 ^ 491177078) + 750603754 + 242214187 ^ 1828690548] = var10000;
      MethodHandle var11 = var10000.asType(var2);
      return new MutableCallSite(var11);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = abo[(((var10 - 1086342050 ^ 330697467 ^ 1885430514) + 690327124 - 1389088232 ^ 1085309455) - 1201253600 ^ 1558246982) - 634289615 - 1067977205];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = (-565903485 >>> 854233131 | 0) & -1436544256;

         label242:
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
               var17 = (1900156946 + -69769571 | 0) & -1878884096;

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
                     Class var6 = Class.forName(var10003.toString(), false, bu.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = (139976334 & -1575590622 | 0) & 746699520;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), bu.class.getClassLoader()).returnType();
                           switch((((var4 - 470669535 ^ 504747031) + 118198303 + 1357661141 ^ 546666225) + 1236409273 ^ 1905882896) - 257287761 ^ 2056764033 ^ 636654717) {
                           case 270479698:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label242;
                           case 559290074:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label242;
                           case 1427355321:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label242;
                           case 1710517814:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label242;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var18 = var10003.charAt(var17) + 8 - 39 + 45;
                        var10003.setCharAt(var17, (char)(((((((((var18 & '\ue000') >> 13 | var18 << 3) + 37 + 37 & '\ufffe') >> 1 | ((var18 & '\ue000') >> 13 | var18 << 3) + 37 + 37 << 15) & '\ufff0') >> 4 | ((((var18 & '\ue000') >> 13 | var18 << 3) + 37 + 37 & '\ufffe') >> 1 | ((var18 & '\ue000') >> 13 | var18 << 3) + 37 + 37 << 15) << 12) & '\ufffe') >> 1 | ((((((var18 & '\ue000') >> 13 | var18 << 3) + 37 + 37 & '\ufffe') >> 1 | ((var18 & '\ue000') >> 13 | var18 << 3) + 37 + 37 << 15) & '\ufff0') >> 4 | ((((var18 & '\ue000') >> 13 | var18 << 3) + 37 + 37 & '\ufffe') >> 1 | ((var18 & '\ue000') >> 13 | var18 << 3) + 37 + 37 << 15) << 12) << 15) ^ 251));
                        var17 += -1556378745 & -896464778 ^ -2112813049;
                     }
                  }

                  char var20 = var10003.charAt(var17);
                  var18 = (((((((var20 & '\ue000') >> 13 | var20 << 3) & '\ufff0') >> 4 | ((var20 & '\ue000') >> 13 | var20 << 3) << 12) ^ 124) & 'ﰀ') >> 10 | (((((var20 & '\ue000') >> 13 | var20 << 3) & '\ufff0') >> 4 | ((var20 & '\ue000') >> 13 | var20 << 3) << 12) ^ 124) << 6) - 189;
                  int var10004 = (var18 & 'ﾀ') >> 7;
                  var19 = var18;
                  var18 = var10004 | var18 << 9;
                  var10004 = ((var10004 | var19 << 9) & '쀀') >> 14;
                  var19 = var18;
                  var18 = var10004 | var18 << 2;
                  var10004 = ((var10004 | var19 << 2) & '\ufffe') >> 1;
                  var19 = var18;
                  var18 = var10004 | var18 << 15;
                  var10004 = ((var10004 | var19 << 15) & 0) >> 16;
                  var19 = var18;
                  var18 = var10004 | var18 << 0;
                  var10004 = ((var10004 | var19 << 0) & '쀀') >> 14;
                  var19 = var18;
                  var20 = (char)(var10004 | var18 << 2);
                  var14.setCharAt(var17, (char)(var10004 | var19 << 2));
                  var17 += -1111545708 - -1773495578 ^ 661949871;
               }
            }

            var18 = var10003.charAt(var17) - 66;
            var10003.setCharAt(var17, (char)(((((((var18 & '\uffc0') >> 6 | var18 << 10) ^ 169) + 64 & '耀') >> 15 | (((var18 & '\uffc0') >> 6 | var18 << 10) ^ 169) + 64 << 1) - 172 - 250 - 106 ^ 175) - 30));
            var17 += (-678163119 * 223503312 | 1) & 18633249;
         }
      }

      if (!var11) {
         abo[(((var10 - 1086342050 ^ 330697467 ^ 1885430514) + 690327124 - 1389088232 ^ 1085309455) - 1201253600 ^ 1558246982) - 634289615 - 1067977205] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
