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

package com.xiaopeng.xuimanager.store;

import android.os.RemoteException;

import com.xiaopeng.xuimanager.store.bean.ResourceDownloadInfo;


/**
 * @noinspection unused
 */
public class RMDownloadCallbackListenerToService extends IRMDownloadCallback.Stub {

    public RMDownloadCallbackListenerToService(StoreResourceProvider storeResourceProvider) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onDownloadCallback(int status, ResourceDownloadInfo resourceDownloadInfo) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onMenuOpenCallback(String resourceId) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void unbindService() {
        throw new RuntimeException("Stub!");
    }
}
