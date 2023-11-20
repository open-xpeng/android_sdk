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

package com.xiaopeng.xuimanager.soundresource.data;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * @noinspection unused
 */
public class SoundEffectTheme implements Parcelable {
    public static final Creator<SoundEffectTheme> CREATOR = new Creator<SoundEffectTheme>() {

        @Override
        public SoundEffectTheme createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public SoundEffectTheme[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };


    public SoundEffectTheme() {
        throw new RuntimeException("Stub!");
    }

    public SoundEffectTheme(Parcel in) {
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

    public int getThemeId() {
        throw new RuntimeException("Stub!");
    }

    public void setThemeId(int id) {
        throw new RuntimeException("Stub!");
    }

    public String getFriendlyName() {
        throw new RuntimeException("Stub!");
    }

    public void setFriendlyName(String name) {
        throw new RuntimeException("Stub!");
    }

    public String getSubName() {
        throw new RuntimeException("Stub!");
    }

    public void setSubName(String name) {
        throw new RuntimeException("Stub!");
    }

    public String[] getPlaybillPath() {
        throw new RuntimeException("Stub!");
    }

    public void setPlaybillPath(String[] path) {
        throw new RuntimeException("Stub!");
    }


}
