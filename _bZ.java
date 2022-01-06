//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.renderer.BufferBuilder
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.client.renderer.RenderItem
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.renderer.vertex.DefaultVertexFormats
 *  net.minecraft.inventory.ItemStackHelper
 *  net.minecraft.item.ItemShulkerBox
 *  net.minecraft.item.ItemStack
 *  net.minecraft.nbt.NBTTagCompound
 *  net.minecraft.util.NonNullList
 *  net.minecraft.util.math.MathHelper
 *  org.lwjgl.opengl.GL11
 */
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemShulkerBox;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class _bZ
extends _bA {
    public static RenderItem ou;
    public static final String[] ov;
    public static final int[] pd;

    public _bZ() {
        super(ov[pd[0]], ov[pd[1]], _aL.hz);
    }

    public static void draw(BufferBuilder bufferBuilder, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        bufferBuilder.begin(pd[28], DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos((double)(n + pd[29]), (double)(n2 + pd[30]), 0.0).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos((double)(n + pd[31]), (double)(n2 + n4), 0.0).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos((double)(n + n3), (double)(n2 + n4), 0.0).color(n5, n6, n7, n8).endVertex();
        bufferBuilder.pos((double)(n + n3), (double)(n2 + pd[32]), 0.0).color(n5, n6, n7, n8).endVertex();
        Tessellator.getInstance().draw();
    }

    public static void previewHook(ItemStack itemStack, int n, int n2, CallbackInfo callbackInfo) {
        NBTTagCompound nBTTagCompound;
        NBTTagCompound nBTTagCompound2;
        if (itemStack.getItem() instanceof ItemShulkerBox && (nBTTagCompound2 = itemStack.getTagCompound()) != null && nBTTagCompound2.hasKey(ov[pd[2]], pd[3]) && (nBTTagCompound = nBTTagCompound2.getCompoundTag(ov[pd[4]])).hasKey(ov[pd[5]], pd[6])) {
            callbackInfo.cancel();
            NonNullList nonNullList = NonNullList.withSize((int)pd[7], (Object)ItemStack.EMPTY);
            ItemStackHelper.loadAllItems((NBTTagCompound)nBTTagCompound, (NonNullList)nonNullList);
            GlStateManager.enableBlend();
            GlStateManager.disableRescaleNormal();
            RenderHelper.disableStandardItemLighting();
            GlStateManager.disableLighting();
            GlStateManager.disableDepth();
            int n3 = n + pd[8];
            int n4 = n2 - pd[9];
            _bZ.ou.zLevel = 300.0f;
            GL11.glPushMatrix();
            _as_0.fA.blur(n3, n4 - pd[10], 162.0, 67.0, pd[11]);
            GL11.glPopMatrix();
            Gui.drawRect((int)n3, (int)n4, (int)(n3 + pd[12]), (int)(n4 + pd[13]), (int)pd[14]);
            _ah_0.drawRoundedOutline(n3, n4, 162.0, 66.0, 1.0, 2.0, _ck_0.pz);
            _ah_0.drawRect(n3, n4 + pd[15], n3 + pd[16], n4 + pd[17], _ck_0.pz);
            _h_0.drawStringWithShadow(itemStack.getDisplayName(), n3 + pd[18], (float)n4 + 0.5f, pd[19]);
            GlStateManager.enableBlend();
            GlStateManager.enableAlpha();
            GlStateManager.enableTexture2D();
            GlStateManager.enableLighting();
            GlStateManager.enableDepth();
            RenderHelper.enableGUIStandardItemLighting();
            for (int i = pd[20]; i < nonNullList.size(); ++i) {
                int n5 = n + pd[21] + i % pd[22] * pd[23];
                int n6 = n2 + pd[24] + (i / pd[25] - pd[26]) * pd[27];
                ItemStack itemStack2 = (ItemStack)nonNullList.get(i);
                ou.renderItemAndEffectIntoGUI(itemStack2, n5, n6);
                _bZ.renderItemOverlayIntoGUI(_cX.te, itemStack2, n5, n6, null);
            }
            RenderHelper.disableStandardItemLighting();
            _bZ.ou.zLevel = 0.0f;
            GlStateManager.enableLighting();
            GlStateManager.enableDepth();
            RenderHelper.enableStandardItemLighting();
            GlStateManager.enableRescaleNormal();
        }
    }

    static {
        pd = new int[]{0, 1, 2, 10, 3, 4, 9, 27, 4, 30, 1, 3, 162, 13, -1879048192, 12, 162, 13, 2, -1, 0, 5, 9, 18, 1, 9, 1, 18, 7, 0, 0, 0, 0, 1, 16, 16, 0xFFFFFF, 2, 13, 13, 2, 0, 0, 0, 255, 2, 13, 1, 16, 255, 8, 255, 255, 255, 16, 255, 255, 255, 127, 5, 0, 1, 2, 3, 4};
        String[] stringArray = new String[pd[59]];
        stringArray[_bZ.pd[60]] = "ShulkerPreview";
        stringArray[_bZ.pd[61]] = "shows whats in shulkers";
        stringArray[_bZ.pd[62]] = "BlockEntityTag";
        stringArray[_bZ.pd[63]] = "BlockEntityTag";
        stringArray[_bZ.pd[64]] = "Items";
        ov = stringArray;
        ou = Minecraft.getMinecraft().getRenderItem();
    }

    public static void renderItemOverlayIntoGUI(FontRenderer fontRenderer, ItemStack itemStack, int n, int n2, @Nullable String string) {
        if (!itemStack.isEmpty()) {
            float f;
            String string2;
            if (itemStack.getCount() != pd[33] || string != null) {
                string2 = string == null ? String.valueOf(itemStack.getCount()) : string;
                GlStateManager.disableLighting();
                GlStateManager.disableDepth();
                GlStateManager.disableBlend();
                _cK.rZ.drawStringWithShadow(string2, n + pd[34] - _cK.rZ.getStringWidth(string2), n2 + pd[35] - _cK.rZ.getHeight(), pd[36]);
                GlStateManager.enableLighting();
                GlStateManager.enableDepth();
                GlStateManager.enableBlend();
            }
            if (itemStack.getItem().showDurabilityBar(itemStack)) {
                GlStateManager.disableLighting();
                GlStateManager.disableDepth();
                GlStateManager.disableTexture2D();
                GlStateManager.disableAlpha();
                GlStateManager.disableBlend();
                string2 = Tessellator.getInstance();
                BufferBuilder bufferBuilder = string2.getBuffer();
                double d = itemStack.getItem().getDurabilityForDisplay(itemStack);
                int n3 = itemStack.getItem().getRGBDurabilityForDisplay(itemStack);
                int n4 = Math.round(13.0f - (float)d * 13.0f);
                _bZ.draw(bufferBuilder, n + pd[37], n2 + pd[38], pd[39], pd[40], pd[41], pd[42], pd[43], pd[44]);
                _bZ.draw(bufferBuilder, n + pd[45], n2 + pd[46], n4, pd[47], n3 >> pd[48] & pd[49], n3 >> pd[50] & pd[51], n3 & pd[52], pd[53]);
                GlStateManager.enableBlend();
                GlStateManager.enableAlpha();
                GlStateManager.enableTexture2D();
                GlStateManager.enableLighting();
                GlStateManager.enableDepth();
            }
            float f2 = f = (string2 = Minecraft.getMinecraft().player) == null ? 0.0f : string2.getCooldownTracker().getCooldown(itemStack.getItem(), Minecraft.getMinecraft().getRenderPartialTicks());
            if (f > 0.0f) {
                GlStateManager.disableLighting();
                GlStateManager.disableDepth();
                GlStateManager.disableTexture2D();
                Tessellator tessellator = Tessellator.getInstance();
                BufferBuilder bufferBuilder = tessellator.getBuffer();
                _bZ.draw(bufferBuilder, n, n2 + MathHelper.floor((float)(16.0f * (1.0f - f))), pd[54], MathHelper.ceil((float)(16.0f * f)), pd[55], pd[56], pd[57], pd[58]);
                GlStateManager.enableTexture2D();
                GlStateManager.enableLighting();
                GlStateManager.enableDepth();
            }
        }
    }
}

