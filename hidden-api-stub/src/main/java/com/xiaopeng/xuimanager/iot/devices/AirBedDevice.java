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
public class AirBedDevice extends BaseDevice {
    public static final String DEVICE_TYPE = "XPeng-airbed";

    public static final int ERROR_BAROMETER_READ                  = 32;
    public static final int ERROR_BAROMETER_WRITE                 = 64;
    public static final int ERROR_CURRENT_HIGH                    = 16;
    public static final int ERROR_CURRENT_LOW                     = 8;
    public static final int ERROR_PRESSURE_NOT_READY_WHEN_PUMP    = 1;
    public static final int ERROR_PRESSURE_NOT_READY_WHEN_UN_PUMP = 2;
    public static final int ERROR_PRESSURE_READY_WORK_TIME_SHORT  = 4;

    public static final String PROP_BED_HARDNESS_DOWN    = "bedHardnessDown";
    public static final String PROP_BED_HARDNESS_LEVEL   = "hardnessLevel";
    public static final String PROP_BED_HARDNESS_RESTORE = "hardnessRestore";
    public static final String PROP_BED_HARDNESS_SAVE    = "hardnessSave";
    public static final String PROP_BED_HARDNESS_SET     = "hardnessSet";
    public static final String PROP_BED_HARDNESS_UP      = "bedHardnessUp";
    public static final String PROP_BED_HARDWARE_STATUS  = "bedHardware";
    public static final String PROP_BED_LEAST_WORK_TIME  = "leastWorkTime";
    public static final String PROP_BED_PHYSICAL_PUMP    = "physicalPump";
    public static final String PROP_BED_PHYSICAL_STOP    = "physicalStop";
    public static final String PROP_BED_PHYSICAL_UN_PUMP = "physicalUnPump";
    public static final String PROP_BED_PRESSURE         = "pressure";
    public static final String PROP_BED_PUMP             = "bedPump";
    public static final String PROP_BED_PUMP_STATUS      = "bedPumpStat";
    public static final String PROP_BED_UN_PUMP          = "bedUnPump";
    public static final String PROP_BED_WORK_CURRENT     = "workCurrent";
    public static final String PROP_BED_WORK_TIME        = "workedTime";

    public static final String VAL_BED_COMMAND_STATUS_DONE         = "03";
    public static final String VAL_BED_COMMAND_STATUS_FAIL         = "02";
    public static final String VAL_BED_COMMAND_STATUS_START        = "01";
    public static final String VAL_BED_PUMP_END                    = "03";
    public static final String VAL_BED_PUMP_FULL                   = "04";
    public static final String VAL_BED_PUMP_HARDNESS_DOWN          = "10";
    public static final String VAL_BED_PUMP_HARDNESS_UP            = "09";
    public static final String VAL_BED_PUMP_STARTED                = "02";
    public static final String VAL_BED_PUMP_WAIT                   = "01";
    public static final String VAL_BED_UN_PUMP_END                 = "07";
    public static final String VAL_BED_UN_PUMP_NONE                = "08";
    public static final String VAL_BED_UN_PUMP_STARTED             = "06";
    public static final String VAL_BED_UN_PUMP_WAIT                = "05";
    public static final String VAL_BED_WORK_STATUS_HARDNESS_ADJUST = "3";
    public static final String VAL_BED_WORK_STATUS_IDLE            = "0";
    public static final String VAL_BED_WORK_STATUS_PUMPING         = "1";
    public static final String VAL_BED_WORK_STATUS_UN_PUMPING      = "2";

    public AirBedDevice() {
        throw new RuntimeException("Stub!");
    }

    public AirBedDevice(String name, String id, String type) {
        throw new RuntimeException("Stub!");
    }
}
