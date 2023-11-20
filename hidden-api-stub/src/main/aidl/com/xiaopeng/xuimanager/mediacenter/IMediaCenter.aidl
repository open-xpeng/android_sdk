package com.xiaopeng.xuimanager.mediacenter;

import android.os.Bundle;
import com.xiaopeng.xuimanager.mediacenter.MediaInfo;
import com.xiaopeng.xuimanager.mediacenter.bluetooth.AvrcpMeteData;
import com.xiaopeng.xuimanager.mediacenter.bluetooth.IAvrcpEventListener;
import com.xiaopeng.xuimanager.mediacenter.lyric.ILyricInfoListener;
import com.xiaopeng.xuimanager.mediacenter.IBTStatusListener;
import com.xiaopeng.xuimanager.mediacenter.IMediaCenterEventListener;
import com.xiaopeng.xuimanager.mediacenter.ILyricUpdateListener;
import com.xiaopeng.xuimanager.mediacenter.IModeChangedListener;
import com.xiaopeng.xuimanager.mediacenter.IPlaybackInfoListener;
import com.xiaopeng.xuimanager.mediacenter.IAudioCaptureListener;
import com.xiaopeng.xuimanager.mediacenter.IPlaybackControlListener;
import com.xiaopeng.xuimanager.mediacenter.IVisualizerViewEnableListener;
import com.xiaopeng.xuimanager.mediacenter.visualizer.ISDVisualizerDataListener;

interface IMediaCenter {
    void avrcpNext();

    void avrcpPause();

    void avrcpPlay();

    void avrcpPrevious();

    void executeCmd(String str, String str2);

    void favorSong(in Bundle bundle);

    AvrcpMeteData getAvrcpMeteData();

    int getAvrcpPlayStatus();

    long[] getAvrcpPosition();

    int getBtStatus();

    LyricInfo getCurrentLyricInfo(int i);

    MediaInfo getCurrentMediaInfo(int i);

    int getCurrentMode();

    int getCurrentPlayStatus(int i);

    long[] getCurrentPosition(int i);

    void notifyLyricInfoUpdated(in LyricInfo lyricInfo);

    void notifyLyricUpdate(String str);

    void pauseBtMedia();

    void playBtMedia();

    int playbackControl(int i, int i2, int i3);

    void registerAvrcpEventListener(IAvrcpEventListener iAvrcpEventListener);

    void registerBtStatusListener(IBTStatusListener iBTStatusListener);

    void registerListener(IMediaCenterEventListener iMediaCenterEventListener);

    void registerLyricInfoListener(ILyricInfoListener iLyricInfoListener);

    void registerLyricUpdateListener(ILyricUpdateListener iLyricUpdateListener);

    void registerModeChangedListener(IModeChangedListener iModeChangedListener);

    void registerPlaybackInfoListener(IPlaybackInfoListener iPlaybackInfoListener);

    void registerVisualizerListener(IAudioCaptureListener iAudioCaptureListener);

    void registerVisualizerListenerWithDisplayId(int i, ISDVisualizerDataListener iSDVisualizerDataListener);

    void registerVisualizerListenerWithPackage(String str, ISDVisualizerDataListener iSDVisualizerDataListener);

    void registerVisualizerViewEnableListener(IVisualizerViewEnableListener iVisualizerViewEnableListener);

    void requestMediaButton(boolean z,in Bundle bundle);

    void setBtVolume(float f);

    int setFavorite(boolean z, String str);

    void setSDPosition(int i, String str);

    void setVisualizerViewEnable(boolean z);

    int switchSource(int i);

    void unRegisterAvrcpEventListener(IAvrcpEventListener iAvrcpEventListener);

    void unRegisterBtStatusListener(IBTStatusListener iBTStatusListener);

    void unRegisterLyricUpdateListener(ILyricUpdateListener iLyricUpdateListener);

    void unRegisterModeChangedListener(IModeChangedListener iModeChangedListener);

    void unRegisterPlaybackInfoListener(IPlaybackInfoListener iPlaybackInfoListener);

    void unRegisterVisualizerListener(IAudioCaptureListener iAudioCaptureListener);

    void unRegisterVisualizerListenerWithDisplayId(int i, ISDVisualizerDataListener iSDVisualizerDataListener);

    void unRegisterVisualizerListenerWithPackage(String str, ISDVisualizerDataListener iSDVisualizerDataListener);

    void unRegisterVisualizerViewEnableListener(IVisualizerViewEnableListener iVisualizerViewEnableListener);

    void unregisterListener(IMediaCenterEventListener iMediaCenterEventListener);

    void unregisterLyricInfoListener(ILyricInfoListener iLyricInfoListener);

    void vendorMediaInfoNotify(in MediaInfo mediaInfo);

    void vendorRegister();

    void vendorSetControlListener(String str, IPlaybackControlListener iPlaybackControlListener);

    void vendorStartAudioSession(int i, int i2, String str);

    void vendorStopAudioSession(int i, String str);

    void vendorUnRegister();

    void vendorUnSetControlListener(String str, IPlaybackControlListener iPlaybackControlListener);

    void vendorUpdatePlaybackStatus(int i);

    void vendorUpdatePosition(long j, long j2);

}
