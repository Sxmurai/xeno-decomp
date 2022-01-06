//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class _G
implements _cf_0 {
    public static final int[] pd = new int[]{0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0};

    public static boolean raytraceQuill(BlockPos blockPos, double d) {
        return _G.pb.world.rayTraceBlocks(new Vec3d(_G.pb.player.posX, _G.pb.player.posY + (double)_G.pb.player.getEyeHeight(), _G.pb.player.posZ), new Vec3d((double)blockPos.getX(), (double)blockPos.getY() + d + 1.5, (double)blockPos.getZ()), pd[5], pd[6], pd[7]) == null ? pd[8] : pd[9];
    }

    public static boolean raytraceBlock(BlockPos blockPos, double d) {
        return _G.pb.world.rayTraceBlocks(new Vec3d(_G.pb.player.posX, _G.pb.player.posY + (double)_G.pb.player.getEyeHeight(), _G.pb.player.posZ), new Vec3d((double)blockPos.getX(), (double)blockPos.getY() + d, (double)blockPos.getZ()), pd[0], pd[1], pd[2]) == null ? pd[3] : pd[4];
    }

    public static boolean raytraceFeet(Entity entity) {
        return _G.pb.world.rayTraceBlocks(new Vec3d(_G.pb.player.posX, _G.pb.player.posY + (double)_G.pb.player.getEyeHeight(), _G.pb.player.posZ), new Vec3d(entity.posX, entity.posY, entity.posZ), pd[15], pd[16], pd[17]) == null ? pd[18] : pd[19];
    }

    public static boolean raytraceEntity(Entity entity) {
        return _G.pb.world.rayTraceBlocks(new Vec3d(_G.pb.player.posX, _G.pb.player.posY + (double)_G.pb.player.getEyeHeight(), _G.pb.player.posZ), new Vec3d(entity.posX, entity.posY, entity.posZ), pd[10], pd[11], pd[12]) == null ? pd[13] : pd[14];
    }
}

