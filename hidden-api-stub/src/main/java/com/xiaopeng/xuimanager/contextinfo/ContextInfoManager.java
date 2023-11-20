/*
 * Copyright (C) 2023 The Open XPeng
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.xiaopeng.xuimanager.contextinfo;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

import java.lang.ref.WeakReference;

/**
 * @noinspection unused
 */
public class ContextInfoManager implements XUIManagerBase {
    public static final boolean DBG = true;

    public static final int MSG_CONTEXTINFO_ERROR_EVENT             = 0;
    public static final int MSG_CONTEXTINFO_ACCELERATION_EVENT      = 1;
    public static final int MSG_CONTEXTINFO_ANGULARVELOCITY_EVENT   = 2;
    public static final int MSG_CONTEXTINFO_MANEUVER_EVENT          = 3;
    public static final int MSG_CONTEXTINFO_REMAININFO_EVENT        = 4;
    public static final int MSG_CONTEXTINFO_NAVI_EVENT              = 5;
    public static final int MSG_CONTEXTINFO_LANE_EVENT              = 6;
    public static final int MSG_CONTEXTINFO_CAMERA_EVENT            = 7;
    public static final int MSG_CONTEXTINFO_CAMERAINTERVAL_EVENT    = 8;
    public static final int MSG_CONTEXTINFO_SAPA_EVENT              = 9;
    public static final int MSG_CONTEXTINFO_CROSS_EVENT             = 10;
    public static final int MSG_CONTEXTINFO_LOCATION_EVENT          = 11;
    public static final int MSG_CONTEXTINFO_NAVIGATION_INFO         = 12;
    public static final int MSG_CONTEXTINFO_NAVIGATION_ENABLE_EVENT = 13;
    public static final int MSG_CONTEXTINFO_MSG_EVENT               = 14;
    public static final int MSG_CONTEXTINFO_WEATHER_INFO            = 15;
    public static final int MSG_CONTEXTINFO_CAR_SPPED               = 16;
    public static final int MSG_CONTEXTINFO_IG_EVENT                = 17;
    public static final int MSG_CONTEXTINFO_AUTO_BRIGHTNESS         = 18;
    public static final int MSG_CONTEXTINFO_WARNING                 = 19;
    public static final int MSG_CONTEXTINFO_AVP_WIFI                = 20;
    public static final int MSG_CONTEXTINFO_REMOTE_CMD              = 21;
    public static final int MSG_CONTEXTINFO_LLU_STATUS              = 22;
    public static final int MSG_CONTEXTINFO_ATLS_STATUS             = 23;
    public static final int MSG_CONTEXTINFO_BELT_STATUS             = 24;
    public static final int MSG_CONTEXTINFO_POWER_ACTION            = 25;
    public static final int MSG_CONTEXTINFO_CHARGING_GUN            = 26;
    public static final int MSG_CONTEXTINFO_DEVICE_CHARGE           = 27;
    public static final int MSG_CONTEXTINFO_DRIVER_SEAT             = 28;
    public static final int MSG_CONTEXTINFO_LIGHT_MODE              = 29;
    public static final int MSG_CONTEXTINFO_VPM_EVENT               = 30;
    public static final int MSG_CONTEXTINFO_PSD_MOTO                = 31;
    public static final int MSG_CONTEXTINFO_POWEROFF_CNT            = 32;
    public static final int MSG_CONTEXTINFO_CAR_GEAR                = 33;
    public static final int MSG_CONTEXTINFO_DOOR_OPEN               = 34;
    public static final int MSG_CONTEXTINFO_ASSIST_SYS              = 35;
    public static final int MSG_CONTEXTINFO_COMMON_EVENT            = 36;
    public static final int MSG_CONTEXTINFO_NAVI_STATUS             = 37;
    public static final int MSG_CONTEXTINFO_HOME_COMPANY_ROUTE_INFO = 38;


    public ContextInfoManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }


    public synchronized void registerListener(ContextInfoEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(ContextInfoEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(ContextInfoCommonEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(ContextInfoCommonEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(ContextNaviInfoEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(ContextNaviInfoEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(ContextCarInfoEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(ContextCarInfoEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(ContextCarStatusEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(ContextCarStatusEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(ContextWeatherInfoEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(ContextWeatherInfoEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(ContextAutoBrightnessListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(ContextAutoBrightnessListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void dispatchCommonEventToClient(int eventType, int eventValue) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchErrorEventToClient(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchAccelerationEventToClient(float accelerationValue) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchAngularVelocityEventToClient(float angularVelocityValue) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchManeuverEventToClient(Maneuver maneuver, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchRemainEventToClient(RemainInfo remainInfo, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchNaviEventToClient(Navi navi, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchNaviStatusToClient(NaviStatus naviStatus, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchHomeCompanyRouteInfoToClient(HomeCompanyRouteInfo info, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLaneEventToClient(Lane lane, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchCameraEventToClient(Camera camera, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchCameraIntervalEventToClient(CameraInterval cameraInterval, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchSapaEventToClient(Sapa sapa, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchCrossEventToClient(Cross cross, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLocationEventToClient(Location location, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchNavigationInfoToClient(String naviInfo) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchNavigationEnableToClient(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchMsgToClient(int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchWeatherInfoToClient(String weatherInfo) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchGearStatusToClient(int gear) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchCarSpeedToClient(float speed) {
    }

    public void dispatchIGStatusToClient(int status) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchAutoBrightnessToClient(int lux, int autolight) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchXPilotWarningToClient(int type, int status) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchAvpWifiToClient(int status) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchRemoteCommandToClient(int remoteCmd) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLLUStatusToClient(int type, int status) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchATLSStatusToClient(int type, int status) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchBeltStatusToClient(int status) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchPowerActionToClient(int powerAction) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchChargingGunStatusToClient(int status) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchDeviceChargeStatusToClient(int status) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchDriverSeatStatusToClient(int status) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchBcmLightModeToClient(int type, int mode) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchVpmEventToClient(int type, int mode) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchPsdMotoToClient(int status) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchPowerOffCountToClient(int cnt) {
        throw new RuntimeException("Stub!");
    }

    public void handleCommonEvent(int eventType, int eventValue) {
        throw new RuntimeException("Stub!");
    }

    public void handleAccelerationEvent(float accelerationValue) {
        throw new RuntimeException("Stub!");
    }

    public void handleAngularVelocityEvent(float angularVelocityValue) {
        throw new RuntimeException("Stub!");
    }

    public void handleManeuverEvent(Maneuver maneuver, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void handleRemainInfoEvent(RemainInfo remainInfo, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void handleNaviEvent(Navi navi, int msgType) {
        throw new RuntimeException("Stub!");
    }

    protected void handleNaviStatus(NaviStatus naviStatus, int msgType) {
        throw new RuntimeException("Stub!");
    }

    protected void handleHomeCompanyRouteInfo(HomeCompanyRouteInfo info, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void handleLaneEvent(Lane lane, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void handleCameraEvent(Camera camera, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void handleCameraIntervalEvent(CameraInterval cameraInterval, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void handleSapaEvent(Sapa sapa, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void handleCrossEvent(Cross cross, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void handleLocationEvent(Location location, int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void handleNavigationInfo(String navInfo) {
        throw new RuntimeException("Stub!");
    }

    public void handleNavigationEnableEvent(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public void handleMsgEvent(int msgType) {
        throw new RuntimeException("Stub!");
    }

    public void handleErrorEvent(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void handleWeatherInfo(String weatherInfo) {
        throw new RuntimeException("Stub!");
    }

    public void handleGearStatus(int gear) {
        throw new RuntimeException("Stub!");
    }

    public void handleCarSpeed(float speed) {
        throw new RuntimeException("Stub!");
    }

    public void handleIGStatus(int status) {
        throw new RuntimeException("Stub!");
    }

    public void handleAutoBrightness(int lux, int autolight) {
        throw new RuntimeException("Stub!");
    }

    public void handleXPilotWarnings(int type, int status) {
        throw new RuntimeException("Stub!");
    }

    public void handleAvpWifi(int status) {
        throw new RuntimeException("Stub!");
    }

    public void handleRemoteCommand(int cmd) {
        throw new RuntimeException("Stub!");
    }

    public void handleLLUStatus(int type, int status) {
        throw new RuntimeException("Stub!");
    }

    public void handleATLSStatus(int type, int status) {
        throw new RuntimeException("Stub!");
    }

    public void handleBeltStatus(int status) {
        throw new RuntimeException("Stub!");
    }

    public void handlePowerAction(int poweraction) {
        throw new RuntimeException("Stub!");
    }

    public void handleChargingGunStatus(int status) {
        throw new RuntimeException("Stub!");
    }

    public void handleDeviceChargeStatus(int status) {
        throw new RuntimeException("Stub!");
    }

    public void handleDriverSeatStatus(int status) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightmode(int type, int status) {
        throw new RuntimeException("Stub!");
    }

    public void handleVpmEvent(int type, int mode) {
        throw new RuntimeException("Stub!");
    }

    public void handlePsdMoto(int status) {
        throw new RuntimeException("Stub!");
    }

    public void handlePowerOffCount(int cnt) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onServerDisconnected() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIDisconnected() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIConnected(IBinder service) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String getServiceName() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void setServiceName(String name) {
        throw new RuntimeException("Stub!");
    }

    public void setCarSpeed(float speed, int deltaTime) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setCarAngular(float angularValue, int deltaTime) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setCarAngularVelocity(float angularVelocityValue) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getIntelligentEffectEnable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setIntelligentEffectEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setNavigationInfo(String navInfo) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setNavigationEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getWeather() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void updateWeatherFromServer() {
        throw new RuntimeException("Stub!");
    }

    public void sendContextEvent(int eventType, int eventValue) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }


    public interface ContextInfoEventListener {
        void onAccelerationEvent(float f);

        void onAngularVelocityEvent(float f);

        void onErrorEvent(int i, int i2);

        default void onManeuverEvent(Maneuver maneuver, int msgType) {
        }

        default void onRemainInfoEvent(RemainInfo remainInfo, int msgType) {
        }

        default void onNaviEvent(Navi navi, int msgType) {
        }

        default void onNaviStatus(NaviStatus naviStatus, int msgType) {
        }

        default void onHomeCompanyRouteInfo(HomeCompanyRouteInfo info, int msgType) {
        }

        default void onLaneEvent(Lane lane, int msgType) {
        }

        default void onCameraEvent(Camera camera, int msgType) {
        }

        default void onCameraIntervalEvent(CameraInterval cameraInterval, int msgType) {
        }

        default void onSapaEvent(Sapa sapa, int msgType) {
        }

        default void onCrossEvent(Cross cross, int msgType) {
        }

        default void onLocationEvent(Location location, int msgType) {
        }

        default void onNavigationInfo(String naviInfo) {
        }

        default void onNavigationEnable(boolean enable) {
        }

        default void onMsgEvent(int msgType) {
        }

        default void onWeatherInfo(String weatherInfo) {
        }
    }


    public interface ContextInfoCommonEventListener {
        default void onCommonEvent(int eventType, int eventValue) {
        }

        default void onErrorEvent(int errorCode, int operation) {
        }
    }


    public interface ContextNaviInfoEventListener {
        default void onManeuverEvent(Maneuver maneuver, int msgType) {
        }

        default void onRemainInfoEvent(RemainInfo remainInfo, int msgType) {
        }

        default void onNaviEvent(Navi navi, int msgType) {
        }

        default void onNaviStatus(NaviStatus naviStatus, int msgType) {
        }

        default void onHomeCompanyRouteInfo(HomeCompanyRouteInfo info, int msgType) {
        }

        default void onLaneEvent(Lane lane, int msgType) {
        }

        default void onCameraEvent(Camera camera, int msgType) {
        }

        default void onCameraIntervalEvent(CameraInterval cameraInterval, int msgType) {
        }

        default void onSapaEvent(Sapa sapa, int msgType) {
        }

        default void onCrossEvent(Cross cross, int msgType) {
        }

        default void onLocationEvent(Location location, int msgType) {
        }

        default void onNavigationInfo(String naviInfo) {
        }

        default void onNavigationEnable(boolean enable) {
        }

        default void onMsgEvent(int msgType) {
        }

        default void onWeatherInfo(String weatherInfo) {
        }

        default void onGearChanged(int gear) {
        }

        default void onCarSpeed(float speed) {
        }

        default void onErrorEvent(int errorCode, int operation) {
        }
    }


    public interface ContextCarInfoEventListener {
        default void onAccelerationEvent(float accelerationValue) {
        }

        default void onAngularVelocityEvent(float angularVelocityValue) {
        }

        default void onErrorEvent(int errorCode, int operation) {
        }
    }


    public interface ContextAutoBrightnessListener {
        default void onAutoBrightness(int lux, int autolight) {
        }

        default void onErrorEvent(int errorCode, int operation) {
        }
    }


    public interface ContextCarStatusEventListener {
        default void onIGStatus(int status) {
        }

        default void onGearChanged(int gear) {
        }

        default void onErrorEvent(int errorCode, int operation) {
        }
    }


    public interface ContextWeatherInfoEventListener {
        default void onWeatherInfo(String weatherInfo) {
        }

        default void onErrorEvent(int errorCode, int operation) {
        }
    }


    public static final class EventCallbackHandler extends Handler {
        WeakReference<ContextInfoManager> mMgr;

        EventCallbackHandler(ContextInfoManager mgr, Looper looper) {
            throw new RuntimeException("Stub!");
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            throw new RuntimeException("Stub!");
        }
    }


    public static class ContextInfoEventListenerToService extends IContextInfoEventListener.Stub {
        private final WeakReference<ContextInfoManager> mManager;

        public ContextInfoEventListenerToService(ContextInfoManager manager) {
            this.mManager = new WeakReference<>(manager);
        }

        @Override
        public void onCommonEvent(int eventType, int eventValue) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onAccelerationEvent(float accelerationValue) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onAngularVelocityEvent(float angularVelocityValue) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onManeuverEvent(Maneuver maneuver, int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onRemainInfoEvent(RemainInfo remainInfo, int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onNaviEvent(Navi navi, int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onNaviStatus(NaviStatus naviStatus, int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onHomeCompanyRouteInfo(HomeCompanyRouteInfo info, int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onLaneEvent(Lane lane, int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onCameraEvent(Camera camera, int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onCameraIntervalEvent(CameraInterval cameraInterval, int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onSapaEvent(Sapa sapa, int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onCrossEvent(Cross cross, int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onLocationEvent(Location location, int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onNavigationInfo(String navInfo) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onNavigationEnable(boolean enable) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onMsgEvent(int msgType) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onWeatherInfo(String weatherInfo) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onGearChanged(int gear) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onCarSpeed(float speed) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onIGStatus(int status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onAutoBrightness(int lux, int autolight) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onXPilotWarning(int type, int status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onAvpWifi(int status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onRemoteCommand(int remoteCmd) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onLLUStatus(int type, int status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onATLSStatus(int type, int status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onBeltStatus(int status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onPowerAction(int powerAction) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onChargingGunStatus(int status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onDeviceChargeStatus(int status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onDriverSeatStatus(int status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onBcmLightMode(int type, int mode) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onVpmEvent(int type, int mode) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onPsdMoto(int status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onPowerOffCount(int cnt) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onError(int errorCode, int operation) {
            throw new RuntimeException("Stub!");
        }
    }

}
