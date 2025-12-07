package dev.krypton.mixin;

import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_329.class})
public class InGameHudMixin {
   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void onRenderHud(class_332 var1, class_9779 var2, CallbackInfo var3) {
      .rj var4 = new .rj(var1, var2.method_60637(true));
      .dh.z(var4);
   }

   @Inject(
      method = {"renderStatusEffectOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderStatusEffects(class_332 var1, class_9779 var2, CallbackInfo var3) {
      .ze var4 = (.ze)((.me).me.oiq).zp().kxc(.ze.class);
      if (var4 != null && var4.lj()) {
         var3.cancel();
      }

   }
}
