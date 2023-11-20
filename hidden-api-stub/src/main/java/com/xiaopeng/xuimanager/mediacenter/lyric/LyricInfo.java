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

package com.xiaopeng.xuimanager.mediacenter.lyric;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/**
 * @noinspection unused
 */
public class LyricInfo implements Parcelable {
    public static final Creator<LyricInfo> CREATOR        = new Creator<LyricInfo>() {

        @Override
        public LyricInfo createFromParcel(Parcel source) {
            return new LyricInfo(source);
        }


        @Override
        public LyricInfo[] newArray(int size) {
            return new LyricInfo[size];
        }
    };
    public static       String             LYRIC_TYPE_LRC = "lrc";
    public static       String             LYRIC_TYPE_TRD = "trd";
    private             String             albumName;
    private             String             artistName;
    private             String             lyricContent;
    private             String             lyricType;
    private             Bundle             mExtras;
    private             String             songId;
    private             String             songName;

    public LyricInfo() {
        this.lyricType = LYRIC_TYPE_LRC;
    }

    private LyricInfo(Parcel source) {
        readFromParcel(source);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.songId);
        dest.writeString(this.songName);
        dest.writeString(this.artistName);
        dest.writeString(this.albumName);
        dest.writeString(this.lyricType);
        dest.writeString(this.lyricContent);
        dest.writeBundle(this.mExtras);
    }

    public void readFromParcel(Parcel source) {
        this.songId = source.readString();
        this.songName = source.readString();
        this.artistName = source.readString();
        this.albumName = source.readString();
        this.lyricType = source.readString();
        this.lyricContent = source.readString();
        this.mExtras = source.readBundle();
    }

    public String getSongId() {
        return this.songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return this.songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return this.albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getLyricType() {
        return this.lyricType;
    }

    public void setLyricType(String lyricType) {
        this.lyricType = lyricType;
    }

    public String getLyricContent() {
        return this.lyricContent;
    }

    public void setLyricContent(String lyricContent) {
        this.lyricContent = lyricContent;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public void setExtras(Bundle extras) {
        this.mExtras = extras;
    }

    public String toString() {
        String lyricContentString = "";
        if (!TextUtils.isEmpty(this.lyricContent)) {
            lyricContentString = this.lyricContent.replaceAll("\n", "||");
        }
        return "LyricInfo{songId='" + this.songId + "', songName='" + this.songName + "', artistName='" + this.artistName + "', albumName='" + this.albumName + "', lyricType='" + this.lyricType + "', lyricContent='" + lyricContentString + "'}";
    }
}
