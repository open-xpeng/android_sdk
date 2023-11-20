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

package com.xiaopeng.xuimanager.operation.utils;

import com.xiaopeng.xuimanager.operation.DownloadStatusInfo;
import com.xiaopeng.xuimanager.operation.FailedInfo;
import com.xiaopeng.xuimanager.operation.OperationResource;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

/**
 * @noinspection unused
 */
public class ResourceBuild {

    public static JSONObject toJson(OperationResource resource) {
        throw new RuntimeException("Stub!");
    }

    public static JSONObject toJsonWithDownloadParams(OperationResource resource, boolean useSystemTraffic) {
        throw new RuntimeException("Stub!");
    }

    public static JSONArray toJsonArray(List<OperationResource> resourceList) {
        throw new RuntimeException("Stub!");
    }

    public static OperationResource fromJson(JSONObject obj) {
        throw new RuntimeException("Stub!");
    }

    public static List<OperationResource> fromJsonArray(String arrayStr) {
        throw new RuntimeException("Stub!");
    }

    public static JSONObject toJson(DownloadStatusInfo downloadStatusInfo) {
        throw new RuntimeException("Stub!");
    }

    public static JSONArray toDownloadInfoJsonArray(List<DownloadStatusInfo> infoList) {
        throw new RuntimeException("Stub!");
    }

    public static DownloadStatusInfo toDownloadStatusInfo(String content) {
        throw new RuntimeException("Stub!");
    }

    public static JSONObject toJson(FailedInfo failedInfo) {
        throw new RuntimeException("Stub!");
    }

    public static FailedInfo toFailedInfo(String content) {
        throw new RuntimeException("Stub!");
    }

    public static List<DownloadStatusInfo> toDownloadStatusList(String content) {
        throw new RuntimeException("Stub!");
    }

    public static DownloadStatusInfo toDownloadStatusInfo(JSONObject jsonObject) {
        throw new RuntimeException("Stub!");
    }

    public static String getLegacyEventInfo(OperationResource resource) {
        throw new RuntimeException("Stub!");
    }
}
