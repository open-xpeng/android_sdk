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

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

import com.xiaopeng.xuimanager.pipebus.IPipeBus;
import com.xiaopeng.xuimanager.pipebus.IPipeBusListener;
import com.xiaopeng.xuimanager.pipebus.ParcelableContainer;

/**
 * @noinspection unused
 */
public abstract class AbsPipeBusManagerService extends IPipeBus.Stub implements IPipeBusManagerCallback {

    public static boolean isServiceReady() {
        throw new RuntimeException("Stub!");
    }

    public abstract String getServiceName();

    public abstract void onTransactEnter(int i, Parcel parcel, Parcel parcel2, int i2, String str);

    /* JADX INFO: Access modifiers changed from: package-private */

    public abstract void onTransactLeave(int i, Parcel parcel, Parcel parcel2, int i2, String str);

    public void diedToManagers(String name, int uid, int pid) {
        throw new RuntimeException("Stub!");
    }

    public boolean init() {
        throw new RuntimeException("Stub!");
    }

    public void addManager(String module, PipeBusManager manager) {
        throw new RuntimeException("Stub!");
    }

    public void waitManagersReady(long timeoutMs) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onPipeBusEvent(String module, String types, String[] events) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onPipeBusEvent(String module, String types, String[] events, int pid) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onPipeBusParcelEvent(String module, String types, ParcelableContainer data) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onPipeBusParcelEvent(String module, String types, ParcelableContainer data, int pid) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int ioControl(String module, String cmd, String[] params) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int ioControlWithPocket(String moduleName, String cmd, String[] params, String[] results) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int ioControlWithParcelable(String moduleName, String cmd, ParcelableContainer dataIn, ParcelableContainer dataOut) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void registerListener(IPipeBusListener iPipeBusListener) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void unRegisterListener(IPipeBusListener iPipeBusListener) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    @Override
    public synchronized void registerListenerEx(String moduleName, IPipeBusListener iPipeBusListener) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public synchronized void unRegisterListenerEx(String moduleName) {
        throw new RuntimeException("Stub!");
    }

    public final class PipeListenerRecord implements IBinder.DeathRecipient {

        @Override
        public void binderDied() {
            throw new RuntimeException("Stub!");
        }
    }

}
