import java.awt.Font;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Random;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_4587;

public class aqb {
   public Random hip;
   public float ene;
   public float eq;
   public int[] jv;
   public boolean par;
   public boolean xh;
   public boolean nvi;
   public boolean jrv;
   public ia fb;
   public ia rq;
   public ia gtb;
   public ia inh;
   public static final MethodHandle[] wlf = new MethodHandle[(1642627444 << 237503739 | 262) & 130675590];
   transient String myMetaphor;

   public aqb(ia var1, ia var2, ia var3, ia var4) {
      int var10 = -114697918;
      super();
      this.JNT<invokedynamic>(this, (Random)JNT<invokedynamic>());
      this.JNT<invokedynamic>(this, new int[32]);
      this.JNT<invokedynamic>(this, var1);
      this.JNT<invokedynamic>(this, var2);
      this.JNT<invokedynamic>(this, var3);
      this.JNT<invokedynamic>(this, var4);
      int var5 = 0;

      label42:
      while(true) {
         var10 = (-1677636097 | -1677636097) ^ 170334643;

         while(true) {
            switch(((var10 ^ 1173011593) - 1572191510 + 335118239 ^ 2048247105) - 342861700 - 232676909) {
            case -1866274886:
            default:
               return;
            case -843618210:
            }

            if (var5 < 32) {
               int var6 = (var5 >> 3 & 1) * 85;
               int var7 = (var5 >> 2 & 1) * 170 + var6;
               int var8 = (var5 >> 1 & 1) * 170 + var6;
               int var9 = (var5 & 1) * 170 + var6;
               if (var5 == 6) {
                  var7 += 85;
               }

               var10 = (-1162571296 >> 1258716553 | 1612710928) & 1814728628;

               while(true) {
                  switch(((var10 + 1495608677 ^ 60705801) - 1628653870 - 382464124 ^ 1809598834) + 1048226137) {
                  case 1671634425:
                  default:
                     if (var5 >= 16) {
                        var7 /= 4;
                        var8 /= 4;
                        var9 /= 4;
                     }

                     var10 = (-566940347 ^ -1788436948 | 1906314368) & -101576784;
                     break;
                  case 1911629673:
                     this.JNT<invokedynamic>(this)[var5] = (var7 & 255) << 16 | (var8 & 255) << 8 | var9 & 255;
                     ++var5;
                     continue label42;
                  }
               }
            }

            var10 = (472800213 * -2079944323 | 53205288) & 1467734378;
         }
      }
   }

   public static aqb bws(String var0, int var1, boolean var2, boolean var3, boolean var4) {
      int var10 = -1107799037;
      char[] var5 = new char[256];
      int var6 = 0;

      label46:
      while(true) {
         var10 = 1253191169 >>> -1215995006 ^ -757591972;

         while(true) {
            switch(var10 + 2098929195 + 363348449 + 839021565 - 1114563862 - 473292837 - 559299365) {
            case 88043397:
            default:
               if (var6 < var5.length) {
                  var5[var6] = (char)var6;
                  ++var6;
                  continue label46;
               }

               var10 = (-549464355 >> 1133334575 | 25190928) & 25951029;
               break;
            case 1180093918:
               Font var10000 = (Font)var0.JNT<invokedynamic>(var0, 0, var1);
               ia var11 = (ia)var10000.JNT<invokedynamic>(var10000, true, true);
               var11.JNT<invokedynamic>(var11, var5);
               var11.JNT<invokedynamic>(var11);
               ia var7 = var11;
               ia var8 = var11;
               ia var9 = var11;
               if (var2) {
                  var10000 = (Font)var0.JNT<invokedynamic>(var0, 1, var1);
                  var7 = (ia)var10000.JNT<invokedynamic>(var10000, true, true);
                  var7.JNT<invokedynamic>(var7, var5);
                  var7.JNT<invokedynamic>(var7);
               }

               var10 = (861503119 << 861503119 | 138174024) & 1849646973;

               while(true) {
                  switch((var10 ^ 2125133346) - 4253017 - 2006621492 - 1847667261 - 1851113361 ^ 1739767452) {
                  case -1678671213:
                     if (var3) {
                        var10000 = (Font)var0.JNT<invokedynamic>(var0, 2, var1);
                        var8 = (ia)var10000.JNT<invokedynamic>(var10000, true, true);
                        var8.JNT<invokedynamic>(var8, var5);
                        var8.JNT<invokedynamic>(var8);
                     }

                     var10 = (-1247309918 ^ 1271674667 | -1576254810) & -1281430530;
                     break;
                  case -575579693:
                     return (aqb)var11.JNT<invokedynamic>(var11, var7, var8, var9);
                  case 534974125:
                  default:
                     if (var4) {
                        var10000 = (Font)var0.JNT<invokedynamic>(var0, 3, var1);
                        var9 = (ia)var10000.JNT<invokedynamic>(var10000, true, true);
                        var9.JNT<invokedynamic>(var9, var5);
                        var9.JNT<invokedynamic>(var9);
                     }

                     var10 = (276737778 | 276737778 | 1890592136) & -33692275;
                  }
               }
            }
         }
      }
   }

   public static aqb eqm(String param0, int param1, boolean param2, boolean param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   public int kai(class_4587 var1, String var2, float var3, float var4, int var5) {
      return this.JNT<invokedynamic>(this, var1, var2, var3, var4, var5, true);
   }

   public int ym(class_4587 var1, String var2, double var3, double var5, int var7) {
      return this.JNT<invokedynamic>(this, var1, var2, (float)var3, (float)var5, var7, true);
   }

   public int ov(class_4587 var1, String var2, float var3, float var4, int var5) {
      return this.JNT<invokedynamic>(this, var1, var2, var3, var4, var5, false);
   }

   public int wmy(class_4587 var1, String var2, double var3, double var5, int var7) {
      return this.JNT<invokedynamic>(this, var1, var2, (float)var3, (float)var5, var7, false);
   }

   public int or(class_4587 var1, String var2, double var3, double var5, float var7, int var8) {
      return this.JNT<invokedynamic>(this, var1, var2, (float)var3 - (float)(this.JNT<invokedynamic>(this, var2) / 2), (float)var5, var7, var8, false);
   }

   public int iyw(class_4587 var1, String var2, double var3, double var5, int var7) {
      return this.JNT<invokedynamic>(this, var1, var2, (float)var3 - (float)(this.JNT<invokedynamic>(this, var2) / 2), (float)var5, var7, false);
   }

   public int en(class_4587 var1, String var2, double var3, double var5, int var7) {
      return this.JNT<invokedynamic>(this, var1, var2, (float)var3 - (float)(this.JNT<invokedynamic>(this, var2) / 2), (float)var5, var7, true);
   }

   public int md(class_4587 var1, String var2, float var3, float var4, float var5, int var6, boolean var7) {
      this.JNT<invokedynamic>(this);
      int var8;
      if (var7) {
         var8 = this.JNT<invokedynamic>(this, var1, var2, var3 + 1.0F, var4 + 1.0F, var5, var6, true);
         var8 = var8.JNT<invokedynamic>(var8, this.JNT<invokedynamic>(this, var1, var2, var3, var4, var5, var6, false));
      } else {
         var8 = this.JNT<invokedynamic>(this, var1, var2, var3, var4, var5, var6, false);
      }

      return var8;
   }

   public int ra(class_4587 var1, String var2, float var3, float var4, int var5, boolean var6) {
      this.JNT<invokedynamic>(this);
      int var7;
      if (var6) {
         var7 = this.JNT<invokedynamic>(this, var1, var2, var3 + 1.0F, var4 + 1.0F, var5, true);
         var7 = var7.JNT<invokedynamic>(var7, this.JNT<invokedynamic>(this, var1, var2, var3, var4, var5, false));
      } else {
         var7 = this.JNT<invokedynamic>(this, var1, var2, var3, var4, var5, false);
      }

      return var7;
   }

   public int hy(class_4587 var1, String var2, float var3, float var4, int var5, boolean var6) {
      int var7 = -1049582984;
      if (var2 == null) {
         return 0;
      } else {
         var7 = (2002293857 << 2002293857 | 2938128) & 36495355;

         while(true) {
            switch(var7 - 1201667001 + 222595086 + 1177010331 - 401261518 + 1539135397 ^ 1276525690) {
            case 501056227:
            default:
               if ((var5 & -67108864) == 0) {
                  var5 |= -16777216;
               }

               var7 = -463038663 >> -1845037397 ^ -48060848;
               break;
            case 510342963:
               if (var6) {
                  var5 = (var5 & 16579836) >> 2 | var5 & -16777216;
               }

               var7 = (-406220907 + -406220907 | -563813547) & -25826347;
               break;
            case 1644359782:
               this.JNT<invokedynamic>(this, var3 * 2.0F);
               this.JNT<invokedynamic>(this, var4 * 2.0F);
               this.JNT<invokedynamic>(this, var1, var2, var6, var5);
               return (int)(this.JNT<invokedynamic>(this) / 4.0F);
            }
         }
      }
   }

   public int sts(class_4587 var1, String var2, float var3, float var4, float var5, int var6, boolean var7) {
      int var8 = -2023769993;
      if (var2 == null) {
         return 0;
      } else {
         var8 = 431904539 ^ -51680173 << 431904539 ^ -775471811;

         while(true) {
            switch((var8 - 750214659 + 329542271 - 1991517388 ^ 2040416206) + 460902935 - 2123692049) {
            case -1800873730:
            default:
               this.JNT<invokedynamic>(this, var3 * 2.0F);
               this.JNT<invokedynamic>(this, var4 * 2.0F);
               this.JNT<invokedynamic>(this, var1, var2, var5, var7, var6);
               return (int)(this.JNT<invokedynamic>(this) / 4.0F);
            case 1272390851:
               if (var7) {
                  var6 = (var6 & 16579836) >> 2 | var6 & -16777216;
               }

               var8 = 1241163969 & -1381552216 ^ 394524934;
               break;
            case 1443885086:
               if ((var6 & -67108864) == 0) {
                  var6 |= -16777216;
               }

               var8 = (-1669824498 >>> -1669824498 | 1731470721) & 1999908307;
            }
         }
      }
   }

   public void qtx(class_4587 param1, String param2, boolean param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public void eda(class_4587 param1, String param2, float param3, boolean param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public void twp(float var1, ia var2) {
      int var5 = 235814372;
      class_289 var10000;
      class_287 var3;
      if (this.JNT<invokedynamic>(this)) {
         var10000 = JNT<invokedynamic>();
         var3 = var10000.JNT<invokedynamic>(var10000, JNT<invokedynamic>(), JNT<invokedynamic>());
         var3.JNT<invokedynamic>(var3, this.JNT<invokedynamic>(this), this.JNT<invokedynamic>(this) + (float)(var2.JNT<invokedynamic>(var2) / 2), 0.0F);
         var3.JNT<invokedynamic>(var3, this.JNT<invokedynamic>(this) + var1, this.JNT<invokedynamic>(this) + (float)(var2.JNT<invokedynamic>(var2) / 2), 0.0F);
         var3.JNT<invokedynamic>(var3, this.JNT<invokedynamic>(this) + var1, this.JNT<invokedynamic>(this) + (float)(var2.JNT<invokedynamic>(var2) / 2) - 1.0F, 0.0F);
         var3.JNT<invokedynamic>(var3, this.JNT<invokedynamic>(this), this.JNT<invokedynamic>(this) + (float)(var2.JNT<invokedynamic>(var2) / 2) - 1.0F, 0.0F);
         var3.JNT<invokedynamic>(var3).JNT<invokedynamic>(var3.JNT<invokedynamic>(var3));
      }

      var5 = (298197186 << 298197186 | -1702796922) & -1698209330;

      while(true) {
         switch((var5 ^ 636248558 ^ 1381701977 ^ 1427344769 ^ 559309626) - 1908557576 - 886067225) {
         case -220110751:
         default:
            if (this.JNT<invokedynamic>(this)) {
               var10000 = JNT<invokedynamic>();
               var3 = var10000.JNT<invokedynamic>(var10000, JNT<invokedynamic>(), JNT<invokedynamic>());
               int var4 = this.JNT<invokedynamic>(this) ? -1 : 0;
               var3.JNT<invokedynamic>(var3, this.JNT<invokedynamic>(this) + (float)var4, this.JNT<invokedynamic>(this) + (float)var2.JNT<invokedynamic>(var2), 0.0F);
               var3.JNT<invokedynamic>(var3, this.JNT<invokedynamic>(this) + var1, this.JNT<invokedynamic>(this) + (float)var2.JNT<invokedynamic>(var2), 0.0F);
               var3.JNT<invokedynamic>(var3, this.JNT<invokedynamic>(this) + var1, this.JNT<invokedynamic>(this) + (float)var2.JNT<invokedynamic>(var2) - 1.0F, 0.0F);
               var3.JNT<invokedynamic>(var3, this.JNT<invokedynamic>(this) + (float)var4, this.JNT<invokedynamic>(this) + (float)var2.JNT<invokedynamic>(var2) - 1.0F, 0.0F);
               var3.JNT<invokedynamic>(var3).JNT<invokedynamic>(var3.JNT<invokedynamic>(var3));
            }

            var5 = (-892865374 * 329819177 | -2035142619) & -1494044097;
            break;
         case -22180070:
            this.JNT<invokedynamic>(this, this.JNT<invokedynamic>(this) + var1);
            return;
         }
      }
   }

   public ia ozu() {
      int var1 = 884357064;
      if (this.JNT<invokedynamic>(this) && this.JNT<invokedynamic>(this)) {
         return this.JNT<invokedynamic>(this);
      } else {
         var1 = -96128557 ^ -637349767 ^ 1040416912;

         while(true) {
            switch(((var1 ^ 138108259 ^ 1488952638) + 1445839956 ^ 1545292445) - 164020870 + 1039893011) {
            case -93510994:
               if (this.JNT<invokedynamic>(this)) {
                  return this.JNT<invokedynamic>(this);
               }

               var1 = (-593635393 * -593635393 | -1584695520) & -509870106;
               break;
            case 757722803:
            default:
               if (this.JNT<invokedynamic>(this)) {
                  return this.JNT<invokedynamic>(this);
               }

               var1 = (-112030399 + 468314564 | 309428532) & 468954485;
               break;
            case 1334507097:
               return this.JNT<invokedynamic>(this);
            }
         }
      }
   }

   public void jb() {
      this.JNT<invokedynamic>(this, false);
      this.JNT<invokedynamic>(this, false);
      this.JNT<invokedynamic>(this, false);
      this.JNT<invokedynamic>(this, false);
   }

   public int mt() {
      return this.JNT<invokedynamic>(this).JNT<invokedynamic>(this.JNT<invokedynamic>(this)) / 2;
   }

   public int xtl(String var1) {
      int var9 = -1980835855;
      if (var1 == null) {
         return 0;
      } else {
         int var2 = 0;
         int var4 = var1.JNT<invokedynamic>(var1);
         boolean var5 = false;
         int var6 = 0;

         while(true) {
            var9 = (463680614 >>> 1193182136 | -1822382993) & -738547713;

            while(true) {
               switch(var9 + 1174225309 - 775822525 - 943843320 - 64243332 ^ 1790876308 ^ 1332581910) {
               case 129127093:
                  return var2 / 2;
               case 1255839329:
               }

               if (var6 < var4) {
                  char var7 = var1.JNT<invokedynamic>(var1, var6);
                  if (var7 == 167) {
                     var5 = true;
                  } else {
                     var9 = -863607290 & -863607290 ^ -817063946;

                     label99:
                     while(true) {
                        switch((var9 + 553810418 + 1794195005 - 262950664 ^ 117848718) + 1764535228 - 164532437) {
                        case -428704640:
                        default:
                           if (var5 && var7 >= '0' && var7 <= 'r') {
                              int var10000 = (-649992817 - -1072757019 | 0) & -1568669628;

                              StringBuilder var10001;
                              for(var10001 = (StringBuilder)"ڼۀۄۈیې۔ۘۜ۠ހބވތސޔިެް\u07b4\u07b8߄".JNT<invokedynamic>("ڼۀۄۈیې۔ۘۜ۠ހބވތސޔިެް\u07b4\u07b8߄"); var10000 < ((864048454 + (864048454 - 864048454 * 864048454) | 22) & 272778262); var10000 += -1978146652 + -1978146652 ^ 338673993) {
                                 char var13 = var10001.JNT<invokedynamic>(var10001, var10000);
                                 var10001.JNT<invokedynamic>(var10001, var10000, (char)(((((((var13 & '︀') >> 9 | var13 << 7) & '\uffc0') >> 6 | ((var13 & '︀') >> 9 | var13 << 7) << 10) & '\ufff8') >> 3 | ((((var13 & '︀') >> 9 | var13 << 7) & '\uffc0') >> 6 | ((var13 & '︀') >> 9 | var13 << 7) << 10) << 13) - 151 - 232));
                              }

                              String var11 = var10001.JNT<invokedynamic>(var10001);
                              int var8 = var11.JNT<invokedynamic>(var11, var7);
                              if (var8 < 16) {
                                 this.JNT<invokedynamic>(this, false);
                                 this.JNT<invokedynamic>(this, false);
                                 var9 = -932450827 >>> -752696569 ^ 118970797;
                              } else {
                                 var9 = -1594163784 - -1090920875 ^ 1592063683;
                              }

                              while(true) {
                                 while(true) {
                                    switch((var9 + 1220108796 ^ 481036630) + 1267787240 + 1627553124 ^ 520301107 ^ 1654539820) {
                                    case -1746451887:
                                    default:
                                       if (var8 != 20) {
                                          var9 = (-738706213 >>> (327333170 & 1231134330) | 765806848) & -1075459840;
                                          continue;
                                       }

                                       this.JNT<invokedynamic>(this, true);
                                       break;
                                    case -1201944055:
                                       if (var8 == 17) {
                                          this.JNT<invokedynamic>(this, true);
                                          var9 = -932450827 >>> -752696569 ^ 118970797;
                                       } else {
                                          var9 = (253281833 << 253281833 | -929996712) & -659427970;
                                       }
                                       continue;
                                    case 1780181737:
                                       if (var8 == 21) {
                                          this.JNT<invokedynamic>(this, false);
                                          this.JNT<invokedynamic>(this, false);
                                       }
                                       break;
                                    case 2099064943:
                                       ++var6;
                                       var5 = false;
                                       break label99;
                                    }

                                    var9 = -932450827 >>> -752696569 ^ 118970797;
                                 }
                              }
                           }

                           var9 = (1612539567 & -402667843 | 555821146) & -337286310;
                           break;
                        case 434692174:
                           var7 = var1.JNT<invokedynamic>(var1, var6);
                           ia var3 = this.JNT<invokedynamic>(this);
                           var2 = (int)((float)var2 + (var3.JNT<invokedynamic>(var3, var7) - 8.0F));
                           break label99;
                        case 969475062:
                           if (var5) {
                              --var6;
                           }

                           var9 = 2037085799 - 2037085799 ^ 1095079618;
                        }
                     }
                  }

                  ++var6;
                  break;
               }

               var9 = -1464869076 & 468612064 ^ 1310078195;
            }
         }
      }
   }

   public String uy(String var1, int var2) {
      return this.JNT<invokedynamic>(this, var1, var2, false);
   }

   public String etb(String var1, int var2, boolean var3) {
      int var13 = -2029082929;
      StringBuilder var4 = (StringBuilder)JNT<invokedynamic>();
      boolean var5 = false;
      int var6 = var3 ? var1.JNT<invokedynamic>(var1) - 1 : 0;
      int var7 = var3 ? -1 : 1;
      int var8 = 0;
      int var10 = var6;

      label137:
      while(true) {
         var13 = (425047619 + (735229780 & 1117772905) | 7079258) & -1199764129;

         while(true) {
            switch((var13 ^ 1455076148) - 365009352 - 1310435962 + 343832478 ^ 1429652079 ^ 1791316840) {
            case -1065066292:
            default:
               if (var10 >= 0 && var10 < var1.JNT<invokedynamic>(var1) && var10 < var2) {
                  char var11 = var1.JNT<invokedynamic>(var1, var10);
                  if (var11 == 167) {
                     var5 = true;
                  } else {
                     var13 = (559073427 ^ -1040450448 | -1264170738) & -1074374194;

                     label127:
                     while(true) {
                        switch((var13 + 1085377333 ^ 1704509402 ^ 814880844) + 784373645 + 1060801043 - 1937902558) {
                        case -1697228713:
                           if (var5 && var11 >= '0' && var11 <= 'r') {
                              int var10000 = (435014665 >>> 435014665 | 0) & 413141000;

                              StringBuilder var10001;
                              for(var10001 = (StringBuilder)"ｨͨݨ୨ཨ፨ᝨ᭨Ὠ⍨䍩䝩䭩佩卩坩歩潩獩睩筩ݩ".JNT<invokedynamic>("ｨͨݨ୨ཨ፨ᝨ᭨Ὠ⍨䍩䝩䭩佩卩坩歩潩獩睩筩ݩ"); var10000 < ((1628232466 | 1733835374 | 4) & -1744764905); var10000 += (-1196256808 * 520332027 * 20754701 | 1) & 8439365) {
                                 int var17 = var10001.JNT<invokedynamic>(var10001, var10000) + 208;
                                 var17 = ((((var17 & '\uffff') >> 0 | var17 << 16) & '쀀') >> 14 | ((var17 & '\uffff') >> 0 | var17 << 16) << 2) ^ 227;
                                 int var10004 = (var17 & '\uf000') >> 12;
                                 char var18 = (char)((var17 & '\uf000') >> 12 | var17 << 4);
                                 var10001.JNT<invokedynamic>(var10001, var10000, (char)(var10004 | var17 << 4));
                              }

                              String var15 = var10001.JNT<invokedynamic>(var10001);
                              int var12 = var15.JNT<invokedynamic>(var15, var11);
                              if (var12 < 16) {
                                 this.JNT<invokedynamic>(this, false);
                                 this.JNT<invokedynamic>(this, false);
                                 var13 = (-677976297 & -677976297 | -1960292180) & -612772612;
                              } else {
                                 var13 = 1781033063 >>> 46894142 ^ 110153876;
                              }

                              while(true) {
                                 while(true) {
                                    switch(var13 - 1608022819 - 1452662747 - 1525098697 + 413639425 + 1093054264 ^ 1341929070) {
                                    case -1109267053:
                                       if (var12 == 21) {
                                          this.JNT<invokedynamic>(this, false);
                                          this.JNT<invokedynamic>(this, false);
                                       }
                                       break;
                                    case 16099689:
                                       if (var12 != 17) {
                                          var13 = 1554446538 * -571848322 ^ -195140932;
                                          continue;
                                       }

                                       this.JNT<invokedynamic>(this, true);
                                       break;
                                    case 1817023808:
                                    default:
                                       ++var10;
                                       var5 = false;
                                       break label127;
                                    case 1911490604:
                                       if (var12 != 20) {
                                          var13 = (-1267346459 ^ 360541713 >>> 360541713 | -1450900096) & -1415114865;
                                          continue;
                                       }

                                       this.JNT<invokedynamic>(this, true);
                                    }

                                    var13 = (-677976297 & -677976297 | -1960292180) & -612772612;
                                 }
                              }
                           }

                           var13 = 504546208 >>> -572461184 ^ -287475278;
                           break;
                        case 1164893490:
                           var11 = var1.JNT<invokedynamic>(var1, var10);
                           ia var9 = this.JNT<invokedynamic>(this);
                           var8 = (int)((float)var8 + (var9.JNT<invokedynamic>(var9, var11) - 8.0F) / 2.0F);
                           break label127;
                        case 1594161299:
                        default:
                           if (var5) {
                              --var10;
                           }

                           var13 = -2060109568 >>> (-2060109568 >> -1914018077) ^ 1517874353;
                        }
                     }
                  }

                  var13 = 2037302063 & 1313856552 ^ 1800545683;

                  label91:
                  while(true) {
                     while(true) {
                        switch((var13 + 1870965958 ^ 2022024724 ^ 1521311671) + 601821020 - 2083620451 ^ 205436329) {
                        case -2079172679:
                           if (!var3) {
                              var13 = (1352792216 & 1684358331 | -112784849) & -2666625;
                              continue;
                           }

                           var4.JNT<invokedynamic>(var4, 0, var11);
                           break;
                        case -2023448406:
                           var10 += var7;
                           continue label137;
                        case -22142410:
                        default:
                           var4.JNT<invokedynamic>(var4, var11);
                           break;
                        case 1409827250:
                           if (var10 > var8) {
                              break label91;
                           }

                           var13 = -1050581081 >> -1050581081 ^ -1387253471;
                           continue;
                        }

                        var13 = (-1731001497 * -1731001497 | 1354418306) & 1442834659;
                     }
                  }
               }

               var13 = 1287465483 * 1287465483 ^ 1554837365;
               break;
            case 1713857171:
               return var4.JNT<invokedynamic>(var4);
            }
         }
      }
   }

   public ia uf() {
      return this.JNT<invokedynamic>(this);
   }

   public static Object _/* $FF was: 0*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = wlf[(((var10 ^ 1016664421 ^ 1636237679 ^ 1726290426) - 739972111 ^ 406925747) - 1378633701 ^ 1407178080 ^ 1093825419) - 28479256 + 38072709];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var12 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var15 = var12;
         StringBuilder var13 = var10002;
         var10003.<init>(var15);
         int var16 = (-233431870 >> 937395794 | 0) & 616;

         label260:
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
               var16 = 285875814 * 1166170899 ^ -900037742;

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
                     MethodType var6 = MethodType.fromMethodDescriptorString(var10003.toString(), aqb.class.getClassLoader());
                     var12 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var15 = var12;
                     var13 = var10002;
                     var10003.<init>(var15);
                     var16 = (-1530980230 >>> -1065017656 * -1325822799 | 0) & -1810300896;

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
                           Class var7 = Class.forName(var10003.toString(), false, aqb.class.getClassLoader());
                           switch((var4 + 1321059524 - 639806484 - 194038252 - 280078385 + 2050940887 + 1565623316 + 2141759765 - 734736586 ^ 492362097) + 608761422) {
                           case 18885050:
                              var10000 = var0.findConstructor(var7, var6);
                              break label260;
                           case 206510796:
                              var10000 = var0.findStatic(var7, var5, var6);
                              break label260;
                           case 371617402:
                           case 1970517608:
                              var10000 = var0.findVirtual(var7, var5, var6);
                              break label260;
                           case 386264705:
                              var10000 = var0.findSpecial(var7, var5, var6, aqb.class);
                              break label260;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var17 = (var10003.charAt(var16) ^ 187) - 99 + 208 + 48 ^ 115;
                        var17 = ((((var17 & 'ﰀ') >> 10 | var17 << 6) - 198 & '耀') >> 15 | ((var17 & 'ﰀ') >> 10 | var17 << 6) - 198 << 1) - 238;
                        int var10004 = (var17 & '\uffc0') >> 6;
                        var18 = var17;
                        char var19 = (char)(var10004 | var17 << 10);
                        var13.setCharAt(var16, (char)(var10004 | var18 << 10));
                        var16 += (349896442 + -1084670536 | 1) & 574751497;
                     }
                  }

                  var17 = var10003.charAt(var16) + 187;
                  var10003.setCharAt(var16, (char)(((((((((((var17 & '耀') >> 15 | var17 << 1) + 36 & 'ﾀ') >> 7 | ((var17 & '耀') >> 15 | var17 << 1) + 36 << 9) & '耀') >> 15 | ((((var17 & '耀') >> 15 | var17 << 1) + 36 & 'ﾀ') >> 7 | ((var17 & '耀') >> 15 | var17 << 1) + 36 << 9) << 1) ^ 166) & '\ufff0') >> 4 | (((((((var17 & '耀') >> 15 | var17 << 1) + 36 & 'ﾀ') >> 7 | ((var17 & '耀') >> 15 | var17 << 1) + 36 << 9) & '耀') >> 15 | ((((var17 & '耀') >> 15 | var17 << 1) + 36 & 'ﾀ') >> 7 | ((var17 & '耀') >> 15 | var17 << 1) + 36 << 9) << 1) ^ 166) << 12) ^ 186) - 39 ^ 208));
                  var16 += 96237732 - 96237732 ^ 1;
               }
            }

            var17 = var10003.charAt(var16) + 206;
            var10003.setCharAt(var16, (char)((((((((((((var17 & '\ue000') >> 13 | var17 << 3) + 92 & '︀') >> 9 | ((var17 & '\ue000') >> 13 | var17 << 3) + 92 << 7) & '\uf000') >> 12 | ((((var17 & '\ue000') >> 13 | var17 << 3) + 92 & '︀') >> 9 | ((var17 & '\ue000') >> 13 | var17 << 3) + 92 << 7) << 4) & '\uffff') >> 0 | ((((((var17 & '\ue000') >> 13 | var17 << 3) + 92 & '︀') >> 9 | ((var17 & '\ue000') >> 13 | var17 << 3) + 92 << 7) & '\uf000') >> 12 | ((((var17 & '\ue000') >> 13 | var17 << 3) + 92 & '︀') >> 9 | ((var17 & '\ue000') >> 13 | var17 << 3) + 92 << 7) << 4) << 16) ^ 222) & '\ufffe') >> 1 | (((((((((var17 & '\ue000') >> 13 | var17 << 3) + 92 & '︀') >> 9 | ((var17 & '\ue000') >> 13 | var17 << 3) + 92 << 7) & '\uf000') >> 12 | ((((var17 & '\ue000') >> 13 | var17 << 3) + 92 & '︀') >> 9 | ((var17 & '\ue000') >> 13 | var17 << 3) + 92 << 7) << 4) & '\uffff') >> 0 | ((((((var17 & '\ue000') >> 13 | var17 << 3) + 92 & '︀') >> 9 | ((var17 & '\ue000') >> 13 | var17 << 3) + 92 << 7) & '\uf000') >> 12 | ((((var17 & '\ue000') >> 13 | var17 << 3) + 92 & '︀') >> 9 | ((var17 & '\ue000') >> 13 | var17 << 3) + 92 << 7) << 4) << 16) ^ 222) << 15) + 39 + 234));
            var16 += (1112036285 ^ 144141295 | 1) & -1610595451;
         }
      }

      wlf[(((var10 ^ 1016664421 ^ 1636237679 ^ 1726290426) - 739972111 ^ 406925747) - 1378633701 ^ 1407178080 ^ 1093825419) - 28479256 + 38072709] = var10000;
      MethodHandle var11 = var10000.asType(var2);
      return new MutableCallSite(var11);
   }

   public static Object _/* $FF was: 1*/(Lookup var0, String var1, MethodType var2, Object... var3) {
      boolean var11 = false;
      int var10 = (Integer)var3[4];
      MethodHandle var10000 = wlf[(((var10 - 104440119 - 2075826753 ^ 2050123538) - 955666520 ^ 1545836184) + 341102724 ^ 826633127) - 1718649517 ^ 1634055399 ^ 294551080];
      if (var10000 == null) {
         int var4 = (Integer)var3[0];
         String var13 = (String)var3[1];
         StringBuilder var10001 = new StringBuilder;
         StringBuilder var10003 = var10001;
         StringBuilder var10002 = var10001;
         String var16 = var13;
         StringBuilder var14 = var10002;
         var10003.<init>(var16);
         int var17 = 1731170516 - -411448641 ^ 2142619157;

         label233:
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
               var17 = -598941299 * (-598941299 - -598941299) ^ 0;

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
                     Class var6 = Class.forName(var10003.toString(), false, aqb.class.getClassLoader());
                     var13 = (String)var3[3];
                     var10001 = new StringBuilder;
                     var10003 = var10001;
                     var10002 = var10001;
                     var16 = var13;
                     var14 = var10002;
                     var10003.<init>(var16);
                     var17 = (-1805821086 << -1805821086 | 0) & 780796006;

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
                           Class var7 = MethodType.fromMethodDescriptorString(var10003.toString(), aqb.class.getClassLoader()).returnType();
                           switch(((var4 ^ 2081952775) + 1254569243 - 1967670097 - 829515334 + 1378346344 - 474185334 + 1470842019 ^ 1637356004) + 1846815220 ^ 106738950) {
                           case 150083511:
                              var10000 = var0.findGetter(var6, var5, var7);
                              break label233;
                           case 867920828:
                              var10000 = var0.findSetter(var6, var5, var7);
                              break label233;
                           case 981959783:
                              var10000 = var0.findStaticGetter(var6, var5, var7);
                              break label233;
                           case 2091976635:
                              var10000 = var0.findStaticSetter(var6, var5, var7);
                              break label233;
                           default:
                              throw new UnsupportedOperationException("Unsupported handle type!");
                           }
                        }

                        var20 = var10003.charAt(var17);
                        var18 = ((((((((((var20 & 'ﾀ') >> 7 | var20 << 9) & '\uf800') >> 11 | ((var20 & 'ﾀ') >> 7 | var20 << 9) << 5) ^ 117) & '︀') >> 9 | (((((var20 & 'ﾀ') >> 7 | var20 << 9) & '\uf800') >> 11 | ((var20 & 'ﾀ') >> 7 | var20 << 9) << 5) ^ 117) << 7) + 129 & '\ufffe') >> 1 | (((((((var20 & 'ﾀ') >> 7 | var20 << 9) & '\uf800') >> 11 | ((var20 & 'ﾀ') >> 7 | var20 << 9) << 5) ^ 117) & '︀') >> 9 | (((((var20 & 'ﾀ') >> 7 | var20 << 9) & '\uf800') >> 11 | ((var20 & 'ﾀ') >> 7 | var20 << 9) << 5) ^ 117) << 7) + 129 << 15) ^ 149 ^ 171) + 68;
                        var10004 = (var18 & 'ﰀ') >> 10;
                        var19 = var18;
                        var20 = (char)(var10004 | var18 << 6);
                        var14.setCharAt(var17, (char)(var10004 | var19 << 6));
                        var17 += (1224615657 | 167246052 - (1224615657 - 167246052)) ^ -889196802;
                     }
                  }

                  var20 = var10003.charAt(var17);
                  var18 = (((((((((var20 & 'ﾀ') >> 7 | var20 << 9) - 150 + 159 - 30 & '耀') >> 15 | ((var20 & 'ﾀ') >> 7 | var20 << 9) - 150 + 159 - 30 << 1) ^ 240) & '￠') >> 5 | (((((var20 & 'ﾀ') >> 7 | var20 << 9) - 150 + 159 - 30 & '耀') >> 15 | ((var20 & 'ﾀ') >> 7 | var20 << 9) - 150 + 159 - 30 << 1) ^ 240) << 11) & '\uffc0') >> 6 | (((((((var20 & 'ﾀ') >> 7 | var20 << 9) - 150 + 159 - 30 & '耀') >> 15 | ((var20 & 'ﾀ') >> 7 | var20 << 9) - 150 + 159 - 30 << 1) ^ 240) & '￠') >> 5 | (((((var20 & 'ﾀ') >> 7 | var20 << 9) - 150 + 159 - 30 & '耀') >> 15 | ((var20 & 'ﾀ') >> 7 | var20 << 9) - 150 + 159 - 30 << 1) ^ 240) << 11) << 10) ^ 53;
                  var10004 = (var18 & '쀀') >> 14;
                  var19 = var18;
                  var20 = (char)(var10004 | var18 << 2);
                  var14.setCharAt(var17, (char)(var10004 | var19 << 2));
                  var17 += -1295993846 ^ 742783904 ^ -1635430485;
               }
            }

            var18 = var10003.charAt(var17) + 235;
            var18 = ((((((((var18 & '\ufff8') >> 3 | var18 << 13) & '耀') >> 15 | ((var18 & '\ufff8') >> 3 | var18 << 13) << 1) & '\ufffe') >> 1 | ((((var18 & '\ufff8') >> 3 | var18 << 13) & '耀') >> 15 | ((var18 & '\ufff8') >> 3 | var18 << 13) << 1) << 15) + 130 + 116 & '︀') >> 9 | ((((((var18 & '\ufff8') >> 3 | var18 << 13) & '耀') >> 15 | ((var18 & '\ufff8') >> 3 | var18 << 13) << 1) & '\ufffe') >> 1 | ((((var18 & '\ufff8') >> 3 | var18 << 13) & '耀') >> 15 | ((var18 & '\ufff8') >> 3 | var18 << 13) << 1) << 15) + 130 + 116 << 7) + 148;
            var10004 = (var18 & '\ue000') >> 13;
            var19 = var18;
            var18 = var10004 | var18 << 3;
            var10004 = ((var10004 | var19 << 3) & '\uf800') >> 11;
            var19 = var18;
            var20 = (char)(var10004 | var18 << 5);
            var14.setCharAt(var17, (char)(var10004 | var19 << 5));
            var17 += (-1606778930 & -471325601 | 1) & 165007793;
         }
      }

      if (!var11) {
         wlf[(((var10 - 104440119 - 2075826753 ^ 2050123538) - 955666520 ^ 1545836184) + 341102724 ^ 826633127) - 1718649517 ^ 1634055399 ^ 294551080] = var10000;
      }

      MethodHandle var12 = var10000.asType(var2);
      return new MutableCallSite(var12);
   }
}
