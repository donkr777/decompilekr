import dev.krypton.jnt3.Loader;

public class oh implements wp {
   public Object aa;
   public static int zf;
   transient String myMetaphor;

   public oh() {
      int var4 = 0;
      boolean var1 = false;
      boolean var3 = false;
      StackTraceElement[] var2 = Thread.currentThread().getStackTrace();
      int var6 = var2.length;
      int var5 = 0;

      label17:
      while(true) {
         if (var5 >= var6) {
            var5 = var4 << var4 ^ -381119471;
            break;
         }

         var4 = var2[var5].getMethodName().hashCode();
         switch(var4) {
         case 3294:
            var5 = (var4 >>> var4 | 612406289) & -1347365485;
            break label17;
         case 102166:
            var5 = (var4 << var4 - var4 | 612405265) & -189615087;
            break label17;
         default:
            ++var5;
         }
      }

      super();
      this.__jnt__init__109925134242362283__();
   }

   public native byte[] ve();

   public native byte[] jd(byte[] var1, int var2);

   public native byte[] zh(byte[] var1, int var2);

   static native void ma(long var0);

   static {
      Loader.init(oh.class);
      ma((-6492960611695371102L | 691938852003799886L) ^ -3826340902638670683L);
   }

   public native void __jnt__init__109925134242362283__();

   public static native void guard();
}
