//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\Aestheticall\Documents\decomp\1.12 stable mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.audio.ISound
 *  net.minecraft.client.audio.ISound$AttenuationType
 *  net.minecraft.client.audio.Sound
 *  net.minecraft.client.audio.Sound$Type
 *  net.minecraft.client.audio.SoundEventAccessor
 *  net.minecraft.client.audio.SoundHandler
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.SoundCategory
 */
import javax.annotation.Nullable;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.Sound;
import net.minecraft.client.audio.SoundEventAccessor;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;

/*
 * Renamed from _av
 */
public final class _av_0
implements ISound {
    public static final String[] fS;
    public static final int[] fT;

    public float getZPosF() {
        return _cp_0.qb.player != null ? (float)_cp_0.qb.player.posZ : 0.0f;
    }

    public float getXPosF() {
        return _cp_0.qb.player != null ? (float)_cp_0.qb.player.posX : 0.0f;
    }

    public int getRepeatDelay() {
        return fT[9];
    }

    public float getYPosF() {
        return _cp_0.qb.player != null ? (float)_cp_0.qb.player.posY : 0.0f;
    }

    public float getVolume() {
        return 1.0f;
    }

    public Sound getSound() {
        return new Sound(fS[fT[5]], 1.0f, 1.0f, fT[6], Sound.Type.SOUND_EVENT, fT[7]);
    }

    public float getPitch() {
        return 1.0f;
    }

    @Nullable
    public SoundEventAccessor createAccessor(SoundHandler soundHandler) {
        return new SoundEventAccessor(new ResourceLocation(fS[fT[2]], fS[fT[3]]), fS[fT[4]]);
    }

    public ResourceLocation getSoundLocation() {
        return new ResourceLocation(fS[fT[0]], fS[fT[1]]);
    }

    public SoundCategory getCategory() {
        return SoundCategory.VOICE;
    }

    public ISound.AttenuationType getAttenuationType() {
        return ISound.AttenuationType.LINEAR;
    }

    public boolean canRepeat() {
        return fT[8];
    }

    static {
        fT = new int[]{0, 1, 2, 3, 4, 5, 1, 0, 0, 0, 6, 0, 1, 2, 3, 4, 5};
        String[] stringArray = new String[fT[10]];
        stringArray[_av_0.fT[11]] = "cosmos";
        stringArray[_av_0.fT[12]] = "sounds/click.ogg";
        stringArray[_av_0.fT[13]] = "cosmos";
        stringArray[_av_0.fT[14]] = "sounds/click.ogg";
        stringArray[_av_0.fT[15]] = "click";
        stringArray[_av_0.fT[16]] = "click";
        fS = stringArray;
    }
}

