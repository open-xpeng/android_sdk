package com.xiaopeng.xuimanager.lightlanuage;
import com.xiaopeng.xuimanager.lightlanuage.ILightLanuageEventListener;

interface ILightLanuage {
    int getDanceEffectRunnable();

    List<String> getLightEffect();

    boolean getLightEffectEnable();

    String getLocalDanceEffectInfo();

    int getMcuEffect(int i);

    String getRhythmEffect();

    boolean getRhythmEffectEnable();

    String getRunningEffect();

    boolean getSayhiEffectEnable();

    String getUserEffectInfo(String str);

    String getUserEffectInfoList();

    boolean isDanceEffectRunning();

    void loadLightEffect();

    int playEffect(String str, int i);

    void playSmartEffect(int i);

    void registerListener(in ILightLanuageEventListener iLightLanuageEventListener);

    void setLightEffectEnable(boolean z);

    void setMcuEffect(int i, int i2);

    void setRhythmEffect(String str);

    void setRhythmEffectEnable(boolean z);

    void setSayhiEffectEnable(boolean z);

    void stopEffect();

    void stopSmartEffect();

    void unregisterListener(in ILightLanuageEventListener iLightLanuageEventListener);

}
