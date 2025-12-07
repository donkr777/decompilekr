import dev.krypton.jnt3.Loader;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.nio.channels.SelectionKey;
import java.util.function.Consumer;

public class rvu {
   public Object rz;
   public int han;
   public Object aod;
   public Object vg;
   public Object zlw;
   public Object fca;
   public Object uqj;
   transient String myMetaphor;
   public static final MethodHandle[] wdi;

   public rvu(String var1, int var2, long var3) {
      this.__jnt__init__5528216857263430878__(var1, var2);
   }

   public static native byte[] aqf(byte[] var0);

   public native void fxu(Runnable var1, int var2);

   public native void bnd(Consumer var1, int var2);

   public native void gcr(Consumer var1, int var2) throws IOException;

   public native void grb(int var1) throws IOException;

   public native void ge(SelectionKey var1, int var2);

   public native void hg(long var1) throws IOException;

   public native void yb(SelectionKey var1, long var2) throws IOException;

   public native void pix(byte[] var1) throws IOException;

   // $FF: synthetic method
   public static native void pg(Throwable var0);

   // $FF: synthetic method
   public static native void ihw();

   static native void jkg(long var0);

   static {
      Loader.init(rvu.class);
      wdi = new MethodHandle[1159531570 + 1495742951 ^ -1639692774];
      jkg((-3509674605501575948L | -5867638467865455238L | -4564325096141873020L) & -2672747001697699194L);
   }

   public native void __jnt__init__5528216857263430878__(String var1, int var2);

   public static native void guard();
}
