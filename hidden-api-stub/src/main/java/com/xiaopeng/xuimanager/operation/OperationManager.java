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

package com.xiaopeng.xuimanager.operation;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

import java.util.List;

/**
 * @noinspection unused
 */
public class OperationManager implements XUIManagerBase {

    public OperationManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onServerDisconnected() {
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

    public synchronized void registerListener(OperationEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(int type, IOperationListener listener) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(OperationEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unRegisterListener(int type, IOperationListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void downloadResource(boolean useSystemTraffic, OperationResource resource) {
        throw new RuntimeException("Stub!");
    }

    public void downloadResource(boolean useSystemTraffic, OperationResource resource, PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }

    public void cancelDownload(OperationResource resource) {
        throw new RuntimeException("Stub!");
    }

    public void pauseDownload(OperationResource resource) {
        throw new RuntimeException("Stub!");
    }

    public void resumeDownload(OperationResource resource) {
        throw new RuntimeException("Stub!");
    }

    public void showDownloadResourceDetail(String downloadUri, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public void setAutoSync(int type) {
        throw new RuntimeException("Stub!");
    }

    public void getRemoteResourceList(int type) {
        throw new RuntimeException("Stub!");
    }

    public List<OperationResource> getResourceList(int type) {
        throw new RuntimeException("Stub!");
    }

    public OperationResource getSelectedResource(int type) {
        throw new RuntimeException("Stub!");
    }

    public List<DownloadStatusInfo> getDownloadStatusList(int type) {
        throw new RuntimeException("Stub!");
    }

    public int addNewResource(String id, int type, String rsc_name, String rsc_path) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getLocalResourceList(int type) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getDownLoadResourceList(int type) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean checkResourceExist(int type, String rsc_name) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int deleteResource(String id, int type, String rsc_name) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void deleteResource(String id) {
        throw new RuntimeException("Stub!");
    }

    public void handleOperationEvent(int code, String id, int type, String event) {
        throw new RuntimeException("Stub!");
    }

    public void handleOperationErrorEvent(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchEvent(int code, int type, String event) {
        throw new RuntimeException("Stub!");
    }


    public interface OperationEventListener {
        void onErrorEvent(int i, int i2);

        void onEvent(int i, String str, int i2, String str2);
    }


}
