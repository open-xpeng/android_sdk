package com.xiaopeng.xuimanager.mediacenter.lyric;

import com.xiaopeng.xuimanager.mediacenter.lyric.LyricInfo;

parcelable LyricInfo;

interface ILyricInfoListener {
    void onLyricInfoUpdated(int i, in LyricInfo lyricInfo);
}