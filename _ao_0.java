//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

/*
 * Renamed from _ao
 */
public class _ao_0
implements _cf_0 {
    public static final int[] pd = new int[]{-1, 127, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 2, 0, 1, 2, 0, 0, 8, 0, 2, 0, 0, 1, 1, 0, 1, 2, 1, 0, -1, 3, -1, 0, 0, 4, 0, 0, 1, 5, 0, 0, -1, 6, 0, -1, 0, 7, 1, -1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 2, 0, 0, 2, 1, 0, 8, 0, 0, 0, 2, 1, 1, 0, 1, 2, -1, 0, 1, 3, 0, 0, -1, 4, 1, 0, 0, 5, -1, 0, 0, 6, 0, -1, 0, 7, 0, -1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 2, 0, 1, 2, 0, 0, 8, 0, 2, 0, 0, 1, 1, 0, 1, 2, 1, 0, -1, 3, -1, 0, 0, 4, 0, 0, 1, 5, 0, 0, -1, 6, 0, -1, 0, 7, 1, -1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 2, 0, 0, 2, 1, 0, 8, 0, 0, 0, 2, 1, 1, 0, 1, 2, -1, 0, 1, 3, 0, 0, -1, 4, 1, 0, 0, 5, -1, 0, 0, 6, 0, -1, 0, 7, 0, -1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, -1, 0, 0, -1, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 1, 0, -1, 0, 0, -1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, -1, 1, 0, 0, -1, 0, 0, 0, 0, 1, 0, -1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, -1, 0, 0, -1, 1, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 1, 0, 0, 1, 0, -1, 0, 0, -1, 0, 1, 0};

    public static boolean isDoubleBedrockHoleZ(BlockPos blockPos) {
        if (!_ao_0.pb.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[60], pd[61], pd[62])).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[63], pd[64], pd[65])).getBlock().equals(Blocks.AIR) && !_ao_0.pb.world.getBlockState(blockPos.add(pd[66], pd[67], pd[68])).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[69], pd[70], pd[71])).getBlock().equals(Blocks.AIR) && !_ao_0.pb.world.getBlockState(blockPos.add(pd[72], pd[73], pd[74])).getBlock().equals(Blocks.AIR)) {
            return pd[75];
        }
        BlockPos[] blockPosArray = new BlockPos[pd[76]];
        blockPosArray[_ao_0.pd[77]] = blockPos.add(pd[78], pd[79], pd[80]);
        blockPosArray[_ao_0.pd[81]] = blockPos.add(pd[82], pd[83], pd[84]);
        blockPosArray[_ao_0.pd[85]] = blockPos.add(pd[86], pd[87], pd[88]);
        blockPosArray[_ao_0.pd[89]] = blockPos.add(pd[90], pd[91], pd[92]);
        blockPosArray[_ao_0.pd[93]] = blockPos.add(pd[94], pd[95], pd[96]);
        blockPosArray[_ao_0.pd[97]] = blockPos.add(pd[98], pd[99], pd[100]);
        blockPosArray[_ao_0.pd[101]] = blockPos.add(pd[102], pd[103], pd[104]);
        blockPosArray[_ao_0.pd[105]] = blockPos.add(pd[106], pd[107], pd[108]);
        BlockPos[] blockPosArray2 = blockPosArray;
        int n = blockPosArray2.length;
        for (int i = pd[109]; i < n; ++i) {
            BlockPos blockPos2 = blockPosArray2[i];
            IBlockState iBlockState = _ao_0.pb.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() != Blocks.AIR && iBlockState.getBlock() == Blocks.BEDROCK) continue;
            return pd[110];
        }
        return pd[111];
    }

    public static boolean isInHole(EntityPlayer entityPlayer) {
        return _ao_0.isHole(new BlockPos(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ));
    }

    public static List<_cH> getHoles(double d) {
        ArrayList<_cH> arrayList = new ArrayList<_cH>();
        for (BlockPos blockPos : _cE.getNearbyBlocks((EntityPlayer)_ao_0.pb.player, d, pd[6])) {
            if (_ao_0.isObsidianHole(blockPos)) {
                arrayList.add(new _cH(_aH.hj, _aM.hM, blockPos));
            }
            if (!_ao_0.isBedRockHole(blockPos)) continue;
            arrayList.add(new _cH(_aH.hk, _aM.hM, blockPos));
        }
        return arrayList;
    }

    public static boolean isVoidHole(BlockPos blockPos) {
        return (_ao_0.pb.player.dimension == pd[0] ? ((blockPos.getY() == 0 || blockPos.getY() == pd[1]) && _cE.getBlockResistance(blockPos) == _aG.hc ? pd[2] : pd[3]) : (blockPos.getY() == 0 && _cE.getBlockResistance(blockPos) == _aG.hc ? pd[4] : pd[5])) != 0;
    }

    public static boolean isDoubleBedrockHoleX(BlockPos blockPos) {
        if (!_ao_0.pb.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[8], pd[9], pd[10])).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[11], pd[12], pd[13])).getBlock().equals(Blocks.AIR) && !_ao_0.pb.world.getBlockState(blockPos.add(pd[14], pd[15], pd[16])).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[17], pd[18], pd[19])).getBlock().equals(Blocks.AIR) && !_ao_0.pb.world.getBlockState(blockPos.add(pd[20], pd[21], pd[22])).getBlock().equals(Blocks.AIR)) {
            return pd[23];
        }
        BlockPos[] blockPosArray = new BlockPos[pd[24]];
        blockPosArray[_ao_0.pd[25]] = blockPos.add(pd[26], pd[27], pd[28]);
        blockPosArray[_ao_0.pd[29]] = blockPos.add(pd[30], pd[31], pd[32]);
        blockPosArray[_ao_0.pd[33]] = blockPos.add(pd[34], pd[35], pd[36]);
        blockPosArray[_ao_0.pd[37]] = blockPos.add(pd[38], pd[39], pd[40]);
        blockPosArray[_ao_0.pd[41]] = blockPos.add(pd[42], pd[43], pd[44]);
        blockPosArray[_ao_0.pd[45]] = blockPos.add(pd[46], pd[47], pd[48]);
        blockPosArray[_ao_0.pd[49]] = blockPos.add(pd[50], pd[51], pd[52]);
        blockPosArray[_ao_0.pd[53]] = blockPos.add(pd[54], pd[55], pd[56]);
        BlockPos[] blockPosArray2 = blockPosArray;
        int n = blockPosArray2.length;
        for (int i = pd[57]; i < n; ++i) {
            BlockPos blockPos2 = blockPosArray2[i];
            IBlockState iBlockState = _ao_0.pb.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() != Blocks.AIR && iBlockState.getBlock() == Blocks.BEDROCK) continue;
            return pd[58];
        }
        return pd[59];
    }

    public static boolean isBedRockHole(BlockPos blockPos) {
        return (_cE.getBlockResistance(blockPos.add(pd[257], pd[258], pd[259])) == _aG.hc && _cE.getBlockResistance(blockPos.add(pd[260], pd[261], pd[262])) == _aG.hc && _cE.getBlockResistance(blockPos.add(pd[263], pd[264], pd[265])) == _aG.hc && _cE.getBlockResistance(blockPos.add(pd[266], pd[267], pd[268])) == _aG.hf && _cE.getBlockResistance(blockPos.add(pd[269], pd[270], pd[271])) == _aG.hf && _cE.getBlockResistance(blockPos.add(pd[272], pd[273], pd[274])) == _aG.hf && _cE.getBlockResistance(blockPos.add(pd[275], pd[276], pd[277])) == _aG.hf && _cE.getBlockResistance(blockPos.add(0.5, 0.5, 0.5)) == _aG.hc && _cE.getBlockResistance(blockPos.add(pd[278], pd[279], pd[280])) == _aG.hf ? pd[281] : pd[282]) != 0;
    }

    public static boolean isDoubleObsidianHoleX(BlockPos blockPos) {
        if (!_ao_0.pb.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[112], pd[113], pd[114])).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[115], pd[116], pd[117])).getBlock().equals(Blocks.AIR) && !_ao_0.pb.world.getBlockState(blockPos.add(pd[118], pd[119], pd[120])).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[121], pd[122], pd[123])).getBlock().equals(Blocks.AIR) && !_ao_0.pb.world.getBlockState(blockPos.add(pd[124], pd[125], pd[126])).getBlock().equals(Blocks.AIR)) {
            return pd[127];
        }
        BlockPos[] blockPosArray = new BlockPos[pd[128]];
        blockPosArray[_ao_0.pd[129]] = blockPos.add(pd[130], pd[131], pd[132]);
        blockPosArray[_ao_0.pd[133]] = blockPos.add(pd[134], pd[135], pd[136]);
        blockPosArray[_ao_0.pd[137]] = blockPos.add(pd[138], pd[139], pd[140]);
        blockPosArray[_ao_0.pd[141]] = blockPos.add(pd[142], pd[143], pd[144]);
        blockPosArray[_ao_0.pd[145]] = blockPos.add(pd[146], pd[147], pd[148]);
        blockPosArray[_ao_0.pd[149]] = blockPos.add(pd[150], pd[151], pd[152]);
        blockPosArray[_ao_0.pd[153]] = blockPos.add(pd[154], pd[155], pd[156]);
        blockPosArray[_ao_0.pd[157]] = blockPos.add(pd[158], pd[159], pd[160]);
        BlockPos[] blockPosArray2 = blockPosArray;
        int n = blockPosArray2.length;
        for (int i = pd[161]; i < n; ++i) {
            BlockPos blockPos2 = blockPosArray2[i];
            IBlockState iBlockState = _ao_0.pb.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() != Blocks.AIR && iBlockState.getBlock() == Blocks.OBSIDIAN) continue;
            return pd[162];
        }
        return pd[163];
    }

    public static boolean isDoubleObsidianHoleZ(BlockPos blockPos) {
        if (!_ao_0.pb.world.getBlockState(blockPos).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[164], pd[165], pd[166])).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[167], pd[168], pd[169])).getBlock().equals(Blocks.AIR) && !_ao_0.pb.world.getBlockState(blockPos.add(pd[170], pd[171], pd[172])).getBlock().equals(Blocks.AIR) || !_ao_0.pb.world.getBlockState(blockPos.add(pd[173], pd[174], pd[175])).getBlock().equals(Blocks.AIR) && !_ao_0.pb.world.getBlockState(blockPos.add(pd[176], pd[177], pd[178])).getBlock().equals(Blocks.AIR)) {
            return pd[179];
        }
        BlockPos[] blockPosArray = new BlockPos[pd[180]];
        blockPosArray[_ao_0.pd[181]] = blockPos.add(pd[182], pd[183], pd[184]);
        blockPosArray[_ao_0.pd[185]] = blockPos.add(pd[186], pd[187], pd[188]);
        blockPosArray[_ao_0.pd[189]] = blockPos.add(pd[190], pd[191], pd[192]);
        blockPosArray[_ao_0.pd[193]] = blockPos.add(pd[194], pd[195], pd[196]);
        blockPosArray[_ao_0.pd[197]] = blockPos.add(pd[198], pd[199], pd[200]);
        blockPosArray[_ao_0.pd[201]] = blockPos.add(pd[202], pd[203], pd[204]);
        blockPosArray[_ao_0.pd[205]] = blockPos.add(pd[206], pd[207], pd[208]);
        blockPosArray[_ao_0.pd[209]] = blockPos.add(pd[210], pd[211], pd[212]);
        BlockPos[] blockPosArray2 = blockPosArray;
        int n = blockPosArray2.length;
        for (int i = pd[213]; i < n; ++i) {
            BlockPos blockPos2 = blockPosArray2[i];
            IBlockState iBlockState = _ao_0.pb.world.getBlockState(blockPos2);
            if (iBlockState.getBlock() != Blocks.AIR && iBlockState.getBlock() == Blocks.OBSIDIAN) continue;
            return pd[214];
        }
        return pd[215];
    }

    public static boolean isHole(BlockPos blockPos) {
        return (!(_cE.getBlockResistance(blockPos.add(pd[283], pd[284], pd[285])) != _aG.hc || _cE.getBlockResistance(blockPos.add(pd[286], pd[287], pd[288])) != _aG.hc || _cE.getBlockResistance(blockPos.add(pd[289], pd[290], pd[291])) != _aG.hc || _cE.getBlockResistance(blockPos.add(pd[292], pd[293], pd[294])) != _aG.he && _cE.getBlockResistance(blockPos.add(pd[295], pd[296], pd[297])) != _aG.hf || _cE.getBlockResistance(blockPos.add(pd[298], pd[299], pd[300])) != _aG.he && _cE.getBlockResistance(blockPos.add(pd[301], pd[302], pd[303])) != _aG.hf || _cE.getBlockResistance(blockPos.add(pd[304], pd[305], pd[306])) != _aG.he && _cE.getBlockResistance(blockPos.add(pd[307], pd[308], pd[309])) != _aG.hf || _cE.getBlockResistance(blockPos.add(pd[310], pd[311], pd[312])) != _aG.he && _cE.getBlockResistance(blockPos.add(pd[313], pd[314], pd[315])) != _aG.hf || _cE.getBlockResistance(blockPos.add(0.5, 0.5, 0.5)) != _aG.hc || _cE.getBlockResistance(blockPos.add(pd[316], pd[317], pd[318])) != _aG.he && _cE.getBlockResistance(blockPos.add(pd[319], pd[320], pd[321])) != _aG.hf) ? pd[322] : pd[323]) != 0;
    }

    public static boolean isObsidianHole(BlockPos blockPos) {
        return (!(_cE.getBlockResistance(blockPos.add(pd[216], pd[217], pd[218])) != _aG.hc || _ao_0.isBedRockHole(blockPos) || _cE.getBlockResistance(blockPos.add(pd[219], pd[220], pd[221])) != _aG.hc || _cE.getBlockResistance(blockPos.add(pd[222], pd[223], pd[224])) != _aG.hc || _cE.getBlockResistance(blockPos.add(pd[225], pd[226], pd[227])) != _aG.he && _cE.getBlockResistance(blockPos.add(pd[228], pd[229], pd[230])) != _aG.hf || _cE.getBlockResistance(blockPos.add(pd[231], pd[232], pd[233])) != _aG.he && _cE.getBlockResistance(blockPos.add(pd[234], pd[235], pd[236])) != _aG.hf || _cE.getBlockResistance(blockPos.add(pd[237], pd[238], pd[239])) != _aG.he && _cE.getBlockResistance(blockPos.add(pd[240], pd[241], pd[242])) != _aG.hf || _cE.getBlockResistance(blockPos.add(pd[243], pd[244], pd[245])) != _aG.he && _cE.getBlockResistance(blockPos.add(pd[246], pd[247], pd[248])) != _aG.hf || _cE.getBlockResistance(blockPos.add(0.5, 0.5, 0.5)) != _aG.hc || _cE.getBlockResistance(blockPos.add(pd[249], pd[250], pd[251])) != _aG.he && _cE.getBlockResistance(blockPos.add(pd[252], pd[253], pd[254])) != _aG.hf) ? pd[255] : pd[256]) != 0;
    }

    public static List<_cH> getHoles(double d, EntityPlayer entityPlayer) {
        ArrayList<_cH> arrayList = new ArrayList<_cH>();
        for (BlockPos blockPos : _cE.getNearbyBlocks(entityPlayer, d, pd[7])) {
            if (_ao_0.isObsidianHole(blockPos)) {
                arrayList.add(new _cH(_aH.hj, _aM.hM, blockPos));
            }
            if (!_ao_0.isBedRockHole(blockPos)) continue;
            arrayList.add(new _cH(_aH.hk, _aM.hM, blockPos));
        }
        return arrayList;
    }
}

