package dev.krypton.mixin;

import net.minecraft.class_1041;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_437;
import net.minecraft.class_638;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_310.class})
public class MinecraftClientMixin {
   @Shadow
   @Nullable
   public class_638 field_1687;
   @Shadow
   @Final
   private class_1041 field_1704;
   @Shadow
   private int field_1752;

   @Inject(
      method = {"tick"},
      at = {@At("HEAD")}
   )
   private void onTick(CallbackInfo var1) {
      .ux var2 = new .ux();
      .dh.z(var2);
      if (this.field_1687 != null) {
         .ld var3 = new .ld();
         .dh.z(var3);
      }

   }

   @Inject(
      method = {"onResolutionChanged"},
      at = {@At("HEAD")}
   )
   private void onResolutionChanged(CallbackInfo var1) {
      .dh.z(new .dk(this.field_1704));
   }

   @Inject(
      method = {"doItemUse"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void onItemUseReturn(CallbackInfo var1) {
      .d var2 = new .d(this.field_1752);
      .dh.z(var2);
      if (var2.adr()) {
         var1.cancel();
      }

      this.field_1752 = var2.jm;
   }

   @Inject(
      method = {"doItemUse"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onItemUseHead(CallbackInfo var1) {
      .ke var2 = new .ke(this.field_1752);
      .dh.z(var2);
      if (var2.adr()) {
         var1.cancel();
      }

      this.field_1752 = var2.jm;
   }

   @Inject(
      method = {"doAttack"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onAttack(CallbackInfoReturnable<Boolean> var1) {
      .q var2 = new .q();
      .dh.z(var2);
      if (var2.adr()) {
         var1.cancel();
         var1.setReturnValue(false);
      } else {
         .zmd var3 = (.zmd)((.vt)((.me).me.oiq).yqj).kxc(.zmd.class);
         if (var3.tp.wz()) {
            if (((class_310).me.vic).field_1724 != null) {
               if (((class_310).me.vic).field_1755 == null) {
                  class_239 var5 = ((class_310).me.vic).field_1765;
                  if (var5 instanceof class_3966) {
                     class_3966 var4 = (class_3966)var5;
                     class_1297 var6 = var4.method_17782();
                     if (var6 instanceof class_1657) {
                        class_1657 var7 = (class_1657)var6;
                        if (var3.fav(var7)) {
                           var2.xze();
                        }

                     }
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"handleBlockBreaking"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onBlockBreaking(boolean var1, CallbackInfo var2) {
      .qn var3 = new .qn();
      .dh.z(var3);
      if (var3.adr()) {
         var2.cancel();
      }

   }

   @Inject(
      method = {"setScreen"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onSetScreen(class_437 var1, CallbackInfo var2) {
      .ml var3 = new .ml(var1);
      .dh.z(var3);
      if (var3.adr()) {
         var2.cancel();
      }

   }

   @Inject(
      method = {"stop"},
      at = {@At("HEAD")}
   )
   private void onClose(CallbackInfo var1) {
      ((.me).me.oiq).bf().fy();
   }

   @Inject(
      method = {"<init>"},
      at = {@At("TAIL")}
   )
   private void onInit(CallbackInfo var1) {
      ((.me).me.oiq).lz();
   }
}
