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

package com.xiaopeng.view;

import android.app.ActivityThread;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import android.view.WindowManager;

/**
 * @noinspection unused
 */
public class xpWindowManager {

    public static boolean isFullscreen(int systemUiVisibility, int flags) {
        throw new RuntimeException("STUB");
    }

    public static boolean isFullscreen(int systemUiVisibility, int flags, int xpFlags) {
        throw new RuntimeException("STUB");
    }

    public static boolean isFullscreen(WindowManager.LayoutParams lp, int privateFlags) {
        throw new RuntimeException("STUB");
    }

    public static boolean hasFullscreenFlag(int systemUiVisibility, int flags) {
        throw new RuntimeException("STUB");
    }

    public static boolean hasHideNavigationFlag(int systemUiVisibility, int flags) {
        throw new RuntimeException("STUB");
    }

    public static int getSystemUiVisibility(int systemUiVisibility, boolean immersive, boolean fullscreen, boolean layoutFullscreen, boolean hideNavigation, boolean translucentSystemUI) {
        throw new RuntimeException("STUB");
    }

    public static int getWindowFlags(int flags, boolean immersive, boolean fullscreen, boolean layoutFullscreen, boolean hideNavigation, boolean translucentSystemUI) {
        throw new RuntimeException("STUB");
    }

    public static String toString(WindowManager.LayoutParams lp) {
        throw new RuntimeException("STUB");
    }

    public static boolean isDesktopHome() {
        throw new RuntimeException("STUB");
    }

    public static boolean shouldAlwaysVisible(int activityType) {
        throw new RuntimeException("STUB");
    }

    public static boolean shouldVisibleWhenPaused(int pausingWindow, int resumingFlags) {
        throw new RuntimeException("STUB");
    }

    public static boolean shouldVisibleWhenPaused(Context context, ComponentName component) {
        throw new RuntimeException("STUB");
    }

    public static boolean keepActivityShown(ActivityThread.ActivityClientRecord r, boolean show) {
        throw new RuntimeException("STUB");
    }

    public static boolean skipSystemUiVisibility(String processName) {
        throw new RuntimeException("STUB");
    }

    public static boolean packagesLunchFullscreen(String packageName) {
        throw new RuntimeException("STUB");
    }

    public static boolean isComponentValid(ComponentName component) {
        throw new RuntimeException("STUB");
    }

    public static Rect getDisplayBounds(Context context) {
        throw new RuntimeException("STUB");
    }

    public static Rect getDisplayBounds() {
        throw new RuntimeException("STUB");
    }

    public static Size getMeasuredWindowSize(Context context, WindowManager.LayoutParams lp) {
        throw new RuntimeException("STUB");
    }

}
