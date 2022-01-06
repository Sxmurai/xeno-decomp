//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ChatAllowedCharacters
 */
import java.util.Random;
import net.minecraft.util.ChatAllowedCharacters;

public class _cC {
    public static final String rh = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0";
    public static int[] rf;
    public static final Random rg;
    public static final int[] rj;
    public static final String[] ri;

    public static String randomMagicText(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArray = string.toCharArray();
        int n = cArray.length;
        for (int i = rj[0]; i < n; ++i) {
            char c = cArray[i];
            if (!ChatAllowedCharacters.isAllowedCharacter((char)c)) continue;
            int n2 = rg.nextInt(ri[rj[1]].length());
            stringBuilder.append(ri[rj[2]].charAt(n2));
        }
        return stringBuilder.toString();
    }

    static {
        rj = new int[]{0, 0, 1, 2, 0, 1, 16, 0, 0, 1, 170, 2, 43520, 3, 43690, 4, 0xAA0000, 5, 0xAA00AA, 6, 0xFFAA00, 7, 0xAAAAAA, 8, 0x555555, 9, 0x5555FF, 10, 0x55FF55, 11, 0x55FFFF, 12, 0xFF5555, 13, 0xFF55FF, 14, 0xFFFF55, 15, 0xFFFFFF};
        String[] stringArray = new String[rj[3]];
        stringArray[_cC.rj[4]] = rh;
        stringArray[_cC.rj[5]] = rh;
        ri = stringArray;
        rf = new int[rj[6]];
        _cC.rf[_cC.rj[7]] = rj[8];
        _cC.rf[_cC.rj[9]] = rj[10];
        _cC.rf[_cC.rj[11]] = rj[12];
        _cC.rf[_cC.rj[13]] = rj[14];
        _cC.rf[_cC.rj[15]] = rj[16];
        _cC.rf[_cC.rj[17]] = rj[18];
        _cC.rf[_cC.rj[19]] = rj[20];
        _cC.rf[_cC.rj[21]] = rj[22];
        _cC.rf[_cC.rj[23]] = rj[24];
        _cC.rf[_cC.rj[25]] = rj[26];
        _cC.rf[_cC.rj[27]] = rj[28];
        _cC.rf[_cC.rj[29]] = rj[30];
        _cC.rf[_cC.rj[31]] = rj[32];
        _cC.rf[_cC.rj[33]] = rj[34];
        _cC.rf[_cC.rj[35]] = rj[36];
        _cC.rf[_cC.rj[37]] = rj[38];
        rg = new Random();
    }
}

