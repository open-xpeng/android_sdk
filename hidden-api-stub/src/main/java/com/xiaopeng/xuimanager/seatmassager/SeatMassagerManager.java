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

package com.xiaopeng.xuimanager.seatmassager;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import android.os.IBinder;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

import java.util.List;
import java.util.Set;


/**
 * @noinspection unused
 */
public class SeatMassagerManager implements XUIManagerBase {
    public static final  int EFFECT           = 2;
    public static final  int ERROR            = 8;
    public static final  int INTENSITY        = 3;
    public static final  int LOAD             = 7;
    public static final  int RHYTHM_INTENSITY = 5;
    public static final  int RHYTHM_PATTERN   = 6;
    public static final  int RHYTHM_STATUS    = 4;
    public static final  int START            = 0;
    public static final  int STOP             = 1;
    private static final int MSG_MASSAGER     = 0;
    private static final int MSG_VIBRATE      = 1;


    public SeatMassagerManager(IBinder service, Context context, Handler handler) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchMassagerToClient(MassagerMessage message) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchVibrateToClient(VibrateMessage message) {
        throw new RuntimeException("Stub!");
    }

    public void handleMassagerEvent(int id, int type, String effect, int data) {
        throw new RuntimeException("Stub!");
    }

    public void handleVibrateEvent(Set<Integer> ids, int type, String effect, int data) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIDisconnected() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onXUIConnected(IBinder service) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public String getServiceName() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void setServiceName(String name) {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerListener(EventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(EventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void loadMassagerEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Set<String> showMassagerEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int startMassager(int id) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int startMassager(int id, String effect) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int startMassager(Seat seat, String effect) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int startMassager(Set<Seat> seats, String effect) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setMassagerEffect(int id, String effect) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setMassagerEffect(Set<Integer> ids, String effect) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getMassagerEffect(int id) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setMassagerIntensity(int id, int intensity) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setMassagerIntensity(Set<Integer> ids, int intensity) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getMassagerIntensity(int id) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getMassagerStatus(int id) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int stopMassager(int id) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int stopMassager(Set<Integer> ids) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void loadVibrateEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int loadVibrateEffect(AssetFileDescriptor fd, String effect) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public Set<String> showVibrateEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setRhythmEnable(int id, boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setRhythmEnable(Set<Integer> ids, boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getRhythmEnable(int id) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int doVibrate(int id, String effect, int loop, int position) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int doVibrate(Seat seat, String effect, int loop, int position) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int doVibrate(Set<Seat> seats, String effect, int loop, int position) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int doVibrate(int id, int duration, int position) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int doVibrate(Seat seat, int duration, int position) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int doVibrate(Set<Seat> seats, int duration, int position) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int stopVibrate() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setVibrateIntensity(int id, int intensity) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setVibrateIntensity(Set<Integer> ids, int intensity) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getVibrateIntensity(int id) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setRhythmIntensity(int id, int intensity) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setRhythmIntensity(Set<Integer> ids, int intensity) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getRhythmIntensity(int id) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int setRhythmPattern(int pattern) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getRhythmPattern() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public interface EventListener {
        default void onStartMassager(int id, String effect, int intensity) {
        }

        default void onStopMassager(int id, String effect, int intensity) {
        }

        default void onErrorMassager(int id, String effect, int opCode, int errCode) {
        }

        default void onChangeEffectMassager(int id, String effect) {
        }

        default void onChangeIntensityMassager(int id, int intensity) {
        }

        default void onLoadVibrate(String effect, boolean result) {
        }

        default void onStartVibrate(Set<Integer> ids, String effect, int position) {
        }

        default void onStopVibrate(Set<Integer> ids, String effect, int position) {
        }

        default void onChangeIntensityVibrate(Set<Integer> ids, int intensity) {
        }

        default void onErrorVibrate(Set<Integer> ids, String effect, int opCode, int errCode) {
        }

        default void onChangeIntensityRhythm(Set<Integer> ids, int intensity) {
        }

        default void onChangeStatusRhythm(Set<Integer> ids, boolean enable) {
        }

        default void onChangePatternRhythm(int pattern) {
        }
    }

    public static class SeatMassagerListenerToService extends ISeatMassagerEventListener.Stub {

        public SeatMassagerListenerToService(SeatMassagerManager manager) {
            throw new RuntimeException("Stub!");
        }

        @Override // com.xiaopeng.xuimanager.seatmassager.ISeatMassagerEventListener
        public void onMassagerEvent(int id, int type, String effect, int data) {
            throw new RuntimeException("Stub!");
        }

        @Override // com.xiaopeng.xuimanager.seatmassager.ISeatMassagerEventListener
        public void onVibrateEvent(List<String> ids, int type, String effect, int data) {
            throw new RuntimeException("Stub!");
        }
    }

    public class MassagerMessage {
        public int    data;
        public String effect;
        public int    id;
        public int    type;

        public MassagerMessage(int id, int type, String effect, int data) {
            throw new RuntimeException("Stub!");
        }
    }

    public class VibrateMessage {
        public int          data;
        public String       effect;
        public Set<Integer> ids;
        public int          type;

        public VibrateMessage(Set<Integer> ids, int type, String effect, int data) {
            throw new RuntimeException("Stub!");
        }
    }
}
