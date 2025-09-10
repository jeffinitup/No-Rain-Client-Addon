package com.franzy.norainclient.mixin;

import net.minecraft.src.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public class EntityRendererMixin {

    @Inject(method = "addRainParticles", at = @At("HEAD"), cancellable = true)
    private void disableRainParticles(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "renderRainSnow", at = @At("HEAD"), cancellable = true)
    private void disableRenderRainSnow(float partialTicks, CallbackInfo ci) {
        ci.cancel();
    }
}



