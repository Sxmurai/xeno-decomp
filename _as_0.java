//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.common.Mod$EventHandler
 *  net.minecraftforge.fml.common.event.FMLPostInitializationEvent
 *  net.minecraftforge.fml.common.event.FMLPreInitializationEvent
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import me.zero.alpine.EventManager;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from _as
 */
@Mod(modid="xeno", name="Xeno", version="1.1")
public class _as_0 {
    public static _br_0 fJ;
    public static final String fs = "xeno";
    public static final String fu = "1.1";
    public static Logger fx;
    public static _bC fG;
    public static final int[] fN;
    public static _ap_0 fL;
    public static String fv;
    public static _aX fF;
    public static boolean fz;
    public static _bh_0 fI;
    public static _J fD;
    public static _s_0 fK;
    public static final String ft = "Xeno";
    public static _n_0 fE;
    public static _D fB;
    public static _aR fC;
    public static _bn_0 fH;
    public static boolean fw;
    public static _aW fA;
    public static EventManager fy;
    public static final String[] fM;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent fMLPreInitializationEvent) {
        fx = fMLPreInitializationEvent.getModLog();
        this.handleDev();
        fL = new _ap_0();
        fL.startPresence();
    }

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent fMLPostInitializationEvent) {
        MinecraftForge.EVENT_BUS.register((Object)this);
        _cK.bootstrap();
        fG = new _bC();
        fG.loadHUDConfig();
        fG.loadClickGUIConfig();
        fA = new _aW();
        fB = new _D();
        fG.loadModConfig();
        fC = new _aR();
        for (_aS _aS2 : _aR.in) {
            _aS2.refresh();
        }
        fD = new _J();
        fE = new _n_0();
        fF = new _aX();
        fH = new _bn_0();
        fG.loadFriendConfig();
        fI = new _bh_0();
        fG.loadMisc();
        fK = new _s_0();
        fJ = new _br_0();
        _cX.load();
        fz = fN[0];
        fx.info(fM[fN[1]]);
    }

    public void handleDev() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(fM[fN[2]]);
        arrayList.add(fM[fN[3]]);
        arrayList.add(fM[fN[4]]);
        arrayList.add(fM[fN[5]]);
        arrayList.add(fM[fN[6]]);
        arrayList.add(fM[fN[7]]);
        arrayList.add(fM[fN[8]]);
        arrayList.add(fM[fN[9]]);
        arrayList.add(fM[fN[10]]);
        arrayList.add(fM[fN[11]]);
        arrayList.add(fM[fN[12]]);
        arrayList.add(fM[fN[13]]);
        arrayList.add(fM[fN[14]]);
        arrayList.add(fM[fN[15]]);
        arrayList.add(fM[fN[16]]);
        for (int i = fN[17]; i < fN[18]; ++i) {
            arrayList.add(fM[fN[19]] + i);
        }
        if (arrayList.contains(Minecraft.getMinecraft().getSession().getUsername())) {
            fw = fN[20];
            fv = fM[fN[21]];
            fx.info(fM[fN[22]]);
        }
    }

    static {
        fN = new int[]{1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0, 1000, 16, 1, 17, 18, 20, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 19, 0, 0};
        String[] stringArray = new String[fN[23]];
        stringArray[_as_0.fN[24]] = "\n\n\nXeno on top! - Xeno Initialized!\n\n";
        stringArray[_as_0.fN[25]] = "Wolfsurge";
        stringArray[_as_0.fN[26]] = "Eaxu";
        stringArray[_as_0.fN[27]] = "SoldierMC";
        stringArray[_as_0.fN[28]] = "HAV0X_";
        stringArray[_as_0.fN[29]] = "HAV0X";
        stringArray[_as_0.fN[30]] = "Rollbad";
        stringArray[_as_0.fN[31]] = "kf_greywolf";
        stringArray[_as_0.fN[32]] = "IdentifyDelay";
        stringArray[_as_0.fN[33]] = "AlwaysMineing";
        stringArray[_as_0.fN[34]] = "y_wiener";
        stringArray[_as_0.fN[35]] = "Sensei_foxy";
        stringArray[_as_0.fN[36]] = "Sensei_ice";
        stringArray[_as_0.fN[37]] = "Gamefighteriron";
        stringArray[_as_0.fN[38]] = "Smoakes";
        stringArray[_as_0.fN[39]] = "USP_Match";
        stringArray[_as_0.fN[40]] = "Player";
        stringArray[_as_0.fN[41]] = "Xeno Client";
        stringArray[_as_0.fN[42]] = "Recognised Dev Username";
        stringArray[_as_0.fN[43]] = "Xeno Client";
        fM = stringArray;
        fv = fM[fN[44]];
        fw = fN[45];
        fy = new EventManager();
        fz = fN[46];
    }
}

