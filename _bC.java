/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class _bC {
    public File lX;
    public _aE lZ;
    public File lV;
    public File lU;
    public _aE ma;
    public static final int[] mg = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64};
    public _aE mb;
    public _aE md;
    public File lT = new File(mf[mg[0]]);
    public static final String[] mf;
    public _aE me;
    public File lY;
    public _aE mc;
    public File lW;

    public void loadClickGUIConfig() {
        if (!this.lT.exists()) {
            this.lT.mkdirs();
        }
        if (!this.lX.exists()) {
            this.lX.mkdirs();
        }
        try {
            this.mb = _A.loadExistingConfiguration(new File(mf[mg[56]]));
        }
        catch (IOException iOException) {
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void saveModConfig(_bA _bA2) {
        if (!this.lT.exists()) {
            this.lT.mkdirs();
        }
        if (!this.lV.exists()) {
            this.lV.mkdirs();
        }
        if (!this.lW.exists()) {
            this.lW.mkdirs();
        }
        if (_bA2 instanceof _az_0) {
            return;
        }
        this.md = _bA2.lN ? _A.newConfiguration(new File(mf[mg[15]] + _bA2.lH + mf[mg[16]])) : _A.newConfiguration(new File(mf[mg[17]] + _bA2.lH + mf[mg[18]]));
        this.md.setBool(_bA2.lH, _bA2.isEnabled());
        for (_bd_0 _bd_02 : _bA2.lP) {
            try {
                if (_bd_02 instanceof _k_0) {
                    this.md.set(mf[mg[19]] + _bd_02.ju, ((_k_0)_bd_02).N);
                }
                if (_bd_02 instanceof _cJ) {
                    this.md.set(mf[mg[20]] + _bd_02.ju, ((_cJ)_bd_02).rT);
                }
                if (_bd_02 instanceof _cd_0) {
                    this.md.set(mf[mg[21]] + _bd_02.ju, ((_cd_0)_bd_02).oX);
                }
                if (_bd_02 instanceof _cO) {
                    this.md.set(mf[mg[22]] + _bd_02.getName(), ((_cO)_bd_02).getKeyCode());
                }
                if (_bd_02 instanceof _cA) {
                    this.md.set(mf[mg[23]] + _bd_02.getName() + mf[mg[24]], ((_cA)_bd_02).getColor().getRed());
                    this.md.set(mf[mg[25]] + _bd_02.getName() + mf[mg[26]], ((_cA)_bd_02).getColor().getGreen());
                    this.md.set(mf[mg[27]] + _bd_02.getName() + mf[mg[28]], ((_cA)_bd_02).getColor().getBlue());
                    this.md.set(mf[mg[29]] + _bd_02.getName() + mf[mg[30]], ((_cA)_bd_02).getColor().getAlpha());
                    this.md.set(mf[mg[31]] + _bd_02.getName() + mf[mg[32]], ((_cA)_bd_02).getRainbow());
                }
                if (!(_bd_02 instanceof _cs_0)) continue;
                this.md.set(mf[mg[33]] + _bd_02.getName(), ((_cs_0)_bd_02).getText());
            }
            catch (Exception exception) {}
        }
        try {
            this.md.save();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void loadHUDConfig() {
        if (!this.lT.exists()) {
            this.lT.mkdirs();
        }
        if (!this.lU.exists()) {
            this.lU.mkdirs();
        }
        try {
            this.lZ = _A.loadExistingConfiguration(new File(mf[mg[14]]));
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void saveMisc() {
        PrintWriter printWriter;
        if (!this.lT.exists()) {
            this.lT.mkdirs();
        }
        if (!this.lY.exists()) {
            this.lY.mkdirs();
        }
        try {
            printWriter = new PrintWriter(this.lY + mf[mg[61]]);
            printWriter.println(_bY.op);
            printWriter.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        try {
            printWriter = new PrintWriter(this.lY + mf[mg[62]]);
            printWriter.println(String.valueOf(_cp_0.qa));
            printWriter.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public void loadMisc() {
        String string;
        BufferedReader bufferedReader;
        if (!this.lT.exists()) {
            this.lT.mkdirs();
        }
        if (!this.lY.exists()) {
            this.lY.mkdirs();
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.lY + mf[mg[63]]));
            string = bufferedReader.readLine();
            _bY.op = Integer.parseInt(string);
            bufferedReader.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.lY + mf[mg[64]]));
            string = bufferedReader.readLine();
            _cp_0.qa = Boolean.parseBoolean(string);
            bufferedReader.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void saveClickGUIConfig() {
        if (!this.lT.exists()) {
            this.lT.mkdirs();
        }
        if (!this.lX.exists()) {
            this.lX.mkdirs();
        }
        for (_aS _aS2 : _aR.in) {
            this.me.set(_aS2.ix.name() + mf[mg[53]], _aS2.getX());
            this.me.set(_aS2.ix.name() + mf[mg[54]], _aS2.getY());
            this.me.set(_aS2.ix.name() + mf[mg[55]], _aS2.isOpen());
        }
        try {
            this.me.save();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void saveHudConfig() {
        if (!this.lT.exists()) {
            this.lT.mkdirs();
        }
        if (!this.lU.exists()) {
            this.lU.mkdirs();
        }
        for (_ct_0 object : _as_0.fF.iX) {
            this.mc.set(object.qo.toLowerCase() + mf[mg[8]], object.getX());
            this.mc.set(object.qo.toLowerCase() + mf[mg[9]], object.getY());
            this.mc.set(object.qo.toLowerCase() + mf[mg[10]], object.qq.lM);
        }
        for (_aS _aS2 : _bI.mM) {
            this.mc.set(_aS2.ix.name() + mf[mg[11]], _aS2.getX());
            this.mc.set(_aS2.ix.name() + mf[mg[12]], _aS2.getY());
            this.mc.set(_aS2.ix.name() + mf[mg[13]], _aS2.isOpen());
        }
        try {
            this.mc.save();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public void saveFriendConfig() {
        File file;
        if (!this.lT.exists()) {
            this.lT.mkdirs();
        }
        if (!this.lY.exists()) {
            this.lY.mkdirs();
        }
        if (!(file = new File(this.lY + mf[mg[57]])).exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        try {
            PrintWriter printWriter = new PrintWriter(this.lY + mf[mg[58]]);
            for (_cB _cB2 : _bn_0.ki) {
                printWriter.println(_cB2.getName());
            }
            printWriter.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public void loadModConfig() {
        if (!this.lT.exists()) {
            this.lT.mkdirs();
        }
        if (!this.lV.exists()) {
            this.lV.mkdirs();
        }
        if (!this.lW.exists()) {
            this.lW.mkdirs();
        }
        for (_bA _bA2 : _D.bg) {
            try {
                if (_bA2 instanceof _az_0) continue;
                this.ma = !_bA2.lN ? _A.loadExistingConfiguration(new File(mf[mg[34]] + _bA2.lH + mf[mg[35]])) : _A.loadExistingConfiguration(new File(mf[mg[36]] + _bA2.lH + mf[mg[37]]));
                _bA2.lM = (Boolean)this.ma.get(_bA2.lH);
                if (_bA2.lM) {
                    try {
                        _bA2.enable();
                    }
                    catch (Exception exception) {
                        // empty catch block
                    }
                }
                for (_bd_0 _bd_02 : _bA2.lP) {
                    try {
                        if (_bd_02 instanceof _k_0) {
                            ((_k_0)_bd_02).setEnabled(this.ma.getBoolean(mf[mg[38]] + _bd_02.getName()));
                        }
                        if (_bd_02 instanceof _cJ) {
                            ((_cJ)_bd_02).setValue(this.ma.getDouble(mf[mg[39]] + _bd_02.getName(), ((_cJ)_bd_02).rX));
                        }
                        if (_bd_02 instanceof _cd_0) {
                            ((_cd_0)_bd_02).oX = (Integer)this.ma.get(mf[mg[40]] + _bd_02.ju);
                        }
                        if (_bd_02 instanceof _cO) {
                            ((_cO)_bd_02).setKeyCode((int)this.ma.getDouble(mf[mg[41]] + _bd_02.getName(), Double.valueOf(((_cO)_bd_02).sy)));
                        }
                        if (_bd_02 instanceof _cA) {
                            Color color = new Color((Integer)this.ma.get(mf[mg[42]] + _bd_02.getName() + mf[mg[43]]), (Integer)this.ma.get(mf[mg[44]] + _bd_02.getName() + mf[mg[45]]), (Integer)this.ma.get(mf[mg[46]] + _bd_02.getName() + mf[mg[47]]), (Integer)this.ma.get(mf[mg[48]] + _bd_02.getName() + mf[mg[49]]));
                            ((_cA)_bd_02).setValue(new _cV(color));
                            ((_cA)_bd_02).setRainbow(this.ma.getBoolean(mf[mg[50]] + _bd_02.getName() + mf[mg[51]]));
                        }
                        if (!(_bd_02 instanceof _cs_0)) continue;
                        ((_cs_0)_bd_02).setText((String)this.ma.get(mf[mg[52]] + _bd_02.getName()));
                    }
                    catch (Exception exception) {}
                }
            }
            catch (IOException iOException) {
            }
            catch (NumberFormatException numberFormatException) {
            }
            catch (NullPointerException nullPointerException) {
            }
        }
    }

    public void savePreset(_D _D2) {
    }

    static {
        String[] stringArray = new String[mg[65]];
        stringArray[_bC.mg[66]] = "Xeno";
        stringArray[_bC.mg[67]] = "Xeno/HUD";
        stringArray[_bC.mg[68]] = "Xeno/Modules";
        stringArray[_bC.mg[69]] = "Xeno/HUD/ParentModules";
        stringArray[_bC.mg[70]] = "Xeno/ClickGUI";
        stringArray[_bC.mg[71]] = "Xeno/Misc";
        stringArray[_bC.mg[72]] = "Xeno/HUD/HudConfiguration.json";
        stringArray[_bC.mg[73]] = "Xeno/ClickGUI/ClickGUI.json";
        stringArray[_bC.mg[74]] = "X";
        stringArray[_bC.mg[75]] = "Y";
        stringArray[_bC.mg[76]] = "Enabled";
        stringArray[_bC.mg[77]] = "X";
        stringArray[_bC.mg[78]] = "Y";
        stringArray[_bC.mg[79]] = "Open";
        stringArray[_bC.mg[80]] = "Xeno/HUD/HudConfiguration.json";
        stringArray[_bC.mg[81]] = "Xeno/HUD/ParentModules";
        stringArray[_bC.mg[82]] = ".json";
        stringArray[_bC.mg[83]] = "Xeno/Modules/";
        stringArray[_bC.mg[84]] = ".json";
        stringArray[_bC.mg[85]] = "Bool_";
        stringArray[_bC.mg[86]] = "Num_";
        stringArray[_bC.mg[87]] = "Mode_";
        stringArray[_bC.mg[88]] = "Key_";
        stringArray[_bC.mg[89]] = "Col_";
        stringArray[_bC.mg[90]] = " R";
        stringArray[_bC.mg[91]] = "Col_";
        stringArray[_bC.mg[92]] = " G";
        stringArray[_bC.mg[93]] = "Col_";
        stringArray[_bC.mg[94]] = " B";
        stringArray[_bC.mg[95]] = "Col_";
        stringArray[_bC.mg[96]] = " A";
        stringArray[_bC.mg[97]] = "Col_";
        stringArray[_bC.mg[98]] = " Rainbow";
        stringArray[_bC.mg[99]] = "Str_";
        stringArray[_bC.mg[100]] = "Xeno/Modules/";
        stringArray[_bC.mg[101]] = ".json";
        stringArray[_bC.mg[102]] = "Xeno/HUD/ParentModules";
        stringArray[_bC.mg[103]] = ".json";
        stringArray[_bC.mg[104]] = "Bool_";
        stringArray[_bC.mg[105]] = "Num_";
        stringArray[_bC.mg[106]] = "Mode_";
        stringArray[_bC.mg[107]] = "Key_";
        stringArray[_bC.mg[108]] = "Col_";
        stringArray[_bC.mg[109]] = " R";
        stringArray[_bC.mg[110]] = "Col_";
        stringArray[_bC.mg[111]] = " G";
        stringArray[_bC.mg[112]] = "Col_";
        stringArray[_bC.mg[113]] = " B";
        stringArray[_bC.mg[114]] = "Col_";
        stringArray[_bC.mg[115]] = " A";
        stringArray[_bC.mg[116]] = "Col_";
        stringArray[_bC.mg[117]] = " Rainbow";
        stringArray[_bC.mg[118]] = "Str_";
        stringArray[_bC.mg[119]] = "X";
        stringArray[_bC.mg[120]] = "Y";
        stringArray[_bC.mg[121]] = "Open";
        stringArray[_bC.mg[122]] = "Xeno/ClickGUI/ClickGUI.json";
        stringArray[_bC.mg[123]] = "/Friends.Xeno";
        stringArray[_bC.mg[124]] = "/Friends.Xeno";
        stringArray[_bC.mg[125]] = "/Friends.Xeno";
        stringArray[_bC.mg[126]] = "Added friend: ";
        stringArray[_bC.mg[127]] = "/ElytraFlyActivate.Xeno";
        stringArray[_bC.mg[128]] = "/CustomMainMenu.Xeno";
        stringArray[_bC.mg[129]] = "/ElytraFlyActivate.Xeno";
        stringArray[_bC.mg[130]] = "/CustomMainMenu.Xeno";
        mf = stringArray;
    }

    public void loadFriendConfig() {
        if (!this.lT.exists()) {
            this.lT.mkdirs();
        }
        if (!this.lY.exists()) {
            this.lY.mkdirs();
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.lY + mf[mg[59]]));
            String string = bufferedReader.readLine();
            while (string != null) {
                arrayList.add(string);
                string = bufferedReader.readLine();
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
        for (String string : arrayList) {
            _as_0.fH.addFriend(string);
            _as_0.fx.info(mf[mg[60]] + string);
        }
    }

    public _bC() {
        this.lU = new File(mf[mg[1]]);
        this.lV = new File(mf[mg[2]]);
        this.lW = new File(mf[mg[3]]);
        this.lX = new File(mf[mg[4]]);
        this.lY = new File(mf[mg[5]]);
        this.mc = _A.newConfiguration(new File(mf[mg[6]]));
        this.me = _A.newConfiguration(new File(mf[mg[7]]));
    }
}

