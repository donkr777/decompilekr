package dev.krypton.mixin;

import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3675;
import net.minecraft.class_3675.class_306;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin({class_304.class})
public abstract class KeyBindingMixin implements .lt {
   @Shadow
   private class_306 field_1655;

   public boolean ud() {
      long var1 = ((class_310).me.vic).method_22683().method_4490();
      int var3 = this.field_1655.method_1444();
      return class_3675.method_15987(var1, var3);
   }

   public void xmq() {
      this.method_23481(this.ud());
   }

   @Shadow
   public abstract void method_23481(boolean var1);
}
