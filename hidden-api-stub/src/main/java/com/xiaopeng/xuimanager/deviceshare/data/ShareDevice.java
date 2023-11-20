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

import org.json.JSONObject;

/**
 * @noinspection unused
 */
public class ShareDevice implements Parcelable {

    public static final Parcelable.Creator<ShareDevice> CREATOR = new Parcelable.Creator<ShareDevice>() {

        @Override
        public ShareDevice createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public ShareDevice[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public ShareDevice() {
        throw new RuntimeException("Stub!");
    }

    public ShareDevice(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public static ShareDevice buildFromJsonStr(String jsonStr) {
        throw new RuntimeException("Stub!");
    }

    private static ShareDevice buildFromJson(JSONObject obj) {
        throw new RuntimeException("Stub!");
    }

    public static String toJsonArrayStr(ShareDevice[] devices) {
        throw new RuntimeException("Stub!");
    }

    public static ShareDevice[] buildArrayFromJsonStr(String jsonStr) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceId() {
        throw new RuntimeException("Stub!");
    }

    public void setDeviceId(String val) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceName() {
        throw new RuntimeException("Stub!");
    }

    public void setDeviceName(String val) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceMac() {
        throw new RuntimeException("Stub!");
    }

    public void setDeviceMac(String val) {
        throw new RuntimeException("Stub!");
    }

    public long getLastConnectTime() {
        throw new RuntimeException("Stub!");
    }

    public void setLastConnectTime(long val) {
        throw new RuntimeException("Stub!");
    }

    public int getLastProtocolType() {
        throw new RuntimeException("Stub!");
    }

    public void setLastProtocolType(int type) {
        throw new RuntimeException("Stub!");
    }

    private JSONObject toJson() {
        throw new RuntimeException("Stub!");
    }

    public String toJsonStr() {
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

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }
}