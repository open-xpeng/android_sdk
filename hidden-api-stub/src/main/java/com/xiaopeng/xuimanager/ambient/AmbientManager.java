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

package com.xiaopeng.xuimanager.ambient;

import android.graphics.Color;
import android.os.IBinder;
import android.util.Pair;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

import java.util.Map;
import java.util.Set;

/**
 * @noinspection unused
 */
public class AmbientManager implements XUIManagerBase {
    public static final int MSG_REQUEST      = 0;
    public static final int MSG_ENABLE       = 1;
    public static final int MSG_PLAY         = 2;
    public static final int MSG_STOP         = 3;
    public static final int MSG_SETMODE      = 4;
    public static final int MSG_SUBMODE      = 5;
    public static final int MSG_BRIGHT       = 6;
    public static final int MSG_COLORTYPE    = 7;
    public static final int MSG_MONOCOLOR    = 8;
    public static final int MSG_DOUBLECOLOR  = 9;
    public static final int MSG_THEMECOLOR   = 10;
    public static final int MSG_REGIONCOLOR  = 11;
    public static final int MSG_REGIONBRIGHT = 12;
    public static final int MSG_ERR_EFFECT   = 13;
    public static final int MSG_ERR_MODE     = 14;

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

    public synchronized void registerListener(EventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(EventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int requestAmbientLightPermission(boolean apply) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setAmbientLightEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getAmbientLightEnable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Set<String> showAmbientLightEffectPartitions() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Set<String> showAmbientLightEffects() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int playAmbientLightEffect(String partition, String effect) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int playAmbientLightEffect(String partition, AmbientEffect effect) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int stopAmbientLightEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Set<String> showAmbientLightModePartitions() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Set<String> showAmbientLightModes() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setAmbientLightMode(String partition, String mode) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int subAmbientLightMode(String partition, String mode) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getAmbientLightMode(String partition) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Map<String, String> getAmbientLightPartitionModes() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setAmbientLightBright(String partition, int bright) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getAmbientLightBright(String partition) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Set<String> showAmbientLightColorTypes() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setAmbientLightColorType(String partition, String colorType) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getAmbientLightColorType(String partition) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setAmbientLightMonoColor(String partition, Color color) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Color getAmbientLightMonoColor(String partition) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setAmbientLightDoubleColor(String partition, Pair<Color, Color> color) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Pair<Color, Color> getAmbientLightDoubleColor(String partition) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Set<String> showAmbientLightThemesColor() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setAmbientLightThemeColor(String partition, String themeColor) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getAmbientLightThemeColor(String partition) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Set<String> showAmbientLightRegions() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setAmbientLightRegionColor(String partition, String region, Color color) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Color getAmbientLightRegionColor(String partition, String region) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setAmbientLightRegionBright(String partition, String region, int bright) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getAmbientLightRegionBright(String partition, String region) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public interface EventListener {
        default void onRequestAmbientLight(boolean apply) {
        }

        default void onChangeAmbientLightEnable(boolean enable) {
        }

        default void onPlayEffect(String partition, String effect) {
        }

        default void onStopEffect(String partition, String effect) {
        }

        default void onErrorPlay(String partition, String effect) {
        }

        default void onErrorStop(String partition, String effect) {
        }

        default void onAddMode(String partition, String mode) {
        }

        default void onSubMode(String partition, String mode) {
        }

        default void onChangeMode(String partition, String mode) {
        }

        default void onErrorSet(String partition, String mode) {
        }

        default void onErrorSub(String partition, String mode) {
        }

        default void onChangeBright(String partition, int bright) {
        }

        default void onChangeColorType(String partition, String type) {
        }

        default void onChangeMonoColor(String partition, Color color) {
        }

        default void onChangeDoubleColor(String partition, Pair<Color, Color> color) {
        }

        default void onChangeThemeColor(String partition, String theme) {
        }

        default void onChangeRegionColor(String partition, String region, Color color) {
        }

        default void onChangeRegionBright(String partition, String region, int bright) {
        }
    }

}
