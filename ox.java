import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;

public class ox {
   public static aqb lk;
   public static final MethodHandle[] gjo = new MethodHandle[676051578 + (676051578 << 1863005503) ^ 676051580];
   transient String myMetaphor;

   static {
      int var10000 = (1504038189 >> 1444637662 | 0) & 1235995716;
      StringBuilder var10001 = (StringBuilder)"⾶暶澶溶璶⺶璶璶暶".JNT<invokedynamic>("⾶暶澶溶璶⺶璶璶暶");

      while(true) {
         StringBuilder var10002 = var10001;
         int var2 = var10000;
         StringBuilder var0 = var10002;
         if (var2 >= ((-1165484329 | -533948955 | 8) & 4202505)) {
            String var1 = var10002.JNT<invokedynamic>(var10002);
            var1.JNT<invokedynamic>(var1, 35, false, false, false).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1, 35, false, false, false));
            return;
         }

         int var3 = var10002.JNT<invokedynamic>(var10002, var2) - 11 ^ 171;
         int var10004 = (var3 & '\uf800') >> 11;
         int var10003 = var3;
         var3 = var10004 | var3 << 5;
         var10004 = ((var10004 | var10003 << 5) & 'ﰀ') >> 10;
         var10003 = var3;
         var3 = var10004 | var3 << 6;
         var10004 = ((var10004 | var10003 << 6) & '\ufff8') >> 3;
         var10003 = var3;
         char var4 = (char)(var10004 | var3 << 13);
         var0.JNT<invokedynamic>(var0, var2, (char)(var10004 | var10003 << 13));
         var3 = var2 + (-827188024 >> 486633476 ^ -51699251);
         var10001 = var0;
         var10000 = var3;
      }
   }

   public static Object _/* $FF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = gjo[((var10 - 244613357 - 1082056813 + 1021655903 ^ 527381197 ^ 574797979) - 1749451037 ^ 479051957) - 2110710778 + 1514620018 + 552935037];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var12 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var15 = var12;
         StringBuilder var13 = var10002;
         var10003.<init>(var15);
         int var16 = (-764613235 & 2135676902 | 0) & -1406856696;

         label254:
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
               var16 = (-609289677 | -263975877) ^ -68223429;

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
                     MethodType var6 = MethodType.fromMethodDescriptorString(var10003.toString(), ox.class.getClassLoader());
                     var12 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var15 = var12;
                     var13 = var10002;
                     var10003.<init>(var15);
                     var16 = -394365248 >>> 670912164 + 2145321330 ^ 929;

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
                           Class var7 = Class.forName(var10003.toString(), false, ox.class.getClassLoader());
                           switch(((var4 - 2016227903 + 316766483 + 886411442 - 1338693441 - 788018612 ^ 347701214) + 1599581471 + 1079476324 ^ 338085552) + 1501565816) {
                           case 203776748:
                              var10000 = var0.findStatic(var7, var5, var6);
                              break label254;
                           case 669040577:
                           case 788589013:
                              var10000 = var0.findVirtual(var7, var5, var6);
                              break label254;
                           case 1093675785:
                              var10000 = var0.findConstructor(var7, var6);
                              break label254;
                           case 1254575541:
                              var10000 = var0.findSpecial(var7, var5, var6, ox.class);
                              break label254;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var17 = var10003.charAt(var16) - 229 + 130;
                        var17 = (((((var17 & '\ufff8') >> 3 | var17 << 13) + 148 ^ 0) - 110 & '\ue000') >> 13 | (((var17 & '\ufff8') >> 3 | var17 << 13) + 148 ^ 0) - 110 << 3) - 101 - 60;
                        var10004 = (var17 & '\uf800') >> 11;
                        var18 = var17;
                        var19 = (char)(var10004 | var17 << 5);
                        var13.setCharAt(var16, (char)(var10004 | var18 << 5));
                        var16 += (-1857918564 - -1857918564 | 1) & 1733508437;
                     }
                  }

                  var17 = var10003.charAt(var16) + 94 + 110;
                  var17 = ((((((var17 & '\uf800') >> 11 | var17 << 5) + 99 & '\ufff8') >> 3 | ((var17 & '\uf800') >> 11 | var17 << 5) + 99 << 13) & '\ufff0') >> 4 | ((((var17 & '\uf800') >> 11 | var17 << 5) + 99 & '\ufff8') >> 3 | ((var17 & '\uf800') >> 11 | var17 << 5) + 99 << 13) << 12) ^ 55;
                  var10004 = (var17 & '\uf800') >> 11;
                  var18 = var17;
                  var17 = var10004 | var17 << 5;
                  var10004 = ((var10004 | var18 << 5) & 0) >> 16;
                  var18 = var17;
                  var17 = var10004 | var17 << 0;
                  var10004 = ((var10004 | var18 << 0) & '\uffc0') >> 6;
                  var18 = var17;
                  var19 = (char)(var10004 | var17 << 10);
                  var13.setCharAt(var16, (char)(var10004 | var18 << 10));
                  var16 += (-1063043117 * -1932518340 | 1) & -1588465663;
               }
            }

            var17 = var10003.charAt(var16) - 1 + 191;
            var17 = ((((((var17 & 'ﰀ') >> 10 | var17 << 6) & '耀') >> 15 | ((var17 & 'ﰀ') >> 10 | var17 << 6) << 1) + 196 - 51 & '\uffff') >> 0 | ((((var17 & 'ﰀ') >> 10 | var17 << 6) & '耀') >> 15 | ((var17 & 'ﰀ') >> 10 | var17 << 6) << 1) + 196 - 51 << 16) - 219 ^ 87;
            var10004 = (var17 & 0) >> 16;
            var18 = var17;
            var19 = (char)(var10004 | var17 << 0);
            var13.setCharAt(var16, (char)(var10004 | var18 << 0));
            var16 += -1608038196 * 109837305 ^ -1722166675;
         }
      }

      gjo[((var10 - 244613357 - 1082056813 + 1021655903 ^ 527381197 ^ 574797979) - 1749451037 ^ 479051957) - 2110710778 + 1514620018 + 552935037] = var10000;
      MethodHandle var11 = var10000.asType(var2);
      return new MutableCallSite(var11);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = gjo[((var10 + 1737976942 + 2107620004 ^ 1785548381) + 163763979 + 762967564 + 1849505833 - 1227061414 ^ 960983887) - 1261235714 - 805630604];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = (-1617381910 * (961363227 + 961363227) | 0) & 536875136;

         label260:
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
               var17 = 587796123 >> 587796123 ^ 4;

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
                     Class var6 = Class.forName(var10003.toString(), false, ox.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = -662074641 >>> -2053218937 ^ 28381973;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), ox.class.getClassLoader()).returnType();
                           switch(((var4 + 768555448 + 1158438927 + 1369658622 - 1478058212 + 1360796407 ^ 459768562) - 1300523767 ^ 1532217031) + 7988314 ^ 917615043) {
                           case 266748424:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label260;
                           case 947270540:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label260;
                           case 1344313456:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label260;
                           case 1595786930:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label260;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var20 = var10003.charAt(var17);
                        var18 = ((((var20 & '쀀') >> 14 | var20 << 2) + 160 & '\uf800') >> 11 | ((var20 & '쀀') >> 14 | var20 << 2) + 160 << 5) - 92 ^ 106;
                        var10004 = (var18 & '耀') >> 15;
                        var19 = var18;
                        var18 = var10004 | var18 << 1;
                        var10004 = ((var10004 | var19 << 1) & '\ufff0') >> 4;
                        var19 = var18;
                        var18 = var10004 | var18 << 12;
                        var10004 = ((var10004 | var19 << 12) & '\ufff0') >> 4;
                        var19 = var18;
                        var18 = var10004 | var18 << 12;
                        var10004 = ((var10004 | var19 << 12) & '耀') >> 15;
                        var19 = var18;
                        var18 = var10004 | var18 << 1;
                        var10004 = ((var10004 | var19 << 1) & '\ufff0') >> 4;
                        var19 = var18;
                        var20 = (char)(var10004 | var18 << 12);
                        var14.setCharAt(var17, (char)(var10004 | var19 << 12));
                        var17 += -1188003492 - 1465122368 ^ 1641841437;
                     }
                  }

                  var18 = var10003.charAt(var17) ^ 131;
                  var18 = ((((((var18 & '￼') >> 2 | var18 << 14) ^ 253 ^ 87) & '￠') >> 5 | (((var18 & '￼') >> 2 | var18 << 14) ^ 253 ^ 87) << 11) - 158 ^ 131) + 181 ^ 72;
                  var10004 = (var18 & '\ufff0') >> 4;
                  var19 = var18;
                  var20 = (char)(var10004 | var18 << 12);
                  var14.setCharAt(var17, (char)(var10004 | var19 << 12));
                  var17 += -1840773953 + 1324802129 ^ -515971823;
               }
            }

            var18 = (((var10003.charAt(var17) + 222 - 247 ^ 250) + 124 ^ 252) - 39 + 157 ^ 88) - 172;
            var10004 = (var18 & '\uffff') >> 0;
            var19 = var18;
            var20 = (char)(var10004 | var18 << 16);
            var14.setCharAt(var17, (char)(var10004 | var19 << 16));
            var17 += (144189813 | 144189813) ^ 144189812;
         }
      }

      if (!var11) {
         gjo[((var10 + 1737976942 + 2107620004 ^ 1785548381) + 163763979 + 762967564 + 1849505833 - 1227061414 ^ 960983887) - 1261235714 - 805630604] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
