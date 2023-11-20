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

package com.xiaopeng.xuimanager.pipebus;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @noinspection unused
 */
public class ParcelableContainer implements Parcelable {
    public static final int FLAG_BYTE_ARRAY       = -1163133183;
    public static final int FLAG_INT_ARRAY        = -1163133182;
    public static final int FLAG_PARCEL           = -1414791420;
    public static final int FLAG_PARCELABLE_ARRAY = -1414791419;
    public static final int FLAG_STRING_ARRAY     = -1163133181;

    public static final Creator<ParcelableContainer> CREATOR = new Creator<ParcelableContainer>() {

        @Override
        public ParcelableContainer createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public ParcelableContainer[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public ParcelableContainer() {
    }

    protected ParcelableContainer(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public byte[] getBytes() {
        throw new RuntimeException("Stub!");
    }

    public void setBytes(byte[] bytes) {
        throw new RuntimeException("Stub!");
    }

    public int[] getIntArray() {
        throw new RuntimeException("Stub!");
    }

    public void setIntArray(int[] array) {
        throw new RuntimeException("Stub!");
    }

    public String[] getStringArray() {
        throw new RuntimeException("Stub!");
    }

    public void setStringArray(String[] array) {
        throw new RuntimeException("Stub!");
    }

    public Parcel getParcel() {
        throw new RuntimeException("Stub!");
    }

    public void setParcel(Parcel p) {
        throw new RuntimeException("Stub!");
    }

    public Parcelable[] getParcelableArray() {
        throw new RuntimeException("Stub!");
    }

    public void setParcelableArray(Parcelable[] array) {
        throw new RuntimeException("Stub!");
    }

    public void reset() {
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

    public void readFromParcel(Parcel in) {
        throw new RuntimeException("Stub!");
    }
}
