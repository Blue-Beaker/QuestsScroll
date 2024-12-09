package io.bluebeaker.questscroll.mixin;

import com.feed_the_beast.ftblib.lib.gui.GuiBase;
import com.feed_the_beast.ftblib.lib.gui.Panel;
import io.bluebeaker.questscroll.GuiState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = GuiBase.class,remap = false)
public abstract class MixinGuiBase {
    @Shadow public Panel contextMenu;

    @Inject(method = "updateGui(IIF)V",at=@At("HEAD"))
    public void injected(int mx, int my, float pt, CallbackInfo ci){
        GuiState.contextMenu=this.contextMenu;
//        int wheel = Mouse.getDWheel();
//        if(wheel>1)
//            wheel= QuestScrollConfig.scroll_amount;
//        if(wheel<-1)
//            wheel=-QuestScrollConfig.scroll_amount;
//        if(this.contextMenu!=null){
//            this.contextMenu.posY+=wheel;
//        }
    }
}
