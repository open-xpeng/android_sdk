package com.xiaopeng.xuimanager.themeoperation;

import com.xiaopeng.xuimanager.themeoperation.AbilityEffect;
import com.xiaopeng.xuimanager.themeoperation.ThemeOperationData;
import java.util.List;

/* loaded from: classes.dex */
interface IThemeOperationListener {
    void onEffectStatus(String str, String str2,in List<AbilityEffect> list);

    void onThemeStatus(String str, String str2,in List<ThemeOperationData> list);
}