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

package com.xiaopeng.xuimanager.mediacenter;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * @noinspection unused
 */
public class MediaInfo implements Parcelable {
    public static final  int                FAVOR_NOT_SET              = 0;
    public static final  int                FAVOR_NOT_SUPPORT          = -1;
    public static final  int                FAVOR_SET                  = 1;
    public static final  int                MEDIA_SOURCE_BT            = 3;
    public static final  int                MEDIA_SOURCE_DOLBY         = 6;
    public static final  int                MEDIA_SOURCE_FM            = 1;
    public static final  int                MEDIA_SOURCE_MUSIC         = 0;
    public static final  int                MEDIA_SOURCE_READING       = 2;
    public static final  int                MEDIA_SOURCE_SHOWMODE      = 4;
    public static final  int                MEDIA_SOURCE_USB           = 5;
    public static final  int                MEDIA_STYLE_CLASSIC        = 5;
    public static final  int                MEDIA_STYLE_DANCE          = 11;
    public static final  int                MEDIA_STYLE_DEFAULT        = -1;
    public static final  int                MEDIA_STYLE_FOLK           = 8;
    public static final  int                MEDIA_STYLE_JAZZ           = 2;
    public static final  int                MEDIA_STYLE_LIGHT          = 4;
    public static final  int                MEDIA_STYLE_MOVIE          = 7;
    public static final  int                MEDIA_STYLE_OPERA          = 6;
    public static final  int                MEDIA_STYLE_OST            = 10;
    public static final  int                MEDIA_STYLE_POP            = 1;
    public static final  int                MEDIA_STYLE_RAP            = 9;
    public static final  int                MEDIA_STYLE_ROCK           = 3;
    public static final  int[]              STYLECOLOR                 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static final  Creator<MediaInfo> CREATOR                    = new Creator<MediaInfo>() {

        @Override
        public MediaInfo createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public MediaInfo[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };
    private static final int                AMBIENTLIGHT_DEFAULT_COLOR = 5;

    public MediaInfo() {
        throw new RuntimeException("Stub!");
    }

    private static int getColor(int mediaStyle) {
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

    public String getId() {
        throw new RuntimeException("Stub!");
    }

    public void setId(String id) {
        throw new RuntimeException("Stub!");
    }

    public String getTitle() {
        throw new RuntimeException("Stub!");
    }

    public void setTitle(String title) {
        throw new RuntimeException("Stub!");
    }

    public String getAlbum() {
        throw new RuntimeException("Stub!");
    }

    public void setAlbum(String album) {
        throw new RuntimeException("Stub!");
    }

    public String getArtist() {
        throw new RuntimeException("Stub!");
    }

    public void setArtist(String artist) {
        throw new RuntimeException("Stub!");
    }

    public int getStyle() {
        throw new RuntimeException("Stub!");
    }

    public void setStyle(int style) {
        throw new RuntimeException("Stub!");
    }

    public int getSource() {
        throw new RuntimeException("Stub!");
    }

    public void setSource(int source) {
        throw new RuntimeException("Stub!");
    }

    public boolean isXpMusic() {
        throw new RuntimeException("Stub!");
    }

    public void setXpMusic(boolean isXpMusic) {
        throw new RuntimeException("Stub!");
    }

    public int getFavor() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFavor() {
        throw new RuntimeException("Stub!");
    }

    public void setFavor(int favor) {
        throw new RuntimeException("Stub!");
    }

    public void setFavor(boolean isFavor) {
        throw new RuntimeException("Stub!");
    }

    public boolean isAudition() {
        throw new RuntimeException("Stub!");
    }

    public void setAudition(boolean isAudition) {
        throw new RuntimeException("Stub!");
    }

    public String getAlbumUri() {
        throw new RuntimeException("Stub!");
    }

    public void setAlbumUri(String albumUri) {
        throw new RuntimeException("Stub!");
    }

    public String getStyleName() {
        throw new RuntimeException("Stub!");
    }

    public void setStyleName(String styleName) {
        throw new RuntimeException("Stub!");
    }

    public String getQualityName() {
        throw new RuntimeException("Stub!");
    }

    public void setQualityName(String qualityName) {
        throw new RuntimeException("Stub!");
    }

    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }

    public void setPackageName(String packageName) {
        throw new RuntimeException("Stub!");
    }

    public Bitmap getAlbumBitmap() {
        throw new RuntimeException("Stub!");
    }

    public void setAlbumBitmap(Bitmap bmp) {
        throw new RuntimeException("Stub!");
    }

    public int getStyleColor() {
        throw new RuntimeException("Stub!");
    }

    public String getString(String key) {
        throw new RuntimeException("Stub!");
    }

    public CharSequence getText(String key) {
        throw new RuntimeException("Stub!");
    }

    public void putString(String key, String value) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
