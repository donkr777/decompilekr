package dev.krypton.mixin;

import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_309.class})
public class KeyboardMixin {
   @Inject(
      method = {"onKey"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPress(long var1, int var3, int var4, int var5, int var6, CallbackInfo var7) {
      if (var3 != -1) {
         .xh var8 = new .xh(var3, var1, var5);
         .dh.z(var8);
         if (var8.adr()) {
            var7.cancel();
         }

      }
   }
}
