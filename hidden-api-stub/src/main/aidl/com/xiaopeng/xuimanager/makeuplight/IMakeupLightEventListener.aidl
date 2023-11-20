package com.xiaopeng.xuimanager.makeuplight;

interface IMakeupLightEventListener {
    void onAvailableEvent(boolean z);

    void onColorTemperatureEvent(int i, int i2);

    void onEffectEvent(String str, int i);

    void onLuminanceEvent(int i);
}
