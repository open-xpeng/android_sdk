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

package com.xiaopeng.xuimanager.condition;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

/**
 * @noinspection unused
 */
public class ConditionManager implements XUIManagerBase {

    public static ConditionManager getInstance() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void init(IBinder service, Context context, Handler handler) {
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

    public int createCondition(String json) {
        throw new RuntimeException("Stub!");
    }

    public void releaseCondition(int conditionId) {
        throw new RuntimeException("Stub!");
    }

    public boolean isConditionMatch(int conditionId) {
        throw new RuntimeException("Stub!");
    }

    public void startWatchCondition(int conditionId) {
        throw new RuntimeException("Stub!");
    }

    public void stopWatchCondition(int conditionId) {
        throw new RuntimeException("Stub!");
    }

    public void addConditionListener(int conditionId, IConditionListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void removeConditionListener(int conditionId, IConditionListener listener) {
        throw new RuntimeException("Stub!");
    }

    public TwilightState getTwilightState() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void registerTwilightStateListener(TwilightStateListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void unregisterTwilightStateListener(TwilightStateListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void handleTwilightChanged(TwilightState twilightState) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchTwilightChangedToClient(final TwilightState twilightState) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIDisconnected() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIConnected(IBinder binder) {
        throw new RuntimeException("Stub!");
    }

    public void registerBrightnessLevelListener(BrightnessLevelListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void unregisterBrightnessLevelListener(BrightnessLevelListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void handleBrightnessLevelChanged(int prevLevel, int newLevel) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchBrightnessLevelChangedToClient(final int prevLevel, final int newLevel) {
        throw new RuntimeException("Stub!");
    }

    public int getBrightnessLevel() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public interface BrightnessLevelListener {
        void onBrightnessLevelChanged(int i, int i2);
    }

    public interface ConditionListener {
        void onConditionChanged(int i);
    }

    public interface TwilightStateListener {
        void onTwilightStateChanged(TwilightState twilightState);
    }

    public static class TwilightListenerToService extends ITwilightStateListener.Stub {

        public TwilightListenerToService(ConditionManager manager) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onTwilightStateChanged(TwilightState twilightState) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
    }

    public static class BrightnessLevelToService extends IBrightnessLevelListener.Stub {

        public BrightnessLevelToService(ConditionManager manager) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onBrightnessLevelChanged(int prevLevel, int newLevel) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
    }

}
