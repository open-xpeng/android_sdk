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

package com.xiaopeng.xuimanager.download;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

import java.util.ArrayList;
import java.util.Map;

/**
 * @noinspection unused
 */
public class XPDownloadManager implements XUIManagerBase {
    public static final int TYPE_CANCEL      = 5;
    public static final int TYPE_COMPLETED   = 3;
    public static final int TYPE_ERROR       = 6;
    public static final int TYPE_IN_PROGRESS = 2;
    public static final int TYPE_PAUSE       = 4;
    public static final int TYPE_START       = 1;

    public XPDownloadManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public synchronized long enqueue(String uri) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized long enqueueWtihTitleDescription(String uri, String title, String description, Map requestHeaders) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized ArrayList<Integer> getStatusListByPackageName(String packageName, String stateKey) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized long enqueueWithHeader(String uri, Map requestHeaders) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized String getState(long id, String stateKey) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean registerListener(DownloadListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(DownloadListener listener) throws XUIServiceNotConnectedException {
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

    public boolean dispatchDownloadCallbackToClientByType(int type, long taskId, String fileUri, long totalBytes, float percentage, long byteTillNow, String completedFileUri, String errorMessage) {
        throw new RuntimeException("Stub!");
    }

    public interface DownloadListener {
        void onDownloadCancel(long j, String str);

        void onDownloadCompleted(long j, String str, String str2);

        void onDownloadError(long j, String str, String str2);

        void onDownloadInProgress(long j, String str, long j2, float f, long j3);

        void onDownloadPause(long j, String str);

        void onDownloadStart(long j, String str);

        void onRegisterError(DownloadListener downloadListener, String str);

        void onRegisterSuccess(DownloadListener downloadListener);

        void onUnRegisterError(DownloadListener downloadListener, String str);

        void onUnRegisterSuccess(DownloadListener downloadListener);
    }

}
