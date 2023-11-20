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

package com.xiaopeng.xuimanager.karaoke;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

import java.util.HashMap;

/**
 * @noinspection unused
 */
public class KaraokeManager implements XUIManagerBase {
    public static final boolean DBG                     = true;
    public static final int     KARAOKE_ECHO            = 2;
    public static final int     KARAOKE_MIC_EFFECT      = 4;
    public static final int     KARAOKE_MIC_VOLUME      = 1;
    public static final int     KARAOKE_MUSIC_VOLUME    = 0;
    public static final int     KARAOKE_REVERBERATION   = 3;
    public static final int     MSG_KARAOKE_ERROR_EVENT = 0;
    public static final int     MSG_KARAOKE_EVENT       = 1;


    public KaraokeManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public void setCallingAppPkg(String pkg) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(MicCallBack listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(MicCallBack listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void dispatchErrorEventToClient(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchEventToClient(int event, int value) {
        throw new RuntimeException("Stub!");
    }

    public void handleErrorEvent(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void handleEvent(int event) {
        throw new RuntimeException("Stub!");
    }

    public void handleVolumeEvent(int event, int value) {
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

    public int XMA_registerCallback(MicCallBack callBackFunc) throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public int XMA_unRegisterCallback() throws RemoteException {
        throw new RuntimeException("Stub!");
    }

    public int XMA_init(String pkgName) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_deinit() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_getToken() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_getSignedToken(String sToken) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_getHandShakeStatus() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_getMicStatus() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_getMicPowerStatus() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_setVolume(int type, int vol) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_setEcho(int echo) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_getVolume(int type) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_getEcho() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_trackGetMinBuf(int sampleRate, int channel) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_trackCreate(int sampleRate, int channel, int bufSize) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_trackGetLatency() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_write(byte[] data, int off, int size) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_trackDestroy() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_pause() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_resume() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_pausePlay() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_resumePlay() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_recGetMinBuf(int sampleRate, int channel) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_recCreate(int sampleRate, int channel, int bufSize) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_recGetAvail() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_readRec(byte[] data) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_recDestroy() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_micGetMinBuf(int sampleRate, int channel) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_micCreate(int sampleRate, int channel, int bufSize) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_micGetAvail() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_readMic(byte[] data) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_micDestroy() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_atlSwitch(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_aiWakeUp() {
        throw new RuntimeException("Stub!");
    }

    public boolean XMA_hasAtl() {
        throw new RuntimeException("Stub!");
    }

    public void XMA_setAtlEnable(boolean enable) {
        throw new RuntimeException("Stub!");
    }

    public boolean XMA_isAtlEnabled() {
        throw new RuntimeException("Stub!");
    }

    public String XMA_getMicName() {
        throw new RuntimeException("Stub!");
    }

    public String XMA_getBuyMicUrl() {
        throw new RuntimeException("Stub!");
    }

    public void XMA_connectMicFlow() {
        throw new RuntimeException("Stub!");
    }

    public void XMA_ShowToast(String text) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_setMusicInfo(String[] musicInfo) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_setMusicLyric(String[] lyric) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_clientDied() {
        throw new RuntimeException("Stub!");
    }

    public HashMap<String, Integer> XMA_getMicSoundEffectMap() {
        throw new RuntimeException("Stub!");
    }

    public int XMA_requestKaraokeResource(String pkgName, int sampleRate, int channel, int bufferSize) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_requestKaraokeResource(String pkgName) {
        throw new RuntimeException("Stub!");
    }

    public int XMA_releaseKaraokeResource(String pkgName) {
        throw new RuntimeException("Stub!");
    }

    public interface MicCallBack {
        int MIC_POWER_OFF  = 6;
        int MIC_POWER_ON   = 5;
        int UDB_DONGLE_OFF = 4;
        int UDB_DONGLE_ON  = 3;

        void micServiceCallBack(int i);

        void onErrorEvent(int i, int i2);

        default void volumeEffectCallBack(int type, int value) {
        }
    }
}
