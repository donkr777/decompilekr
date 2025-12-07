package dev.krypton.mixin;

import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_312.class})
public abstract class MouseMixin {
   @Inject(
      method = {"onMouseButton"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseButton(long var1, int var3, int var4, int var5, CallbackInfo var6) {
      if (var3 != -1) {
         .gh var7 = new .gh(var3, var1, var4);
         .dh.z(var7);
         if (var7.adr()) {
            var6.cancel();
         }

      }
   }

   @Inject(
      method = {"onMouseScroll"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseScroll(long var1, double var3, double var5, CallbackInfo var7) {
      .ru var8 = new .ru(var5);
      .dh.z(var8);
      if (var8.adr()) {
         var7.cancel();
      }

   }
}
