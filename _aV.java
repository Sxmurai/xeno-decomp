//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.client.network.NetHandlerPlayClient
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;

public class _aV {
    public static Minecraft iN = Minecraft.getMinecraft();

    public static WorldClient getWorld() {
        return _aV.iN.world;
    }

    public static EntityPlayerSP getPlayer() {
        return _aV.iN.player;
    }

    public static NetHandlerPlayClient getConnection() {
        return iN.getConnection();
    }
}

