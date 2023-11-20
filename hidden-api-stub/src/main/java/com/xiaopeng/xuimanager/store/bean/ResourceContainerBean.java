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

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * @noinspection unused
 */
public class ResourceContainerBean implements Parcelable {
    public static final Creator<ResourceContainerBean> CREATOR = new Creator<ResourceContainerBean>() {

        @Override
        public ResourceContainerBean createFromParcel(Parcel in) {
            throw new RuntimeException("Stub!");
        }


        @Override
        public ResourceContainerBean[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public ResourceContainerBean() {
        throw new RuntimeException("Stub!");
    }

    protected ResourceContainerBean(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int describeContents() {
        return 0;
    }

    private int getTotalCount() {
        throw new RuntimeException("Stub!");
    }

    public void setTotalCount(int totalCount) {
        throw new RuntimeException("Stub!");
    }

    private int getPageCount() {
        throw new RuntimeException("Stub!");
    }

    public void setPageCount(int pageCount) {
        throw new RuntimeException("Stub!");
    }

    private int getTotalPage() {
        throw new RuntimeException("Stub!");
    }

    public void setTotalPage(int totalPage) {
        throw new RuntimeException("Stub!");
    }

    private int getCurrentPage() {
        throw new RuntimeException("Stub!");
    }

    public void setCurrentPage(int currentPage) {
        throw new RuntimeException("Stub!");
    }

    public List<ResourceBean> getResourceBeanList() {
        throw new RuntimeException("Stub!");
    }

    public void setResourceBeanList(List<ResourceBean> resourceBeanList) {
        throw new RuntimeException("Stub!");
    }

}
