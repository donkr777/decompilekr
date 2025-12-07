package dev.krypton.mixin;

import net.minecraft.class_310;
import net.minecraft.class_5223;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({class_5223.class})
public class TextVisitFactoryMixin {
   @ModifyArg(
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/text/TextVisitFactory;visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z",
   ordinal = 0
),
      method = {"visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z"},
      index = 0
   )
   private static String adjustText(String var0) {
      .mr var1 = (.mr)((.vt)((.me).me.oiq).yqj).kxc(.mr.class);
      if (!var1.lj()) {
         return var0;
      } else {
         String var2 = ((class_310).me.vic).method_1548().method_1676();
         return var0.contains(var2) ? var0.replace(var2, var1.ll()) : var0;
      }
   }
}
