package com.xiaopeng.xuimanager.pipebus;

import com.xiaopeng.xuimanager.pipebus.ParcelableContainer;

parcelable ParcelableContainer;

interface IPipeBusListener {

    void onPipeBusEvent(String str, String str2,in String[] strArr);

    void onPipeBusParcelEvent(String str, String str2,in ParcelableContainer parcelableContainer);
}