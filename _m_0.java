//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.world.World
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.world.World;

/*
 * Renamed from _m
 */
public class _m_0
extends _bA {
    public final Queue<CPacketPlayer> S = new LinkedList<CPacketPlayer>();
    public EntityOtherPlayerMP T;
    @EventHandler
    public final Listener<_bR> U = new Listener<_bR>(_bR2 -> {
        if (this.pb.player == null || this.pb.world == null) {
            return;
        }
        if (_bR2.getPacket() instanceof CPacketPlayer) {
            _bR2.cancel();
            this.S.add((CPacketPlayer)_bR2.getPacket());
        }
    }, new Predicate[pd[2]]);
    public static final String[] lQ;
    public static final int[] pd;

    @Override
    public void onEnable() {
        this.T = new EntityOtherPlayerMP((World)this.pb.world, this.pb.getSession().getProfile());
        this.T.copyLocationAndAnglesFrom((Entity)this.pb.player);
        this.T.rotationYawHead = this.pb.player.rotationYawHead;
        this.pb.world.addEntityToWorld(pd[3], (Entity)this.T);
    }

    static {
        pd = new int[]{0, 1, 0, -100, -100, 2, 0, 1};
        String[] stringArray = new String[pd[5]];
        stringArray[_m_0.pd[6]] = "Blink";
        stringArray[_m_0.pd[7]] = "fake lag";
        lQ = stringArray;
    }

    public _m_0() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hx);
    }

    @Override
    public void onDisable() {
        while (!this.S.isEmpty()) {
            this.pb.player.connection.sendPacket((Packet)this.S.poll());
        }
        if (this.pb.player != null) {
            this.pb.world.removeEntityFromWorld(pd[4]);
            this.T = null;
        }
    }
}

