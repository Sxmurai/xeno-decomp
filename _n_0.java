//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  net.minecraft.client.Minecraft
 *  net.minecraft.network.play.server.SPacketPlayerListItem
 *  net.minecraft.network.play.server.SPacketPlayerListItem$Action
 *  net.minecraft.network.play.server.SPacketPlayerListItem$AddPlayerData
 *  net.minecraftforge.client.event.ClientChatEvent
 *  net.minecraftforge.client.event.ClientChatReceivedEvent
 *  net.minecraftforge.client.event.DrawBlockHighlightEvent
 *  net.minecraftforge.client.event.InputUpdateEvent
 *  net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent
 *  net.minecraftforge.client.event.RenderBlockOverlayEvent
 *  net.minecraftforge.client.event.RenderGameOverlayEvent
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Post
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.entity.living.LivingDamageEvent
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Finish
 *  net.minecraftforge.event.entity.player.AttackEntityEvent
 *  net.minecraftforge.event.world.WorldEvent$Load
 *  net.minecraftforge.event.world.WorldEvent$Unload
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$KeyInputEvent
 *  net.minecraftforge.fml.common.gameevent.InputEvent$MouseInputEvent
 *  net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerRespawnEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.input.Mouse
 */
import com.google.common.collect.Maps;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.server.SPacketPlayerListItem;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import net.minecraftforge.client.event.RenderBlockOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;
import org.lwjgl.input.Mouse;

/*
 * Renamed from _n
 */
public class _n_0 {
    public Minecraft Y = Minecraft.getMinecraft();
    @EventHandler
    public final Listener<_cy> Z = new Listener<_cy>(_cy2 -> {
        if (_cy2.getPacket() instanceof SPacketPlayerListItem) {
            SPacketPlayerListItem sPacketPlayerListItem = (SPacketPlayerListItem)_cy2.getPacket();
            if (sPacketPlayerListItem.getAction() == SPacketPlayerListItem.Action.ADD_PLAYER) {
                for (SPacketPlayerListItem.AddPlayerData addPlayerData : sPacketPlayerListItem.getEntries()) {
                    if (addPlayerData.getProfile().getId() == this.Y.getSession().getProfile().getId()) continue;
                    new Thread(() -> {
                        String string = this.resolveName(addPlayerData.getProfile().getId().toString());
                        if (string != null && this.Y.player != null && this.Y.player.ticksExisted >= ac[10]) {
                            _as_0.fy.post(new _bN(string));
                        }
                    }).start();
                }
            }
            if (sPacketPlayerListItem.getAction() == SPacketPlayerListItem.Action.REMOVE_PLAYER) {
                for (SPacketPlayerListItem.AddPlayerData addPlayerData : sPacketPlayerListItem.getEntries()) {
                    if (addPlayerData.getProfile().getId() == this.Y.getSession().getProfile().getId()) continue;
                    new Thread(() -> {
                        String string = this.resolveName(addPlayerData.getProfile().getId().toString());
                        if (string != null && this.Y.player != null && this.Y.player.ticksExisted >= ac[9]) {
                            _as_0.fy.post(new _bB(string));
                        }
                    }).start();
                }
            }
        }
    }, new Predicate[ac[0]]);
    public static final int[] ac = new int[]{0, 0, 1, 2, 3, 4, 5, 1, 6, 1000, 1000, 7, 0, 1, 2, 3, 4, 5, 6};
    public static final String[] ab;
    public static _n_0 X;
    public final Map<String, String> aa = Maps.newConcurrentMap();

    @SubscribeEvent
    public void onKey(InputEvent.KeyInputEvent keyInputEvent) {
        _as_0.fy.post(keyInputEvent);
    }

    static {
        String[] stringArray = new String[ac[11]];
        stringArray[_n_0.ac[12]] = "Initialized Event Processor";
        stringArray[_n_0.ac[13]] = "HUD";
        stringArray[_n_0.ac[14]] = "-";
        stringArray[_n_0.ac[15]] = "";
        stringArray[_n_0.ac[16]] = "https://api.mojang.com/user/profiles/";
        stringArray[_n_0.ac[17]] = "/names";
        stringArray[_n_0.ac[18]] = "name";
        ab = stringArray;
    }

    public _n_0() {
        X = this;
        _as_0.fy.subscribe((Object)this);
        MinecraftForge.EVENT_BUS.register((Object)this);
        _as_0.fx.info(ab[ac[1]]);
    }

    @SubscribeEvent
    public void onPlayerPush(PlayerSPPushOutOfBlocksEvent playerSPPushOutOfBlocksEvent) {
        _as_0.fy.post(playerSPPushOutOfBlocksEvent);
    }

    @SubscribeEvent
    public void onRenderScreen(RenderGameOverlayEvent.Text text) {
        _as_0.fy.post(text);
    }

    @SubscribeEvent
    public void onDrawBlockHighlight(DrawBlockHighlightEvent drawBlockHighlightEvent) {
        _as_0.fy.post(drawBlockHighlightEvent);
    }

    @SubscribeEvent
    public void onMouseInput(InputEvent.MouseInputEvent mouseInputEvent) {
        if (Mouse.getEventButtonState()) {
            _as_0.fy.post(mouseInputEvent);
        }
    }

    @SubscribeEvent
    public void onWorldUnload(WorldEvent.Unload unload) {
        _as_0.fy.post(unload);
    }

    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load load) {
        _as_0.fy.post(load);
    }

    @SubscribeEvent
    public void onTick(TickEvent.ClientTickEvent clientTickEvent) {
        _as_0.fy.post(clientTickEvent);
    }

    @SubscribeEvent
    public void onChatReceived(ClientChatReceivedEvent clientChatReceivedEvent) {
        _as_0.fy.post(clientChatReceivedEvent);
    }

    @SubscribeEvent
    public void onAttackEntity(AttackEntityEvent attackEntityEvent) {
        _as_0.fy.post(attackEntityEvent);
    }

    @SubscribeEvent
    public void onChat(ClientChatEvent clientChatEvent) {
        _as_0.fy.post(clientChatEvent);
    }

    @SubscribeEvent
    public void onLivingEntityUseItemFinish(LivingEntityUseItemEvent.Finish finish) {
        _as_0.fy.post(finish);
    }

    @SubscribeEvent
    public void onLivingDamage(LivingDamageEvent livingDamageEvent) {
        _as_0.fy.post(livingDamageEvent);
    }

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent.Post post) {
        _as_0.fy.post(post);
    }

    @SubscribeEvent
    public void onRender(RenderGameOverlayEvent renderGameOverlayEvent) {
        _as_0.fy.post(renderGameOverlayEvent);
        if (!(Minecraft.getMinecraft().currentScreen instanceof _bI) && renderGameOverlayEvent.getType() == RenderGameOverlayEvent.ElementType.TEXT && _as_0.fB.isModuleEnabled(ab[ac[2]])) {
            _as_0.fF.renderMods();
        }
    }

    @SubscribeEvent
    public void onInputUpdate(InputUpdateEvent inputUpdateEvent) {
        _as_0.fy.post(inputUpdateEvent);
    }

    @SubscribeEvent
    public void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent playerRespawnEvent) {
        _as_0.fy.post(playerRespawnEvent);
    }

    @SubscribeEvent
    public void onRenderBlockOverlay(RenderBlockOverlayEvent renderBlockOverlayEvent) {
        _as_0.fy.post(renderBlockOverlayEvent);
    }

    public String resolveName(String string) {
        if (this.aa.containsKey(string = string.replace(ab[ac[3]], ab[ac[4]]))) {
            return this.aa.get(string);
        }
        String string2 = ab[ac[5]] + string + ab[ac[6]];
        try {
            JSONObject jSONObject;
            JSONArray jSONArray;
            String string3 = IOUtils.toString((URL)new URL(string2));
            if (string3 != null && string3.length() > 0 && (jSONArray = (JSONArray)JSONValue.parseWithException(string3)) != null && (jSONObject = (JSONObject)jSONArray.get(jSONArray.size() - ac[7])) != null) {
                return jSONObject.get(ab[ac[8]]).toString();
            }
        }
        catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @SubscribeEvent
    public void onLivingDeath(LivingDeathEvent livingDeathEvent) {
        _as_0.fy.post(livingDeathEvent);
    }

    @SubscribeEvent
    public void onRenderWorld(RenderWorldLastEvent renderWorldLastEvent) {
        _as_0.fy.post(renderWorldLastEvent);
    }
}

