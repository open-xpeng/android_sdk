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

package com.xiaopeng.xuimanager.lightlanuage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * @noinspection unused
 */
public class LightLanuageManager implements XUIManagerBase {
    public static final boolean DBG               = false;
    public static final int     MSG_ERROR_EVENT   = 4;
    public static final int     MSG_FINISH_EVENT  = 3;
    public static final int     MSG_START_EVENT   = 1;
    public static final int     MSG_STOP_EVENT    = 2;
    public static final int     MSG_UPGRADE_EVENT = 5;


    public LightLanuageManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchStartEventToClient(String name, String type) {
        throw new RuntimeException("Stub!");
    }


    public void dispatchStopEventToClient(String name, String type) {
        throw new RuntimeException("Stub!");
    }


    public void dispatchFinishEventToClient(String name, String type) {
        throw new RuntimeException("Stub!");
    }


    public void dispatchErrorEventToClient(String name, int errCode) {
        throw new RuntimeException("Stub!");
    }


    public void dispatchUpgradeEventToClient(int name, int mode) {
        throw new RuntimeException("Stub!");
    }


    public void handleStartEvent(String name, String type) {
        throw new RuntimeException("Stub!");
    }


    public void handleStopEvent(String name, String type) {
        throw new RuntimeException("Stub!");
    }


    public void handleFinishEvent(String name, String type) {
        throw new RuntimeException("Stub!");
    }


    public void handleErrorEvent(String name, int errCode) {
        throw new RuntimeException("Stub!");
    }


    public void handleUpgradeEvent(int name, int mode) {
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

    public void loadLightEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public List<String> getLightEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getUserEffectInfoList() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getUserEffectInfo(String subdir) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getLocalDanceEffectInfo() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getSayhiEffectEnable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setSayhiEffectEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getRhythmEffectEnable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setRhythmEffectEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getLightEffectEnable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setLightEffectEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getMcuEffect(int name) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setMcuEffect(int name, int mode) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getRhythmEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setRhythmEffect(String name) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getRunningEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean isDanceEffectRunning() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getDanceEffectRunnable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int playEffect(String name, int count) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void stopEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void playSmartEffect(int type) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void stopSmartEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public interface EventListener {
        default void onStart(String name, String type) {
        }

        default void onStop(String name, String type) {
        }

        default void onFinish(String name, String type) {
        }

        default void onError(String name, int errCode) {
        }

        default void onUpgrade(int name, int mode) {
        }
    }

    public static class LightLanuageListenerToService extends ILightLanuageEventListener.Stub {
        private final WeakReference<LightLanuageManager> mManager;

        public LightLanuageListenerToService(LightLanuageManager manager) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onStartEvent(String name, String type) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onStopEvent(String name, String type) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onFinishEvent(String name, String type) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onErrorEvent(String name, int errCode) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onUpgradeEvent(int name, int mode) {
            throw new RuntimeException("Stub!");
        }
    }
}
