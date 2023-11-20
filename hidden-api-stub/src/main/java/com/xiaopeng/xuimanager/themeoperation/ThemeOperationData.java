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

package com.xiaopeng.xuimanager.themeoperation;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;

import com.xiaopeng.xuimanager.operation.OperationResource;

/**
 * @noinspection unused
 */
public class ThemeOperationData extends OperationResource implements Parcelable {
    public static final Creator<ThemeOperationData> CREATOR = new Creator<ThemeOperationData>() {

        @Override
        public ThemeOperationData createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public ThemeOperationData[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    protected ThemeOperationData(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public ThemeOperationData() {
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

    public String getFriendlyName() {
        throw new RuntimeException("Stub!");
    }

    public void setFriendlyName(String name) {
        throw new RuntimeException("Stub!");
    }

    public boolean isActive() {
        throw new RuntimeException("Stub!");
    }

    public void setActive(boolean flag) {
        throw new RuntimeException("Stub!");
    }

    public int getResStorageType() {
        throw new RuntimeException("Stub!");
    }

    public void setResStorageType(int type) {
        throw new RuntimeException("Stub!");
    }

    public boolean getUpdateFlag() {
        throw new RuntimeException("Stub!");
    }

    public void setUpdateFlag(boolean flag) {
        throw new RuntimeException("Stub!");
    }

    public ArrayMap<String, AbilityEffect> getActiveEffectMap() {
        throw new RuntimeException("Stub!");
    }

    public void setActiveEffectMap(ArrayMap<String, AbilityEffect> map) {
        throw new RuntimeException("Stub!");
    }

    public ArrayMap<String, AbilityEffect[]> getEffectMap() {
        throw new RuntimeException("Stub!");
    }

    public void setEffectMap(ArrayMap<String, AbilityEffect[]> map) {
        throw new RuntimeException("Stub!");
    }

    public String getInnerName() {
        throw new RuntimeException("Stub!");
    }

    public void setInnerName(String name) {
        throw new RuntimeException("Stub!");
    }

    public String getThemePath() {
        throw new RuntimeException("Stub!");
    }

    public void setThemePath(String path) {
        throw new RuntimeException("Stub!");
    }

}
