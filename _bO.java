//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemEndCrystal
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.potion.PotionEffect
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemEndCrystal;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class _bO
extends _bA {
    public _cd_0 nm;
    public _cJ nk;
    public _cd_0 np;
    public _cJ nn;
    public _k_0 nw;
    public _k_0 no;
    public _cJ ns;
    public _cd_0 nl;
    public _K nD;
    public _cJ nA;
    public _k_0 nr;
    public _k_0 nv;
    public _k_0 nB;
    public ArrayList<BlockPos> nE;
    public static final int[] pd = new int[]{0, 1, 2, 2, 0, 3, 1, 4, 5, 1, 6, 7, 2, 0, 8, 1, 9, 10, 3, 0, 11, 1, 12, 2, 13, 14, 15, 0, 16, 2, 0, 17, 1, 18, 19, 2, 0, 20, 1, 21, 22, 1, 23, 24, 25, 26, 0, 27, 0, 28, 0, 29, 0, 30, 31, 32, 0, 1, 0, 8, 0, 1, 2, 3, 4, 5, 6, 7, 11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 33, 34, 0, 35, 1, 36, 37, 38, 39, 40, 41, 1, 1, 0, 42, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41};
    public _cJ nz;
    public _cd_0 nq;
    public _k_0 nj;
    public _cJ nu;
    public _cd_0 ni;
    public _cJ nt;
    public _K nC;
    public _k_0 nx;
    public static final String[] nF;
    public _k_0 ny;

    static {
        String[] stringArray = new String[pd[94]];
        stringArray[_bO.pd[95]] = "AutoCrystal2";
        stringArray[_bO.pd[96]] = "crystals go brrr";
        stringArray[_bO.pd[97]] = "Logic";
        stringArray[_bO.pd[98]] = "B->P";
        stringArray[_bO.pd[99]] = "P->B";
        stringArray[_bO.pd[100]] = "Break";
        stringArray[_bO.pd[101]] = "B Range";
        stringArray[_bO.pd[102]] = "B Mode";
        stringArray[_bO.pd[103]] = "Packet";
        stringArray[_bO.pd[104]] = "Swing";
        stringArray[_bO.pd[105]] = "B Hand";
        stringArray[_bO.pd[106]] = "Both";
        stringArray[_bO.pd[107]] = "Mainhand";
        stringArray[_bO.pd[108]] = "Offhand";
        stringArray[_bO.pd[109]] = "BreakSpeed";
        stringArray[_bO.pd[110]] = "AntiWeak";
        stringArray[_bO.pd[111]] = "AWeak Mode";
        stringArray[_bO.pd[112]] = "Legit";
        stringArray[_bO.pd[113]] = "Packet";
        stringArray[_bO.pd[114]] = "BreakLogic";
        stringArray[_bO.pd[115]] = "All";
        stringArray[_bO.pd[116]] = "Self";
        stringArray[_bO.pd[117]] = "Place";
        stringArray[_bO.pd[118]] = "PlaceDelayMS";
        stringArray[_bO.pd[119]] = "PlaceRange";
        stringArray[_bO.pd[120]] = "TargetRange";
        stringArray[_bO.pd[121]] = "SpecEntityCheck";
        stringArray[_bO.pd[122]] = "Fifteen";
        stringArray[_bO.pd[123]] = "IgnoreTerrain";
        stringArray[_bO.pd[124]] = "See Check";
        stringArray[_bO.pd[125]] = "Minimum DMG";
        stringArray[_bO.pd[126]] = "Max Local DMG";
        stringArray[_bO.pd[127]] = "Place Swing";
        stringArray[_bO.pd[128]] = "B->P";
        stringArray[_bO.pd[129]] = "P->B";
        stringArray[_bO.pd[130]] = "Self";
        stringArray[_bO.pd[131]] = "Weakness";
        stringArray[_bO.pd[132]] = "Legit";
        stringArray[_bO.pd[133]] = "Packet";
        stringArray[_bO.pd[134]] = "Packet";
        stringArray[_bO.pd[135]] = "Swing";
        stringArray[_bO.pd[136]] = "Packet";
        nF = stringArray;
    }

    @Override
    public void onDisable() {
        this.nE.clear();
        super.onDisable();
    }

    public _bO() {
        super(nF[pd[0]], nF[pd[1]], _aL.hx);
        String[] stringArray = new String[pd[3]];
        stringArray[_bO.pd[4]] = nF[pd[5]];
        stringArray[_bO.pd[6]] = nF[pd[7]];
        this.ni = new _cd_0(nF[pd[2]], stringArray);
        this.nj = new _k_0(nF[pd[8]], pd[9]);
        this.nk = new _cJ(nF[pd[10]], 7.0, 2.0, 7.0, 0.5);
        String[] stringArray2 = new String[pd[12]];
        stringArray2[_bO.pd[13]] = nF[pd[14]];
        stringArray2[_bO.pd[15]] = nF[pd[16]];
        this.nl = new _cd_0(nF[pd[11]], stringArray2);
        String[] stringArray3 = new String[pd[18]];
        stringArray3[_bO.pd[19]] = nF[pd[20]];
        stringArray3[_bO.pd[21]] = nF[pd[22]];
        stringArray3[_bO.pd[23]] = nF[pd[24]];
        this.nm = new _cd_0(nF[pd[17]], stringArray3);
        this.nn = new _cJ(nF[pd[25]], 15.0, 1.0, 40.0, 1.0);
        this.no = new _k_0(nF[pd[26]], pd[27]);
        String[] stringArray4 = new String[pd[29]];
        stringArray4[_bO.pd[30]] = nF[pd[31]];
        stringArray4[_bO.pd[32]] = nF[pd[33]];
        this.np = new _cd_0(nF[pd[28]], stringArray4);
        String[] stringArray5 = new String[pd[35]];
        stringArray5[_bO.pd[36]] = nF[pd[37]];
        stringArray5[_bO.pd[38]] = nF[pd[39]];
        this.nq = new _cd_0(nF[pd[34]], stringArray5);
        this.nr = new _k_0(nF[pd[40]], pd[41]);
        this.ns = new _cJ(nF[pd[42]], 10.0, 0.0, 20.0, 1.0);
        this.nt = new _cJ(nF[pd[43]], 7.0, 0.0, 10.0, 1.0);
        this.nu = new _cJ(nF[pd[44]], 7.0, 0.0, 10.0, 1.0);
        this.nv = new _k_0(nF[pd[45]], pd[46]);
        this.nw = new _k_0(nF[pd[47]], pd[48]);
        this.nx = new _k_0(nF[pd[49]], pd[50]);
        this.ny = new _k_0(nF[pd[51]], pd[52]);
        this.nz = new _cJ(nF[pd[53]], 3.5, 0.0, 36.0, 0.5);
        this.nA = new _cJ(nF[pd[54]], 7.0, 1.0, 20.0, 1.0);
        this.nB = new _k_0(nF[pd[55]], pd[56]);
        this.nC = new _K();
        this.nD = new _K();
        this.nE = new ArrayList();
        _bd_0[] _bd_0Array = new _bd_0[pd[57]];
        _bd_0Array[_bO.pd[58]] = this.ni;
        this.addSettings(_bd_0Array);
        _bd_0[] _bd_0Array2 = new _bd_0[pd[59]];
        _bd_0Array2[_bO.pd[60]] = this.nj;
        _bd_0Array2[_bO.pd[61]] = this.nk;
        _bd_0Array2[_bO.pd[62]] = this.nl;
        _bd_0Array2[_bO.pd[63]] = this.nm;
        _bd_0Array2[_bO.pd[64]] = this.nn;
        _bd_0Array2[_bO.pd[65]] = this.no;
        _bd_0Array2[_bO.pd[66]] = this.np;
        _bd_0Array2[_bO.pd[67]] = this.nq;
        this.addSettings(_bd_0Array2);
        _bd_0[] _bd_0Array3 = new _bd_0[pd[68]];
        _bd_0Array3[_bO.pd[69]] = this.nr;
        _bd_0Array3[_bO.pd[70]] = this.ns;
        _bd_0Array3[_bO.pd[71]] = this.nt;
        _bd_0Array3[_bO.pd[72]] = this.nu;
        _bd_0Array3[_bO.pd[73]] = this.nv;
        _bd_0Array3[_bO.pd[74]] = this.nw;
        _bd_0Array3[_bO.pd[75]] = this.nx;
        _bd_0Array3[_bO.pd[76]] = this.ny;
        _bd_0Array3[_bO.pd[77]] = this.nz;
        _bd_0Array3[_bO.pd[78]] = this.nA;
        _bd_0Array3[_bO.pd[79]] = this.nB;
        this.addSettings(_bd_0Array3);
    }

    @Override
    public void onEnable() {
        this.nE.clear();
        super.onEnable();
    }

    public void placeCrystals() {
        EnumHand enumHand = null;
        if (this.pb.player.getHeldItemMainhand().getItem() instanceof ItemEndCrystal) {
            enumHand = EnumHand.MAIN_HAND;
        } else if (this.pb.player.getHeldItemOffhand().getItem() instanceof ItemEndCrystal) {
            enumHand = EnumHand.OFF_HAND;
        }
        if (this.nD.hasTimeElapsed((long)this.ns.getDoubleValue(), pd[91]) && enumHand != null && _Z.getBestPos((Entity)_Z.getNearestTarget(this.nu.getFloatValue()), this.nt.getFloatValue(), this.nv.isEnabled(), this.nw.isEnabled(), this.nx.isEnabled(), this.ny.isEnabled(), this.nz.getDoubleValue(), this.nA.getDoubleValue()) != null && _Z.getNearestTarget(this.nu.getFloatValue()) != null) {
            _Z.placeCrystalOnBlock(_Z.getBestPos((Entity)_Z.getNearestTarget(this.nu.getFloatValue()), this.nt.getFloatValue(), this.nv.isEnabled(), this.nw.isEnabled(), this.nx.isEnabled(), this.ny.isEnabled(), this.nz.getDoubleValue(), this.nA.getDoubleValue()), enumHand, this.nB.isEnabled());
            this.nE.add(_Z.getBestPos((Entity)_Z.getNearestTarget(this.nu.getFloatValue()), this.nt.getFloatValue(), this.nv.isEnabled(), this.nw.isEnabled(), this.nx.isEnabled(), this.ny.isEnabled(), this.nz.getDoubleValue(), this.nA.getDoubleValue()));
        }
    }

    public void doAutoCrystal() {
        if (this.ni.is(nF[pd[80]])) {
            if (this.nj.isEnabled()) {
                this.breakCrystals();
            }
            if (this.nr.isEnabled()) {
                this.placeCrystals();
            }
        } else if (this.ni.is(nF[pd[81]])) {
            if (this.nr.isEnabled()) {
                this.placeCrystals();
            }
            if (this.nj.isEnabled()) {
                this.breakCrystals();
            }
        }
    }

    public void breakCrystals() {
        for (Entity entity2 : this.pb.world.loadedEntityList) {
            List list = this.pb.world.loadedEntityList.stream().filter(EntityEnderCrystal.class::isInstance).collect(Collectors.toList());
            list.stream().filter(entity -> (entity instanceof EntityEnderCrystal && (double)this.pb.player.getDistance(entity) <= this.nk.getDoubleValue() ? pd[92] : pd[93]) != 0);
            list.sort(Comparator.comparingDouble(entity -> this.pb.player.getDistanceSq(entity)));
            int n = pd[82];
            for (Entity entity3 : list) {
                if (this.nq.is(nF[pd[83]]) && !this.nE.contains(entity3.getPosition()) || !(entity3 instanceof EntityEnderCrystal) || !(this.pb.player.getDistanceSq(entity3) <= _ac_0.square(this.nk.getFloatValue())) || !this.nC.hasTimeElapsed((long)(1000.0 / this.nn.getDoubleValue()), pd[84])) continue;
                if (this.no.isEnabled()) {
                    for (PotionEffect potionEffect : this.pb.player.getActivePotionEffects()) {
                        if (!potionEffect.getEffectName().equalsIgnoreCase(nF[pd[85]])) continue;
                        if (this.np.is(nF[pd[86]])) {
                            _cu_0.switchToSlot(_cu_0.getBestHotbarSword());
                            continue;
                        }
                        if (!this.np.is(nF[pd[87]])) continue;
                        n = this.pb.player.inventory.currentItem;
                        _cu_0.switchToSlotGhost(_cu_0.getBestHotbarSword());
                    }
                }
                if (this.nl.is(nF[pd[88]])) {
                    this.pb.getConnection().sendPacket((Packet)new CPacketUseEntity(entity3));
                } else if (this.nl.is(nF[pd[89]])) {
                    this.pb.playerController.attackEntity((EntityPlayer)this.pb.player, entity3);
                }
                _Z.swingArm(this.nm.getMode());
                if (this.no.isEnabled() && this.np.is(nF[pd[90]])) {
                    _cu_0.switchToSlot(n);
                }
                this.nE.remove(entity3.getPosition());
            }
        }
    }

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        this.doAutoCrystal();
    }
}

