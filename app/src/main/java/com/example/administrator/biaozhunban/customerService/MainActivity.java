package com.example.administrator.biaozhunban.customerService;

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
        return R.layout.customer_service_activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.rl_shenQing, R.id.rl_huiFu, R.id.rl_dingGou})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_shenQing:
                startActivity(ShenQingActivity.class);
                break;
            case R.id.rl_huiFu:
                startActivity(HuiFuActivity.class);
                break;
            case R.id.rl_dingGou:
                startActivity(DingGouActivity.class);
                break;
        }
    }
}
