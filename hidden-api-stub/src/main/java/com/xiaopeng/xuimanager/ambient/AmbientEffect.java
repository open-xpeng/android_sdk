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

package com.xiaopeng.xuimanager.ambient;

/**
 * @noinspection unused
 */
public class AmbientEffect {

    public String toJson() {
        throw new RuntimeException("Stub!");
    }

    public static class Builder {

        public Builder(String uuid) {
            throw new RuntimeException("Stub!");
        }

        public Builder setCount(int count) {
            throw new RuntimeException("Stub!");
        }

        public Builder setRhythm() {
            throw new RuntimeException("Stub!");
        }

        public Builder setHue(int displayId) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSequence(int group, int color, int bright, int fade, int period) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSequence(int[] groups, int[] colors, int bright, int fade, int period) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSequence(int[] groups, int color, int bright, int fade, int period) {
            throw new RuntimeException("Stub!");
        }

        public Builder setSequence(int group, int[] colors, int bright, int fade, int period) {
            throw new RuntimeException("Stub!");
        }

        public AmbientEffect build() {
            throw new RuntimeException("Stub!");
        }
    }
}