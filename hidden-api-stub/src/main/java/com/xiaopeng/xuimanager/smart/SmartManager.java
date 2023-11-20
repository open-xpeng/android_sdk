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

package com.xiaopeng.xuimanager.smart;

import android.os.IBinder;

import androidx.annotation.IntDef;

import com.xiaopeng.xuimanager.XUIManagerBase;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/**
 * @noinspection unused
 */
public class SmartManager implements XUIManagerBase {

    public static final int ALARM_VOLUME_HIGH   = 2;
    public static final int ALARM_VOLUME_LOW    = 0;
    public static final int ALARM_VOLUME_MIDDLE = 1;

    public static final int AVAS_SOUND_EFFECT_A = 1;
    public static final int AVAS_SOUND_EFFECT_B = 2;
    public static final int AVAS_SOUND_EFFECT_C = 3;

    public static final int BOOT_SOUND_EFFECT_A       = 1;
    public static final int BOOT_SOUND_EFFECT_B       = 2;
    public static final int BOOT_SOUND_EFFECT_C       = 3;
    public static final int BOOT_SOUND_EFFECT_DISABLE = 0;

    public static final int     COMMON_TYPE_AI_LLU = 4096;
    public static final boolean DBG                = true;

    public static final String EFFECT_AC_CHARGE    = "android_ac";
    public static final String EFFECT_AWAKE        = "android_unlock_01";
    public static final String EFFECT_DC_CHARGE    = "android_dc";
    public static final String EFFECT_FIND_CAR     = "android_findcar";
    public static final String EFFECT_FULL_CHARGED = "fullcharged";
    public static final String EFFECT_LOCK         = "android_lock";
    public static final String EFFECT_LOCK_01      = "android_lock_01";
    public static final String EFFECT_LOCK_02      = "android_lock_02";
    public static final String EFFECT_LOCK_03      = "android_lock_03";
    public static final String EFFECT_SAYHI        = "android_sayhi";
    public static final String EFFECT_SAYHI_01     = "android_sayhi_01";
    public static final String EFFECT_SAYHI_02     = "android_sayhi_02";
    public static final String EFFECT_SAYHI_03     = "android_sayhi_03";
    public static final String EFFECT_SHOW_OFF     = "android_sayhi_01";
    public static final String EFFECT_SLEEP        = "android_lock_01";
    public static final String EFFECT_TAKE_PHOTO   = "takephoto";
    public static final String EFFECT_UNLOCK       = "android_unlock";
    public static final String EFFECT_UNLOCK_01    = "android_unlock_01";
    public static final String EFFECT_UNLOCK_02    = "android_unlock_02";
    public static final String EFFECT_UNLOCK_03    = "android_unlock_03";

    public static final int ErrorCode_Common     = -4;
    public static final int ErrorCode_DanceError = -4096;
    public static final int ErrorCode_Forbidden  = -1;
    public static final int ErrorCode_NoFocus    = -2;

    public static final int LIGHT_EFFECT_ACCHARGE  = 6;
    public static final int LIGHT_EFFECT_AWAKE     = 2;
    public static final int LIGHT_EFFECT_DCCHARGE  = 7;
    public static final int LIGHT_EFFECT_FINDCAR   = 1;
    public static final int LIGHT_EFFECT_SHOWOFF   = 10;
    public static final int LIGHT_EFFECT_SLEEP     = 5;
    public static final int LIGHT_EFFECT_TAKEPHOTO = 9;

    public static final int LLU_EFFECT_CLOSE  = 0;
    public static final int LLU_EFFECT_MODE_A = 1;
    public static final int LLU_EFFECT_MODE_B = 2;
    public static final int LLU_EFFECT_MODE_C = 3;

    public static final  int    LLU_MODE1                                = 1;
    public static final  int    LLU_MODE2                                = 2;
    public static final  int    LLU_MODE3                                = 3;
    public static final  int    SPEED_VOLUME_SOFT                        = 3;
    public static final  int    SPEED_VOLUME_STANDARD                    = 1;
    public static final  int    SPEED_VOLUME_SURGE                       = 2;
    public static final  int    TOUCH_ROTATION_DIRECTION_INWARD          = 0;
    public static final  int    TOUCH_ROTATION_DIRECTION_OUTWARD         = 1;
    public static final  String Type_Dance                               = "dance";
    public static final  String Type_LightDance                          = "lightanddance";
    public static final  int    XBOSS_MUTE_UNMUTE                        = 2;   // 静音或取消静音
    public static final  int    XBOSS_NONE                               = 0;   // 无
    public static final  int    XBOSS_SHOW_OFF                           = 4;   // 关闭
    public static final  int    XBOSS_SWITCH_MEDIA                       = 3;   // 切换媒体
    public static final  int    XBOSS_TAKE_PHOTO                         = 5;   // 拍照
    public static final  int    XBOSS_TEAM_COMMUNICATION                 = 6;   // 团队合作
    public static final  int    XBOSS_VOICE_ACTIVE                       = 1;   // 语音激活小P？
    public static final  int    XKEY_AUTO_PARK                           = 4;    // 自动停车
    public static final  int    XKEY_AUTO_PILOT                          = 5;    // 自动驾驶
    public static final  int    XKEY_NAR_ASSIST                          = 10;   // 导航
    public static final  int    XKEY_NONE                                = 0;    // 无
    public static final  int    XKEY_SHOW_OFF                            = 2;    // 关闭
    public static final  int    XKEY_SWITCH_MEDIA                        = 1;    // 切换媒体
    public static final  int    XKEY_TAKE_PHOTO                          = 3;    // 拍照
    public static final  int    XKEY_TEAM_COMMUNICATION                  = 7;    // 团队合作
    public static final  int    XKEY_UNLOCK_TRUNK                        = 8;    // 开锁
    public static final  int    XKEY_VOICE_CHAT                          = 6;    // 语音聊天
    public static final  int    XKEY_XSPORT                              = 9;    // 体育赛事
    private static final int    MSG_SMART_AI_LLU_EVENT                   = 6;
    private static final int    MSG_SMART_ERROR_EVENT                    = 0;
    private static final int    MSG_SMART_LIGHT_EFFECT_FINISH_EVENT      = 1;
    private static final int    MSG_SMART_LIGHT_EFFECT_SHOW_ERROR        = 5;
    private static final int    MSG_SMART_LIGHT_EFFECT_SHOW_FINISH_EVENT = 4;
    private static final int    MSG_SMART_LIGHT_EFFECT_SHOW_START_EVENT  = 2;
    private static final int    MSG_SMART_LIGHT_EFFECT_SHOW_STOP_EVENT   = 3;
    private static final int    MSG_SMART_SPEECH_TTS_EVENT               = 7;

    public synchronized void registerListener(SmartEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterListener(SmartEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void registerCommonListener(SmartCommonEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public synchronized void unregisterCommonListener(SmartCommonEventListener listener) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void dispatchErrorEventToClient(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLightEffectFinishEventToClient(int effectName, int effectMode) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLightEffectShowStartEventToClient(String effectName, String effectType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLightEffectShowStopEventToClient(String effectName, String effectType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLightEffectShowFinishEventToClient(String effectName, String effectType) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchLightEffectErrorToClient(String effectName, int errorCode) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchCommonEventToClient(int type, int value1, int value2) {
        throw new RuntimeException("Stub!");
    }

    public void dispatchSpeechTtsEventToClient(int type, String ttsId) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightEffectFinishEvent(int effectName, int effectMode) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightEffectShowStartEvent(String effectName, String effectType) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightEffectShowStopEvent(String effectName, String effectType) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightEffectShowFinishEvent(String effectName, String effectType) {
        throw new RuntimeException("Stub!");
    }

    public void handleLightEffectShowError(String effectName, int errorCode) {
        throw new RuntimeException("Stub!");
    }

    public void handleErrorEvent(int errorCode, int operation) {
        throw new RuntimeException("Stub!");
    }

    public void handleCommonEvent(int type, int value1, int value2) {
        throw new RuntimeException("Stub!");
    }

    public void handleSpeechTtsEvent(int type, String ttsId) {
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

    /**
     * 获取是否在门打开时音量减少音量
     *
     * @return 如果在门打开时按下音量减键则返回true，否则返回false
     * @throws XUIServiceNotConnectedException 如果XUI服务连接异常
     */
    public boolean getVolumeDownWithDoorOpen() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 设置在门打开时是否启用音量减少
     *
     * @param enable - 是否启用音量减小
     * @throws XUIServiceNotConnectedException - 如果XUI服务连接断开
     */
    public void setVolumeDownWithDoorOpen(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getVolumeDownInReverseMode() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setVolumeDownInReverseMode(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getAlarmFromAzimuthOrIcm() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setAlarmFromAzimuthOrIcm(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getKeyBoardTouchPrompt() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setKeyBoardTouchPrompt(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 获取客户的X键值
     *
     * @return 客户的X键值
     * @throws XUIServiceNotConnectedException 如果XUI服务未连接
     */
    public @XKey int getXKeyForCustomer() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 设置客户的X键值
     *
     * @param keyFunc 客户的X键值
     * @throws XUIServiceNotConnectedException 如果XUI服务未连接
     * @see XKey
     */
    public void setXKeyForCustomer(@XKey int keyFunc) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 获取老板键功能
     *
     * @return 老板键功能ID
     * @throws XUIServiceNotConnectedException 当UI服务未连接时抛出异常
     * @see XBoss
     */
    public @XBoss int getBossKeyForCustomer() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 设置老板键功能
     *
     * @param keyFunc 功能ID
     * @throws XUIServiceNotConnectedException 如果XUI服务连接未建立
     */
    public void setBossKeyForCustomer(@XBoss int keyFunc) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getTouchRotationDirection() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setTouchRotationDirection(int rotationDirection) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public List<String> getLangLightEffectNameList(int effectType) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setLangLightEffectMode(String effectName) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setLangLightEffectMode(String effectName, int loop) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setLangLightEffectWithMode(String effectName, int mode, int loop) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public String getRunnningLluEffectName() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getLluWakeWaitMode() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setLluWakeWaitMode(int type) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getLluSleepMode() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setLluSleepMode(int type) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getFftLLUEnable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setFftLLUEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setPause(boolean pause) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void stopLightEffectShow() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void updateEffectFiles(int effectType) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean getLangLightEffectEnable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setLangLightEffectEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setMusicSpectrumToLangLight(int tickNum) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int isLightDanceAvailable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int startLightDancing() {
        throw new RuntimeException("Stub!");
    }

    public int startLightDancing(int loop) {
        throw new RuntimeException("Stub!");
    }

    public int startLightDancing(String file_name, int loop) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int stopLightDancing() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public boolean isLightDancing() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getAlarmVolume() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setAlarmVolume(int type) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setMusicTableForDebug(int musicTable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setMusicStartTickNumForDebug(int tickNum) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setMusicStopTickNumForDebug(int tickNum) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setMusicDelayTimeForDebug(int delayTime) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setLangLightMusicEffect(String effectName) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getLightEffect(int effectName) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setLightEffect(int effectName, int effectMode) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setLightEffectAndMusic(int messageID, int effectName, int effectMusic) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 获取是否启用打招呼功能
     *
     * @return 如果启用则返回true，否则返回false
     * @throws XUIServiceNotConnectedException 如果未连接到XUI服务
     */
    public boolean getSayHiEnable() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 设置是否启用打招呼功能
     *
     * @param enable 是否启用打招呼功能。true为启用，false为不启用
     * @throws XUIServiceNotConnectedException 如果XUI服务未连接，抛出异常
     */
    public void setSayHiEnable(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 获取打招呼的效果
     *
     * @return 打招呼的效果
     * @throws XUIServiceNotConnectedException 如果未连接到XUI服务
     */
    public int getSayHiEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setSayHiEffect(int type) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public int getBootSoundEffect() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void setBootSoundEffect(int type) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 开启/关闭车辆速度音量
     *
     * @param enable 是否开启车辆速度音量
     * @throws XUIServiceNotConnectedException
     */
    public void enableCarSpeedVolume(boolean enable) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 设置速度音量模式
     *
     * @param type 类型
     * @throws XUIServiceNotConnectedException 当XUI服务未连接时抛出异常
     */
    public void setSpeedVolumeMode(@SpeedVolume int type) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void startAiLluMode(int type) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    public void stopAiLluMode() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 获取语音状态
     *
     * @return 返回语音状态
     * @throws XUIServiceNotConnectedException 抛出XUIServiceNotConnectedException异常
     */
    public boolean getSpeechStatus() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 使用普通方式说话
     *
     * @param text 说出的文本
     * @return 返回null
     * @throws XUIServiceNotConnectedException 当未连接到XUI服务时抛出异常
     */
    public String speakByNormal(String text) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 通过重要的方式来说话
     *
     * @param text 要说的话
     * @return 说的话
     * @throws XUIServiceNotConnectedException 如果XUIService未连接则抛出异常
     */
    public String speakByImportant(String text) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 在紧急情况下通过语音合成服务说出指定文本
     *
     * @param text 需要说出的文本
     * @return 说出的结果
     * @throws XUIServiceNotConnectedException 如果无法连接到语音合成服务
     */
    public String speakByUrgent(String text) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 通过立即行动方式说出给定的文本
     *
     * @param text     给定的文本
     * @param isShutUp 是否关闭声音
     * @return 说出的文本
     * @throws XUIServiceNotConnectedException 如果XUIService未连接
     */
    public String speakByInstant(String text, boolean isShutUp) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 停止文本到语音合成的方法
     *
     * @param ttsId TTS合成的唯一标识
     * @throws XUIServiceNotConnectedException 当XUI服务未连接时抛出异常
     */
    public void stopSpeech(String ttsId) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 停止所有语音功能
     *
     * @throws XUIServiceNotConnectedException 当XUI服务未连接时抛出异常
     */
    public void stopAllSpeech() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 开始麦克风录音模式
     *
     * @param status 录音状态
     * @return 状态码
     * @throws XUIServiceNotConnectedException 当 UI 服务未连接时抛出异常
     */
    public int startMicRecordMode(int status) throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    /**
     * 停止麦克风录音模式
     *
     * @return 返回停止录音模式的状态
     * @throws XUIServiceNotConnectedException 如果XUI服务连接不成功则抛出此异常
     */
    public int stopMicRecordMode() throws XUIServiceNotConnectedException {
        throw new RuntimeException("Stub!");
    }

    @IntDef({SPEED_VOLUME_SOFT, SPEED_VOLUME_STANDARD, SPEED_VOLUME_SURGE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SpeedVolume {
    }

    @IntDef({XBOSS_MUTE_UNMUTE, XBOSS_NONE, XBOSS_SHOW_OFF, XBOSS_SWITCH_MEDIA, XBOSS_TAKE_PHOTO, XBOSS_TEAM_COMMUNICATION, XBOSS_VOICE_ACTIVE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface XBoss {
    }

    @IntDef({XKEY_AUTO_PARK, XKEY_AUTO_PILOT, XKEY_NAR_ASSIST, XKEY_NONE, XKEY_SHOW_OFF, XKEY_SWITCH_MEDIA, XKEY_TAKE_PHOTO, XKEY_TEAM_COMMUNICATION, XKEY_UNLOCK_TRUNK, XKEY_VOICE_CHAT, XKEY_XSPORT})
    @Retention(RetentionPolicy.SOURCE)
    public @interface XKey {
    }


    public interface SmartEventListener {
        void onErrorEvent(int i, int i2);

        void onLightEffectFinishEvent(int i, int i2);

        default void onLightEffectShowStartEvent(String effectName, String effectType) {
        }

        default void onLightEffectShowStopEvent(String effectName, String effectType) {
        }

        default void onLightEffectShowFinishEvent(String effectName, String effectType) {
        }

        default void onLightEffectShowError(String effectName, int errorCode) {
        }
    }

    public interface SmartCommonEventListener {
        default void onCommonEvent(int type, int value1, int value2) {
        }

        default void onSpeechTtsEvent(int type, String ttsId) {
        }
    }

}
