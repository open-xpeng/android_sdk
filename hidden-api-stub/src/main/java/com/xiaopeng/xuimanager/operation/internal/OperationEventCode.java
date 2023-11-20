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

package com.xiaopeng.xuimanager.operation.internal;

/**
 * @noinspection unused
 */
public class OperationEventCode {
    public static final int EVENT_CODE_DOWNLOAD_FAILED         = 6;
    public static final int EVENT_CODE_DOWNLOAD_STATUS_CHANGED = 7;
    public static final int EVENT_CODE_RESOURCE_ADD            = 1;
    public static final int EVENT_CODE_RESOURCE_DELETE         = 9;
    public static final int EVENT_CODE_RESOURCE_EXPIRED        = 3;
    public static final int EVENT_CODE_RESOURCE_QUERY_SUCCESS  = 5;
    public static final int EVENT_CODE_RESOURCE_REMOVED        = 2;
    public static final int EVENT_CODE_RESOURCE_SET            = 4;
    public static final int EVENT_CODE_RESOURCE_SYNC_ABORTED   = 13;
    public static final int EVENT_CODE_RESOURCE_SYNC_COMPLETED = 11;
    public static final int EVENT_CODE_RESOURCE_SYNC_FAILED    = 12;
    public static final int EVENT_CODE_RESOURCE_UNSELECTED     = 10;
    public static final int EVENT_CODE_SHOW_RESOURCE_DETAIL    = 8;
}
