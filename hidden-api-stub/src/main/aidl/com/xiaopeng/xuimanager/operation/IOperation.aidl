package com.xiaopeng.xuimanager.operation;

import com.xiaopeng.xuimanager.operation.IOperationEventListener;

/* loaded from: classes.dex */
interface IOperation {
    int addNewResource(String str, int i, String str2, String str3);

    boolean checkResourceExist(int i, String str);

    int deleteResource(String str, int i, String str2);

    void downloadResource(int i, String str,in PendingIntent pendingIntent);

    String getDownLoadResourceList(int i);

    String getInfo(String str, int i, String str2);

    String getLocalResourceList(int i);

    String getResource(int i, String str);

    void operateResource(String str, int i, String str2);

    void registerListener(IOperationEventListener iOperationEventListener);

    void unregisterListener(IOperationEventListener iOperationEventListener);

}