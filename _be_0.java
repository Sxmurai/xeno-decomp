//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockEnderChest
 *  net.minecraft.block.BlockObsidian
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.item.EnumAction
 *  net.minecraft.item.ItemBlock
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  org.lwjgl.input.Mouse
 */
import net.minecraft.block.Block;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.block.BlockObsidian;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.input.Mouse;

/*
 * Renamed from _be
 */
public class _be_0 {
    public static Minecraft jw;
    public static final int[] jx;

    public static Vec3d getCenter(double d, double d2, double d3) {
        return new Vec3d(Math.floor(d) + 0.5, Math.floor(d2), Math.floor(d3) + 0.5);
    }

    public static void lockLimbs() {
        _be_0.jw.player.prevLimbSwingAmount = 0.0f;
        _be_0.jw.player.limbSwingAmount = 0.0f;
        _be_0.jw.player.limbSwing = 0.0f;
    }

    public static boolean isMending() {
        return (_cu_0.isHolding(Items.EXPERIENCE_BOTTLE) && Mouse.isButtonDown((int)jx[19]) ? jx[20] : jx[21]) != 0;
    }

    public static void attackEntity(Entity entity, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        block7: {
            block6: {
                if (!bl2) break block6;
                EntityPlayerSP entityPlayerSP = _be_0.jw.player;
                float f = bl3 ? 20.0f - _as_0.fJ.getTPS(_c_0.f) : 0.0f;
                if (!(entityPlayerSP.getCooledAttackStrength(f) >= 1.0f)) break block7;
            }
            if (bl) {
                _be_0.jw.player.connection.sendPacket((Packet)new CPacketUseEntity(entity));
            } else {
                _be_0.jw.playerController.attackEntity((EntityPlayer)_be_0.jw.player, entity);
            }
            if (bl4) {
                _be_0.jw.player.swingArm(EnumHand.MAIN_HAND);
            }
            _be_0.jw.player.resetCooldown();
        }
    }

    public static boolean isMining() {
        return (_cu_0.isHolding(Items.DIAMOND_PICKAXE) && _be_0.jw.playerController.getIsHittingBlock() ? jx[22] : jx[23]) != 0;
    }

    public static BlockPos getPlayerPos() {
        return new BlockPos(Math.floor(_be_0.jw.player.posX), Math.floor(_be_0.jw.player.posY), Math.floor(_be_0.jw.player.posZ));
    }

    public static double getHealth() {
        return _be_0.jw.player.getHealth() + _be_0.jw.player.getAbsorptionAmount();
    }

    public static boolean isCollided() {
        return (_be_0.jw.player.collidedHorizontally || _be_0.jw.player.collidedVertically ? jx[26] : jx[27]) != 0;
    }

    public static boolean isEating() {
        return (_be_0.jw.player.getHeldItemMainhand().getItemUseAction().equals((Object)EnumAction.EAT) || _be_0.jw.player.getHeldItemMainhand().getItemUseAction().equals((Object)EnumAction.DRINK) ? jx[17] : jx[18]) != 0;
    }

    public static int findObiInHotbar() {
        for (int i = jx[0]; i < jx[1]; ++i) {
            ItemStack itemStack = _be_0.jw.player.inventory.getStackInSlot(i);
            if (itemStack == ItemStack.EMPTY || !(itemStack.getItem() instanceof ItemBlock)) continue;
            Block block = ((ItemBlock)itemStack.getItem()).getBlock();
            if (block instanceof BlockEnderChest) {
                return i;
            }
            if (!(block instanceof BlockObsidian)) continue;
            return i;
        }
        return jx[2];
    }

    public static boolean isInLiquid() {
        return (_be_0.jw.player.isInLava() || _be_0.jw.player.isInWater() ? jx[24] : jx[25]) != 0;
    }

    static {
        jx = new int[]{0, 9, -1, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0};
        jw = Minecraft.getMinecraft();
    }

    public static boolean isTrapped() {
        BlockPos[] blockPosArray;
        BlockPos blockPos = new BlockPos(Math.floor(_be_0.jw.player.posX), Math.floor(_be_0.jw.player.posY), Math.floor(_be_0.jw.player.posZ));
        BlockPos[] blockPosArray2 = new BlockPos[jx[3]];
        blockPosArray2[_be_0.jx[4]] = blockPos.down();
        blockPosArray2[_be_0.jx[5]] = blockPos.up().up();
        blockPosArray2[_be_0.jx[6]] = blockPos.north();
        blockPosArray2[_be_0.jx[7]] = blockPos.south();
        blockPosArray2[_be_0.jx[8]] = blockPos.east();
        blockPosArray2[_be_0.jx[9]] = blockPos.west();
        blockPosArray2[_be_0.jx[10]] = blockPos.north().up();
        blockPosArray2[_be_0.jx[11]] = blockPos.south().up();
        blockPosArray2[_be_0.jx[12]] = blockPos.east().up();
        blockPosArray2[_be_0.jx[13]] = blockPos.west().up();
        BlockPos[] blockPosArray3 = blockPosArray = blockPosArray2;
        int n = blockPosArray3.length;
        for (int i = jx[14]; i < n; ++i) {
            BlockPos blockPos2 = blockPosArray3[i];
            IBlockState iBlockState = _be_0.jw.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() == Blocks.OBSIDIAN || _be_0.jw.world.getBlockState(blockPos2).getBlock() == Blocks.BEDROCK) continue;
            return jx[15];
        }
        return jx[16];
    }
}

