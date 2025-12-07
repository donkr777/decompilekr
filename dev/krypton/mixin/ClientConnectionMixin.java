package dev.krypton.mixin;

import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_2535.class})
public class ClientConnectionMixin {
   @Inject(
      method = {"handlePacket"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static <T extends class_2547> void onPacketReceive(class_2596<T> var0, class_2547 var1, CallbackInfo var2) {
      .fuk var3 = new .fuk(var0);
      .dh.z(var3);
      if (var3.adr()) {
         var2.cancel();
      }

   }

   @Inject(
      method = {"send(Lnet/minecraft/network/packet/Packet;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPacketSend(class_2596<?> var1, CallbackInfo var2) {
      .uk var3 = new .uk(var1);
      .dh.z(var3);
      if (var3.adr()) {
         var2.cancel();
      }

   }
}
