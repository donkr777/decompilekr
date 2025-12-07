package dev.krypton.mixin;

import net.minecraft.class_1657;
import net.minecraft.class_4048;
import net.minecraft.class_4050;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1657.class})
public abstract class PlayerEntityMixin {
   @Shadow
   @Final
   public static class_4048 field_18135;

   @Shadow
   public abstract boolean method_7340();

   @Inject(
      method = {"getBaseDimensions"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getBaseDimensions(class_4050 var1, CallbackInfoReturnable<class_4048> var2) {
      if (!this.method_7340()) {
         .bm var3 = (.bm)((.vt)((.me).me.oiq).yqj).kxc(.bm.class);
         if (var3.lj()) {
            var2.setReturnValue(field_18135);
         }

      }
   }
}
