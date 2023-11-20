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

package com.xiaopeng.xuimanager.themeoperation;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

import com.xiaopeng.xuimanager.XUIManagerBase;

/**
 * @noinspection unused
 */
public class ThemeOperationManager implements AbsThemeOperation, XUIManagerBase {
    public static final int    DATA_TYPE_EFFECT           = 2;
    public static final int    DATA_TYPE_THEME            = 1;
    public static final String EFFECT_AMBIENT_LIGHT       = "ambientlight";
    public static final String EFFECT_BOOT_ANIMATION      = "bootani";
    public static final String EFFECT_BOOT_SOUND          = "bootsound";
    public static final String EFFECT_LLU                 = "lightlang";
    public static final String EFFECT_SKIN                = "skin";
    public static final String EFFECT_SOUND_THEME         = "sndtheme";
    public static final String EVENT_EFFECT_FOCUS_CHANGE  = "effect_focus_change";
    public static final String EVENT_THEME_AVAILABLE      = "theme_available";
    public static final String EVENT_THEME_DELETED        = "theme_deleted";
    public static final String EVENT_THEME_READY          = "theme_ready";
    public static final String EVENT_THEME_SELECTED       = "theme_selected";
    public static final int    RES_STORAGE_TYPE_OPERATION = 2;
    public static final int    RES_STORAGE_TYPE_PRESET    = 1;
    public static final String THEME_ID_DEFAULT           = "default";
    public static final String THEME_NAME_DEFAULT         = "default";

    public static ThemeOperationManager getInstance() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public ThemeOperationData[] getThemes() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public ThemeOperationData getCurrentTheme() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean selectTheme(ThemeOperationData themeData) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean resetTheme(ThemeOperationData themeData) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean updateTheme(ThemeOperationData themeData) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean deleteTheme(ThemeOperationData themeData) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean selectEffect(AbilityEffect effect) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public synchronized void registerListener(ThemeOperationListener listener) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public synchronized void unRegisterListener(ThemeOperationListener listener) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void init(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIDisconnected() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIConnected(IBinder service) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String getServiceName() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void setServiceName(String name) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onServerDisconnected() {
        throw new RuntimeException("Stub!");
    }


    public void handleEventMessage(Message msg) {
        throw new RuntimeException("Stub!");
    }
}
