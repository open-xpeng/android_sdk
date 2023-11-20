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

package com.xiaopeng.xuimanager.iot;

import android.content.Context;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.pipebus.IPipeBus;

import java.util.List;
import java.util.Map;

/**
 * @noinspection unused
 */
public class IoTManager implements XUIManagerBase {
    public static final int MAX_RETRY_CNT      = 150;
    public static final int MSG_CONNECT_IOTSVC = 1;

    public static IoTManager getInstance() {
        throw new RuntimeException("Stub!");
    }

    public IPipeBus selfGetService() {
        throw new RuntimeException("Stub!");
    }

    public void processEvent(String types, String[] events) {
        throw new RuntimeException("Stub!");
    }

    public void selfSubscribeNotifications() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIDisconnected() {
        throw new RuntimeException("Stub!");
    }

    public void init(Context context) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void reset() {
        throw new RuntimeException("Stub!");
    }

    public List<BaseDevice> getDevice(String getType, String params) {
        throw new RuntimeException("Stub!");
    }

    public void requestDeviceList(String deviceFilter) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(IDeviceListener listener) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unRegisterListener(IDeviceListener listener) {
        throw new RuntimeException("Stub!");
    }

    public Map<String, String> getDeviceProperties(BaseDevice device) {
        throw new RuntimeException("Stub!");
    }

    public void setDeviceProperties(BaseDevice device, Map<String, String> propMap) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void subscribeNotifications(BaseDevice device) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unSubscribeNotifications(BaseDevice device) {
        throw new RuntimeException("Stub!");
    }

    public void sendCommand(BaseDevice device, String cmd, String params) {
        throw new RuntimeException("Stub!");
    }
}