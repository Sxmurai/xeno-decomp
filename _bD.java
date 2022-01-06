//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.texture.TextureUtil
 *  net.minecraftforge.fml.relauncher.Side
 *  net.minecraftforge.fml.relauncher.SideOnly
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(value=Side.CLIENT)
public class _bD
implements _cf_0 {
    public static final int[] pd = new int[]{1, 600, 0, -1, 0, 0, 0, 0, 255, 8, 2, 16, 255, 8, 255, 255, 24, 255, -1, 0, 1, 4865, 7, 0, 0, 7, 0, 0, 0, 2048, 0, 0, 2, 255, 255, 255, 0, 0, 0, 1, 1, 1, 1, 2, 8, 8, 7, 3, 2, 3, 1, 0, 0, 3, 8, 2, 1, 1, 1, 0, 0};
    public int mo;
    public final HashMap<String, _bJ> mm;
    public static int mi;
    public int mn;
    public int mp;
    public final _aq_0[] ml;
    public int mk = pd[3];
    public final Font mj;
    public static final ArrayList<_bD> mh;

    public int getStringWidth(String string) {
        int n = pd[51];
        char[] cArray = string.toCharArray();
        int n2 = cArray.length;
        for (int i = pd[52]; i < n2; ++i) {
            _aq_0 _aq_02;
            int n3;
            int n4 = cArray[i];
            int n5 = n3 = n4 < this.ml.length ? n4 : pd[53];
            if (this.ml.length <= n3 || (_aq_02 = this.ml[n3]) == null) continue;
            n += _aq_0.access$000(_aq_02) - pd[54];
        }
        return n / pd[55];
    }

    public void drawChar(_aq_0 _aq_02, float f, float f2) {
        float f3 = _aq_0.access$000(_aq_02);
        float f4 = _aq_0.access$100(_aq_02);
        float f5 = _aq_0.access$200(_aq_02);
        float f6 = _aq_0.access$300(_aq_02);
        float f7 = f5 / (float)this.mo;
        float f8 = f6 / (float)this.mp;
        float f9 = f3 / (float)this.mo;
        float f10 = f4 / (float)this.mp;
        GL11.glTexCoord2f((float)f7, (float)f8);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glTexCoord2f((float)f7, (float)(f8 + f10));
        GL11.glVertex2f((float)f, (float)(f2 + f4));
        GL11.glTexCoord2f((float)(f7 + f9), (float)(f8 + f10));
        GL11.glVertex2f((float)(f + f3), (float)(f2 + f4));
        GL11.glTexCoord2f((float)(f7 + f9), (float)f8);
        GL11.glVertex2f((float)(f + f3), (float)f2);
    }

    public void drawString(String string, double d, double d2, int n) {
        GlStateManager.pushMatrix();
        GlStateManager.scale((double)0.25, (double)0.25, (double)0.25);
        GL11.glTranslated((double)(d * 2.0), (double)(d2 * 2.0 - 2.0), (double)0.0);
        GlStateManager.bindTexture((int)this.mn);
        float f = (float)(n >> pd[11] & pd[12]) / 255.0f;
        float f2 = (float)(n >> pd[13] & pd[14]) / 255.0f;
        float f3 = (float)(n & pd[15]) / 255.0f;
        float f4 = (float)(n >> pd[16] & pd[17]) / 255.0f;
        GlStateManager.color((float)f, (float)f2, (float)f3, (float)f4);
        double d3 = 0.0;
        _bJ _bJ2 = this.mm.get(string);
        if (_bJ2 != null) {
            GL11.glCallList((int)_bJ2.getDisplayList());
            _bJ2.setLastUsage(System.currentTimeMillis());
            GlStateManager.popMatrix();
            return;
        }
        int n2 = pd[18];
        int n3 = pd[19];
        if (n3 != 0) {
            n2 = GL11.glGenLists((int)pd[20]);
            GL11.glNewList((int)n2, (int)pd[21]);
        }
        GL11.glBegin((int)pd[22]);
        char[] cArray = string.toCharArray();
        int n4 = cArray.length;
        for (int i = pd[23]; i < n4; ++i) {
            _aq_0 _aq_02;
            char c = cArray[i];
            if (Character.getNumericValue(c) >= this.ml.length) {
                GL11.glEnd();
                GlStateManager.scale((double)4.0, (double)4.0, (double)4.0);
                _bD.pb.fontRenderer.drawString(String.valueOf(c), (float)d3 * 0.25f + 1.0f, 2.0f, n, pd[24]);
                d3 += (double)_bD.pb.fontRenderer.getStringWidth(String.valueOf(c)) * 4.0;
                GlStateManager.scale((double)0.25, (double)0.25, (double)0.25);
                GlStateManager.bindTexture((int)this.mn);
                GlStateManager.color((float)f, (float)f2, (float)f3, (float)f4);
                GL11.glBegin((int)pd[25]);
                continue;
            }
            if (this.ml.length <= c || (_aq_02 = this.ml[c]) == null) continue;
            this.drawChar(_aq_02, (float)d3, 0.0f);
            d3 += (double)_aq_0.access$000(_aq_02) - 8.0;
        }
        GL11.glEnd();
        if (n3 != 0) {
            this.mm.put(string, new _bJ(n2, System.currentTimeMillis()));
            GL11.glEndList();
        }
        GlStateManager.popMatrix();
    }

    public void renderBitmap(int n, int n2) {
        Object object;
        BufferedImage[] bufferedImageArray = new BufferedImage[n2];
        int n3 = pd[26];
        int n4 = pd[27];
        int n5 = pd[28];
        for (int i = n; i < n2; ++i) {
            object = this.drawCharToImage((char)i);
            _aq_0 _aq_02 = new _aq_0(n4, n5, ((BufferedImage)object).getWidth(), ((BufferedImage)object).getHeight());
            if (_aq_0.access$100(_aq_02) > this.mk) {
                this.mk = _aq_0.access$100(_aq_02);
            }
            if (_aq_0.access$100(_aq_02) > n3) {
                n3 = _aq_0.access$100(_aq_02);
            }
            if (this.ml.length <= i) continue;
            this.ml[i] = _aq_02;
            bufferedImageArray[i] = object;
            if ((n4 += _aq_0.access$000(_aq_02)) <= pd[29]) continue;
            if (n4 > this.mo) {
                this.mo = n4;
            }
            n4 = pd[30];
            n5 += n3;
            n3 = pd[31];
        }
        this.mp = n5 + n3;
        BufferedImage bufferedImage = new BufferedImage(this.mo, this.mp, pd[32]);
        object = (Graphics2D)bufferedImage.getGraphics();
        ((Graphics)object).setFont(this.mj);
        ((Graphics)object).setColor(new Color(pd[33], pd[34], pd[35], pd[36]));
        ((Graphics)object).fillRect(pd[37], pd[38], this.mo, this.mp);
        ((Graphics)object).setColor(Color.WHITE);
        for (int i = n; i < n2; ++i) {
            if (bufferedImageArray[i] == null || this.ml[i] == null) continue;
            ((Graphics)object).drawImage(bufferedImageArray[i], _aq_0.access$200(this.ml[i]), _aq_0.access$300(this.ml[i]), null);
        }
        this.mn = TextureUtil.uploadTextureImageAllocate((int)TextureUtil.glGenTextures(), (BufferedImage)bufferedImage, (boolean)pd[39], (boolean)pd[40]);
    }

    public static void garbageCollectionTick() {
        int n = mi;
        mi = n + pd[0];
        if (n > pd[1]) {
            mh.forEach(_bD::collectGarbage);
            mi = pd[2];
        }
    }

    public _bD(Font font) {
        this(font, pd[7], pd[8]);
    }

    public int getHeight() {
        return (this.mk - pd[9]) / pd[10];
    }

    public BufferedImage drawCharToImage(char c) {
        int n;
        Graphics2D graphics2D = (Graphics2D)new BufferedImage(pd[41], pd[42], pd[43]).getGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.setFont(this.mj);
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n2 = fontMetrics.charWidth(c) + pd[44];
        if (n2 <= pd[45]) {
            n2 = pd[46];
        }
        if ((n = fontMetrics.getHeight() + pd[47]) <= 0) {
            n = this.mj.getSize();
        }
        BufferedImage bufferedImage = new BufferedImage(n2, n, pd[48]);
        Graphics2D graphics2D2 = (Graphics2D)bufferedImage.getGraphics();
        graphics2D2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D2.setFont(this.mj);
        graphics2D2.setColor(Color.WHITE);
        graphics2D2.drawString(String.valueOf(c), pd[49], pd[50] + fontMetrics.getAscent());
        return bufferedImage;
    }

    public _bD(Font font, int n, int n2) {
        this.mm = new HashMap();
        this.mn = pd[4];
        this.mo = pd[5];
        this.mp = pd[6];
        this.mj = font;
        this.ml = new _aq_0[n2];
        this.renderBitmap(n, n2);
        mh.add(this);
    }

    public void collectGarbage() {
        long l = System.currentTimeMillis();
        this.mm.entrySet().stream().filter(entry -> l - ((_bJ)entry.getValue()).getLastUsage() > 30000L ? pd[58] : pd[59]).forEach(entry -> {
            GL11.glDeleteLists((int)((_bJ)entry.getValue()).getDisplayList(), (int)pd[56]);
            ((_bJ)entry.getValue()).setDeleted(pd[57]);
            this.mm.remove(entry.getKey());
        });
    }

    public Font getFont() {
        return this.mj;
    }

    static {
        mh = new ArrayList();
        mi = pd[60];
    }
}

