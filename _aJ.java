/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class _aJ
extends _cM {
    public static final int[] hq = new int[]{0, 1, 2, 1, 0, 3, 1, 0, 4, 1, 5, 6, 0, 1, 2, 3, 4, 5};
    public static final String[] hp;

    @Override
    public void onCommand(String[] stringArray, String string) {
        if (stringArray.length > hq[6]) {
            if (stringArray[hq[7]].equalsIgnoreCase(hp[hq[8]])) {
                _bY.op = Keyboard.getKeyIndex((String)stringArray[hq[9]].toUpperCase());
                _cU.addChatMessage(hp[hq[10]] + Keyboard.getKeyName((int)_bY.op));
                _as_0.fG.saveMisc();
            }
        } else {
            _bh_0.correctUsageMsg(this.getName(), this.getSyntax());
        }
    }

    static {
        String[] stringArray = new String[hq[11]];
        stringArray[_aJ.hq[12]] = "ElytraFly";
        stringArray[_aJ.hq[13]] = "elytrafly settings";
        stringArray[_aJ.hq[14]] = "elytra key <key>";
        stringArray[_aJ.hq[15]] = "elytra";
        stringArray[_aJ.hq[16]] = "key";
        stringArray[_aJ.hq[17]] = "set elytrafly activate keybind to: ";
        hp = stringArray;
    }

    public _aJ() {
        String[] stringArray = new String[hq[3]];
        stringArray[_aJ.hq[4]] = hp[hq[5]];
        super(hp[hq[0]], hp[hq[1]], hp[hq[2]], stringArray);
    }
}

