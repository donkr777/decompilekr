package dev.krypton.mixin;

import com.mojang.blaze3d.systems.RenderSystem.class_5590;
import java.nio.ByteBuffer;
import net.minecraft.class_291;
import net.minecraft.class_9801.class_4574;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_291.class})
public abstract class VertexBufferMixin {
   @Shadow
   private int field_27366;

   @Inject(
      method = {"uploadIndexBuffer(Lnet/minecraft/client/render/BuiltBuffer$DrawParameters;Ljava/nio/ByteBuffer;)Lcom/mojang/blaze3d/systems/RenderSystem$ShapeIndexBuffer;"},
      at = {@At("RETURN")}
   )
   private void onConfigureIndexBuffer(class_4574 var1, ByteBuffer var2, CallbackInfoReturnable<class_5590> var3) {
      if (var3.getReturnValue() == null) {
         .cn.jkq = this.field_27366;
      } else {
         .cn.jkq = ((ShapeIndexBufferAccessor)var3.getReturnValue()).getId();
      }

   }
}
