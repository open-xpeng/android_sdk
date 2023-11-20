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

package com.xiaopeng.xuimanager.contextinfo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @noinspection unused
 */
public class Navi implements Parcelable {
    public static final Parcelable.Creator<Navi> CREATOR = new Parcelable.Creator<Navi>() {
        @Override
        public Navi createFromParcel(Parcel source) {
            throw new RuntimeException("Stub!");
        }

        @Override
        public Navi[] newArray(int size) {
            throw new RuntimeException("Stub!");
        }
    };

    public Navi() {
    }

    protected Navi(Parcel in) {

    }

    public boolean isShowExitInfo() {
        throw new RuntimeException("Stub!");
    }

    public void setShowExitInfo(boolean showExitInfo) {
        throw new RuntimeException("Stub!");
    }

    public boolean isTightTurnShow() {
        throw new RuntimeException("Stub!");
    }

    public void setTightTurnShow(boolean tightTurnShow) {
        throw new RuntimeException("Stub!");
    }

    public String getSegmentRemainDistDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setSegmentRemainDistDisplay(String segmentRemainDistDisplay) {
        throw new RuntimeException("Stub!");
    }

    public int getSegmentRemainDistUnitDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setSegmentRemainDistUnitDisplay(int segmentRemainDistUnitDisplay) {
        throw new RuntimeException("Stub!");
    }

    public String getRouteRemainDistDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setRouteRemainDistDisplay(String routeRemainDistDisplay) {
        throw new RuntimeException("Stub!");
    }

    public int getRouteRemainDistUnitDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setRouteRemainDistUnitDisplay(int routeRemainDistUnitDisplay) {
        throw new RuntimeException("Stub!");
    }

    public String getNextManeuverDistDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setNextManeuverDistDisplay(String nextManeuverDistDisplay) {
        throw new RuntimeException("Stub!");
    }

    public int getNextManeuverDistUnitDisplay() {
        throw new RuntimeException("Stub!");
    }

    public void setNextManeuverDistUnitDisplay(int nextManeuverDistUnitDisplay) {
        throw new RuntimeException("Stub!");
    }

    public int getSegmentRemainProgress() {
        throw new RuntimeException("Stub!");
    }

    public void setSegmentRemainProgress(int segmentRemainProgress) {
        throw new RuntimeException("Stub!");
    }

    public int getSegmentRemainDist() {
        throw new RuntimeException("Stub!");
    }

    public void setSegmentRemainDist(int segmentRemainDist) {
        throw new RuntimeException("Stub!");
    }

    public double getRouteRemainDist() {
        throw new RuntimeException("Stub!");
    }

    public void setRouteRemainDist(double routeRemainDist) {
        throw new RuntimeException("Stub!");
    }

    public double getRouteRemainTime() {
        throw new RuntimeException("Stub!");
    }

    public void setRouteRemainTime(double routeRemainTime) {
        throw new RuntimeException("Stub!");
    }

    public double getViaRemainTime() {
        throw new RuntimeException("Stub!");
    }

    public void setViaRemainTime(double viaRemainTime) {
        throw new RuntimeException("Stub!");
    }

    public int getRouteRemainLightCnt() {
        throw new RuntimeException("Stub!");
    }

    public void setRouteRemainLightCnt(int routeRemainLightCnt) {
        throw new RuntimeException("Stub!");
    }

    public int getViaRemainCnt() {
        throw new RuntimeException("Stub!");
    }

    public void setViaRemainCnt(int viaRemainCnt) {
        throw new RuntimeException("Stub!");
    }

    public long getNextManeuverID() {
        throw new RuntimeException("Stub!");
    }

    public void setNextManeuverID(long nextManeuverID) {
        throw new RuntimeException("Stub!");
    }

    public int getNextManeuverDist() {
        throw new RuntimeException("Stub!");
    }

    public void setNextManeuverDist(int nextManeuverDist) {
        throw new RuntimeException("Stub!");
    }

    public boolean getIsShowExitInfo() {
        throw new RuntimeException("Stub!");
    }

    public void setIsShowExitInfo(boolean isShowExitInfo) {
        throw new RuntimeException("Stub!");
    }

    public String getExitInfo() {
        throw new RuntimeException("Stub!");
    }

    public void setExitInfo(String exitInfo) {
        throw new RuntimeException("Stub!");
    }

    public String getNextRouteName() {
        throw new RuntimeException("Stub!");
    }

    public void setNextRouteName(String nextRouteName) {
        throw new RuntimeException("Stub!");
    }

    public String getCurRouteName() {
        throw new RuntimeException("Stub!");
    }

    public void setCurRouteName(String curRouteName) {
        throw new RuntimeException("Stub!");
    }

    public boolean getIsTightTurnShow() {
        throw new RuntimeException("Stub!");
    }

    public void setIsTightTurnShow(boolean isTightTurnShow) {
        throw new RuntimeException("Stub!");
    }

    public int getExitInfoType() {
        throw new RuntimeException("Stub!");
    }

    public void setExitInfoType(int exitInfoType) {
        throw new RuntimeException("Stub!");
    }

    public int getSmartStatus() {
        throw new RuntimeException("Stub!");
    }

    public void setSmartStatus(int smartStatus) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        throw new RuntimeException("Stub!");
    }
}

