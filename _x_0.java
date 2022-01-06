/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
 *  net.minecraft.tileentity.TileEntity
 */
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;

/*
 * Renamed from _x
 */
public class _x_0
extends _cv_0 {
    public double aP;
    public float qE;
    public TileEntity aM;
    public double aR;
    public int aO;
    public double aQ;
    public TileEntityRendererDispatcher aL;

    public void setStaticPlayerX(double d) {
        this.aP = d;
    }

    public double getStaticPlayerZ() {
        return this.aR;
    }

    public double getStaticPlayerY() {
        return this.aQ;
    }

    public double getStaticPlayerX() {
        return this.aP;
    }

    public int getDestroyStage() {
        return this.aO;
    }

    public void setTileentityIn(TileEntity tileEntity) {
        this.aM = tileEntity;
    }

    public _x_0(TileEntityRendererDispatcher tileEntityRendererDispatcher, TileEntity tileEntity, float f, int n, double d, double d2, double d3) {
        this.aL = tileEntityRendererDispatcher;
        this.aM = tileEntity;
        this.qE = f;
        this.aO = n;
        this.aP = d;
        this.aQ = d2;
        this.aR = d3;
    }

    public TileEntity getTileentityIn() {
        return this.aM;
    }

    public void setStaticPlayerY(double d) {
        this.aQ = d;
    }

    public void setTileEntityRendererDispatcher(TileEntityRendererDispatcher tileEntityRendererDispatcher) {
        this.aL = tileEntityRendererDispatcher;
    }

    @Override
    public float getPartialTicks() {
        return this.qE;
    }

    public TileEntityRendererDispatcher getTileEntityRendererDispatcher() {
        return this.aL;
    }

    public void setStaticPlayerZ(double d) {
        this.aR = d;
    }

    @Override
    public void setPartialTicks(float f) {
        this.qE = f;
    }

    public void setDestroyStage(int n) {
        this.aO = n;
    }
}

