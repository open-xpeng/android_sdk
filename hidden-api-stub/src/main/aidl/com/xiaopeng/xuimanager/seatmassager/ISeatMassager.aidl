package com.xiaopeng.xuimanager.seatmassager;

import com.xiaopeng.xuimanager.seatmassager.Seat;
import com.xiaopeng.xuimanager.seatmassager.ISeatMassagerEventListener;
import java.util.List;

/* loaded from: classes.dex */
interface ISeatMassager {
    int doVibrate(in List<Seat> list, String str, int i, int i2);

    String getMassagerEffect(int i);

    int getMassagerIntensity(int i);

    int getMassagerStatus(int i);

    int getRhythmEnable(int i);

    int getRhythmIntensity(int i);

    int getRhythmPattern();

    int getVibrateIntensity(int i);

    void loadMassagerEffect();

    int loadVibrate(in AssetFileDescriptor assetFileDescriptor, String str);

    void loadVibrateEffect();

    void registerListener(ISeatMassagerEventListener iSeatMassagerEventListener);

    int setMassagerEffect(in List<String> list, String str);

    int setMassagerIntensity(in List<String> list, int i);

    int setRhythmEnable(in List<String> list, boolean z);

    int setRhythmIntensity(in List<String> list, int i);

    int setRhythmPattern(int i);

    int setVibrateIntensity(in List<String> list, int i);

    List<String> showMassagerEffect();

    List<String> showVibrateEffect();

    int startMassager(in List<Seat> list, String str);

    int stopMassager(in List<String> list);

    int stopVibrate();

    void unregisterListener(ISeatMassagerEventListener iSeatMassagerEventListener);

}