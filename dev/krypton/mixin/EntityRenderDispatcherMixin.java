package dev.krypton.mixin;

import java.awt.Color;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1508;
import net.minecraft.class_1510;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_761;
import net.minecraft.class_898;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_898.class})
public abstract class EntityRenderDispatcherMixin {
   @Shadow
   private static void method_61171(class_4587 var0, class_4588 var1, Vector3f var2, class_243 var3, int var4) {
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"renderHitbox"},
      cancellable = true
   )
   private static void renderHitbox(class_4587 var0, class_4588 var1, class_1297 var2, float var3, float var4, float var5, float var6, CallbackInfo var7) {
      class_238 var8 = var2.method_5829().method_989(-var2.method_23317(), -var2.method_23318(), -var2.method_23321());
      if (var2 instanceof class_1510) {
         double var9 = -class_3532.method_16436((double)var3, var2.field_6038, var2.method_23317());
         double var11 = -class_3532.method_16436((double)var3, var2.field_5971, var2.method_23318());
         double var13 = -class_3532.method_16436((double)var3, var2.field_5989, var2.method_23321());
         class_1508[] var15 = ((class_1510)var2).method_5690();
         int var16 = var15.length;

         for(int var17 = 0; var17 < var16; ++var17) {
            class_1508 var18 = var15[var17];
            var0.method_22903();
            double var19 = var9 + class_3532.method_16436((double)var3, var18.field_6038, var18.method_23317());
            double var21 = var11 + class_3532.method_16436((double)var3, var18.field_5971, var18.method_23318());
            double var23 = var13 + class_3532.method_16436((double)var3, var18.field_5989, var18.method_23321());
            var0.method_22904(var19, var21, var23);
            class_761.method_22982(var0, var1, var18.method_5829().method_989(-var18.method_23317(), -var18.method_23318(), -var18.method_23321()), 0.25F, 1.0F, 0.0F, 1.0F);
            var0.method_22909();
         }
      }

      if (var2 instanceof class_1309) {
         float var25 = 0.01F;
         class_761.method_22980(var0, var1, var8.field_1323, (double)(var2.method_5751() - 0.01F), var8.field_1321, var8.field_1320, (double)(var2.method_5751() + 0.01F), var8.field_1324, 1.0F, 0.0F, 0.0F, 1.0F);
      }

      class_1297 var26 = var2.method_5854();
      if (var26 != null) {
         float var10 = Math.min(var26.method_17681(), var2.method_17681()) / 2.0F;
         float var28 = 0.0625F;
         class_243 var12 = var26.method_52538(var2).method_1020(var2.method_19538());
         class_761.method_22980(var0, var1, var12.field_1352 - (double)var10, var12.field_1351, var12.field_1350 - (double)var10, var12.field_1352 + (double)var10, var12.field_1351 + 0.0625D, var12.field_1350 + (double)var10, 1.0F, 1.0F, 0.0F, 1.0F);
      }

      Color var27 = Color.WHITE;
      if (var2 instanceof class_1657) {
         class_1657 var29 = (class_1657)var2;
         .ac var30 = (.ac)((.vt)((.me).me.oiq).yqj).kxc(.ac.class);
         if (var30.lj()) {
            var8 = var8.method_1014(var30.uv());
         }

         .zmd var31 = (.zmd)((.me).me.oiq).zp().kxc(.zmd.class);
         if (var31.rlf.wz() && var31.fav(var29)) {
            var27 = Color.GREEN;
         }
      }

      class_761.method_22982(var0, var1, var8, (float)(256 - var27.getRed()), (float)(256 - var27.getGreen()), (float)(256 - var27.getBlue()), 1.0F);
      method_61171(var0, var1, new Vector3f(0.0F, var2.method_5751(), 0.0F), var2.method_5828(var3).method_1021(2.0D), -16776961);
      var7.cancel();
   }
}
