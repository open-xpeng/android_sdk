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

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;
import com.xiaopeng.xuimanager.mediacenter.bluetooth.AvrcpEventListener;
import com.xiaopeng.xuimanager.mediacenter.bluetooth.AvrcpMeteData;
import com.xiaopeng.xuimanager.mediacenter.lyric.LyricInfo;
import com.xiaopeng.xuimanager.mediacenter.lyric.LyricInfoListener;
import com.xiaopeng.xuimanager.mediacenter.visualizer.ISDVisualizerDataListener;
import com.xiaopeng.xuimanager.mediacenter.visualizer.SDVisualizerListener;
import com.xiaopeng.xuimanager.mediacenter.visualizer.TypeVisualizerCaptureObjectListener;
import com.xiaopeng.xuimanager.mediacenter.visualizer.VisualCaptureObjectListener;

import java.lang.ref.WeakReference;

/**
 * @noinspection unused
 */
public class MediaCenterManager implements XUIManagerBase {
    public static final String ACTION_MEDIA_PLAYBACK_CONTROL = "com.xiaopeng.xuiservice.playbackControl";
    public static final int    ENTER_PARAMS_BUTTON           = 2;
    public static final int    ENTER_PARAMS_CURRENT          = 0;
    public static final int    ENTER_PARAMS_FORCE_XP         = 1;

    public static final String EXTRA_PLAYBACK_CMD   = "playbackCmd";
    public static final String EXTRA_PLAYBACK_PARAM = "playbackParam";

    public static final int ID_SHARED_PRIMARY   = 0;
    public static final int ID_SHARED_SECONDARY = 1;

    public static final int MODE_CAR_SHOW = 1;
    public static final int MODE_NORMAL   = 0;

    public static final int MSG_MEDIACENTER_ERROR_EVENT = 0;
    public static final int MSG_PLAYBACK_CONTROL_EVENT  = 1;
    public static final int MSG_SET_FAVORITE_EVENT      = 3;
    public static final int MSG_SWITCH_SOURCE_EVENT     = 2;

    public static final String PACKAGE_BLUETOOTH = "com.android.bluetooth";
    public static final String PACKAGE_XP_MUSIC  = "com.xiaopeng.musicradio";

    public static final int PLAYBACK_CMD_ENTER             = 11;
    public static final int PLAYBACK_CMD_EXIT              = 12;
    public static final int PLAYBACK_CMD_FAVORITE          = 8;
    public static final int PLAYBACK_CMD_FORWARD           = 14;
    public static final int PLAYBACK_CMD_NEXT              = 6;
    public static final int PLAYBACK_CMD_NO_FAVORITE       = 16;
    public static final int PLAYBACK_CMD_PAUSE             = 2;
    public static final int PLAYBACK_CMD_PREV              = 7;
    public static final int PLAYBACK_CMD_RESUME            = 3;
    public static final int PLAYBACK_CMD_REWIND            = 13;
    public static final int PLAYBACK_CMD_SEEKTO            = 4;
    public static final int PLAYBACK_CMD_SET_LYRIC         = 10;
    public static final int PLAYBACK_CMD_SET_MODE          = 9;
    public static final int PLAYBACK_CMD_SET_TIME          = 15;
    public static final int PLAYBACK_CMD_SPEED             = 5;
    public static final int PLAYBACK_CMD_START             = 0;
    public static final int PLAYBACK_CMD_STOP              = 1;
    public static final int PLAYBACK_CMD_TO_PAUSE          = 18;
    public static final int PLAYBACK_CMD_TO_PLAY           = 19;
    public static final int PLAYBACK_CMD_UNSET_MODE        = 17;
    public static final int PLAYBACK_LYRIC_OFF             = 1;
    public static final int PLAYBACK_LYRIC_ON              = 0;
    public static final int PLAYBACK_MODE_CYCLE            = 1;
    public static final int PLAYBACK_MODE_RANDOM           = 3;
    public static final int PLAYBACK_MODE_SEQUENCE         = 0;
    public static final int PLAYBACK_MODE_SINGLE_CYCLE     = 2;
    public static final int PLAYBACK_STATE_NEW_MEDIASTREAM = 10;
    public static final int PLAYBACK_STATE_PAUSED          = 2;
    public static final int PLAYBACK_STATE_STARTED         = 0;
    public static final int PLAYBACK_STATE_STOPED          = 1;

    public static final int SOURCE_TYPE_FM    = 1;
    public static final int SOURCE_TYPE_MUSIC = 0;

    public static final int STATE_BT_AVAILABLE           = 2;
    public static final int STATE_BT_MEDIA_CONNECTED     = 5;
    public static final int STATE_BT_MEDIA_CONNECTING    = 4;
    public static final int STATE_BT_MEDIA_DISCONNECTING = 3;
    public static final int STATE_BT_SOURCE_SELECTED     = 6;
    public static final int STATE_BT_UNAVAILABLE         = 1;

    public static final String TAG = "MediaCenterManager";

    public static final int VISUALIZER_TYPE_AMBIENT_LIGHT = 1;
    public static final int VISUALIZER_TYPE_NONE          = 0;
    public static final int VISUALIZER_TYPE_XP_MUSIC      = 16;


    public MediaCenterManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public void registerListener(MediaCenterEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void unregisterListener(MediaCenterEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void vendorRegister(Context context) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void vendorUnRegister(Context context) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void vendorUpdatePlaybackStatus(int status) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void vendorUpdatePosition(long position, long duration) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void vendorMediaInfoNotify(MediaInfo info) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void vendorSetControlListener(Context context, VendorControlListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void vendorStartAudioSession(int audioSession, int usage, String pkgName) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void vendorStopAudioSession(int audioSession, String pkgName) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void vendorUnSetControlListener(Context contex, VendorControlListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void venderInvoke(Parcel request, Parcel reply) {
        throw new RuntimeException("Stub!");
    }

    public int getCurrentPlayStatus() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getCurrentPlayStatus(int displayId) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public MediaInfo getCurrentMediaInfo(int displayId) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public LyricInfo getCurrentLyricInfo(int displayId) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public MediaInfo getCurrentMediaInfo() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public long[] getCurrentPosition() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public long[] getCurrentPosition(int displayId) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void registerVisualizerListener(VisualCaptureListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void registerVisualizerListener(int displayId, SDVisualizerListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterVisualizerListener(int displayId, SDVisualizerListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void registerVisualizerListener(String pkgName, SDVisualizerListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void unregisterVisualizerListener(String pkgName, SDVisualizerListener listener) {
        throw new RuntimeException("Stub!");
    }

    private void registerSDVisualizerToService(int displayId) {
        throw new RuntimeException("Stub!");
    }

    private void unregisterSDVisualizerToService(int displayId) {
        throw new RuntimeException("Stub!");
    }

    private void registerSDVisualizerToService(String pkgName) {
        throw new RuntimeException("Stub!");
    }

    private void unregisterSDVisualizerToService(String pkgName) {
        throw new RuntimeException("Stub!");
    }

    public void setVisualCaptureObjectListener(VisualCaptureObjectListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void setVisualCaptureObjectListener(int typeFlag, TypeVisualizerCaptureObjectListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void unRegisterVisualizerListener(VisualCaptureListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void registerPlaybackListener(PlaybackListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void registerPlaybackListener(int displayId, SDPlaybackListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void unRegisterPlaybackListener(PlaybackListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void unRegisterPlaybackListener(int displayId, SDPlaybackListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int playbackControl(int playbackCmd, int param) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int playbackControl(int displayId, int playbackCmd, int param) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int switchSource(int source) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setSDPosition(int displayId, String packageName) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchErrorEventToClient(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void handleErrorEvent(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchControlEventToVendor(int cmd, int parm, String pkgName) {
        throw new RuntimeException("Stub!");
    }

    public void handlePlaybackControlEvent(int cmd, int parm, String pkgName) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchSwitchSourceEventToVendor(int source, String pkgName) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchSetFavoriteEventToVendor(FavoriteEvent favoriteEvent) {
        throw new RuntimeException("Stub!");
    }

    public void handleSwitchSourceEvent(int source, String pkgName) {
        throw new RuntimeException("Stub!");
    }

    public void handleSetFavoriteEvent(boolean favorite, String id, String pkgName) {
        throw new RuntimeException("Stub!");
    }

    public void OnFftDataCapture(byte[] fft, int samplingRate) {
        throw new RuntimeException("Stub!");
    }

    public void OnRatioData(float ratio, float minRatio) {
        throw new RuntimeException("Stub!");
    }

    public void OnFftDataCapture(int displayId, String pkgName, byte[] fft, int samplingRate) {
        throw new RuntimeException("Stub!");
    }

    public void OnRatioData(int displayId, String pkgName, float ratio, float minRatio) {
        throw new RuntimeException("Stub!");
    }

    public void OnPlaybackChanged(int displayId, int status) {
        throw new RuntimeException("Stub!");
    }

    public void OnUpdatePosition(int displayId, long position, long duration) {
        throw new RuntimeException("Stub!");
    }

    public void OnMediaInfoNotify(int displayId, MediaInfo info) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onServerDisconnected() {
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

    public void OnVisualizerViewEnable(boolean enable) {
        throw new RuntimeException("Stub!");

    }

    public void setVisualizerViewEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");

    }

    public void registerVisualizerViewEnableListener(VisualizerViewEnableListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");

    }

    public void unRegisterVisualizerViewEnableListener(VisualizerViewEnableListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void registerLyricInfoListener(LyricInfoListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");

    }

    public void unRegisterLyricUpdateListener(LyricUpdateListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void unregisterLyricInfoListener(LyricInfoListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void onServiceLyricUpdated(String lyric) {
        throw new RuntimeException("Stub!");
    }

    public void registerModeChangedListener(ModeChangedListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void unRegisterModeChangedListener(ModeChangedListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getCurrentMode() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerBtStatusListener(BTStatusListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unRegisterBtStatusListener(BTStatusListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void playBtMedia() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void pauseBtMedia() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isBtDeviceAvailable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized boolean isBtSourceSelected() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized int getBtStatus() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setBtVolume(float volume) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void notifyBtStatusChanged(int status) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setFavorite(boolean favorite, String id) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void setFavorite(String songId, boolean favorite, int displayId) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void requestMediaButton(boolean request, Bundle extras) {
        throw new RuntimeException("Stub!");
    }

    public void avrcpPlay() {
        throw new RuntimeException("Stub!");
    }

    public void avrcpPause() {
        throw new RuntimeException("Stub!");
    }

    public void avrcpNext() {
        throw new RuntimeException("Stub!");
    }

    public void avrcpPrevious() {
        throw new RuntimeException("Stub!");
    }

    public AvrcpMeteData getAvrcpMeteData() {
        throw new RuntimeException("Stub!");
    }

    public int getAvrcpPlayStatus() {
        throw new RuntimeException("Stub!");
    }

    public long[] getAvrcpPosition() {
        throw new RuntimeException("Stub!");
    }

    public void registerAvrcpEventListener(AvrcpEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void unRegisterAvrcpEventListener(AvrcpEventListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void onAvrcpConnectedChanged(int prevState, int newState) {
        throw new RuntimeException("Stub!");
    }

    public void onAvrcpPlaybackChanged(int playStatus) {
        throw new RuntimeException("Stub!");
    }

    public void onAvrcpPositionChanged(long position, long duration) {
        throw new RuntimeException("Stub!");
    }

    public void onAvrcpMeteDataChanged(AvrcpMeteData meteData) {
        throw new RuntimeException("Stub!");
    }

    public void onLyricInfoUpdated(int displayId, LyricInfo lyricInfo) {
        throw new RuntimeException("Stub!");
    }

    public interface BTStatusListener {
        void onBtStatusChanged(int i);
    }

    public interface LyricUpdateListener {
        void onLyricUpdated(String str);
    }

    public interface MediaCenterEventListener {
        void onErrorEvent(int i, int i2);
    }

    public interface ModeChangedListener {
        void OnModeChanged(int i);
    }

    public interface PlaybackListener {
        void OnMediaInfoNotify(MediaInfo mediaInfo);

        void OnPlaybackChanged(int i);

        void OnUpdatePosition(long j, long j2);
    }

    public interface VendorControlListener {
        int OnPlaybackControl(int i, int i2);

        int OnSetFavorite(boolean z, String str);

        int OnSwitchSource(int i);
    }


    public interface VisualizerViewEnableListener {
        void OnVisualizerViewEnable(boolean z);
    }


    public interface VisualCaptureListener {
        void OnFftDataCapture(byte[] bArr, int i);

        default void OnRatioData(float ratio, float minRatio) {
        }
    }

    public static class MediaCenterEventListenerToService extends IMediaCenterEventListener.Stub {
        private final WeakReference<MediaCenterManager> mManager;

        public MediaCenterEventListenerToService(MediaCenterManager manager) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void onError(int errorCode, int operation) {
            throw new RuntimeException("Stub!");
        }
    }

    public static class SDVisualizerListenerToService extends ISDVisualizerDataListener.Stub {
        private final WeakReference<MediaCenterManager> mManager;

        public SDVisualizerListenerToService(MediaCenterManager manager) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void OnFftDataCapture(int displayId, String pkgName, byte[] fft, int samplingRate) throws RemoteException {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void OnRatioData(int displayId, String pkgName, float ratio, float minRatio) throws RemoteException {
            throw new RuntimeException("Stub!");
        }
    }

    public static class PlaybackInfoListener extends IPlaybackInfoListener.Stub {
        private final WeakReference<MediaCenterManager> mManager;

        public PlaybackInfoListener(MediaCenterManager manager) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void OnPlaybackChanged(int displayId, int status) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void OnUpdatePosition(int displayId, long position, long duration) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public void OnMediaInfoNotify(int displayId, MediaInfo info) {
            throw new RuntimeException("Stub!");
        }
    }

    public class FavoriteEvent {
        public boolean mFavorite;
        public String  mId;
        public String  mPkgName;

        public FavoriteEvent(boolean favorite, String id, String pkgName) {
            throw new RuntimeException("Stub!");
        }
    }
}
