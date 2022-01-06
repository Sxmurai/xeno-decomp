//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.text.TextFormatting
 */
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextFormatting;

/*
 * Renamed from _s
 */
public class _s_0 {
    public static final String[] at;
    public Minecraft as = Minecraft.getMinecraft();
    public static final int[] au;

    public void call(_cF _cF2) {
        this.as.player.sendChatMessage(this.addPrefix(_cF2.rs, _cF2.ru) + _cF2.rt);
    }

    static {
        au = new int[]{0, 1, 2, 0, 1};
        String[] stringArray = new String[au[2]];
        stringArray[_s_0.au[3]] = "[";
        stringArray[_s_0.au[4]] = "] ";
        at = stringArray;
    }

    public String addPrefix(String string, _ch_0 _ch_02) {
        TextFormatting textFormatting = TextFormatting.GRAY;
        if (_ch_02 == _ch_0.pf) {
            textFormatting = TextFormatting.GREEN;
        } else if (_ch_02 == _ch_0.pg) {
            textFormatting = TextFormatting.GOLD;
        } else if (_ch_02 == _ch_0.ph) {
            textFormatting = TextFormatting.DARK_RED;
        }
        return TextFormatting.GRAY + at[au[0]] + textFormatting + string + TextFormatting.GRAY + at[au[1]] + TextFormatting.WHITE;
    }
}

