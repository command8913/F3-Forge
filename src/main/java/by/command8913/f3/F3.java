package by.command8913.f3;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("f3")
public class F3 {
    public F3() {
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
}