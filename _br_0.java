//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.play.server.SPacketTimeUpdate
 *  net.minecraftforge.common.MinecraftForge
 */
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.network.play.server.SPacketTimeUpdate;
import net.minecraftforge.common.MinecraftForge;

/*
 * Renamed from _br
 */
public class _br_0
implements _cf_0 {
    public final float[] lb = new float[pd[0]];
    public int lc;
    public long la = -1L;
    @EventHandler
    public final Listener<_cy> ld = new Listener<_cy>(_cy2 -> {
        if (_cy2.getPacket() instanceof SPacketTimeUpdate) {
            if (this.la != -1L) {
                this.lb[this.lc % this.lb.length] = _bU.clamp(20.0f / ((float)(System.currentTimeMillis() - this.la) / 1000.0f), 0.0f, 20.0f);
                this.lc += pd[9];
            }
            this.la = System.currentTimeMillis();
        }
    }, new Predicate[pd[1]]);
    public static final int[] pd = new int[]{20, 0, 0, 0, 2, 0, 0, 2, 0, 1};

    public void shiftServerTicks(int n) {
        for (int i = pd[8]; i < n; ++i) {
        }
    }

    public float getTPS(_c_0 _c_02) {
        switch (_bE.mr[_c_02.ordinal()]) {
            case 1: {
                return pb.isSingleplayer() ? 20.0f : (float)_ac_0.roundDouble(_bU.clamp(this.lb[pd[3]], 0.0f, 20.0f), pd[4]);
            }
            case 2: {
                int n = pd[5];
                float f = 0.0f;
                float[] fArray = this.lb;
                int n2 = fArray.length;
                for (int i = pd[6]; i < n2; ++i) {
                    float f2 = fArray[i];
                    if (!(f2 > 0.0f)) continue;
                    f += f2;
                    ++n;
                }
                return pb.isSingleplayer() ? 20.0f : (float)_ac_0.roundDouble(_bU.clamp(f / (float)n, 0.0f, 20.0f), pd[7]);
            }
        }
        return 0.0f;
    }

    public void setClientTicks(float f) {
        _br_0.pb.timer.tickLength = 50.0f / f;
    }

    public _br_0() {
        int n = this.lb.length;
        for (int i = pd[2]; i < n; ++i) {
            this.lb[i] = 0.0f;
        }
        MinecraftForge.EVENT_BUS.register((Object)this);
        _as_0.fy.subscribe((Object)this);
    }
}

