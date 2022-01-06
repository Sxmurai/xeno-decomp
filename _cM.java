/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class _cM {
    public List<String> sn = new ArrayList<String>();
    public String sk;
    public String sl;
    public String sm;

    public void setAliases(List<String> list) {
        this.sn = list;
    }

    public void setSyntax(String string) {
        this.sm = string;
    }

    public void setDescription(String string) {
        this.sl = string;
    }

    public void setName(String string) {
        this.sk = string;
    }

    public List<String> getAliases() {
        return this.sn;
    }

    public abstract void onCommand(String[] var1, String var2);

    public String getName() {
        return this.sk;
    }

    public _cM(String string, String string2, String string3, String ... stringArray) {
        this.sk = string;
        this.sl = string2;
        this.sm = string3;
        this.sn = Arrays.asList(stringArray);
    }

    public String getDescription() {
        return this.sl;
    }

    public String getSyntax() {
        return this.sm;
    }
}

