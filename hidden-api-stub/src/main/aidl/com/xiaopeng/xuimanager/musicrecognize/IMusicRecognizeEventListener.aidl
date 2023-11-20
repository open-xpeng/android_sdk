package com.xiaopeng.xuimanager.musicrecognize;
import com.xiaopeng.xuimanager.musicrecognize.MusicRecognizeEvent;

/* loaded from: classes.dex */
interface IMusicRecognizeEventListener {
    void onError(int i, int i2);

    void onFindCoverEvent(String str);

    void onRecognizeEvent(in MusicRecognizeEvent musicRecognizeEvent);
}