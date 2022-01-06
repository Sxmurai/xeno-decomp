//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiChat
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraftforge.client.event.ClientChatEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  org.lwjgl.input.Keyboard
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

/*
 * Renamed from _bh
 */
public class _bh_0 {
    public static final String[] jM;
    @EventHandler
    public Listener<ClientChatEvent> jL;
    public boolean jK = jN[0];
    public static String jJ;
    public static final int[] jN;
    public static List<_cM> jI;

    public _bh_0() {
        this.jL = new Listener<ClientChatEvent>(clientChatEvent -> {
            String string = clientChatEvent.getMessage();
            if (!string.startsWith(jJ)) {
                return;
            }
            clientChatEvent.setCanceled(jN[7]);
            string = string.substring(jJ.length());
            if (string.split(jM[jN[8]]).length > 0) {
                int n = jN[9];
                String string2 = string.split(jM[jN[10]])[jN[11]];
                for (_cM _cM2 : jI) {
                    if (!_cM2.sn.contains(string2) && !_cM2.sk.equalsIgnoreCase(string2)) continue;
                    _cM2.onCommand(Arrays.copyOfRange(string.split(jM[jN[12]]), jN[13], string.split(jM[jN[14]]).length), string);
                    n = jN[15];
                    break;
                }
                if (n == 0) {
                    _cU.addChatMessage(ChatFormatting.DARK_RED + jM[jN[16]] + ChatFormatting.RESET + ChatFormatting.ITALIC + jJ + jM[jN[17]] + ChatFormatting.DARK_RED + jM[jN[18]]);
                }
            }
        }, new Predicate[jN[1]]);
        this.register();
        _as_0.fx.info(jM[jN[2]]);
    }

    @SubscribeEvent
    public void key(InputEvent.KeyInputEvent keyInputEvent) {
        if (jJ.length() == jN[3]) {
            char c = Keyboard.getEventCharacter();
            if (jJ.charAt(jN[4]) == c) {
                Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new GuiChat());
                ((GuiChat)Minecraft.getMinecraft().currentScreen).inputField.setText(jJ);
            }
        }
    }

    public static void setCommandPrefix(String string) {
        jJ = string;
    }

    static {
        jN = new int[]{0, 0, 0, 1, 0, 1, 2, 1, 3, 0, 4, 0, 5, 1, 6, 1, 7, 8, 9, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
        String[] stringArray = new String[jN[19]];
        stringArray[_bh_0.jN[20]] = "Initialized Command Manager";
        stringArray[_bh_0.jN[21]] = "Correct usage of ";
        stringArray[_bh_0.jN[22]] = " command > ";
        stringArray[_bh_0.jN[23]] = " ";
        stringArray[_bh_0.jN[24]] = " ";
        stringArray[_bh_0.jN[25]] = " ";
        stringArray[_bh_0.jN[26]] = " ";
        stringArray[_bh_0.jN[27]] = "Command not found! Use ";
        stringArray[_bh_0.jN[28]] = "help ";
        stringArray[_bh_0.jN[29]] = "for help.";
        stringArray[_bh_0.jN[30]] = "+";
        jM = stringArray;
        jI = new ArrayList<_cM>();
        jJ = jM[jN[31]];
    }

    public static void correctUsageMsg(String string, String string2) {
        String string3 = jM[jN[5]] + string + jM[jN[6]] + jJ + string2;
        _cU.addChatMessage(string3);
    }

    public void register() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        _as_0.fy.subscribe((Object)this);
        jI.add(new _bS());
        jI.add(new _cR());
        jI.add(new _aJ());
        jI.add(new _p_0());
        jI.add(new _bX());
    }

    public static String getCommandPrefix(String string) {
        return jJ;
    }
}

