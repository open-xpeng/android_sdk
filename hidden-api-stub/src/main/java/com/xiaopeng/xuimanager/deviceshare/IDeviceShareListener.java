/*
 * Copyright (C) 2023 The Open XPeng
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.xiaopeng.xuimanager.deviceshare;

import com.xiaopeng.xuimanager.deviceshare.data.ShareAppInfo;
import com.xiaopeng.xuimanager.deviceshare.data.ShareDevice;

/**
 * @noinspection unused
 */
public interface IDeviceShareListener {
    void onCommonEvent(ShareDevice shareDevice, String str, String str2, String[] strArr);

    default void onAppInfoEvent(ShareDevice device, String eventType, ShareAppInfo[] appInfos) {
    }
}