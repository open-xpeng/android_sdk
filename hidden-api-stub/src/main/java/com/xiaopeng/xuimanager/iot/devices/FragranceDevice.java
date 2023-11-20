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
public class FragranceDevice extends BaseDevice {
    public static final int CHANNEL_COUNT = 3;

    public static final String DEVICE_TYPE = "Fragrance";

    public static final String PROP_ACTIVE_CHANNEL   = "active";
    public static final String PROP_CHANNEL_TYPES    = "channel_types";
    public static final String PROP_CONCENTRATION    = "concentration";
    public static final String PROP_CO_CONCENTRATION = "co_concentration";

    public static final String VAL_CHANNEL_1 = "0";
    public static final String VAL_CHANNEL_2 = "1";
    public static final String VAL_CHANNEL_3 = "2";

    public static final String VAL_CONCENTRATION_HIGH    = "2";
    public static final String VAL_CONCENTRATION_LOW     = "1";
    public static final String VAL_CO_CONCENTRATION_HIGH = "2";
    public static final String VAL_CO_CONCENTRATION_LOW  = "1";
    public static final String VAL_CO_CONCENTRATION_NONE = "0";

    public static final String VAL_OFF = "0";
    public static final String VAL_ON  = "1";

    public static final int VAL_TYPE_1      = 1;
    public static final int VAL_TYPE_2      = 2;
    public static final int VAL_TYPE_3      = 3;
    public static final int VAL_TYPE_4      = 4;
    public static final int VAL_TYPE_MAX    = 100;
    public static final int VAL_TYPE_UNINIT = -1;
    public static final int VAL_TYPE_UNPLUG = 0;

    public static final String CMD_SET_SWITCH        = "setSwitch";
    public static final String CMD_SET_CHANNEL       = "setActiveChannel";
    public static final String CMD_SET_CONCENTRATION = "setConcentration";

    public FragranceDevice() {
        throw new RuntimeException("Stub!");
    }

    public FragranceDevice(String name, String id, String type) {
        throw new RuntimeException("Stub!");
    }

    public static int[] readChannelTypes(String typeStr) {
        throw new RuntimeException("Stub!");
    }
}
