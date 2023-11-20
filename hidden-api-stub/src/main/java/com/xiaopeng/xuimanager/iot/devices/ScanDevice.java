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
public class ScanDevice extends BaseDevice {
    public static final String DEVICE_TYPE                = "ScanDevice";
    public static final String PROP_BLE_MANUFACTURER_DATA = "ble_manufacturer_data";
    public static final String PROP_BLE_MANUFACTURER_ID   = "ble_manufacturer_id";
    public static final String PROP_BLUETOOTH_RSSI        = "bt_rssi";
    public static final String PROP_REAL_TYPE             = "real_type";
    public static final String VAL_TYPE_BLUETOOTH_BLE     = "type_bluetooth_ble";

    public ScanDevice() {
        throw new RuntimeException("Stub!");
    }

    public ScanDevice(String name, String id, String type) {
        throw new RuntimeException("Stub!");
    }

    public static boolean isXPengBleDevice(BaseDevice device) {
        throw new RuntimeException("Stub!");
    }
}
