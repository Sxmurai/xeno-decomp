//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.entity.EntityOtherPlayerMP
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
 *  net.minecraft.network.play.client.CPacketUseEntity
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
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.EntityOtherPlayerMP;
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
import net.minecraft.network.play.client.CPacketUseEntity;
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

/*
 * Renamed from _bo
 */
public class _bo_0
extends _bA {
    public _cJ kq;
    public BlockPos kK;
    public _cJ kw;
    public _k_0 kF;
    public _k_0 kB;
    public _k_0 kA;
    public _cJ ky;
    public _cd_0 kp;
    public static final String[] lQ;
    public _cd_0 kH;
    public _cd_0 ko;
    public _k_0 ku;
    public _cJ kD;
    public _cJ kn;
    public _K kM;
    public _cJ kv;
    public static final int[] pd;
    public _K kL;
    public boolean kN;
    public _cd_0 kl;
    public _k_0 kE;
    public _k_0 kC;
    public _cJ kx;
    public _cA kI;
    public _cd_0 ks;
    public _k_0 kr;
    public double kJ;
    public EntityPlayer kO;
    public _k_0 kG;
    public _k_0 km;
    public _k_0 kz;
    public _k_0 kt;

    public void placeCrystalOnBlock(BlockPos blockPos, EnumHand enumHand, boolean bl) {
        if (!(this.pb.player.getHeldItemMainhand().getItem() instanceof ItemEndCrystal) && !(this.pb.player.getHeldItemOffhand().getItem() instanceof ItemEndCrystal)) {
            return;
        }
        RayTraceResult rayTraceResult = this.pb.world.rayTraceBlocks(new Vec3d(this.pb.player.posX, this.pb.player.posY + (double)this.pb.player.getEyeHeight(), this.pb.player.posZ), new Vec3d((double)blockPos.getX() + 0.5, (double)blockPos.getY() - 0.5, (double)blockPos.getZ() + 0.5));
        EnumFacing enumFacing = rayTraceResult == null || rayTraceResult.sideHit == null ? EnumFacing.UP : rayTraceResult.sideHit;
        this.pb.player.connection.sendPacket((Packet)new CPacketPlayerTryUseItemOnBlock(blockPos, enumFacing, enumHand, 0.0f, 0.0f, 0.0f));
        if (bl) {
            this.pb.player.connection.sendPacket((Packet)new CPacketAnimation(enumHand));
        }
    }

    static {
        pd = new int[]{0, 1, 2, 2, 0, 3, 1, 4, 5, 1, 6, 7, 2, 0, 8, 1, 9, 10, 3, 0, 11, 1, 12, 2, 13, 14, 15, 0, 16, 2, 0, 17, 1, 18, 19, 1, 20, 0, 21, 22, 23, 24, 25, 0, 26, 0, 27, 0, 28, 0, 29, 30, 1, 31, 1, 32, 1, 33, 2, 0, 34, 1, 35, 36, 0, 1, 0, 7, 0, 1, 2, 3, 4, 5, 6, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 0, 1, 2, 3, 4, 1, 0, 37, 1, 38, 39, 0, 1, 40, 41, 42, 43, 44, 45, 1, 1, 0, 1, 1, 0, 1, 0, 46, 47, 48, 0, 1, 200, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 1, 0, 1, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 49, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};
        String[] stringArray = new String[pd[179]];
        stringArray[_bo_0.pd[180]] = "AutoCrystal";
        stringArray[_bo_0.pd[181]] = "crystals go brrrrrrrr";
        stringArray[_bo_0.pd[182]] = "Logic";
        stringArray[_bo_0.pd[183]] = "B -> P";
        stringArray[_bo_0.pd[184]] = "P -> B";
        stringArray[_bo_0.pd[185]] = "Break";
        stringArray[_bo_0.pd[186]] = "B Range";
        stringArray[_bo_0.pd[187]] = "B Mode";
        stringArray[_bo_0.pd[188]] = "Packet";
        stringArray[_bo_0.pd[189]] = "Swing";
        stringArray[_bo_0.pd[190]] = "B Hand";
        stringArray[_bo_0.pd[191]] = "Both";
        stringArray[_bo_0.pd[192]] = "Mainhand";
        stringArray[_bo_0.pd[193]] = "Offhand";
        stringArray[_bo_0.pd[194]] = "BreakSpeed";
        stringArray[_bo_0.pd[195]] = "AntiWeak";
        stringArray[_bo_0.pd[196]] = "AWeak Mode";
        stringArray[_bo_0.pd[197]] = "Legit";
        stringArray[_bo_0.pd[198]] = "Packet";
        stringArray[_bo_0.pd[199]] = "Place";
        stringArray[_bo_0.pd[200]] = "Place Swing";
        stringArray[_bo_0.pd[201]] = "Place Range";
        stringArray[_bo_0.pd[202]] = "PlaceSpeed";
        stringArray[_bo_0.pd[203]] = "Target Range";
        stringArray[_bo_0.pd[204]] = "Min Damage";
        stringArray[_bo_0.pd[205]] = "Multiplace";
        stringArray[_bo_0.pd[206]] = "IgnoreTerrain";
        stringArray[_bo_0.pd[207]] = "Thirteen";
        stringArray[_bo_0.pd[208]] = "CrystalCheck";
        stringArray[_bo_0.pd[209]] = "MaxLocalDMG";
        stringArray[_bo_0.pd[210]] = "Render";
        stringArray[_bo_0.pd[211]] = "Custom Font";
        stringArray[_bo_0.pd[212]] = "Damage Value";
        stringArray[_bo_0.pd[213]] = "R Mode";
        stringArray[_bo_0.pd[214]] = "Outline";
        stringArray[_bo_0.pd[215]] = "Off";
        stringArray[_bo_0.pd[216]] = "Render Colour";
        stringArray[_bo_0.pd[217]] = "Outline";
        stringArray[_bo_0.pd[218]] = "B -> P";
        stringArray[_bo_0.pd[219]] = "P -> B";
        stringArray[_bo_0.pd[220]] = "Weakness";
        stringArray[_bo_0.pd[221]] = "Legit";
        stringArray[_bo_0.pd[222]] = "Packet";
        stringArray[_bo_0.pd[223]] = "Packet";
        stringArray[_bo_0.pd[224]] = "Swing";
        stringArray[_bo_0.pd[225]] = "Packet";
        stringArray[_bo_0.pd[226]] = "Both";
        stringArray[_bo_0.pd[227]] = "Offhand";
        stringArray[_bo_0.pd[228]] = "Mainhand";
        lQ = stringArray;
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    public boolean canPlaceCrystal(BlockPos blockPos, boolean bl, boolean bl2) {
        BlockPos blockPos2 = blockPos.add(pd[158], pd[159], pd[160]);
        BlockPos blockPos3 = blockPos.add(pd[161], pd[162], pd[163]);
        try {
            if (!bl2) {
                if (this.pb.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK && this.pb.world.getBlockState(blockPos).getBlock() != Blocks.OBSIDIAN) {
                    return pd[164];
                }
                if (this.pb.world.getBlockState(blockPos2).getBlock() != Blocks.AIR || this.pb.world.getBlockState(blockPos3).getBlock() != Blocks.AIR) {
                    return pd[165];
                }
                if (!bl) {
                    return (this.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos2)).isEmpty() && this.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos3)).isEmpty() ? pd[166] : pd[167]) != 0;
                }
                for (Entity entity : this.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos2))) {
                    if (entity instanceof EntityEnderCrystal) continue;
                    return pd[168];
                }
                for (Entity entity : this.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos3))) {
                    if (entity instanceof EntityEnderCrystal) continue;
                    return pd[169];
                }
            } else {
                if (this.pb.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK && this.pb.world.getBlockState(blockPos).getBlock() != Blocks.OBSIDIAN) {
                    return pd[170];
                }
                if (this.pb.world.getBlockState(blockPos2).getBlock() != Blocks.AIR) {
                    return pd[171];
                }
                if (!bl) {
                    return this.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos2)).isEmpty();
                }
                for (Entity entity : this.pb.world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(blockPos2))) {
                    if (entity instanceof EntityEnderCrystal) continue;
                    return pd[172];
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return pd[173];
        }
        return pd[174];
    }

    public void breakCrystals() {
        List list = this.pb.world.loadedEntityList.stream().filter(EntityEnderCrystal.class::isInstance).collect(Collectors.toList());
        list.stream().filter(entity -> (entity instanceof EntityEnderCrystal && (double)this.pb.player.getDistance(entity) <= this.kn.getDoubleValue() ? pd[177] : pd[178]) != 0);
        list.sort(Comparator.comparingDouble(entity -> this.pb.player.getDistanceSq(entity)));
        int n = pd[99];
        for (Entity entity2 : list) {
            if (!(entity2 instanceof EntityEnderCrystal) || !(this.pb.player.getDistanceSq(entity2) <= _ac_0.square(this.kn.getFloatValue())) || !this.kL.hasTimeElapsed((long)(1000.0 / this.kq.getDoubleValue()), pd[100])) continue;
            if (this.kr.isEnabled()) {
                for (PotionEffect potionEffect : this.pb.player.getActivePotionEffects()) {
                    if (!potionEffect.getEffectName().equalsIgnoreCase(lQ[pd[101]])) continue;
                    if (this.ks.is(lQ[pd[102]])) {
                        _cu_0.switchToSlot(_cu_0.getBestHotbarSword());
                        continue;
                    }
                    if (!this.ks.is(lQ[pd[103]])) continue;
                    n = this.pb.player.inventory.currentItem;
                    _cu_0.switchToSlotGhost(_cu_0.getBestHotbarSword());
                }
            }
            if (this.ko.is(lQ[pd[104]])) {
                this.pb.getConnection().sendPacket((Packet)new CPacketUseEntity(entity2));
            } else if (this.ko.is(lQ[pd[105]])) {
                this.pb.playerController.attackEntity((EntityPlayer)this.pb.player, entity2);
            }
            this.swingArm(this.kp.getMode());
            if (!this.kr.isEnabled() || !this.ks.is(lQ[pd[106]])) continue;
            _cu_0.switchToSlot(n);
        }
    }

    public float calculateDamage(BlockPos blockPos, Entity entity, boolean bl) {
        return this.getExplosionDamage(entity, new Vec3d((double)blockPos.getX() + 0.5, (double)(blockPos.getY() + pd[138]), (double)blockPos.getZ() + 0.5), 6.0f, bl);
    }

    public List<BlockPos> getSphere(BlockPos blockPos, float f, int n, boolean bl, boolean bl2, int n2) {
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
                    double d = (n3 - n6) * (n3 - n6) + (n5 - n7) * (n5 - n7) + (bl2 ? (n4 - n8) * (n4 - n8) : pd[157]);
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

    public boolean rayTraceSolidCheck(Vec3d vec3d, Vec3d vec3d2, boolean bl) {
        if (!(Double.isNaN(vec3d.x) || Double.isNaN(vec3d.y) || Double.isNaN(vec3d.z) || Double.isNaN(vec3d2.x) || Double.isNaN(vec3d2.y) || Double.isNaN(vec3d2.z))) {
            int n = MathHelper.floor((double)vec3d.x);
            int n2 = MathHelper.floor((double)vec3d.y);
            int n3 = MathHelper.floor((double)vec3d.z);
            int n4 = MathHelper.floor((double)vec3d2.x);
            int n5 = MathHelper.floor((double)vec3d2.y);
            int n6 = MathHelper.floor((double)vec3d2.z);
            BlockPos blockPos = new BlockPos(n, n2, n3);
            IBlockState iBlockState = this.pb.world.getBlockState(blockPos);
            Block block = iBlockState.getBlock();
            if (iBlockState.getCollisionBoundingBox((IBlockAccess)this.pb.world, blockPos) != Block.NULL_AABB && block.canCollideCheck(iBlockState, pd[118]) && (this.getBlocks().contains(block) || !bl)) {
                return pd[119];
            }
            double d = vec3d2.x - vec3d.x;
            double d2 = vec3d2.y - vec3d.y;
            double d3 = vec3d2.z - vec3d.z;
            int n7 = pd[120];
            while (n7-- >= 0) {
                EnumFacing enumFacing;
                if (Double.isNaN(vec3d.x) || Double.isNaN(vec3d.y) || Double.isNaN(vec3d.z)) {
                    return pd[121];
                }
                if (n == n4 && n2 == n5 && n3 == n6) {
                    return pd[122];
                }
                int n8 = pd[123];
                int n9 = pd[124];
                int n10 = pd[125];
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
                    n8 = pd[126];
                }
                if (n5 > n2) {
                    d5 = (double)n2 + 1.0;
                } else if (n5 < n2) {
                    d5 = n2;
                } else {
                    n9 = pd[127];
                }
                if (n6 > n3) {
                    d6 = (double)n3 + 1.0;
                } else if (n6 < n3) {
                    d6 = n3;
                } else {
                    n10 = pd[128];
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
                if (!(block = (iBlockState = this.pb.world.getBlockState(blockPos = new BlockPos(n = MathHelper.floor((double)vec3d.x) - (enumFacing == EnumFacing.EAST ? pd[129] : pd[130]), n2 = MathHelper.floor((double)vec3d.y) - (enumFacing == EnumFacing.UP ? pd[131] : pd[132]), n3 = MathHelper.floor((double)vec3d.z) - (enumFacing == EnumFacing.SOUTH ? pd[133] : pd[134])))).getBlock()).canCollideCheck(iBlockState, pd[135]) || !this.getBlocks().contains(block) && bl) continue;
                return pd[136];
            }
        }
        return pd[137];
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public List<BlockPos> possiblePlacePositions(float f, boolean bl, boolean bl2) {
        NonNullList nonNullList = NonNullList.create();
        nonNullList.addAll((Collection)this.getSphere(_be_0.getPlayerPos(), f, (int)f, pd[154], pd[155], pd[156]).stream().filter(blockPos -> this.pb.world.getBlockState(blockPos).getBlock() != Blocks.AIR ? pd[175] : pd[176]).filter(blockPos -> this.canPlaceCrystal((BlockPos)blockPos, bl, bl2)).collect(Collectors.toList()));
        return nonNullList;
    }

    public void swingArm(String string) {
        if (string.equalsIgnoreCase(lQ[pd[115]]) && this.pb.player.getHeldItemOffhand() != null) {
            this.pb.player.swingArm(EnumHand.MAIN_HAND);
            this.pb.player.swingArm(EnumHand.OFF_HAND);
        } else if (string.equalsIgnoreCase(lQ[pd[116]]) && this.pb.player.getHeldItemOffhand() != null) {
            this.pb.player.swingArm(EnumHand.OFF_HAND);
        } else if (string.equalsIgnoreCase(lQ[pd[117]])) {
            this.pb.player.swingArm(EnumHand.MAIN_HAND);
        }
    }

    public void logic() {
        if (this.kl.is(lQ[pd[97]])) {
            if (this.km.isEnabled()) {
                this.breakCrystals();
            }
            if (this.kt.isEnabled()) {
                this.placeCrystals();
            }
        } else if (this.kl.is(lQ[pd[98]])) {
            if (this.kt.isEnabled()) {
                this.placeCrystals();
            }
            if (this.km.isEnabled()) {
                this.breakCrystals();
            }
        }
    }

    public List<Block> getBlocks() {
        Block[] blockArray = new Block[pd[143]];
        blockArray[_bo_0.pd[144]] = Blocks.OBSIDIAN;
        blockArray[_bo_0.pd[145]] = Blocks.BEDROCK;
        blockArray[_bo_0.pd[146]] = Blocks.COMMAND_BLOCK;
        blockArray[_bo_0.pd[147]] = Blocks.BARRIER;
        blockArray[_bo_0.pd[148]] = Blocks.ENCHANTING_TABLE;
        blockArray[_bo_0.pd[149]] = Blocks.ENDER_CHEST;
        blockArray[_bo_0.pd[150]] = Blocks.END_PORTAL_FRAME;
        blockArray[_bo_0.pd[151]] = Blocks.BEACON;
        blockArray[_bo_0.pd[152]] = Blocks.ANVIL;
        return Arrays.asList(blockArray);
    }

    public float getBlastReduction(EntityLivingBase entityLivingBase, float f, Explosion explosion) {
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
            f = f * (25.0f - (float)(potionEffect.getAmplifier() + pd[153]) * 5.0f) / 25.0f;
        }
        f = Math.max(f, 0.0f);
        return f;
    }

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        this.logic();
        if (this.kz.isEnabled() && !this.kN) {
            this.kN = pd[93];
        }
        if (!this.kz.isEnabled() && this.kN) {
            this.kN = pd[94];
        }
    }

    @Override
    public void onRenderWorld() {
        if (this.kE.isEnabled() && this.kK != null && this.kO != null && this.kO != this.pb.player) {
            if (this.kH.is(lQ[pd[95]])) {
                _ag_0.blockESPBox(this.kK, 1.0f, this.kI.getColor(), pd[96]);
            }
            if (this.kG.isEnabled()) {
                _ag_0.drawNametagFromBlockPos(this.kK, 0.75f, this.kF.isEnabled(), String.valueOf(Math.round(this.kJ)));
            }
        }
    }

    public float getExplosionDamage(Entity entity, Vec3d vec3d, float f, boolean bl) {
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
            int n = pd[139];
            int n2 = pd[140];
            for (double d5 = 0.0; d5 <= 1.0; d5 += vec3d3.x) {
                for (double d6 = 0.0; d6 <= 1.0; d6 += vec3d3.y) {
                    for (double d7 = 0.0; d7 <= 1.0; d7 += vec3d3.z) {
                        Vec3d vec3d4 = new Vec3d(d3 + axisAlignedBB.minX + (axisAlignedBB.maxX - axisAlignedBB.minX) * d5, axisAlignedBB.minY + (axisAlignedBB.maxY - axisAlignedBB.minY) * d6, d4 + axisAlignedBB.minZ + (axisAlignedBB.maxZ - axisAlignedBB.minZ) * d7);
                        if (!this.rayTraceSolidCheck(vec3d4, vec3d, bl)) {
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
            f2 = this.getBlastReduction((EntityLivingBase)entity, this.getDamageFromDifficulty(f2), new Explosion((World)this.pb.world, null, vec3d.x, vec3d.y, vec3d.z, f / 2.0f, pd[141], pd[142]));
        }
        return f2;
    }

    public float getDamageFromDifficulty(float f) {
        switch (_aA.gt[this.pb.world.getDifficulty().ordinal()]) {
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

    public void placeCrystals() {
        if (!(this.pb.player.getHeldItemMainhand().getItem() instanceof ItemEndCrystal) && !(this.pb.player.getHeldItemOffhand().getItem() instanceof ItemEndCrystal)) {
            return;
        }
        double d = 0.0;
        BlockPos entity = null;
        EntityOtherPlayerMP entityOtherPlayerMP = null;
        double d2 = this.kv.getMaximum();
        if (!this.kz.isEnabled()) {
            for (Entity entity2 : this.pb.world.loadedEntityList.stream().filter(EntityOtherPlayerMP.class::isInstance).collect(Collectors.toList())) {
                if (!((double)this.pb.player.getDistance(entity2) < d2)) continue;
                entityOtherPlayerMP = (EntityOtherPlayerMP)entity2;
                d2 = this.pb.player.getDistance(entity2);
                _cc_0.addTarget(entityOtherPlayerMP.getName());
            }
            for (EntityPlayer entityPlayer : this.pb.world.playerEntities) {
                if (entityPlayer == this.pb.player || !((double)this.pb.player.getDistance((Entity)entityPlayer) <= this.kx.getDoubleValue())) continue;
                entityOtherPlayerMP = entityPlayer;
            }
            if (entityOtherPlayerMP != null) {
                if (!this.kM.hasTimeElapsed((long)(1000.0 / this.kw.getDoubleValue()), pd[107])) {
                    return;
                }
                for (BlockPos blockPos : this.possiblePlacePositions(this.kv.getFloatValue(), !this.kz.isEnabled() ? pd[108] : pd[109], this.kB.isEnabled())) {
                    double d3 = this.calculateDamage(blockPos, (Entity)entityOtherPlayerMP, this.kA.isEnabled());
                    if (!(d3 > d) || !((double)this.calculateDamage(blockPos, (Entity)this.pb.player, this.kA.isEnabled()) <= this.kD.getDoubleValue())) continue;
                    d = d3;
                    entity = blockPos;
                }
                if (entity != null && d >= this.ky.getDoubleValue() && (double)this.calculateDamage(entity, (Entity)this.pb.player, this.kA.isEnabled()) <= this.kD.getDoubleValue()) {
                    this.placeCrystalOnBlock(entity, EnumHand.MAIN_HAND, this.ku.isEnabled());
                    this.kJ = d;
                    this.kK = entity;
                }
            } else {
                this.kO = null;
                this.kJ = 0.0;
                this.kK = null;
                return;
            }
            this.kO = entityOtherPlayerMP;
        } else {
            for (Entity entity2 : this.pb.world.loadedEntityList.stream().filter(EntityOtherPlayerMP.class::isInstance).collect(Collectors.toList())) {
                if (!((double)this.pb.player.getDistance(entity2) < d2)) continue;
                entityOtherPlayerMP = (EntityOtherPlayerMP)entity2;
                d2 = this.pb.player.getDistance(entity2);
                _cc_0.addTarget(entityOtherPlayerMP.getName());
            }
            for (EntityPlayer entityPlayer : this.pb.world.playerEntities) {
                if (entityPlayer == this.pb.player || !((double)this.pb.player.getDistance((Entity)entityPlayer) <= this.kx.getDoubleValue())) continue;
                entityOtherPlayerMP = entityPlayer;
            }
            if (entityOtherPlayerMP != null) {
                if (!this.kz.isEnabled() && !this.kM.hasTimeElapsed((long)(1000.0 / this.kw.getDoubleValue()), pd[110])) {
                    return;
                }
                for (BlockPos blockPos : this.possiblePlacePositions(this.kv.getFloatValue(), !this.kz.isEnabled() ? pd[111] : pd[112], this.kB.isEnabled())) {
                    double d4 = this.calculateDamage(blockPos, (Entity)entityOtherPlayerMP, this.kA.isEnabled());
                    if (!(d4 > d) || !((double)this.calculateDamage(blockPos, (Entity)this.pb.player, this.kA.isEnabled()) <= this.kD.getDoubleValue())) continue;
                    d = d4;
                    entity = blockPos;
                }
                if (entity != null && d >= this.ky.getDoubleValue() && (double)this.calculateDamage(entity, (Entity)this.pb.player, this.kA.isEnabled()) <= this.kD.getDoubleValue()) {
                    this.placeCrystalOnBlock(entity, EnumHand.MAIN_HAND, this.ku.isEnabled());
                    this.kJ = d;
                    this.kK = entity;
                }
            } else {
                this.kO = null;
                this.kJ = 0.0;
                this.kK = null;
                return;
            }
            this.kO = entityOtherPlayerMP;
            Object object = new ArrayList(this.pb.world.playerEntities).iterator();
            while (object.hasNext()) {
                EntityPlayer entityPlayer = (EntityPlayer)object.next();
                if (this.pb.player.getDistanceSq((Entity)entityPlayer) > _ac_0.square(this.kx.getFloatValue())) continue;
                for (BlockPos blockPos : this.possiblePlacePositions(this.kv.getFloatValue(), !this.kC.isEnabled() ? pd[113] : pd[114], this.kB.getValue())) {
                    double d5 = this.calculateDamage(blockPos, (Entity)entityPlayer, this.kA.isEnabled());
                    if (d5 == 0.0 || !(d5 > d) || !((double)this.calculateDamage(blockPos, (Entity)this.pb.player, this.kA.isEnabled()) <= this.kD.getDoubleValue())) continue;
                    d = d5;
                    entity = blockPos;
                    entityOtherPlayerMP = entityPlayer;
                    this.kJ = d;
                    this.kK = entity;
                }
            }
            if (entityOtherPlayerMP == null || entity == null) {
                this.kJ = 0.0;
                this.kK = null;
                return;
            }
            if (entityOtherPlayerMP != null && entity != null && d >= this.ky.getDoubleValue() && (object = this.pb.player.getHeldItemMainhand().getItem() instanceof ItemEndCrystal ? EnumHand.MAIN_HAND : (this.pb.player.getHeldItemOffhand().getItem() instanceof ItemEndCrystal ? EnumHand.OFF_HAND : null)) != null) {
                this.placeCrystalOnBlock(entity, (EnumHand)object, this.ku.isEnabled());
                this.kJ = d;
                this.kK = entity;
            }
        }
    }

    public _bo_0() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hx);
        String[] stringArray = new String[pd[3]];
        stringArray[_bo_0.pd[4]] = lQ[pd[5]];
        stringArray[_bo_0.pd[6]] = lQ[pd[7]];
        this.kl = new _cd_0(lQ[pd[2]], stringArray);
        this.km = new _k_0(lQ[pd[8]], pd[9]);
        this.kn = new _cJ(lQ[pd[10]], 7.0, 2.0, 7.0, 0.5);
        String[] stringArray2 = new String[pd[12]];
        stringArray2[_bo_0.pd[13]] = lQ[pd[14]];
        stringArray2[_bo_0.pd[15]] = lQ[pd[16]];
        this.ko = new _cd_0(lQ[pd[11]], stringArray2);
        String[] stringArray3 = new String[pd[18]];
        stringArray3[_bo_0.pd[19]] = lQ[pd[20]];
        stringArray3[_bo_0.pd[21]] = lQ[pd[22]];
        stringArray3[_bo_0.pd[23]] = lQ[pd[24]];
        this.kp = new _cd_0(lQ[pd[17]], stringArray3);
        this.kq = new _cJ(lQ[pd[25]], 15.0, 1.0, 40.0, 1.0);
        this.kr = new _k_0(lQ[pd[26]], pd[27]);
        String[] stringArray4 = new String[pd[29]];
        stringArray4[_bo_0.pd[30]] = lQ[pd[31]];
        stringArray4[_bo_0.pd[32]] = lQ[pd[33]];
        this.ks = new _cd_0(lQ[pd[28]], stringArray4);
        this.kt = new _k_0(lQ[pd[34]], pd[35]);
        this.ku = new _k_0(lQ[pd[36]], pd[37]);
        this.kv = new _cJ(lQ[pd[38]], 7.0, 1.0, 10.0, 1.0);
        this.kw = new _cJ(lQ[pd[39]], 15.0, 1.0, 40.0, 1.0);
        this.kx = new _cJ(lQ[pd[40]], 15.0, 0.0, 20.0, 1.0);
        this.ky = new _cJ(lQ[pd[41]], 0.0, 0.0, 36.0, 0.5);
        this.kz = new _k_0(lQ[pd[42]], pd[43]);
        this.kA = new _k_0(lQ[pd[44]], pd[45]);
        this.kB = new _k_0(lQ[pd[46]], pd[47]);
        this.kC = new _k_0(lQ[pd[48]], pd[49]);
        this.kD = new _cJ(lQ[pd[50]], 6.0, 1.0, 20.0, 1.0);
        this.kE = new _k_0(lQ[pd[51]], pd[52]);
        this.kF = new _k_0(lQ[pd[53]], pd[54]);
        this.kG = new _k_0(lQ[pd[55]], pd[56]);
        String[] stringArray5 = new String[pd[58]];
        stringArray5[_bo_0.pd[59]] = lQ[pd[60]];
        stringArray5[_bo_0.pd[61]] = lQ[pd[62]];
        this.kH = new _cd_0(lQ[pd[57]], stringArray5);
        this.kI = new _cA(lQ[pd[63]], _ck_0.pA);
        this.kJ = 0.0;
        this.kK = null;
        this.kL = new _K();
        this.kM = new _K();
        this.kN = pd[64];
        this.kO = null;
        _bd_0[] _bd_0Array = new _bd_0[pd[65]];
        _bd_0Array[_bo_0.pd[66]] = this.kl;
        this.addSettings(_bd_0Array);
        _bd_0[] _bd_0Array2 = new _bd_0[pd[67]];
        _bd_0Array2[_bo_0.pd[68]] = this.km;
        _bd_0Array2[_bo_0.pd[69]] = this.kn;
        _bd_0Array2[_bo_0.pd[70]] = this.ko;
        _bd_0Array2[_bo_0.pd[71]] = this.kp;
        _bd_0Array2[_bo_0.pd[72]] = this.kq;
        _bd_0Array2[_bo_0.pd[73]] = this.kr;
        _bd_0Array2[_bo_0.pd[74]] = this.ks;
        this.addSettings(_bd_0Array2);
        _bd_0[] _bd_0Array3 = new _bd_0[pd[75]];
        _bd_0Array3[_bo_0.pd[76]] = this.kt;
        _bd_0Array3[_bo_0.pd[77]] = this.ku;
        _bd_0Array3[_bo_0.pd[78]] = this.kv;
        _bd_0Array3[_bo_0.pd[79]] = this.kw;
        _bd_0Array3[_bo_0.pd[80]] = this.kx;
        _bd_0Array3[_bo_0.pd[81]] = this.ky;
        _bd_0Array3[_bo_0.pd[82]] = this.kz;
        _bd_0Array3[_bo_0.pd[83]] = this.kA;
        _bd_0Array3[_bo_0.pd[84]] = this.kB;
        _bd_0Array3[_bo_0.pd[85]] = this.kC;
        _bd_0Array3[_bo_0.pd[86]] = this.kD;
        this.addSettings(_bd_0Array3);
        _bd_0[] _bd_0Array4 = new _bd_0[pd[87]];
        _bd_0Array4[_bo_0.pd[88]] = this.kE;
        _bd_0Array4[_bo_0.pd[89]] = this.kF;
        _bd_0Array4[_bo_0.pd[90]] = this.kG;
        _bd_0Array4[_bo_0.pd[91]] = this.kH;
        _bd_0Array4[_bo_0.pd[92]] = this.kI;
        this.addSettings(_bd_0Array4);
    }
}

