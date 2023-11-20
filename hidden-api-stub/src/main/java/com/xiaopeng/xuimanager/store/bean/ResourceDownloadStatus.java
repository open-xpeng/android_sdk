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

package com.xiaopeng.xuimanager.store.bean;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @noinspection unused
 */
public class ResourceDownloadStatus {
    public static final int RM_DOWNLOADING       = 3;
    public static final int RM_DOWNLOAD_CANCEL   = 4;
    public static final int RM_DOWNLOAD_FAILED   = 7;
    public static final int RM_DOWNLOAD_FINISHED = 6;
    public static final int RM_DOWNLOAD_PAUSED   = 5;
    public static final int RM_DOWNLOAD_WAITING  = 2;
    public static final int RM_INSTALL_COMPLETE  = 8;
    public static final int RM_INSTALL_FAILED    = 9;
    public static final int RM_NOT_DOWNLOAD      = 1;

    @Retention(RetentionPolicy.SOURCE)

    public @interface Status {
    }
}
