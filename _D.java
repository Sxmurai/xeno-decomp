//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraftforge.client.event.RenderGameOverlayEvent
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ServerTickEvent
 *  org.lwjgl.input.Keyboard
 */
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class _D {
    public static ArrayList<_bA> bg;
    public static final int[] bi;
    public static final String[] bh;

    static {
        bi = new int[]{0, 1, 0, 1, 0};
        String[] stringArray = new String[bi[3]];
        stringArray[_D.bi[4]] = "Initialized Modules";
        bh = stringArray;
        bg = new ArrayList();
    }

    public void onFastUpdate() {
        try {
            for (_bA _bA2 : bg) {
                if (!_bA2.isEnabled()) continue;
                _bA2.onFastUpdate();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @SubscribeEvent
    public void onServerTick(TickEvent.ServerTickEvent serverTickEvent) {
        this.onServerUpdate();
    }

    public void onServerUpdate() {
        try {
            for (_bA _bA2 : bg) {
                if (!_bA2.isEnabled()) continue;
                _bA2.onServerUpdate();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @SubscribeEvent
    public void onUpdate(TickEvent.ClientTickEvent clientTickEvent) {
        if (Minecraft.getMinecraft().player != null && Minecraft.getMinecraft().world != null) {
            _aC.handleRuleBreakers();
            for (_bA _bA2 : bg) {
                if (_bA2.lM) {
                    _bA2.onUpdate();
                }
                _bA2.onNonToggledUpdate();
            }
        }
    }

    public static _bA getModuleByName(String string) {
        for (_bA _bA2 : bg) {
            if (!_bA2.getName().equalsIgnoreCase(string)) continue;
            return _bA2;
        }
        return null;
    }

    public void init() {
        bg.add(new _af_0());
        bg.add(new _bT());
        bg.add(new _g_0());
        bg.add(new _aa_0());
        bg.add(new _bo_0());
        bg.add(new _bb_0());
        bg.add(new _cT());
        bg.add(new _ba_0());
        bg.add(new _q_0());
        bg.add(new _cG());
        bg.add(new _bY());
        bg.add(new _cz());
        bg.add(new _ay_0());
        bg.add(new _bL());
        bg.add(new _aY());
        bg.add(new _cD());
        bg.add(new _bw_0());
        bg.add(new _bG());
        bg.add(new _bc_0());
        bg.add(new _aj_0());
        bg.add(new _cW());
        bg.add(new _cS());
        bg.add(new _cI());
        bg.add(new _aO());
        bg.add(new _P());
        bg.add(new _T());
        bg.add(new _cj_0());
        bg.add(new _O());
        bg.add(new _ci_0());
        bg.add(new _bZ());
        bg.add(new _S());
        bg.add(new _Q());
        bg.add(new _bm_0());
        bg.add(new _aB());
        bg.add(new _ck_0());
        bg.add(new _i_0());
        bg.add(new _cc_0());
        bg.add(new _N());
        bg.add(new _bM());
        bg.add(new _az_0());
        bg.add(new _ax_0());
        bg.add(new _bK());
        bg.add(new _w_0());
        bg.add(new _ca_0());
        bg.add(new _b_0());
        bg.add(new _bu_0());
        bg.add(new _aU());
        bg.add(new _l_0());
        bg.add(new _at_0());
        bg.add(new _bV());
        bg.add(new _cr_0());
        System.out.println(bg.size());
    }

    @SubscribeEvent
    public void onRenderWorld(RenderWorldLastEvent renderWorldLastEvent) {
        if (Minecraft.getMinecraft().player != null && Minecraft.getMinecraft().world != null) {
            for (_bA _bA2 : bg) {
                if (!_bA2.lM) continue;
                _bA2.onRenderWorld();
            }
        }
    }

    public _D() {
        bg = new ArrayList();
        MinecraftForge.EVENT_BUS.register((Object)this);
        this.init();
        _as_0.fx.info(bh[bi[0]]);
    }

    @SubscribeEvent
    public void onFastTick(TickEvent tickEvent) {
        this.onFastUpdate();
    }

    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent keyInputEvent) {
        if (Keyboard.getEventKeyState()) {
            for (_bA _bA2 : bg) {
                if (_bA2.getKey() != Keyboard.getEventKey() || _bA2.getKey() <= bi[1]) continue;
                _bA2.toggle();
            }
        }
    }

    public boolean isModuleEnabled(String string) {
        for (_bA _bA2 : bg) {
            if (!_bA2.getName().equalsIgnoreCase(string)) continue;
            return _bA2.isEnabled();
        }
        return bi[2];
    }

    @SubscribeEvent
    public void onRenderGUI(RenderGameOverlayEvent renderGameOverlayEvent) {
        if (renderGameOverlayEvent.getType() != RenderGameOverlayEvent.ElementType.TEXT) {
            return;
        }
        if (Minecraft.getMinecraft().player != null && Minecraft.getMinecraft().world != null) {
            for (_bA _bA2 : bg) {
                if (!_bA2.lM) continue;
                _bA2.onRenderGUI();
            }
        }
    }

    public ArrayList<_bA> getModules() {
        return bg;
    }

    public ArrayList<_bA> getModulesInCategory(_aL _aL2) {
        ArrayList<_bA> arrayList = new ArrayList<_bA>();
        for (_bA _bA2 : bg) {
            if (_bA2.lL != _aL2) continue;
            arrayList.add(_bA2);
        }
        return arrayList;
    }

    public _bA getModule(String string) {
        for (_bA _bA2 : bg) {
            if (!_bA2.getName().equalsIgnoreCase(string)) continue;
            return _bA2;
        }
        return null;
    }
}

