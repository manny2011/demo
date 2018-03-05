package com.example.administrator.biaozhunban.education;

import android.os.Bundle;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;
import com.example.administrator.biaozhunban.comm.VideoActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/1/12.
 */

public class MainActivity extends BaseActivity {
    @Override
    protected int getLayout() {
        return R.layout.health_education_activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.ll_keJian, R.id.ll_reDian, R.id.ll_yangSheng, R.id.ll_xinDianTu, R.id.ll_changShi, R.id.ll_yinShi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_keJian:
                startActivity(VideoActivity.class);
                break;
            case R.id.ll_xinDianTu:
                startActivity(XianDianTuActivity.class);
                break;
            case R.id.ll_reDian:

//                break;
            case R.id.ll_yangSheng:

//                break;
            case R.id.ll_changShi:

//                break;
            case R.id.ll_yinShi:
                startActivity(ListActivity.class);
                break;
        }
    }
}
