package com.xiaopeng.xuimanager.lightlanuage;

interface ILightLanuageEventListener {
     void onErrorEvent(String str, int i);
 
     void onFinishEvent(String str, String str2);
 
     void onStartEvent(String str, String str2);
 
     void onStopEvent(String str, String str2);
 
     void onUpgradeEvent(int i, int i2);
}
