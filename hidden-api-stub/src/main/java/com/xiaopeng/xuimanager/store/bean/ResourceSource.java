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

package com.xiaopeng.xuimanager.store.bean;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @noinspection unused
 */
public class ResourceSource {
    public static final int LOCAL  = 1;
    public static final int REMOTE = 2;

    @Retention(RetentionPolicy.SOURCE)

    public @interface Type {
    }
}
