package com.xiaopeng.xuimanager.mediacenter;

interface IAudioCaptureListener {
   void OnFftDataCapture(in byte[] bArr, int i);

    void OnRatioData(float f, float f2);

}
