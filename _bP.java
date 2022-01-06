//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.world.World
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class _bP
extends EntityOtherPlayerMP {
    public static Minecraft nH = Minecraft.getMinecraft();

    public _bP() {
        super((World)_bP.nH.world, _bP.nH.player.getGameProfile());
        this.copyLocationAndAnglesFrom((Entity)_bP.nH.player);
        this.inventory.copyInventory(_bP.nH.player.inventory);
        this.rotationYawHead = _bP.nH.player.rotationYawHead;
        this.renderYawOffset = _bP.nH.player.renderYawOffset;
        this.chasingPosX = this.posX;
        this.chasingPosY = this.posY;
        this.chasingPosZ = this.posZ;
        _bP.nH.world.addEntityToWorld(this.getEntityId(), (Entity)this);
    }

    public void despawn() {
        _bP.nH.world.removeEntityFromWorld(this.getEntityId());
    }

    public _bP(String string) {
        super((World)_bP.nH.world, _bP.nH.player.getGameProfile());
        this.setCustomNameTag(string);
        this.copyLocationAndAnglesFrom((Entity)_bP.nH.player);
        this.inventory.copyInventory(_bP.nH.player.inventory);
        this.rotationYawHead = _bP.nH.player.rotationYawHead;
        this.renderYawOffset = _bP.nH.player.renderYawOffset;
        this.chasingPosX = this.posX;
        this.chasingPosY = this.posY;
        this.chasingPosZ = this.posZ;
        _bP.nH.world.addEntityToWorld(this.getEntityId(), (Entity)this);
    }

    public void resetPlayerPosition() {
        _bP.nH.player.setPositionAndRotation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
    }
}

