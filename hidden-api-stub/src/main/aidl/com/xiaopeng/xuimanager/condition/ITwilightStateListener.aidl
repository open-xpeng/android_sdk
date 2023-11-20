package com.xiaopeng.xuimanager.condition;

// Declare any non-default types here with import statements
import com.xiaopeng.xuimanager.condition.TwilightState;

parcelable TwilightState;

interface ITwilightStateListener {
    void onTwilightStateChanged(in TwilightState twilightState);
}