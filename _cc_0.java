//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketChatMessage
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.network.play.client.CPacketUseEntity$Action
 *  net.minecraft.world.World
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 */
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

/*
 * Renamed from _cc
 */
public class _cc_0
extends _bA {
    public int oQ;
    public static final String[] oV;
    public static final int[] pd;
    public _k_0 oP;
    @EventHandler
    public Listener<LivingDeathEvent> oU;
    public static String oS;
    @EventHandler
    public Listener<_bR> oT;
    public static final ConcurrentHashMap<Object, Integer> oR;
    public _cs_0 oO = new _cs_0(oV[pd[3]], oV[pd[4]]);

    public void announce(String string) {
        if (this.oQ < pd[13]) {
            return;
        }
        this.oQ = pd[14];
        oR.remove(string);
        String string2 = oV[pd[15]];
        if (this.oP.isEnabled()) {
            string2 = oV[pd[16]];
        }
        String string3 = oV[pd[17]];
        string3 = string2 + this.oO.getText();
        this.pb.player.connection.sendPacket((Packet)new CPacketChatMessage(string3));
    }

    static {
        pd = new int[]{0, 1, 0, 2, 3, 4, 1, 0, 0, 0, 1, 0, 1, 150, 0, 5, 6, 7, 20, 8, 1, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        String[] stringArray = new String[pd[21]];
        stringArray[_cc_0.pd[22]] = "AutoEZ";
        stringArray[_cc_0.pd[23]] = "lets people know you're clouted";
        stringArray[_cc_0.pd[24]] = "MSG";
        stringArray[_cc_0.pd[25]] = "ez";
        stringArray[_cc_0.pd[26]] = "Green Text";
        stringArray[_cc_0.pd[27]] = "";
        stringArray[_cc_0.pd[28]] = "> ";
        stringArray[_cc_0.pd[29]] = "";
        stringArray[_cc_0.pd[30]] = "";
        stringArray[_cc_0.pd[31]] = "";
        oV = stringArray;
        oR = new ConcurrentHashMap();
        oS = oV[pd[32]];
    }

    public static void addTarget(String string) {
        if (!Objects.equals(string, Minecraft.getMinecraft().player.getName())) {
            oR.put(string, pd[18]);
        }
    }

    @Override
    public void onUpdate() {
        for (Entity entity : this.pb.world.getLoadedEntityList()) {
            EntityPlayer entityPlayer;
            if (!(entity instanceof EntityPlayer) || !((entityPlayer = (EntityPlayer)entity).getHealth() <= 0.0f) || !oR.containsKey(entityPlayer.getName())) continue;
            this.announce(entityPlayer.getName());
        }
        oR.forEach((object, n) -> {
            if (n <= 0) {
                oR.remove(object);
            } else {
                oR.put(object, n - pd[20]);
            }
        });
        this.oQ += pd[12];
    }

    @Override
    public String getHUDData() {
        return oV[pd[19]];
    }

    public _cc_0() {
        super(oV[pd[0]], oV[pd[1]], pd[2], _aL.hC);
        this.oP = new _k_0(oV[pd[5]], pd[6]);
        this.oQ = pd[7];
        this.oT = new Listener<_bR>(_bR2 -> {
            Entity entity;
            CPacketUseEntity cPacketUseEntity;
            if (this.pb.player == null) {
                return;
            }
            if (_bR2.getPacket() instanceof CPacketUseEntity && (cPacketUseEntity = (CPacketUseEntity)_bR2.getPacket()).getAction().equals((Object)CPacketUseEntity.Action.ATTACK) && (entity = cPacketUseEntity.getEntityFromWorld((World)this.pb.world)) instanceof EntityPlayer) {
                _cc_0.addTarget(entity.getName());
            }
        }, new Predicate[pd[8]]);
        this.oU = new Listener<LivingDeathEvent>(livingDeathEvent -> {
            EntityPlayer entityPlayer;
            if (this.pb.player == null) {
                return;
            }
            EntityLivingBase entityLivingBase = livingDeathEvent.getEntityLiving();
            if (entityLivingBase == null) {
                return;
            }
            if (entityLivingBase instanceof EntityPlayer && (entityPlayer = (EntityPlayer)entityLivingBase).getHealth() <= 0.0f && oR.containsKey(entityPlayer.getName())) {
                this.announce(entityPlayer.getName());
            }
        }, new Predicate[pd[9]]);
        _bd_0[] _bd_0Array = new _bd_0[pd[10]];
        _bd_0Array[_cc_0.pd[11]] = this.oO;
        this.addSettings(_bd_0Array);
    }

    public static void setMessage(String string) {
        oS = string;
    }
}

