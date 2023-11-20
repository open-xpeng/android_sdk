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

package com.xiaopeng.xuimanager.pipebus.server;

import com.xiaopeng.xuimanager.pipebus.ParcelableContainer;

import java.io.PrintWriter;

/**
 * @noinspection unused
 */
public abstract class PipeBusManager {
    protected volatile IPipeBusManagerCallback mCallback = null;

    public abstract void dump(PrintWriter printWriter, String[] strArr);

    public abstract String getModuleName();

    public abstract int init();

    public abstract int ioControl(String str, String[] strArr, int i, int i2);

    public abstract int ioControlWithParcelable(String str, ParcelableContainer parcelableContainer, ParcelableContainer parcelableContainer2, int i, int i2);

    public abstract int ioControlWithPocket(String str, String[] strArr, String[] strArr2, int i, int i2);

    public abstract void onClientDied(int i, int i2);

    public abstract void registerListener(int i, int i2);

    public abstract void unRegisterListener(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void registerCallback(IPipeBusManagerCallback callback) {
        throw new RuntimeException("Stub!");
    }
}
