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
public class Location implements Parcelable {
    public static final Creator<Location> CREATOR = new Creator<Location>() {

        @Override
        public Location createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public Location[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public Location() {
        throw new RuntimeException("Stub!");
    }

    protected Location(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public int getCarDir() {
        throw new RuntimeException("Stub!");
    }

    public void setCarDir(int carDir) {
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
