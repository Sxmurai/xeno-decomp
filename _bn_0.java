/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from _bn
 */
public class _bn_0 {
    public static final String[] kj;
    public static List<_cB> ki;
    public static final int[] kk;

    static {
        kk = new int[]{0, 1, 0, 0, 1, 1, 0};
        String[] stringArray = new String[kk[5]];
        stringArray[_bn_0.kk[6]] = "Initialized Friend Manager";
        kj = stringArray;
    }

    public static boolean isEnemy(String string) {
        return _bn_0.isFriend(string) ? kk[3] : kk[4];
    }

    public void addFriend(String string) {
        ki.add(new _cB(string));
        _as_0.fG.saveFriendConfig();
    }

    public static _cB getFriendByName(String string) {
        _cB _cB2 = null;
        for (_cB _cB3 : ki) {
            if (!_cB3.getName().equalsIgnoreCase(string)) continue;
            _cB2 = _cB3;
        }
        return _cB2;
    }

    public static boolean isFriend(String string) {
        for (_cB _cB2 : ki) {
            if (!_cB2.getName().equalsIgnoreCase(string)) continue;
            return kk[1];
        }
        return kk[2];
    }

    public static List<String> getFriendsByName() {
        ArrayList<String> arrayList = new ArrayList<String>();
        ki.forEach(_cB2 -> arrayList.add(_cB2.getName()));
        return arrayList;
    }

    public static void removeFriend(String string) {
        ki.remove(_bn_0.getFriendByName(string));
    }

    public static void clearFriends() {
        ki.clear();
    }

    public _bn_0() {
        ki = new ArrayList<_cB>();
        _as_0.fx.info(kj[kk[0]]);
    }
}

