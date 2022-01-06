/*
 * Decompiled with CFR 0.152.
 */
public class _cR
extends _cM {
    public static final int[] sF = new int[]{0, 1, 2, 1, 0, 3, 0, 4, 5, 6, 0, 1, 2, 3, 4, 5};
    public static final String[] sE;

    @Override
    public void onCommand(String[] stringArray, String string) {
        if (stringArray.length > 0) {
            if (stringArray[sF[6]].equalsIgnoreCase(sE[sF[7]])) {
                _as_0.fC.reset();
                _cU.addChatMessage(sE[sF[8]]);
            }
        } else {
            _bh_0.correctUsageMsg(this.getName(), this.getSyntax());
        }
    }

    public _cR() {
        String[] stringArray = new String[sF[3]];
        stringArray[_cR.sF[4]] = sE[sF[5]];
        super(sE[sF[0]], sE[sF[1]], sE[sF[2]], stringArray);
    }

    static {
        String[] stringArray = new String[sF[9]];
        stringArray[_cR.sF[10]] = "Gui";
        stringArray[_cR.sF[11]] = "clickgui stuff";
        stringArray[_cR.sF[12]] = "gui reset";
        stringArray[_cR.sF[13]] = "gui";
        stringArray[_cR.sF[14]] = "reset";
        stringArray[_cR.sF[15]] = "reset clickgui";
        sE = stringArray;
    }
}

