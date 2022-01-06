//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 */
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;

public class _cG
extends _bA {
    public static final String[] rx;
    public static _cd_0 rw;
    public static _cG rv;
    public static final int[] ry;

    @Override
    public String getHUDData() {
        return rx[ry[7]] + rw.getMode();
    }

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        if (this.pb.player.fallDistance > 4.0f) {
            switch (rw.getValue()) {
                case 0: {
                    this.pb.player.fallDistance = 0.0f;
                    this.pb.player.connection.sendPacket((Packet)new CPacketPlayer.Position(this.pb.player.posX + 420420.0, this.pb.player.posY, this.pb.player.posZ, ry[3]));
                    this.pb.player.connection.sendPacket((Packet)new CPacketPlayer.Position(this.pb.player.posX, this.pb.player.posY + 1.0, this.pb.player.posZ, ry[4]));
                    break;
                }
                case 1: {
                    this.pb.player.connection.sendPacket((Packet)new CPacketPlayer.Position(this.pb.player.posX, this.pb.player.posY + 1.0, this.pb.player.posZ, ry[5]));
                    break;
                }
                case 2: {
                    this.pb.getConnection().sendPacket((Packet)new CPacketPlayer(ry[6]));
                }
            }
        }
    }

    static {
        ry = new int[]{0, 1, 0, 0, 1, 1, 1, 2, 7, 0, 1, 2, 3, 4, 5, 6, 3, 3, 0, 4, 1, 5, 2, 6};
        String[] stringArray = new String[ry[8]];
        stringArray[_cG.ry[9]] = "NoFall";
        stringArray[_cG.ry[10]] = "dont break ur legs when you fall";
        stringArray[_cG.ry[11]] = " ";
        stringArray[_cG.ry[12]] = "Mode";
        stringArray[_cG.ry[13]] = "NCP";
        stringArray[_cG.ry[14]] = "AAC";
        stringArray[_cG.ry[15]] = "Vanilla";
        rx = stringArray;
        String[] stringArray2 = new String[ry[17]];
        stringArray2[_cG.ry[18]] = rx[ry[19]];
        stringArray2[_cG.ry[20]] = rx[ry[21]];
        stringArray2[_cG.ry[22]] = rx[ry[23]];
        rw = new _cd_0(rx[ry[16]], stringArray2);
    }

    public _cG() {
        super(rx[ry[0]], rx[ry[1]], ry[2], _aL.hy);
        this.addSetting(rw);
        rv = this;
    }
}

