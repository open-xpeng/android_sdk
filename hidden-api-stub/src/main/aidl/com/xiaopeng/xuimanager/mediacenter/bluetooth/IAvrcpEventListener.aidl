package com.xiaopeng.xuimanager.mediacenter.bluetooth;

import com.xiaopeng.xuimanager.mediacenter.bluetooth.AvrcpMeteData;


interface IAvrcpEventListener {
      void onConnectedChanged(int i, int i2);

      void onMeteDataChanged(in AvrcpMeteData avrcpMeteData);

      void onPlaybackChanged(int i);

      void onPositionChanged(long j, long j2);
}
