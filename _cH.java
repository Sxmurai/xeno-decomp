/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
import net.minecraft.util.math.BlockPos;

public class _cH {
    public BlockPos rC;
    public _aM rA;
    public _aH rz;
    public BlockPos rB;

    public _cH(_aH _aH2, _aM _aM2, BlockPos blockPos, BlockPos blockPos2) {
        this.rz = _aH2;
        this.rA = _aM2;
        this.rB = blockPos;
        this.rC = blockPos2;
    }

    public _cH(_aH _aH2, _aM _aM2, BlockPos blockPos) {
        this.rz = _aH2;
        this.rA = _aM2;
        this.rB = blockPos;
    }

    public _aM opposite() {
        if (this.rA == _aM.hI) {
            return _aM.hL;
        }
        if (this.rA == _aM.hL) {
            return _aM.hI;
        }
        if (this.rA == _aM.hK) {
            return _aM.hJ;
        }
        if (this.rA == _aM.hJ) {
            return _aM.hK;
        }
        return _aM.hM;
    }
}

