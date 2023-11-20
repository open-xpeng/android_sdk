package com.xiaopeng.xuimanager.store;

import com.xiaopeng.xuimanager.store.bean.ResourceDownloadInfo;

/* loaded from: classes.dex */
interface IRMDownloadCallback {
    void basicTypes(int i, long j, boolean z, float f, double d, String str);

    void onDownloadCallback(int i,in ResourceDownloadInfo resourceDownloadInfo);

    void onMenuOpenCallback(String str);

    void unbindService();
}