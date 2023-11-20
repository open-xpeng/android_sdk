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

/**
 * @noinspection unused
 */
public class AbilityEffect implements Parcelable {
    public static final Creator<AbilityEffect> CREATOR = new Creator<AbilityEffect>() { // from class: com.xiaopeng.xuimanager.themeoperation.AbilityEffect.1

        @Override
        public AbilityEffect createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public AbilityEffect[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public AbilityEffect() {
    }

    public AbilityEffect(int propertyType, String friendlyName, String abiliyType, String belongType, String effectId) {
        throw new RuntimeException("Stub!");
    }

    protected AbilityEffect(Parcel in) {
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

    public int getPropertyType() {
        throw new RuntimeException("Stub!");
    }

    public void setPropertyType(int type) {
        throw new RuntimeException("Stub!");
    }

    public String getFriendlyName() {
        throw new RuntimeException("Stub!");
    }

    public void setFriendlyName(String name) {
        throw new RuntimeException("Stub!");
    }

    public String getEffectAbilityType() {
        throw new RuntimeException("Stub!");
    }

    public void setEffectAbilityType(String value) {
        throw new RuntimeException("Stub!");
    }

    public String getEffectId() {
        throw new RuntimeException("Stub!");
    }

    public void setEffectId(String id) {
        throw new RuntimeException("Stub!");
    }

    public String getParam() {
        throw new RuntimeException("Stub!");
    }

    public void setParam(String param) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
