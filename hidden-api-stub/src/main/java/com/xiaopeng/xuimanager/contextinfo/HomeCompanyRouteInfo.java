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
public class HomeCompanyRouteInfo implements Parcelable {
    public static final Parcelable.Creator<HomeCompanyRouteInfo> CREATOR = new Parcelable.Creator<HomeCompanyRouteInfo>() {
        @Override
        public HomeCompanyRouteInfo createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public HomeCompanyRouteInfo[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };


    public HomeCompanyRouteInfo() {
        throw new RuntimeException("Stub!");
    }

    protected HomeCompanyRouteInfo(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public int getRouteInfoType() {
        throw new RuntimeException("Stub!");
    }

    public void setRouteInfoType(int type) {
        throw new RuntimeException("Stub!");
    }

    public long getDistance() {
        throw new RuntimeException("Stub!");
    }

    public void setDistance(long distance) {
        throw new RuntimeException("Stub!");
    }

    public long getTravelTime() {
        throw new RuntimeException("Stub!");
    }

    public void setTravelTime(long travelTime) {
        throw new RuntimeException("Stub!");
    }

    public int getIsOnline() {
        throw new RuntimeException("Stub!");
    }

    public void setIsOnline(int val) {
        throw new RuntimeException("Stub!");
    }

    public String getTrafficBar() {
        throw new RuntimeException("Stub!");
    }

    public void setTrafficBar(String val) {
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