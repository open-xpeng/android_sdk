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

package com.xiaopeng.xuimanager.operation;

/**
 * @noinspection unused
 */
public class DownloadStatusInfo {
    public static final int STATE_CANCELLED          = 1150;
    public static final int STATE_COMPLETE           = 1100;
    public static final int STATE_ERROR              = 1000;
    public static final int STATE_LOADING            = 1;
    public static final int STATE_PAUSED             = 200;
    public static final int STATE_PENDING            = 2;
    public static final int STATE_RUNNING            = 100;
    public static final int STATE_RUNNING_DOWNLOAD   = 101;
    public static final int STATE_RUNNING_INSTALLING = 102;
    public static final int STATE_UNKNOWN            = 0;

    public String getResourceId() {
        throw new RuntimeException("Stub!");
    }

    public void setResourceId(String resourceId) {
        throw new RuntimeException("Stub!");
    }

    public int getResourceType() {
        throw new RuntimeException("Stub!");
    }

    public void setResourceType(int resourceType) {
        throw new RuntimeException("Stub!");
    }

    public String getResourceName() {
        throw new RuntimeException("Stub!");
    }

    public void setResourceName(String resourceName) {
        throw new RuntimeException("Stub!");
    }

    public float getProgress() {
        throw new RuntimeException("Stub!");
    }

    public void setProgress(float progress) {
        throw new RuntimeException("Stub!");
    }

    public int getState() {
        throw new RuntimeException("Stub!");
    }

    public void setState(int state) {
        throw new RuntimeException("Stub!");
    }

    public String getExtraInfo() {
        throw new RuntimeException("Stub!");
    }

    public void setExtraInfo(String extraInfo) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
