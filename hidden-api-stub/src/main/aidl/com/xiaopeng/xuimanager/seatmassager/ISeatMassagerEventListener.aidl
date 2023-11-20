package com.xiaopeng.xuimanager.seatmassager;

import java.util.List;

/* loaded from: classes.dex */
interface ISeatMassagerEventListener {
    void onMassagerEvent(int i, int i2, String str, int i3);

    void onVibrateEvent(in List<String> list, int i, String str, int i2);
}