//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketEntityAction
 *  net.minecraft.network.play.client.CPacketEntityAction$Action
 *  org.lwjgl.input.Keyboard
 */
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import org.lwjgl.input.Keyboard;

public class _bY
extends _bA {
    public static _cJ oh;
    public _K oq;
    public static _k_0 ol;
    @EventHandler
    public final Listener<_bF> or;
    public static int op;
    public static final String[] os;
    public static _k_0 on;
    public static final int[] pd;
    public static _k_0 om;
    public static _cJ oi;
    public static _cJ ok;
    public static _cJ oj;
    public static _bY of;
    public _cO oo = new _cO(os[pd[3]], pd[4]);
    public static _cd_0 og;

    @Override
    public void onUpdate() {
        this.handleKey();
    }

    public void handleKey() {
        int n = pd[16];
        if (Keyboard.getEventKeyState() && Keyboard.isKeyDown((int)this.oo.sx) && n == 0) {
            this.pb.getConnection().sendPacket((Packet)new CPacketEntityAction((Entity)this.pb.player, CPacketEntityAction.Action.START_FALL_FLYING));
            n = pd[17];
        }
    }

    @Override
    public String getHUDData() {
        return os[pd[23]] + og.getMode();
    }

    public _bY() {
        super(os[pd[0]], os[pd[1]], pd[2], _aL.hy);
        this.oq = new _K();
        this.or = new Listener<_bF>(_bF2 -> {
            if (!this.nullCheck() && this.pb.player.isElytraFlying()) {
                if (_be_0.isInLiquid() && om.getValue()) {
                    return;
                }
                if (_be_0.isCollided() && on.getValue()) {
                    return;
                }
                this.elytraFlight((_bF)_bF2);
            }
        }, new Predicate[pd[5]]);
        _bd_0[] _bd_0Array = new _bd_0[pd[6]];
        _bd_0Array[_bY.pd[7]] = og;
        _bd_0Array[_bY.pd[8]] = oh;
        _bd_0Array[_bY.pd[9]] = oi;
        _bd_0Array[_bY.pd[10]] = oj;
        _bd_0Array[_bY.pd[11]] = ok;
        _bd_0Array[_bY.pd[12]] = ol;
        _bd_0Array[_bY.pd[13]] = om;
        _bd_0Array[_bY.pd[14]] = on;
        _bd_0Array[_bY.pd[15]] = this.oo;
        this.addSettings(_bd_0Array);
        of = this;
    }

    static {
        pd = new int[]{0, 1, 0, 2, 0, 0, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 1, -1, 3, 0, 4, 1, 5, 16, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 6, 2, 0, 7, 1, 8, 9, 10, 11, 12, 13, 0, 14, 1, 15, 0};
        String[] stringArray = new String[pd[24]];
        stringArray[_bY.pd[25]] = "ElytraFly";
        stringArray[_bY.pd[26]] = "ez fly with elytra";
        stringArray[_bY.pd[27]] = "Activate Key";
        stringArray[_bY.pd[28]] = "Control";
        stringArray[_bY.pd[29]] = "Packet";
        stringArray[_bY.pd[30]] = " ";
        stringArray[_bY.pd[31]] = "Mode";
        stringArray[_bY.pd[32]] = "Control";
        stringArray[_bY.pd[33]] = "Packet";
        stringArray[_bY.pd[34]] = "Speed";
        stringArray[_bY.pd[35]] = "Up";
        stringArray[_bY.pd[36]] = "Down";
        stringArray[_bY.pd[37]] = "Fall";
        stringArray[_bY.pd[38]] = "LockRotation";
        stringArray[_bY.pd[39]] = "StopInLiquid";
        stringArray[_bY.pd[40]] = "StopWhenColliding";
        os = stringArray;
        String[] stringArray2 = new String[pd[42]];
        stringArray2[_bY.pd[43]] = os[pd[44]];
        stringArray2[_bY.pd[45]] = os[pd[46]];
        og = new _cd_0(os[pd[41]], stringArray2);
        oh = new _cJ(os[pd[47]], 2.5, 0.0, 5.0, 0.1);
        oi = new _cJ(os[pd[48]], 1.0, 0.0, 5.0, 0.1);
        oj = new _cJ(os[pd[49]], 1.0, 0.0, 5.0, 0.1);
        ok = new _cJ(os[pd[50]], 0.0, 0.0, 0.1, 0.1);
        ol = new _k_0(os[pd[51]], pd[52]);
        om = new _k_0(os[pd[53]], pd[54]);
        on = new _k_0(os[pd[55]], pd[56]);
    }

    /*
     * Exception decompiling
     */
    public void elytraFlight(_bF var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void handleControl() {
        if (this.pb.gameSettings.keyBindJump.isKeyDown()) {
            this.pb.player.motionY = oi.getDoubleValue();
        } else if (this.pb.gameSettings.keyBindSneak.isKeyDown()) {
            this.pb.player.motionY = -oj.getDoubleValue();
        }
    }
}

