/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.FileUtils
 */
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

public class _A {
    public static _aE newConfiguration(File file) {
        return new _aE(file);
    }

    public static _aE loadExistingConfiguration(File file) throws IOException {
        JSONObject jSONObject = new JSONObject(FileUtils.readFileToString((File)file, (Charset)Charsets.UTF_8));
        return new _aE(file, jSONObject.toMap());
    }
}

