package com.xiaopeng.xuimanager.pipebus;

import com.xiaopeng.xuimanager.pipebus.IPipeBusListener;
import com.xiaopeng.xuimanager.pipebus.ParcelableContainer;


interface IPipeBus {
    int ioControl( String str, String str2,in String[] strArr) ;

    int ioControlWithParcelable(String str, String str2,in ParcelableContainer parcelableContainer,in ParcelableContainer parcelableContainer2) ;

    int ioControlWithPocket(String str, String str2, in String[] strArr,in String[] strArr2) ;

    void registerListener(in IPipeBusListener iPipeBusListener) ;

    void registerListenerEx(String str,in IPipeBusListener iPipeBusListener) ;

    void unRegisterListener(in IPipeBusListener iPipeBusListener) ;

    void unRegisterListenerEx(String str) ;


}