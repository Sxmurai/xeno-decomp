//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;

/*
 * Renamed from _bw
 */
public class _bw_0
extends _bA {
    public static final String[] lQ;
    @EventHandler
    public final Listener<_B> lq = new Listener<_B>(_B2 -> {
        if (_B2.aY == this.pb.player) {
            _B2.cancel();
        }
    }, new Predicate[pd[2]]);
    public static final int[] pd;

    public _bw_0() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hy);
    }

    static {
        pd = new int[]{0, 1, 0, 2, 0, 1};
        String[] stringArray = new String[pd[3]];
        stringArray[_bw_0.pd[4]] = "NoPush";
        stringArray[_bw_0.pd[5]] = "stops entities from pushing you around";
        lQ = stringArray;
    }
}

