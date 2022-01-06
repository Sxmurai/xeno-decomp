/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class _bX
extends _cM {
    public static final String[] od;
    public static final int[] oe;

    public _bX() {
        String[] stringArray = new String[oe[3]];
        stringArray[_bX.oe[4]] = od[oe[5]];
        super(od[oe[0]], od[oe[1]], od[oe[2]], stringArray);
    }

    static {
        oe = new int[]{0, 1, 2, 1, 0, 3, 0, 4, 3, 1, 2, 5, 6, 2, 0, 7, 2, 1, 0, 8, 9, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] stringArray = new String[oe[21]];
        stringArray[_bX.oe[22]] = "Bind";
        stringArray[_bX.oe[23]] = "bind module keybinds to keys";
        stringArray[_bX.oe[24]] = "bind <set|clear> <module> <key>";
        stringArray[_bX.oe[25]] = "bind";
        stringArray[_bX.oe[26]] = "set";
        stringArray[_bX.oe[27]] = "set ";
        stringArray[_bX.oe[28]] = "'s bind to ";
        stringArray[_bX.oe[29]] = "clear";
        stringArray[_bX.oe[30]] = "cleared ";
        stringArray[_bX.oe[31]] = "'s bind";
        od = stringArray;
    }

    @Override
    public void onCommand(String[] stringArray, String string) {
        block9: {
            if (stringArray != null) {
                if (stringArray.length > 0) {
                    try {
                        if (stringArray[oe[6]].equalsIgnoreCase(od[oe[7]]) && stringArray.length == oe[8]) {
                            for (_bA _bA2 : _D.bg) {
                                if (!stringArray[oe[9]].equalsIgnoreCase(_bA2.lH)) continue;
                                _bA2.lJ.sx = Keyboard.getKeyIndex((String)stringArray[oe[10]].toUpperCase());
                                _cU.addChatMessage(od[oe[11]] + _bA2.lH + od[oe[12]] + stringArray[oe[13]].toUpperCase());
                                _as_0.fG.saveModConfig(_bA2);
                                break block9;
                            }
                            break block9;
                        }
                        if (stringArray[oe[14]].equalsIgnoreCase(od[oe[15]]) && stringArray.length == oe[16]) {
                            for (_bA _bA3 : _D.bg) {
                                if (!stringArray[oe[17]].equalsIgnoreCase(_bA3.lH)) continue;
                                _bA3.lJ.sx = oe[18];
                                _cU.addChatMessage(od[oe[19]] + _bA3.lH + od[oe[20]]);
                                _as_0.fG.saveModConfig(_bA3);
                                break block9;
                            }
                            break block9;
                        }
                        _bh_0.correctUsageMsg(this.getName(), this.getSyntax());
                    }
                    catch (Exception exception) {
                        _bh_0.correctUsageMsg(this.getName(), this.getSyntax());
                    }
                } else {
                    _bh_0.correctUsageMsg(this.getName(), this.getSyntax());
                }
            }
        }
    }
}

