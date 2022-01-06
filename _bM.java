//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketChatMessage
 *  net.minecraftforge.client.event.ClientChatEvent
 */
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraftforge.client.event.ClientChatEvent;

public class _bM
extends _bA {
    public static final String[] nf;
    public static final int[] pd;
    @EventHandler
    public final Listener<ClientChatEvent> ne;
    public _cs_0 nd = new _cs_0(nf[pd[3]], nf[pd[4]]);

    static {
        pd = new int[]{0, 1, 0, 2, 3, 0, 1, 0, 4, 1, 5, 6, 0, 1, 2, 3, 4, 5};
        String[] stringArray = new String[pd[11]];
        stringArray[_bM.pd[12]] = "Suffix";
        stringArray[_bM.pd[13]] = "adds text after every message";
        stringArray[_bM.pd[14]] = "MSG";
        stringArray[_bM.pd[15]] = "xeno on top";
        stringArray[_bM.pd[16]] = "/";
        stringArray[_bM.pd[17]] = " | ";
        nf = stringArray;
    }

    public _bM() {
        super(nf[pd[0]], nf[pd[1]], pd[2], _aL.hC);
        this.ne = new Listener<ClientChatEvent>(clientChatEvent -> {
            if (!clientChatEvent.getMessage().startsWith(_bh_0.jJ) && !clientChatEvent.getMessage().startsWith(nf[pd[8]])) {
                clientChatEvent.setCanceled(pd[9]);
                this.pb.getConnection().sendPacket((Packet)new CPacketChatMessage(clientChatEvent.getMessage() + nf[pd[10]] + this.nd.getText()));
            }
        }, new Predicate[pd[5]]);
        _bd_0[] _bd_0Array = new _bd_0[pd[6]];
        _bd_0Array[_bM.pd[7]] = this.nd;
        this.addSettings(_bd_0Array);
    }
}

