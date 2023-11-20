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

package com.xiaopeng.xuimanager.operation;

/**
 * @noinspection unused
 */
public class OperationType {
    public static final int   LLU             = 1010101;
    public static final int   AI_SPEECH       = 1060100;
    public static final int   THEME_OPERATION = 1080100;
    public static final int   EGG             = 1080200;
    public static final int   WELCOME_SOUND   = 1080300;
    public static final int   AVATAR          = 1080400;
    public static final int   NAVI_RESOURCE   = 1080500;
    public static final int[] SUPPORT_TYPES   = {LLU, AI_SPEECH, THEME_OPERATION, EGG, WELCOME_SOUND, AVATAR, NAVI_RESOURCE};
}
