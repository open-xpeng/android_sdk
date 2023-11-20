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

package com.xiaopeng.xuimanager.store.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @noinspection unused
 */
public class ResourceDownloadInfo implements Parcelable {
    public static final Creator<ResourceDownloadInfo> CREATOR = new Creator<ResourceDownloadInfo>() {

        @Override
        public ResourceDownloadInfo createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public ResourceDownloadInfo[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public ResourceDownloadInfo() {
        throw new RuntimeException("Stub!");
    }

    protected ResourceDownloadInfo(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public static Creator<ResourceDownloadInfo> getCREATOR() {
        return CREATOR;
    }

    public long getDownloadId() {
        throw new RuntimeException("Stub!");
    }

    public void setDownloadId(long downloadId) {
        throw new RuntimeException("Stub!");
    }

    public String getTitle() {
        throw new RuntimeException("Stub!");
    }

    public void setTitle(String title) {
        throw new RuntimeException("Stub!");
    }

    public long getSpeed() {
        throw new RuntimeException("Stub!");
    }

    public void setSpeed(long speed) {
        throw new RuntimeException("Stub!");
    }

    public int getVisibility() {
        throw new RuntimeException("Stub!");
    }

    public void setVisibility(int visibility) {
        throw new RuntimeException("Stub!");
    }

    public String getExpandInstalledContent() {
        throw new RuntimeException("Stub!");
    }

    public void setExpandInstalledContent(String expandInstalledContent) {
        throw new RuntimeException("Stub!");
    }

    public String getRscId() {
        throw new RuntimeException("Stub!");
    }

    public void setRscId(String id) {
        throw new RuntimeException("Stub!");
    }

    public String getUrl() {
        throw new RuntimeException("Stub!");
    }

    public void setUrl(String url) {
        throw new RuntimeException("Stub!");
    }

    public int getStatus() {
        throw new RuntimeException("Stub!");
    }

    public void setStatus(int status) {
        throw new RuntimeException("Stub!");
    }

    public long getTotalBytes() {
        throw new RuntimeException("Stub!");
    }

    public void setTotalBytes(long totalBytes) {
        throw new RuntimeException("Stub!");
    }

    public long getDownloadedBytes() {
        throw new RuntimeException("Stub!");
    }

    public void setDownloadedBytes(long downloadedBytes) {
        throw new RuntimeException("Stub!");
    }

    public String getFileUri() {
        throw new RuntimeException("Stub!");
    }

    public void setFileUri(String fileUri) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        throw new RuntimeException("Stub!");
    }
}
