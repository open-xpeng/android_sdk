# OpenXpeng

## 臭·搞技术的

这是一个小鹏非公开的安卓SDK，主要是为了方便安卓开发者调用车辆的一些功能。

目前没有完全开放全部功能，开放功能的多少取决于小鹏对待P5的态度，仅开放一些不重要的功能，如有更高级的功能需要，请自行催促小鹏赶紧OTA。

因本人时间有限，本项目公开的API并非全部进行测试，欢迎各位大佬测试后进行PR的方式贡献文档。

## 开放功能

目前开放完整的`XUI`功能，包含以下功能：

- AmbientManager (环境管理器)
- AmbientLightManager (环境光管理器)
- AwarenessManager (感知管理器)
- ConditionManager (条件管理器)
- ContextInfoManager (上下文信息管理器)
- DeviceShareManager (设备分享管理器)
- XPDownloadManager (下载管理器)
- XInputMethodManager (输入法管理器)
- IoTManager (物联网管理器)
- KaraokeManager (卡拉OK管理器)
- LightLanguageManager (灯光语言管理器)
- MakeupLightManager (化妆镜灯光管理器)
- MediaCenterManager (媒体中心管理器)
- MessageManager (消息管理器)
- MusicRecognizeManager (音乐识别管理器)
- OperationManager (操作管理器)
- SeatMassagerManager (座舱按摩管理器)
- SmartManager (智能管理器)
- SoundResourceManager (音效资源管理器)
- StoreResourceProvider (资源提供器)
- ThemeOperationManager (主题操作管理器)
- UserScenarioManager (用户场景管理器)
- XAppManager (应用管理器)

> 注意：以上中文翻译仅凭个人猜测，但不影响API调用。（欢迎PR修正）

## 如何使用

### 1. 添加依赖

在项目的`build.gradle`中添加以下依赖：

### 2. 调用相关功能

如下代码所示，调用`XUI`的`SmartManager`功能来实现让小P说话：

```java
SmartManager smartManager = (SmartManager) XUIManager.getInstance().getService(XUIManager.SMART_SERVICE);
smartManager.speakByNormal("你好，我是你的语音小助手，小P。");
```


