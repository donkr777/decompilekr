package dev.krypton.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({class_4184.class})
public class CameraMixin {
   @Shadow
   private boolean field_18719;
   @Unique
   private float tickDelta;

   @Inject(
      method = {"update"},
      at = {@At("HEAD")}
   )
   private void onUpdateHead(class_1922 var1, class_1297 var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      this.tickDelta = var5;
   }

   @ModifyArgs(
      method = {"update"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/render/Camera;setPos(DDD)V"
)
   )
   private void update(Args var1) {
      .li var2 = (.li)((.vt)((.me).me.oiq).yqj).kxc(.li.class);
      if (var2.lj()) {
         var1.set(0, var2.fr(this.tickDelta));
         var1.set(1, var2.pxq(this.tickDelta));
         var1.set(2, var2.pw(this.tickDelta));
      }

   }

   @ModifyArgs(
      method = {"update"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/render/Camera;setRotation(FF)V"
)
   )
   private void onUpdateSetRotationArgs(Args var1) {
      .li var2 = (.li)((.vt)((.me).me.oiq).yqj).kxc(.li.class);
      if (var2.lj()) {
         var1.set(0, (float)var2.zry(this.tickDelta));
         var1.set(1, (float)var2.bi(this.tickDelta));
      }

   }

   @Inject(
      method = {"update"},
      at = {@At("TAIL")}
   )
   private void onUpdateTail(class_1922 var1, class_1297 var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      .li var7 = (.li)((.vt)((.me).me.oiq).yqj).kxc(.li.class);
      if (var7.lj()) {
         this.field_18719 = true;
      }

   }
}
