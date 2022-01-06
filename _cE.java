//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockAir
 *  net.minecraft.block.BlockDeadBush
 *  net.minecraft.block.BlockFire
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.BlockSnow
 *  net.minecraft.block.BlockTallGrass
 *  net.minecraft.block.material.Material
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.network.play.client.CPacketPlayer$Rotation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockDeadBush;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;

public class _cE {
    public static final int[] rr = new int[]{0, 2, 5, 0, 1, 2, 3, 4, 0, 1, 0, 0, 1, 0, 1, 6, 0, 1, 2, 3, 4, 5, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, -1, 1, 3, 2, 0, 0, 0, 2, 0, 1, 0, 1, 360, 1, -1, 0, 2, 0, 1, 0, 1, -1, 1, -1, 0, 1, 0, 0, 1, 0, 0, 1, 2, 0, 1, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 55, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54};
    public static List<Block> ro;
    public static List<Block> rp;
    public static final String[] rq;
    public static Minecraft rn;

    public static void rightClickBlock(BlockPos blockPos, Vec3d vec3d, EnumHand enumHand, EnumFacing enumFacing, boolean bl) {
        if (bl) {
            float f = (float)(vec3d.x - (double)blockPos.getX());
            float f2 = (float)(vec3d.y - (double)blockPos.getY());
            float f3 = (float)(vec3d.z - (double)blockPos.getZ());
            _cE.rn.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, enumHand, f, f2, f3));
        } else {
            _cE.rn.playerController.processRightClickBlock(_cE.rn.player, _cE.rn.world, blockPos, enumFacing, vec3d, enumHand);
        }
    }

    public static boolean intersectsWithEntity(BlockPos blockPos) {
        for (Entity entity : _cE.rn.world.loadedEntityList) {
            if (entity.equals((Object)_cE.rn.player) || entity instanceof EntityItem || !new AxisAlignedBB(blockPos).intersects(entity.getEntityBoundingBox())) continue;
            return rr[30];
        }
        return rr[31];
    }

    public static float[] getLegitRotations(Vec3d vec3d) {
        Vec3d vec3d2 = _cE.getEyesPos();
        double d = vec3d.x - vec3d2.x;
        double d2 = vec3d.y - vec3d2.y;
        double d3 = vec3d.z - vec3d2.z;
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f = (float)Math.toDegrees(Math.atan2(d3, d)) - 90.0f;
        float f2 = (float)(-Math.toDegrees(Math.atan2(d2, d4)));
        float[] fArray = new float[rr[47]];
        fArray[_cE.rr[48]] = _cE.rn.player.rotationYaw + MathHelper.wrapDegrees((float)(f - _cE.rn.player.rotationYaw));
        fArray[_cE.rr[49]] = _cE.rn.player.rotationPitch + MathHelper.wrapDegrees((float)(f2 - _cE.rn.player.rotationPitch));
        return fArray;
    }

    public static _aG getBlockResistance(BlockPos blockPos) {
        if (_cE.rn.world.isAirBlock(blockPos)) {
            return _aG.hc;
        }
        if (!(_cE.rn.world.getBlockState(blockPos).getBlock().getBlockHardness(_cE.rn.world.getBlockState(blockPos), (World)_cE.rn.world, blockPos) == -1.0f || _cE.rn.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN) || _cE.rn.world.getBlockState(blockPos).getBlock().equals(Blocks.ANVIL) || _cE.rn.world.getBlockState(blockPos).getBlock().equals(Blocks.ENCHANTING_TABLE) || _cE.rn.world.getBlockState(blockPos).getBlock().equals(Blocks.ENDER_CHEST))) {
            return _aG.hd;
        }
        if (_cE.rn.world.getBlockState(blockPos).getBlock().equals(Blocks.OBSIDIAN) || _cE.rn.world.getBlockState(blockPos).getBlock().equals(Blocks.ANVIL) || _cE.rn.world.getBlockState(blockPos).getBlock().equals(Blocks.ENCHANTING_TABLE) || _cE.rn.world.getBlockState(blockPos).getBlock().equals(Blocks.ENDER_CHEST)) {
            return _aG.he;
        }
        if (_cE.rn.world.getBlockState(blockPos).getBlock().equals(Blocks.BEDROCK)) {
            return _aG.hf;
        }
        return null;
    }

    public static int isPositionPlaceable(BlockPos blockPos, boolean bl) {
        return _cE.isPositionPlaceable(blockPos, bl, rr[38]);
    }

    public static boolean placeBlock(BlockPos blockPos, int n, boolean bl, boolean bl2, boolean bl3) {
        if (_cE.isBlockEmpty(blockPos)) {
            EnumFacing[] enumFacingArray;
            int n2 = rr[54];
            if (n != _cE.rn.player.inventory.currentItem) {
                n2 = _cE.rn.player.inventory.currentItem;
                _cE.rn.player.inventory.currentItem = n;
            }
            EnumFacing[] enumFacingArray2 = enumFacingArray = EnumFacing.values();
            int n3 = enumFacingArray2.length;
            for (int i = rr[55]; i < n3; ++i) {
                EnumFacing enumFacing = enumFacingArray2[i];
                Block block = _cE.rn.world.getBlockState(blockPos.offset(enumFacing)).getBlock();
                Vec3d vec3d = new Vec3d((double)blockPos.getX() + 0.5 + (double)enumFacing.getXOffset() * 0.5, (double)blockPos.getY() + 0.5 + (double)enumFacing.getYOffset() * 0.5, (double)blockPos.getZ() + 0.5 + (double)enumFacing.getZOffset() * 0.5);
                if (ro.contains(block) || !(_cE.rn.player.getPositionEyes(rn.getRenderPartialTicks()).distanceTo(vec3d) <= 4.25)) continue;
                float[] fArray = new float[rr[56]];
                fArray[_cE.rr[57]] = _cE.rn.player.rotationYaw;
                fArray[_cE.rr[58]] = _cE.rn.player.rotationPitch;
                float[] fArray2 = fArray;
                if (bl) {
                    _cE.rotatePacket(vec3d.x, vec3d.y, vec3d.z);
                }
                if (rp.contains(block)) {
                    _cE.rn.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)_cE.rn.player, CPacketEntityAction.Action.START_SNEAKING));
                }
                _cE.rn.playerController.processRightClickBlock(_cE.rn.player, _cE.rn.world, blockPos.offset(enumFacing), enumFacing.getOpposite(), new Vec3d((Vec3i)blockPos), EnumHand.MAIN_HAND);
                if (rp.contains(block)) {
                    _cE.rn.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)_cE.rn.player, CPacketEntityAction.Action.STOP_SNEAKING));
                }
                if (bl2) {
                    _cE.rn.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray2[rr[59]], fArray2[rr[60]], _cE.rn.player.onGround));
                }
                if (bl3) {
                    _cE.rn.player.swingArm(EnumHand.MAIN_HAND);
                }
                if (n2 != rr[61]) {
                    _cE.rn.player.inventory.currentItem = n2;
                }
                return rr[62];
            }
            if (n2 != rr[63]) {
                _cE.rn.player.inventory.currentItem = n2;
            }
        }
        return rr[64];
    }

    public static Vec3d[] getHelpingBlocks(Vec3d vec3d) {
        Vec3d[] vec3dArray = new Vec3d[rr[2]];
        vec3dArray[_cE.rr[3]] = new Vec3d(vec3d.x, vec3d.y - 1.0, vec3d.z);
        vec3dArray[_cE.rr[4]] = new Vec3d(vec3d.x != 0.0 ? vec3d.x * 2.0 : vec3d.x, vec3d.y, vec3d.x != 0.0 ? vec3d.z : vec3d.z * 2.0);
        vec3dArray[_cE.rr[5]] = new Vec3d(vec3d.x == 0.0 ? vec3d.x + 1.0 : vec3d.x, vec3d.y, vec3d.x == 0.0 ? vec3d.z : vec3d.z + 1.0);
        vec3dArray[_cE.rr[6]] = new Vec3d(vec3d.x == 0.0 ? vec3d.x - 1.0 : vec3d.x, vec3d.y, vec3d.x == 0.0 ? vec3d.z : vec3d.z - 1.0);
        vec3dArray[_cE.rr[7]] = new Vec3d(vec3d.x, vec3d.y + 1.0, vec3d.z);
        return vec3dArray;
    }

    public static boolean checkForNeighbours(BlockPos blockPos) {
        if (!_cE.hasNeighbour(blockPos)) {
            EnumFacing[] enumFacingArray = EnumFacing.values();
            int n = enumFacingArray.length;
            for (int i = rr[11]; i < n; ++i) {
                EnumFacing enumFacing = enumFacingArray[i];
                BlockPos blockPos2 = blockPos.offset(enumFacing);
                if (!_cE.hasNeighbour(blockPos2)) continue;
                return rr[12];
            }
            return rr[13];
        }
        return rr[14];
    }

    public static Vec3d getEyesPos() {
        return new Vec3d(_cE.rn.player.posX, _cE.rn.player.posY + (double)_cE.rn.player.getEyeHeight(), _cE.rn.player.posZ);
    }

    public static Block getBlock(BlockPos blockPos) {
        return _cE.getState(blockPos).getBlock();
    }

    public static boolean isValidBlock(BlockPos blockPos) {
        Block block = _cE.rn.world.getBlockState(blockPos).getBlock();
        return (!(block instanceof BlockLiquid) && block.getMaterial(null) != Material.AIR ? rr[32] : rr[33]) != 0;
    }

    public static boolean canBeClicked(BlockPos blockPos) {
        return _cE.getBlock(blockPos).canCollideCheck(_cE.getState(blockPos), rr[44]);
    }

    public static boolean isBlockEmpty(BlockPos blockPos) {
        try {
            if (ro.contains(_cE.rn.world.getBlockState(blockPos).getBlock())) {
                Entity entity;
                AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
                Iterator iterator = _cE.rn.world.loadedEntityList.iterator();
                do {
                    if (iterator.hasNext()) continue;
                    return rr[65];
                } while (!((entity = (Entity)iterator.next()) instanceof EntityLivingBase) || !axisAlignedBB.intersects(entity.getEntityBoundingBox()));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return rr[66];
    }

    public static void rotatePacket(double d, double d2, double d3) {
        double d4 = d - _cE.rn.player.posX;
        double d5 = d2 - (_cE.rn.player.posY + (double)_cE.rn.player.getEyeHeight());
        double d6 = d3 - _cE.rn.player.posZ;
        double d7 = Math.sqrt(d4 * d4 + d6 * d6);
        float f = (float)Math.toDegrees(Math.atan2(d6, d4)) - 90.0f;
        float f2 = (float)(-Math.toDegrees(Math.atan2(d5, d7)));
        _cE.rn.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(f, f2, _cE.rn.player.onGround));
    }

    public static void swingArm(_cd_0 _cd_02) {
        if (_cd_02.is(rq[rr[70]])) {
            _cE.rn.player.swingArm(EnumHand.MAIN_HAND);
        }
        if (_cd_02.is(rq[rr[71]])) {
            _cE.rn.player.swingArm(EnumHand.OFF_HAND);
        }
    }

    public static void placeCrystalOnBlock(BlockPos blockPos, EnumHand enumHand, boolean bl) {
        RayTraceResult rayTraceResult = _cE.rn.world.rayTraceBlocks(new Vec3d(_cE.rn.player.posX, _cE.rn.player.posY + (double)_cE.rn.player.getEyeHeight(), _cE.rn.player.posZ), new Vec3d((double)blockPos.getX() + 0.5, (double)blockPos.getY() - 0.5, (double)blockPos.getZ() + 0.5));
        EnumFacing enumFacing = rayTraceResult == null || rayTraceResult.sideHit == null ? EnumFacing.UP : rayTraceResult.sideHit;
        _cE.rn.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, enumHand, 0.0f, 0.0f, 0.0f));
        if (bl) {
            _cE.rn.player.connection.sendPacket((Packet)new CPacketAnimation(enumHand));
        }
    }

    public static boolean canBreak(BlockPos blockPos) {
        IBlockState iBlockState = _cE.rn.world.getBlockState(blockPos);
        Block block = iBlockState.getBlock();
        return block.getBlockHardness(iBlockState, (World)_cE.rn.world, blockPos) != -1.0f ? rr[36] : rr[37];
    }

    public static EnumFacing getFirstFacing(BlockPos blockPos) {
        Iterator<EnumFacing> iterator = _cE.getPossibleSides(blockPos).iterator();
        if (iterator.hasNext()) {
            EnumFacing enumFacing = iterator.next();
            return enumFacing;
        }
        return null;
    }

    public static boolean isScaffoldPos(BlockPos blockPos) {
        return (_cE.rn.world.isAirBlock(blockPos) || _cE.rn.world.getBlockState(blockPos).getBlock() == Blocks.SNOW_LAYER || _cE.rn.world.getBlockState(blockPos).getBlock() == Blocks.TALLGRASS || _cE.rn.world.getBlockState(blockPos).getBlock() instanceof BlockLiquid ? rr[34] : rr[35]) != 0;
    }

    public static IBlockState getState(BlockPos blockPos) {
        return _cE.rn.world.getBlockState(blockPos);
    }

    public static List<BlockPos> getNearbyBlocks(EntityPlayer entityPlayer, double d, boolean bl) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        int n = (int)_ac_0.roundDouble(d, rr[0]);
        if (bl) {
            entityPlayer.getPosition().add(new Vec3i(entityPlayer.motionX, entityPlayer.motionY, entityPlayer.motionZ));
        }
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n - n / rr[1]; ++j) {
                for (int k = -n; k <= n; ++k) {
                    arrayList.add(entityPlayer.getPosition().add(i, j, k));
                }
            }
        }
        return arrayList;
    }

    public static boolean hasNeighbour(BlockPos blockPos) {
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        for (int i = rr[8]; i < n; ++i) {
            EnumFacing enumFacing = enumFacingArray[i];
            BlockPos blockPos2 = blockPos.offset(enumFacing);
            if (_cE.rn.world.getBlockState(blockPos2).getMaterial().isReplaceable()) continue;
            return rr[9];
        }
        return rr[10];
    }

    static {
        String[] stringArray = new String[rr[72]];
        stringArray[_cE.rr[73]] = "Mainhand";
        stringArray[_cE.rr[74]] = "Offhand";
        rq = stringArray;
        rn = Minecraft.getMinecraft();
        Block[] blockArray = new Block[rr[75]];
        blockArray[_cE.rr[76]] = Blocks.AIR;
        blockArray[_cE.rr[77]] = Blocks.FLOWING_LAVA;
        blockArray[_cE.rr[78]] = Blocks.LAVA;
        blockArray[_cE.rr[79]] = Blocks.FLOWING_WATER;
        blockArray[_cE.rr[80]] = Blocks.WATER;
        blockArray[_cE.rr[81]] = Blocks.VINE;
        blockArray[_cE.rr[82]] = Blocks.SNOW_LAYER;
        blockArray[_cE.rr[83]] = Blocks.TALLGRASS;
        blockArray[_cE.rr[84]] = Blocks.FIRE;
        ro = Arrays.asList(blockArray);
        Block[] blockArray2 = new Block[rr[85]];
        blockArray2[_cE.rr[86]] = Blocks.CHEST;
        blockArray2[_cE.rr[87]] = Blocks.TRAPPED_CHEST;
        blockArray2[_cE.rr[88]] = Blocks.ENDER_CHEST;
        blockArray2[_cE.rr[89]] = Blocks.WHITE_SHULKER_BOX;
        blockArray2[_cE.rr[90]] = Blocks.ORANGE_SHULKER_BOX;
        blockArray2[_cE.rr[91]] = Blocks.MAGENTA_SHULKER_BOX;
        blockArray2[_cE.rr[92]] = Blocks.LIGHT_BLUE_SHULKER_BOX;
        blockArray2[_cE.rr[93]] = Blocks.YELLOW_SHULKER_BOX;
        blockArray2[_cE.rr[94]] = Blocks.LIME_SHULKER_BOX;
        blockArray2[_cE.rr[95]] = Blocks.PINK_SHULKER_BOX;
        blockArray2[_cE.rr[96]] = Blocks.GRAY_SHULKER_BOX;
        blockArray2[_cE.rr[97]] = Blocks.SILVER_SHULKER_BOX;
        blockArray2[_cE.rr[98]] = Blocks.CYAN_SHULKER_BOX;
        blockArray2[_cE.rr[99]] = Blocks.PURPLE_SHULKER_BOX;
        blockArray2[_cE.rr[100]] = Blocks.BLUE_SHULKER_BOX;
        blockArray2[_cE.rr[101]] = Blocks.BROWN_SHULKER_BOX;
        blockArray2[_cE.rr[102]] = Blocks.GREEN_SHULKER_BOX;
        blockArray2[_cE.rr[103]] = Blocks.RED_SHULKER_BOX;
        blockArray2[_cE.rr[104]] = Blocks.BLACK_SHULKER_BOX;
        blockArray2[_cE.rr[105]] = Blocks.ANVIL;
        blockArray2[_cE.rr[106]] = Blocks.WOODEN_BUTTON;
        blockArray2[_cE.rr[107]] = Blocks.STONE_BUTTON;
        blockArray2[_cE.rr[108]] = Blocks.UNPOWERED_COMPARATOR;
        blockArray2[_cE.rr[109]] = Blocks.UNPOWERED_REPEATER;
        blockArray2[_cE.rr[110]] = Blocks.POWERED_REPEATER;
        blockArray2[_cE.rr[111]] = Blocks.POWERED_COMPARATOR;
        blockArray2[_cE.rr[112]] = Blocks.OAK_FENCE_GATE;
        blockArray2[_cE.rr[113]] = Blocks.SPRUCE_FENCE_GATE;
        blockArray2[_cE.rr[114]] = Blocks.BIRCH_FENCE_GATE;
        blockArray2[_cE.rr[115]] = Blocks.JUNGLE_FENCE_GATE;
        blockArray2[_cE.rr[116]] = Blocks.DARK_OAK_FENCE_GATE;
        blockArray2[_cE.rr[117]] = Blocks.ACACIA_FENCE_GATE;
        blockArray2[_cE.rr[118]] = Blocks.BREWING_STAND;
        blockArray2[_cE.rr[119]] = Blocks.DISPENSER;
        blockArray2[_cE.rr[120]] = Blocks.DROPPER;
        blockArray2[_cE.rr[121]] = Blocks.LEVER;
        blockArray2[_cE.rr[122]] = Blocks.NOTEBLOCK;
        blockArray2[_cE.rr[123]] = Blocks.JUKEBOX;
        blockArray2[_cE.rr[124]] = Blocks.BEACON;
        blockArray2[_cE.rr[125]] = Blocks.BED;
        blockArray2[_cE.rr[126]] = Blocks.FURNACE;
        blockArray2[_cE.rr[127]] = Blocks.OAK_DOOR;
        blockArray2[_cE.rr[128]] = Blocks.SPRUCE_DOOR;
        blockArray2[_cE.rr[129]] = Blocks.BIRCH_DOOR;
        blockArray2[_cE.rr[130]] = Blocks.JUNGLE_DOOR;
        blockArray2[_cE.rr[131]] = Blocks.ACACIA_DOOR;
        blockArray2[_cE.rr[132]] = Blocks.DARK_OAK_DOOR;
        blockArray2[_cE.rr[133]] = Blocks.CAKE;
        blockArray2[_cE.rr[134]] = Blocks.ENCHANTING_TABLE;
        blockArray2[_cE.rr[135]] = Blocks.DRAGON_EGG;
        blockArray2[_cE.rr[136]] = Blocks.HOPPER;
        blockArray2[_cE.rr[137]] = Blocks.REPEATING_COMMAND_BLOCK;
        blockArray2[_cE.rr[138]] = Blocks.COMMAND_BLOCK;
        blockArray2[_cE.rr[139]] = Blocks.CHAIN_COMMAND_BLOCK;
        blockArray2[_cE.rr[140]] = Blocks.CRAFTING_TABLE;
        rp = Arrays.asList(blockArray2);
    }

    public static _o_0 valid(BlockPos blockPos) {
        if (!_cE.rn.world.checkNoEntityCollision(new AxisAlignedBB(blockPos))) {
            return _o_0.ad;
        }
        if (!_cE.checkForNeighbours(blockPos)) {
            return _o_0.af;
        }
        IBlockState iBlockState = _cE.rn.world.getBlockState(blockPos);
        if (iBlockState.getBlock() == Blocks.AIR) {
            BlockPos[] blockPosArray;
            BlockPos[] blockPosArray2 = new BlockPos[rr[15]];
            blockPosArray2[_cE.rr[16]] = blockPos.north();
            blockPosArray2[_cE.rr[17]] = blockPos.south();
            blockPosArray2[_cE.rr[18]] = blockPos.east();
            blockPosArray2[_cE.rr[19]] = blockPos.west();
            blockPosArray2[_cE.rr[20]] = blockPos.up();
            blockPosArray2[_cE.rr[21]] = blockPos.down();
            BlockPos[] blockPosArray3 = blockPosArray = blockPosArray2;
            int n = blockPosArray3.length;
            for (int i = rr[22]; i < n; ++i) {
                BlockPos blockPos2 = blockPosArray3[i];
                IBlockState iBlockState2 = _cE.rn.world.getBlockState(blockPos2);
                if (iBlockState2.getBlock() == Blocks.AIR) continue;
                EnumFacing[] enumFacingArray = EnumFacing.values();
                int n2 = enumFacingArray.length;
                for (int j = rr[23]; j < n2; ++j) {
                    EnumFacing enumFacing = enumFacingArray[j];
                    BlockPos blockPos3 = blockPos.offset(enumFacing);
                    if (!_cE.rn.world.getBlockState(blockPos3).getBlock().canCollideCheck(_cE.rn.world.getBlockState(blockPos3), rr[24])) continue;
                    return _o_0.ag;
                }
            }
            return _o_0.af;
        }
        return _o_0.ae;
    }

    public static boolean canPlaceBlock(BlockPos blockPos) {
        if (_cE.isBlockEmpty(blockPos)) {
            EnumFacing[] enumFacingArray;
            EnumFacing[] enumFacingArray2 = enumFacingArray = EnumFacing.values();
            int n = enumFacingArray2.length;
            for (int i = rr[67]; i < n; ++i) {
                EnumFacing enumFacing = enumFacingArray2[i];
                if (ro.contains(_cE.rn.world.getBlockState(blockPos.offset(enumFacing)).getBlock())) continue;
                Vec3d vec3d = new Vec3d((double)blockPos.getX() + 0.5 + (double)enumFacing.getXOffset() * 0.5, (double)blockPos.getY() + 0.5 + (double)enumFacing.getYOffset() * 0.5, (double)blockPos.getZ() + 0.5 + (double)enumFacing.getZOffset() * 0.5);
                if (!(_cE.rn.player.getPositionEyes(rn.getRenderPartialTicks()).distanceTo(vec3d) <= 4.25)) continue;
                return rr[68];
            }
        }
        return rr[69];
    }

    public static int isPositionPlaceable(BlockPos blockPos, boolean bl, boolean bl2) {
        Block block = _cE.rn.world.getBlockState(blockPos).getBlock();
        if (!(block instanceof BlockAir || block instanceof BlockLiquid || block instanceof BlockTallGrass || block instanceof BlockFire || block instanceof BlockDeadBush || block instanceof BlockSnow)) {
            return rr[39];
        }
        if (!_cE.rayTracePlaceCheck(blockPos, bl, 0.0f)) {
            return rr[40];
        }
        if (bl2) {
            for (EnumFacing enumFacing : _cE.rn.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos))) {
                if (enumFacing instanceof EntityItem || enumFacing instanceof EntityXPOrb) continue;
                return rr[41];
            }
        }
        for (EnumFacing enumFacing : _cE.getPossibleSides(blockPos)) {
            if (!_cE.canBeClicked(blockPos.offset(enumFacing))) continue;
            return rr[42];
        }
        return rr[43];
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
                if (d < (double)(f * f) && (!bl || d >= (double)((f - 1.0f) * (f - 1.0f)))) {
                    BlockPos blockPos2 = new BlockPos(n4, n, n5);
                    arrayList.add(blockPos2);
                }
                ++n5;
            }
            ++n4;
        }
        return arrayList;
    }

    public static List<EnumFacing> getPossibleSides(BlockPos blockPos) {
        ArrayList<EnumFacing> arrayList = new ArrayList<EnumFacing>();
        EnumFacing[] enumFacingArray = EnumFacing.values();
        int n = enumFacingArray.length;
        for (int i = rr[45]; i < n; ++i) {
            IBlockState iBlockState;
            EnumFacing enumFacing = enumFacingArray[i];
            BlockPos blockPos2 = blockPos.offset(enumFacing);
            if (_cE.rn.world.getBlockState(blockPos2) == null) {
                return arrayList;
            }
            if (_cE.rn.world.getBlockState(blockPos2).getBlock() == null) {
                return arrayList;
            }
            if (!_cE.rn.world.getBlockState(blockPos2).getBlock().canCollideCheck(_cE.rn.world.getBlockState(blockPos2), rr[46]) || (iBlockState = _cE.rn.world.getBlockState(blockPos2)).getMaterial().isReplaceable()) continue;
            arrayList.add(enumFacing);
        }
        return arrayList;
    }

    public static boolean rayTracePlaceCheck(BlockPos blockPos, boolean bl, float f) {
        return (!bl || _cE.rn.world.rayTraceBlocks(new Vec3d(_cE.rn.player.posX, _cE.rn.player.posY + (double)_cE.rn.player.getEyeHeight(), _cE.rn.player.posZ), new Vec3d((double)blockPos.getX(), (double)((float)blockPos.getY() + f), (double)blockPos.getZ()), rr[25], rr[26], rr[27]) == null ? rr[28] : rr[29]) != 0;
    }

    public static void faceVector(Vec3d vec3d, boolean bl) {
        float[] fArray = _cE.getLegitRotations(vec3d);
        _cE.rn.player.connection.sendPacket((Packet)new CPacketPlayer.Rotation(fArray[rr[50]], bl ? (float)MathHelper.normalizeAngle((int)((int)fArray[rr[51]]), (int)rr[52]) : fArray[rr[53]], _cE.rn.player.onGround));
    }
}

