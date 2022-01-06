/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 */
import java.util.ArrayList;
import net.minecraft.util.text.TextFormatting;

public class _bS
extends _cM {
    public static final String[] nK;
    public static final int[] nL;

    @Override
    public void onCommand(String[] stringArray, String string) {
        if (stringArray.length == nL[6]) {
            if (stringArray[nL[7]].equalsIgnoreCase(nK[nL[8]])) {
                String string2 = stringArray[nL[9]];
                if (_bn_0.isFriend(string2)) {
                    _cU.addChatMessage(string2 + nK[nL[10]]);
                    return;
                }
                _cU.addChatMessage(nK[nL[11]] + string2 + nK[nL[12]]);
                _as_0.fH.addFriend(string2);
            } else if (stringArray[nL[13]].equalsIgnoreCase(nK[nL[14]]) && !stringArray[nL[15]].equalsIgnoreCase(nK[nL[16]])) {
                String string3 = stringArray[nL[17]];
                String string4 = stringArray[nL[18]];
                int n = nL[19];
                for (_cB _cB2 : _bn_0.ki) {
                    if (!_bn_0.isFriend(string4)) continue;
                    _cU.addChatMessage(nK[nL[20]] + string4 + nK[nL[21]]);
                    _bn_0.ki.remove(_cB2);
                    n = nL[22];
                    return;
                }
                if (n == 0) {
                    _cU.addChatMessage(string4 + nK[nL[23]]);
                }
            } else if (stringArray[nL[24]].equalsIgnoreCase(nK[nL[25]]) && stringArray[nL[26]].equalsIgnoreCase(nK[nL[27]])) {
                String string5 = stringArray[nL[28]];
                ArrayList arrayList = new ArrayList();
                _cU.addChatMessage(nK[nL[29]]);
                _bn_0.ki.removeAll(_bn_0.ki);
            } else {
                _bh_0.correctUsageMsg(this.getName(), this.getSyntax());
            }
        } else if (stringArray.length == nL[30]) {
            if (stringArray[nL[31]].equalsIgnoreCase(nK[nL[32]])) {
                _cU.addChatMessage(nK[nL[33]]);
                for (_cB _cB3 : _bn_0.ki) {
                    String string6 = _cB3.getName();
                    String string7 = string6.substring(nL[34], nL[35]).toUpperCase();
                    String string8 = string7 + string6.substring(nL[36]);
                    _cU.addChatMessage(TextFormatting.DARK_AQUA + string8);
                }
            } else {
                _bh_0.correctUsageMsg(this.getName(), this.getSyntax());
            }
        } else {
            _bh_0.correctUsageMsg(this.getName(), this.getSyntax());
        }
        _as_0.fG.saveFriendConfig();
    }

    public _bS() {
        String[] stringArray = new String[nL[3]];
        stringArray[_bS.nL[4]] = nK[nL[5]];
        super(nK[nL[0]], nK[nL[1]], nK[nL[2]], stringArray);
    }

    static {
        nL = new int[]{0, 1, 2, 1, 0, 3, 2, 0, 4, 1, 5, 6, 7, 0, 8, 1, 9, 0, 1, 0, 10, 11, 1, 12, 0, 13, 1, 14, 0, 15, 1, 0, 16, 17, 0, 1, 1, 18, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        String[] stringArray = new String[nL[37]];
        stringArray[_bS.nL[38]] = "Friend";
        stringArray[_bS.nL[39]] = "friend players";
        stringArray[_bS.nL[40]] = "friend list | <add | remove> <playername>";
        stringArray[_bS.nL[41]] = "friend";
        stringArray[_bS.nL[42]] = "add";
        stringArray[_bS.nL[43]] = " is already in your friends list!";
        stringArray[_bS.nL[44]] = "Added player ";
        stringArray[_bS.nL[45]] = " to friends list.";
        stringArray[_bS.nL[46]] = "remove";
        stringArray[_bS.nL[47]] = "all";
        stringArray[_bS.nL[48]] = "Removed player ";
        stringArray[_bS.nL[49]] = " from friends list.";
        stringArray[_bS.nL[50]] = " isn't in your friends list.";
        stringArray[_bS.nL[51]] = "remove";
        stringArray[_bS.nL[52]] = "all";
        stringArray[_bS.nL[53]] = "Removed all players from friends list.";
        stringArray[_bS.nL[54]] = "list";
        stringArray[_bS.nL[55]] = "Friends List -";
        nK = stringArray;
    }
}

