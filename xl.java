import dev.krypton.jnt3.Loader;

public enum xl {
   azi,
   jda,
   md,
   hyz,
   kai,
   sz,
   uika,
   vpz;

   public int xte;
   // $FF: synthetic field
   public static Object dkn;
   transient String myMetaphor;

   public xl(int var3, long var4) {
      int var9 = 0;
      boolean var6 = false;
      boolean var8 = false;
      StackTraceElement[] var7 = Thread.currentThread().getStackTrace();
      int var11 = var7.length;
      int var10 = 0;

      label17:
      while(true) {
         if (var10 >= var11) {
            var10 = var9 + var9 ^ -1071117237;
            break;
         }

         var9 = var7[var10].getMethodName().hashCode();
         switch(var9) {
         case 114277:
            var10 = var9 >> var9 + -1376996366 ^ 1769491873;
            break label17;
         default:
            ++var10;
         }
      }

      super(var1, var2);
      this.__jnt__init__4182004619067541391__(var1, var2, var3);
   }

   public native int nn(long var1);

   public static native xl ia(int var0, int var1);

   // $FF: synthetic method
   public static native xl[] mbe(long var0);

   public static native void svh(int var0);

   static {
      Loader.init(xl.class);
      svh(1202109804 >>> 1202109804 ^ 1801039273);
   }

   public native void __jnt__init__4182004619067541391__(String var1, int var2, int var3);

   public static native void guard();
}
