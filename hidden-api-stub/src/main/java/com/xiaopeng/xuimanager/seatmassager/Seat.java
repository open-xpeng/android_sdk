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

package com.xiaopeng.xuimanager.seatmassager;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * @noinspection unused
 */
public class Seat implements Parcelable {
    public static final Creator<Seat> CREATOR = new Creator<Seat>() {

        @Override
        public Seat createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Seat[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public Seat(int id, int intensity) {
        throw new RuntimeException("Stub!");
    }

    public int getId() {
        throw new RuntimeException("Stub!");
    }

    public void setId(int id) {
        throw new RuntimeException("Stub!");
    }

    public int getIntensity() {
        throw new RuntimeException("Stub!");
    }

    public void setIntensity(int intensity) {
        throw new RuntimeException("Stub!");
    }

    public boolean equals(Object obj) {
        throw new RuntimeException("Stub!");
    }

    public int hashCode() {
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

    public void readFromParcel(Parcel source) {
        throw new RuntimeException("Stub!");
    }
}
