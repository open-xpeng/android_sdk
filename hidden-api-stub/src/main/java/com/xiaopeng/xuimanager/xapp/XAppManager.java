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

package com.xiaopeng.xuimanager.xapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;

import com.xiaopeng.app.xpAppInfo;
import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

import java.util.List;
import java.util.Map;

/**
 * @noinspection unused
 */
public class XAppManager implements XUIManagerBase {

    public XAppManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public static List<String> getSpeechObserver() throws Exception {
        throw new RuntimeException("Stub!");
    }

    public static void setToastEnabled(boolean enabled) throws Exception {
        throw new RuntimeException("Stub!");
    }

    public static void setOsdEnabled(boolean enabled) throws Exception {
        throw new RuntimeException("Stub!");
    }

    public static void setSpeechUIEnabled(Context context, boolean enabled) throws Exception {
        throw new RuntimeException("Stub!");
    }

    public static List<xpAppInfo> getXpAppPackageList(int screenId) throws Exception {
        throw new RuntimeException("Stub!");
    }

    public static List<xpAppInfo> getXpAppPackageList() throws Exception {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(XAppEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(XAppEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void dispatchErrorEventToClient(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void handleErrorEvent(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchStartAppEventToClient(Bundle extras) {
        throw new RuntimeException("Stub!");
    }

    public void handleStartAppEvent(Bundle extras) {
        throw new RuntimeException("Stub!");
    }

    public boolean getAppUsedLimitEnable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setAppUsedLimitEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int checkAppStart(String packageName) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int onAppConfigUpload(String pkgName, String config) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIDisconnected() {
        throw new RuntimeException("Stub!");
    }

    public void onXUIConnected(IBinder service) {
        throw new RuntimeException("Stub!");
    }

    public String getServiceName() {
        throw new RuntimeException("Stub!");
    }

    public void setServiceName(String name) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerMiniProgListener(XMiniProgEventListener mListener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterMiniProgListener(XMiniProgEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void startMiniProgram(String id, String name, Map<String, String> params) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void logoutAccount() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void attachContext() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void initService() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean isServiceOnline() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void activeArome(Map pamams) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void loginAccount() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void exitApp(String id) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void preloadApp(String appId, boolean loadToMemory) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void requestLoginInfo() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void requestMiniList(String alipayVersion) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void uploadAlipayLog() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void checkIdentityValid(String userKey) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void startCustomService(String serviceCode, String userIdentity) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean checkOrderValid(String orderId) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean isTopActivityFullscreen() throws Exception {
        throw new RuntimeException("Stub!");
    }

    public void forceGrantFolderPermission(String path) throws Exception {
        throw new RuntimeException("Stub!");
    }

    public int startXpApp(String uriParam, Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public int getAppType(String pkgName) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public List<String> getInstalledAppList(int appType) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void closeCancelableDialog() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void startPanel(Context context, Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public interface AppType {
        int APP_TYPE_EDUCATION = 5;
        int APP_TYPE_GAME      = 3;
        int APP_TYPE_INFO      = 4;
        int APP_TYPE_KARAOKE   = 7;
        int APP_TYPE_MUSIC     = 1;
        int APP_TYPE_OTHER     = 0;
        int APP_TYPE_TOOL      = 6;
        int APP_TYPE_VIDEO     = 2;
    }

    public interface MiniProgType {
        int MINI_PROG_TYPE_EXIT       = 5;
        int MINI_PROG_TYPE_INIT       = 0;
        int MINI_PROG_TYPE_LAUNCH     = 3;
        int MINI_PROG_TYPE_LOGIN      = 1;
        int MINI_PROG_TYPE_LOGIN_INFO = 6;
        int MINI_PROG_TYPE_LOGOUT     = 2;
        int MINI_PROG_TYPE_MINI_LIST  = 7;
        int MINI_PROG_TYPE_PRELOAD    = 4;
        int TYPE_LAUNCH_SERVICE       = 12;
        int TYPE_MINI_DETAIL          = 9;
        int TYPE_UPLOAD_INFO          = 13;
        int TYPE_UPLOAD_LOG           = 8;
        int TYPE_VERIFY_IDENTITY      = 10;
        int TYPE_VERIFY_INFO          = 11;
    }

    public interface XMiniProgEventListener {
        //TODO: void onMiniProgCallBack(int i, MiniProgramResponse miniProgramResponse);
        void onMiniProgCallBack(int i, Object miniProgramResponse);
    }

    public interface XAppEventListener {
        void onErrorEvent(int i, int i2);

        default void onStartAppEvent(Bundle extras) {
        }
    }
}
