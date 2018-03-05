package com.example.administrator.biaozhunban.publicHealth;

import android.os.Bundle;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;

import butterknife.OnClick;

/**
 * Created by Administrator on 2018/1/12.
 */

public class MainActivity extends BaseActivity {
    @Override
    protected int getLayout() {
        return R.layout.public_health_activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.ll_cx, R.id.ll_jd,R.id.text_jcxxb,R.id.text_jktjb,R.id.text_gxyhzjkglfw,R.id.text_twoXtnbhzjkglfw
                ,R.id.text_yfjzfw,R.id.text_ycfjkglfw,R.id.text_zxjsbhzglfw,R.id.text_lnrjkglfw,R.id.text_zxSertjkglfw
                ,R.id.text_jkjyfw,R.id.text_wsjdxgfw})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_cx:
                startActivity(QueryActivity.class);
                break;
            case R.id.ll_jd:
                startActivity(ArchiveActivity.class);
                break;
            case R.id.text_jcxxb:
            case R.id.text_jktjb:
            case R.id.text_gxyhzjkglfw:
            case R.id.text_twoXtnbhzjkglfw:
            case R.id.text_yfjzfw:
            case R.id.text_ycfjkglfw:
            case R.id.text_zxjsbhzglfw:
            case R.id.text_lnrjkglfw:
            case R.id.text_zxSertjkglfw:
                startActivity(QueryActivity.class);
                break;
            case R.id.text_jkjyfw:
                Bundle bundle=new Bundle();
                bundle.putString("title","健康教育活动记录");
                bundle.putInt("type",3);
                startActivity(DengjiListActivity.class,bundle);
                break;
            case R.id.text_wsjdxgfw:
                startActivity(WeishengJianDuActivity.class);
                break;
        }
    }
}
