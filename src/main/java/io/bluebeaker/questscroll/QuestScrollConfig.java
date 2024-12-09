package io.bluebeaker.questscroll;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Type;

@Config(modid = QuestScroll.MODID,type = Type.INSTANCE,category = "general")
public class QuestScrollConfig {
    public static int scroll_amount = 10;
}