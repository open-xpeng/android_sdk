package com.xiaopeng.xuimanager.themeoperation;

import com.xiaopeng.xuimanager.themeoperation.AbilityEffect;
import com.xiaopeng.xuimanager.themeoperation.ThemeOperationData;
import com.xiaopeng.xuimanager.themeoperation.IThemeOperationListener;

/* loaded from: classes.dex */
interface IThemeOperation {
    boolean deleteTheme(in ThemeOperationData themeOperationData);

    ThemeOperationData getCurrentTheme();

    ThemeOperationData[] getThemes();

    void registerListener(IThemeOperationListener iThemeOperationListener);

    boolean resetTheme(in ThemeOperationData themeOperationData);

    boolean selectEffect(in AbilityEffect abilityEffect);

    boolean selectTheme(in ThemeOperationData themeOperationData);

    void unRegisterListener(IThemeOperationListener iThemeOperationListener);

    boolean updateTheme(in ThemeOperationData themeOperationData);
}