//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.PlayerControllerMP
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

/*
 * Renamed from _bt
 */
public class _bt_0 {
    public static final Minecraft lj;
    public static final List<Block> li;
    public static final List<Block> lh;
    public static final int[] lk;

    public static void processRightClickBlock(BlockPos blockPos, EnumFacing enumFacing, Vec3d vec3d) {
        _bt_0.getPlayerController().processRightClickBlock(_aV.getPlayer(), _bt_0.lj.world, blockPos, enumFacing, vec3d, EnumHand.MAIN_HAND);
    }

    public static PlayerControllerMP getPlayerController() {
        return Minecraft.getMinecraft().playerController;
    }

    public static IBlockState getState(BlockPos blockPos) {
        return _aV.getWorld().getBlockState(blockPos);
    }

    public static float[] calcAngle(Vec3d vec3d, Vec3d vec3d2) {
        double d = vec3d2.x - vec3d.x;
        double d2 = (vec3d2.y - vec3d.y) * -1.0;
        double d3 = vec3d2.z - vec3d.z;
        double d4 = MathHelper.sqrt((double)(d * d + d3 * d3));
        float[] fArray = new float[lk[16]];
        fArray[_bt_0.lk[17]] = (float)MathHelper.wrapDegrees((double)(Math.toDegrees(Math.atan2(d3, d)) - 90.0));
        fArray[_bt_0.lk[18]] = (float)MathHelper.wrapDegrees((double)Math.toDegrees(Math.atan2(d2, d4)));
        return fArray;
    }

    public static float[] getLegitRotations(Vec3d vec3d) {
        Vec3d vec3d2 = _bt_0.getEyesPos();
        double d = vec3d.x - vec3d2.x;
        double d2 = vec3d.y - vec3d2.y;
        double d3 = vec3d.z - vec3d2.z;
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f = (float)Math.toDegrees(Math.atan2(d3, d)) - 90.0f;
        float f2 = (float)(-Math.toDegrees(Math.atan2(d2, d4)));
        float[] fArray = new float[lk[3]];
        fArray[_bt_0.lk[4]] = _aV.getPlayer().rotationYaw + MathHelper.wrapDegrees((float)(f - _aV.getPlayer().rotationYaw));
        fArray[_bt_0.lk[5]] = _aV.getPlayer().rotationPitch + MathHelper.wrapDegrees((float)(f2 - _aV.getPlayer().rotationPitch));
        return fArray;
    }

    public static EnumFacing getPlaceableSide(BlockPos blockPos) {
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        for (int i = lk[20]; i < n; ++i) {
            IBlockState iBlockState;
            EnumFacing enumFacing = enumFacingArray[i];
            BlockPos blockPos2 = blockPos.offset(enumFacing);
            if (!_bt_0.lj.world.getBlockState(blockPos2).getBlock().canCollideCheck(_bt_0.lj.world.getBlockState(blockPos2), lk[21]) || (iBlockState = _bt_0.lj.world.getBlockState(blockPos2)).getMaterial().isReplaceable()) continue;
            return enumFacing;
        }
        return null;
    }

    public static void placeBlockScaffold(BlockPos blockPos) {
        Vec3d vec3d = new Vec3d(_aV.getPlayer().posX, _aV.getPlayer().posY + (double)_aV.getPlayer().getEyeHeight(), _aV.getPlayer().posZ);
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        for (int i = lk[2]; i < n; ++i) {
            Vec3d vec3d2;
            EnumFacing enumFacing = enumFacingArray[i];
            BlockPos blockPos2 = blockPos.offset(enumFacing);
            EnumFacing enumFacing2 = enumFacing.getOpposite();
            if (!_bt_0.canBeClicked(blockPos2) || vec3d.squareDistanceTo(vec3d2 = new Vec3d((Vec3i)blockPos2).add(0.5, 0.5, 0.5).add(new Vec3d(enumFacing2.getDirectionVec()).scale(0.5))) > 18.0625) continue;
            _bt_0.faceVectorPacketInstant(vec3d2);
            _bt_0.processRightClickBlock(blockPos2, enumFacing2, vec3d2);
            _aV.getPlayer().swingArm(EnumHand.MAIN_HAND);
            return;
        }
    }

    public static boolean checkForNeighbours(BlockPos blockPos) {
        if (!_bt_0.hasNeighbour(blockPos)) {
            EnumFacing[] enumFacingArray = EnumFacing.values();
            int n = enumFacingArray.length;
            for (int i = lk[9]; i < n; ++i) {
                EnumFacing enumFacing = enumFacingArray[i];
                BlockPos blockPos2 = blockPos.offset(enumFacing);
                if (!_bt_0.hasNeighbour(blockPos2)) continue;
                return lk[10];
            }
            return lk[11];
        }
        return lk[12];
    }

    static {
        lk = new int[]{1, 0, 0, 2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 2, 0, 1, 0, 0, 0, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 16, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Block[] blockArray = new Block[lk[22]];
        blockArray[_bt_0.lk[23]] = Blocks.ENDER_CHEST;
        blockArray[_bt_0.lk[24]] = Blocks.CHEST;
        blockArray[_bt_0.lk[25]] = Blocks.TRAPPED_CHEST;
        blockArray[_bt_0.lk[26]] = Blocks.CRAFTING_TABLE;
        blockArray[_bt_0.lk[27]] = Blocks.ANVIL;
        blockArray[_bt_0.lk[28]] = Blocks.BREWING_STAND;
        blockArray[_bt_0.lk[29]] = Blocks.HOPPER;
        blockArray[_bt_0.lk[30]] = Blocks.DROPPER;
        blockArray[_bt_0.lk[31]] = Blocks.DISPENSER;
        blockArray[_bt_0.lk[32]] = Blocks.TRAPDOOR;
        blockArray[_bt_0.lk[33]] = Blocks.ENCHANTING_TABLE;
        lh = Arrays.asList(blockArray);
        Block[] blockArray2 = new Block[lk[34]];
        blockArray2[_bt_0.lk[35]] = Blocks.WHITE_SHULKER_BOX;
        blockArray2[_bt_0.lk[36]] = Blocks.ORANGE_SHULKER_BOX;
        blockArray2[_bt_0.lk[37]] = Blocks.MAGENTA_SHULKER_BOX;
        blockArray2[_bt_0.lk[38]] = Blocks.LIGHT_BLUE_SHULKER_BOX;
        blockArray2[_bt_0.lk[39]] = Blocks.YELLOW_SHULKER_BOX;
        blockArray2[_bt_0.lk[40]] = Blocks.LIME_SHULKER_BOX;
        blockArray2[_bt_0.lk[41]] = Blocks.PINK_SHULKER_BOX;
        blockArray2[_bt_0.lk[42]] = Blocks.GRAY_SHULKER_BOX;
        blockArray2[_bt_0.lk[43]] = Blocks.SILVER_SHULKER_BOX;
        blockArray2[_bt_0.lk[44]] = Blocks.CYAN_SHULKER_BOX;
        blockArray2[_bt_0.lk[45]] = Blocks.PURPLE_SHULKER_BOX;
        blockArray2[_bt_0.lk[46]] = Blocks.BLUE_SHULKER_BOX;
        blockArray2[_bt_0.lk[47]] = Blocks.BROWN_SHULKER_BOX;
        blockArray2[_bt_0.lk[48]] = Blocks.GREEN_SHULKER_BOX;
        blockArray2[_bt_0.lk[49]] = Blocks.RED_SHULKER_BOX;
        blockArray2[_bt_0.lk[50]] = Blocks.BLACK_SHULKER_BOX;
        li = Arrays.asList(blockArray2);
        lj = Minecraft.getMinecraft();
    }

    public static boolean hasNeighbour(BlockPos blockPos) {
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        for (int i = lk[13]; i < n; ++i) {
            EnumFacing enumFacing = enumFacingArray[i];
            BlockPos blockPos2 = blockPos.offset(enumFacing);
            if (_aV.getWorld().getBlockState(blockPos2).getMaterial().isReplaceable()) continue;
            return lk[14];
        }
        return lk[15];
    }

    public static boolean canBeClicked(BlockPos blockPos) {
        return _bt_0.getBlock(blockPos).canCollideCheck(_bt_0.getState(blockPos), lk[8]);
    }

    public static boolean hotbarSlotCheckEmpty(ItemStack itemStack) {
        return itemStack != ItemStack.EMPTY ? lk[0] : lk[1];
    }

    public static List<BlockPos> getCircle(BlockPos blockPos, int n, float f, boolean bl) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        int n2 = blockPos.getX();
        int n3 = blockPos.getZ();
        int n4 = n2 - (int)f;
        while ((float)n4 <= (float)n2 + f) {
            int n5 = n3 - (int)f;
            while ((float)n5 <= (float)n3 + f) {
                double d = (n2 - n4) * (n2 - n4) + (n3 - n5) * (n3 - n5);
                if (!(!(d < (double)(f * f)) || bl && d < (double)((f - 1.0f) * (f - 1.0f)))) {
                    BlockPos blockPos2 = new BlockPos(n4, n, n5);
                    arrayList.add(blockPos2);
                }
                ++n5;
            }
            ++n4;
        }
        return arrayList;
    }

    public static boolean blockCheckNonBlock(ItemStack itemStack) {
        return itemStack.getItem() instanceof ItemBlock;
    }

    public static List<BlockPos> getSphere(BlockPos blockPos, float f, int n, boolean bl, boolean bl2, int n2) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        int n3 = blockPos.getX();
        int n4 = blockPos.getY();
        int n5 = blockPos.getZ();
        int n6 = n3 - (int)f;
        while ((float)n6 <= (float)n3 + f) {
            int n7 = n5 - (int)f;
            while ((float)n7 <= (float)n5 + f) {
                int n8 = bl2 ? n4 - (int)f : n4;
                while (true) {
                    float f2 = n8;
                    float f3 = bl2 ? (float)n4 + f : (float)(n4 + n);
                    if (!(f2 < f3)) break;
                    double d = (n3 - n6) * (n3 - n6) + (n5 - n7) * (n5 - n7) + (bl2 ? (n4 - n8) * (n4 - n8) : lk[19]);
                    if (!(!(d < (double)(f * f)) || bl && d < (double)((f - 1.0f) * (f - 1.0f)))) {
                        BlockPos blockPos2 = new BlockPos(n6, n8 + n2, n7);
                        arrayList.add(blockPos2);
                    }
                    ++n8;
                }
                ++n7;
            }
            ++n6;
        }
        return arrayList;
    }

    public static void faceVectorPacketInstant(Vec3d vec3d) {
        float[] fArray = _bt_0.getLegitRotations(vec3d);
        _aV.getConnection().sendPacket((Packet)new CPacketPlayer.Rotation(fArray[lk[6]], fArray[lk[7]], _aV.getPlayer().onGround));
    }

    public static Block getBlock(BlockPos blockPos) {
        return _bt_0.getState(blockPos).getBlock();
    }

    public static Vec3d getEyesPos() {
        return new Vec3d(_aV.getPlayer().posX, _aV.getPlayer().posY + (double)_aV.getPlayer().getEyeHeight(), _aV.getPlayer().posZ);
    }
}

