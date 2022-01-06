//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.network.NetworkPlayerInfo
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.culling.ICamera
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.ItemArmor
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemSword
 *  net.minecraft.item.ItemTool
 *  net.minecraft.nbt.NBTTagList
 *  net.minecraft.util.math.MathHelper
 *  org.lwjgl.opengl.GL11
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class _T
extends _bA {
    public _k_0 cj;
    public _cJ cn;
    public _k_0 cq;
    public _cJ cp;
    public _cA cu;
    public _k_0 ci;
    public _cJ cr;
    public _k_0 ck;
    public _cJ co;
    public boolean cw;
    public final ICamera cv;
    public _cJ cl;
    public _cA cs;
    public _cJ cm;
    public static final int[] pd = new int[]{0, 1, 2, 1, 3, 0, 4, 1, 5, 0, 6, 7, 8, 9, 10, 11, 1, 12, 13, 255, 120, 0, 200, 14, 0, 128, 255, 255, 15, 255, 0, 0, 255, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 16, 17, 0, 0, 1, 18, 19, 20, 21, 22, 23, 24, 167, 25, 167, 26, 27, 1, 0, 2, 2, 0, 2896, 1, 2929, 3042, 770, 771, 2, 1, 2, 1, -1, 2, 2, 1, 2, 1, -1879048192, 2, 1, 2, 1, -6, 0, 8, 8, 5, 4, 0, -7, 1, 1, 3, -7, 0, -7, 0, -6, 0, 8, 5, 4, 0, 3, 100, 28, 2, 4, 29, 2, 4, 1, 256, 2, 15, 2, 15, 22, 1, 100, 30, 2, 4, 10, 31, 2, 4, 10, 0, 32, 33, 1, 0, 3, 0, 2, 0, 1, 1, 2, 3, -1, 2, 3, -1, 2, 1, 0, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 0xFFFFFF, 24, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52};
    public _k_0 ch = new _k_0(lQ[pd[2]], pd[3]);
    public static final String[] lQ;
    public _cA ct;

    public static int changeAlpha(int n, int n2) {
        return n2 << pd[167] | (n &= pd[166]);
    }

    public boolean isMaxEnchants(ItemStack itemStack) {
        return itemStack.getEnchantmentTagList().tagCount() > pd[153] ? pd[154] : pd[155];
    }

    public void renderNametag(EntityPlayer entityPlayer, double d, double d2, double d3) {
        this.cw = pd[49];
        GlStateManager.pushMatrix();
        FontRenderer fontRenderer = this.pb.fontRenderer;
        NetworkPlayerInfo networkPlayerInfo = this.pb.player.connection.getPlayerInfo(entityPlayer.getGameProfile().getId());
        boolean bl = _bn_0.isFriend(entityPlayer.getName());
        int n = _bn_0.isFriend(entityPlayer.getName()) ? pd[50] : pd[51];
        String string = ((bl || n != 0) && entityPlayer.isSneaking() ? lQ[pd[52]] : lQ[pd[53]]) + (bl ? ChatFormatting.AQUA : (n != 0 ? ChatFormatting.RED : lQ[pd[54]])) + entityPlayer.getName() + ChatFormatting.RESET + (this.ci.getValue() ? lQ[pd[55]] + this.getShortGamemode(networkPlayerInfo.getGameType().getName()) + lQ[pd[56]] : lQ[pd[57]]) + lQ[pd[58]] + pd[59] + this.getPing(networkPlayerInfo.getResponseTime()) + networkPlayerInfo.getResponseTime() + lQ[pd[60]] + pd[61] + this.getHealth(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount()) + MathHelper.ceil((float)(entityPlayer.getHealth() + entityPlayer.getAbsorptionAmount()));
        string = string.replace(lQ[pd[62]], lQ[pd[63]]);
        float f = this.pb.player.getDistance((Entity)entityPlayer);
        float f2 = (float)((f / 5.0f <= 2.0f ? 2.0 : (double)(f / 5.0f) * (this.cn.getDoubleValue() * 10.0 + 1.0)) * 2.5 * (this.cn.getDoubleValue() / 10.0));
        int n2 = f / 5.0f > 2.0f ? pd[64] : pd[65];
        GL11.glTranslated((double)((float)d), (double)((double)((float)d2) + this.co.getDoubleValue() - (entityPlayer.isSneaking() ? 0.4 : 0.0) + (n2 != 0 ? (double)(f / 12.0f) - 0.7 : 0.25)), (double)((float)d3));
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-this.pb.renderManager.playerViewY), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)this.pb.renderManager.playerViewX, (float)(this.pb.gameSettings.thirdPersonView == pd[66] ? -1.0f : 1.0f), (float)0.0f, (float)0.0f);
        GL11.glScalef((float)(-f2), (float)(-f2), (float)f2);
        int[] nArray = new int[pd[67]];
        nArray[_T.pd[68]] = pd[69];
        nArray[_T.pd[70]] = pd[71];
        _a_0.disableGlCap(nArray);
        _a_0.enableGlCap(pd[72]);
        GL11.glBlendFunc((int)pd[73], (int)pd[74]);
        int n3 = this.ch.getValue() ? _cX.te.getStringWidth(string) / pd[75] + pd[76] : fontRenderer.getStringWidth(string) / pd[77] + pd[78];
        int n4 = Color.BLACK.getRGB();
        int n5 = pd[79];
        if (bl) {
            n5 = this.ct.getColor().getRGB();
        } else if (n != 0) {
            n5 = this.cu.getColor().getRGB();
        }
        int n6 = (this.ch.isEnabled() ? _cX.te.getHeight() : this.pb.fontRenderer.FONT_HEIGHT) + pd[80];
        _ah_0.drawRoundedRect(-n3 - pd[81], 0.0, (n3 + pd[82]) * pd[83], n6 + pd[84], 5.0, pd[85]);
        if (this.cq.isEnabled()) {
            _ah_0.drawRoundedOutline(-n3 - pd[86], 0.0, (n3 + pd[87]) * pd[88], n6 + pd[89], 5.0, this.cr.getDoubleValue(), n5);
        }
        if (this.ch.getValue()) {
            _cX.te.drawStringWithShadow(string, -n3, 3.0f + (float)this.cp.getDoubleValue(), this.cs.getColor().getRGB());
        } else {
            this.pb.fontRenderer.drawStringWithShadow(string, (float)(-n3), 2.0f + (float)this.cp.getDoubleValue(), this.cs.getColor().getRGB());
        }
        if (this.cj.getValue()) {
            int n7 = pd[90];
            int n8 = pd[91];
            for (ItemStack itemStack : entityPlayer.inventory.armorInventory) {
                if (itemStack == null) continue;
                n7 -= 8;
                if (itemStack.getItem() == Items.AIR) continue;
                ++n8;
            }
            if (entityPlayer.getHeldItemOffhand().getItem() != Items.AIR) {
                ++n8;
            }
            int n9 = n7 - pd[92];
            n7 += pd[93] * (pd[94] - n8) - (n8 == 0 ? pd[95] : pd[96]);
            if (entityPlayer.getHeldItemMainhand().getItem() != Items.AIR) {
                ItemStack itemStack;
                itemStack = entityPlayer.getHeldItemMainhand().copy();
                this.renderItem(entityPlayer, itemStack, n7 -= 8, pd[97], n9, pd[98]);
                n7 += 16;
            } else {
                this.cw = pd[99];
            }
            for (int i = pd[100]; i >= 0; --i) {
                ItemStack itemStack = (ItemStack)entityPlayer.inventory.armorInventory.get(i);
                if (itemStack.getItem() == Items.AIR) continue;
                ItemStack itemStack2 = itemStack.copy();
                this.renderItem(entityPlayer, itemStack2, n7, pd[101], n9, pd[102]);
                n7 += 16;
            }
            if (entityPlayer.getHeldItemOffhand().getItem() != Items.AIR) {
                ItemStack itemStack = entityPlayer.getHeldItemOffhand().copy();
                this.renderItem(entityPlayer, itemStack, n7, pd[103], n9, pd[104]);
            }
            GlStateManager.enableAlpha();
            GlStateManager.disableBlend();
            GlStateManager.enableTexture2D();
        } else if (this.cj.getValue()) {
            int n10 = pd[105];
            int n11 = pd[106];
            for (ItemStack itemStack : entityPlayer.inventory.armorInventory) {
                if (itemStack == null) continue;
                n10 -= 8;
                if (itemStack.getItem() == Items.AIR) continue;
                ++n11;
            }
            if (entityPlayer.getHeldItemOffhand().getItem() != Items.AIR) {
                ++n11;
            }
            n10 += pd[107] * (pd[108] - n11) - (n11 == 0 ? pd[109] : pd[110]);
            for (int i = pd[111]; i >= 0; --i) {
                ItemStack itemStack;
                itemStack = (ItemStack)entityPlayer.inventory.armorInventory.get(i);
                if (itemStack.getItem() == Items.AIR) continue;
                ItemStack itemStack3 = itemStack.copy();
                this.renderDurabilityText(itemStack3, n10);
                n10 += 16;
            }
            GlStateManager.enableAlpha();
            GlStateManager.disableBlend();
            GlStateManager.enableTexture2D();
        }
        GlStateManager.disableDepth();
        GlStateManager.enableDepth();
        _a_0.reset();
        GlStateManager.resetColor();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    public void renderDurabilityText(ItemStack itemStack, int n) {
        if (itemStack.getItem() instanceof ItemArmor || itemStack.getItem() instanceof ItemSword || itemStack.getItem() instanceof ItemTool) {
            float f = ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
            float f2 = 1.0f - f;
            int n2 = pd[112] - (int)(f2 * 100.0f);
            if (this.ch.getValue()) {
                _cX.te.drawStringWithShadow(n2 + lQ[pd[113]], n * pd[114] + pd[115], -17.0f, new Color(f2, f, 0.0f).getRGB());
            } else {
                this.pb.fontRenderer.drawStringWithShadow(n2 + lQ[pd[116]], (float)(n * pd[117] + pd[118]), -17.0f, new Color(f2, f, 0.0f).getRGB());
            }
        }
    }

    public String getPop(int n) {
        return lQ[pd[165]];
    }

    @Override
    public void onRenderWorld() {
        if (this.nullCheck()) {
            return;
        }
        double d = this.pb.player.lastTickPosX + (this.pb.player.posX - this.pb.player.lastTickPosX) * (double)this.pb.getRenderPartialTicks();
        double d2 = this.pb.player.lastTickPosY + (this.pb.player.posY - this.pb.player.lastTickPosY) * (double)this.pb.getRenderPartialTicks();
        double d3 = this.pb.player.lastTickPosZ + (this.pb.player.posZ - this.pb.player.lastTickPosZ) * (double)this.pb.getRenderPartialTicks();
        this.cv.setPosition(d, d2, d3);
        try {
            for (EntityPlayer entityPlayer : this.pb.world.playerEntities) {
                if (!entityPlayer.isEntityAlive() || entityPlayer == this.pb.getRenderViewEntity() || (double)entityPlayer.getDistance((Entity)this.pb.player) > this.cl.getDoubleValue() || !this.cv.isBoundingBoxInFrustum(entityPlayer.getEntityBoundingBox())) continue;
                NetworkPlayerInfo networkPlayerInfo = this.pb.player.connection.getPlayerInfo(entityPlayer.getGameProfile().getId());
                double d4 = entityPlayer.lastTickPosX + (entityPlayer.posX - entityPlayer.lastTickPosX) * (double)this.pb.timer.renderPartialTicks - this.pb.renderManager.renderPosX;
                double d5 = entityPlayer.lastTickPosY + (entityPlayer.posY - entityPlayer.lastTickPosY) * (double)this.pb.timer.renderPartialTicks - this.pb.renderManager.renderPosY;
                double d6 = entityPlayer.lastTickPosZ + (entityPlayer.posZ - entityPlayer.lastTickPosZ) * (double)this.pb.timer.renderPartialTicks - this.pb.renderManager.renderPosZ;
                if (this.getShortGamemode(networkPlayerInfo.getGameType().getName()).equalsIgnoreCase(lQ[pd[47]]) && !this.ck.getValue() || entityPlayer.getName().startsWith(lQ[pd[48]])) continue;
                this.renderNametag(entityPlayer, d4, d5, d6);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        GlStateManager.disableDepth();
        GlStateManager.enableDepth();
    }

    public void renderItem(EntityPlayer entityPlayer, ItemStack itemStack, int n, int n2, int n3, boolean bl) {
        GL11.glPushMatrix();
        GL11.glDepthMask((boolean)pd[119]);
        GlStateManager.clear((int)pd[120]);
        GlStateManager.disableDepth();
        GlStateManager.enableDepth();
        RenderHelper.enableStandardItemLighting();
        this.pb.getRenderItem().zLevel = -100.0f;
        GlStateManager.scale((float)1.0f, (float)1.0f, (float)0.01f);
        this.pb.getRenderItem().renderItemAndEffectIntoGUI(itemStack, n, n2 / pd[121] - pd[122]);
        if (this.cj.getValue()) {
            this.pb.getRenderItem().renderItemOverlays(this.pb.fontRenderer, itemStack, n, n2 / pd[123] - pd[124]);
        }
        this.pb.getRenderItem().zLevel = 0.0f;
        GlStateManager.scale((float)1.0f, (float)1.0f, (float)1.0f);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.enableAlpha();
        GlStateManager.disableBlend();
        GlStateManager.disableLighting();
        GlStateManager.scale((double)0.5, (double)0.5, (double)0.5);
        GlStateManager.disableDepth();
        this.renderEnchantText(entityPlayer, itemStack, n, n2 - pd[125]);
        if (!this.cw && bl) {
            if (this.ch.getValue()) {
                // empty if block
            }
            this.cw = pd[126];
        }
        GlStateManager.enableDepth();
        GlStateManager.scale((float)2.0f, (float)2.0f, (float)2.0f);
        GL11.glPopMatrix();
    }

    public String getHealth(float f) {
        if (f > 18.0f) {
            return lQ[pd[156]];
        }
        if (f > 16.0f) {
            return lQ[pd[157]];
        }
        if (f > 12.0f) {
            return lQ[pd[158]];
        }
        if (f > 8.0f) {
            return lQ[pd[159]];
        }
        if (f > 5.0f) {
            return lQ[pd[160]];
        }
        return lQ[pd[161]];
    }

    public String getPing(float f) {
        if (f > 200.0f) {
            return lQ[pd[162]];
        }
        if (f > 100.0f) {
            return lQ[pd[163]];
        }
        return lQ[pd[164]];
    }

    public _T() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hz);
        this.ci = new _k_0(lQ[pd[4]], pd[5]);
        this.cj = new _k_0(lQ[pd[6]], pd[7]);
        this.ck = new _k_0(lQ[pd[8]], pd[9]);
        this.cl = new _cJ(lQ[pd[10]], 250.0, 0.0, 500.0, 1.0);
        this.cm = new _cJ(lQ[pd[11]], 28.0, 0.0, 50.0, 1.0);
        this.cn = new _cJ(lQ[pd[12]], 0.05, 0.01, 0.1, 0.01);
        this.co = new _cJ(lQ[pd[13]], 2.5, 0.5, 5.0, 0.1);
        this.cp = new _cJ(lQ[pd[14]], 0.0, -5.0, 5.0, 1.0);
        this.cq = new _k_0(lQ[pd[15]], pd[16]);
        this.cr = new _cJ(lQ[pd[17]], 1.5, 0.1, 3.0, 0.1);
        this.cs = new _cA(lQ[pd[18]], new _cV(pd[19], pd[20], pd[21], pd[22]));
        this.ct = new _cA(lQ[pd[23]], new _cV(pd[24], pd[25], pd[26], pd[27]));
        this.cu = new _cA(lQ[pd[28]], new _cV(pd[29], pd[30], pd[31], pd[32]));
        this.cv = new Frustum();
        _bd_0[] _bd_0Array = new _bd_0[pd[33]];
        _bd_0Array[_T.pd[34]] = this.ch;
        _bd_0Array[_T.pd[35]] = this.ci;
        _bd_0Array[_T.pd[36]] = this.cj;
        _bd_0Array[_T.pd[37]] = this.ck;
        _bd_0Array[_T.pd[38]] = this.cl;
        _bd_0Array[_T.pd[39]] = this.cm;
        _bd_0Array[_T.pd[40]] = this.cn;
        _bd_0Array[_T.pd[41]] = this.co;
        _bd_0Array[_T.pd[42]] = this.cp;
        _bd_0Array[_T.pd[43]] = this.cq;
        _bd_0Array[_T.pd[44]] = this.cr;
        _bd_0Array[_T.pd[45]] = this.ct;
        _bd_0Array[_T.pd[46]] = this.cu;
        this.addSettings(_bd_0Array);
    }

    static {
        String[] stringArray = new String[pd[177]];
        stringArray[_T.pd[178]] = "Nametags";
        stringArray[_T.pd[179]] = "adds stuff above players nametags";
        stringArray[_T.pd[180]] = "Custom Font";
        stringArray[_T.pd[181]] = "Gamemode";
        stringArray[_T.pd[182]] = "Armour";
        stringArray[_T.pd[183]] = "Invisibles";
        stringArray[_T.pd[184]] = "Distance";
        stringArray[_T.pd[185]] = "Arrow Pos";
        stringArray[_T.pd[186]] = "Scale";
        stringArray[_T.pd[187]] = "Height";
        stringArray[_T.pd[188]] = "TextOffset";
        stringArray[_T.pd[189]] = "Outline";
        stringArray[_T.pd[190]] = "Width";
        stringArray[_T.pd[191]] = "Font Colour";
        stringArray[_T.pd[192]] = "Friend Colour";
        stringArray[_T.pd[193]] = "Enemy Colour";
        stringArray[_T.pd[194]] = "SP";
        stringArray[_T.pd[195]] = "Body #";
        stringArray[_T.pd[196]] = "\u00a79";
        stringArray[_T.pd[197]] = "\u00a7r";
        stringArray[_T.pd[198]] = "";
        stringArray[_T.pd[199]] = " [";
        stringArray[_T.pd[200]] = "]";
        stringArray[_T.pd[201]] = "";
        stringArray[_T.pd[202]] = " ";
        stringArray[_T.pd[203]] = "ms ";
        stringArray[_T.pd[204]] = ".0";
        stringArray[_T.pd[205]] = "";
        stringArray[_T.pd[206]] = "%";
        stringArray[_T.pd[207]] = "%";
        stringArray[_T.pd[208]] = "%";
        stringArray[_T.pd[209]] = "%";
        stringArray[_T.pd[210]] = "id";
        stringArray[_T.pd[211]] = "lvl";
        stringArray[_T.pd[212]] = "a";
        stringArray[_T.pd[213]] = "2";
        stringArray[_T.pd[214]] = "e";
        stringArray[_T.pd[215]] = "6";
        stringArray[_T.pd[216]] = "c";
        stringArray[_T.pd[217]] = "4";
        stringArray[_T.pd[218]] = "c";
        stringArray[_T.pd[219]] = "e";
        stringArray[_T.pd[220]] = "a";
        stringArray[_T.pd[221]] = "";
        stringArray[_T.pd[222]] = "survival";
        stringArray[_T.pd[223]] = "S";
        stringArray[_T.pd[224]] = "creative";
        stringArray[_T.pd[225]] = "C";
        stringArray[_T.pd[226]] = "adventure";
        stringArray[_T.pd[227]] = "A";
        stringArray[_T.pd[228]] = "spectator";
        stringArray[_T.pd[229]] = "SP";
        stringArray[_T.pd[230]] = "NONE";
        lQ = stringArray;
    }

    public String getShortGamemode(String string) {
        if (string.equalsIgnoreCase(lQ[pd[168]])) {
            return lQ[pd[169]];
        }
        if (string.equalsIgnoreCase(lQ[pd[170]])) {
            return lQ[pd[171]];
        }
        if (string.equalsIgnoreCase(lQ[pd[172]])) {
            return lQ[pd[173]];
        }
        if (string.equalsIgnoreCase(lQ[pd[174]])) {
            return lQ[pd[175]];
        }
        return lQ[pd[176]];
    }

    public void renderEnchantText(EntityPlayer entityPlayer, ItemStack itemStack, int n, int n2) {
        int n3;
        int n4 = n2;
        if ((itemStack.getItem() instanceof ItemArmor || itemStack.getItem() instanceof ItemSword || itemStack.getItem() instanceof ItemTool) && this.cj.getValue()) {
            float f = ((float)itemStack.getMaxDamage() - (float)itemStack.getItemDamage()) / (float)itemStack.getMaxDamage();
            float f2 = 1.0f - f;
            n3 = pd[127] - (int)(f2 * 100.0f);
            if (this.ch.getValue()) {
                _cX.te.drawStringWithShadow(n3 + lQ[pd[128]], n * pd[129] + pd[130], n2 - pd[131], new Color(f2, f, 0.0f).getRGB());
            } else {
                this.pb.fontRenderer.drawStringWithShadow(n3 + lQ[pd[132]], (float)(n * pd[133] + pd[134]), (float)(n2 - pd[135]), new Color(f2, f, 0.0f).getRGB());
            }
        }
        NBTTagList nBTTagList = itemStack.getEnchantmentTagList();
        for (int i = pd[136]; i < nBTTagList.tagCount(); ++i) {
            n3 = nBTTagList.getCompoundTagAt(i).getShort(lQ[pd[137]]);
            short s = nBTTagList.getCompoundTagAt(i).getShort(lQ[pd[138]]);
            Enchantment enchantment = Enchantment.getEnchantmentByID((int)n3);
            if (enchantment == null || enchantment.isCurse()) continue;
            String string = s == pd[139] ? enchantment.getTranslatedName((int)s).substring(pd[140], pd[141]).toLowerCase() : enchantment.getTranslatedName((int)s).substring(pd[142], pd[143]).toLowerCase() + s;
            string = string.substring(pd[144], pd[145]).toUpperCase() + string.substring(pd[146]);
            GL11.glPushMatrix();
            GL11.glScalef((float)1.0f, (float)1.0f, (float)0.0f);
            if (this.ch.getValue()) {
                _cX.te.drawStringWithShadow(string, n * pd[147] + pd[148], n4, pd[149]);
            } else {
                this.pb.fontRenderer.drawStringWithShadow(string, (float)(n * pd[150] + pd[151]), (float)n4, pd[152]);
            }
            GL11.glScalef((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
            n4 += 10;
        }
    }
}

