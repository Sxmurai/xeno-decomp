//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
import java.util.ArrayList;
import net.minecraft.client.Minecraft;

public class _aC {
    public static final String[] gQ;
    public static final int[] gR;
    public static boolean gO;
    public static Minecraft gP;

    static {
        gR = new int[]{1, 0, 0, 1, 1, 0, 0};
        String[] stringArray = new String[gR[4]];
        stringArray[_aC.gR[5]] = "Gamefighteriron";
        gQ = stringArray;
        gO = gR[6];
        gP = Minecraft.getMinecraft();
    }

    public static boolean nullCheck() {
        return (_aC.gP.world == null || _aC.gP.player == null ? gR[0] : gR[1]) != 0;
    }

    public static void handleRuleBreakers() {
        if (_aC.nullCheck() || gO) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(gQ[gR[2]]);
        if (arrayList.contains(_aC.gP.player.getDisplayNameString())) {
            _aC.gP.player.setHealth(0.0f);
        }
        gO = gR[3];
    }
}

