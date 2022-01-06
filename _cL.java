//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderItem
 *  net.minecraft.item.ItemStack
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class _cL
extends _ct_0 {
    public final Minecraft sg = Minecraft.getMinecraft();
    public static final int[] sj = new int[]{0, 0, 60, 1, 2, 69, -1879048192, 1, 2, 100, 2, 2, 3, 100, 4, 19, 3, -7340032, 5, -1879048192, 0, 1, 1, 27, 100, 4, 8, 4, 8, 6, 100, 7, 13, 8, 69, -1879048192, 1, 2, 100, 2, 2, 9, 100, 10, 19, 3, -7340032, 11, -1879048192, 0, 1, 1, 27, 100, 4, 8, 4, 8, 12, 100, 13, 13, 14, 15, 44, 46, 109, 16, 69, 26, 17, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    public static final RenderItem sh;
    public static final String[] si;

    @Override
    public float getHeight() {
        return _bK.mW.is(si[sj[67]]) ? sj[68] : sj[69];
    }

    public _cL() {
        super(si[sj[0]], sj[1], sj[2], _as_0.fB.getModule(si[sj[3]]));
    }

    @Override
    public int getWidth() {
        return _bK.mW.is(si[sj[62]]) ? (_as_0.fB.isModuleEnabled(si[sj[63]]) ? sj[64] : sj[65]) : sj[66];
    }

    static {
        String[] stringArray = new String[sj[70]];
        stringArray[_cL.sj[71]] = "Armour";
        stringArray[_cL.sj[72]] = "Armour";
        stringArray[_cL.sj[73]] = "Down";
        stringArray[_cL.sj[74]] = "";
        stringArray[_cL.sj[75]] = "%";
        stringArray[_cL.sj[76]] = "Across";
        stringArray[_cL.sj[77]] = "";
        stringArray[_cL.sj[78]] = "%";
        stringArray[_cL.sj[79]] = "Down";
        stringArray[_cL.sj[80]] = "";
        stringArray[_cL.sj[81]] = "%";
        stringArray[_cL.sj[82]] = "Across";
        stringArray[_cL.sj[83]] = "";
        stringArray[_cL.sj[84]] = "%";
        stringArray[_cL.sj[85]] = "Down";
        stringArray[_cL.sj[86]] = "CustomFont";
        stringArray[_cL.sj[87]] = "Down";
        si = stringArray;
        sh = Minecraft.getMinecraft().getRenderItem();
    }

    @Override
    public void renderDummy(int n, int n2) {
        if (_bK.mW.is(si[sj[33]])) {
            int n3 = sj[34];
            GL11.glPushMatrix();
            _ah_0.drawRoundedRect(this.getX(), this.getY(), this.getWidth(), this.getHeight(), 3.0, sj[35]);
            for (ItemStack itemStack : this.sg.player.inventory.armorInventory) {
                n3 -= 17;
                if (itemStack.isEmpty) continue;
                _ah_0.drawRoundedRect(this.getX() + sj[36], this.getY() + n3, this.getWidth() - sj[37], 16.0, 3.0, new _cV(new _cV(Color.GRAY), sj[38]).getRGB());
                GlStateManager.enableDepth();
                _cL.sh.zLevel = 200.0f;
                sh.renderItemAndEffectIntoGUI(itemStack, this.getX() + sj[39], this.getY() + n3);
                sh.renderItemOverlayIntoGUI(this.sg.fontRenderer, itemStack, this.getX() + sj[40], this.getY() + n3, si[sj[41]]);
                _cL.sh.zLevel = 0.0f;
                GlStateManager.enableTexture2D();
                GlStateManager.disableLighting();
                GlStateManager.disableDepth();
                float f = ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
                float f2 = 1.0f - f;
                int n4 = sj[42] - (int)(f2 * 100.0f);
                _h_0.drawStringWithShadow(n4 + si[sj[43]], this.getX() + sj[44], this.getY() + n3 + sj[45], this.qq.lM ? _ck_0.pz : sj[46]);
            }
            GL11.glPopMatrix();
        } else if (_bK.mW.is(si[sj[47]])) {
            GlStateManager.enableTexture2D();
            _ah_0.drawRoundedRect(this.getX(), this.getY(), this.getWidth(), this.getHeight(), 3.0, sj[48]);
            int n5 = sj[49];
            int n6 = this.getY() + sj[50];
            ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
            for (ItemStack itemStack : this.sg.player.inventory.armorInventory) {
                arrayList.add(itemStack);
            }
            Collections.reverse(arrayList);
            for (ItemStack itemStack : arrayList) {
                if (itemStack.isEmpty()) continue;
                int n7 = this.getX() + sj[51] + n5 * sj[52];
                _ah_0.drawRoundedRect(n7, n6, 26.0, 24.0, 3.0, new _cV(new _cV(Color.GRAY), sj[53]).getRGB());
                GlStateManager.enableDepth();
                _cL.sh.zLevel = 200.0f;
                sh.renderItemAndEffectIntoGUI(itemStack, n7 + sj[54], n6 + sj[55]);
                sh.renderItemOverlayIntoGUI(this.sg.fontRenderer, itemStack, n7 + sj[56], n6 + sj[57], si[sj[58]]);
                _cL.sh.zLevel = 0.0f;
                GlStateManager.enableTexture2D();
                GlStateManager.disableLighting();
                GlStateManager.disableDepth();
                float f = ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
                float f3 = 1.0f - f;
                int n8 = sj[59] - (int)(f3 * 100.0f);
                _h_0.drawCenteredString(n8 + si[sj[60]], n7 + sj[61], n6, _ck_0.pz);
                ++n5;
            }
            GlStateManager.enableDepth();
            GlStateManager.disableLighting();
        }
        this.qp.setHeight(this.getHeight());
        this.qp.setWidth(this.getWidth());
        super.renderDummy(n, n2);
    }

    @Override
    public void draw() {
        if (_bK.mW.is(si[sj[4]])) {
            int n = sj[5];
            GL11.glPushMatrix();
            _ah_0.drawRoundedRect(this.getX(), this.getY(), this.getWidth(), this.getHeight(), 3.0, sj[6]);
            for (ItemStack itemStack : this.sg.player.inventory.armorInventory) {
                n -= 17;
                if (itemStack.isEmpty) continue;
                _ah_0.drawRoundedRect(this.getX() + sj[7], this.getY() + n, this.getWidth() - sj[8], 16.0, 3.0, new _cV(new _cV(Color.GRAY), sj[9]).getRGB());
                GlStateManager.enableDepth();
                _cL.sh.zLevel = 200.0f;
                sh.renderItemAndEffectIntoGUI(itemStack, this.getX() + sj[10], this.getY() + n);
                sh.renderItemOverlayIntoGUI(this.sg.fontRenderer, itemStack, this.getX() + sj[11], this.getY() + n, si[sj[12]]);
                _cL.sh.zLevel = 0.0f;
                GlStateManager.enableTexture2D();
                GlStateManager.disableLighting();
                GlStateManager.disableDepth();
                float f = ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
                float f2 = 1.0f - f;
                int n2 = sj[13] - (int)(f2 * 100.0f);
                _h_0.drawStringWithShadow(n2 + si[sj[14]], this.getX() + sj[15], this.getY() + n + sj[16], this.qq.lM ? _ck_0.pz : sj[17]);
            }
            GL11.glPopMatrix();
        } else if (_bK.mW.is(si[sj[18]])) {
            GlStateManager.enableTexture2D();
            _ah_0.drawRoundedRect(this.getX(), this.getY(), this.getWidth(), this.getHeight(), 3.0, sj[19]);
            int n = sj[20];
            int n3 = this.getY() + sj[21];
            ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>();
            for (ItemStack itemStack : this.sg.player.inventory.armorInventory) {
                arrayList.add(itemStack);
            }
            Collections.reverse(arrayList);
            for (ItemStack itemStack : arrayList) {
                if (itemStack.isEmpty()) continue;
                int n4 = this.getX() + sj[22] + n * sj[23];
                _ah_0.drawRoundedRect(n4, n3, 26.0, 24.0, 3.0, new _cV(new _cV(Color.GRAY), sj[24]).getRGB());
                GlStateManager.enableDepth();
                _cL.sh.zLevel = 200.0f;
                sh.renderItemAndEffectIntoGUI(itemStack, n4 + sj[25], n3 + sj[26]);
                sh.renderItemOverlayIntoGUI(this.sg.fontRenderer, itemStack, n4 + sj[27], n3 + sj[28], si[sj[29]]);
                _cL.sh.zLevel = 0.0f;
                GlStateManager.enableTexture2D();
                GlStateManager.disableLighting();
                GlStateManager.disableDepth();
                float f = ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
                float f3 = 1.0f - f;
                int n5 = sj[30] - (int)(f3 * 100.0f);
                _h_0.drawCenteredString(n5 + si[sj[31]], n4 + sj[32], n3, _ck_0.pz);
                ++n;
            }
            GlStateManager.enableDepth();
            GlStateManager.disableLighting();
        }
        this.qp.setHeight(this.getHeight());
        this.qp.setWidth(this.getWidth());
        super.draw();
    }
}

