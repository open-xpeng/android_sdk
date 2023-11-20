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

package com.xiaopeng.xuimanager.iot;

import java.util.Map;

/**
 * @noinspection unused
 */
public abstract class BaseDevice {
    public static final String CMD_ADD_DEVICE        = "cmd_add_device";
    public static final String CMD_ONOFF             = "cmd_base_onoff";
    public static final String CMD_REMOVE_DEVICE     = "cmd_remove_device";
    public static final String CMD_SCAN_DEVICE_START = "cmd_scan_device_start";
    public static final String CMD_SCAN_DEVICE_STOP  = "cmd_scan_device_stop";

    public static final String GET_BY_DEVICE_CLASS = "by_dev_class";
    public static final String GET_BY_DEVICE_TYPE  = "by_dev_type";

    public static final String PROP_CONNECT_STATE = "connect_state";
    public static final String PROP_ERROR_CODE    = "errorCode";
    public static final String PROP_POWER_STATE   = "power_state";
    public static final String PROP_STOP_COMMAND  = "XpStopCmd";
    public static final String PROP_SWITCH_STATE  = "switch_state";

    public static final String SCAN_TYPE_BLE = "scan_type_ble";

    public static final String VAL_CONNECTED           = "1";
    public static final String VAL_DISCONNECTED        = "0";
    public static final int    VAL_INVALID_INT         = Integer.MIN_VALUE;
    public static final String VAL_INVALID_STR         = "-2147483648";
    public static final String VAL_OFF                 = "0";
    public static final String VAL_ON                  = "1";
    public static final String VAL_SERVICE_AVAILABLE   = "100";
    public static final String VAL_UNINIT              = "-1";
    public static final int    VAL_UNINIT_INT          = -1;
    public static final String VAL_UNKNOWN_DEVICE_ID   = "unknown_device_id";
    public static final String VAL_UNKNOWN_DEVICE_NAME = "unknown_device_name";

    protected final String              deviceClass = getClass().getName();
    protected       String              deviceId;
    protected       String              deviceName;
    protected       String              deviceType;
    protected       Map<String, String> propertyMap;

    public static void setMaxPropertyLogLength(int len) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceName() {
        throw new RuntimeException("Stub!");
    }

    public BaseDevice setDeviceName(String name) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceId() {
        throw new RuntimeException("Stub!");
    }

    public BaseDevice setDeviceId(String id) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceType() {
        throw new RuntimeException("Stub!");
    }

    public BaseDevice setDeviceType(String type) {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceClass() {
        throw new RuntimeException("Stub!");
    }

    public BaseDevice setDeviceClass(String clazz) {
        throw new RuntimeException("Stub!");
    }

    public Map<String, String> getPropertyMap() {
        throw new RuntimeException("Stub!");
    }

    public BaseDevice setPropertyMap(Map<String, String> propMap) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}