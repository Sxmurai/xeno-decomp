/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;

public class _O
extends _bA {
    public static final int[] pd = new int[]{0, 1, 0, 2, 0, 1};
    public static final String[] lQ;
    @EventHandler
    public final Listener<_aD> bN = new Listener<_aD>(_aD2 -> _aD2.cancel(), new Predicate[pd[2]]);

    public _O() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hz);
    }

    static {
        String[] stringArray = new String[pd[3]];
        stringArray[_O.pd[4]] = "CameraClip";
        stringArray[_O.pd[5]] = "lets the 3rd person camera clip through blocks";
        lQ = stringArray;
    }
}

