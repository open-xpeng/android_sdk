package com.xiaopeng.xuimanager.store;

import com.xiaopeng.xuimanager.store.IRMDownloadCallback;
import com.xiaopeng.xuimanager.store.bean.ResourceBean;
import com.xiaopeng.xuimanager.store.bean.ResourceContainerBean;
import com.xiaopeng.xuimanager.store.bean.ResourceDownloadInfo;
import java.util.List;

/* loaded from: classes.dex */
interface IResourceService {
    void basicTypes(int i, long j, boolean z, float f, double d, String str);

    boolean cancelDownload(String str);

    boolean cancelResDownload(String str, String str2);

    long enqueue(String str, String str2);

    int fetchDownloadStatusById(long j);

    int fetchDownloadStatusByUrl(String str);

    int getDownloadStatusById(long j);

    int getDownloadStatusByUrl(String str);

    long getDownloadedBytesById(long j);

    long getDownloadedBytesByUrl(String str);

    String getLocalFilePath(String str);

    long getTotalBytesById(long j);

    long getTotalBytesByUrl(String str);

    boolean pause(String str);

    boolean pauseDownload(String str);

    boolean pauseResDownload(String str, String str2);

    List<ResourceDownloadInfo> queryAllInfo();

    List<ResourceDownloadInfo> queryDownloadInfo(in String[] strArr);

    ResourceContainerBean queryResourceData(String str);

    void registerDownloadListener(IRMDownloadCallback iRMDownloadCallback);

    boolean remove(String str);

    void removeLocalDataById(long j);

    void removeLocalDataByUrl(String str);

    boolean resume(String str);

    boolean resumeDownload(String str);

    boolean resumeResDownload(String str, String str2);

    boolean start(in ResourceBean resourceBean);

    void unregisterDownloadListener(IRMDownloadCallback iRMDownloadCallback);
}