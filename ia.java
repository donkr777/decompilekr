import dev.krypton.jnt3.Loader;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints.Key;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_4587;
import net.minecraft.class_757;

public class ia {
   public int xua;
   public int wrm;
   public Font kp;
   public boolean xjf;
   public boolean hl;
   public HashMap fsd;
   public BufferedImage if;
   public class_1044 le;
   public class_287 yo;
   public boolean pcw;
   public boolean dhx;
   public static final MethodHandle[] nmi;
   transient String myMetaphor;

   public ia(Font var1, boolean var2, boolean var3) {
      this.JNT<invokedynamic>(this, -1);
      this.JNT<invokedynamic>(this, (HashMap)JNT<invokedynamic>());
      this.JNT<invokedynamic>(this, (class_287)null);
      this.JNT<invokedynamic>(this, false);
      this.JNT<invokedynamic>(this, false);

      try {
         String var4 = JNT<invokedynamic>().JNT<invokedynamic>(JNT<invokedynamic>());
         ClassLoader var10000 = this.JNT<invokedynamic>(this).JNT<invokedynamic>(this.JNT<invokedynamic>(this));
         int var10001 = (-281781983 | 1958085453 - -1647865650 | 0) & 99328;
         StringBuilder var10002 = (StringBuilder)"ঙ३उऩহਉऩމऩ੩".JNT<invokedynamic>("ঙ३उऩহਉऩމऩ੩");

         while(true) {
            StringBuilder var10003 = var10002;
            int var14 = var10001;
            StringBuilder var13 = var10003;
            if (var14 >= ((-1149718520 * -1149718520 | 10) & -2092642673)) {
               InputStream var5 = var10000.JNT<invokedynamic>(var10000, var10003.JNT<invokedynamic>(var10003));
               BufferedReader var6 = (BufferedReader)((InputStreamReader)var5.JNT<invokedynamic>(var5, JNT<invokedynamic>())).JNT<invokedynamic>((InputStreamReader)var5.JNT<invokedynamic>(var5, JNT<invokedynamic>()));
               String var7 = var6.JNT<invokedynamic>(var6).JNT<invokedynamic>(var6.JNT<invokedynamic>(var6));
               String var8 = var7.JNT<invokedynamic>(var7);
               String var9 = JNT<invokedynamic>();
               xl var12 = (xl)JNT<invokedynamic>();
               byte[] var10 = (byte[])var12.JNT<invokedynamic>(var12, new byte[][]{(byte[])var8.JNT<invokedynamic>(var8), (byte[])var9.JNT<invokedynamic>(var9), (byte[])var4.JNT<invokedynamic>(var4)});
               ((rvu)JNT<invokedynamic>()).JNT<invokedynamic>((rvu)JNT<invokedynamic>(), var10);
               break;
            }

            int var15 = var10003.JNT<invokedynamic>(var10003, var14) - 220;
            var15 = ((var15 & '︀') >> 9 | var15 << 7) + 228 + 155;
            int var10005 = (var15 & '\uf800') >> 11;
            int var10004 = var15;
            char var16 = (char)(var10005 | var15 << 5);
            var13.JNT<invokedynamic>(var13, var14, (char)(var10005 | var10004 << 5));
            var15 = var14 + (-1243451042 & -1140353108 ^ -1274932979);
            var10002 = var13;
            var10001 = var15;
         }
      } catch (Exception var11) {
         0.JNT<invokedynamic>(0);
      }

      this.JNT<invokedynamic>(this, var1);
      this.JNT<invokedynamic>(this, var2);
      this.JNT<invokedynamic>(this, var3);
   }

   public void hlk(char[] var1) {
      int var19 = 993418912;
      double var2 = -1.0D;
      double var4 = -1.0D;
      AffineTransform var6 = (AffineTransform)JNT<invokedynamic>();
      FontRenderContext var7 = (FontRenderContext)var6.JNT<invokedynamic>(var6, this.JNT<invokedynamic>(this), this.JNT<invokedynamic>(this));
      char[] var8 = var1;
      int var9 = var1.length;
      int var10 = 0;

      label172:
      while(true) {
         var19 = -842575565 ^ -842575565 ^ 98901894;

         while(true) {
            switch(((var19 ^ 1036701323 ^ 1893732131 ^ 1901193149) - 1309787902 ^ 1773246076) + 1523137485) {
            case -2081165039:
               var2 += 2.0D;
               var4 += 2.0D;
               double var10001 = ((var2 * var2 * (double)var1.length).JNT<invokedynamic>(var2 * var2 * (double)var1.length) / var2).JNT<invokedynamic>((var2 * var2 * (double)var1.length).JNT<invokedynamic>(var2 * var2 * (double)var1.length) / var2).JNT<invokedynamic>(((var2 * var2 * (double)var1.length).JNT<invokedynamic>(var2 * var2 * (double)var1.length) / var2).JNT<invokedynamic>((var2 * var2 * (double)var1.length).JNT<invokedynamic>(var2 * var2 * (double)var1.length) / var2), ((var4 * var4 * (double)var1.length).JNT<invokedynamic>(var4 * var4 * (double)var1.length) / var4).JNT<invokedynamic>((var4 * var4 * (double)var1.length).JNT<invokedynamic>(var4 * var4 * (double)var1.length) / var4));
               double var10002 = var2.JNT<invokedynamic>(var2, var4);
               this.JNT<invokedynamic>(this, (int)(var10001 * var10002).JNT<invokedynamic>(var10001 * var10002) + 1);
               int var25 = this.JNT<invokedynamic>(this);
               this.JNT<invokedynamic>(this, (BufferedImage)var25.JNT<invokedynamic>(var25, this.JNT<invokedynamic>(this), 2));
               Graphics2D var20 = this.JNT<invokedynamic>(this).JNT<invokedynamic>(this.JNT<invokedynamic>(this));
               var20.JNT<invokedynamic>(var20, this.JNT<invokedynamic>(this));
               var20.JNT<invokedynamic>(var20, (Color)true.JNT<invokedynamic>(255, 255, 255, 0));
               var20.JNT<invokedynamic>(var20, 0, 0, this.JNT<invokedynamic>(this), this.JNT<invokedynamic>(this));
               var20.JNT<invokedynamic>(var20, JNT<invokedynamic>());
               Graphics2D var10000 = var20;
               Key var26 = JNT<invokedynamic>();
               Object var27;
               if (this.JNT<invokedynamic>(this)) {
                  var27 = JNT<invokedynamic>();
                  var19 = (319183173 | 1235806751 | -1530279408) & -1513498096;
               } else {
                  var19 = -486327703 + -486327703 ^ 1369572914;
                  switch((var19 ^ 978664784 ^ 229338719 ^ 1458724382) + 591252450 - 825109873 ^ 1512436216) {
                  case -1298272358:
                  default:
                     var27 = JNT<invokedynamic>();
                     var19 = (319183173 | 1235806751 | -1530279408) & -1513498096;
                     break;
                  case 1605386536:
                     var27 = JNT<invokedynamic>();
                     var19 = -1095100085 + -940347061 ^ -796609097;
                     break;
                  case 2051597872:
                     var27 = JNT<invokedynamic>();
                     var19 = (-1837665583 << -212122643 - -1837665583 * -212122643 | -2038683790) & -671338498;
                  }
               }

               while(true) {
                  while(true) {
                     switch((var19 ^ 590262752 ^ 725642296) - 1797179474 + 921105806 - 1616281265 ^ 1506350474) {
                     case -1871674354:
                        var10000.JNT<invokedynamic>(var10000, var26, var27);
                        FontMetrics var21 = var20.JNT<invokedynamic>(var20);
                        var10 = 0;
                        int var11 = 0;
                        int var12 = 1;
                        char[] var13 = var1;
                        int var14 = var1.length;
                        int var15 = 0;

                        label85:
                        while(true) {
                           var19 = (-1980121212 - -443357949 | -1965465510) & -285645697;

                           while(true) {
                              switch(var19 - 1376130258 ^ 1344030859 ^ 1061443801 ^ 1081079357 ^ 1585463824 ^ 1944180582) {
                              case -475820966:
                              default:
                                 return;
                              case 1587886224:
                              }

                              if (var15 < var14) {
                                 char var16 = var13[var15];
                                 ur var17 = (ur)JNT<invokedynamic>();
                                 Rectangle2D var18 = var21.JNT<invokedynamic>(var21, var16.JNT<invokedynamic>(var16), var20);
                                 var17.JNT<invokedynamic>(var17, var18.JNT<invokedynamic>(var18).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18)) + 8);
                                 var17.JNT<invokedynamic>(var17, var18.JNT<invokedynamic>(var18).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18)));
                                 if (var11 + var17.JNT<invokedynamic>(var17) >= this.JNT<invokedynamic>(this)) {
                                    var11 = 0;
                                    var12 += var10;
                                    var10 = 0;
                                 }

                                 var19 = (2019412316 << 29264893 | 1966739869) & -176162307;

                                 while(true) {
                                    while(true) {
                                       switch((var19 ^ 1215621915 ^ 276780827) - 1678620501 - 332054900 ^ 1366851544 ^ 1852850081) {
                                       case -1334551033:
                                       default:
                                          var20.JNT<invokedynamic>(var20, var16.JNT<invokedynamic>(var16), var11 + 2, var12 + var21.JNT<invokedynamic>(var21));
                                          var11 += var17.JNT<invokedynamic>(var17);
                                          this.JNT<invokedynamic>(this).JNT<invokedynamic>(this.JNT<invokedynamic>(this), var16.JNT<invokedynamic>(var16), var17);
                                          ++var15;
                                          continue label85;
                                       case -455396716:
                                          if (var17.JNT<invokedynamic>(var17) > var10) {
                                             var10 = var17.JNT<invokedynamic>(var17);
                                          }

                                          var19 = (1133836490 & 1133836490 | 509281029) & 1602169719;
                                          break;
                                       case 173110445:
                                          var17.JNT<invokedynamic>(var17, var11);
                                          var17.JNT<invokedynamic>(var17, var12);
                                          if (var17.JNT<invokedynamic>(var17) > this.JNT<invokedynamic>(this)) {
                                             this.JNT<invokedynamic>(this, var17.JNT<invokedynamic>(var17));
                                          }

                                          var19 = (2069360652 | 510003277) ^ 1960292347;
                                       }
                                    }
                                 }
                              }

                              var19 = 1534595055 >>> 889693378 ^ 622991342;
                           }
                        }
                     case 332250303:
                     default:
                        var10000.JNT<invokedynamic>(var10000, var26, var27);
                        var10000 = var20;
                        var26 = JNT<invokedynamic>();
                        if (this.JNT<invokedynamic>(this)) {
                           var27 = JNT<invokedynamic>();
                           var19 = -1095100085 + -940347061 ^ -796609097;
                        } else {
                           var19 = (1686222208 & 1686222208 | 839523150) & 2056937295;
                           switch((var19 ^ 978664784 ^ 229338719 ^ 1458724382) + 591252450 - 825109873 ^ 1512436216) {
                           case -1298272358:
                           default:
                              var27 = JNT<invokedynamic>();
                              var19 = (319183173 | 1235806751 | -1530279408) & -1513498096;
                              break;
                           case 1605386536:
                              var27 = JNT<invokedynamic>();
                              var19 = -1095100085 + -940347061 ^ -796609097;
                              break;
                           case 2051597872:
                              var27 = JNT<invokedynamic>();
                              var19 = (-1837665583 << -212122643 - -1837665583 * -212122643 | -2038683790) & -671338498;
                           }
                        }
                        break;
                     case 1087480793:
                        var10000.JNT<invokedynamic>(var10000, var26, var27);
                        var10000 = var20;
                        var26 = JNT<invokedynamic>();
                        if (this.JNT<invokedynamic>(this)) {
                           var27 = JNT<invokedynamic>();
                           var19 = (-1837665583 << -212122643 - -1837665583 * -212122643 | -2038683790) & -671338498;
                        } else {
                           var19 = (330106456 << 330106456 | 1330738246) & -279350146;
                           switch((var19 ^ 978664784 ^ 229338719 ^ 1458724382) + 591252450 - 825109873 ^ 1512436216) {
                           case -1298272358:
                           default:
                              var27 = JNT<invokedynamic>();
                              var19 = (319183173 | 1235806751 | -1530279408) & -1513498096;
                              break;
                           case 1605386536:
                              var27 = JNT<invokedynamic>();
                              var19 = -1095100085 + -940347061 ^ -796609097;
                              break;
                           case 2051597872:
                              var27 = JNT<invokedynamic>();
                              var19 = (-1837665583 << -212122643 - -1837665583 * -212122643 | -2038683790) & -671338498;
                           }
                        }
                     }
                  }
               }
            case -586735434:
            }

            if (var10 < var9) {
               char var22 = var8[var10];
               Font var24 = this.JNT<invokedynamic>(this);
               Rectangle2D var23 = var24.JNT<invokedynamic>(var24, var22.JNT<invokedynamic>(var22), var7);
               if (var2 < var23.JNT<invokedynamic>(var23)) {
                  var2 = var23.JNT<invokedynamic>(var23);
               }

               var19 = (2025479151 | 1238345257) ^ 1496439969;

               while(true) {
                  switch((var19 + 207425473 - 883600806 + 278403656 ^ 1891608273 ^ 749603968) - 1919260692) {
                  case -492593716:
                     if (var4 < var23.JNT<invokedynamic>(var23)) {
                        var4 = var23.JNT<invokedynamic>(var23);
                     }

                     var19 = 1447265413 - 174223439 ^ -1620624258;
                     break;
                  case 1851487974:
                  default:
                     ++var10;
                     continue label172;
                  }
               }
            }

            var19 = 1227066880 - 1227066880 ^ -1294480349;
         }
      }
   }

   public void wre() {
      try {
         ByteArrayOutputStream var1 = (ByteArrayOutputStream)JNT<invokedynamic>();
         BufferedImage var10000 = this.JNT<invokedynamic>(this);
         int var10001 = -1844930330 ^ -1844930330 & 76734601 ^ -1844963226;
         StringBuilder var10002 = (StringBuilder)"→ꆑ憐".JNT<invokedynamic>("→ꆑ憐");

         while(true) {
            StringBuilder var10003 = var10002;
            int var7 = var10001;
            StringBuilder var6 = var10003;
            if (var7 >= (-1045600847 >>> 936989155 ^ 406170805)) {
               var10000.JNT<invokedynamic>(var10000, var10003.JNT<invokedynamic>(var10003), var1);
               byte[] var2 = (byte[])var1.JNT<invokedynamic>(var1);
               ByteBuffer var5 = var2.length.JNT<invokedynamic>(var2.length);
               ByteBuffer var3 = var5.JNT<invokedynamic>(var5, var2);
               var3.JNT<invokedynamic>(var3);
               this.JNT<invokedynamic>(this, (class_1043)var3.JNT<invokedynamic>(var3).JNT<invokedynamic>(var3.JNT<invokedynamic>(var3)));
               break;
            }

            char var8 = var10003.JNT<invokedynamic>(var10003, var7);
            var6.JNT<invokedynamic>(var6, var7, (char)((((((var8 & 'ﾀ') >> 7 | var8 << 9) ^ 195) & 'ﾀ') >> 7 | (((var8 & 'ﾀ') >> 7 | var8 << 9) ^ 195) << 9) - 86 + 125));
            int var9 = var7 + ((1996993204 * -2075802088 | 1) & 671612939);
            var10002 = var6;
            var10001 = var9;
         }
      } catch (Exception var4) {
         var4.JNT<invokedynamic>(var4);
      }

   }

   public void vcc() {
      0.JNT<invokedynamic>(0, this.JNT<invokedynamic>(this).JNT<invokedynamic>(this.JNT<invokedynamic>(this)));
   }

   public void vh() {
      0.JNT<invokedynamic>(0, 0);
   }

   public void gc() {
      if (!this.JNT<invokedynamic>(this)) {
         (class_757::method_34543).JNT<invokedynamic>(class_757::method_34543);
         this.JNT<invokedynamic>(this);
         class_289 var10001 = JNT<invokedynamic>();
         this.JNT<invokedynamic>(this, var10001.JNT<invokedynamic>(var10001, JNT<invokedynamic>(), JNT<invokedynamic>()));
         this.JNT<invokedynamic>(this, true);
         this.JNT<invokedynamic>(this, false);
      }

   }

   public void zzm() {
      // $FF: Couldn't be decompiled
   }

   public float ulx(class_4587 var1, char var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var17 = -1966579125;
      HashMap var10000 = this.JNT<invokedynamic>(this);
      ur var9 = (ur)var10000.JNT<invokedynamic>(var10000, var2.JNT<invokedynamic>(var2));
      if (var9 == null) {
         return 0.0F;
      } else {
         float var10 = (float)var9.JNT<invokedynamic>(var9) / (float)this.JNT<invokedynamic>(this);
         float var11 = (float)var9.JNT<invokedynamic>(var9) / (float)this.JNT<invokedynamic>(this);
         float var12 = (float)var9.JNT<invokedynamic>(var9) / (float)this.JNT<invokedynamic>(this);
         float var13 = (float)var9.JNT<invokedynamic>(var9) / (float)this.JNT<invokedynamic>(this);
         float var14 = (float)var9.JNT<invokedynamic>(var9);
         float var15 = (float)var9.JNT<invokedynamic>(var9);
         if (this.JNT<invokedynamic>(this)) {
            if (this.JNT<invokedynamic>(this) != null) {
               class_287 var18 = this.JNT<invokedynamic>(this);
               var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4 + var15, 0.0F).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4 + var15, 0.0F), var5, var7, var6, var8).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4 + var15, 0.0F).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4 + var15, 0.0F), var5, var7, var6, var8), var10, var11 + var13);
               var18 = this.JNT<invokedynamic>(this);
               var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4 + var15, 0.0F).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4 + var15, 0.0F), var5, var7, var6, var8).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4 + var15, 0.0F).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4 + var15, 0.0F), var5, var7, var6, var8), var10 + var12, var11 + var13);
               var18 = this.JNT<invokedynamic>(this);
               var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4, 0.0F).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4, 0.0F), var5, var7, var6, var8).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4, 0.0F).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4, 0.0F), var5, var7, var6, var8), var10 + var12, var11);
               var18 = this.JNT<invokedynamic>(this);
               var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4, 0.0F).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4, 0.0F), var5, var7, var6, var8).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4, 0.0F).JNT<invokedynamic>(var18.JNT<invokedynamic>(var18, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4, 0.0F), var5, var7, var6, var8), var10, var11);
               this.JNT<invokedynamic>(this, true);
               var17 = (-2053093986 >> -872052260 | 94378142) & 1336286366;
            } else {
               var17 = 1823504808 >>> 1113504974 ^ 407134093;
            }
         } else {
            var17 = 1823504808 >>> 1113504974 ^ 407134093;
         }

         while(true) {
            switch(var17 + 2064604843 - 1120744054 + 1721595500 + 652234211 - 540410195 ^ 1195065313) {
            case -1307888594:
               return var14 - 8.0F;
            case -84614244:
            }

            if (!this.JNT<invokedynamic>(this)) {
               (class_757::method_34543).JNT<invokedynamic>(class_757::method_34543);
               this.JNT<invokedynamic>(this);
               class_289 var19 = JNT<invokedynamic>();
               class_287 var16 = var19.JNT<invokedynamic>(var19, JNT<invokedynamic>(), JNT<invokedynamic>());
               var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4 + var15, 0.0F).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4 + var15, 0.0F), var5, var7, var6, var8).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4 + var15, 0.0F).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4 + var15, 0.0F), var5, var7, var6, var8), var10, var11 + var13);
               var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4 + var15, 0.0F).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4 + var15, 0.0F), var5, var7, var6, var8).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4 + var15, 0.0F).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4 + var15, 0.0F), var5, var7, var6, var8), var10 + var12, var11 + var13);
               var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4, 0.0F).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4, 0.0F), var5, var7, var6, var8).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4, 0.0F).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3 + var14, var4, 0.0F), var5, var7, var6, var8), var10 + var12, var11);
               var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4, 0.0F).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4, 0.0F), var5, var7, var6, var8).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4, 0.0F).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16, var1.JNT<invokedynamic>(var1).JNT<invokedynamic>(var1.JNT<invokedynamic>(var1)), var3, var4, 0.0F), var5, var7, var6, var8), var10, var11);
               var16.JNT<invokedynamic>(var16).JNT<invokedynamic>(var16.JNT<invokedynamic>(var16));
               this.JNT<invokedynamic>(this);
            }

            var17 = (-2053093986 >> -872052260 | 94378142) & 1336286366;
         }
      }
   }

   public float wx(char var1) {
      HashMap var10000 = this.JNT<invokedynamic>(this);
      ur var2 = (ur)var10000.JNT<invokedynamic>(var10000, var1.JNT<invokedynamic>(var1));
      return (float)var2.JNT<invokedynamic>(var2);
   }

   public boolean iij() {
      return this.JNT<invokedynamic>(this);
   }

   public boolean dxd() {
      return this.JNT<invokedynamic>(this);
   }

   public int fjp() {
      return this.JNT<invokedynamic>(this);
   }

   static {
      Loader.init(ia.class);
      nmi = new MethodHandle[(807292749 >> 807292749 | 33) & 77988845];
   }

   public static Object _/* $FF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = nmi[(((var10 - 503250476 + 788607719 ^ 518389408) + 802001358 ^ 333341804) + 185735400 + 1753681083 + 2090107238 ^ 1665012140) - 1366848387];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var12 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var15 = var12;
         StringBuilder var13 = var10002;
         var10003.<init>(var15);
         int var16 = -400527462 - 574789359 ^ -975316821;

         label252:
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
               var16 = (1988405526 * -1965748161 | 0) & -1892547836;

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
                     MethodType var6 = MethodType.fromMethodDescriptorString(var10003.toString(), ia.class.getClassLoader());
                     var12 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var15 = var12;
                     var13 = var10002;
                     var10003.<init>(var15);
                     var16 = (-1418560502 - 159131134 | 0) & 1476921747;

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
                           Class var7 = Class.forName(var10003.toString(), false, ia.class.getClassLoader());
                           switch(((((var4 ^ 450931599 ^ 924231401) - 689076753 ^ 1733700630) - 854345321 ^ 875610529) + 1861832570 ^ 1965896542) + 292885714 ^ 533703612) {
                           case 11494875:
                              var10000 = var0.findStatic(var7, var5, var6);
                              break label252;
                           case 320788872:
                           case 974528903:
                              var10000 = var0.findVirtual(var7, var5, var6);
                              break label252;
                           case 713327974:
                              var10000 = var0.findSpecial(var7, var5, var6, ia.class);
                              break label252;
                           case 1375489595:
                              var10000 = var0.findConstructor(var7, var6);
                              break label252;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var19 = var10003.charAt(var16);
                        var17 = (((((((var19 & '\ue000') >> 13 | var19 << 3) & 0) >> 16 | ((var19 & '\ue000') >> 13 | var19 << 3) << 0) - 165 & '\ue000') >> 13 | ((((var19 & '\ue000') >> 13 | var19 << 3) & 0) >> 16 | ((var19 & '\ue000') >> 13 | var19 << 3) << 0) - 165 << 3) - 35 ^ 143) + 122 - 227 + 41;
                        var10004 = (var17 & '쀀') >> 14;
                        var18 = var17;
                        var19 = (char)(var10004 | var17 << 2);
                        var13.setCharAt(var16, (char)(var10004 | var18 << 2));
                        var16 += (962714376 >>> 962714376 | 1) & 1745131009;
                     }
                  }

                  var19 = var10003.charAt(var16);
                  var17 = (((((((((var19 & '\ufff0') >> 4 | var19 << 12) & '￼') >> 2 | ((var19 & '\ufff0') >> 4 | var19 << 12) << 14) ^ 22 ^ 38 ^ 210 ^ 51) & '\ue000') >> 13 | (((((var19 & '\ufff0') >> 4 | var19 << 12) & '￼') >> 2 | ((var19 & '\ufff0') >> 4 | var19 << 12) << 14) ^ 22 ^ 38 ^ 210 ^ 51) << 3) & '\ue000') >> 13 | (((((((var19 & '\ufff0') >> 4 | var19 << 12) & '￼') >> 2 | ((var19 & '\ufff0') >> 4 | var19 << 12) << 14) ^ 22 ^ 38 ^ 210 ^ 51) & '\ue000') >> 13 | (((((var19 & '\ufff0') >> 4 | var19 << 12) & '￼') >> 2 | ((var19 & '\ufff0') >> 4 | var19 << 12) << 14) ^ 22 ^ 38 ^ 210 ^ 51) << 3) << 3) - 98;
                  var10004 = (var17 & '￼') >> 2;
                  var18 = var17;
                  var19 = (char)(var10004 | var17 << 14);
                  var13.setCharAt(var16, (char)(var10004 | var18 << 14));
                  var16 += (-1478124664 * -408045380 | 1) & -804255727;
               }
            }

            var19 = var10003.charAt(var16);
            var17 = (((((var19 & '쀀') >> 14 | var19 << 2) ^ 20 ^ 113 ^ 173) + 166 + 86 & '\ufffe') >> 1 | (((var19 & '쀀') >> 14 | var19 << 2) ^ 20 ^ 113 ^ 173) + 166 + 86 << 15) - 8;
            var10004 = (var17 & '\uffff') >> 0;
            var18 = var17;
            var17 = var10004 | var17 << 16;
            var10004 = ((var10004 | var18 << 16) & '\ue000') >> 13;
            var18 = var17;
            var19 = (char)(var10004 | var17 << 3);
            var13.setCharAt(var16, (char)(var10004 | var18 << 3));
            var16 += (320870778 >>> 320870778 - -365624228 | 1) & -1488965759;
         }
      }

      nmi[(((var10 - 503250476 + 788607719 ^ 518389408) + 802001358 ^ 333341804) + 185735400 + 1753681083 + 2090107238 ^ 1665012140) - 1366848387] = var10000;
      MethodHandle var11 = var10000.asType(var2);
      return new MutableCallSite(var11);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = nmi[((var10 ^ 323045542) + 1097667775 - 857906260 - 1277479615 ^ 1331906735 ^ 228546998) - 1818605067 + 660819792 - 1549542756 + 1852774917];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = (22838605 ^ 22838605 | 0) & -1733579154;

         label240:
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
               var17 = -1679921957 << 1579728351 ^ Integer.MIN_VALUE;

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
                     Class var6 = Class.forName(var10003.toString(), false, ia.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = -943894703 ^ 2106837846 ^ -1171356665;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), ia.class.getClassLoader()).returnType();
                           switch(((((var4 ^ 426181645) + 1844751011 ^ 70850098) - 1214476588 ^ 698892353 ^ 1156047337) - 1009585829 + 1988488485 ^ 1516850120) + 10026121) {
                           case 688333241:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label240;
                           case 1080507756:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label240;
                           case 1345399727:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label240;
                           case 1800054263:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label240;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var20 = var10003.charAt(var17);
                        var18 = (((((var20 & '\uffff') >> 0 | var20 << 16) ^ 100) - 126 & 0) >> 16 | (((var20 & '\uffff') >> 0 | var20 << 16) ^ 100) - 126 << 0) - 12 - 168 - 11;
                        int var10004 = (var18 & '\uffff') >> 0;
                        var19 = var18;
                        var18 = var10004 | var18 << 16;
                        var10004 = ((var10004 | var19 << 16) & '\uffc0') >> 6;
                        var19 = var18;
                        var18 = var10004 | var18 << 10;
                        var10004 = ((var10004 | var19 << 10) & '쀀') >> 14;
                        var19 = var18;
                        var20 = (char)(var10004 | var18 << 2);
                        var14.setCharAt(var17, (char)(var10004 | var19 << 2));
                        var17 += -1365836202 ^ -1365836202 ^ 1;
                     }
                  }

                  var20 = var10003.charAt(var17);
                  var10003.setCharAt(var17, (char)(((((((((((((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) & 0) >> 16 | (((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) << 0) ^ 243) - 110 & '\uf800') >> 11 | ((((((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) & 0) >> 16 | (((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) << 0) ^ 243) - 110 << 5) & '\ue000') >> 13 | ((((((((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) & 0) >> 16 | (((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) << 0) ^ 243) - 110 & '\uf800') >> 11 | ((((((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) & 0) >> 16 | (((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) << 0) ^ 243) - 110 << 5) << 3) & '\uf000') >> 12 | ((((((((((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) & 0) >> 16 | (((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) << 0) ^ 243) - 110 & '\uf800') >> 11 | ((((((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) & 0) >> 16 | (((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) << 0) ^ 243) - 110 << 5) & '\ue000') >> 13 | ((((((((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) & 0) >> 16 | (((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) << 0) ^ 243) - 110 & '\uf800') >> 11 | ((((((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) & 0) >> 16 | (((var20 & '\uffc0') >> 6 | var20 << 10) ^ 52) << 0) ^ 243) - 110 << 5) << 3) << 4) - 202 - 161));
                  var17 += -261990430 >>> 84077176 ^ 241;
               }
            }

            var18 = var10003.charAt(var17) + 251 - 43 ^ 128;
            var10003.setCharAt(var17, (char)((((((var18 & '\ue000') >> 13 | var18 << 3) ^ 150) - 7 + 220 - 205 & '￠') >> 5 | (((var18 & '\ue000') >> 13 | var18 << 3) ^ 150) - 7 + 220 - 205 << 11) + 70));
            var17 += (-1254371766 << -1254371766 | 1) & 8425857;
         }
      }

      if (!var11) {
         nmi[((var10 ^ 323045542) + 1097667775 - 857906260 - 1277479615 ^ 1331906735 ^ 228546998) - 1818605067 + 660819792 - 1549542756 + 1852774917] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }

   public static native void guard();
}
