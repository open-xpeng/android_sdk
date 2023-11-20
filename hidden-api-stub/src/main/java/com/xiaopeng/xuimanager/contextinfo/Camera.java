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
public class Camera implements Parcelable {

    public static final Creator<Camera> CREATOR = new Creator<Camera>() {
        @Override
        public Camera createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Camera[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public Camera() {
        throw new RuntimeException("Stub!");
    }

    protected Camera(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }

    public boolean getIsCameraShow() {
        throw new RuntimeException("Stub!");
    }

    public void setIsCameraShow(boolean isCameraShow) {
        throw new RuntimeException("Stub!");
    }

    public List<CameraInfo> getCameraInfo() {
        throw new RuntimeException("Stub!");
    }

    public void setCameraInfo(List<CameraInfo> cameraInfo) {
        throw new RuntimeException("Stub!");
    }


}
