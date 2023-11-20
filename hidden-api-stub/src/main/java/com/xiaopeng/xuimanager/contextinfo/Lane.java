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
public class Lane implements Parcelable {
    public static final Creator<Lane> CREATOR = new Creator<Lane>() {

        @Override
        public Lane createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public Lane[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };


    public Lane() {
        throw new RuntimeException("Stub!");
    }

    protected Lane(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public boolean isLaneShow() {
        throw new RuntimeException("Stub!");
    }

    public void setLaneShow(boolean laneShow) {
        throw new RuntimeException("Stub!");
    }

    public int getLaneType() {
        throw new RuntimeException("Stub!");
    }

    public void setLaneType(int laneType) {
        throw new RuntimeException("Stub!");
    }

    public int[] getBackLane() {
        throw new RuntimeException("Stub!");
    }

    public void setBackLane(int[] backLane) {
        throw new RuntimeException("Stub!");
    }

    public int[] getFrontLane() {
        throw new RuntimeException("Stub!");
    }

    public void setFrontLane(int[] frontLane) {
        throw new RuntimeException("Stub!");
    }

    public int[] getTollGateInfo() {
        throw new RuntimeException("Stub!");
    }

    public void setTollGateInfo(int[] tollGateInfo) {
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
