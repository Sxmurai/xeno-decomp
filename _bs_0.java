//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiMainMenu
 *  net.minecraft.client.gui.GuiMultiplayer
 *  net.minecraft.client.gui.GuiOptions
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiWorldSelection
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiWorldSelection;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _bs
 */
public class _bs_0
extends GuiScreen {
    public static final String[] lf;
    public static final int[] lg;

    public void mouseClicked(int n, int n2, int n3) throws IOException {
        ScaledResolution scaledResolution = new ScaledResolution(this.mc);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(lf[lg[65]]);
        arrayList.add(lf[lg[66]]);
        arrayList.add(lf[lg[67]]);
        arrayList.add(lf[lg[68]]);
        int n4 = lg[69];
        for (String object : arrayList) {
            n4 += _cX.tf.getStringWidth(object) + lg[70];
        }
        if (n3 == 0) {
            int n5;
            int n6;
            int n7;
            int n8 = scaledResolution.getScaledWidth() / lg[71] - n4 / lg[72];
            for (String n72 : arrayList) {
                if (_cp_0.mouseOver(n8, scaledResolution.getScaledHeight() / lg[73], n8 + _cX.tf.getStringWidth(n72) + lg[74], scaledResolution.getScaledHeight() / lg[75] + _cX.tf.getHeight(), n, n2)) {
                    if (n72 == lf[lg[76]]) {
                        this.mc.displayGuiScreen((GuiScreen)new GuiWorldSelection((GuiScreen)this));
                    } else if (n72 == lf[lg[77]]) {
                        this.mc.displayGuiScreen((GuiScreen)new GuiMultiplayer((GuiScreen)this));
                    } else if (n72 == lf[lg[78]]) {
                        this.mc.displayGuiScreen((GuiScreen)new GuiOptions((GuiScreen)this, this.mc.gameSettings));
                    } else if (n72 == lf[lg[79]]) {
                        this.mc.shutdown();
                    }
                }
                n8 += _cX.tf.getStringWidth(n72) + lg[80];
            }
            int n9 = scaledResolution.getScaledWidth() / lg[81] - _cX.tf.getStringWidth(lf[lg[82]]) - lg[83];
            if (_cp_0.mouseOver(n9, n7 = scaledResolution.getScaledHeight() / lg[84] - lg[85], n6 = n9 + _cX.tf.getStringWidth(lf[lg[86]]) * lg[87] + lg[88], n5 = n7 + lg[89], n, n2) && n3 == 0) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI(lf[lg[90]]));
                }
                catch (URISyntaxException uRISyntaxException) {
                    // empty catch block
                }
            }
            if (_cp_0.mouseOver(0.0, 0.0, 30.0, 15.0, n, n2)) {
                this.mc.displayGuiScreen((GuiScreen)new GuiMainMenu());
                _cp_0.qa = lg[91];
                _as_0.fG.saveMisc();
            }
        }
        super.mouseClicked(n, n2, n3);
    }

    public void keyTyped(char c, int n) throws IOException {
    }

    static {
        lg = new int[]{0, 2, 1, 5, 2, 55, 2, 2, 5, 40, 3, 4, 5, 1, 1, 5, -1879048192, 5, 0, -1, 6, 4, 4, 25, 0, -1, 7, 8, 9, 10, 0, 20, 2, 2, 2, 2, 19, 2, 0, -1, 20, 2, 100, 2, 105, -1879048192, 11, 2, 95, 2, 100, -1, 1, 12, 2, 95, 2, 86, -1, 13, 2, 95, 2, 72, -1, 14, 15, 16, 17, 0, 20, 2, 2, 2, 20, 2, 18, 19, 20, 21, 19, 2, 22, 5, 2, 55, 23, 2, 5, 40, 24, 0, 25, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        String[] stringArray = new String[lg[92]];
        stringArray[_bs_0.lg[93]] = "In Main Menu";
        stringArray[_bs_0.lg[94]] = "Xeno Client";
        stringArray[_bs_0.lg[95]] = "Xeno Client";
        stringArray[_bs_0.lg[96]] = "xeno";
        stringArray[_bs_0.lg[97]] = "textures/background1.png";
        stringArray[_bs_0.lg[98]] = "MC";
        stringArray[_bs_0.lg[99]] = "Xeno Client";
        stringArray[_bs_0.lg[100]] = "Singleplayer";
        stringArray[_bs_0.lg[101]] = "Multiplayer";
        stringArray[_bs_0.lg[102]] = "Settings";
        stringArray[_bs_0.lg[103]] = "Quit";
        stringArray[_bs_0.lg[104]] = "Authors";
        stringArray[_bs_0.lg[105]] = "Wolfsurge, Mathew101Q, q3m";
        stringArray[_bs_0.lg[106]] = "SoldierMC, GameFighterIron";
        stringArray[_bs_0.lg[107]] = "Singleplayer";
        stringArray[_bs_0.lg[108]] = "Multiplayer";
        stringArray[_bs_0.lg[109]] = "Settings";
        stringArray[_bs_0.lg[110]] = "Quit";
        stringArray[_bs_0.lg[111]] = "Singleplayer";
        stringArray[_bs_0.lg[112]] = "Multiplayer";
        stringArray[_bs_0.lg[113]] = "Settings";
        stringArray[_bs_0.lg[114]] = "Quit";
        stringArray[_bs_0.lg[115]] = "Xeno Client";
        stringArray[_bs_0.lg[116]] = "Xeno Client";
        stringArray[_bs_0.lg[117]] = "https://discord.gg/YPeVBdZMQA";
        lf = stringArray;
    }

    public void actionPerformed(GuiButton guiButton) throws IOException {
        super.actionPerformed(guiButton);
    }

    public void drawScreen(int n, int n2, float f) {
        _ap_0.update(lf[lg[0]]);
        ScaledResolution scaledResolution = new ScaledResolution(this.mc);
        int n3 = scaledResolution.getScaledWidth() / lg[1] - _cX.tf.getStringWidth(lf[lg[2]]) - lg[3];
        int n4 = scaledResolution.getScaledHeight() / lg[4] - lg[5];
        int n5 = n3 + _cX.tf.getStringWidth(lf[lg[6]]) * lg[7] + lg[8];
        int n6 = n4 + lg[9];
        ResourceLocation resourceLocation = new ResourceLocation(lf[lg[10]], lf[lg[11]]);
        this.mc.getTextureManager().bindTexture(resourceLocation);
        _ah_0.drawModalRectWithCustomSizedTexture(0.0, 0.0, 0.0f, 0.0f, this.width, this.height, this.width, this.height);
        _as_0.fA.blur(lg[12]);
        _ah_0.drawRoundedRect(0.0, 0.0, 30.0, 15.0, lg[13], lg[14], lg[15], 1.0, lg[16]);
        _cX.te.drawStringWithShadow(lf[lg[17]], 3.0f, 3.0f, _cp_0.mouseOver(0.0, 0.0, 30.0, 15.0, n, n2) ? _M.rainbowWave(4.0f, 1.0f, 1.0f, lg[18]) : lg[19]);
        GL11.glPushMatrix();
        GlStateManager.scale((float)2.0f, (float)2.0f, (float)0.0f);
        this.drawCenteredString(_cX.tg, ChatFormatting.UNDERLINE + lf[lg[20]], scaledResolution.getScaledWidth() / lg[21], scaledResolution.getScaledHeight() / lg[22] - lg[23], _cp_0.mouseOver(n3, n4, n5, n6, n, n2) ? _M.rainbowWave(6.0f, 0.5f, 1.0f, lg[24]) : lg[25]);
        GL11.glPopMatrix();
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(lf[lg[26]]);
        arrayList.add(lf[lg[27]]);
        arrayList.add(lf[lg[28]]);
        arrayList.add(lf[lg[29]]);
        int n7 = lg[30];
        for (String object : arrayList) {
            n7 += _cX.tf.getStringWidth(object) + lg[31];
        }
        int n8 = scaledResolution.getScaledWidth() / lg[32] - n7 / lg[33];
        for (String string : arrayList) {
            _cX.tf.drawStringWithShadow(string, n8, scaledResolution.getScaledHeight() / lg[34], _cp_0.mouseOver(n8, scaledResolution.getScaledHeight() / lg[35], n8 + _cX.tf.getStringWidth(string) + lg[36], scaledResolution.getScaledHeight() / lg[37] + _cX.tf.getHeight(), n, n2) ? _M.rainbowWave(4.0f, 1.0f, 1.0f, lg[38]) : lg[39]);
            n8 += _cX.tf.getStringWidth(string) + lg[40];
        }
        if (_cp_0.mouseOver(n3, n4, n5, n6, n, n2)) {
            _ah_0.drawRoundedRect(scaledResolution.getScaledWidth() / lg[41] - lg[42], scaledResolution.getScaledHeight() / lg[43] - lg[44], 200.0, 45.0, 5.0, lg[45]);
            _cX.te.drawRainbowStringWithShadow(lf[lg[46]], scaledResolution.getScaledWidth() / lg[47] - lg[48], scaledResolution.getScaledHeight() / lg[49] - lg[50], lg[51], 4.0f, 1.0f, lg[52]);
            _cX.te.drawStringWithShadow(lf[lg[53]], scaledResolution.getScaledWidth() / lg[54] - lg[55], scaledResolution.getScaledHeight() / lg[56] - lg[57], lg[58]);
            _cX.te.drawStringWithShadow(lf[lg[59]], scaledResolution.getScaledWidth() / lg[60] - lg[61], scaledResolution.getScaledHeight() / lg[62] - lg[63], lg[64]);
        }
        super.drawScreen(n, n2, f);
    }

    public void onGuiClosed() {
        super.onGuiClosed();
    }
}

