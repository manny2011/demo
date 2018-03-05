package com.example.administrator.biaozhunban.publicHealth;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/2/4.
 */

public class WeishengJianDuActivity extends BaseActivity {
    @BindView(R.id.NavigateHomeLinearLayout)
    LinearLayout NavigateHomeLinearLayout;


    @Override
    protected int getLayout() {
        return R.layout.public_health_activity_healthauthority;
    }

    @Override
    protected void initView() {
        NavigateHomeLinearLayout.setVisibility(View.INVISIBLE);
        setTitle("卫生监督协管服务");
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.textView_xxdj, R.id.textView_xcdj})
    public void onViewClicked(View view) {
        Bundle bundle = new Bundle();
        switch (view.getId()) {
            case R.id.textView_xxdj:
                bundle.putInt("type",1);
                bundle.putString("title","卫生监督协管信息报告登记");
                break;
            case R.id.textView_xcdj:
                bundle.putInt("type",2);
                bundle.putString("title","卫生监督协管巡查登记");
                break;
        }
        startActivity(DengjiListActivity.class,bundle);
    }
}
