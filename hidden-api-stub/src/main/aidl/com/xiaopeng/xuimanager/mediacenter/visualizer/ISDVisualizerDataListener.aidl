package com.xiaopeng.xuimanager.mediacenter.visualizer;

interface ISDVisualizerDataListener {
    void OnFftDataCapture(int i, String str,in byte[] bArr, int i2);

    void OnRatioData(int i, String str, float f, float f2);
}