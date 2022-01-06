//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 */
import net.minecraft.entity.Entity;

public class _bL
extends _bA {
    public static final String[] nb;
    public static _bL mZ;
    public static final int[] pd;
    public _cJ na = new _cJ(nb[pd[3]], 2.0, 1.0, 3.0, 0.5);

    public _bL() {
        super(nb[pd[0]], nb[pd[1]], pd[2], _aL.hy);
        _bd_0[] _bd_0Array = new _bd_0[pd[4]];
        _bd_0Array[_bL.pd[5]] = this.na;
        this.addSettings(_bd_0Array);
        mZ = this;
    }

    static {
        pd = new int[]{0, 1, 0, 2, 1, 0, 3, 0, 1, 2};
        String[] stringArray = new String[pd[6]];
        stringArray[_bL.pd[7]] = "ReverseStep";
        stringArray[_bL.pd[8]] = "step but down";
        stringArray[_bL.pd[9]] = "Down Height";
        nb = stringArray;
    }

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        if (this.pb.world == null || this.pb.player == null || this.pb.player.isInWater() || this.pb.player.isInLava() || this.pb.player.isOnLadder() || this.pb.gameSettings.keyBindJump.isKeyDown()) {
            return;
        }
        if (this.pb.player != null && this.pb.player.onGround && !this.pb.player.isInWater() && !this.pb.player.isOnLadder()) {
            for (double d = 0.0; d < this.na.getVal(); d += 0.01) {
                if (this.pb.world.getCollisionBoxes((Entity)this.pb.player, this.pb.player.getEntityBoundingBox().offset(0.0, -d, 0.0)).isEmpty()) continue;
                this.pb.player.motionY = -10.0;
                break;
            }
        }
    }
}

