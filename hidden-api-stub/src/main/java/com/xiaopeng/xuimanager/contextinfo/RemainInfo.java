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

package com.xiaopeng.xuimanager.contextinfo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @noinspection unused
 */
public class RemainInfo implements Parcelable {
    public static final Parcelable.Creator<RemainInfo> CREATOR = new Parcelable.Creator<RemainInfo>() {
        @Override
        public RemainInfo createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public RemainInfo[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public RemainInfo() {
    }

    protected RemainInfo(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public String getRouteRemainDistDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setRouteRemainDistDisplay(String routeRemainDistDisplay) {
        throw new RuntimeException("Stub!");
    }

    public int getRouteRemainDistUnitDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setRouteRemainDistUnitDisplay(int routeRemainDistUnitDisplay) {
        throw new RuntimeException("Stub!");
    }

    public String getCarRemainDistDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setCarRemainDistDisplay(String carRemainDistDisplay) {
        throw new RuntimeException("Stub!");
    }

    public int getCarRemainDistUnitDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setCarRemainDistUnitDisplay(int carRemainDistUnitDisplay) {
        throw new RuntimeException("Stub!");
    }

    public int getDistType() {
        throw new RuntimeException("Stub!");
    }

    public void setDistType(int distType) {
        throw new RuntimeException("Stub!");
    }

    public int getRouteRemainDist() {
        throw new RuntimeException("Stub!");
    }

    public void setRouteRemainDist(int routeRemainDist) {
        throw new RuntimeException("Stub!");
    }

    public int getCarRemainDist() {
        throw new RuntimeException("Stub!");
    }

    public void setCarRemainDist(int carRemainDist) {
        throw new RuntimeException("Stub!");
    }

    public int getSmartStatus() {
        throw new RuntimeException("Stub!");
    }

    public void setSmartStatus(int smartStatus) {
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