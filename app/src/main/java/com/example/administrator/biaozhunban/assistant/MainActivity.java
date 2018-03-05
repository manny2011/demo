package com.example.administrator.biaozhunban.assistant;

import android.os.Bundle;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/1/12.
 */

public class MainActivity extends BaseActivity {
    @Override
    protected int getLayout() {
        return R.layout.aided_diagnosis_activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.rl_xunZheng, R.id.rl_jiBingKu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_xunZheng:
                startActivity(XunZhengActivity.class);
                break;
            case R.id.rl_jiBingKu:
                startActivity(JiBingKuActivity.class);
                break;
        }
    }
}
