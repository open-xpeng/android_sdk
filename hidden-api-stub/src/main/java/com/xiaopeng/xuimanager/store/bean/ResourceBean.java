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
public class ResourceBean implements Parcelable {
    public static final Creator<ResourceBean> CREATOR = new Creator<ResourceBean>() {

        @Override
        public ResourceBean createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public ResourceBean[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public ResourceBean() {
        throw new RuntimeException("Stub!");
    }

    protected ResourceBean(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public int getSource() {
        throw new RuntimeException("Stub!");
    }

    public void setSource(int source) {
        throw new RuntimeException("Stub!");
    }

    public String getExpandInstalledContent() {
        throw new RuntimeException("Stub!");
    }

    public void setExpandInstalledContent(String expandInstalledContent) {
        throw new RuntimeException("Stub!");
    }

    public String getExpandContent() {
        throw new RuntimeException("Stub!");
    }

    public void setExpandContent(String expandContent) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getDes() {
        throw new RuntimeException("Stub!");
    }

    public void setDes(String des) {
        throw new RuntimeException("Stub!");
    }

    public String getPrice() {
        throw new RuntimeException("Stub!");
    }

    public void setPrice(String price) {
        throw new RuntimeException("Stub!");
    }

    public String getType() {
        throw new RuntimeException("Stub!");
    }

    public void setType(String type) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        throw new RuntimeException("Stub!");
    }

    public String getDownloadUrl() {
        throw new RuntimeException("Stub!");
    }

    public void setDownloadUrl(String downloadUrl) {
        throw new RuntimeException("Stub!");
    }

    public String getRscId() {
        throw new RuntimeException("Stub!");
    }

    public void setRscId(String rscId) {
        throw new RuntimeException("Stub!");
    }

    public String getRscName() {
        throw new RuntimeException("Stub!");
    }

    public void setRscName(String rscName) {
        throw new RuntimeException("Stub!");
    }

    public String getRscIcon() {
        throw new RuntimeException("Stub!");
    }

    public void setRscIcon(String rscIcon) {
        throw new RuntimeException("Stub!");
    }

    public int getStatus() {
        throw new RuntimeException("Stub!");
    }

    public void setStatus(int status) {
        throw new RuntimeException("Stub!");
    }

    public String getCreateTime() {
        throw new RuntimeException("Stub!");
    }

    public void setCreateTime(String createTime) {
        throw new RuntimeException("Stub!");
    }

}
