//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketTimeUpdate
 *  net.minecraft.network.play.server.SPacketUpdateBossInfo
 *  net.minecraftforge.client.event.RenderBlockOverlayEvent
 *  net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.network.play.server.SPacketTimeUpdate;
import net.minecraft.network.play.server.SPacketUpdateBossInfo;
import net.minecraftforge.client.event.RenderBlockOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class _P
extends _bA {
    public _cJ bY;
    public static _k_0 bV;
    public _k_0 bW;
    public static _P bQ;
    public _k_0 bX;
    public static _k_0 bU;
    public _k_0 bS;
    @EventHandler
    public final Listener<_cy> bZ;
    public _k_0 bR = new _k_0(lQ[pd[3]], pd[4]);
    public static final int[] pd;
    public static final String[] lQ;
    public _k_0 bT;

    @Override
    public void onUpdate() {
        if (this.bX.isEnabled()) {
            this.pb.world.setWorldTime((long)this.bY.getDoubleValue());
        }
    }

    public _P() {
        super(lQ[pd[0]], lQ[pd[1]], pd[2], _aL.hz);
        this.bS = new _k_0(lQ[pd[5]], pd[6]);
        this.bT = new _k_0(lQ[pd[7]], pd[8]);
        this.bW = new _k_0(lQ[pd[9]], pd[10]);
        this.bX = new _k_0(lQ[pd[11]], pd[12]);
        this.bY = new _cJ(lQ[pd[13]], 0.0, 0.0, 23000.0, 100.0);
        this.bZ = new Listener<_cy>(_cy2 -> {
            if (_cy2.getPacket() instanceof SPacketTimeUpdate && this.bX.isEnabled()) {
                _cy2.cancel();
            }
            if (_cy2.getPacket() instanceof SPacketUpdateBossInfo && this.bW.isEnabled()) {
                _cy2.cancel();
            }
        }, new Predicate[pd[14]]);
        _bd_0[] _bd_0Array = new _bd_0[pd[15]];
        _bd_0Array[_P.pd[16]] = this.bR;
        _bd_0Array[_P.pd[17]] = this.bS;
        _bd_0Array[_P.pd[18]] = this.bT;
        _bd_0Array[_P.pd[19]] = bU;
        _bd_0Array[_P.pd[20]] = this.bW;
        _bd_0Array[_P.pd[21]] = bV;
        _bd_0Array[_P.pd[22]] = this.bX;
        _bd_0Array[_P.pd[23]] = this.bY;
        this.addSettings(_bd_0Array);
        bQ = this;
    }

    static {
        pd = new int[]{0, 1, 0, 2, 1, 3, 1, 4, 0, 5, 1, 6, 0, 7, 0, 8, 0, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 1, 9, 1};
        String[] stringArray = new String[pd[27]];
        stringArray[_P.pd[28]] = "NoRender";
        stringArray[_P.pd[29]] = "stops things from being rendered";
        stringArray[_P.pd[30]] = "Fire";
        stringArray[_P.pd[31]] = "Water";
        stringArray[_P.pd[32]] = "Block";
        stringArray[_P.pd[33]] = "Bossbars";
        stringArray[_P.pd[34]] = "Change Time";
        stringArray[_P.pd[35]] = "Time";
        stringArray[_P.pd[36]] = "Portal";
        stringArray[_P.pd[37]] = "Potions";
        lQ = stringArray;
        bU = new _k_0(lQ[pd[38]], pd[39]);
        bV = new _k_0(lQ[pd[40]], pd[41]);
    }

    @SubscribeEvent
    public void onRenderBlockOverlay(RenderBlockOverlayEvent renderBlockOverlayEvent) {
        if (this.nullCheck()) {
            return;
        }
        if (renderBlockOverlayEvent.getOverlayType().equals((Object)RenderBlockOverlayEvent.OverlayType.FIRE) && this.bR.getValue()) {
            renderBlockOverlayEvent.setCanceled(pd[24]);
        }
        if (renderBlockOverlayEvent.getOverlayType().equals((Object)RenderBlockOverlayEvent.OverlayType.WATER) && this.bS.getValue()) {
            renderBlockOverlayEvent.setCanceled(pd[25]);
        }
        if (renderBlockOverlayEvent.getOverlayType().equals((Object)RenderBlockOverlayEvent.OverlayType.BLOCK) && this.bT.getValue()) {
            renderBlockOverlayEvent.setCanceled(pd[26]);
        }
    }
}

