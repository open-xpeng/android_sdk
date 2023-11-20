package com.xiaopeng.xuimanager.contextinfo;

import com.xiaopeng.xuimanager.contextinfo.Camera;
import com.xiaopeng.xuimanager.contextinfo.CameraInfo;
import com.xiaopeng.xuimanager.contextinfo.CameraInterval;
import com.xiaopeng.xuimanager.contextinfo.Cross;
import com.xiaopeng.xuimanager.contextinfo.HomeCompanyRouteInfo;
import com.xiaopeng.xuimanager.contextinfo.Location;
import com.xiaopeng.xuimanager.contextinfo.Lane;
import com.xiaopeng.xuimanager.contextinfo.Maneuver;
import com.xiaopeng.xuimanager.contextinfo.Navi;
import com.xiaopeng.xuimanager.contextinfo.NaviStatus;
import com.xiaopeng.xuimanager.contextinfo.RemainInfo;
import com.xiaopeng.xuimanager.contextinfo.Sapa;

parcelable Camera;
parcelable CameraInfo;
parcelable CameraInterval;
parcelable Cross;
parcelable HomeCompanyRouteInfo;
parcelable Location;
parcelable Lane;
parcelable Maneuver;
parcelable Navi;
parcelable NaviStatus;
parcelable RemainInfo;
parcelable Sapa;

interface IContextInfoEventListener {

   void onATLSStatus(int i, int i2);

    void onAccelerationEvent(float f);

    void onAngularVelocityEvent(float f);

    void onAutoBrightness(int i, int i2);

    void onAvpWifi(int i);

    void onBcmLightMode(int i, int i2);

    void onBeltStatus(int i);

    void onCameraEvent(in Camera camera, int i);

    void onCameraIntervalEvent(in CameraInterval cameraInterval, int i);

    void onCarSpeed(float f);

    void onChargingGunStatus(int i);

    void onCommonEvent(int i, int i2);

    void onCrossEvent(in Cross cross, int i);

    void onDeviceChargeStatus(int i);

    void onDriverSeatStatus(int i);

    void onError(int i, int i2);

    void onGearChanged(int i);

    void onHomeCompanyRouteInfo(in HomeCompanyRouteInfo homeCompanyRouteInfo, int i);

    void onIGStatus(int i);

    void onLLUStatus(int i, int i2);

    void onLaneEvent(in Lane lane, int i);

    void onLocationEvent(in Location location, int i);

    void onManeuverEvent(in Maneuver maneuver, int i);

    void onMsgEvent(int i);

    void onNaviEvent(in Navi navi, int i);

    void onNaviStatus(in NaviStatus naviStatus, int i);

    void onNavigationEnable(boolean z);

    void onNavigationInfo(String str);

    void onPowerAction(int i);

    void onPowerOffCount(int i);

    void onPsdMoto(int i);

    void onRemainInfoEvent(in RemainInfo remainInfo, int i);

    void onRemoteCommand(int i);

    void onSapaEvent(in Sapa sapa, int i);

    void onVpmEvent(int i, int i2);

    void onWeatherInfo(String str);

    void onXPilotWarning(int i, int i2);

}