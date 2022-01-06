/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from _cd
 */
public class _cd_0
extends _bd_0 {
    public static final int[] oZ = new int[]{0, 0, 0, 1, 0, 1, 1, 0};
    public int oX;
    public List<String> oY;

    public _cd_0(Object object, String string, String ... stringArray) {
        this.ju = string;
        this.oY = Arrays.asList(stringArray);
        this.oX = oZ[1];
    }

    public _cd_0(String string, String ... stringArray) {
        this.ju = string;
        this.oY = Arrays.asList(stringArray);
        this.oX = oZ[0];
    }

    public _cd_0(String string, _bA _bA2, String ... stringArray) {
        this.ju = string;
        this.oY = Arrays.asList(stringArray);
        this.oX = oZ[2];
    }

    public int getValue() {
        return this.oX;
    }

    public String getMode() {
        return this.oY.get(this.oX);
    }

    public boolean is(String string) {
        return this.oX == this.oY.indexOf(string) ? oZ[3] : oZ[4];
    }

    public void cycle() {
        this.oX = this.oX < this.oY.size() - oZ[5] ? (this.oX += oZ[6]) : oZ[7];
    }
}

