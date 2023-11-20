package com.xiaopeng.xuimanager.mediacenter;

interface IPlaybackControlListener {
    int OnPlaybackControl(int i, int i2);

    int OnSetFavorite(boolean z, String str);

    int OnSwitchSource(int i);
}
