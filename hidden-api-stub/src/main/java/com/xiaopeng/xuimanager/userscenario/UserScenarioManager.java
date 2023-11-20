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

package com.xiaopeng.xuimanager.userscenario;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;

import com.xiaopeng.xuimanager.XUIManagerBase;

/**
 * @noinspection unused
 */
public class UserScenarioManager implements XUIManagerBase {
    public static final String ACTION_KEY_EXIT_REASON     = "exitReason";
    public static final String ACTION_KEY_EXTRA_INFO      = "extraInfo";
    public static final String ACTION_KEY_FRIEND_SCENARIO = "friendScenario";
    public static final String ACTION_KEY_NAME            = "scenario_name";
    public static final String ACTION_KEY_PACKAGE         = "package";
    public static final String ACTION_KEY_SOURCE          = "source";
    public static final String ACTION_KEY_STATUS          = "status";
    public static final String ACTION_USERSCENARIO        = "com.xiaopeng.xui.userscenario";
    public static final String ACTION_VALUE_ENTER         = "enter";
    public static final String ACTION_VALUE_EXIT          = "exit";

    public static final String PARAM_KEY_SCREEN_USE = "pScreenUse";

    public static final String REASON_APP_REQUEST     = "rAppRequest";
    public static final String REASON_BATTERY_LOW     = "rBatteryLow";
    public static final String REASON_DOOR_OPEN       = "rDoorOpen";
    public static final String REASON_GEAR_NOT_P      = "rGearNotP";
    public static final String REASON_IG_OFF          = "rIgOff";
    public static final String REASON_IN_DC_CHARGE    = "rInDcCharge";
    public static final String REASON_SCENARIO_SWITCH = "rScenarioSwitch";
    public static final String REASON_SCREEN_ON       = "rScreenOn";
    public static final String REASON_VOICE_ACTIVE    = "rVoiceActive";

    public static final String RET_DIALOG_CONFIRM                   = "dialogConfirm";
    public static final String RET_FAIL_DOOR_OPEN                   = "doorOpen";
    public static final String RET_FAIL_GEAR_NOT_P                  = "gearNotP";
    public static final String RET_FAIL_PANEL_INVALID               = "panelInvalid#";
    public static final String RET_REMOTE_EXCEPTION                 = "remoteException";
    public static final String RET_SCENARIO_CONFLICT                = "conflict#";
    public static final String RET_SCENARIO_CONFLICT_5D_CINEMA      = "conflict#5d_cinema_mode";
    public static final String RET_SCENARIO_CONFLICT_CLEANING       = "conflict#cleaning_mode";
    public static final String RET_SCENARIO_CONFLICT_COSMETIC_SPACE = "conflict#cosmetic_space_mode";
    public static final String RET_SCENARIO_CONFLICT_MEDITATION     = "conflict#meditation_mode";
    public static final String RET_SCENARIO_CONFLICT_SPACECAPSULE   = "conflict#spacecapsule_mode";
    public static final String RET_SCENARIO_CONFLICT_VIPSEAT        = "conflict#vipseat_mode";
    public static final String RET_SCENARIO_CONFLICT_WAITING        = "conflict#waiting_mode";
    public static final String RET_SCENARIO_INVALID                 = "scenarioInvalid";
    public static final String RET_SCENARIO_UNAVAILABLE             = "scenarioUnavailable";
    public static final String RET_SUCCESS                          = "success";

    public static final String SCENARIO_5D_CINEMA_MODE                = "5d_cinema_mode";
    public static final int    SCENARIO_5D_CINEMA_MODE_VAL            = 3;
    public static final String SCENARIO_ALL                           = "scenario_all";
    public static final String SCENARIO_CLEANING_MODE                 = "cleaning_mode";
    public static final int    SCENARIO_CLEANING_MODE_VAL             = 6;
    public static final String SCENARIO_COSMETIC_SPACE_MODE           = "cosmetic_space_mode";
    public static final int    SCENARIO_COSMETIC_SPACE_MODE_VAL       = 10;
    public static final String SCENARIO_MEDITATION_BACK_ROW           = "meditation_back_row_mode";
    public static final int    SCENARIO_MEDITATION_BACK_ROW_VAL       = 12;
    public static final String SCENARIO_MEDITATION_MODE               = "meditation_mode";
    public static final int    SCENARIO_MEDITATION_MODE_VAL           = 4;
    public static final String SCENARIO_MEDITATION_PASSENGER_SEAT     = "meditation_passenger_seat_mode";
    public static final int    SCENARIO_MEDITATION_PASSENGER_SEAT_VAL = 11;
    public static final String SCENARIO_NORMAL                        = "normal_mode";
    public static final int    SCENARIO_NORMAL_VAL                    = 0;
    public static final String SCENARIO_PARKING                       = "parking_mode";
    public static final int    SCENARIO_PARKING_VAL                   = 13;
    public static final String SCENARIO_SPACECAPSULE_MODE             = "spacecapsule_mode";
    public static final int    SCENARIO_SPACECAPSULE_MODE_VAL         = 7;
    public static final String SCENARIO_SPACECAPSULE_MOVIE_MODE       = "spacecapsule_mode_movie";
    public static final int    SCENARIO_SPACECAPSULE_MOVIE_MODE_VAL   = 1;
    public static final String SCENARIO_SPACECAPSULE_SLEEP_MODE       = "spacecapsule_mode_sleep";
    public static final int    SCENARIO_SPACECAPSULE_SLEEP_MODE_VAL   = 2;
    public static final String SCENARIO_TRAILED_MODE                  = "trailed_mode";
    public static final int    SCENARIO_TRAILED_MODE_VAL              = 9;
    public static final String SCENARIO_VIPSEAT_MODE                  = "vipseat_mode";
    public static final int    SCENARIO_VIPSEAT_MODE_VAL              = 8;
    public static final String SCENARIO_WAITING_MODE                  = "waiting_mode";
    public static final int    SCENARIO_WAITING_MODE_VAL              = 5;

    public static final String SOURCE_ACTIVITY = "activity";
    public static final String SOURCE_SERVICE  = "service";
    public static final String SOURCE_SIGNAL   = "signal";
    public static final String SOURCE_VOICE    = "voice";

    public static final int STATE_EXITING  = 3;
    public static final int STATE_IDLE     = 0;
    public static final int STATE_INVALID  = -1;
    public static final int STATE_RUNNING  = 2;
    public static final int STATE_STARTING = 1;


    public UserScenarioManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public static int getScenarioNameValue(String scenario) {
        throw new RuntimeException("Stub!");
    }

    public void notifyEvent(String scenario, int status) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public synchronized void onXUIDisconnected() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public synchronized void onXUIConnected(IBinder service) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onServerDisconnected() {
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

    public String enterUserScenario(String scenario, String source) {
        throw new RuntimeException("Stub!");
    }

    public String enterUserScenario(String scenario, String source, String extra) {
        throw new RuntimeException("Stub!");
    }

    public String exitUserScenario(String scenario) {
        throw new RuntimeException("Stub!");
    }

    public String getCurrentUserScenario() {
        throw new RuntimeException("Stub!");
    }

    public String[] getCurrentUserScenarios() {
        throw new RuntimeException("Stub!");
    }

    public int getUserScenarioStatus(String scenario) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(UserScenarioListener listener) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(UserScenarioListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void reportStatus(String scenario, int status) {
        throw new RuntimeException("Stub!");
    }

    public String registerBinderObserver(IBinder binder) {
        throw new RuntimeException("Stub!");
    }

    public String registerBinderObserver(IBinder binder, String scenario) {
        throw new RuntimeException("Stub!");
    }

    public String checkEnterUserScenario(String scenario, String source) {
        throw new RuntimeException("Stub!");
    }

    public String setParameters(String scenario, String jsonStr) {
        throw new RuntimeException("Stub!");
    }

    public interface UserScenarioListener {
        void onUserScenarioStateChanged(String str, int i);
    }
}
