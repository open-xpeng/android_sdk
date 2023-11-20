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

import android.content.Context;
import android.content.ServiceConnection;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.store.bean.ResourceBean;
import com.xiaopeng.xuimanager.store.bean.ResourceContainerBean;
import com.xiaopeng.xuimanager.store.bean.ResourceDownloadInfo;

import java.io.File;
import java.util.List;


/**
 * @noinspection unused
 */
public class StoreResourceProvider implements XUIManagerBase {
    public static final long   INVALID_DOWNLOAD_BYTES                        = -1;
    public static final long   INVALID_DOWNLOAD_ID                           = -1;
    public static final int    INVALID_DOWNLOAD_STATUS                       = -1;
    public static final int    STATE_CONNECTED                               = 2;
    public static final int    STATE_CONNECTING                              = 1;
    public static final int    STATE_DISCONNECTED                            = 0;
    public static final String STORE_RESOURCE_MANAGER_SERVICE                = "com.xiaopeng.appstore";
    public static final String STORE_RESOURCE_MANAGER_SERVICE_INTERFACE_NAME = "com.xiaopeng.appstore.resourceservice.ResourceService";

    public StoreResourceProvider(Context context) {
        throw new RuntimeException("Stub!");
    }

    boolean isResourceServiceConnected() {
        throw new RuntimeException("Stub!");
    }

    public void setServiceConnectionListenerClient(ServiceConnection mServiceConnectionListenerClient) {
        throw new RuntimeException("Stub!");
    }

    private void startResourceManagerService() {
        throw new RuntimeException("Stub!");
    }

    public ResourceContainerBean queryResourceData(String type) {
        throw new RuntimeException("Stub!");
    }

    public List<ResourceDownloadInfo> queryDownloadInfo(String[] resIds) {
        throw new RuntimeException("Stub!");
    }

    public void registerDownloadListener(RMDownloadListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterDownloadListener(RMDownloadListener listener) {
        throw new RuntimeException("Stub!");
    }

    public boolean start(ResourceBean resourceBean) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean resume(String resourceId) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean remove(String resourceId) {
        throw new RuntimeException("Stub!");
    }

    @Deprecated
    public boolean pause(String resourceId) {
        throw new RuntimeException("Stub!");
    }

    public boolean resumeResDownload(String resType, String resourceId) {
        throw new RuntimeException("Stub!");
    }

    public boolean cancelResDownload(String resType, String resourceId) {
        throw new RuntimeException("Stub!");
    }

    public boolean pauseResDownload(String resType, String resourceId) {
        throw new RuntimeException("Stub!");
    }

    public boolean resumeDownload(String url) {
        throw new RuntimeException("Stub!");
    }

    public boolean cancelDownload(String url) {
        throw new RuntimeException("Stub!");
    }

    public boolean pauseDownload(String url) {
        throw new RuntimeException("Stub!");
    }

    public long enqueue(String url, String title) {
        throw new RuntimeException("Stub!");
    }

    public List<ResourceDownloadInfo> queryAllInfo() {
        throw new RuntimeException("Stub!");
    }

    public int fetchDownloadStatus(long id) {
        throw new RuntimeException("Stub!");
    }

    public int fetchDownloadStatus(String url) {
        throw new RuntimeException("Stub!");
    }

    public int getDownloadStatus(String url) {
        throw new RuntimeException("Stub!");
    }

    public int getDownloadStatus(long id) {
        throw new RuntimeException("Stub!");
    }

    public long getTotalBytes(long id) {
        throw new RuntimeException("Stub!");
    }

    public long getTotalBytes(String url) {
        throw new RuntimeException("Stub!");
    }

    public long getDownloadedBytes(long id) {
        throw new RuntimeException("Stub!");
    }

    public long getDownloadedBytes(String url) {
        throw new RuntimeException("Stub!");
    }

    public void removeLocalData(long id) {
        throw new RuntimeException("Stub!");
    }

    public void removeLocalData(String url) {
        throw new RuntimeException("Stub!");
    }

    public File getLocalFile(String url) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchDownloadCallback(int status, ResourceDownloadInfo resourceDownloadInfo) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchMenuOpenCallback(String resourceId) {
        throw new RuntimeException("Stub!");
    }

    public void unbindService() {
        throw new RuntimeException("Stub!");
    }

    public void connect() {
        throw new RuntimeException("Stub!");
    }

    public void disconnect() {
        throw new RuntimeException("Stub!");
    }

    public void releaseService() {
        throw new RuntimeException("Stub!");
    }

    public boolean isConnected() {
        throw new RuntimeException("Stub!");
    }

    public boolean isConnecting() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIDisconnected() {
        throw new RuntimeException("Stub!");
    }
}
