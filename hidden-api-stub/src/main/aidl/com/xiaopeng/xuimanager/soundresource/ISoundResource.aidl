package com.xiaopeng.xuimanager.soundresource;

import com.xiaopeng.xuimanager.soundresource.ISoundResourceListener;
import com.xiaopeng.xuimanager.soundresource.data.BootSoundResource;
import com.xiaopeng.xuimanager.soundresource.data.SoundEffectResource;
import com.xiaopeng.xuimanager.soundresource.data.SoundEffectTheme;

/* loaded from: classes.dex */
interface ISoundResource {
    BootSoundResource getActiveBootSoundResource();

    SoundEffectResource getActiveSoundEffectResource(int i);

    int getActiveSoundEffectTheme();

    SoundEffectTheme[] getAvailableThemes();

    int getBootSoundOnOff();

    BootSoundResource[] getBootSoundResource();

    SoundEffectResource[] getSoundEffectPlayResource(int i);

    SoundEffectResource[] getSoundEffectPreviewResource(int i);

    void registerListener(ISoundResourceListener iSoundResourceListener);

    int selectSoundEffectTheme(int i);

    int setBootSoundOnOff(boolean z);

    int setBootSoundResource(int i);

    void unRegisterListener(ISoundResourceListener iSoundResourceListener);

}