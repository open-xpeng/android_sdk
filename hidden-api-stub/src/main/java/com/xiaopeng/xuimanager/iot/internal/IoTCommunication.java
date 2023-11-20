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

package com.xiaopeng.xuimanager.iot.internal;

/**
 * @noinspection unused
 */
public class IoTCommunication {
    public static final String EVENT_DEVICE_ADD                = "device_add";
    public static final String EVENT_OPERATION_RESULT          = "operation_result";
    public static final String EVENT_PROPERTY_UPDATE           = "property_update";
    public static final String EVENT_PROPERTY_UPDATE_WITH_JSON = "property_update_with_json";

    public static final String IO_ADD_MONITOR_DEVICE    = "add_monitor_device";
    public static final String IO_GET_DEVICE            = "get_device";
    public static final String IO_GET_PROPERTIES        = "get_properties";
    public static final String IO_REMOVE_MONITOR_DEVICE = "remove_monitor_device";
    public static final String IO_REQUEST_DEVICE        = "request_device";
    public static final String IO_SEND_DEVICE_CMD       = "send_device_cmd";
    public static final String IO_SET_PROPERTIES        = "set_properties";

    public static final String MODULE_IOT = "module_iot";
}
