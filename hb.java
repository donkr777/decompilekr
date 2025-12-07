import dev.krypton.mixin.CountPlacementModifierAccessor;
import dev.krypton.mixin.HeightRangePlacementModifierAccessor;
import dev.krypton.mixin.RarityFilterPlacementModifierAccessor;
import java.awt.Color;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import net.minecraft.class_1959;
import net.minecraft.class_2975;
import net.minecraft.class_3037;
import net.minecraft.class_3124;
import net.minecraft.class_5321;
import net.minecraft.class_5363;
import net.minecraft.class_5868;
import net.minecraft.class_5875;
import net.minecraft.class_6017;
import net.minecraft.class_6122;
import net.minecraft.class_6793;
import net.minecraft.class_6795;
import net.minecraft.class_6796;
import net.minecraft.class_6797;
import net.minecraft.class_6799;
import net.minecraft.class_6880;
import net.minecraft.class_6885;
import net.minecraft.class_7145;
import net.minecraft.class_6880.class_6883;
import net.minecraft.class_7225.class_7226;
import net.minecraft.class_7225.class_7874;
import net.minecraft.class_7510.class_6827;

public class hb {
   public int d;
   public int ln;
   public class_6017 xl;
   public class_6122 ki;
   public class_5868 u;
   public float cu;
   public float iy;
   public int xg;
   public Color sr;
   public boolean ou;
   public static final MethodHandle[] zie = new MethodHandle[-1851994241 * -2051793071 ^ -267777980];
   transient String myMetaphor;

   public static Map l() {
      class_7874 var0 = JNT<invokedynamic>();
      class_7226 var1 = var0.JNT<invokedynamic>(var0, JNT<invokedynamic>());
      class_7226 var10000 = var0.JNT<invokedynamic>(var0, JNT<invokedynamic>());
      Map var2 = ((class_7145)var10000.JNT<invokedynamic>(var10000, JNT<invokedynamic>()).JNT<invokedynamic>(var10000.JNT<invokedynamic>(var10000, JNT<invokedynamic>()))).JNT<invokedynamic>((class_7145)var10000.JNT<invokedynamic>(var10000, JNT<invokedynamic>()).JNT<invokedynamic>(var10000.JNT<invokedynamic>(var10000, JNT<invokedynamic>()))).JNT<invokedynamic>(((class_7145)var10000.JNT<invokedynamic>(var10000, JNT<invokedynamic>()).JNT<invokedynamic>(var10000.JNT<invokedynamic>(var10000, JNT<invokedynamic>()))).JNT<invokedynamic>((class_7145)var10000.JNT<invokedynamic>(var10000, JNT<invokedynamic>()).JNT<invokedynamic>(var10000.JNT<invokedynamic>(var10000, JNT<invokedynamic>()))));
      class_5363 var3 = (class_5363)var2.JNT<invokedynamic>(var2, JNT<invokedynamic>());
      Set var4 = var3.JNT<invokedynamic>(var3).JNT<invokedynamic>(var3.JNT<invokedynamic>(var3)).JNT<invokedynamic>(var3.JNT<invokedynamic>(var3).JNT<invokedynamic>(var3.JNT<invokedynamic>(var3)));
      List var5 = var4.JNT<invokedynamic>(var4).JNT<invokedynamic>(var4.JNT<invokedynamic>(var4));
      List var6 = var5.JNT<invokedynamic>(var5, (var0x) -> {
         return ((class_1959)var0x.JNT<invokedynamic>(var0x)).JNT<invokedynamic>((class_1959)var0x.JNT<invokedynamic>(var0x)).JNT<invokedynamic>(((class_1959)var0x.JNT<invokedynamic>(var0x)).JNT<invokedynamic>((class_1959)var0x.JNT<invokedynamic>(var0x)));
      }, true);
      HashMap var7 = (HashMap)JNT<invokedynamic>();
      var7.JNT<invokedynamic>(var7, var6, var1, JNT<invokedynamic>(), 7, (Color)true.JNT<invokedynamic>(209, 27, 245));
      var7.JNT<invokedynamic>(var7, var6, var1, JNT<invokedynamic>(), 7, (Color)true.JNT<invokedynamic>(209, 27, 245));
      HashMap var8 = (HashMap)JNT<invokedynamic>();
      var5.JNT<invokedynamic>(var5, (var2x) -> {
         var8.JNT<invokedynamic>(var8, (class_5321)var2x.JNT<invokedynamic>(var2x).JNT<invokedynamic>(var2x.JNT<invokedynamic>(var2x)), (ArrayList)JNT<invokedynamic>());
         Stream var10000 = ((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x))).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)))).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x))).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)))), class_6885::method_40239).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x))).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)))).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x))).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>(((class_1959)var2x.JNT<invokedynamic>(var2x)).JNT<invokedynamic>((class_1959)var2x.JNT<invokedynamic>(var2x)))), class_6885::method_40239), class_6880::comp_349);
         var7.JNT<invokedynamic>(var7);
         var10000.JNT<invokedynamic>(var10000, var7::containsKey).JNT<invokedynamic>(var10000.JNT<invokedynamic>(var10000, var7::containsKey), (var3) -> {
            ((List)var8.JNT<invokedynamic>(var8, var2x.JNT<invokedynamic>(var2x).JNT<invokedynamic>(var2x.JNT<invokedynamic>(var2x)))).JNT<invokedynamic>((List)var8.JNT<invokedynamic>(var8, var2x.JNT<invokedynamic>(var2x).JNT<invokedynamic>(var2x.JNT<invokedynamic>(var2x))), (hb)var7.JNT<invokedynamic>(var7, var3));
         });
      });
      return var8;
   }

   public static void q(Map var0, List var1, class_7226 var2, class_5321 var3, int var4, Color var5) {
      class_6883 var10000 = var2.JNT<invokedynamic>(var2, var3);
      class_6796 var6 = (class_6796)var10000.JNT<invokedynamic>(var10000);
      ToIntFunction var9 = ((class_6827)var1.JNT<invokedynamic>(var1, var4)).JNT<invokedynamic>((class_6827)var1.JNT<invokedynamic>(var1, var4));
      int var7 = var9.JNT<invokedynamic>(var9, var6);
      hb var8 = (hb)var6.JNT<invokedynamic>(var6, var4, var7, var5);
      var0.JNT<invokedynamic>(var0, var6, var8);
   }

   public hb(class_6796 var1, int var2, int var3, Color var4) {
      int var10 = -1691414395;
      super();
      this.JNT<invokedynamic>(this, true.JNT<invokedynamic>(1));
      this.JNT<invokedynamic>(this, 1.0F);
      this.JNT<invokedynamic>(this, var2);
      this.JNT<invokedynamic>(this, var3);
      this.JNT<invokedynamic>(this, var4);
      int var5 = JNT<invokedynamic>().JNT<invokedynamic>(JNT<invokedynamic>()).JNT<invokedynamic>(JNT<invokedynamic>().JNT<invokedynamic>(JNT<invokedynamic>()));
      int var6 = JNT<invokedynamic>().JNT<invokedynamic>(JNT<invokedynamic>()).JNT<invokedynamic>(JNT<invokedynamic>().JNT<invokedynamic>(JNT<invokedynamic>())).JNT<invokedynamic>(JNT<invokedynamic>().JNT<invokedynamic>(JNT<invokedynamic>()).JNT<invokedynamic>(JNT<invokedynamic>().JNT<invokedynamic>(JNT<invokedynamic>())));
      this.JNT<invokedynamic>(this, (class_5868)null.JNT<invokedynamic>((Object)null, var5.JNT<invokedynamic>(var5, var6)));
      Iterator var7 = var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1));

      label86:
      while(true) {
         var10 = -279755245 << -511815416 ^ -1399062501;

         while(true) {
            switch(((var10 ^ 780912651) + 2031387444 - 854560340 ^ 866030582 ^ 45747431) - 1053558234) {
            case -410629369:
               if (var7.JNT<invokedynamic>(var7)) {
                  class_6797 var8 = (class_6797)var7.JNT<invokedynamic>(var7);
                  if (var8 instanceof class_6793) {
                     this.JNT<invokedynamic>(this, ((CountPlacementModifierAccessor)var8).JNT<invokedynamic>((CountPlacementModifierAccessor)var8));
                     var10 = (-1163939740 | 350359003 | 1107715986) & -767662122;
                  } else {
                     var10 = (-378234892 << -1708039577 | 1141975297) & -837568103;
                  }

                  while(true) {
                     label81:
                     while(true) {
                        switch((var10 + 1641455124 ^ 1015836011) - 873454170 + 1748519124 + 1001744017 + 1556211992) {
                        case -717674844:
                        default:
                           continue label86;
                        case -536479583:
                           if (var8 instanceof class_6795) {
                              this.JNT<invokedynamic>(this, ((HeightRangePlacementModifierAccessor)var8).JNT<invokedynamic>((HeightRangePlacementModifierAccessor)var8));
                              break label81;
                           }

                           var10 = (-330137578 << 1611977553 | -1509318624) & -1367739222;
                           break;
                        case 19665282:
                           if (var8 instanceof class_6799) {
                              this.JNT<invokedynamic>(this, (float)((RarityFilterPlacementModifierAccessor)var8).JNT<invokedynamic>((RarityFilterPlacementModifierAccessor)var8));
                           }
                           break label81;
                        }
                     }

                     var10 = (-1163939740 | 350359003 | 1107715986) & -767662122;
                  }
               }

               var10 = -1781490905 ^ 1478097843 ^ -1125760648;
               break;
            case 1445018620:
            default:
               class_3037 var11 = ((class_2975)var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1))).JNT<invokedynamic>((class_2975)var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)));
               if (var11 instanceof class_3124) {
                  class_3124 var12 = (class_3124)var11;
                  this.JNT<invokedynamic>(this, var12.JNT<invokedynamic>(var12));
                  this.JNT<invokedynamic>(this, var12.JNT<invokedynamic>(var12));
                  var10 = -1085008985 - -1085008985 ^ 1427120639;

                  while(true) {
                     switch((var10 ^ 5667962) - 768190821 - 138278544 + 630162327 - 2127710784 - 994136020) {
                     case -2124624778:
                     default:
                        return;
                     case -1967479021:
                     }

                     if (((class_2975)var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1))).JNT<invokedynamic>((class_2975)var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1))) instanceof class_5875) {
                        this.JNT<invokedynamic>(this, true);
                     }

                     var10 = (-915985542 | 1519316663 | -915985542 * 1519316663) ^ -1270804115;
                  }
               }

               String var9 = var1.JNT<invokedynamic>(var1);
               StringBuilder var10000 = (StringBuilder)JNT<invokedynamic>();
               int var10001 = 508837526 >>> 156029921 - -1175196365 ^ 31056;
               StringBuilder var10002 = (StringBuilder)"ĵŅŁġōĥ)ġŅñ)".JNT<invokedynamic>("ĵŅŁġōĥ)ġŅñ)");

               while(true) {
                  StringBuilder var10003 = var10002;
                  int var14 = var10001;
                  StringBuilder var13 = var10003;
                  int var15;
                  if (var14 >= ((-1968809625 | 1080409119 | 1) & 823656459)) {
                     var10000 = var10000.JNT<invokedynamic>(var10000, var10003.JNT<invokedynamic>(var10003)).JNT<invokedynamic>(var10000.JNT<invokedynamic>(var10000, var10003.JNT<invokedynamic>(var10003)), var9);
                     var10001 = 1989347843 + -282978776 ^ 1706369067;
                     var10002 = (StringBuilder)"뽭㽫､罰㽰ｫ､㽸罯뽮罶뽮뽳ｫ뽪罯뽮㽷㽰罰置뽭㽮罠㽯ｱ뽳㽫㽫".JNT<invokedynamic>("뽭㽫､罰㽰ｫ､㽸罯뽮罶뽮뽳ｫ뽪罯뽮㽷㽰罰置뽭㽮罠㽯ｱ뽳㽫㽫");

                     while(true) {
                        var10003 = var10002;
                        var14 = var10001;
                        var13 = var10003;
                        if (var14 >= (1153417772 >>> 1153417772 ^ 281569)) {
                           throw (IllegalStateException)var10000.JNT<invokedynamic>(var10000, var10003.JNT<invokedynamic>(var10003)).JNT<invokedynamic>(var10000.JNT<invokedynamic>(var10000, var10003.JNT<invokedynamic>(var10003))).JNT<invokedynamic>(var10000.JNT<invokedynamic>(var10000, var10003.JNT<invokedynamic>(var10003)).JNT<invokedynamic>(var10000.JNT<invokedynamic>(var10000, var10003.JNT<invokedynamic>(var10003))));
                        }

                        var15 = var10003.JNT<invokedynamic>(var10003, var14) + 212;
                        var13.JNT<invokedynamic>(var13, var14, (char)((((var15 & '쀀') >> 14 | var15 << 2) + 202 ^ 183) - 253));
                        var15 = var14 + ((-1474913848 | -1474913848 >>> 720609035 | 1) & 1436573733);
                        var10002 = var13;
                        var10001 = var15;
                     }
                  }

                  var15 = var10003.JNT<invokedynamic>(var10003, var14) + 116 - 74 ^ 211;
                  int var10005 = (var15 & 0) >> 16;
                  int var10004 = var15;
                  var15 = var10005 | var15 << 0;
                  var10005 = ((var10005 | var10004 << 0) & '￼') >> 2;
                  var10004 = var15;
                  char var16 = (char)(var10005 | var15 << 14);
                  var13.JNT<invokedynamic>(var13, var14, (char)(var10005 | var10004 << 14));
                  var15 = var14 + (-1653329297 >> (-370665918 & 656519254) ^ -413332326);
                  var10002 = var13;
                  var10001 = var15;
               }
            }
         }
      }
   }

   public static Object _/* $FF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = zie[((var10 - 709984958 - 979800997 ^ 1831283606) - 86819568 + 1741717332 - 1276065317 + 978836110 ^ 922035698) + 1643258070 ^ 919636138];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var12 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var15 = var12;
         StringBuilder var13 = var10002;
         var10003.<init>(var15);
         int var16 = (332382319 >> (332382319 ^ 1477113591) | 0) & 114324520;

         label225:
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
               var16 = 1536307398 >> -1012173992 ^ 91;

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
                     MethodType var6 = MethodType.fromMethodDescriptorString(var10003.toString(), hb.class.getClassLoader());
                     var12 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var15 = var12;
                     var13 = var10002;
                     var10003.<init>(var15);
                     var16 = (240399040 | -1531317762 | 0) & 285343744;

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
                           Class var7 = Class.forName(var10003.toString(), false, hb.class.getClassLoader());
                           switch((((var4 + 1569376810 - 1356738534 - 2075267902 ^ 1656303641) - 1985115995 + 1233027426 ^ 831204611) + 1394162937 ^ 284799374) - 1416637469) {
                           case 468770:
                           case 983078635:
                              var10000 = var0.findVirtual(var7, var5, var6);
                              break label225;
                           case 740560399:
                              var10000 = var0.findSpecial(var7, var5, var6, hb.class);
                              break label225;
                           case 1236425897:
                              var10000 = var0.findConstructor(var7, var6);
                              break label225;
                           case 1388962283:
                              var10000 = var0.findStatic(var7, var5, var6);
                              break label225;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var17 = var10003.charAt(var16) - 242 + 207 ^ 129;
                        var10003.setCharAt(var16, (char)((((((var17 & '\uf000') >> 12 | var17 << 4) ^ 39) - 81 ^ 96) - 202 ^ 155) + 170));
                        var16 += -2097227425 - (-1684464958 << -1658991552) ^ -412762468;
                     }
                  }

                  var19 = var10003.charAt(var16);
                  var17 = ((var19 & 'ﾀ') >> 7 | var19 << 9) + 237 - 149 - 122 - 142 - 3 + 147 - 236 + 254;
                  int var10004 = (var17 & '\uffff') >> 0;
                  var18 = var17;
                  var19 = (char)(var10004 | var17 << 16);
                  var13.setCharAt(var16, (char)(var10004 | var18 << 16));
                  var16 += (250206056 << -753456281 | 1) & 1049425;
               }
            }

            var19 = var10003.charAt(var16);
            var10003.setCharAt(var16, (char)(((((((((((((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) & '\uf000') >> 12 | (((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) << 4) & '\ufff0') >> 4 | (((((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) & '\uf000') >> 12 | (((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) << 4) << 12) + 23 ^ 57) & '\ufffe') >> 1 | ((((((((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) & '\uf000') >> 12 | (((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) << 4) & '\ufff0') >> 4 | (((((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) & '\uf000') >> 12 | (((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) << 4) << 12) + 23 ^ 57) << 15) & '\ufff8') >> 3 | ((((((((((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) & '\uf000') >> 12 | (((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) << 4) & '\ufff0') >> 4 | (((((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) & '\uf000') >> 12 | (((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) << 4) << 12) + 23 ^ 57) & '\ufffe') >> 1 | ((((((((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) & '\uf000') >> 12 | (((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) << 4) & '\ufff0') >> 4 | (((((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) & '\uf000') >> 12 | (((var19 & '\ufffe') >> 1 | var19 << 15) ^ 189) << 4) << 12) + 23 ^ 57) << 15) << 13) - 183 + 151));
            var16 += (-1772039152 | 2050701980 >> 2080189037) ^ -1771842088;
         }
      }

      zie[((var10 - 709984958 - 979800997 ^ 1831283606) - 86819568 + 1741717332 - 1276065317 + 978836110 ^ 922035698) + 1643258070 ^ 919636138] = var10000;
      MethodHandle var11 = var10000.asType(var2);
      return new MutableCallSite(var11);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = zie[((var10 + 1098157344 ^ 107163135) - 522707696 - 1747854359 - 1756963950 - 1887345126 + 857700515 ^ 313468645) - 1327328078 ^ 270029880];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = -914237884 & 1289779755 ^ 1216369152;

         label236:
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
            if (var17 >= var18) {
               String var5 = var10003.toString();
               var13 = (String)var3[2];
               var10001 = new StringBuilder;
               var10003 = var10001;
               var10002 = var10001;
               var16 = var13;
               var14 = var10002;
               var10003.<init>(var16);
               var17 = 126724696 - -1389926945 ^ 1516651641;

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
                     Class var6 = Class.forName(var10003.toString(), false, hb.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = (463346186 >>> 123288161 | 0) & -1845477166;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), hb.class.getClassLoader()).returnType();
                           switch(((((var4 ^ 674338404) - 932122971 ^ 1243616795 ^ 1866394435 ^ 247166900) + 1627668890 ^ 1487431338) - 4465380 ^ 121204141) + 634177080) {
                           case 317681343:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label236;
                           case 639117979:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label236;
                           case 1912829924:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label236;
                           case 2067634122:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label236;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var20 = var10003.charAt(var17);
                        var10003.setCharAt(var17, (char)(((((((((var20 & '￼') >> 2 | var20 << 14) ^ 165) + 184 - 36 & '\ufff8') >> 3 | (((var20 & '￼') >> 2 | var20 << 14) ^ 165) + 184 - 36 << 13) - 133 & '￼') >> 2 | (((((var20 & '￼') >> 2 | var20 << 14) ^ 165) + 184 - 36 & '\ufff8') >> 3 | (((var20 & '￼') >> 2 | var20 << 14) ^ 165) + 184 - 36 << 13) - 133 << 14) + 127 ^ 67) - 59));
                        var17 += -1154766199 >> -770843217 ^ -35242;
                     }
                  }

                  var18 = var10003.charAt(var17) + 42;
                  var10003.setCharAt(var17, (char)(((((var18 & '\ufff0') >> 4 | var18 << 12) ^ 137 ^ 234 ^ 113) + 184 ^ 96 ^ 124) + 190 ^ 140));
                  var17 += (444645265 & 366617553 | 1) & -1505585113;
               }
            }

            var18 = var10003.charAt(var17) ^ 38;
            var18 = ((((((((var18 & '耀') >> 15 | var18 << 1) & '\ufff0') >> 4 | ((var18 & '耀') >> 15 | var18 << 1) << 12) & 'ﰀ') >> 10 | ((((var18 & '耀') >> 15 | var18 << 1) & '\ufff0') >> 4 | ((var18 & '耀') >> 15 | var18 << 1) << 12) << 6) - 252 + 139 + 88 & 'ﰀ') >> 10 | ((((((var18 & '耀') >> 15 | var18 << 1) & '\ufff0') >> 4 | ((var18 & '耀') >> 15 | var18 << 1) << 12) & 'ﰀ') >> 10 | ((((var18 & '耀') >> 15 | var18 << 1) & '\ufff0') >> 4 | ((var18 & '耀') >> 15 | var18 << 1) << 12) << 6) - 252 + 139 + 88 << 6) + 214;
            int var10004 = (var18 & 0) >> 16;
            var19 = var18;
            var20 = (char)(var10004 | var18 << 0);
            var14.setCharAt(var17, (char)(var10004 | var19 << 0));
            var17 += 2128098060 - -1609010245 ^ -557858992;
         }
      }

      if (!var11) {
         zie[((var10 + 1098157344 ^ 107163135) - 522707696 - 1747854359 - 1756963950 - 1887345126 + 857700515 ^ 313468645) - 1327328078 ^ 270029880] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
