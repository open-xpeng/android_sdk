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

import java.util.List;

/**
 * @noinspection unused
 */
public interface IOperationListener {
    void onOperationSourceAdd(int i, OperationResource operationResource);

    void onOperationSourceDelete(int i, OperationResource operationResource);

    void onOperationSourceExpire(int i, OperationResource operationResource);

    void onRemoteSourceQuerySuccess(int i, List<OperationResource> list);

    default void onResourceDownloadFailed(int type, FailedInfo failedInfo) {
    }

    default void onDownloadStatusChanged(int type, DownloadStatusInfo downloadStatusInfo) {
    }

    default void onRequestShowResourceDetail(int type, OperationResource operationResource) {
    }

    default void onOperationSourceSelected(int type, OperationResource resource) {
    }

    default void onOperationSourceUnselected(int type, OperationResource resource) {
    }

    default void onOperationResourceSyncCompleted(int resourceType) {
    }

    default void onOperationResourceSyncFailed(int resourceType) {
    }

    default void onOperationResourceSyncAborted(int resourceType) {
    }
}
