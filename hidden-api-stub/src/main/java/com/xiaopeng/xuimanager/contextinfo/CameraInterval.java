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

import java.util.List;

/**
 * @noinspection unused
 */
public class CameraInterval implements Parcelable {
    public static final Parcelable.Creator<CameraInterval> CREATOR = new Parcelable.Creator<CameraInterval>() {
        @Override
        public CameraInterval createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public CameraInterval[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };


    public CameraInterval() {
        throw new RuntimeException("Stub!");
    }

    protected CameraInterval(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public boolean isIntervalCameraShow() {
        throw new RuntimeException("Stub!");
    }

    public void setIntervalCameraShow(boolean intervalCameraShow) {
        throw new RuntimeException("Stub!");
    }

    public List<CameraInfoInterval> getIntervalCameraInfo() {
        throw new RuntimeException("Stub!");
    }

    public void setIntervalCameraInfo(List<CameraInfoInterval> cameraInfoInterval) {
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