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
public class FridgeDevice extends BaseDevice {
    public static final String DEVICE_TYPE = "Fridge";

    public static final int ERROR_1    = 1;
    public static final int ERROR_2    = 2;
    public static final int ERROR_3    = 4;
    public static final int ERROR_4    = 8;
    public static final int ERROR_5    = 16;
    public static final int ERROR_6    = 32;
    public static final int ERROR_7    = 64;
    public static final int ERROR_NONE = 0;

    public static final String PROP_ERROR_CODE            = "error_code";
    public static final String PROP_ERROR_CODE_TIME_STAMP = "error_code_timestamp";
    public static final String PROP_TARGET_TEMPERATURE    = "target_temp";
    public static final String PROP_TEMPERATURE           = "temperature";

    public static final String VAL_ERROR_CODE_DOOR_OPEN      = "door open";
    public static final String VAL_SWITCH_OFF                = "0";
    public static final String VAL_SWITCH_ON                 = "1";
    public static final String VAL_TEMPERATURE_TARGET_HIGH   = "+06";
    public static final String VAL_TEMPERATURE_TARGET_LOW    = "-06";
    public static final String VAL_TEMPERATURE_TARGET_MIDDLE = "+00";

    public FridgeDevice() {
        throw new RuntimeException("Stub!");
    }

    public FridgeDevice(String name, String id, String type) {
        throw new RuntimeException("Stub!");
    }

    public static long[] getErrorCodeTimeStamps(String rawData) {
        throw new RuntimeException("Stub!");
    }
}
