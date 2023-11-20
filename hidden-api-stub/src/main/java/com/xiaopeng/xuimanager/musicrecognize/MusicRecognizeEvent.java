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

package com.xiaopeng.xuimanager.musicrecognize;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @noinspection unused
 */
public class MusicRecognizeEvent implements Parcelable {
    public static final Creator<MusicRecognizeEvent> CREATOR = new Creator<MusicRecognizeEvent>() {

        @Override
        public MusicRecognizeEvent createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public MusicRecognizeEvent[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public MusicRecognizeEvent() {
    }

    public MusicRecognizeEvent(String songName, String albumName, String albumCover, String singer, String score) {
        throw new RuntimeException("Stub!");
    }

    protected MusicRecognizeEvent(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    public String getSongName() {
        throw new RuntimeException("Stub!");
    }

    public void setSongName(String songName) {
        throw new RuntimeException("Stub!");
    }

    public String getAlbumName() {
        throw new RuntimeException("Stub!");
    }

    public void setAlbumName(String albumName) {
        throw new RuntimeException("Stub!");
    }

    public String getAlbumCover() {
        throw new RuntimeException("Stub!");
    }

    public void setAlbumCover(String albumCover) {
        throw new RuntimeException("Stub!");
    }

    public String getSinger() {
        throw new RuntimeException("Stub!");
    }

    public void setSinger(String singer) {
        throw new RuntimeException("Stub!");
    }

    public String getScore() {
        throw new RuntimeException("Stub!");
    }

    public void setScore(String score) {
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
