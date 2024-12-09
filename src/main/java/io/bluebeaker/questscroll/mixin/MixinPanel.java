package io.bluebeaker.questscroll.mixin;

import com.feed_the_beast.ftblib.lib.gui.Panel;
import io.bluebeaker.questscroll.GuiState;
import io.bluebeaker.questscroll.QuestScrollConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Panel.class,remap = false)
public class MixinPanel {
    @Inject(method = "mouseScrolled(I)Z",at=@At("HEAD"), cancellable = true)
    public void injected(int scroll, CallbackInfoReturnable<Boolean> cir){
        if(GuiState.contextMenu!=null){
            GuiState.contextMenu.posY+=scroll * QuestScrollConfig.scroll_amount;
            cir.setReturnValue(false);
        }
    }
}
