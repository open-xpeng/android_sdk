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

package com.xiaopeng.xuimanager.iot.utils;

import com.xiaopeng.xuimanager.iot.BaseDevice;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * @noinspection unused
 */
public class DeviceBuilder {
    public static final String FIELD_DEVICE_CLASS    = "device_class";
    public static final String FIELD_DEVICE_ID       = "device_id";
    public static final String FIELD_DEVICE_NAME     = "device_name";
    public static final String FIELD_DEVICE_PROPERTY = "device_property";
    public static final String FIELD_DEVICE_TYPE     = "device_type";

    public static JSONObject toJson(BaseDevice device) {
        throw new RuntimeException("Stub!");
    }

    public static JSONObject propToJson(BaseDevice device) {
        throw new RuntimeException("Stub!");
    }

    public static JSONObject propToJson(Map<String, String> propMap) {
        throw new RuntimeException("Stub!");
    }

    public static JSONArray toJsonArray(List<BaseDevice> deviceList) {
        throw new RuntimeException("Stub!");
    }

    public static Map<String, String> jsonStrToPropMap(String jsonStr) {
        throw new RuntimeException("Stub!");
    }

    public static BaseDevice fromJson(JSONObject obj) {
        throw new RuntimeException("Stub!");
    }

    public static List<BaseDevice> fromJsonArray(String arrayStr) {
        throw new RuntimeException("Stub!");
    }
}
