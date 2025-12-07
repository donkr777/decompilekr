package dev.krypton.mixin;

import net.minecraft.class_2604;
import net.minecraft.class_2672;
import net.minecraft.class_2678;
import net.minecraft.class_5900;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_634.class})
public abstract class ClientPlayNetworkHandlerMixin {
   @Inject(
      method = {"onChunkData"},
      at = {@At("TAIL")}
   )
   private void onChunkData(class_2672 var1, CallbackInfo var2) {
      .dh.z(new .vs(var1));
   }

   @Inject(
      method = {"onEntitySpawn"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onEntitySpawn(class_2604 var1, CallbackInfo var2) {
      .df var3 = new .df(var1);
      .dh.z(var3);
      if (var3.adr()) {
         var2.cancel();
      }

   }

   @Inject(
      method = {"onTeam"},
      at = {@At("TAIL")}
   )
   private void onTeam(class_5900 var1, CallbackInfo var2) {
      .dh.z(new .xpf(var1));
   }

   @Inject(
      method = {"onGameJoin"},
      at = {@At("HEAD")}
   )
   private void onJoin(class_2678 var1, CallbackInfo var2) {
      .dh.z(new .yg());
   }
}
