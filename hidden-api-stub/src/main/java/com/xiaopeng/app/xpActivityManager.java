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

package com.xiaopeng.app;

import android.app.ActivityThread;
import android.app.IActivityManager;
import android.app.IActivityTaskManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

/**
 * @noinspection unused
 */
public class xpActivityManager {

    public static ActivityRecordInfo getOverrideActivityRecord(ActivityInfo info, Intent intent, Bundle options) {
        throw new RuntimeException("Stub!");
    }

    public static final Configuration getOverrideConfiguration(Configuration configuration, WindowManager.LayoutParams lp) {
        throw new RuntimeException("Stub!");
    }

    public static final int getActivityWindowType(ActivityThread.ActivityClientRecord r) {
        throw new RuntimeException("Stub!");
    }

    public static final boolean isHomeActivity(ActivityThread.ActivityClientRecord r) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isSystemApplication(String packageName) {
        throw new RuntimeException("Stub!");
    }

    public static final void finishMiniProgramIfNeed(ActivityThread.ActivityClientRecord r, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public static final void performActivityChanged(ActivityThread.ActivityClientRecord r) {
        throw new RuntimeException("Stub!");
    }

    public static final void performTopActivityChanged(ActivityThread.ActivityClientRecord r) {
        throw new RuntimeException("Stub!");
    }

    public static final ComponentName createComponentName(ActivityInfo info) {
        throw new RuntimeException("Stub!");
    }

    public static final String getProcessName(int pid) {
        throw new RuntimeException("Stub!");
    }

    public static final String getProcessName(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static final String getProcessName(Context context, int pid) {
        throw new RuntimeException("Stub!");
    }

    public static final String getPackageName(Context context, int pid) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isComponentValid(ComponentName component) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isComponentEqual(ComponentName a, ComponentName b) {
        throw new RuntimeException("Stub!");
    }

    public static boolean hasPermission(String permission, String packageName) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isDirectBootAware(Context context, String packageName) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isHome(Context context, ComponentName component) {
        throw new RuntimeException("Stub!");
    }

    public static void startHome(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void zoomTopActivity(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static void stopTopActivity(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static String getImmPackageName(Context context) {
        throw new RuntimeException("Stub!");
    }

    public static boolean shouldGrantUsbPermission(String packageName) {
        throw new RuntimeException("Stub!");
    }

    public static boolean overrideToFloating(String packageName) {
        throw new RuntimeException("Stub!");
    }

    public static Rect getOverrideFloatingAppBounds() {
        throw new RuntimeException("Stub!");
    }

    public static IActivityManager getActivityManager() {
        throw new RuntimeException("Stub!");
    }

    public static IActivityTaskManager getActivityTaskManager() {
        throw new RuntimeException("Stub!");
    }

    public static final class ActivityRecordInfo {
        public Intent intent;
        public Bundle options;
    }
}
