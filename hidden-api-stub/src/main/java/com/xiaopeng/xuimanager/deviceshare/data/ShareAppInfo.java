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

package com.xiaopeng.xuimanager.deviceshare.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @noinspection unused
 */
public class ShareAppInfo implements Parcelable {
    public static final Parcelable.Creator<ShareAppInfo> CREATOR = new Parcelable.Creator<ShareAppInfo>() {

        @Override
        public ShareAppInfo createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public ShareAppInfo[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public ShareAppInfo() {
        throw new RuntimeException("Stub!");
    }

    public ShareAppInfo(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public int getProtocol() {
        throw new RuntimeException("Stub!");
    }

    public void setProtocol(int val) {
        throw new RuntimeException("Stub!");
    }

    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }

    public void setPackageName(String val) {
        throw new RuntimeException("Stub!");
    }

    public String getFriendName() {
        throw new RuntimeException("Stub!");
    }

    public void setFriendName(String val) {
        throw new RuntimeException("Stub!");
    }

    public byte[] getIcon() {
        throw new RuntimeException("Stub!");
    }

    public void setIcon(byte[] icon) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        throw new RuntimeException("Stub!");
    }
}