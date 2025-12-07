import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

public class nw extends PlaybackListener {
   // $FF: synthetic field
   public oi kzh;
   public static final MethodHandle[] btt = new MethodHandle[-361697549 + (-361697549 | -361697549) ^ -723395101];
   transient String myMetaphor;

   public nw(oi var1) {
      this.kzh = var1;
      super();
   }

   public void playbackFinished(PlaybackEvent var1) {
      if (this.JNT<invokedynamic>(this).JNT<invokedynamic>(this.JNT<invokedynamic>(this)) && var1.JNT<invokedynamic>(var1) == Integer.MAX_VALUE) {
         this.JNT<invokedynamic>(this).JNT<invokedynamic>(this.JNT<invokedynamic>(this));
      }

   }

   public static Object _/* $FF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = btt[((var10 ^ 2067041979) - 551587218 - 1290443734 ^ 1372553308) - 981665270 + 268432620 - 1847741602 + 1997896756 + 250207916 + 1855834976];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var12 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var15 = var12;
         StringBuilder var13 = var10002;
         var10003.<init>(var15);
         int var16 = 820389656 << (-1841039937 >>> -1841039937) ^ 1640779312;

         label231:
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
               var16 = (-738295378 << -753488613 | 0) & 253281787;

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
                     MethodType var6 = MethodType.fromMethodDescriptorString(var10003.toString(), nw.class.getClassLoader());
                     var12 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var15 = var12;
                     var13 = var10002;
                     var10003.<init>(var15);
                     var16 = -2115755983 + -2115755983 ^ 63455330;

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
                           Class var7 = Class.forName(var10003.toString(), false, nw.class.getClassLoader());
                           switch(((var4 - 1797829104 - 1198277578 + 1099805164 ^ 784031794) - 671659702 - 46292329 ^ 918509964) + 1996116147 ^ 1574837626 ^ 374064795) {
                           case 478172640:
                              var10000 = var0.findSpecial(var7, var5, var6, nw.class);
                              break label231;
                           case 810595263:
                           case 1083022019:
                              var10000 = var0.findVirtual(var7, var5, var6);
                              break label231;
                           case 1162853065:
                              var10000 = var0.findStatic(var7, var5, var6);
                              break label231;
                           case 1494400607:
                              var10000 = var0.findConstructor(var7, var6);
                              break label231;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var10003.setCharAt(var16, (char)((((var10003.charAt(var16) ^ 204) - 122 ^ 64) - 183 - 136 + 113 + 78 - 107 ^ 219) - 169));
                        var16 += -195126521 ^ 1131413762 ^ -1221682684;
                     }
                  }

                  char var19 = var10003.charAt(var16);
                  var10003.setCharAt(var16, (char)((((((((var19 & 0) >> 16 | var19 << 0) - 133 - 25 & '￼') >> 2 | ((var19 & 0) >> 16 | var19 << 0) - 133 - 25 << 14) ^ 183) - 192 & '︀') >> 9 | (((((var19 & 0) >> 16 | var19 << 0) - 133 - 25 & '￼') >> 2 | ((var19 & 0) >> 16 | var19 << 0) - 133 - 25 << 14) ^ 183) - 192 << 7) + 232 - 40 + 129));
                  var16 += 1568599991 & -1606526849 << (1568599991 | -1606526849) ^ 1;
               }
            }

            var17 = var10003.charAt(var16) + 177 - 37 - 200 - 11 + 73 + 133;
            var10003.setCharAt(var16, (char)((((var17 & 0) >> 16 | var17 << 0) - 203 ^ 76) - 185));
            var16 += (42897436 ^ -1140799903 | 0) & 1081182211;
         }
      }

      btt[((var10 ^ 2067041979) - 551587218 - 1290443734 ^ 1372553308) - 981665270 + 268432620 - 1847741602 + 1997896756 + 250207916 + 1855834976] = var10000;
      MethodHandle var11 = var10000.asType(var2);
      return new MutableCallSite(var11);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = btt[((var10 - 1536203227 ^ 846619574 ^ 1481157493 ^ 1678822458) - 1115194043 ^ 542496826 ^ 668625914) + 955579637 + 2103384759 - 1800588629];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = (-349275065 & -349275065 | 0) & 335610400;

         label209:
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
               var17 = (-1714891730 - -745381601 | 0) & 541655200;

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
                     Class var6 = Class.forName(var10003.toString(), false, nw.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = (840647997 + 820913218 | 0) & -1802103808;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), nw.class.getClassLoader()).returnType();
                           switch(((var4 - 986111818 + 1843201777 - 1366648085 ^ 253404308) + 2050474895 + 1170029809 - 2101804624 ^ 1944543501) + 1074753532 ^ 335006889) {
                           case 429890952:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label209;
                           case 776577310:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label209;
                           case 1289047020:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label209;
                           case 1682487948:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label209;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var18 = var10003.charAt(var17) - 90;
                        var18 = ((var18 & '\ue000') >> 13 | var18 << 3) + 228;
                        int var10004 = (var18 & '￼') >> 2;
                        var19 = var18;
                        var18 = var10004 | var18 << 14;
                        var10004 = ((var10004 | var19 << 14) & '\ufff8') >> 3;
                        var19 = var18;
                        var18 = var10004 | var18 << 13;
                        var10004 = ((var10004 | var19 << 13) & 'ﾀ') >> 7;
                        var19 = var18;
                        var18 = var10004 | var18 << 9;
                        var10004 = ((var10004 | var19 << 9) & '\uf800') >> 11;
                        var19 = var18;
                        var18 = var10004 | var18 << 5;
                        var10004 = ((var10004 | var19 << 5) & '\ufff8') >> 3;
                        var19 = var18;
                        var18 = var10004 | var18 << 13;
                        var10004 = ((var10004 | var19 << 13) & '\uffff') >> 0;
                        var19 = var18;
                        var18 = var10004 | var18 << 16;
                        var10004 = ((var10004 | var19 << 16) & '︀') >> 9;
                        var19 = var18;
                        char var20 = (char)(var10004 | var18 << 7);
                        var14.setCharAt(var17, (char)(var10004 | var19 << 7));
                        var17 += (1111543381 - 1111543381 | 1) & -1373469967;
                     }
                  }

                  var18 = var10003.charAt(var17) ^ 226;
                  var10003.setCharAt(var17, (char)((((((((((((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) & 'ﾀ') >> 7 | ((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) << 9) & '\uf000') >> 12 | ((((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) & 'ﾀ') >> 7 | ((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) << 9) << 4) & 'ﰀ') >> 10 | ((((((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) & 'ﾀ') >> 7 | ((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) << 9) & '\uf000') >> 12 | ((((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) & 'ﾀ') >> 7 | ((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) << 9) << 4) << 6) & '\ue000') >> 13 | ((((((((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) & 'ﾀ') >> 7 | ((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) << 9) & '\uf000') >> 12 | ((((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) & 'ﾀ') >> 7 | ((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) << 9) << 4) & 'ﰀ') >> 10 | ((((((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) & 'ﾀ') >> 7 | ((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) << 9) & '\uf000') >> 12 | ((((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) & 'ﾀ') >> 7 | ((((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) & '\uffff') >> 0 | ((((var18 & '쀀') >> 14 | var18 << 2) & '￠') >> 5 | ((var18 & '쀀') >> 14 | var18 << 2) << 11) << 16) << 9) << 4) << 6) << 3) ^ 214) + 54));
                  var17 += (1622310788 ^ 1935670499 | 1) & 738214017;
               }
            }

            var18 = (var10003.charAt(var17) ^ 221) + 172;
            var10003.setCharAt(var17, (char)((((((((var18 & '\ufff8') >> 3 | var18 << 13) & '\ue000') >> 13 | ((var18 & '\ufff8') >> 3 | var18 << 13) << 3) ^ 13) & '\uffff') >> 0 | (((((var18 & '\ufff8') >> 3 | var18 << 13) & '\ue000') >> 13 | ((var18 & '\ufff8') >> 3 | var18 << 13) << 3) ^ 13) << 16) + 214 ^ 224 ^ 36 ^ 240));
            var17 += 706965237 - (706965237 << -1335496645) ^ -2111607052;
         }
      }

      if (!var11) {
         btt[((var10 - 1536203227 ^ 846619574 ^ 1481157493 ^ 1678822458) - 1115194043 ^ 542496826 ^ 668625914) + 955579637 + 2103384759 - 1800588629] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
