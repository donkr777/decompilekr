package dev.krypton.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({class_757.class})
public abstract class GameRendererMixin {
   @Shadow
   @Final
   private class_4184 field_18765;
   @Unique
   private .ab renderer;

   @Shadow
   protected abstract void method_3186(class_4587 var1, float var2);

   @Shadow
   protected abstract void method_3198(class_4587 var1, float var2);

   @Inject(
      method = {"renderWorld"},
      at = {@At(
   value = "INVOKE_STRING",
   target = "Lnet/minecraft/util/profiler/Profiler;swap(Ljava/lang/String;)V",
   args = {"ldc=hand"}
)},
      locals = LocalCapture.CAPTURE_FAILEXCEPTION
   )
   private void onRenderWorld(class_9779 var1, CallbackInfo var2, @Local(ordinal = 1) Matrix4f var3, @Local(ordinal = 1) float var4, @Local class_4587 var5) {
      if ((class_310).me.vic != null && ((class_310).me.vic).field_1687 != null && ((class_310).me.vic).field_1724 != null) {
         if (this.renderer == null) {
            this.renderer = new .ab();
         }

         .cd.dy();
         RenderSystem.getModelViewStack().pushMatrix().mul(var3);
         class_4587 var6 = (class_4587)((.me).me.oiq).ac;
         var6.method_22903();
         this.method_3198(var6, this.field_18765.method_55437());
         if ((Boolean)((class_310).me.vic).field_1690.method_42448().method_41753()) {
            this.method_3186(var6, this.field_18765.method_55437());
         }

         RenderSystem.getModelViewStack().mul(var6.method_23760().method_23761().invert());
         var6.method_22909();
         this.renderer.lhj();
         .dh.z(new .oe(var5, this.renderer, var4, this.field_18765.method_19326().field_1352, this.field_18765.method_19326().field_1351, this.field_18765.method_19326().field_1350));
         this.renderer.ag(var5);
         RenderSystem.getModelViewStack().popMatrix();
         RenderSystem.applyModelViewMatrix();
      }
   }

   @Inject(
      method = {"shouldRenderBlockOutline"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onShouldRenderBlockOutline(CallbackInfoReturnable<Boolean> var1) {
      if (((.li)((.me).me.oiq).zp().kxc(.li.class)).lj()) {
         var1.setReturnValue(false);
      }

   }
}
