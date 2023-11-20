package com.xiaopeng.xuimanager.karaoke;

import com.xiaopeng.xuimanager.karaoke.IKaraokeEventListener;
import com.xiaopeng.xuimanager.karaoke.IXMic;

interface IKaraoke {
    int XMS_Create(String str, int i, String str2, IBinder iBinder) ;

    int XMS_Distroy(String str) ;

    int XMS_GetEcho(String str) ;

    int XMS_GetHandShakeStatus(String str) ;

    int XMS_GetMicPowerStatus(String str) ;

    int XMS_GetMicStatus(String str) ;

    int XMS_GetToken(String str) ;

    int XMS_GetVolume(String str, int i) ;

    int XMS_MicCreate(String str, int i, int i2, int i3) ;

    int XMS_MicDestroy(String str) ;

    int XMS_MicGetAvail(String str) ;

    int XMS_MicGetMinBuf(String str, int i, int i2) ;

    int XMS_MicRead(String str,in byte[] bArr, int i) ;

    int XMS_Pause(String str) ;

    int XMS_PausePlay(String str) ;

    int XMS_Read(String str,in byte[] bArr, int i) ;

    int XMS_RecCreate(String str, int i, int i2, int i3) ;

    int XMS_RecDestroy(String str) ;

    int XMS_RecGetAvail(String str) ;

    int XMS_RecGetMinBuf(String str, int i, int i2) ;

    int XMS_RecStart(String str) ;

    int XMS_RecStop(String str) ;

    void XMS_RegisterCallback(String str, in IKaraokeEventListener iKaraokeEventListener) ;

    int XMS_Resume(String str) ;

    int XMS_ResumePlay(String str) ;

    int XMS_SaveRec(String str, int i, String str2, String str3) ;

    int XMS_SetEcho(String str, int i) ;

    int XMS_SetRecMode(String str, int i) ;

    int XMS_SetSignedToken(String str, String str2) ;

    int XMS_SetVolume(String str, int i, int i2) ;

    void XMS_ShowToast(String str) ;

    int XMS_StopSaveRec(String str) ;

    int XMS_TrackCreate(String str, int i, int i2, int i3) ;

    int XMS_TrackDestroy(String str) ;

    int XMS_TrackGetAvail(String str) ;

    int XMS_TrackGetLatency(String str) ;

    int XMS_TrackGetMinBuf(String str, int i, int i2) ;

    void XMS_UnRegisterCallback(String str, IKaraokeEventListener iKaraokeEventListener) ;

    int XMS_Write(String str,in byte[] bArr, int i, int i2) ;

    int XMS_aiWakeUp() ;

    int XMS_atlSwitch(boolean z) ;

    int XMS_clientDied() ;

    void XMS_connectMicFlow() ;

    String XMS_getBuyMicUrl() ;

    String XMS_getMicName() ;

    Map XMS_getMicSoundEffectMap() ;

    boolean XMS_hasAtl() ;

    boolean XMS_isAtlEnabled() ;

    int XMS_releaseKaraokeResource(String str) ;

    int XMS_requestKaraokeResource(String str, int i, int i2, int i3) ;

    void XMS_setAtlEnable(boolean z) ;

    int XMS_setMusicInfo(in String[] strArr) ;

    int XMS_setMusicLyric(in String[] strArr) ;

}