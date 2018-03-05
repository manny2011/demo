package com.example.administrator.biaozhunban.basicHealth;

import android.database.sqlite.SQLiteDatabase;
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
        return R.layout.basic_medical_activity_main;
    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.ll_bingLi, R.id.ll_jianYan, R.id.ll_jiLu, R.id.ll_kaiFang,
            R.id.ll_jieSuan, R.id.ll_yaoPing, R.id.ll_baoBiao})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_bingLi:
                break;
            case R.id.ll_jiLu:
                break;
            case R.id.ll_jianYan:
                break;
            case R.id.ll_kaiFang:
                break;
            case R.id.ll_jieSuan:
                break;
            case R.id.ll_yaoPing:
                startActivity(MedicineActivity.class);
                break;
            case R.id.ll_baoBiao:
                startActivity(BaoBiaoActivity.class);
                break;
        }
    }
}
