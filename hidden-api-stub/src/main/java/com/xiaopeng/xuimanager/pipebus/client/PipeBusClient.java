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

package com.xiaopeng.xuimanager.pipebus.client;

import android.content.Context;

import com.xiaopeng.xuimanager.pipebus.ParcelableContainer;

/**
 * @noinspection unused
 */
public final class PipeBusClient {
    public static final int MAX_RETRY_CNT       = 300;
    public static final int MSG_CONNECT_SERVICE = 1;

    public PipeBusClient(String serviceName) {
        throw new RuntimeException("Stub!");
    }

    public void addLogTagSuffix(String suffix) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void init(Context context) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void reset() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerModuleListener(String moduleName, IPipebusClientListener listener) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unRegisterModuleListener(String moduleName, IPipebusClientListener listener) {
        throw new RuntimeException("Stub!");
    }

    public int ioControl(String module, String cmd, String[] params) {
        throw new RuntimeException("Stub!");
    }

    public int ioControlWithPocket(String module, String cmd, String[] params, String[] results) {
        throw new RuntimeException("Stub!");
    }

    public int ioControlWithParcelable(String moduleName, String cmd, ParcelableContainer dataIn, ParcelableContainer dataOut) {
        throw new RuntimeException("Stub!");
    }

    public void handleGetService() {
        throw new RuntimeException("Stub!");
    }


    public interface IPipebusClientListener {
        void onPipeBusEvent(String str, String[] strArr);

        void onPipeBusParcelEvent(String str, ParcelableContainer parcelableContainer);
    }
}
