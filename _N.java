//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  org.lwjgl.input.Mouse
 */
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.RayTraceResult;
import org.lwjgl.input.Mouse;

public class _N
extends _bA {
    public boolean bK = pd[3];
    public static final int[] pd = new int[]{0, 1, 0, 0, 2, 1, 0, 2, 3, 4, 5, 1, 6, 0, 1, 2, 3, 4, 5};
    public static final String[] lQ;

    @Override
    public void onUpdate() {
        if (Mouse.isButtonDown((int)pd[4])) {
            if (!this.bK && this.pb.currentScreen == null) {
                this.onClick();
            }
            this.bK = pd[5];
        } else {
            this.bK = pd[6];
        }
    }

    public void onClick() {
        Entity entity;
        RayTraceResult rayTraceResult = this.pb.objectMouseOver;
        if (rayTraceResult != null && rayTraceResult.typeOfHit == RayTraceResult.Type.ENTITY && (entity = rayTraceResult.entityHit) instanceof EntityPlayer) {
            if (_bn_0.isFriend(entity.getName())) {
                _bn_0.removeFriend(entity.getName());
                _cU.addChatMessage(lQ[pd[7]] + entity.getName() + lQ[pd[8]]);
                _as_0.fG.saveFriendConfig();
            } else {
                _as_0.fH.addFriend(entity.getName());
                _cU.addChatMessage(lQ[pd[9]] + entity.getName() + lQ[pd[10]]);
                _as_0.fG.saveFriendConfig();
            }
        }
        this.bK = pd[11];
    }

    public _N() {
        super(lQ[pd[0]], lQ[pd[1]], pd[2], _aL.hC);
    }

    static {
        String[] stringArray = new String[pd[12]];
        stringArray[_N.pd[13]] = "MCF";
        stringArray[_N.pd[14]] = "middle click people to friend / unfriend them";
        stringArray[_N.pd[15]] = "\u00a7c";
        stringArray[_N.pd[16]] = "\u00a7r unfriended.";
        stringArray[_N.pd[17]] = "\u00a7b";
        stringArray[_N.pd[18]] = "\u00a7r friended.";
        lQ = stringArray;
    }
}

