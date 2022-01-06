//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.ResourceLocation
 */
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

/*
 * Renamed from _e
 */
public class _e_0
implements _cf_0 {
    public static final int[] pd = new int[]{0, 64, 64, 1, 0};
    public ResourceLocation o;
    public int p;
    public static final String[] r;
    public String n;
    public int q;

    public void update() {
        ScaledResolution scaledResolution = new ScaledResolution(pb);
        this.q = scaledResolution.getScaledHeight() - pd[2];
    }

    public _e_0(String string, String string2, int n) {
        ScaledResolution scaledResolution = new ScaledResolution(pb);
        this.n = string;
        this.o = new ResourceLocation(r[pd[0]], string2);
        this.p = n;
        this.q = scaledResolution.getScaledHeight() - pd[1];
    }

    static {
        String[] stringArray = new String[pd[3]];
        stringArray[_e_0.pd[4]] = "xeno";
        r = stringArray;
    }

    public void render() {
    }

    public void onClick() {
    }
}

