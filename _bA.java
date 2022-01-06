//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.common.MinecraftForge
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class _bA
implements _cf_0 {
    public String lI;
    public String lH;
    public static final String[] lQ;
    public _cO lJ;
    public List<_bd_0> lP;
    public static final int[] pd;
    public boolean lM;
    public boolean lN;
    public Minecraft pb;
    public _k_0 lK;
    public _aL lL;

    public _bA(String string, String string2, int n, _aL _aL2) {
        this.lJ = new _cO(pd[20]);
        this.lK = new _k_0(lQ[pd[21]], pd[22]);
        this.pb = Minecraft.getMinecraft();
        this.lP = new ArrayList<_bd_0>();
        this.lN = pd[23];
        this.lH = string;
        this.lI = string2;
        this.lJ.sx = n;
        this.lL = _aL2;
        _bd_0[] _bd_0Array = new _bd_0[pd[24]];
        _bd_0Array[_bA.pd[25]] = this.lK;
        this.addSettings(_bd_0Array);
        _bd_0[] _bd_0Array2 = new _bd_0[pd[26]];
        _bd_0Array2[_bA.pd[27]] = this.lJ;
        this.addSettings(_bd_0Array2);
        this.setup();
    }

    public void addSetting(_bd_0 _bd_03) {
        this.lP.add(_bd_03);
        this.lP.sort(Comparator.comparingInt(_bd_02 -> _bd_02 == this.lK ? pd[39] : pd[40]));
        this.lP.sort(Comparator.comparingInt(_bd_02 -> _bd_02 == this.lJ ? pd[37] : pd[38]));
    }

    public String getHUDData() {
        return lQ[pd[32]];
    }

    public void onServerUpdate() {
    }

    public void addSettings(_bd_0 ... _bd_0Array) {
        this.lP.addAll(Arrays.asList(_bd_0Array));
        this.lP.sort(Comparator.comparingInt(_bd_02 -> _bd_02 == this.lK ? pd[35] : pd[36]));
        this.lP.sort(Comparator.comparingInt(_bd_02 -> _bd_02 == this.lJ ? pd[33] : pd[34]));
    }

    public void onDisable() {
    }

    public void onUpdate() {
    }

    public void disable() {
        MinecraftForge.EVENT_BUS.unregister((Object)this);
        _as_0.fy.unsubscribe((Object)this);
        this.onDisable();
    }

    public void onNonToggledUpdate() {
    }

    static {
        pd = new int[]{0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 2, 1, 0, 0, 1, 0, 1, 0, 0, 3, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 4, 1, 0, 1, 0, 1, 0, 1, 0, 5, 0, 1, 2, 3, 4};
        String[] stringArray = new String[pd[41]];
        stringArray[_bA.pd[42]] = "Visible";
        stringArray[_bA.pd[43]] = "Visible";
        stringArray[_bA.pd[44]] = "Visible";
        stringArray[_bA.pd[45]] = "Visible";
        stringArray[_bA.pd[46]] = "";
        lQ = stringArray;
    }

    public void toggle() {
        this.lM = !this.lM ? pd[28] : pd[29];
        int n = this.lM ? 1 : 0;
        if (this.lM) {
            this.enable();
        } else {
            this.disable();
        }
    }

    public int getKey() {
        return this.lJ.sx;
    }

    public _bA(String string, String string2, _aL _aL2) {
        this.lJ = new _cO(pd[11]);
        this.lK = new _k_0(lQ[pd[12]], pd[13]);
        this.pb = Minecraft.getMinecraft();
        this.lP = new ArrayList<_bd_0>();
        this.lN = pd[14];
        this.lH = string;
        this.lI = string2;
        this.lJ.sx = pd[15];
        this.lL = _aL2;
        _bd_0[] _bd_0Array = new _bd_0[pd[16]];
        _bd_0Array[_bA.pd[17]] = this.lK;
        this.addSettings(_bd_0Array);
        _bd_0[] _bd_0Array2 = new _bd_0[pd[18]];
        _bd_0Array2[_bA.pd[19]] = this.lJ;
        this.addSettings(_bd_0Array2);
        this.setup();
    }

    public _bA(String string, String string2, _aL _aL2, boolean bl) {
        this.lJ = new _cO(pd[0]);
        this.lK = new _k_0(lQ[pd[1]], pd[2]);
        this.pb = Minecraft.getMinecraft();
        this.lP = new ArrayList<_bd_0>();
        this.lH = string;
        this.lI = string2;
        this.lJ.sx = pd[3];
        this.lL = _aL2;
        if (bl) {
            this.lK = new _k_0(lQ[pd[4]], pd[5]);
            int n = pd[6];
        }
        _bd_0[] _bd_0Array = new _bd_0[pd[7]];
        _bd_0Array[_bA.pd[8]] = this.lK;
        this.addSettings(_bd_0Array);
        _bd_0[] _bd_0Array2 = new _bd_0[pd[9]];
        _bd_0Array2[_bA.pd[10]] = this.lJ;
        this.addSettings(_bd_0Array2);
        this.setup();
    }

    public void onEnable() {
    }

    public String getName() {
        return this.lH;
    }

    public void enable() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        _as_0.fy.subscribe((Object)this);
        this.onEnable();
    }

    public void onFastUpdate() {
    }

    public void setup() {
    }

    public void onRenderGUI() {
    }

    @Override
    public boolean nullCheck() {
        if (this.pb.player == null || this.pb.world == null) {
            return pd[30];
        }
        return pd[31];
    }

    public boolean isEnabled() {
        return this.lM;
    }

    public void onRenderWorld() {
    }
}

