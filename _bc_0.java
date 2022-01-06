//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.RenderHelper
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLiving
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.monster.EntityMob
 */
import java.awt.Color;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;

/*
 * Renamed from _bc
 */
public class _bc_0
extends _bA {
    public static _cA jq;
    public static _bc_0 jk;
    public static _k_0 jm;
    public static final int[] pd;
    public static _cA jp;
    public static _k_0 jn;
    public static _cd_0 jr;
    public static final String[] lQ;
    public static _cA jo;
    public static _k_0 jl;

    @Override
    public void onRenderWorld() {
        if (this.nullCheck()) {
            return;
        }
        if (jr.is(lQ[pd[11]])) {
            if (_bc_0.jl.N) {
                for (Object e : this.pb.world.loadedEntityList) {
                    if (!(e instanceof EntityLiving) || e instanceof EntityMob || e instanceof EntityItem) continue;
                    GlStateManager.clear((int)pd[12]);
                    RenderHelper.enableStandardItemLighting();
                    GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    if (e == this.pb.getRenderViewEntity() && this.pb.gameSettings.thirdPersonView == 0) continue;
                    this.pb.entityRenderer.disableLightmap();
                    this.pb.getRenderManager().renderEntityStatic((Entity)e, this.pb.timer.renderPartialTicks, pd[13]);
                    this.pb.entityRenderer.enableLightmap();
                    this.pb.entityRenderer.resetData();
                }
            }
            if (_bc_0.jm.N) {
                for (Object e : this.pb.world.loadedEntityList) {
                    if (!(e instanceof EntityMob) || !(e instanceof EntityLiving) || e instanceof EntityItem) continue;
                    GlStateManager.clear((int)pd[14]);
                    RenderHelper.enableStandardItemLighting();
                    GlStateManager.color((float)1.0f, (float)0.0f, (float)1.0f, (float)1.0f);
                    if (e == this.pb.getRenderViewEntity() && this.pb.gameSettings.thirdPersonView == 0) continue;
                    this.pb.entityRenderer.disableLightmap();
                    this.pb.getRenderManager().renderEntityStatic((Entity)e, this.pb.timer.renderPartialTicks, pd[15]);
                    this.pb.entityRenderer.enableLightmap();
                }
            }
            if (_bc_0.jn.N) {
                for (Object e : this.pb.world.loadedEntityList) {
                    if (!(e instanceof EntityOtherPlayerMP) || e instanceof EntityMob || e instanceof EntityItem) continue;
                    if (e == this.pb.player) {
                        return;
                    }
                    GlStateManager.clear((int)pd[16]);
                    RenderHelper.enableStandardItemLighting();
                    GlStateManager.color((float)1.0f, (float)0.0f, (float)1.0f, (float)1.0f);
                    if (e == this.pb.getRenderViewEntity() && this.pb.gameSettings.thirdPersonView == 0) continue;
                    this.pb.entityRenderer.disableLightmap();
                    this.pb.getRenderManager().renderEntityStatic((Entity)e, this.pb.timer.renderPartialTicks, pd[17]);
                    this.pb.entityRenderer.enableLightmap();
                }
            }
        }
    }

    static {
        pd = new int[]{0, 1, 0, 7, 0, 1, 2, 3, 4, 5, 6, 2, 256, 0, 256, 0, 256, 0, 3, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 4, 1, 5, 1, 6, 1, 7, 8, 9, 10, 2, 0, 11, 1, 12};
        String[] stringArray = new String[pd[19]];
        stringArray[_bc_0.pd[20]] = "Chams";
        stringArray[_bc_0.pd[21]] = "shows entities through walls";
        stringArray[_bc_0.pd[22]] = "Wallhack";
        stringArray[_bc_0.pd[23]] = " ";
        stringArray[_bc_0.pd[24]] = "Passive";
        stringArray[_bc_0.pd[25]] = "Mobs";
        stringArray[_bc_0.pd[26]] = "Players";
        stringArray[_bc_0.pd[27]] = "Passive Colour";
        stringArray[_bc_0.pd[28]] = "Mob Colour";
        stringArray[_bc_0.pd[29]] = "Player Colour";
        stringArray[_bc_0.pd[30]] = "Mode";
        stringArray[_bc_0.pd[31]] = "Fill";
        stringArray[_bc_0.pd[32]] = "Wallhack";
        lQ = stringArray;
        jl = new _k_0(lQ[pd[33]], pd[34]);
        jm = new _k_0(lQ[pd[35]], pd[36]);
        jn = new _k_0(lQ[pd[37]], pd[38]);
        jo = new _cA(lQ[pd[39]], new _cV(Color.GREEN));
        jp = new _cA(lQ[pd[40]], new _cV(Color.RED));
        jq = new _cA(lQ[pd[41]], new _cV(Color.CYAN));
        String[] stringArray2 = new String[pd[43]];
        stringArray2[_bc_0.pd[44]] = lQ[pd[45]];
        stringArray2[_bc_0.pd[46]] = lQ[pd[47]];
        jr = new _cd_0(lQ[pd[42]], stringArray2);
    }

    @Override
    public String getHUDData() {
        return lQ[pd[18]] + jr.getMode();
    }

    public _bc_0() {
        super(lQ[pd[0]], lQ[pd[1]], pd[2], _aL.hz);
        _bd_0[] _bd_0Array = new _bd_0[pd[3]];
        _bd_0Array[_bc_0.pd[4]] = jr;
        _bd_0Array[_bc_0.pd[5]] = jl;
        _bd_0Array[_bc_0.pd[6]] = jm;
        _bd_0Array[_bc_0.pd[7]] = jn;
        _bd_0Array[_bc_0.pd[8]] = jo;
        _bd_0Array[_bc_0.pd[9]] = jp;
        _bd_0Array[_bc_0.pd[10]] = jq;
        this.addSettings(_bd_0Array);
        jk = this;
    }
}

