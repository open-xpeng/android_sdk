package com.xiaopeng.xuimanager.musicrecognize;


import com.xiaopeng.xuimanager.musicrecognize.IMusicRecognizeEventListener;

/* loaded from: classes.dex */
interface IMusicRecognize {
    void findSongCover(String str);

    float getMinScore();

    int getMode();

    void registerListener(IMusicRecognizeEventListener iMusicRecognizeEventListener);

    void setMinScore(float f);

    void setMode(int i);

    void start();

    void stop();

    void stopAndRecognize();

    void unregisterListener(IMusicRecognizeEventListener iMusicRecognizeEventListener);

}