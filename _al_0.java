//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _al
 */
public class _al_0
extends _ct_0 {
    public static final String[] qx;
    public static final int[] qy;

    @Override
    public float getHeight() {
        return _ca_0.ox.is(qx[qy[29]]) ? qy[30] : qy[31];
    }

    @Override
    public void renderDummy(int n, int n2) {
        super.renderDummy(n, n2);
        this.qp.setHeight(this.getHeight());
        this.qp.setWidth(this.getWidth());
        if (_ca_0.ox.is(qx[qy[14]])) {
            _h_0.drawStringWithShadow(_as_0.fv + qx[qy[15]] + qx[qy[16]], this.getX(), this.getY(), this.qq.lM ? _ck_0.pz : qy[17]);
        } else if (_ca_0.ox.is(qx[qy[18]])) {
            GL11.glPushMatrix();
            if (!this.qq.lM) {
                GL11.glColor3f((float)0.9f, (float)0.0f, (float)0.0f);
            }
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            ResourceLocation resourceLocation = new ResourceLocation(qx[qy[19]], qx[qy[20]]);
            Minecraft.getMinecraft().getTextureManager().bindTexture(resourceLocation);
            Gui.drawModalRectWithCustomSizedTexture((int)(this.getX() * qy[21]), (int)(this.getY() * qy[22]), (float)0.0f, (float)0.0f, (int)qy[23], (int)qy[24], (float)190.0f, (float)70.0f);
            GL11.glPopMatrix();
        }
    }

    @Override
    public int getWidth() {
        return _ca_0.ox.is(qx[qy[25]]) ? _h_0.getStringWidth(_as_0.fv + qx[qy[26]] + qx[qy[27]]) : qy[28];
    }

    static {
        qy = new int[]{0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 2, 2, 190, 70, 8, 9, 10, -7340032, 11, 12, 13, 2, 2, 190, 70, 14, 15, 16, 95, 17, 11, 35, 18, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        String[] stringArray = new String[qy[32]];
        stringArray[_al_0.qy[33]] = "Client Name";
        stringArray[_al_0.qy[34]] = "ClientName";
        stringArray[_al_0.qy[35]] = "Text";
        stringArray[_al_0.qy[36]] = " ";
        stringArray[_al_0.qy[37]] = "1.1";
        stringArray[_al_0.qy[38]] = "Image";
        stringArray[_al_0.qy[39]] = "xeno";
        stringArray[_al_0.qy[40]] = "textures/xeno_logo_full.png";
        stringArray[_al_0.qy[41]] = "Text";
        stringArray[_al_0.qy[42]] = " ";
        stringArray[_al_0.qy[43]] = "1.1";
        stringArray[_al_0.qy[44]] = "Image";
        stringArray[_al_0.qy[45]] = "xeno";
        stringArray[_al_0.qy[46]] = "textures/xeno_logo_full.png";
        stringArray[_al_0.qy[47]] = "Text";
        stringArray[_al_0.qy[48]] = " ";
        stringArray[_al_0.qy[49]] = "1.1";
        stringArray[_al_0.qy[50]] = "Text";
        qx = stringArray;
    }

    @Override
    public void draw() {
        if (_ca_0.ox.is(qx[qy[4]])) {
            _h_0.drawStringWithShadow(_as_0.fv + qx[qy[5]] + qx[qy[6]], this.getX(), this.getY(), _ck_0.pz);
        } else if (_ca_0.ox.is(qx[qy[7]])) {
            GL11.glPushMatrix();
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
            if (!this.qq.lM) {
                GL11.glColor3f((float)0.9f, (float)0.0f, (float)0.0f);
            }
            GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
            ResourceLocation resourceLocation = new ResourceLocation(qx[qy[8]], qx[qy[9]]);
            Minecraft.getMinecraft().getTextureManager().bindTexture(resourceLocation);
            Gui.drawModalRectWithCustomSizedTexture((int)(this.getX() * qy[10]), (int)(this.getY() * qy[11]), (float)0.0f, (float)0.0f, (int)qy[12], (int)qy[13], (float)190.0f, (float)70.0f);
            GL11.glPopMatrix();
        }
        super.draw();
    }

    public _al_0() {
        super(qx[qy[0]], qy[1], qy[2], _as_0.fB.getModule(qx[qy[3]]));
    }
}

