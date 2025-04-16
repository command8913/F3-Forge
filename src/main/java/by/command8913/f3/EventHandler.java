package by.command8913.f3;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EventHandler {

    @SubscribeEvent
    public void onDebugOverlay(RenderGameOverlayEvent.Text event) {
        Minecraft mc = Minecraft.getInstance();
        PlayerEntity player = mc.player;

        if (player != null && player.isSpectator() && mc.options.renderDebug) {
            mc.options.renderDebug = false;
        }
    }
}