package com.example.administrator.biaozhunban.entrance.viewImpl;

import android.os.CountDownTimer;

import com.blankj.utilcode.util.ToastUtils;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onResume() {
        super.onResume();
        new CountDownTimer(2500,1000){

            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                ToastUtils.showShort("跳转主页面!");
                startActivity(MainActivity.class);
                finish();
            }
        }.start();
    }
}
