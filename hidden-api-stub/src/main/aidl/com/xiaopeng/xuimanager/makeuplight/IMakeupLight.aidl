package com.xiaopeng.xuimanager.makeuplight;

import com.xiaopeng.xuimanager.makeuplight.IMakeupLightEventListener;

interface IMakeupLight {
    List<String> getColorTemperature();

    int getLuminance();

    int getMakeupAvailable();

    void loadMakeupEffect();

    void registerListener(IMakeupLightEventListener iMakeupLightEventListener);

    int runEffect(String str, int i);

    int setAliasColorTemperature(String str);

    int setColorTemperature(int i, int i2);

    int setLuminance(int i);

    List<String> showAliasColorTemperature();

    List<String> showMakeupEffect();

    int stopEffect();

    void unregisterListener(IMakeupLightEventListener iMakeupLightEventListener);

}
