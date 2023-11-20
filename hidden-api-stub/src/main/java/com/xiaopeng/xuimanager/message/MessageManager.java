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

package com.xiaopeng.xuimanager.message;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

/**
 * @noinspection unused
 */
public class MessageManager implements XUIManagerBase {


    public static MessageManager getInstance() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIConnected(IBinder service) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIDisconnected() {
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

    @Override
    public void init(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public void registerMessage(String messageType, MessageListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void unregisterMessage(String messageType, MessageListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void publishMessage(String messageType, String data) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void handleOnReceiveMessage(String messageType, String data) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchMessage(final String messageType, final String data) {
        throw new RuntimeException("Stub!");
    }


    public interface MessageListener {
        void onReceiveMessage(String str, String str2);
    }

}
