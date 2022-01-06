//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.inventory.ContainerChest
 */
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.ContainerChest;

public class _bW
extends _bA {
    public static final int[] pd = new int[]{0, 1, 2, 2, 0, 3, 1, 4, 5, 2, 0, 1, 0, 0, 6, 0, 1, 2, 3, 4, 5};
    public _cJ nZ;
    public static final String[] ob;
    public _K oa;
    public _cd_0 nY;

    static {
        String[] stringArray = new String[pd[14]];
        stringArray[_bW.pd[15]] = "ChestStealer";
        stringArray[_bW.pd[16]] = "takes everything from chests";
        stringArray[_bW.pd[17]] = "Mode";
        stringArray[_bW.pd[18]] = "Steal";
        stringArray[_bW.pd[19]] = "Drop";
        stringArray[_bW.pd[20]] = "DelayMS";
        ob = stringArray;
    }

    public _bW() {
        super(ob[pd[0]], ob[pd[1]], _aL.hC);
        String[] stringArray = new String[pd[3]];
        stringArray[_bW.pd[4]] = ob[pd[5]];
        stringArray[_bW.pd[6]] = ob[pd[7]];
        this.nY = new _cd_0(ob[pd[2]], stringArray);
        this.nZ = new _cJ(ob[pd[8]], 100.0, 0.0, 200.0, 5.0);
        this.oa = new _K();
        _bd_0[] _bd_0Array = new _bd_0[pd[9]];
        _bd_0Array[_bW.pd[10]] = this.nY;
        _bd_0Array[_bW.pd[11]] = this.nZ;
        this.addSettings(_bd_0Array);
    }

    @Override
    public void onUpdate() {
        if (this.pb.player.openContainer != null && this.pb.player.openContainer instanceof ContainerChest) {
            ContainerChest containerChest = (ContainerChest)this.pb.player.openContainer;
            for (int i = pd[12]; i < containerChest.getLowerChestInventory().getSizeInventory(); ++i) {
                if (containerChest.getLowerChestInventory().getStackInSlot(i) == null) continue;
                this.pb.playerController.windowClick(containerChest.windowId, i, pd[13], ClickType.QUICK_MOVE, (EntityPlayer)this.pb.player);
            }
        }
    }
}

