import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import net.minecraft.class_2382;
import org.joml.Vector3d;

public interface nj {
   MethodHandle[] stu = new MethodHandle[(120967048 >> 1341471299 | 8) & 974733322];

   void svl(double var1, double var3, double var5);

   default void fcv(class_2382 var1) {
      this.JNT<invokedynamic>(this, (double)var1.JNT<invokedynamic>(var1), (double)var1.JNT<invokedynamic>(var1), (double)var1.JNT<invokedynamic>(var1));
   }

   default void ugf(Vector3d var1) {
      this.JNT<invokedynamic>(this, var1.JNT<invokedynamic>(var1), var1.JNT<invokedynamic>(var1), var1.JNT<invokedynamic>(var1));
   }

   void stp(double var1, double var3);

   void kmx(double var1);

   static Object _/* $FF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = stu[((((var10 ^ 796611218) + 1613335321 ^ 117937484) + 1226155773 + 643742693 ^ 1281702966) + 1729360635 ^ 1563317729) - 1429465881 + 2057071314];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var12 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var15 = var12;
         StringBuilder var13 = var10002;
         var10003.<init>(var15);
         int var16 = (395814137 * 1069302028 | 0) & 1677983762;

         label233:
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
               var16 = -1348642831 >>> -365805852 ^ 184145279;

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
                  int var10004;
                  if (var16 >= var17) {
                     MethodType var6 = MethodType.fromMethodDescriptorString(var10003.toString(), nj.class.getClassLoader());
                     var12 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var15 = var12;
                     var13 = var10002;
                     var10003.<init>(var15);
                     var16 = (1446592425 ^ -1247673493 | 0) & 4457000;

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
                           Class var7 = Class.forName(var10003.toString(), false, nj.class.getClassLoader());
                           switch((var4 - 262944798 + 1961752200 + 330840272 - 1948457925 + 1464004994 ^ 1276612835 ^ 162622200) + 1149536779 + 1698278185 + 830915501) {
                           case 96036465:
                           case 1527302159:
                              var10000 = var0.findVirtual(var7, var5, var6);
                              break label233;
                           case 118808239:
                              var10000 = var0.findStatic(var7, var5, var6);
                              break label233;
                           case 1765641777:
                              var10000 = var0.findSpecial(var7, var5, var6, nj.class);
                              break label233;
                           case 2004781195:
                              var10000 = var0.findConstructor(var7, var6);
                              break label233;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var17 = var10003.charAt(var16) + 162;
                        var17 = ((((((var17 & '\uffc0') >> 6 | var17 << 10) + 168 & '￠') >> 5 | ((var17 & '\uffc0') >> 6 | var17 << 10) + 168 << 11) + 245 & 'ﰀ') >> 10 | ((((var17 & '\uffc0') >> 6 | var17 << 10) + 168 & '￠') >> 5 | ((var17 & '\uffc0') >> 6 | var17 << 10) + 168 << 11) + 245 << 6) + 55;
                        var10004 = (var17 & '\uf000') >> 12;
                        var18 = var17;
                        var17 = var10004 | var17 << 4;
                        var10004 = ((var10004 | var18 << 4) & '\ue000') >> 13;
                        var18 = var17;
                        var17 = var10004 | var17 << 3;
                        var10004 = ((var10004 | var18 << 3) & '\ufff0') >> 4;
                        var18 = var17;
                        var19 = (char)(var10004 | var17 << 12);
                        var13.setCharAt(var16, (char)(var10004 | var18 << 12));
                        var16 += -1418475164 + -26998384 ^ -1445473547;
                     }
                  }

                  var17 = var10003.charAt(var16) ^ 70;
                  var17 = (((((((((var17 & '￼') >> 2 | var17 << 14) & '\ue000') >> 13 | ((var17 & '￼') >> 2 | var17 << 14) << 3) & '\ufff0') >> 4 | ((((var17 & '￼') >> 2 | var17 << 14) & '\ue000') >> 13 | ((var17 & '￼') >> 2 | var17 << 14) << 3) << 12) & '\uffff') >> 0 | ((((((var17 & '￼') >> 2 | var17 << 14) & '\ue000') >> 13 | ((var17 & '￼') >> 2 | var17 << 14) << 3) & '\ufff0') >> 4 | ((((var17 & '￼') >> 2 | var17 << 14) & '\ue000') >> 13 | ((var17 & '￼') >> 2 | var17 << 14) << 3) << 12) << 16) ^ 54) + 233 - 225 ^ 59;
                  var10004 = (var17 & '\uf000') >> 12;
                  var18 = var17;
                  var19 = (char)(var10004 | var17 << 4);
                  var13.setCharAt(var16, (char)(var10004 | var18 << 4));
                  var16 += -2004017129 >>> 817082197 ^ 1093;
               }
            }

            var19 = var10003.charAt(var16);
            var10003.setCharAt(var16, (char)(((((((((((var19 & '︀') >> 9 | var19 << 7) ^ 241 ^ 45) - 135 & '\ufff0') >> 4 | (((var19 & '︀') >> 9 | var19 << 7) ^ 241 ^ 45) - 135 << 12) & 'ﰀ') >> 10 | (((((var19 & '︀') >> 9 | var19 << 7) ^ 241 ^ 45) - 135 & '\ufff0') >> 4 | (((var19 & '︀') >> 9 | var19 << 7) ^ 241 ^ 45) - 135 << 12) << 6) ^ 164) - 234 & '￼') >> 2 | ((((((((var19 & '︀') >> 9 | var19 << 7) ^ 241 ^ 45) - 135 & '\ufff0') >> 4 | (((var19 & '︀') >> 9 | var19 << 7) ^ 241 ^ 45) - 135 << 12) & 'ﰀ') >> 10 | (((((var19 & '︀') >> 9 | var19 << 7) ^ 241 ^ 45) - 135 & '\ufff0') >> 4 | (((var19 & '︀') >> 9 | var19 << 7) ^ 241 ^ 45) - 135 << 12) << 6) ^ 164) - 234 << 14) - 63));
            var16 += 1267217764 << 429304575 ^ 1;
         }
      }

      stu[((((var10 ^ 796611218) + 1613335321 ^ 117937484) + 1226155773 + 643742693 ^ 1281702966) + 1729360635 ^ 1563317729) - 1429465881 + 2057071314] = var10000;
      MethodHandle var11 = var10000.asType(var2);
      return new MutableCallSite(var11);
   }

   static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = stu[((var10 ^ 343905666) - 1071217514 + 701956869 ^ 141289286 ^ 647730559 ^ 317295333) - 1497200028 + 641404775 - 222037712 + 52711797];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = 1018223094 * 1910126492 ^ 739552232;

         label205:
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
               var17 = 1973559803 >>> 2130940403 ^ 3764;

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
                     Class var6 = Class.forName(var10003.toString(), false, nj.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = (-573519831 | 787503169 ^ -1593659299 | 0) & 595010;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), nj.class.getClassLoader()).returnType();
                           switch((((var4 ^ 197600121) + 906190594 - 2030388200 + 1929573904 ^ 565062054) + 517838384 + 1437402165 ^ 80688040) + 178233263 + 1377106916) {
                           case 324294633:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label205;
                           case 705165828:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label205;
                           case 1367011257:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label205;
                           case 1751698541:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label205;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var18 = (var10003.charAt(var17) ^ 39) - 77;
                        var10003.setCharAt(var17, (char)((((((((var18 & 'ﾀ') >> 7 | var18 << 9) - 225 & '\uffc0') >> 6 | ((var18 & 'ﾀ') >> 7 | var18 << 9) - 225 << 10) + 13 ^ 176 ^ 240) & '\uf800') >> 11 | (((((var18 & 'ﾀ') >> 7 | var18 << 9) - 225 & '\uffc0') >> 6 | ((var18 & 'ﾀ') >> 7 | var18 << 9) - 225 << 10) + 13 ^ 176 ^ 240) << 5) + 81));
                        var17 += (-598972747 + -598972747 | 1) & 1141121685;
                     }
                  }

                  var18 = var10003.charAt(var17) + 179;
                  var10003.setCharAt(var17, (char)((((((((((((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 & '\uf800') >> 11 | (((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 << 5) & '\uf000') >> 12 | (((((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 & '\uf800') >> 11 | (((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 << 5) << 4) - 187 & 'ﰀ') >> 10 | (((((((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 & '\uf800') >> 11 | (((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 << 5) & '\uf000') >> 12 | (((((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 & '\uf800') >> 11 | (((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 << 5) << 4) - 187 << 6) & '\ufff8') >> 3 | (((((((((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 & '\uf800') >> 11 | (((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 << 5) & '\uf000') >> 12 | (((((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 & '\uf800') >> 11 | (((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 << 5) << 4) - 187 & 'ﰀ') >> 10 | (((((((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 & '\uf800') >> 11 | (((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 << 5) & '\uf000') >> 12 | (((((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 & '\uf800') >> 11 | (((var18 & '￼') >> 2 | var18 << 14) ^ 217) + 216 << 5) << 4) - 187 << 6) << 13) - 209));
                  var17 += (1719634977 - 719869465 | 1) & -2078242413;
               }
            }

            char var20 = var10003.charAt(var17);
            var10003.setCharAt(var17, (char)(((((((((((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) & '\uf000') >> 12 | ((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) << 4) & '\uffff') >> 0 | ((((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) & '\uf000') >> 12 | ((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) << 4) << 16) & '\ufff0') >> 4 | ((((((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) & '\uf000') >> 12 | ((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) << 4) & '\uffff') >> 0 | ((((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) & '\uf000') >> 12 | ((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) << 4) << 16) << 12) + 218 & '쀀') >> 14 | ((((((((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) & '\uf000') >> 12 | ((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) << 4) & '\uffff') >> 0 | ((((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) & '\uf000') >> 12 | ((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) << 4) << 16) & '\ufff0') >> 4 | ((((((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) & '\uf000') >> 12 | ((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) << 4) & '\uffff') >> 0 | ((((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) & '\uf000') >> 12 | ((((var20 & '￼') >> 2 | var20 << 14) - 88 & '￼') >> 2 | ((var20 & '￼') >> 2 | var20 << 14) - 88 << 14) << 4) << 16) << 12) + 218 << 2) - 186 - 29));
            var17 += (-115352560 >>> -115352560 | 0) & 1470628001;
         }
      }

      if (!var11) {
         stu[((var10 ^ 343905666) - 1071217514 + 701956869 ^ 141289286 ^ 647730559 ^ 317295333) - 1497200028 + 641404775 - 222037712 + 52711797] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
