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
public class ChildSafetySeatDevice extends BaseDevice {
    public static final String DEVICE_TYPE = "SafetySeat-GlobalKids";

    public static final String PROP_HEAT_STATUS   = "heat_status";
    public static final String PROP_ISOFIX_STATUS = "isofix_stat";
    public static final String PROP_VENT_STATUS   = "vent_status";

    public static final String VAL_HEAT_LEVEL_1 = "heat_level_1";
    public static final String VAL_HEAT_LEVEL_2 = "heat_level_2";
    public static final String VAL_HEAT_LEVEL_3 = "heat_level_3";
    public static final String VAL_HEAT_OFF     = "heat_off";

    public static final String VAL_ISO_LEFT_DOUBLE_CLICK  = "iso_left_double_click";
    public static final String VAL_ISO_LEFT_END           = "iso_left_end";
    public static final String VAL_ISO_LEFT_START         = "iso_left_start";
    public static final String VAL_ISO_RIGHT_DOUBLE_CLICK = "iso_right_double_click";
    public static final String VAL_ISO_RIGHT_END          = "iso_right_end";
    public static final String VAL_ISO_RIGHT_START        = "iso_right_start";

    public static final String VAL_VENT_LEVEL_1 = "vent_level_1";
    public static final String VAL_VENT_LEVEL_2 = "vent_level_2";
    public static final String VAL_VENT_LEVEL_3 = "vent_level_3";
    public static final String VAL_VENT_OFF     = "vent_off";

    public ChildSafetySeatDevice() {
        throw new RuntimeException("Stub!");
    }

    public ChildSafetySeatDevice(String name, String id, String type) {
        throw new RuntimeException("Stub!");
    }
}
