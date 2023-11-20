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

package com.xiaopeng.xuimanager.mediacenter.bluetooth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * @noinspection unused
 */
public class AvrcpMeteData implements Parcelable {
    public static final Creator<AvrcpMeteData> CREATOR = new Creator<AvrcpMeteData>() {

        @Override
        public AvrcpMeteData createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public AvrcpMeteData[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public AvrcpMeteData() {
        throw new RuntimeException("Stub!");
    }

    private AvrcpMeteData(Parcel source) {
        throw new RuntimeException("Stub!");
    }

    public void readFromParcel(Parcel source) {
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

    public String getTitle() {
        throw new RuntimeException("Stub!");
    }

    public void setTitle(String title) {
        throw new RuntimeException("Stub!");
    }

    public String getArtist() {
        throw new RuntimeException("Stub!");
    }

    public void setArtist(String artist) {
        throw new RuntimeException("Stub!");
    }

    public String getAlbum() {
        throw new RuntimeException("Stub!");
    }

    public void setAlbum(String album) {
        throw new RuntimeException("Stub!");
    }

    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }

    public void setExtras(Bundle extras) {
        throw new RuntimeException("Stub!");
    }
}
