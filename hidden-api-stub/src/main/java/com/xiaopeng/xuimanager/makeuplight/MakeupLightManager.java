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

package com.xiaopeng.xuimanager.makeuplight;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

import java.lang.ref.WeakReference;
import java.util.Set;

/**
 * @noinspection unused
 */
public class MakeupLightManager implements XUIManagerBase {
    public static final int ERROR         = 2;
    public static final int MSG_AVAILABLE = 0;
    public static final int MSG_COLORTEMP = 1;
    public static final int MSG_EFFECT    = 3;
    public static final int MSG_LUMINANCE = 2;
    public static final int START         = 0;
    public static final int STOP          = 1;


    public MakeupLightManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchAvailableToClient(boolean status) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchColorTempToClient(int rgb, int white) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLuminanceToClient(int lux) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchEffectToClient(String effect, int type) {
        throw new RuntimeException("Stub!");
    }

    public void handleAvailableEvent(boolean status) {
        throw new RuntimeException("Stub!");
    }

    public void handleColorTemperatureEvent(int rgb, int white) {
        throw new RuntimeException("Stub!");
    }

    public void handleLuminanceEvent(int lux) {
        throw new RuntimeException("Stub!");
    }

    public void handleEffectEvent(String effect, int type) {
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

    public synchronized void registerListener(EventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(EventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void loadMakeupEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Set<String> showMakeupEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Set<String> showAliasColorTemperature() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getMakeupAvailable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setColorTemperature(ColorTemperature colorTemperature) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setColorTemperature(String alias) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public ColorTemperature getColorTemperature() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setLuminance(int lux) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getLuminance() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int runEffect(String effect, int count) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int stopEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public interface EventListener {
        default void onAvailable(boolean status) {
        }

        default void onColorTemperature(ColorTemperature colorTemperature) {
        }

        default void onLuminance(int lux) {
        }

        default void onStartEffect(String effect) {
        }

        default void onStopEffect(String effect) {
        }

        default void onErrorEffect(String effect) {
        }
    }

    public static class ColorTemperature {
        public int rgb;
        public int white;

        public ColorTemperature(int rgb, int white) {
            throw new RuntimeException("Stub!");
        }
    }

    public static class MakeupLightListenerToService extends IMakeupLightEventListener.Stub {
        private final WeakReference<MakeupLightManager> mManager;

        public MakeupLightListenerToService(MakeupLightManager manager) {
            this.mManager = new WeakReference<>(manager);
        }

        @Override
        public void onAvailableEvent(boolean status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onColorTemperatureEvent(int rgb, int white) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onLuminanceEvent(int lux) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onEffectEvent(String effect, int type) {
            throw new RuntimeException("Stub!");
        }
    }
}
