/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class _aE {
    public Map<String, Object> gT;
    public File gS;
    public static final int[] gU = new int[]{4};

    public _aE(File file) {
        this.gS = file;
        this.gT = new HashMap<String, Object>();
    }

    public _aE() {
        this.gS = null;
        this.gT = new HashMap<String, Object>();
    }

    public void setBool(String string, Boolean bl) {
        this.gT.put(string, bl);
    }

    public double getDouble(String string, Double d) {
        try {
            String string2 = String.valueOf(this.gT.get(string));
            double d2 = Double.parseDouble(string2);
            return d2;
        }
        catch (NumberFormatException numberFormatException) {
            return d;
        }
    }

    public void save() throws IOException {
        JSONObject jSONObject = new JSONObject(this.gT);
        this.gS.createNewFile();
        FileWriter fileWriter = new FileWriter(this.gS);
        try {
            fileWriter.write(jSONObject.toString(gU[0]));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        fileWriter.flush();
        fileWriter.close();
    }

    public void set(String string, Object object) {
        this.gT.put(string, object);
    }

    public boolean getBoolean(String string) {
        return (Boolean)this.gT.get(string);
    }

    public float getFloat(String string) {
        return ((Float)this.gT.get(string)).floatValue();
    }

    public Object get(String string) {
        return this.gT.get(string);
    }

    public _aE(File file, Map<String, Object> map) {
        this.gS = file;
        this.gT = map;
    }
}

