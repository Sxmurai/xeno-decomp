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
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityAgeable
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.EnumCreatureType
 *  net.minecraft.entity.boss.EntityWither
 *  net.minecraft.entity.item.EntityBoat
 *  net.minecraft.entity.item.EntityMinecart
 *  net.minecraft.entity.monster.EntityBlaze
 *  net.minecraft.entity.monster.EntityCaveSpider
 *  net.minecraft.entity.monster.EntityCreeper
 *  net.minecraft.entity.monster.EntityEnderman
 *  net.minecraft.entity.monster.EntityEvoker
 *  net.minecraft.entity.monster.EntityGhast
 *  net.minecraft.entity.monster.EntityIllusionIllager
 *  net.minecraft.entity.monster.EntityIronGolem
 *  net.minecraft.entity.monster.EntityPigZombie
 *  net.minecraft.entity.monster.EntityShulker
 *  net.minecraft.entity.monster.EntitySkeleton
 *  net.minecraft.entity.monster.EntitySlime
 *  net.minecraft.entity.monster.EntitySnowman
 *  net.minecraft.entity.monster.EntitySpellcasterIllager
 *  net.minecraft.entity.monster.EntitySpider
 *  net.minecraft.entity.monster.EntityVex
 *  net.minecraft.entity.monster.EntityWitch
 *  net.minecraft.entity.monster.EntityWitherSkeleton
 *  net.minecraft.entity.monster.EntityZombie
 *  net.minecraft.entity.monster.EntityZombieVillager
 *  net.minecraft.entity.passive.EntityAmbientCreature
 *  net.minecraft.entity.passive.EntityBat
 *  net.minecraft.entity.passive.EntityChicken
 *  net.minecraft.entity.passive.EntityCow
 *  net.minecraft.entity.passive.EntityHorse
 *  net.minecraft.entity.passive.EntityPig
 *  net.minecraft.entity.passive.EntityRabbit
 *  net.minecraft.entity.passive.EntitySheep
 *  net.minecraft.entity.passive.EntitySkeletonHorse
 *  net.minecraft.entity.passive.EntitySquid
 *  net.minecraft.entity.passive.EntityWolf
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockDeadBush;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntitySpellcasterIllager;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

/*
 * Renamed from _bv
 */
public class _bv_0 {
    public static final String[] lo;
    public static final int[] lp;
    public static Minecraft ln;

    public static boolean checkCollide() {
        return (!_bv_0.ln.player.isSneaking() && (_bv_0.ln.player.getRidingEntity() == null || _bv_0.ln.player.getRidingEntity().fallDistance < 3.0f) && _bv_0.ln.player.fallDistance < 3.0f ? lp[66] : lp[67]) != 0;
    }

    public static boolean isSafe(Entity entity, int n, boolean bl) {
        return _bv_0.getUnsafeBlocks(entity, n, bl).size() == 0 ? lp[5] : lp[6];
    }

    public static boolean isVehicle(Entity entity) {
        return (entity instanceof EntityBoat || entity instanceof EntityMinecart ? lp[51] : lp[52]) != 0;
    }

    public static boolean isNeutralMob(Entity entity) {
        return (entity instanceof EntityPigZombie || entity instanceof EntityWolf || entity instanceof EntityEnderman ? lp[56] : lp[57]) != 0;
    }

    public static boolean isLiving(Entity entity) {
        return entity instanceof EntityLivingBase;
    }

    public static boolean isBothHole(BlockPos blockPos) {
        BlockPos[] blockPosArray = new BlockPos[lp[94]];
        blockPosArray[_bv_0.lp[95]] = blockPos.north();
        blockPosArray[_bv_0.lp[96]] = blockPos.south();
        blockPosArray[_bv_0.lp[97]] = blockPos.east();
        blockPosArray[_bv_0.lp[98]] = blockPos.west();
        blockPosArray[_bv_0.lp[99]] = blockPos.down();
        BlockPos[] blockPosArray2 = blockPosArray;
        int n = blockPosArray2.length;
        for (int i = lp[100]; i < n; ++i) {
            BlockPos blockPos2 = blockPosArray2[i];
            IBlockState iBlockState = _bv_0.ln.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() != Blocks.AIR && (iBlockState.getBlock() == Blocks.BEDROCK || iBlockState.getBlock() == Blocks.OBSIDIAN)) continue;
            return lp[101];
        }
        return lp[102];
    }

    public static Vec3d interpolateEntity(Entity entity, float f) {
        return new Vec3d(entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f, entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f, entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f);
    }

    public static boolean isInHole(Entity entity) {
        return _bv_0.isBlockValid(new BlockPos(entity.posX, entity.posY, entity.posZ));
    }

    public static boolean checkForLiquid(Entity entity, boolean bl) {
        if (entity == null) {
            return lp[63];
        }
        double d = entity.posY;
        double d2 = bl ? 0.03 : (entity instanceof EntityPlayer ? 0.2 : 0.5);
        double d3 = d - d2;
        for (int i = MathHelper.floor((double)entity.posX); i < MathHelper.ceil((double)entity.posX); ++i) {
            for (int j = MathHelper.floor((double)entity.posZ); j < MathHelper.ceil((double)entity.posZ); ++j) {
                if (!(_bv_0.ln.world.getBlockState(new BlockPos(i, MathHelper.floor((double)d3), j)).getBlock() instanceof BlockLiquid)) continue;
                return lp[64];
            }
        }
        return lp[65];
    }

    public static Vec3d getInterpolatedAmount(Entity entity, double d) {
        return _bv_0.getInterpolatedAmount(entity, d, d, d);
    }

    public static BlockPos getFlooredPos(Entity entity) {
        return new BlockPos(Math.floor(entity.posX), Math.floor(entity.posY), Math.floor(entity.posZ));
    }

    public static double predictPos(double d, double d2) {
        double d3 = Math.abs(d);
        d3 -= d2;
        d3 = _bv_0.sigmoid(d3);
        return d3;
    }

    public static Vec3d getInterpolatedPos(Entity entity, float f) {
        return new Vec3d(entity.lastTickPosX, entity.lastTickPosY, entity.lastTickPosZ).add(_bv_0.getInterpolatedAmount(entity, f));
    }

    public static boolean isIntercepted(BlockPos blockPos) {
        for (Entity entity : _bv_0.ln.world.loadedEntityList) {
            if (!new AxisAlignedBB(blockPos).intersects(entity.getEntityBoundingBox())) continue;
            return lp[58];
        }
        return lp[59];
    }

    public static Vec3d[] getOffsets(int n, boolean bl) {
        List<Vec3d> list = _bv_0.getOffsetList(n, bl);
        Vec3d[] vec3dArray = new Vec3d[list.size()];
        return list.toArray(vec3dArray);
    }

    public static List<Vec3d> getUnsafeBlocks(Entity entity, int n, boolean bl) {
        return _bv_0.getUnsafeBlocksFromVec3d(entity.getPositionVector(), n, bl);
    }

    public static Vec3d[] getUnsafeBlockArrayFromVec3d(Vec3d vec3d, int n, boolean bl) {
        List<Vec3d> list = _bv_0.getUnsafeBlocksFromVec3d(vec3d, n, bl);
        Vec3d[] vec3dArray = new Vec3d[list.size()];
        return list.toArray(vec3dArray);
    }

    public static Block isColliding(double d, double d2, double d3) {
        Block block = null;
        if (_bv_0.ln.player != null) {
            AxisAlignedBB axisAlignedBB = _bv_0.ln.player.getRidingEntity() != null ? _bv_0.ln.player.getRidingEntity().getEntityBoundingBox().contract(0.0, 0.0, 0.0).offset(d, d2, d3) : _bv_0.ln.player.getEntityBoundingBox().contract(0.0, 0.0, 0.0).offset(d, d2, d3);
            int n = (int)axisAlignedBB.minY;
            for (int i = MathHelper.floor((double)axisAlignedBB.minX); i < MathHelper.floor((double)axisAlignedBB.maxX) + lp[117]; ++i) {
                for (int j = MathHelper.floor((double)axisAlignedBB.minZ); j < MathHelper.floor((double)axisAlignedBB.maxZ) + lp[118]; ++j) {
                    block = _bv_0.ln.world.getBlockState(new BlockPos(i, n, j)).getBlock();
                }
            }
        }
        return block;
    }

    public static Vec3d interpolateEntityByTicks(Entity entity, float f) {
        return new Vec3d(_bv_0.calculateDistanceWithPartialTicks(entity.posX, entity.lastTickPosX, f) - _bv_0.ln.getRenderManager().renderPosX, _bv_0.calculateDistanceWithPartialTicks(entity.posY, entity.lastTickPosY, f) - _bv_0.ln.getRenderManager().renderPosY, _bv_0.calculateDistanceWithPartialTicks(entity.posZ, entity.lastTickPosZ, f) - _bv_0.ln.getRenderManager().renderPosZ);
    }

    public static void attackEntity(Entity entity, boolean bl, boolean bl2) {
        if (bl) {
            _bv_0.ln.player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
        } else {
            _bv_0.ln.playerController.attackEntity((EntityPlayer)_bv_0.ln.player, entity);
        }
        if (bl2) {
            _bv_0.ln.player.swingArm(EnumHand.MAIN_HAND);
        }
    }

    public static boolean isInLiquid() {
        if (_bv_0.ln.player != null) {
            if (_bv_0.ln.player.fallDistance >= 3.0f) {
                return lp[119];
            }
            int n = lp[120];
            AxisAlignedBB axisAlignedBB = _bv_0.ln.player.getRidingEntity() != null ? _bv_0.ln.player.getRidingEntity().getEntityBoundingBox() : _bv_0.ln.player.getEntityBoundingBox();
            int n2 = (int)axisAlignedBB.minY;
            for (int i = MathHelper.floor((double)axisAlignedBB.minX); i < MathHelper.floor((double)axisAlignedBB.maxX) + lp[121]; ++i) {
                for (int j = MathHelper.floor((double)axisAlignedBB.minZ); j < MathHelper.floor((double)axisAlignedBB.maxZ) + lp[122]; ++j) {
                    Block block = _bv_0.ln.world.getBlockState(new BlockPos(i, n2, j)).getBlock();
                    if (block instanceof BlockAir) continue;
                    if (!(block instanceof BlockLiquid)) {
                        return lp[123];
                    }
                    n = lp[124];
                }
            }
            return n != 0;
        }
        return lp[125];
    }

    public static double sigmoid(double d) {
        return 1.0 / (1.0 + Math.pow(Math.E, -1.0 * d));
    }

    public static boolean isAboveBlock(Entity entity, BlockPos blockPos) {
        return entity.posY >= (double)blockPos.getY() ? lp[7] : lp[8];
    }

    public static void attackEntity(Entity entity, boolean bl) {
        if (bl) {
            _bv_0.ln.player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
        } else {
            _bv_0.ln.playerController.attackEntity((EntityPlayer)_bv_0.ln.player, entity);
        }
    }

    public static boolean isLivingEntity(Entity entity) {
        return entity instanceof EntityLivingBase;
    }

    public static List<Vec3d> getOffsetList(int n, boolean bl) {
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        arrayList.add(new Vec3d(-1.0, (double)n, 0.0));
        arrayList.add(new Vec3d(1.0, (double)n, 0.0));
        arrayList.add(new Vec3d(0.0, (double)n, -1.0));
        arrayList.add(new Vec3d(0.0, (double)n, 1.0));
        if (bl) {
            arrayList.add(new Vec3d(0.0, (double)(n - lp[73]), 0.0));
        }
        return arrayList;
    }

    public static boolean holding32k(EntityPlayer entityPlayer) {
        return _bv_0.is32k(entityPlayer.getHeldItemMainhand());
    }

    public static double getDistance(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        return MathHelper.sqrt((double)(d7 * d7 + d8 * d8 + d9 * d9));
    }

    public static Vec3d[] getUnsafeBlockArray(Entity entity, int n, boolean bl) {
        List<Vec3d> list = _bv_0.getUnsafeBlocks(entity, n, bl);
        Vec3d[] vec3dArray = new Vec3d[list.size()];
        return list.toArray(vec3dArray);
    }

    public static float getHealth(Entity entity) {
        if (entity.isEntityAlive()) {
            EntityLivingBase entityLivingBase = (EntityLivingBase)entity;
            return entityLivingBase.getHealth() + entityLivingBase.getAbsorptionAmount();
        }
        return 0.0f;
    }

    public static boolean stopSneaking(boolean bl) {
        if (bl && _bv_0.ln.player != null) {
            _bv_0.ln.player.connection.sendPacket((Packet)new CPacketEntityAction((Entity)_bv_0.ln.player, CPacketEntityAction.Action.STOP_SNEAKING));
        }
        return lp[72];
    }

    public static Vec3d getInterpolatedAmount(Entity entity, Vec3d vec3d) {
        return _bv_0.getInterpolatedAmount(entity, vec3d.x, vec3d.y, vec3d.z);
    }

    public static List<Class<?>> getVehicles() {
        Class[] classArray = new Class[lp[44]];
        classArray[_bv_0.lp[45]] = EntityBoat.class;
        classArray[_bv_0.lp[46]] = EntityMinecart.class;
        return new ArrayList(Arrays.asList(classArray));
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
                    double d = (n3 - n6) * (n3 - n6) + (n5 - n7) * (n5 - n7) + (bl2 ? (n4 - n8) * (n4 - n8) : lp[103]);
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

    public static boolean isBlockValid(BlockPos blockPos) {
        return (_bv_0.isBedrockHole(blockPos) || _bv_0.isObbyHole(blockPos) || _bv_0.isBothHole(blockPos) ? lp[74] : lp[75]) != 0;
    }

    public static Vec3d getInterpolatedAmount(Entity entity, float f) {
        return _bv_0.getInterpolatedAmount(entity, f, f, f);
    }

    public static boolean isPassive(Entity entity) {
        if (entity instanceof EntityWolf && ((EntityWolf)entity).isAngry()) {
            return lp[47];
        }
        if (entity instanceof EntityAgeable || entity instanceof EntityAmbientCreature || entity instanceof EntitySquid) {
            return lp[48];
        }
        return (entity instanceof EntityIronGolem && ((EntityIronGolem)entity).getRevengeTarget() == null ? lp[49] : lp[50]) != 0;
    }

    public static BlockPos getPlayerPosWithEntity() {
        return new BlockPos(_bv_0.ln.player.getRidingEntity() != null ? _bv_0.ln.player.getRidingEntity().posX : _bv_0.ln.player.posX, _bv_0.ln.player.getRidingEntity() != null ? _bv_0.ln.player.getRidingEntity().posY : _bv_0.ln.player.posY, _bv_0.ln.player.getRidingEntity() != null ? _bv_0.ln.player.getRidingEntity().posZ : _bv_0.ln.player.posZ);
    }

    public static List<Class<?>> getHostiles() {
        Class[] classArray = new Class[lp[25]];
        classArray[_bv_0.lp[26]] = EntitySpider.class;
        classArray[_bv_0.lp[27]] = EntitySkeleton.class;
        classArray[_bv_0.lp[28]] = EntityZombie.class;
        classArray[_bv_0.lp[29]] = EntityShulker.class;
        classArray[_bv_0.lp[30]] = EntityBlaze.class;
        classArray[_bv_0.lp[31]] = EntityCreeper.class;
        classArray[_bv_0.lp[32]] = EntityCaveSpider.class;
        classArray[_bv_0.lp[33]] = EntityBlaze.class;
        classArray[_bv_0.lp[34]] = EntityGhast.class;
        classArray[_bv_0.lp[35]] = EntityZombieVillager.class;
        classArray[_bv_0.lp[36]] = EntityWitch.class;
        classArray[_bv_0.lp[37]] = EntityVex.class;
        classArray[_bv_0.lp[38]] = EntitySlime.class;
        classArray[_bv_0.lp[39]] = EntityEvoker.class;
        classArray[_bv_0.lp[40]] = EntitySpellcasterIllager.class;
        classArray[_bv_0.lp[41]] = EntityIllusionIllager.class;
        classArray[_bv_0.lp[42]] = EntityWitherSkeleton.class;
        classArray[_bv_0.lp[43]] = EntityWither.class;
        return new ArrayList(Arrays.asList(classArray));
    }

    public static boolean isHostileMob(Entity entity) {
        return entity.isCreatureType(EnumCreatureType.MONSTER, lp[53]) && !_bv_0.isNeutralMob(entity) || entity instanceof EntitySpider ? lp[54] : lp[55];
    }

    public static Color getHealthColor(float f) {
        if (f <= 4.0f) {
            return new Color(lp[126], lp[127], lp[128]);
        }
        if (f <= 8.0f) {
            return new Color(lp[129], lp[130], lp[131]);
        }
        if (f <= 12.0f) {
            return new Color(lp[132], lp[133], lp[134]);
        }
        if (f <= 16.0f) {
            return new Color(lp[135], lp[136], lp[137]);
        }
        return new Color(lp[138], lp[139], lp[140]);
    }

    public static List<Class<?>> getPassives() {
        Class[] classArray = new Class[lp[10]];
        classArray[_bv_0.lp[11]] = EntityPigZombie.class;
        classArray[_bv_0.lp[12]] = EntitySquid.class;
        classArray[_bv_0.lp[13]] = EntityIronGolem.class;
        classArray[_bv_0.lp[14]] = EntityWolf.class;
        classArray[_bv_0.lp[15]] = EntityEnderman.class;
        classArray[_bv_0.lp[16]] = EntityChicken.class;
        classArray[_bv_0.lp[17]] = EntityCow.class;
        classArray[_bv_0.lp[18]] = EntitySheep.class;
        classArray[_bv_0.lp[19]] = EntityRabbit.class;
        classArray[_bv_0.lp[20]] = EntityPig.class;
        classArray[_bv_0.lp[21]] = EntityBat.class;
        classArray[_bv_0.lp[22]] = EntityHorse.class;
        classArray[_bv_0.lp[23]] = EntitySkeletonHorse.class;
        classArray[_bv_0.lp[24]] = EntitySnowman.class;
        return new ArrayList(Arrays.asList(classArray));
    }

    public static boolean is32k(ItemStack itemStack) {
        if (itemStack == null) {
            return lp[104];
        }
        if (itemStack.getTagCompound() == null) {
            return lp[105];
        }
        NBTTagList nBTTagList = (NBTTagList)itemStack.getTagCompound().getTag(lo[lp[106]]);
        if (nBTTagList == null) {
            return lp[107];
        }
        for (int i = lp[108]; i < nBTTagList.tagCount(); ++i) {
            NBTTagCompound nBTTagCompound = nBTTagList.getCompoundTagAt(i);
            if (nBTTagCompound.getInteger(lo[lp[109]]) != lp[110]) continue;
            int n = nBTTagCompound.getInteger(lo[lp[111]]);
            if (n < lp[112]) break;
            return lp[113];
        }
        return lp[114];
    }

    public static boolean isBedrockHole(BlockPos blockPos) {
        BlockPos[] blockPosArray = new BlockPos[lp[85]];
        blockPosArray[_bv_0.lp[86]] = blockPos.north();
        blockPosArray[_bv_0.lp[87]] = blockPos.south();
        blockPosArray[_bv_0.lp[88]] = blockPos.east();
        blockPosArray[_bv_0.lp[89]] = blockPos.west();
        blockPosArray[_bv_0.lp[90]] = blockPos.down();
        BlockPos[] blockPosArray2 = blockPosArray;
        int n = blockPosArray2.length;
        for (int i = lp[91]; i < n; ++i) {
            BlockPos blockPos2 = blockPosArray2[i];
            IBlockState iBlockState = _bv_0.ln.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() != Blocks.AIR && iBlockState.getBlock() == Blocks.BEDROCK) continue;
            return lp[92];
        }
        return lp[93];
    }

    public static boolean isAboveLiquid(Entity entity) {
        if (entity == null) {
            return lp[60];
        }
        double d = entity.posY + 0.01;
        for (int i = MathHelper.floor((double)entity.posX); i < MathHelper.ceil((double)entity.posX); ++i) {
            for (int j = MathHelper.floor((double)entity.posZ); j < MathHelper.ceil((double)entity.posZ); ++j) {
                if (!(_bv_0.ln.world.getBlockState(new BlockPos(i, (int)d, j)).getBlock() instanceof BlockLiquid)) continue;
                return lp[61];
            }
        }
        return lp[62];
    }

    public static List<Vec3d> getUnsafeBlocksFromVec3d(Vec3d vec3d, int n, boolean bl) {
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>();
        Vec3d[] vec3dArray = _bv_0.getOffsets(n, bl);
        int n2 = vec3dArray.length;
        for (int i = lp[9]; i < n2; ++i) {
            Vec3d vec3d2 = vec3dArray[i];
            BlockPos blockPos = new BlockPos(vec3d).add(vec3d2.x, vec3d2.y, vec3d2.z);
            Block block = _bv_0.ln.world.getBlockState(blockPos).getBlock();
            if (!(block instanceof BlockAir) && !(block instanceof BlockLiquid) && !(block instanceof BlockTallGrass) && !(block instanceof BlockFire) && !(block instanceof BlockDeadBush) && !(block instanceof BlockSnow)) continue;
            arrayList.add(vec3d2);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean isntValid(Entity entity, double d) {
        int n;
        block4: {
            block5: {
                if (entity == null || !entity.isEntityAlive() || entity.equals((Object)_bv_0.ln.player)) break block4;
                if (!(entity instanceof EntityPlayer)) break block5;
                if (_bn_0.isFriend(entity.getName())) break block4;
            }
            if (!(_bv_0.ln.player.getDistanceSq(entity) > d * d)) {
                n = lp[116];
                return n != 0;
            }
        }
        n = lp[115];
        return n != 0;
    }

    public static boolean isObbyHole(BlockPos blockPos) {
        BlockPos[] blockPosArray = new BlockPos[lp[76]];
        blockPosArray[_bv_0.lp[77]] = blockPos.north();
        blockPosArray[_bv_0.lp[78]] = blockPos.south();
        blockPosArray[_bv_0.lp[79]] = blockPos.east();
        blockPosArray[_bv_0.lp[80]] = blockPos.west();
        blockPosArray[_bv_0.lp[81]] = blockPos.down();
        BlockPos[] blockPosArray2 = blockPosArray;
        int n = blockPosArray2.length;
        for (int i = lp[82]; i < n; ++i) {
            BlockPos blockPos2 = blockPosArray2[i];
            IBlockState iBlockState = _bv_0.ln.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() != Blocks.AIR && iBlockState.getBlock() == Blocks.OBSIDIAN) continue;
            return lp[83];
        }
        return lp[84];
    }

    static {
        lp = new int[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 18, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 2, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 5, 0, 1, 2, 3, 4, 0, 0, 1, 5, 0, 1, 2, 3, 4, 0, 0, 1, 5, 0, 1, 2, 3, 4, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 16, 2, 42, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 200, 0, 0, 231, 143, 85, 219, 201, 106, 117, 231, 85, 44, 186, 19, 3, 0, 1, 2};
        String[] stringArray = new String[lp[141]];
        stringArray[_bv_0.lp[142]] = "ench";
        stringArray[_bv_0.lp[143]] = "id";
        stringArray[_bv_0.lp[144]] = "lvl";
        lo = stringArray;
        ln = Minecraft.getMinecraft();
    }

    public static double calculateDistanceWithPartialTicks(double d, double d2, float f) {
        return d2 + (d - d2) * (double)ln.getRenderPartialTicks();
    }

    public static boolean canEntityFeetBeSeen(Entity entity) {
        return _bv_0.ln.world.rayTraceBlocks(new Vec3d(_bv_0.ln.player.posX, _bv_0.ln.player.posX + (double)_bv_0.ln.player.getEyeHeight(), _bv_0.ln.player.posZ), new Vec3d(entity.posX, entity.posY, entity.posZ), lp[0], lp[1], lp[2]) == null ? lp[3] : lp[4];
    }

    public static Vec3d getInterpolatedRenderPos(Entity entity, float f) {
        return _bv_0.getInterpolatedPos(entity, f).subtract(_bv_0.ln.getRenderManager().viewerPosX, _bv_0.ln.getRenderManager().viewerPosY, _bv_0.ln.getRenderManager().viewerPosZ);
    }

    public static Vec3d interpolateEntityTime(Entity entity, float f) {
        return new Vec3d(entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f, entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f, entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f);
    }

    public static boolean isOnLiquid(double d) {
        if (_bv_0.ln.player.fallDistance >= 3.0f) {
            return lp[68];
        }
        AxisAlignedBB axisAlignedBB = _bv_0.ln.player.getRidingEntity() != null ? _bv_0.ln.player.getRidingEntity().getEntityBoundingBox().contract(0.0, 0.0, 0.0).offset(0.0, -d, 0.0) : _bv_0.ln.player.getEntityBoundingBox().contract(0.0, 0.0, 0.0).offset(0.0, -d, 0.0);
        int n = lp[69];
        int n2 = (int)axisAlignedBB.minY;
        for (int i = MathHelper.floor((double)axisAlignedBB.minX); i < MathHelper.floor((double)(axisAlignedBB.maxX + 1.0)); ++i) {
            for (int j = MathHelper.floor((double)axisAlignedBB.minZ); j < MathHelper.floor((double)(axisAlignedBB.maxZ + 1.0)); ++j) {
                Block block = _bv_0.ln.world.getBlockState(new BlockPos(i, n2, j)).getBlock();
                if (block == Blocks.AIR) continue;
                if (!(block instanceof BlockLiquid)) {
                    return lp[70];
                }
                n = lp[71];
            }
        }
        return n != 0;
    }

    public static Vec3d getInterpolatedAmount(Entity entity, double d, double d2, double d3) {
        return new Vec3d((entity.posX - entity.lastTickPosX) * d, (entity.posY - entity.lastTickPosY) * d2, (entity.posZ - entity.lastTickPosZ) * d3);
    }

    public static Color getColor(Entity entity, int n, int n2, int n3, int n4, boolean bl) {
        Color color = new Color((float)n / 255.0f, (float)n2 / 255.0f, (float)n3 / 255.0f, (float)n4 / 255.0f);
        if (entity instanceof EntityPlayer) {
            if (bl) {
                if (_bn_0.isFriend(entity.getName())) {
                    color = new Color(0.33f, 1.0f, 1.0f, (float)n4 / 255.0f);
                }
            }
            if (bl) {
                if (!_bn_0.isFriend(entity.getName())) {
                    color = new Color(1.0f, 0.33f, 1.0f, (float)n4 / 255.0f);
                }
            }
        }
        return color;
    }
}

