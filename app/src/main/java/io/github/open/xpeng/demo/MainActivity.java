package io.github.open.xpeng.demo;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.xiaopeng.xuimanager.XUIManager;
import com.xiaopeng.xuimanager.XUIServiceNotConnectedException;
import com.xiaopeng.xuimanager.smart.SmartManager;

import io.github.open.xpeng.demo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.btn1.setOnClickListener(onClickButton1);
    }

    private final View.OnClickListener onClickButton1 = v -> {
        try {
            SmartManager smartManager = (SmartManager) XUIManager.getInstance().getService(XUIManager.SMART_SERVICE);
            smartManager.speakByNormal("你好，我是你的语音小助手，小屁，感谢使用开源的小鹏SDK，如您有使用问题欢迎在github上提issue进行讨论，谢谢。");
        } catch (XUIServiceNotConnectedException e) {
            throw new RuntimeException(e);
        }
    };


}
