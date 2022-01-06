/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.awt.Font;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class _cK {
    public static final String[] se;
    public static Map<String, Font> sd;
    public static final int[] sf;
    public static _F sb;
    public static Font sc;
    public static volatile int rY;
    public static Font sa;
    public static _F rZ;

    public static void bootstrap() {
        _as_0.fx.info(se[sf[12]]);
        new Thread(() -> {
            sd = new HashMap<String, Font>();
            sa = _cK.getFont(sd, se[sf[19]], sf[20]);
            sc = _cK.getFont(sd, se[sf[21]], sf[22]);
            rY += sf[23];
        }).start();
        new Thread(() -> {
            HashMap hashMap = new HashMap();
            rY += sf[18];
        }).start();
        new Thread(() -> {
            HashMap hashMap = new HashMap();
            rY += sf[17];
        }).start();
        while (!_cK.hasLoaded()) {
        }
        rZ = new _F(sa, sf[13], sf[14]);
        sb = new _F(sc, sf[15], sf[16]);
    }

    static {
        sf = new int[]{0, 0, 1, 0, 0, 2, 3, 0, 18, 3, 1, 0, 4, 1, 1, 1, 1, 1, 1, 5, 18, 6, 40, 1, 7, 0, 1, 2, 3, 4, 5, 6};
        String[] stringArray = new String[sf[24]];
        stringArray[_cK.sf[25]] = "/assets/xeno/font/";
        stringArray[_cK.sf[26]] = ".ttf";
        stringArray[_cK.sf[27]] = "Error loading font";
        stringArray[_cK.sf[28]] = "default";
        stringArray[_cK.sf[29]] = "Initializing fonts...";
        stringArray[_cK.sf[30]] = "comfortaa";
        stringArray[_cK.sf[31]] = "comfortaa";
        se = stringArray;
        sd = new HashMap<String, Font>();
    }

    public static Font getFont(Map<String, Font> map, String string, int n) {
        Font font = null;
        Logger logger = LogManager.getLogger();
        try {
            if (map.containsKey(string)) {
                font = map.get(string).deriveFont(sf[0], n);
            } else {
                InputStream inputStream = _cX.class.getResourceAsStream(se[sf[1]] + string + se[sf[2]]);
                Font font2 = Font.createFont(sf[3], inputStream);
                map.put(string, font);
                font = font2.deriveFont(sf[4], n);
                inputStream.close();
            }
        }
        catch (Exception exception) {
            logger.error(se[sf[5]]);
            font = new Font(se[sf[6]], sf[7], sf[8]);
        }
        return font;
    }

    public static boolean hasLoaded() {
        return rY >= sf[9] ? sf[10] : sf[11];
    }
}

