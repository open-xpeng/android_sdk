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
public class CameraInfo implements Parcelable {
    public static final Creator<CameraInfo> CREATOR = new Creator<CameraInfo>() {

        @Override
        public CameraInfo createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public CameraInfo[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };


    public CameraInfo() {
        throw new RuntimeException("Stub!");
    }

    protected CameraInfo(Parcel in) {
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
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        throw new RuntimeException("Stub!");
    }
}
