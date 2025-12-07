package dev.krypton.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_310;
import net.minecraft.class_4048;
import net.minecraft.class_4050;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1297.class})
public abstract class EntityMixin {
   @Shadow
   private class_4048 field_18065;

   @Inject(
      method = {"getTargetingMargin"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void getTargetingMargin(CallbackInfoReturnable<Float> var1) {
      .dh.z(new .ep((class_1297)this, var1));
   }

   @Inject(
      method = {"getPose"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGetPose(CallbackInfoReturnable<class_4050> var1) {
      .dh.z(new .lk((class_1297)this, var1));
   }

   @Inject(
      method = {"changeLookDirection"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void updateChangeLookDirection(double var1, double var3, CallbackInfo var5) {
      if (this == ((class_310).me.vic).field_1724) {
         .li var6 = (.li)((.vt)((.me).me.oiq).yqj).kxc(.li.class);
         if (var6.lj()) {
            var6.zwo(var1 * 0.15D, var3 * 0.15D);
            var5.cancel();
         }

      }
   }

   @Inject(
      method = {"calculateBoundingBox"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void calculateBoundingBox(CallbackInfoReturnable<class_238> var1) {
      if (this instanceof class_1309) {
         class_1309 var3 = (class_1309)this;
         if (var3 instanceof class_1657) {
            class_1657 var4 = (class_1657)var3;
            if (var4.method_7340()) {
               return;
            }
         }

         .ga var6 = (.ga)((.vt)((.me).me.oiq).yqj).kxc(.ga.class);
         if (!var6.lj()) {
            return;
         }

         LivingEntityAccessor var5 = (LivingEntityAccessor)var3;
         var1.setReturnValue(this.field_18065.method_30231(var5.getServerX(), var5.getServerY(), var5.getServerZ()));
      }

   }

   @ModifyReturnValue(
      method = {"getPose"},
      at = {@At("RETURN")}
   )
   private class_4050 modifyGetPose(class_4050 var1) {
      if (this != ((class_310).me.vic).field_1724) {
         return var1;
      } else {
         return var1 == class_4050.field_18081 && !((class_310).me.vic).field_1724.method_5715() ? class_4050.field_18076 : var1;
      }
   }
}
