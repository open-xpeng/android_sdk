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

package com.xiaopeng.xuimanager.ambientlight;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

import java.util.List;

/**
 * @noinspection unused
 */
public class AmbientLightManager implements XUIManagerBase {
    public static final int BRIGHT_SET_EVENT = 5;

    public static final boolean DBG = false;

    public static final int DOUBLE_COLOR_ENABLE_EVENT = 2;
    public static final int DOUBLE_COLOR_SET_EVENT    = 4;

    public static final String EFFECT_FOLLOW_SPEED     = "follow_speed";
    public static final String EFFECT_GENTLE_BREATHING = "gentle_breathing";
    public static final String EFFECT_MUSIC            = "music";
    public static final String EFFECT_STABLE_EFFECT    = "stable_effect";

    public static final int EFFECT_TYPE_SET_EVENT = 1;

    public static final String EFFECT_WELCOME           = "welcome_effect";
    public static final String EFFECT_WELCOME_5D_CINEMA = "5d_cinema_welcome_effect";

    public static final int LIGHT_COLOR_1  = 1;
    public static final int LIGHT_COLOR_10 = 10;
    public static final int LIGHT_COLOR_11 = 11;
    public static final int LIGHT_COLOR_12 = 12;
    public static final int LIGHT_COLOR_13 = 13;
    public static final int LIGHT_COLOR_14 = 14;
    public static final int LIGHT_COLOR_15 = 15;
    public static final int LIGHT_COLOR_16 = 16;
    public static final int LIGHT_COLOR_17 = 17;
    public static final int LIGHT_COLOR_18 = 18;
    public static final int LIGHT_COLOR_19 = 19;
    public static final int LIGHT_COLOR_2  = 2;
    public static final int LIGHT_COLOR_20 = 20;
    public static final int LIGHT_COLOR_3  = 3;
    public static final int LIGHT_COLOR_4  = 4;
    public static final int LIGHT_COLOR_5  = 5;
    public static final int LIGHT_COLOR_6  = 6;
    public static final int LIGHT_COLOR_7  = 7;
    public static final int LIGHT_COLOR_8  = 8;
    public static final int LIGHT_COLOR_9  = 9;

    public static final  int MONO_COLOR_SET_EVENT                       = 3;
    public static final  int SWITCH_SET_EVENT                           = 6;
    private static final int MSG_AMBIENTLIGHT_BRIGHT_SET_EVENT          = 5;
    private static final int MSG_AMBIENTLIGHT_DOUBLE_COLOR_ENABLE_EVENT = 2;
    private static final int MSG_AMBIENTLIGHT_DOUBLE_COLOR_SET_EVENT    = 4;
    private static final int MSG_AMBIENTLIGHT_EFFECT_TYPE_SET_EVENT     = 1;
    private static final int MSG_AMBIENTLIGHT_ERROR_EVENT               = 0;
    private static final int MSG_AMBIENTLIGHT_MONO_COLOR_SET_EVENT      = 3;
    private static final int MSG_AMBIENTLIGHT_SWITCH_SET_EVENT          = 6;

    public AmbientLightManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(AmbientLightEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(AmbientLightEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void dispatchErrorEventToClient(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLightEffectTypeSetEventToClient(String effectType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLightDoubleColorEnableEventToClient(String effectType, boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLightMonoColorSetEventToClient(String effectType, int color) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLightBrightSetEventToClient(String effectType, int bright) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLightDoubleColorSetEventToClient(String effectType, int first_color, int second_color) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLightSwitchSetEventToClient(String effectType, boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public void handleErrorEvent(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightEffectTypeSetEvent(String effectType) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightDoubleColorEnableEvent(String effectType, boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightMonoColorSetEvent(String effectType, int color) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightDoubleColorSetEvent(String effectType, int first_color, int second_color) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightBrightSetEvent(String effectType, int bright) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightSwitchSetEvent(String effectType, boolean enable) {
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

    public boolean getMusicSpectrumEnable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setMusicSpectrumEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setMusicRhythmMode(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getAmbientLightMonoColor(String effectType) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setAmbientLightMonoColor(String effectType, int color) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getAmbientLightDoubleFirstColor(String effectType) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getAmbientLightDoubleSecondColor(String effectType) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getAmbientLightBright() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setAmbientLightBright(int bright) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setAmbientLightDoubleColor(String effectType, int first_color, int second_color) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setAmbientLightMemoryBright(int bright) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getDoubleThemeColorEnable(String effectType) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setDoubleThemeColorEnable(String effectType, boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getAmbientLightEffectType() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setAmbientLightEffectType(String effectType) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getAmbientLightOpen() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setAmbientLightOpen(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public List<String> getAmbientLightEffectTypeList() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean isSupportDoubleThemeColor(String effectType) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int requestPermission(boolean apply) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int startPlay(String[] effectData) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int pausePlay() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int stopPlay() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public interface AmbientLightEventListener {
        void onErrorEvent(int i, int i2);

        default void onLightEffectTypeSetEvent(String effectType) {
        }

        default void onLightDoubleColorEnableEvent(String effectType, boolean enable) {
        }

        default void onLightMonoColorSetEvent(String effectType, int color) {
        }

        default void onLightDoubleColorSetEvent(String effectType, int first_color, int second_color) {
        }

        default void onLightBrightSetEvent(String effectType, int bright) {
        }

        default void onLightSwitchSetEvent(String effectType, boolean enable) {
        }
    }

}
