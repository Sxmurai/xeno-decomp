/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from _p
 */
public class _p_0
extends _cM {
    public static final String[] ak;
    public static final int[] al;

    public _p_0() {
        String[] stringArray = new String[al[3]];
        stringArray[_p_0.al[4]] = ak[al[5]];
        super(ak[al[0]], ak[al[1]], ak[al[2]], stringArray);
    }

    @Override
    public void onCommand(String[] stringArray, String string) {
        for (_cM _cM2 : _bh_0.jI) {
            _cU.addChatMessage(ak[al[6]] + _cM2.getName() + ak[al[7]] + _cM2.getSyntax());
        }
    }

    static {
        al = new int[]{0, 1, 2, 1, 0, 3, 4, 5, 6, 0, 1, 2, 3, 4, 5};
        String[] stringArray = new String[al[8]];
        stringArray[_p_0.al[9]] = "Help";
        stringArray[_p_0.al[10]] = "shows help about the commands";
        stringArray[_p_0.al[11]] = "help";
        stringArray[_p_0.al[12]] = "help";
        stringArray[_p_0.al[13]] = " [N] ";
        stringArray[_p_0.al[14]] = " [S] ";
        ak = stringArray;
    }
}

