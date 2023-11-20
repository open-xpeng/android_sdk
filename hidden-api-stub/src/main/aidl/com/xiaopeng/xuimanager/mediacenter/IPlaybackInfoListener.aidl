package com.xiaopeng.xuimanager.mediacenter;

import com.xiaopeng.xuimanager.mediacenter.MediaInfo;

interface IPlaybackInfoListener {
    void OnMediaInfoNotify(int i,in MediaInfo mediaInfo);

    void OnPlaybackChanged(int i, int i2);

    void OnUpdatePosition(int i, long j, long j2);
}
