/*
 * Decompiled with CFR 0.152.
 */
public class _cJ
extends _bd_0 {
    public double rU;
    public double rV;
    public double rX;
    public double rT;
    public double rW;

    public void setValue(float f) {
        double d = 1.0 / this.rW;
        this.rT = (double)Math.round(Math.max(this.rU, Math.min(this.rV, (double)f)) * d) / d;
    }

    public double getVal() {
        return this.rT;
    }

    public void setValue(double d) {
        double d2 = 1.0 / this.rW;
        this.rT = (double)Math.round(Math.max(this.rU, Math.min(this.rV, d)) * d2) / d2;
    }

    public void setVal(double d) {
        this.rT = d;
    }

    public double getMinimum() {
        return this.rU;
    }

    public _cJ(Object object, String string, double d, double d2, double d3, double d4) {
        this.ju = string;
        this.rT = d;
        this.rX = d;
        this.rU = d2;
        this.rV = d3;
        this.rW = d4;
    }

    public double getMaximum() {
        return this.rV;
    }

    public _cJ(String string, double d, double d2, double d3, double d4) {
        this.ju = string;
        this.rT = d;
        this.rX = d;
        this.rU = d2;
        this.rV = d3;
        this.rW = d4;
    }

    public int getIntValue() {
        return (int)this.rT;
    }

    public void setValue(int n) {
        double d = 1.0 / this.rW;
        this.rT = (double)Math.round(Math.max(this.rU, Math.min(this.rV, (double)n)) * d) / d;
    }

    public double getDoubleValue() {
        return this.rT;
    }

    public _cJ(String string, _bA _bA2, double d, double d2, double d3, double d4) {
        this.ju = string;
        this.rT = d;
        this.rX = d;
        this.rU = d2;
        this.rV = d3;
        this.rW = d4;
    }

    public float getFloatValue() {
        return (float)this.rT;
    }
}

