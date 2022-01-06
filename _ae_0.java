//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.NonNullList
 */
import java.awt.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/*
 * Renamed from _ae
 */
public class _ae_0
extends _ct_0 {
    public static final String[] qx;
    public static final int[] qy;
    public final Minecraft pb = Minecraft.getMinecraft();
    public static final RenderItem dl;

    static {
        qy = new int[]{0, 0, 130, 1, -1879048192, 9, 1, 9, 18, 1, 9, 1, 18, 50, 1, 2, 3, 16, 1, 7, -1, -1879048192, 9, 1, 9, 18, 1, 9, 1, 18, 50, 1, 4, 5, 16, 1, 7, -1, 162, 6, 0, 1, 2, 3, 4, 5};
        String[] stringArray = new String[qy[39]];
        stringArray[_ae_0.qy[40]] = "Inventory";
        stringArray[_ae_0.qy[41]] = "Inventory";
        stringArray[_ae_0.qy[42]] = "";
        stringArray[_ae_0.qy[43]] = "";
        stringArray[_ae_0.qy[44]] = "";
        stringArray[_ae_0.qy[45]] = "";
        qx = stringArray;
        dl = Minecraft.getMinecraft().getRenderItem();
    }

    @Override
    public void renderDummy(int n, int n2) {
        super.renderDummy(n, n2);
        this.qp.setHeight(this.getHeight());
        this.qp.setWidth(this.getWidth());
        _ah_0.drawRoundedRect(this.getX(), this.getY(), this.getWidth(), this.getHeight(), 3.0, qy[21]);
        NonNullList nonNullList = Minecraft.getMinecraft().player.inventory.mainInventory;
        int n3 = nonNullList.size();
        for (int i = qy[22]; i < n3; ++i) {
            int n4 = this.getX() + qy[23] + i % qy[24] * qy[25];
            int n5 = this.getY() + qy[26] + (i / qy[27] - qy[28]) * qy[29];
            _ah_0.drawRoundedRect(n4, n5, 16.0, 16.0, 2.0, new _cV(new _cV(Color.GRAY), qy[30]).getRGB());
            String string = ((ItemStack)nonNullList.get(i)).getCount() > qy[31] ? String.valueOf(((ItemStack)nonNullList.get(i)).getCount()) : qx[qy[32]];
            GlStateManager.enableDepth();
            _ae_0.dl.zLevel = 200.0f;
            dl.renderItemAndEffectIntoGUI((ItemStack)nonNullList.get(i), n4, n5);
            dl.renderItemOverlayIntoGUI(this.pb.fontRenderer, (ItemStack)nonNullList.get(i), n4, n5, qx[qy[33]]);
            _ae_0.dl.zLevel = 0.0f;
            GlStateManager.enableTexture2D();
            GlStateManager.disableLighting();
            GlStateManager.disableDepth();
            _h_0.drawStringWithShadow(string, n4 + qy[34] - _h_0.getStringWidth(string) - qy[35], n5 + qy[36], qy[37]);
        }
    }

    @Override
    public float getHeight() {
        return 54.0f;
    }

    @Override
    public int getWidth() {
        return qy[38];
    }

    @Override
    public void draw() {
        super.draw();
        this.qp.setHeight(this.getHeight());
        this.qp.setWidth(this.getWidth());
        _ah_0.drawRoundedRect(this.getX(), this.getY(), this.getWidth(), this.getHeight(), 3.0, qy[4]);
        NonNullList nonNullList = Minecraft.getMinecraft().player.inventory.mainInventory;
        int n = nonNullList.size();
        for (int i = qy[5]; i < n; ++i) {
            int n2 = this.getX() + qy[6] + i % qy[7] * qy[8];
            int n3 = this.getY() + qy[9] + (i / qy[10] - qy[11]) * qy[12];
            _ah_0.drawRoundedRect(n2, n3, 16.0, 16.0, 2.0, new _cV(new _cV(Color.GRAY), qy[13]).getRGB());
            String string = ((ItemStack)nonNullList.get(i)).getCount() > qy[14] ? String.valueOf(((ItemStack)nonNullList.get(i)).getCount()) : qx[qy[15]];
            GlStateManager.enableDepth();
            _ae_0.dl.zLevel = 200.0f;
            dl.renderItemAndEffectIntoGUI((ItemStack)nonNullList.get(i), n2, n3);
            dl.renderItemOverlayIntoGUI(this.pb.fontRenderer, (ItemStack)nonNullList.get(i), n2, n3, qx[qy[16]]);
            _ae_0.dl.zLevel = 0.0f;
            GlStateManager.enableTexture2D();
            GlStateManager.disableLighting();
            GlStateManager.disableDepth();
            _h_0.drawStringWithShadow(string, n2 + qy[17] - _h_0.getStringWidth(string) - qy[18], n3 + qy[19], qy[20]);
        }
    }

    public _ae_0() {
        super(qx[qy[0]], qy[1], qy[2], _as_0.fB.getModule(qx[qy[3]]));
    }
}

