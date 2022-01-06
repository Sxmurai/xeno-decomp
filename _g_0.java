//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
import java.util.ArrayList;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

/*
 * Renamed from _g
 */
public class _g_0
extends _bA {
    public _K z;
    public static _g_0 w;
    public _k_0 y;
    public _k_0 x = new _k_0(lQ[pd[3]], pd[4]);
    public static final String[] lQ;
    public static final int[] pd;

    static {
        pd = new int[]{0, 1, 0, 2, 0, 3, 0, 1, 0, 0, 0, 4, 100, 1, 1, 90, 0, 1, 0, 1, 2, 2, 0, 1, 4, 0, 1, 2, 3};
        String[] stringArray = new String[pd[24]];
        stringArray[_g_0.pd[25]] = "Surround";
        stringArray[_g_0.pd[26]] = "places obsidian around u";
        stringArray[_g_0.pd[27]] = "Disable";
        stringArray[_g_0.pd[28]] = "Rotate";
        lQ = stringArray;
    }

    public Vec3d getEyePos() {
        double[] dArray = _ce_0.interpolate((Entity)this.pb.player);
        double d = dArray[pd[18]] - this.pb.getRenderManager().viewerPosX;
        double d2 = dArray[pd[19]] - this.pb.getRenderManager().viewerPosY;
        double d3 = dArray[pd[20]] - this.pb.getRenderManager().viewerPosZ;
        return new Vec3d(0.0, 0.0, 1.0).rotatePitch(-((float)Math.toRadians(this.pb.player.rotationPitch))).rotateYaw(-((float)Math.toRadians(this.pb.player.rotationYaw)));
    }

    public float[] getRotations(Vec3d vec3d) {
        double d = vec3d.x + vec3d.x - this.pb.player.posX;
        double d2 = vec3d.y - 3.5 - this.pb.player.posY + (double)this.pb.player.getEyeHeight();
        double d3 = vec3d.z + vec3d.y - this.pb.player.posZ;
        double d4 = Math.sqrt(Math.pow(d, 2.0) + Math.pow(d3, 2.0));
        float f = (float)Math.toDegrees(-Math.atan(d / d3));
        float f2 = (float)(-Math.toDegrees(Math.atan(d2 / d4)));
        if (d < 0.0 && d3 < 0.0) {
            f = (float)(90.0 + Math.toDegrees(Math.atan(d3 / d)));
        } else if (d > 0.0 && d3 < 0.0) {
            f = (float)(-90.0 + Math.toDegrees(Math.atan(d3 / d)));
        }
        float[] fArray = new float[pd[21]];
        fArray[_g_0.pd[22]] = f;
        fArray[_g_0.pd[23]] = f2;
        return fArray;
    }

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        this.z = new _K();
        if (this.z.hasTimeElapsed(100L, pd[9])) {
            this.place();
        }
        if (this.x.N) {
            this.toggle();
        }
    }

    public void faceVectorPacketInstant(Vec3d vec3d) {
        float[] fArray = this.getRotations(vec3d);
        this.pb.getConnection().sendPacket((Packet)new CPacketPlayer.Rotation(fArray[pd[16]], fArray[pd[17]], this.pb.player.onGround));
    }

    public void place() {
        Vec3d vec3d = _bv_0.getInterpolatedPos((Entity)this.pb.player, 0.0f);
        BlockPos blockPos = new BlockPos(vec3d).north();
        BlockPos blockPos2 = new BlockPos(vec3d).south();
        BlockPos blockPos3 = new BlockPos(vec3d).east();
        BlockPos blockPos4 = new BlockPos(vec3d).west();
        BlockPos blockPos5 = new BlockPos(vec3d).down();
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        arrayList.add(blockPos);
        arrayList.add(blockPos2);
        arrayList.add(blockPos3);
        arrayList.add(blockPos4);
        if (this.pb.world.getBlockState(blockPos5).getBlock() == Blocks.AIR) {
            arrayList.add(blockPos5);
        }
        _cu_0.switchToSlot(Blocks.OBSIDIAN);
        int n = pd[10];
        float f = this.pb.player.rotationYaw;
        float f2 = this.pb.player.rotationPitch;
        this.pb.rightClickDelayTimer = pd[11];
        if (this.z.hasTimeElapsed(pd[12] / (n == 0 ? pd[13] : n), pd[14])) {
            for (BlockPos blockPos6 : arrayList) {
                if (this.pb.world.getBlockState(blockPos6).getBlock() == Blocks.OBSIDIAN) continue;
                this.pb.player.rotationYaw = n * pd[15];
                this.pb.getConnection().sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos6, EnumFacing.DOWN, EnumHand.MAIN_HAND, 0.0f, 0.0f, 0.0f));
                ++n;
            }
        }
        this.pb.player.rotationYaw = f;
        this.pb.player.rotationPitch = f2;
    }

    public _g_0() {
        super(lQ[pd[0]], lQ[pd[1]], pd[2], _aL.hx);
        this.y = new _k_0(lQ[pd[5]], pd[6]);
        this.z = new _K();
        _bd_0[] _bd_0Array = new _bd_0[pd[7]];
        _bd_0Array[_g_0.pd[8]] = this.x;
        this.addSettings(_bd_0Array);
        w = this;
    }
}

