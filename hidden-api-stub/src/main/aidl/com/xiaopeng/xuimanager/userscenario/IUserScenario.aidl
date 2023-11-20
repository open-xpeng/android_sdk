package com.xiaopeng.xuimanager.userscenario;

import com.xiaopeng.xuimanager.userscenario.IUserScenarioListener;

/* loaded from: classes.dex */
interface IUserScenario {
    String checkEnterUserScenario(String str, String str2);

    String enterUserScenario(String str, String str2);

    String enterUserScenarioWithExtra(String str, String str2, String str3);

    String exitUserScenario(String str);

    String getCurrentUserScenario();

    String[] getCurrentUserScenarios();

    int getUserScenarioStatus(String str);

    void registerBinderObserver(IBinder iBinder);

    void registerBinderObserverWithData(IBinder iBinder, String str);

    void registerListener(IUserScenarioListener iUserScenarioListener);

    void reportStatus(String str, int i);

    String setParameters(String str, String str2);

    void unregisterListener(IUserScenarioListener iUserScenarioListener);
}