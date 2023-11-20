package com.xiaopeng.xuimanager.message;

import com.xiaopeng.xuimanager.message.IMessageListener;

interface IMessage {
    void publishMessage(String str, String str2);

    void registerMessage(String str, IMessageListener iMessageListener);

    void unregisterMessage(String str, IMessageListener iMessageListener);

}