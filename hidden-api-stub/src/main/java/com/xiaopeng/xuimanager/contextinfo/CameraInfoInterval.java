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
public class CameraInfoInterval implements Parcelable {
    public static final Parcelable.Creator<CameraInfoInterval> CREATOR = new Parcelable.Creator<CameraInfoInterval>() {
        @Override
        public CameraInfoInterval createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public CameraInfoInterval[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public CameraInfoInterval() {
        throw new RuntimeException("Stub!");
    }

    protected CameraInfoInterval(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public String getCameraDistDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setCameraDistDisplay(String cameraDistDisplay) {
        throw new RuntimeException("Stub!");
    }

    public int getCameraDistUnitDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setCameraDistUnitDisplay(int cameraDistUnitDisplay) {
        throw new RuntimeException("Stub!");
    }

    public int getRemainDistance() {
        throw new RuntimeException("Stub!");
    }

    public void setRemainDistance(int remainDistance) {
        throw new RuntimeException("Stub!");
    }

    public int getAverageSpeed() {
        throw new RuntimeException("Stub!");
    }

    public void setAverageSpeed(int averageSpeed) {
        throw new RuntimeException("Stub!");
    }

    public int getReasonableSpeedInRemainDist() {
        throw new RuntimeException("Stub!");
    }

    public void setReasonableSpeedInRemainDist(int reasonableSpeedInRemainDist) {
        throw new RuntimeException("Stub!");
    }

    public int getCameraDist() {
        throw new RuntimeException("Stub!");
    }

    public void setCameraDist(int cameraDist) {
        throw new RuntimeException("Stub!");
    }

    public int getCameraSpeed() {
        throw new RuntimeException("Stub!");
    }

    public void setCameraSpeed(int cameraSpeed) {
        throw new RuntimeException("Stub!");
    }

    public int getCameraType() {
        throw new RuntimeException("Stub!");
    }

    public void setCameraType(int cameraType) {
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