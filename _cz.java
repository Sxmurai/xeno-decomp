//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.projectile.EntityFishHook
 *  net.minecraft.network.play.server.SPacketEntityStatus
 *  net.minecraft.network.play.server.SPacketEntityVelocity
 *  net.minecraft.network.play.server.SPacketExplosion
 *  net.minecraft.world.World
 */
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.network.play.server.SPacketEntityStatus;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.network.play.server.SPacketExplosion;
import net.minecraft.world.World;

public class _cz
extends _bA {
    public static _cz qT;
    public _k_0 qU = new _k_0(ra[rb[3]], rb[4]);
    public _k_0 qY;
    public static final String[] ra;
    public _k_0 qX;
    public _cJ qV = new _cJ(ra[rb[5]], 0.0, 0.0, 1.0, 0.01);
    public _cJ qW = new _cJ(ra[rb[6]], 0.0, 0.0, 1.0, 0.01);
    public static final int[] rb;
    @EventHandler
    public final Listener<_cy> qZ;

    public _cz() {
        super(ra[rb[0]], ra[rb[1]], rb[2], _aL.hy);
        this.qX = new _k_0(ra[rb[7]], rb[8]);
        this.qY = new _k_0(ra[rb[9]], rb[10]);
        this.qZ = new Listener<_cy>(_cy2 -> {
            Entity entity;
            SPacketEntityStatus sPacketEntityStatus;
            if (_cy2.getPacket() instanceof SPacketEntityVelocity && ((SPacketEntityVelocity)_cy2.getPacket()).getEntityID() == this.pb.player.getEntityId() && this.qU.isEnabled()) {
                if (this.qV.getFloatValue() == 0.0f && this.qW.getFloatValue() == 0.0f) {
                    _cy2.cancel();
                    return;
                }
                sPacketEntityStatus = (SPacketEntityVelocity)_cy2.getPacket();
                sPacketEntityStatus.motionX = (int)((float)sPacketEntityStatus.motionX * this.qV.getFloatValue());
                sPacketEntityStatus.motionY = (int)((float)sPacketEntityStatus.motionY * this.qW.getFloatValue());
                sPacketEntityStatus.motionZ = (int)((float)sPacketEntityStatus.motionZ * this.qV.getFloatValue());
            }
            if (_cy2.getPacket() instanceof SPacketExplosion && this.qX.isEnabled()) {
                _cy2.cancel();
            }
            if (_cy2.getPacket() instanceof SPacketEntityStatus && this.qY.isEnabled() && (sPacketEntityStatus = (SPacketEntityStatus)_cy2.getPacket()).getOpCode() == rb[18] && (entity = sPacketEntityStatus.getEntity((World)this.pb.world)) instanceof EntityFishHook) {
                EntityFishHook entityFishHook = (EntityFishHook)entity;
                if (entityFishHook.caughtEntity == this.pb.player) {
                    _cy2.cancel();
                }
            }
        }, new Predicate[rb[11]]);
        _bd_0[] _bd_0Array = new _bd_0[rb[12]];
        _bd_0Array[_cz.rb[13]] = this.qU;
        _bd_0Array[_cz.rb[14]] = this.qV;
        _bd_0Array[_cz.rb[15]] = this.qW;
        _bd_0Array[_cz.rb[16]] = this.qX;
        _bd_0Array[_cz.rb[17]] = this.qY;
        this.addSettings(_bd_0Array);
        qT = this;
    }

    static {
        rb = new int[]{0, 1, 0, 2, 1, 3, 4, 5, 1, 6, 1, 0, 5, 0, 1, 2, 3, 4, 31, 7, 0, 1, 2, 3, 4, 5, 6};
        String[] stringArray = new String[rb[19]];
        stringArray[_cz.rb[20]] = "Velocity";
        stringArray[_cz.rb[21]] = "stops u being knocked back";
        stringArray[_cz.rb[22]] = "Velocity PKT";
        stringArray[_cz.rb[23]] = "Horizontal";
        stringArray[_cz.rb[24]] = "Vertical";
        stringArray[_cz.rb[25]] = "Explosion";
        stringArray[_cz.rb[26]] = "Fishhook";
        ra = stringArray;
    }
}

