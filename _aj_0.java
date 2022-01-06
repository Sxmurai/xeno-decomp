//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.tileentity.TileEntityChest
 *  net.minecraft.tileentity.TileEntityEnderChest
 *  net.minecraft.tileentity.TileEntityShulkerBox
 *  net.minecraft.util.math.BlockPos
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from _aj
 */
public class _aj_0
extends _bA {
    public static _aj_0 er;
    @EventHandler
    public final Listener<_x_0> et;
    public static _cJ eq;
    public _cd_0 es;
    public static _cA el;
    public static _cA en;
    public static _cA ep;
    public _k_0 em = new _k_0(lQ[pd[3]], pd[4]);
    public static final String[] lQ;
    public static _k_0 ek;
    public _k_0 eo = new _k_0(lQ[pd[5]], pd[6]);
    public static final int[] pd;

    @Override
    public void onRenderWorld() {
        for (Object e : this.pb.world.loadedTileEntityList) {
            if (this.es.is(lQ[pd[25]])) {
                if (e instanceof TileEntityChest && _aj_0.ek.N) {
                    _ag_0.blockESPBox(((TileEntity)e).getPos(), (float)eq.getDoubleValue(), el.getColor(), pd[26]);
                }
                if (e instanceof TileEntityShulkerBox && this.em.N) {
                    _ag_0.blockESPBox(((TileEntity)e).getPos(), (float)eq.getDoubleValue(), en.getColor(), pd[27]);
                }
                if (e instanceof TileEntityEnderChest && this.eo.N) {
                    _ag_0.blockESPBox(((TileEntity)e).getPos(), (float)eq.getDoubleValue(), ep.getColor(), pd[28]);
                }
            }
            if (!this.es.is(lQ[pd[29]])) continue;
            if (e instanceof TileEntityChest && _aj_0.ek.N) {
                _ag_0.solidBlockESPBox(((TileEntity)e).getPos(), (float)eq.getDoubleValue(), el.getColor(), 1.0f);
            }
            if (e instanceof TileEntityShulkerBox && this.em.N) {
                _ag_0.solidBlockESPBox(((TileEntity)e).getPos(), (float)eq.getDoubleValue(), en.getColor(), 1.0f);
            }
            if (!(e instanceof TileEntityEnderChest) || !this.eo.N) continue;
            _ag_0.solidBlockESPBox(((TileEntity)e).getPos(), (float)eq.getDoubleValue(), ep.getColor(), 1.0f);
        }
    }

    public _aj_0() {
        super(lQ[pd[0]], lQ[pd[1]], pd[2], _aL.hz);
        String[] stringArray = new String[pd[8]];
        stringArray[_aj_0.pd[9]] = lQ[pd[10]];
        stringArray[_aj_0.pd[11]] = lQ[pd[12]];
        stringArray[_aj_0.pd[13]] = lQ[pd[14]];
        this.es = new _cd_0(lQ[pd[7]], stringArray);
        this.et = new Listener<_x_0>(_x_02 -> {
            if (this.es.is(lQ[pd[31]])) {
                BlockPos blockPos;
                int n;
                float f;
                TileEntity tileEntity;
                GL11.glPushMatrix();
                GlStateManager.depthMask((boolean)pd[32]);
                int n2 = pd[33];
                if (Minecraft.getMinecraft().world != null && _x_02.getTileentityIn() instanceof TileEntityChest && _aj_0.ek.N) {
                    tileEntity = _x_02.getTileentityIn();
                    f = _x_02.getPartialTicks();
                    n = _x_02.getDestroyStage();
                    blockPos = tileEntity.getPos();
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderOne((float)_aj_0.eq.rT * (float)n2);
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderTwo();
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderThree();
                    _bi_0.renderFour(el.getColor());
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderFive();
                }
                if (Minecraft.getMinecraft().world != null && _x_02.getTileentityIn() instanceof TileEntityShulkerBox && this.em.N) {
                    tileEntity = _x_02.getTileentityIn();
                    f = _x_02.getPartialTicks();
                    n = _x_02.getDestroyStage();
                    blockPos = tileEntity.getPos();
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderOne((float)_aj_0.eq.rT * (float)n2);
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderTwo();
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderThree();
                    _bi_0.renderFour(en.getColor());
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderFive();
                }
                if (Minecraft.getMinecraft().world != null && _x_02.getTileentityIn() instanceof TileEntityEnderChest && this.eo.N) {
                    tileEntity = _x_02.getTileentityIn();
                    f = _x_02.getPartialTicks();
                    n = _x_02.getDestroyStage();
                    blockPos = tileEntity.getPos();
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderOne((float)_aj_0.eq.rT * (float)n2);
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderTwo();
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderThree();
                    _bi_0.renderFour(ep.getColor());
                    _x_02.getTileEntityRendererDispatcher().render(tileEntity, (double)blockPos.getX() - _x_02.getStaticPlayerX(), (double)blockPos.getY() - _x_02.getStaticPlayerY(), (double)blockPos.getZ() - _x_02.getStaticPlayerZ(), f);
                    _bi_0.renderFive();
                }
                GL11.glPopMatrix();
            }
        }, new Predicate[pd[15]]);
        _bd_0[] _bd_0Array = new _bd_0[pd[16]];
        _bd_0Array[_aj_0.pd[17]] = ek;
        _bd_0Array[_aj_0.pd[18]] = this.em;
        _bd_0Array[_aj_0.pd[19]] = this.eo;
        _bd_0Array[_aj_0.pd[20]] = el;
        _bd_0Array[_aj_0.pd[21]] = en;
        _bd_0Array[_aj_0.pd[22]] = ep;
        _bd_0Array[_aj_0.pd[23]] = eq;
        _bd_0Array[_aj_0.pd[24]] = this.es;
        this.addSettings(_bd_0Array);
    }

    static {
        pd = new int[]{0, 1, 0, 2, 1, 3, 1, 4, 3, 0, 5, 1, 6, 2, 7, 0, 8, 0, 1, 2, 3, 4, 5, 6, 7, 8, 1, 1, 1, 9, 10, 11, 1, 1, 17, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 12, 1, 13, 14, 15, 16};
        String[] stringArray = new String[pd[34]];
        stringArray[_aj_0.pd[35]] = "StorageESP";
        stringArray[_aj_0.pd[36]] = "highlights storage blocks eg chests";
        stringArray[_aj_0.pd[37]] = "Shulkers";
        stringArray[_aj_0.pd[38]] = "EnderChests";
        stringArray[_aj_0.pd[39]] = "Mode";
        stringArray[_aj_0.pd[40]] = "Outline";
        stringArray[_aj_0.pd[41]] = "Box";
        stringArray[_aj_0.pd[42]] = "FilledBox";
        stringArray[_aj_0.pd[43]] = "Box";
        stringArray[_aj_0.pd[44]] = "FilledBox";
        stringArray[_aj_0.pd[45]] = " ";
        stringArray[_aj_0.pd[46]] = "Outline";
        stringArray[_aj_0.pd[47]] = "Chests";
        stringArray[_aj_0.pd[48]] = "Chest Colour";
        stringArray[_aj_0.pd[49]] = "Shulker Colour";
        stringArray[_aj_0.pd[50]] = "EChest Colour";
        stringArray[_aj_0.pd[51]] = "LineWidth";
        lQ = stringArray;
        ek = new _k_0(lQ[pd[52]], pd[53]);
        el = new _cA(lQ[pd[54]], new _cV(Color.YELLOW));
        en = new _cA(lQ[pd[55]], new _cV(Color.MAGENTA));
        ep = new _cA(lQ[pd[56]], new _cV(Color.PINK));
        eq = new _cJ(lQ[pd[57]], 3.0, 0.5, 3.0, 0.5);
        er = new _aj_0();
    }

    @Override
    public String getHUDData() {
        return lQ[pd[30]] + this.es.getMode();
    }
}

