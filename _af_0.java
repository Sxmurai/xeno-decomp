//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.entity.EntityOtherPlayerMP
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.entity.item.EntityEnderCrystal
 *  net.minecraft.entity.monster.EntityMob
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Items
 *  net.minecraft.item.Item
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$PositionRotation
 *  net.minecraft.network.play.client.CPacketUseEntity
 *  net.minecraft.util.EnumHand
 *  net.minecraftforge.event.entity.player.AttackEntityEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/*
 * Renamed from _af
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class _af_0
extends _bA {
    public _cd_0 dp;
    public _k_0 dE;
    public _cJ ds;
    public _cJ dr;
    public _k_0 dC;
    public _k_0 dt;
    public static final String[] lQ;
    public ArrayList<Item> dJ;
    public _cA dG;
    public _cd_0 dq;
    public _k_0 dv;
    public _k_0 dD;
    public _K do = new _K();
    public _k_0 du;
    public static String dI;
    public _k_0 dA;
    public _cd_0 dF;
    public _cd_0 dz;
    public _k_0 dB;
    public _k_0 dx;
    public static Entity dH;
    public _cd_0 dw;
    public static final int[] pd;
    public _k_0 dy;

    static {
        pd = new int[]{0, 1, 2, 2, 0, 3, 1, 4, 5, 2, 0, 6, 1, 7, 8, 9, 10, 0, 11, 0, 12, 0, 13, 2, 0, 14, 1, 15, 16, 1, 17, 0, 18, 2, 0, 19, 1, 20, 21, 1, 22, 1, 23, 1, 24, 0, 25, 1, 26, 2, 0, 27, 1, 28, 29, 3, 0, 1, 2, 5, 0, 1, 2, 3, 4, 2, 0, 1, 2, 0, 1, 2, 0, 1, 3, 0, 1, 2, 30, 5000, 1000, 1, 5000, 1000, 1, 5000, 1000, 1, 31, 32, 33, 0, 1, 34, 0, 1, 35, 0, 0, 0, 36, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 37, 1, 38, 2, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 39, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38};
        String[] stringArray = new String[pd[133]];
        stringArray[_af_0.pd[134]] = "Aura";
        stringArray[_af_0.pd[135]] = "attacks things for u";
        stringArray[_af_0.pd[136]] = "Priority";
        stringArray[_af_0.pd[137]] = "Closest";
        stringArray[_af_0.pd[138]] = "Health";
        stringArray[_af_0.pd[139]] = "Rotation";
        stringArray[_af_0.pd[140]] = "Legit";
        stringArray[_af_0.pd[141]] = "Packet";
        stringArray[_af_0.pd[142]] = "Range";
        stringArray[_af_0.pd[143]] = "Speed";
        stringArray[_af_0.pd[144]] = "No Swing";
        stringArray[_af_0.pd[145]] = "Rotate";
        stringArray[_af_0.pd[146]] = "Raytrace";
        stringArray[_af_0.pd[147]] = "RT Mode";
        stringArray[_af_0.pd[148]] = "Body";
        stringArray[_af_0.pd[149]] = "Feet";
        stringArray[_af_0.pd[150]] = "UseCooldown";
        stringArray[_af_0.pd[151]] = "AutoWeapon";
        stringArray[_af_0.pd[152]] = "AW Mode";
        stringArray[_af_0.pd[153]] = "Target";
        stringArray[_af_0.pd[154]] = "All";
        stringArray[_af_0.pd[155]] = "Mobs";
        stringArray[_af_0.pd[156]] = "Passive";
        stringArray[_af_0.pd[157]] = "Players";
        stringArray[_af_0.pd[158]] = "AttackFriends";
        stringArray[_af_0.pd[159]] = "Render";
        stringArray[_af_0.pd[160]] = "R Mode";
        stringArray[_af_0.pd[161]] = "Circle";
        stringArray[_af_0.pd[162]] = "2D";
        stringArray[_af_0.pd[163]] = "Render Colour";
        stringArray[_af_0.pd[164]] = "Target";
        stringArray[_af_0.pd[165]] = "Body";
        stringArray[_af_0.pd[166]] = "Feet";
        stringArray[_af_0.pd[167]] = "Legit";
        stringArray[_af_0.pd[168]] = "Packet";
        stringArray[_af_0.pd[169]] = "Closest";
        stringArray[_af_0.pd[170]] = "Health";
        stringArray[_af_0.pd[171]] = "Circle";
        stringArray[_af_0.pd[172]] = "2D";
        lQ = stringArray;
    }

    @Override
    public void onRenderWorld() {
        if (dH != null && this.dE.isEnabled() && dH != this.pb.player) {
            if (this.dF.is(lQ[pd[117]])) {
                _ag_0.drawCircle(new _ar_0().setup().line(1.5f).depth(pd[118]).blend().texture(), _bv_0.getInterpolatedPos(dH, 1.0f), _af_0.dH.width, (double)_af_0.dH.height * (0.5 * (Math.sin((double)this.pb.player.ticksExisted * 3.5 * (Math.PI / 180)) + 1.0)), this.dG.getColor());
            } else if (this.dF.is(lQ[pd[119]])) {
                _ag_0.draw2D(dH, this.dG.getColor());
            }
        }
    }

    public _af_0() {
        super(lQ[pd[0]], lQ[pd[1]], _aL.hx);
        String[] stringArray = new String[pd[3]];
        stringArray[_af_0.pd[4]] = lQ[pd[5]];
        stringArray[_af_0.pd[6]] = lQ[pd[7]];
        this.dp = new _cd_0(lQ[pd[2]], stringArray);
        String[] stringArray2 = new String[pd[9]];
        stringArray2[_af_0.pd[10]] = lQ[pd[11]];
        stringArray2[_af_0.pd[12]] = lQ[pd[13]];
        this.dq = new _cd_0(lQ[pd[8]], stringArray2);
        this.dr = new _cJ(lQ[pd[14]], 4.0, 1.0, 5.0, 0.1);
        this.ds = new _cJ(lQ[pd[15]], 10.0, 1.0, 20.0, 1.0);
        this.dt = new _k_0(lQ[pd[16]], pd[17]);
        this.du = new _k_0(lQ[pd[18]], pd[19]);
        this.dv = new _k_0(lQ[pd[20]], pd[21]);
        String[] stringArray3 = new String[pd[23]];
        stringArray3[_af_0.pd[24]] = lQ[pd[25]];
        stringArray3[_af_0.pd[26]] = lQ[pd[27]];
        this.dw = new _cd_0(lQ[pd[22]], stringArray3);
        this.dx = new _k_0(lQ[pd[28]], pd[29]);
        this.dy = new _k_0(lQ[pd[30]], pd[31]);
        String[] stringArray4 = new String[pd[33]];
        stringArray4[_af_0.pd[34]] = lQ[pd[35]];
        stringArray4[_af_0.pd[36]] = lQ[pd[37]];
        this.dz = new _cd_0(lQ[pd[32]], stringArray4);
        this.dA = new _k_0(lQ[pd[38]], pd[39]);
        this.dB = new _k_0(lQ[pd[40]], pd[41]);
        this.dC = new _k_0(lQ[pd[42]], pd[43]);
        this.dD = new _k_0(lQ[pd[44]], pd[45]);
        this.dE = new _k_0(lQ[pd[46]], pd[47]);
        String[] stringArray5 = new String[pd[49]];
        stringArray5[_af_0.pd[50]] = lQ[pd[51]];
        stringArray5[_af_0.pd[52]] = lQ[pd[53]];
        this.dF = new _cd_0(lQ[pd[48]], stringArray5);
        this.dG = new _cA(lQ[pd[54]], new _cV(Color.CYAN.darker()));
        this.addSetting(this.dp);
        _bd_0[] _bd_0Array = new _bd_0[pd[55]];
        _bd_0Array[_af_0.pd[56]] = this.dB;
        _bd_0Array[_af_0.pd[57]] = this.dA;
        _bd_0Array[_af_0.pd[58]] = this.dC;
        this.addSettings(_bd_0Array);
        _bd_0[] _bd_0Array2 = new _bd_0[pd[59]];
        _bd_0Array2[_af_0.pd[60]] = this.dy;
        _bd_0Array2[_af_0.pd[61]] = this.dz;
        _bd_0Array2[_af_0.pd[62]] = this.dt;
        _bd_0Array2[_af_0.pd[63]] = this.dx;
        _bd_0Array2[_af_0.pd[64]] = this.dD;
        this.addSettings(_bd_0Array2);
        _bd_0[] _bd_0Array3 = new _bd_0[pd[65]];
        _bd_0Array3[_af_0.pd[66]] = this.du;
        _bd_0Array3[_af_0.pd[67]] = this.dq;
        this.addSettings(_bd_0Array3);
        _bd_0[] _bd_0Array4 = new _bd_0[pd[68]];
        _bd_0Array4[_af_0.pd[69]] = this.dv;
        _bd_0Array4[_af_0.pd[70]] = this.dw;
        this.addSettings(_bd_0Array4);
        _bd_0[] _bd_0Array5 = new _bd_0[pd[71]];
        _bd_0Array5[_af_0.pd[72]] = this.dr;
        _bd_0Array5[_af_0.pd[73]] = this.ds;
        this.addSettings(_bd_0Array5);
        _bd_0[] _bd_0Array6 = new _bd_0[pd[74]];
        _bd_0Array6[_af_0.pd[75]] = this.dE;
        _bd_0Array6[_af_0.pd[76]] = this.dF;
        _bd_0Array6[_af_0.pd[77]] = this.dG;
        this.addSettings(_bd_0Array6);
    }

    public float[] getRotations(Entity entity) {
        double d = entity.posX + (entity.posX - entity.lastTickPosX) - this.pb.player.posX;
        double d2 = entity.posY - 3.5 + (double)entity.getEyeHeight() - this.pb.player.posY + (double)this.pb.player.getEyeHeight();
        double d3 = entity.posZ + (entity.posZ - entity.lastTickPosZ) - this.pb.player.posZ;
        double d4 = Math.sqrt(Math.pow(d, 2.0) + Math.pow(d3, 2.0));
        float f = (float)Math.toDegrees(-Math.atan(d / d3));
        float f2 = (float)(-Math.toDegrees(Math.atan(d2 / d4)));
        if (d < 0.0 && d3 < 0.0) {
            f = (float)(90.0 + Math.toDegrees(Math.atan(d3 / d)));
        } else if (d > 0.0 && d3 < 0.0) {
            f = (float)(-90.0 + Math.toDegrees(Math.atan(d3 / d)));
        }
        float[] fArray = new float[pd[120]];
        fArray[_af_0.pd[121]] = f;
        fArray[_af_0.pd[122]] = f2;
        return fArray;
    }

    @Override
    public void onUpdate() {
        if (this.nullCheck()) {
            return;
        }
        if (dH != null && _af_0.dH.isDead || dH != null && (double)this.pb.player.getDistance(dH) > this.dr.getDoubleValue() || dH == this.pb.player) {
            dH = null;
        }
        if (this.dp.is(lQ[pd[96]])) {
            List list;
            if (this.dC.N) {
                list = this.pb.world.loadedEntityList.stream().filter(EntityOtherPlayerMP.class::isInstance).collect(Collectors.toList());
                list = list.stream().filter(entity -> ((double)entity.getDistance((Entity)this.pb.player) < this.dr.getDoubleValue() && entity != this.pb.player && !entity.isDead && entity instanceof EntityOtherPlayerMP && !(entity instanceof _bP) && !((EntityOtherPlayerMP)entity).isDead ? pd[131] : pd[132]) != 0).collect(Collectors.toList());
                list.sort(Comparator.comparingDouble(entity -> ((EntityOtherPlayerMP)entity).getDistance((Entity)this.pb.player)));
                if (!list.isEmpty() && list.get(pd[97]) != this.pb.player) {
                    dH = (Entity)list.get(pd[98]);
                    String string = dH.getName();
                    if (!this.dD.isEnabled()) {
                        if (_bn_0.isFriend(string)) {
                            return;
                        }
                    }
                    this.attack(dH);
                }
            }
            if (this.dB.N) {
                list = this.pb.world.loadedEntityList.stream().filter(EntityLivingBase.class::isInstance).collect(Collectors.toList());
                list = list.stream().filter(entity -> ((double)entity.getDistance((Entity)this.pb.player) < this.dr.getDoubleValue() && entity != this.pb.player && !entity.isDead && entity instanceof EntityLivingBase && !(entity instanceof EntityOtherPlayerMP) && !(entity instanceof _bP) && ((EntityLivingBase)entity).getHealth() > 0.0f ? pd[129] : pd[130]) != 0).collect(Collectors.toList());
                list.sort(Comparator.comparingDouble(entity -> ((EntityLivingBase)entity).getDistance((Entity)this.pb.player)));
                if (!list.isEmpty()) {
                    dH = (Entity)list.get(pd[99]);
                    this.rotate(dH);
                    this.rayTrace(dH);
                    dI = dH.getName().toString();
                    this.attack(dH);
                }
            }
        } else if (this.dp.is(lQ[pd[100]])) {
            List list;
            if (this.dC.N) {
                list = this.pb.world.loadedEntityList.stream().filter(EntityLivingBase.class::isInstance).collect(Collectors.toList());
                if ((list = list.stream().filter(entity -> ((double)entity.getDistance((Entity)this.pb.player) < this.dr.getDoubleValue() && entity != this.pb.player && !entity.isDead && entity instanceof EntityOtherPlayerMP && !(entity instanceof _bP) && !entity.isDead ? pd[127] : pd[128]) != 0).collect(Collectors.toList())).size() == pd[101]) {
                    dI = ((Entity)list.get(pd[102])).getName().toString();
                    if (!this.dD.isEnabled()) {
                        if (_bn_0.isFriend(dI)) {
                            return;
                        }
                    }
                    this.attack((Entity)list.get(pd[103]));
                    return;
                }
                list.sort(Comparator.comparingDouble(entity -> ((EntityLivingBase)entity).getHealth()));
                if (!list.isEmpty()) {
                    dH = (Entity)list.get(pd[104]);
                    dI = dH.getName().toString();
                    if (!this.dD.isEnabled()) {
                        if (_bn_0.isFriend(dI)) {
                            return;
                        }
                    }
                    this.attack(dH);
                }
            }
            if (this.dA.N) {
                list = this.pb.world.loadedEntityList.stream().filter(EntityLivingBase.class::isInstance).collect(Collectors.toList());
                if ((list = list.stream().filter(entity -> ((double)entity.getDistance((Entity)this.pb.player) < this.dr.getDoubleValue() && entity != this.pb.player && !entity.isDead && entity instanceof EntityMob ? pd[125] : pd[126]) != 0).collect(Collectors.toList())).size() == pd[105]) {
                    this.rotate((Entity)list.get(pd[106]));
                    this.rayTrace((Entity)list.get(pd[107]));
                    dI = ((Entity)list.get(pd[108])).getName().toString();
                    this.attack((Entity)list.get(pd[109]));
                    return;
                }
                list.sort(Comparator.comparingDouble(entity -> ((EntityLivingBase)entity).getHealth()));
                if (!list.isEmpty()) {
                    dH = (Entity)list.get(pd[110]);
                    this.rotate(dH);
                    this.rayTrace(dH);
                    dI = dH.getName().toString();
                    this.attack(dH);
                }
            }
            if (this.dB.N) {
                list = this.pb.world.loadedEntityList.stream().filter(EntityLivingBase.class::isInstance).collect(Collectors.toList());
                if ((list = list.stream().filter(entity -> ((double)entity.getDistance((Entity)this.pb.player) < this.dr.getDoubleValue() && entity != this.pb.player && !entity.isDead && entity instanceof EntityLivingBase && !(entity instanceof EntityOtherPlayerMP) && ((EntityLivingBase)entity).getHealth() > 0.0f ? pd[123] : pd[124]) != 0).collect(Collectors.toList())).size() == pd[111]) {
                    this.rotate((Entity)list.get(pd[112]));
                    this.rayTrace((Entity)list.get(pd[113]));
                    dI = ((Entity)list.get(pd[114])).getName().toString();
                    this.attack((Entity)list.get(pd[115]));
                    return;
                }
                list.sort(Comparator.comparingDouble(entity -> ((EntityLivingBase)entity).getHealth()));
                if (!list.isEmpty()) {
                    dH = (Entity)list.get(pd[116]);
                    this.rotate(dH);
                    this.rayTrace(dH);
                    dI = dH.getName().toString();
                    this.attack(dH);
                }
            }
        }
    }

    public void attack(Entity entity) {
        if (_bn_0.isFriend(this.lH) || entity instanceof EntityEnderCrystal) {
            return;
        }
        dI = entity.getName();
        if (entity instanceof EntityPlayer) {
            if (this.dD.isEnabled()) {
                this.rotate(entity);
                this.rayTrace(entity);
                if (this.do.hasTimeElapsed((long)((double)(this.dx.N ? pd[79] : pd[80]) / this.ds.getDoubleValue()), pd[81])) {
                    this.pb.getConnection().sendPacket((Packet)new CPacketUseEntity(entity));
                    if (!this.dt.isEnabled()) {
                        this.pb.player.swingArm(EnumHand.MAIN_HAND);
                    }
                }
            } else if (!_bn_0.isFriend(this.lH) && !this.dD.isEnabled()) {
                this.rotate(entity);
                this.rayTrace(entity);
                if (this.do.hasTimeElapsed((long)((double)(this.dx.N ? pd[82] : pd[83]) / this.ds.getDoubleValue()), pd[84])) {
                    this.pb.getConnection().sendPacket((Packet)new CPacketUseEntity(entity));
                    if (!this.dt.isEnabled()) {
                        this.pb.player.swingArm(EnumHand.MAIN_HAND);
                    }
                }
            }
        } else {
            this.rotate(entity);
            this.rayTrace(entity);
            if (this.do.hasTimeElapsed((long)((double)(this.dx.N ? pd[85] : pd[86]) / this.ds.getDoubleValue()), pd[87])) {
                this.pb.getConnection().sendPacket((Packet)new CPacketUseEntity(entity));
                if (!this.dt.isEnabled()) {
                    this.pb.player.swingArm(EnumHand.MAIN_HAND);
                }
            }
        }
        dH = entity;
    }

    @SubscribeEvent
    public void attackEntity(AttackEntityEvent attackEntityEvent) {
        if (this.dy.isEnabled() && (!this.dz.is(lQ[pd[78]]) || dI == attackEntityEvent.getTarget().getName())) {
            for (Item item : this.dJ) {
                if (!_cu_0.hasItem(item)) continue;
                _cu_0.switchToSlot(item);
                break;
            }
        }
    }

    public void rotate(Entity entity) {
        if (this.du.isEnabled()) {
            if (this.dq.is(lQ[pd[90]])) {
                this.pb.player.rotationYaw = this.getRotations(entity)[pd[91]];
                this.pb.player.rotationPitch = this.getRotations(entity)[pd[92]];
            } else if (this.dq.is(lQ[pd[93]])) {
                this.pb.getConnection().sendPacket((Packet)new CPacketPlayer.PositionRotation(this.pb.player.posX, this.pb.player.posY, this.pb.player.posZ, this.getRotations(entity)[pd[94]], this.getRotations(entity)[pd[95]], this.pb.player.onGround));
            }
        }
    }

    public void rayTrace(Entity entity) {
        if (this.dv.isEnabled()) {
            if (this.dw.is(lQ[pd[88]])) {
                _G.raytraceEntity(entity);
            } else if (this.dw.is(lQ[pd[89]])) {
                _G.raytraceFeet(entity);
            }
        }
    }

    @Override
    public void setup() {
        this.dJ = new ArrayList();
        this.dJ.add(Items.DIAMOND_SWORD);
        this.dJ.add(Items.DIAMOND_AXE);
        this.dJ.add(Items.IRON_SWORD);
        this.dJ.add(Items.IRON_AXE);
        this.dJ.add(Items.GOLDEN_SWORD);
        this.dJ.add(Items.STONE_AXE);
        this.dJ.add(Items.STONE_SWORD);
        this.dJ.add(Items.STONE_AXE);
        this.dJ.add(Items.WOODEN_SWORD);
        this.dJ.add(Items.WOODEN_AXE);
    }
}

