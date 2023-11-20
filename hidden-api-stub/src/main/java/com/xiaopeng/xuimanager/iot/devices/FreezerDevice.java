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

package com.xiaopeng.xuimanager.iot.devices;

import com.xiaopeng.xuimanager.iot.BaseDevice;

/**
 * @noinspection unused
 */
public class FreezerDevice extends BaseDevice {

    public static final String DEVICE_TYPE = "Freezer";

    public static final String PROP_CHILD_LOCK        = "child_lock";
    public static final String PROP_DOOR_CTRL         = "door_ctrl";
    public static final String PROP_HEAT_PRESERVATION = "heat_preservation";
    public static final String PROP_HOLDING_TIME      = "holding_time";
    public static final String PROP_HT_MEMORY_CTRL    = "ht_memory_ctrl";
    public static final String PROP_POWER_CTRL        = "power_ctrl";
    public static final String PROP_TEMPERATURE       = "temperature";
    public static final String PROP_WORK_MODE         = "work_mode";

    public static final String VAL_COLD = "cold";
    public static final String VAL_DEC  = "dec";
    public static final String VAL_ERR  = "error";
    public static final String VAL_HEAT = "heat";
    public static final String VAL_INC  = "inc";
    public static final String VAL_OFF  = "off";
    public static final String VAL_ON   = "on";

    public FreezerDevice() {
        throw new RuntimeException("Stub!");
    }

    public FreezerDevice(String name, String id, String type) {
        throw new RuntimeException("Stub!");
    }
}
