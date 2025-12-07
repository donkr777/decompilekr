package dev.krypton.mixin;

import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_1309.class})
public interface LivingEntityAccessor {
   @Accessor("serverX")
   double getServerX();

   @Accessor("serverY")
   double getServerY();

   @Accessor("serverZ")
   double getServerZ();
}
