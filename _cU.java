//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentString
 */
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class _cU {
    public static final String[] sS;
    public static Minecraft sR;
    public static final int[] sT;

    public static void addChatMessage(String string) {
        string = sS[sT[0]] + _as_0.fv + sS[sT[1]] + string;
        Minecraft.getMinecraft().player.sendMessage((ITextComponent)new TextComponentString(string));
    }

    static {
        sT = new int[]{0, 1, 2, 0, 1};
        String[] stringArray = new String[sT[2]];
        stringArray[_cU.sT[3]] = "\u00a79";
        stringArray[_cU.sT[4]] = "\u00a7  > ";
        sS = stringArray;
        sR = Minecraft.getMinecraft();
    }
}

