/*
 * Decompiled with CFR 0.152.
 */
import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;

/*
 * Renamed from _ap
 */
public class _ap_0
implements _cf_0 {
    public static final DiscordRPC eU;
    public static Thread eX;
    public static final int[] pd;
    public static final DiscordRichPresence eV;
    public static final DiscordEventHandlers eW;
    public static final String[] eY;

    static {
        pd = new int[]{0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] stringArray = new String[pd[12]];
        stringArray[_ap_0.pd[13]] = "916078755221499975";
        stringArray[_ap_0.pd[14]] = "";
        stringArray[_ap_0.pd[15]] = "large";
        stringArray[_ap_0.pd[16]] = " (Dev)";
        stringArray[_ap_0.pd[17]] = "";
        stringArray[_ap_0.pd[18]] = "Using Xeno Client version 1.1";
        stringArray[_ap_0.pd[19]] = "large";
        stringArray[_ap_0.pd[20]] = " (Dev)";
        stringArray[_ap_0.pd[21]] = "";
        stringArray[_ap_0.pd[22]] = "Loading Xeno Version 1.1";
        stringArray[_ap_0.pd[23]] = "Xeno Client v1.1";
        eY = stringArray;
        eU = DiscordRPC.INSTANCE;
        eV = new DiscordRichPresence();
        eW = new DiscordEventHandlers();
    }

    public static void doInitPhase() {
        _ap_0.eV.largeImageKey = eY[pd[3]];
        _ap_0.eV.largeImageText = _as_0.fv + (_as_0.fw ? eY[pd[4]] : eY[pd[5]]);
        _ap_0.eV.state = eY[pd[6]];
        eU.Discord_UpdatePresence(eV);
    }

    public static void startPresence() {
        eU.Discord_Initialize(eY[pd[0]], eW, pd[1], eY[pd[2]]);
        _ap_0.eV.startTimestamp = System.currentTimeMillis() / 1000L;
        eU.Discord_UpdatePresence(eV);
        eX = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    _ap_0.eV.largeImageKey = eY[pd[7]];
                    _ap_0.eV.largeImageText = _as_0.fv + (_as_0.fw ? eY[pd[8]] : eY[pd[9]]);
                    _ap_0.eV.state = !_as_0.fz ? eY[pd[10]] : eY[pd[11]];
                    eU.Discord_UpdatePresence(eV);
                    Thread.sleep(3000L);
                }
                catch (Exception exception) {}
            }
        });
        eX.start();
    }

    public static void interruptPresence() {
        if (eX != null && !eX.isInterrupted()) {
            eX.interrupt();
        }
        eU.Discord_Shutdown();
        eU.Discord_ClearPresence();
    }

    public static void update(String string) {
        _ap_0.eV.details = string;
    }
}

