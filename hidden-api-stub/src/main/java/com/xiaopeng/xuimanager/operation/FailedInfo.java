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
public class FailedInfo {
    public static final String DISK_NO_SPACE = "disk space is not enough";
    public static final String UNZIP_ERROR   = "file not exist or not a valid zip file";
    private             String mFailedReason;
    private             String mResourceId;
    private             String mResourceName;
    private             int    mResourceType;

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

    public String getFailedReason() {
        throw new RuntimeException("Stub!");
    }

    public void setFailedReason(String failedReason) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
