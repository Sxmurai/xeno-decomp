//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.passive.EntityTameable
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityTameable;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _cj
 */
public class _cj_0
extends _bA {
    public static final String[] pw;
    public _k_0 pt = new _k_0(pw[px[2]], px[3]);
    public static final int[] px;
    public _cA pv;
    public _k_0 pu = new _k_0(pw[px[4]], px[5]);

    @Override
    public void onRenderWorld() {
        for (Entity entity : this.pb.world.loadedEntityList) {
            if (!(entity instanceof EntityTameable)) continue;
            try {
                this.renderNametag(entity, (Entity)((EntityTameable)entity).getOwner(), entity.posX, entity.posY + (double)entity.height + 1.0, entity.posZ);
            }
            catch (NullPointerException nullPointerException) {}
        }
    }

    public _cj_0() {
        super(pw[px[0]], pw[px[1]], _aL.hz);
        this.pv = new _cA(pw[px[6]], _cV.WHITE);
        _bd_0[] _bd_0Array = new _bd_0[px[7]];
        _bd_0Array[_cj_0.px[8]] = this.pt;
        _bd_0Array[_cj_0.px[9]] = this.pv;
        this.addSettings(_bd_0Array);
    }

    static {
        px = new int[]{0, 1, 2, 1, 3, 1, 4, 2, 0, 1, 5, 6, 2, 2, 1, 2, 1, 20, 2, 5, 2, 20, 2, 5, 2, 7, 0, 1, 2, 3, 4, 5, 6};
        String[] stringArray = new String[px[25]];
        stringArray[_cj_0.px[26]] = "MobOwner";
        stringArray[_cj_0.px[27]] = "shows who tamed mobs belong to";
        stringArray[_cj_0.px[28]] = "Custom Font";
        stringArray[_cj_0.px[29]] = "Wolf";
        stringArray[_cj_0.px[30]] = "Font Colour";
        stringArray[_cj_0.px[31]] = " (You)";
        stringArray[_cj_0.px[32]] = "";
        pw = stringArray;
    }

    public void renderNametag(Entity entity, Entity entity2, double d, double d2, double d3) {
        String string = entity.getName();
        String string2 = entity2.getName() + (entity2.getName() == this.pb.player.getName() ? pw[px[10]] : pw[px[11]]);
        double d4 = this.pb.player.getDistance(d, d2, d3);
        double d5 = 3.0;
        double d6 = 0.0;
        d5 = d4 / 20.0 * Math.pow(1.2589254, 0.1 / (d4 < 25.0 ? 0.5 : 2.0));
        d5 = Math.min(Math.max(d5, 0.5), 5.0);
        d6 = -0.5;
        GlStateManager.pushMatrix();
        GlStateManager.translate((double)(d - this.pb.getRenderManager().viewerPosX), (double)(d2 + d6 - this.pb.getRenderManager().viewerPosY), (double)(d3 - this.pb.getRenderManager().viewerPosZ));
        GlStateManager.rotate((float)(-this.pb.getRenderManager().playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GlStateManager.rotate((float)this.pb.getRenderManager().playerViewX, (float)(this.pb.gameSettings.thirdPersonView == px[12] ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
        GlStateManager.scale((double)(-(d5 /= 40.0)), (double)(-d5), (double)d5);
        int n = this.pt.getValue() ? _cX.te.getStringWidth(this.lH) / px[13] + px[14] : this.pb.fontRenderer.getStringWidth(this.lH) / px[15] + px[16];
        GlStateManager.enableTexture2D();
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        if (this.pt.isEnabled()) {
            _cX.te.drawStringWithShadow(string, -n, (_cX.te.FONT_HEIGHT - px[17] - _cX.te.FONT_HEIGHT) / px[18], this.pv.getColor().getRGB());
            _cX.te.drawStringWithShadow(string2, -n, (_cX.te.FONT_HEIGHT - px[19]) / px[20], this.pv.getColor().getRGB());
        } else {
            this.pb.fontRenderer.drawStringWithShadow(string, (float)(-n), (float)((this.pb.fontRenderer.FONT_HEIGHT - px[21] - this.pb.fontRenderer.FONT_HEIGHT) / px[22]), this.pv.getColor().getRGB());
            this.pb.fontRenderer.drawStringWithShadow(string2, (float)(-n), (float)((this.pb.fontRenderer.FONT_HEIGHT - px[23]) / px[24]), this.pv.getColor().getRGB());
        }
        GlStateManager.disableTexture2D();
        GlStateManager.popMatrix();
    }
}

