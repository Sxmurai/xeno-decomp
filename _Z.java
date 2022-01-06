//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.SharedMonsterAttributes
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.MobEffects
 *  net.minecraft.item.ItemEndCrystal
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketAnimation
 *  net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.CombatRules
 *  net.minecraft.util.DamageSource
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.Explosion
 *  net.minecraft.world.IBlockAccess
 *  net.minecraft.world.World
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemEndCrystal;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.CombatRules;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class _Z
implements _cf_0 {
    public static final int[] pd = new int[]{0, 0, 1, 0, 0, 1, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 200, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 2, 1, 0, 3, 0, 1, 2};
    public static final String[] cM;

    public static float getBlastReduction(EntityLivingBase entityLivingBase, float f, Explosion explosion) {
        f = CombatRules.getDamageAfterAbsorb((float)f, (float)entityLivingBase.getTotalArmorValue(), (float)((float)entityLivingBase.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).getAttributeValue()));
        float f2 = 0.0f;
        try {
            f2 = EnchantmentHelper.getEnchantmentModifierDamage((Iterable)entityLivingBase.getArmorInventoryList(), (DamageSource)DamageSource.causeExplosionDamage((Explosion)explosion));
        }
        catch (Exception exception) {
            // empty catch block
        }
        f2 = MathHelper.clamp((float)f2, (float)0.0f, (float)20.0f);
        f *= 1.0f - f2 / 25.0f;
        PotionEffect potionEffect = entityLivingBase.getActivePotionEffect(MobEffects.RESISTANCE);
        if (entityLivingBase.isPotionActive(MobEffects.RESISTANCE) && potionEffect != null) {
            f = f * (25.0f - (float)(potionEffect.getAmplifier() + pd[56]) * 5.0f) / 25.0f;
        }
        f = Math.max(f, 0.0f);
        return f;
    }

    public static boolean canPlaceCrystal(BlockPos blockPos, boolean bl, boolean bl2) {
        BlockPos blockPos2 = blockPos.add(pd[4], pd[5], pd[6]);
        BlockPos blockPos3 = blockPos.add(pd[7], pd[8], pd[9]);
        try {
            if (!bl2) {
                if (_Z.pb.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK && _Z.pb.world.getBlockState(blockPos).getBlock() != Blocks.OBSIDIAN) {
                    return pd[10];
                }
                if (_Z.pb.world.getBlockState(blockPos2).getBlock() != Blocks.AIR || _Z.pb.world.getBlockState(blockPos3).getBlock() != Blocks.AIR) {
                    return pd[11];
                }
                if (!bl) {
                    return (_Z.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos2)).isEmpty() && _Z.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos3)).isEmpty() ? pd[12] : pd[13]) != 0;
                }
                for (Entity entity : _Z.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos2))) {
                    if (entity instanceof EntityEnderCrystal) continue;
                    return pd[14];
                }
                for (Entity entity : _Z.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos3))) {
                    if (entity instanceof EntityEnderCrystal) continue;
                    return pd[15];
                }
            } else {
                if (_Z.pb.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK && _Z.pb.world.getBlockState(blockPos).getBlock() != Blocks.OBSIDIAN) {
                    return pd[16];
                }
                if (_Z.pb.world.getBlockState(blockPos2).getBlock() != Blocks.AIR) {
                    return pd[17];
                }
                if (!bl) {
                    return _Z.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos2)).isEmpty();
                }
                for (Entity entity : _Z.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos2))) {
                    if (entity instanceof EntityEnderCrystal) continue;
                    return pd[18];
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return pd[19];
        }
        return pd[20];
    }

    public static List<Block> getBlocks() {
        Block[] blockArray = new Block[pd[42]];
        blockArray[_Z.pd[43]] = Blocks.OBSIDIAN;
        blockArray[_Z.pd[44]] = Blocks.BEDROCK;
        blockArray[_Z.pd[45]] = Blocks.COMMAND_BLOCK;
        blockArray[_Z.pd[46]] = Blocks.BARRIER;
        blockArray[_Z.pd[47]] = Blocks.ENCHANTING_TABLE;
        blockArray[_Z.pd[48]] = Blocks.ENDER_CHEST;
        blockArray[_Z.pd[49]] = Blocks.END_PORTAL_FRAME;
        blockArray[_Z.pd[50]] = Blocks.BEACON;
        blockArray[_Z.pd[51]] = Blocks.ANVIL;
        return Arrays.asList(blockArray);
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
                    float f2;
                    float f3 = n8;
                    float f4 = f2 = bl2 ? (float)n4 + f : (float)(n4 + n);
                    if (!(f3 < f2)) break;
                    double d = (n3 - n6) * (n3 - n6) + (n5 - n7) * (n5 - n7) + (bl2 ? (n4 - n8) * (n4 - n8) : pd[0]);
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

    public static boolean rayTraceSolidCheck(Vec3d vec3d, Vec3d vec3d2, boolean bl) {
        if (!(Double.isNaN(vec3d.x) || Double.isNaN(vec3d.y) || Double.isNaN(vec3d.z) || Double.isNaN(vec3d2.x) || Double.isNaN(vec3d2.y) || Double.isNaN(vec3d2.z))) {
            int n = MathHelper.floor((double)vec3d.x);
            int n2 = MathHelper.floor((double)vec3d.y);
            int n3 = MathHelper.floor((double)vec3d.z);
            int n4 = MathHelper.floor((double)vec3d2.x);
            int n5 = MathHelper.floor((double)vec3d2.y);
            int n6 = MathHelper.floor((double)vec3d2.z);
            BlockPos blockPos = new BlockPos(n, n2, n3);
            IBlockState iBlockState = _Z.pb.world.getBlockState(blockPos);
            Block block = iBlockState.getBlock();
            if (iBlockState.getCollisionBoundingBox((IBlockAccess)_Z.pb.world, blockPos) != Block.NULL_AABB && block.canCollideCheck(iBlockState, pd[22]) && (_Z.getBlocks().contains(block) || !bl)) {
                return pd[23];
            }
            double d = vec3d2.x - vec3d.x;
            double d2 = vec3d2.y - vec3d.y;
            double d3 = vec3d2.z - vec3d.z;
            int n7 = pd[24];
            while (n7-- >= 0) {
                EnumFacing enumFacing;
                if (Double.isNaN(vec3d.x) || Double.isNaN(vec3d.y) || Double.isNaN(vec3d.z)) {
                    return pd[25];
                }
                if (n == n4 && n2 == n5 && n3 == n6) {
                    return pd[26];
                }
                int n8 = pd[27];
                int n9 = pd[28];
                int n10 = pd[29];
                double d4 = 999.0;
                double d5 = 999.0;
                double d6 = 999.0;
                double d7 = 999.0;
                double d8 = 999.0;
                double d9 = 999.0;
                if (n4 > n) {
                    d4 = (double)n + 1.0;
                } else if (n4 < n) {
                    d4 = n;
                } else {
                    n8 = pd[30];
                }
                if (n5 > n2) {
                    d5 = (double)n2 + 1.0;
                } else if (n5 < n2) {
                    d5 = n2;
                } else {
                    n9 = pd[31];
                }
                if (n6 > n3) {
                    d6 = (double)n3 + 1.0;
                } else if (n6 < n3) {
                    d6 = n3;
                } else {
                    n10 = pd[32];
                }
                if (n8 != 0) {
                    d7 = (d4 - vec3d.x) / d;
                }
                if (n9 != 0) {
                    d8 = (d5 - vec3d.y) / d2;
                }
                if (n10 != 0) {
                    d9 = (d6 - vec3d.z) / d3;
                }
                if (d7 == 0.0) {
                    d7 = -1.0E-4;
                }
                if (d8 == 0.0) {
                    d8 = -1.0E-4;
                }
                if (d9 == 0.0) {
                    d9 = -1.0E-4;
                }
                if (d7 < d8 && d7 < d9) {
                    enumFacing = n4 > n ? EnumFacing.WEST : EnumFacing.EAST;
                    vec3d = new Vec3d(d4, vec3d.y + d2 * d7, vec3d.z + d3 * d7);
                } else if (d8 < d9) {
                    enumFacing = n5 > n2 ? EnumFacing.DOWN : EnumFacing.UP;
                    vec3d = new Vec3d(vec3d.x + d * d8, d5, vec3d.z + d3 * d8);
                } else {
                    enumFacing = n6 > n3 ? EnumFacing.NORTH : EnumFacing.SOUTH;
                    vec3d = new Vec3d(vec3d.x + d * d9, vec3d.y + d2 * d9, d6);
                }
                if (!(block = (iBlockState = _Z.pb.world.getBlockState(blockPos = new BlockPos(n = MathHelper.floor((double)vec3d.x) - (enumFacing == EnumFacing.EAST ? pd[33] : pd[34]), n2 = MathHelper.floor((double)vec3d.y) - (enumFacing == EnumFacing.UP ? pd[35] : pd[36]), n3 = MathHelper.floor((double)vec3d.z) - (enumFacing == EnumFacing.SOUTH ? pd[37] : pd[38])))).getBlock()).canCollideCheck(iBlockState, pd[39]) || !_Z.getBlocks().contains(block) && bl) continue;
                return pd[40];
            }
        }
        return pd[41];
    }

    public static void swingArm(String string) {
        if (string.equalsIgnoreCase(cM[pd[65]]) && _Z.pb.player.getHeldItemOffhand() != null) {
            _Z.pb.player.swingArm(EnumHand.MAIN_HAND);
            _Z.pb.player.swingArm(EnumHand.OFF_HAND);
        } else if (string.equalsIgnoreCase(cM[pd[66]]) && _Z.pb.player.getHeldItemOffhand() != null) {
            _Z.pb.player.swingArm(EnumHand.OFF_HAND);
        } else if (string.equalsIgnoreCase(cM[pd[67]])) {
            _Z.pb.player.swingArm(EnumHand.MAIN_HAND);
        }
    }

    public static List<BlockPos> possiblePlacePositions(float f, boolean bl, boolean bl2) {
        NonNullList nonNullList = NonNullList.create();
        nonNullList.addAll((Collection)_Z.getSphere(_be_0.getPlayerPos(), f, (int)f, pd[1], pd[2], pd[3]).stream().filter(blockPos -> _Z.pb.world.getBlockState(blockPos).getBlock() != Blocks.AIR ? pd[68] : pd[69]).filter(blockPos -> _Z.canPlaceCrystal(blockPos, bl, bl2)).collect(Collectors.toList()));
        return nonNullList;
    }

    public static double calc(Entity entity, BlockPos blockPos, boolean bl) {
        return _Z.getExplosionDamage(entity, new Vec3d((double)blockPos.getX() + 0.5, (double)(blockPos.getY() + pd[21]), (double)blockPos.getZ() + 0.5), 6.0f, bl);
    }

    public static boolean canSeePos(BlockPos blockPos) {
        return _Z.pb.world.rayTraceBlocks(new Vec3d(_Z.pb.player.posX, _Z.pb.player.posY + (double)_Z.pb.player.getEyeHeight(), _Z.pb.player.posZ), new Vec3d((double)blockPos.getX() + 0.5, (double)(blockPos.getY() + pd[57]), (double)blockPos.getZ() + 0.5), pd[58], pd[59], pd[60]) == null ? pd[61] : pd[62];
    }

    public static float getExplosionDamage(Entity entity, Vec3d vec3d, float f, boolean bl) {
        Vec3d vec3d2 = new Vec3d(entity.posX, entity.posY, entity.posZ);
        if (entity.isImmuneToExplosions()) {
            return 0.0f;
        }
        double d = vec3d2.distanceTo(vec3d) / (double)(f *= 2.0f);
        double d2 = 0.0;
        AxisAlignedBB axisAlignedBB = entity.getEntityBoundingBox().offset(entity.getPositionVector().subtract(vec3d2));
        Vec3d vec3d3 = new Vec3d(1.0 / ((axisAlignedBB.maxX - axisAlignedBB.minX) * 2.0 + 1.0), 1.0 / ((axisAlignedBB.maxY - axisAlignedBB.minY) * 2.0 + 1.0), 1.0 / ((axisAlignedBB.maxZ - axisAlignedBB.minZ) * 2.0 + 1.0));
        double d3 = (1.0 - Math.floor(1.0 / vec3d3.x) * vec3d3.x) / 2.0;
        double d4 = (1.0 - Math.floor(1.0 / vec3d3.z) * vec3d3.z) / 2.0;
        if (vec3d3.x >= 0.0 && vec3d3.y >= 0.0 && vec3d3.z >= 0.0) {
            int n = pd[52];
            int n2 = pd[53];
            for (double d5 = 0.0; d5 <= 1.0; d5 += vec3d3.x) {
                for (double d6 = 0.0; d6 <= 1.0; d6 += vec3d3.y) {
                    for (double d7 = 0.0; d7 <= 1.0; d7 += vec3d3.z) {
                        Vec3d vec3d4 = new Vec3d(d3 + axisAlignedBB.minX + (axisAlignedBB.maxX - axisAlignedBB.minX) * d5, axisAlignedBB.minY + (axisAlignedBB.maxY - axisAlignedBB.minY) * d6, d4 + axisAlignedBB.minZ + (axisAlignedBB.maxZ - axisAlignedBB.minZ) * d7);
                        if (!_Z.rayTraceSolidCheck(vec3d4, vec3d, bl)) {
                            ++n;
                        }
                        ++n2;
                    }
                }
            }
            d2 = (double)n / (double)n2;
        }
        double d8 = (1.0 - d) * d2;
        float f2 = (int)((d8 * d8 + d8) / 2.0 * 7.0 * (double)f + 1.0);
        if (entity instanceof EntityLivingBase) {
            f2 = _Z.getBlastReduction((EntityLivingBase)entity, _Z.getDamageFromDifficulty(f2), new Explosion((World)_Z.pb.world, null, vec3d.x, vec3d.y, vec3d.z, f / 2.0f, pd[54], pd[55]));
        }
        return f2;
    }

    public static float getDamageFromDifficulty(float f) {
        switch (_r_0.aq[_Z.pb.world.getDifficulty().ordinal()]) {
            case 1: {
                return 0.0f;
            }
            case 2: {
                return Math.min(f / 2.0f + 1.0f, f);
            }
            case 3: {
                return f * 3.0f / 2.0f;
            }
        }
        return f;
    }

    public static EntityPlayer getNearestTarget(float f) {
        EntityPlayer entityPlayer = null;
        double d = _ac_0.square(f);
        for (EntityPlayer entityPlayer2 : _Z.pb.world.playerEntities) {
            if (!(_Z.pb.player.getDistanceSq((Entity)entityPlayer2) <= _ac_0.square(f)) || !(_Z.pb.player.getDistanceSq((Entity)entityPlayer2) < d)) continue;
            entityPlayer = entityPlayer2;
            d = _Z.pb.player.getDistanceSq((Entity)entityPlayer2);
        }
        return entityPlayer;
    }

    public static BlockPos getBestPos(Entity entity, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4, double d, double d2) {
        double d3 = 0.0;
        BlockPos blockPos = null;
        for (BlockPos blockPos2 : _Z.possiblePlacePositions(f, bl, bl2)) {
            double d4 = _Z.calc(entity, blockPos2, bl3);
            double d5 = _Z.calc((Entity)_Z.pb.player, blockPos2, bl3);
            if (!(d4 > d3) || !_Z.canPlaceCrystal(blockPos2, bl, (bl2 && d4 > d && d5 <= d2 ? pd[63] : pd[64]) != 0) || bl4 && !_Z.canSeePos(blockPos)) continue;
            d3 = d4;
            blockPos = blockPos2;
        }
        return blockPos;
    }

    public static void placeCrystalOnBlock(BlockPos blockPos, EnumHand enumHand, boolean bl) {
        if (!(_Z.pb.player.getHeldItemMainhand().getItem() instanceof ItemEndCrystal) && !(_Z.pb.player.getHeldItemOffhand().getItem() instanceof ItemEndCrystal)) {
            return;
        }
        RayTraceResult rayTraceResult = _Z.pb.world.rayTraceBlocks(new Vec3d(_Z.pb.player.posX, _Z.pb.player.posY + (double)_Z.pb.player.getEyeHeight(), _Z.pb.player.posZ), new Vec3d((double)blockPos.getX() + 0.5, (double)blockPos.getY() - 0.5, (double)blockPos.getZ() + 0.5));
        EnumFacing enumFacing = rayTraceResult == null || rayTraceResult.sideHit == null ? EnumFacing.UP : rayTraceResult.sideHit;
        _Z.pb.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, enumHand, 0.0f, 0.0f, 0.0f));
        if (bl) {
            _Z.pb.player.connection.sendPacket((Packet)new CPacketAnimation(enumHand));
        }
    }

    static {
        String[] stringArray = new String[pd[70]];
        stringArray[_Z.pd[71]] = "Both";
        stringArray[_Z.pd[72]] = "Offhand";
        stringArray[_Z.pd[73]] = "Mainhand";
        cM = stringArray;
    }
}

