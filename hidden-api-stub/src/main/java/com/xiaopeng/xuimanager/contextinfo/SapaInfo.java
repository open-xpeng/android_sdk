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
public class SapaInfo implements Parcelable {
    public static final Creator<SapaInfo> CREATOR = new Creator<SapaInfo>() {

        @Override
        public SapaInfo createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public SapaInfo[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };


    public SapaInfo() {
    }

    protected SapaInfo(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public String getRemainDistDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setRemainDistDisplay(String remainDistDisplay) {
        throw new RuntimeException("Stub!");
    }

    public int getRemainDistUnitDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setRemainDistUnitDisplay(int remainDistUnitDisplay) {
        throw new RuntimeException("Stub!");
    }

    public String getName() {
        throw new RuntimeException("Stub!");
    }

    public void setName(String name) {
        throw new RuntimeException("Stub!");
    }

    public long getSapaDetail() {
        throw new RuntimeException("Stub!");
    }

    public void setSapaDetail(long sapaDetail) {
        throw new RuntimeException("Stub!");
    }

    public int getType() {
        throw new RuntimeException("Stub!");
    }

    public void setType(int type) {
        throw new RuntimeException("Stub!");
    }

    public int getRemainDist() {
        throw new RuntimeException("Stub!");
    }

    public void setRemainDist(int remainDist) {
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
