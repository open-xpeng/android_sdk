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
public class MituWatchDevice extends BaseDevice {
    public static final String DEVICE_TYPE                     = "Mitu-Watch";
    public static final String KEY_POS_DESCRIPTION             = "desc";
    public static final String KEY_POS_LATITUDE                = "lat";
    public static final String KEY_POS_LONGITUDE               = "long";
    public static final String KEY_POS_TIMESTAMP               = "timestamp";
    public static final String KEY_POWER_TIME_STAMP            = "timestamp";
    public static final String KEY_POWER_VALUE                 = "power";
    public static final String PROP_ALL_STATUS                 = "all_status";
    public static final String PROP_BIND_STATUS                = "bind_stat";
    public static final String PROP_GET_RESULT                 = "get_result";
    public static final String PROP_HEAD_PICTURE               = "watch_head";
    public static final String PROP_NETWORK_STATUS             = "network_stat";
    public static final String PROP_NICKNAME                   = "nickname";
    public static final String PROP_PHONE_NUMBER               = "phone";
    public static final String PROP_POSITION                   = "position";
    public static final String PROP_POWER_PERCENT              = "power";
    public static final String VAL_BIND_STATUS_ACCOUNT_CHANGE  = "100";
    public static final String VAL_BIND_STATUS_ACCOUNT_LOG_OUT = "-101";
    public static final String VAL_BIND_STATUS_BIND            = "1";
    public static final String VAL_BIND_STATUS_QUERY_FAIL      = "-100";
    public static final String VAL_BIND_STATUS_REBIND          = "2";
    public static final String VAL_BIND_STATUS_UNBIND          = "0";
    public static final String VAL_CMD_DO_QUERY                = "1";
    public static final String VAL_CMD_UPDATE_LOCATION         = "2";
    public static final String VAL_FAIL_BIND_STATUS_GET        = "-1";
    public static final String VAL_FAIL_GET_LOCATION           = "-4";
    public static final String VAL_FAIL_INFO_STATUS_GET        = "-2";
    public static final String VAL_FAIL_UPDATE_LOCATION        = "-3";
    public static final String VAL_STATUS_OFFLINE_OR_STANDBY   = "3";
    public static final String VAL_STATUS_POWER_OFF            = "0";
    public static final String VAL_STATUS_POWER_ON             = "1";

    public MituWatchDevice() {
        throw new RuntimeException("Stub!");
    }

    public MituWatchDevice(String name, String id, String type) {
        throw new RuntimeException("Stub!");
    }
}
