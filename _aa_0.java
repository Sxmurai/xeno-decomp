//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.inventory.GuiContainer
 *  net.minecraft.client.renderer.InventoryEffectRenderer
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.entity.player.InventoryPlayer
 *  net.minecraft.init.Enchantments
 *  net.minecraft.inventory.ClickType
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.DamageSource
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

/*
 * Renamed from _aa
 */
public class _aa_0
extends _bA {
    public _cJ cO = new _cJ(lQ[pd[2]], 300.0, 0.0, 1000.0, 50.0);
    public static final int[] pd = new int[]{0, 1, 2, 3, 2, 0, 4, 1, 5, 1, 0, 1, 4, 4, 0, 4, -1, 0, 36, 4, 0, 0, 1, 1, 2, 2, 3, 3, -1, -1, 9, 0, 8, 0, 0, 0, 0, 5, 3, 6, 0, 1, 2, 3, 4, 5};
    public static final String[] lQ;
    public _K cQ;
    public _cd_0 cP;

    static {
        String[] stringArray = new String[pd[39]];
        stringArray[_aa_0.pd[40]] = "AutoArmour";
        stringArray[_aa_0.pd[41]] = "Automatically equips your best armour.";
        stringArray[_aa_0.pd[42]] = "Delay";
        stringArray[_aa_0.pd[43]] = "Prefer";
        stringArray[_aa_0.pd[44]] = "Chestplate";
        stringArray[_aa_0.pd[45]] = "Elytra";
        lQ = stringArray;
    }

    public _aa_0() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hx);
        String[] stringArray = new String[pd[4]];
        stringArray[_aa_0.pd[5]] = lQ[pd[6]];
        stringArray[_aa_0.pd[7]] = lQ[pd[8]];
        this.cP = new _cd_0(lQ[pd[3]], stringArray);
        this.cQ = new _K();
        _bd_0[] _bd_0Array = new _bd_0[pd[9]];
        _bd_0Array[_aa_0.pd[10]] = this.cO;
        this.addSettings(_bd_0Array);
    }

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        if (this.pb.currentScreen instanceof GuiContainer && !(this.pb.currentScreen instanceof InventoryEffectRenderer)) {
            return;
        }
        if (this.cQ.hasTimeElapsed((long)this.cO.getDoubleValue(), pd[11])) {
            ItemStack itemStack;
            Object object;
            int n;
            EntityPlayerSP entityPlayerSP = this.pb.player;
            InventoryPlayer inventoryPlayer = entityPlayerSP.inventory;
            if (entityPlayerSP.moveForward != 0.0f || entityPlayerSP.movementInput.moveStrafe != 0.0f) {
                return;
            }
            int[] nArray = new int[pd[12]];
            int[] nArray2 = new int[pd[13]];
            for (n = pd[14]; n < pd[15]; ++n) {
                nArray[n] = pd[16];
                object = inventoryPlayer.armorItemInSlot(n);
                itemStack = this.pb.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
                if (_cg_0.isNullOrEmpty((ItemStack)object) || !(object.getItem() instanceof ItemArmor)) continue;
                ItemArmor itemArmor = (ItemArmor)object.getItem();
                nArray2[n] = this.getArmorValue(itemArmor, (ItemStack)object);
            }
            for (n = pd[17]; n < pd[18]; ++n) {
                object = inventoryPlayer.getStackInSlot(n);
                if (_cg_0.isNullOrEmpty((ItemStack)object) || !(object.getItem() instanceof ItemArmor)) continue;
                itemStack = (ItemArmor)object.getItem();
                int n2 = _cg_0.getArmorType((ItemArmor)itemStack);
                int n3 = this.getArmorValue((ItemArmor)itemStack, (ItemStack)object);
                if (n3 <= nArray2[n2]) continue;
                nArray[n2] = n;
                nArray2[n2] = n3;
            }
            Integer[] integerArray = new Integer[pd[19]];
            integerArray[_aa_0.pd[20]] = pd[21];
            integerArray[_aa_0.pd[22]] = pd[23];
            integerArray[_aa_0.pd[24]] = pd[25];
            integerArray[_aa_0.pd[26]] = pd[27];
            ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(integerArray));
            Collections.shuffle(arrayList);
            object = arrayList.iterator();
            while (object.hasNext()) {
                ItemStack itemStack2;
                int n4 = (Integer)object.next();
                int n5 = nArray[n4];
                if (n5 == pd[28] || !_cg_0.isNullOrEmpty(itemStack2 = inventoryPlayer.armorItemInSlot(n4)) && inventoryPlayer.getFirstEmptyStack() == pd[29]) continue;
                if (n5 < pd[30]) {
                    n5 += 36;
                }
                if (!_cg_0.isNullOrEmpty(itemStack2)) {
                    this.pb.playerController.windowClick(pd[31], pd[32] - n4, pd[33], ClickType.QUICK_MOVE, (EntityPlayer)this.pb.player);
                }
                this.pb.playerController.windowClick(pd[34], n5, pd[35], ClickType.QUICK_MOVE, (EntityPlayer)this.pb.player);
                break;
            }
        }
    }

    @Override
    public void onEnable() {
    }

    public int getArmorValue(ItemArmor itemArmor, ItemStack itemStack) {
        int n = itemArmor.damageReduceAmount;
        int n2 = pd[36];
        int n3 = (int)_cg_0.getArmorToughness(itemArmor);
        int n4 = itemArmor.getArmorMaterial().getDamageReductionAmount(EntityEquipmentSlot.LEGS);
        Enchantment enchantment = Enchantments.PROTECTION;
        int n5 = _bg_0.getEnchantmentLevel(enchantment, itemStack);
        EntityPlayerSP entityPlayerSP = this.pb.player;
        DamageSource damageSource = DamageSource.causePlayerDamage((EntityPlayer)entityPlayerSP);
        n2 = enchantment.calcModifierDamage(n5, damageSource);
        return n * pd[37] + n2 * pd[38] + n3 + n4;
    }
}

