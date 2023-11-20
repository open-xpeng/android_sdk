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

package com.xiaopeng.xuimanager.condition;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @noinspection unused
 */
public class TwilightState implements Parcelable {
    public static final Creator<TwilightState> CREATOR = new Creator<TwilightState>() {
        @Override
        public TwilightState createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public TwilightState[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };


    public TwilightState(long sunriseTimeMillis, long sunsetTimeMillis) {
        throw new RuntimeException("Stub!");
    }

    protected TwilightState(Parcel in) {
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

    public long getSunriseTimeMillis() {
        throw new RuntimeException("Stub!");
    }

    public void setSunriseTimeMillis(long sunriseTimeMillis) {
        throw new RuntimeException("Stub!");
    }

    public long getSunsetTimeMillis() {
        throw new RuntimeException("Stub!");
    }

    public void setSunsetTimeMillis(long sunsetTimeMillis) {
        throw new RuntimeException("Stub!");
    }
}
