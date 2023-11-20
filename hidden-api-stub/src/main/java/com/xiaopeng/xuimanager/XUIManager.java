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

package com.xiaopeng.xuimanager;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;

import androidx.annotation.NonNull;
import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @from framework com.xiaopeng.xuimanager.jar
 */
public class XUIManager {

    // region ServiceName
    public static final String AMBIENTLIGHT_SERVICE      = "ambientlight";
    public static final String AMBIENT_SERVICE           = "ambient";
    public static final String AWARENESS_SERVICE         = "awareness";
    public static final String CONDITION_SERVICE         = "condition";
    public static final String CONTEXTINFO_SERVICE       = "contextinfo";
    public static final String IOT_MANAGER               = "iotmanager";
    public static final String KARAOKE_SERVICE           = "karaoke";
    public static final String LIGHTLANUAGE_SERVICE      = "lightlanuage";
    public static final String MAKEUPLIGHT_SERVICE       = "makeuplight";
    public static final String MEDIACENTER_SERVICE       = "mediacenter";
    public static final String MESSAGE_SERVICE           = "message";
    public static final String MUSICRECOGNIZE_SERVICE    = "musicrecognize";
    public static final String OPERATION_SERVICE         = "operation";
    public static final String SEATMASSAGER_SERVICE      = "seatmassager";
    public static final String SMART_SERVICE             = "smart";
    public static final String SOUND_RESOURCE_SERVICE    = "sndresource";
    public static final String THEME_OPERATION_SERVICE   = "themeoperation";
    public static final String USER_SCENARIO_SERVICE     = "userscenario";
    public static final String XAPP_SERVICE              = "xapp";
    public static final String XPDOWNLOAD_SERVICE        = "xpdownload";
    public static final String XUI_MANAGER_SERVICE       = "XuiServiceManager";
    public static final String PERMISSION_AMBIENTLIGHT   = "com.xiaopeng.xuimanager.permission.XUI_AMBIENTLIGHT";
    // endregion
    public static final String PERMISSION_AWARENESS      = "com.xiaopeng.xuimanager.permission.XUI_AWARENESS";
    public static final String PERMISSION_CONTEXTINFO    = "com.xiaopeng.xuimanager.permission.XUI_CONTEXTINFO";
    public static final String PERMISSION_KARAOKE        = "com.xiaopeng.xuimanager.permission.XUI_KARAOKE";
    public static final String PERMISSION_LANGLIGHT      = "com.xiaopeng.xuimanager.permission.XUI_LANGLIGHT";
    public static final String PERMISSION_LIGHTLANUAGE   = "com.xiaopeng.xuimanager.permission.XUI_LIGHTLANUAGE";
    public static final String PERMISSION_MAKEUPLIGHT    = "com.xiaopeng.xuimanager.permission.XUI_MAKEUPLIGHT";
    public static final String PERMISSION_MEDIACENTER    = "com.xiaopeng.xuimanager.permission.XUI_MEDIACENTER";
    public static final String PERMISSION_MUSICRECOGNIZE = "com.xiaopeng.xuimanager.permission.XUI_MUSICRECOGNIZE";
    public static final String PERMISSION_OPERATION      = "com.xiaopeng.xuimanager.permission.XUI_OPERATION";
    public static final String PERMISSION_SEATMASSAGER   = "com.xiaopeng.xuimanager.permission.XUI_SEATMASSAGER";
    public static final String PERMISSION_SMART          = "com.xiaopeng.xuimanager.permission.XUI_SMART";
    public static final String PERMISSION_XAPP           = "com.xiaopeng.xuimanager.permission.XUI_XAPP";

    public static final String RESOURCE_PROVIDER = "resource_provider";

    public static synchronized XUIManager getInstance() {
        throw new RuntimeException("STUB");
    }

    public static XUIManager createXUIManager(Context context, ServiceConnection serviceConnectionListener, Handler handler) {
        throw new RuntimeException("STUB");
    }

    public static XUIManager createXUIManager(Context context, ServiceConnection serviceConnectionListener) {
        throw new RuntimeException("STUB");
    }

    public static void checkXUIServiceNotConnectedExceptionFromXUIService(IllegalStateException e) throws XUIServiceNotConnectedException, IllegalStateException {
        throw new RuntimeException("STUB");
    }

    public static String getXuiVersion() {
        throw new RuntimeException("STUB");
    }

    public void disconnect() {
        throw new RuntimeException("STUB");
    }

    public boolean isConnected() {
        throw new RuntimeException("STUB");
    }

    public boolean isConnecting() {
        throw new RuntimeException("STUB");
    }

    public Object getXUIServiceManager(String serviceName) throws XUIServiceNotConnectedException {
        throw new RuntimeException("STUB");
    }

    public synchronized void registerObserver() {
        throw new RuntimeException("STUB");
    }

    public Object getService(@ServiceName @NonNull String serviceName) {
        throw new RuntimeException("STUB");
    }

    public void startXUIService() {
        throw new RuntimeException("STUB");
    }

    public void notifyServerDisconnectForXUIManagers() {
        throw new RuntimeException("STUB");
    }

    public void bringUpXUIManagers() {
        throw new RuntimeException("STUB");
    }

    @StringDef({
        AMBIENTLIGHT_SERVICE, AMBIENT_SERVICE, AWARENESS_SERVICE, CONDITION_SERVICE, CONTEXTINFO_SERVICE, IOT_MANAGER,
        KARAOKE_SERVICE, LIGHTLANUAGE_SERVICE, MAKEUPLIGHT_SERVICE, MEDIACENTER_SERVICE, MESSAGE_SERVICE, MUSICRECOGNIZE_SERVICE,
        OPERATION_SERVICE, SEATMASSAGER_SERVICE, SMART_SERVICE, SOUND_RESOURCE_SERVICE, THEME_OPERATION_SERVICE,
        USER_SCENARIO_SERVICE, XAPP_SERVICE, XPDOWNLOAD_SERVICE, XUI_MANAGER_SERVICE,
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface ServiceName {
    }

}
