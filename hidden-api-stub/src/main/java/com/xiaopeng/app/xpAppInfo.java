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

package com.xiaopeng.app;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * @noinspection unused
 */
public class xpAppInfo implements Parcelable {
    public static final Creator<xpAppInfo> CREATOR = new Creator<xpAppInfo>() {
        @Override
        public xpAppInfo createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public xpAppInfo[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public int    mLaunchMode;
    public String mLaunchParam;
    public Bitmap mXpAppIcon;
    public String mXpAppId;
    public String mXpAppPage;
    public String mXpAppTitle;
    public String pkgName;
    public String resId;
    public int    supportScreenId;

    protected xpAppInfo(Parcel source) {
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
}
