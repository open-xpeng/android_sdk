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

package com.xiaopeng.xuimanager.soundresource;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.soundresource.data.BootSoundResource;
import com.xiaopeng.xuimanager.soundresource.data.SoundEffectResource;
import com.xiaopeng.xuimanager.soundresource.data.SoundEffectTheme;

/**
 * @noinspection unused
 */
public class SoundResourceManager implements XUIManagerBase {
    public static final  int SOUND_RESOURCE_AI_PUSH                 = 8;
    public static final  int SOUND_RESOURCE_BREAK_PRESS_READY       = 7;
    public static final  int SOUND_RESOURCE_COMMON_HINT_1           = 4;
    public static final  int SOUND_RESOURCE_COMMON_HINT_2           = 5;
    public static final  int SOUND_RESOURCE_DRIVE_MODE              = 6;
    public static final  int SOUND_RESOURCE_EVENT_BOOT_SOUND_SWITCH = 100;
    public static final  int SOUND_RESOURCE_EVENT_READY_ALL         = 1000;
    public static final  int SOUND_RESOURCE_EVENT_THEME_SWITCH      = 1;
    public static final  int SOUND_RESOURCE_NO_SEATBELT             = 2;
    public static final  int SOUND_RESOURCE_PREVIEW_SWITCH          = 11;
    public static final  int SOUND_RESOURCE_PREVIEW_TOUCH           = 10;
    public static final  int SOUND_RESOURCE_RADAR                   = 3;
    public static final  int SOUND_RESOURCE_SYSTEM_EFFECT           = 9;
    public static final  int SOUND_RESOURCE_TURN_SIGNAL             = 1;
    private static final int MSG_RESOURCE_EVENT                     = 1;

    private SoundResourceManager() {
        throw new RuntimeException("Stub!");
    }

    public static SoundResourceManager getInstance() {
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

    @Override
    public void init(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public SoundEffectTheme[] getAvailableThemes() {
        throw new RuntimeException("Stub!");
    }

    public int getActiveSoundEffectTheme() {
        throw new RuntimeException("Stub!");
    }

    public int selectSoundEffectTheme(int themeId) {
        throw new RuntimeException("Stub!");
    }

    public SoundEffectResource[] getSoundEffectPlayResource(int themeId) {
        throw new RuntimeException("Stub!");
    }

    public SoundEffectResource[] getSoundEffectPreviewResource(int themeId) {
        throw new RuntimeException("Stub!");
    }

    public SoundEffectResource getActiveSoundEffectResource(int effectType) {
        throw new RuntimeException("Stub!");
    }

    public int setBootSoundOnOff(boolean flag) {
        throw new RuntimeException("Stub!");
    }

    public int getBootSoundOnOff() {
        throw new RuntimeException("Stub!");
    }

    public BootSoundResource[] getBootSoundResource() {
        throw new RuntimeException("Stub!");
    }

    public int setBootSoundResource(int resourceId) {
        throw new RuntimeException("Stub!");
    }

    public BootSoundResource getActiveBootSoundResource() {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(SoundResourceListener listener) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unRegisterListener(SoundResourceListener listener) {
        throw new RuntimeException("Stub!");
    }

    public void handleEventMessage(Message msg) {
        throw new RuntimeException("Stub!");
    }


    public interface SoundResourceListener {
        void onResourceEvent(int i, int i2);
    }

}
