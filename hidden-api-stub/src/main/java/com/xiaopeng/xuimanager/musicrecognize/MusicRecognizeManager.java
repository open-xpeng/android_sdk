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

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

/**
 * @noinspection unused
 */
public class MusicRecognizeManager implements XUIManagerBase {
    public static final boolean DBG                                = true;
    public static final int     MODE_HUMMING                       = 2;
    public static final int     MODE_ORIGINAL_SOUND                = 1;
    public static final int     MSG_MUSICRECOGNIZE_ERROR_EVENT     = 0;
    public static final int     MSG_MUSICRECOGNIZE_FINDCOVER_EVENT = 1;
    public static final int     MSG_MUSICRECOGNIZE_RECOGNIZE_EVENT = 2;


    public MusicRecognizeManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(MusicRecognizeEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(MusicRecognizeEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void dispatchFindCoverEventToClient(String coverUrl) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchRecognizeEventToClient(MusicRecognizeEvent event) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchErrorEventToClient(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void handleFindCoverEvent(String coverUrl) {
        throw new RuntimeException("Stub!");
    }

    public void handleRecognizeEvent(MusicRecognizeEvent event) {
        throw new RuntimeException("Stub!");
    }

    public void handleErrorEvent(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIDisconnected() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIConnected(IBinder service) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String getServiceName() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void setServiceName(String name) {
        throw new RuntimeException("Stub!");
    }

    public void start() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void stop() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void stopAndRecognize() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getMode() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setMode(int mode) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public float getMinScore() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setMinScore(float score) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void findSongCover(String songName) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public interface MusicRecognizeEventListener {
        void onErrorEvent(int i, int i2);

        void onFindCoverEvent(String str);

        void onRecognizeEvent(MusicRecognizeEvent musicRecognizeEvent);
    }

    public static class MusicRecognizeEventListenerToService extends IMusicRecognizeEventListener.Stub {

        public MusicRecognizeEventListenerToService(MusicRecognizeManager manager) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onFindCoverEvent(String coverUrl) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onRecognizeEvent(MusicRecognizeEvent event) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onError(int errorCode, int operation) {
            throw new RuntimeException("Stub!");
        }
    }
}
