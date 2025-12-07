package dev.krypton.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(
   targets = {"com.mojang.blaze3d.platform.GlStateManager$CapabilityTracker"}
)
public abstract class CapabilityTrackerMixin implements .rf {
   @Shadow
   private boolean field_5051;

   @Shadow
   public abstract void method_4470(boolean var1);

   public boolean m() {
      return this.field_5051;
   }

   public void j(boolean var1) {
      this.method_4470(var1);
   }
}
