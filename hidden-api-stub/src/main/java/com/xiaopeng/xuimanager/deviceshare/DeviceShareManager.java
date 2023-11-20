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

package com.xiaopeng.xuimanager.deviceshare;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.deviceshare.data.ShareAppInfo;
import com.xiaopeng.xuimanager.deviceshare.data.ShareDevice;

/**
 * @noinspection unused
 */
public class DeviceShareManager implements XUIManagerBase {
    public static final int SHARE_PROTOCOL_CARLINK     = 2;
    public static final int SHARE_PROTOCOL_HICAR       = 1;
    public static final int SHARE_VERIFY_WITH_PIN_CODE = 1;
    public static final int SHARE_VERIFY_WITH_QR_CODE  = 2;

    public static DeviceShareManager getInstance() {
        throw new RuntimeException("Stub!");
    }

    public static /* synthetic */ ShareDevice[] lambda$getTrustedDevices$0(int x$0) {
        throw new RuntimeException("Stub!");
    }

    public static /* synthetic */ ShareDevice[] lambda$getConnectedDevice$1(int x$0) {
        throw new RuntimeException("Stub!");
    }

    public static /* synthetic */ ShareAppInfo[] lambda$getShareApps$2(int x$0) {
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

    @Override
    public void onServerDisconnected() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void init(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public synchronized int registerListener(IDeviceShareListener listener) {
        throw new RuntimeException("Stub!");
    }

    public synchronized int unRegisterListener(IDeviceShareListener listener) {
        throw new RuntimeException("Stub!");
    }

    public ShareDevice[] getTrustedDevices() {
        throw new RuntimeException("Stub!");
    }

    public int deleteTrustedDevice(ShareDevice device) {
        throw new RuntimeException("Stub!");
    }

    public int connectDevice(ShareDevice device) {
        throw new RuntimeException("Stub!");
    }

    public int disConnectDevice(ShareDevice device) {
        throw new RuntimeException("Stub!");
    }

    public ShareDevice[] getConnectedDevice(int protocol) {
        throw new RuntimeException("Stub!");
    }

    public ShareAppInfo[] getShareApps(ShareDevice device) {
        throw new RuntimeException("Stub!");
    }

    public int startApp(ShareAppInfo appInfo) {
        throw new RuntimeException("Stub!");
    }


}
