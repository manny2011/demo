package com.example.administrator.biaozhunban.basicHealth;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;
import com.example.administrator.biaozhunban.module.GlideApp;
import com.example.administrator.biaozhunban.module.GlideModule;
import com.example.administrator.biaozhunban.widget.IndexBar;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2018/1/12.
 */

public class MedicineActivity extends BaseActivity implements IndexBar.CharSelectedListener {
    @BindView(R.id.dialog)
    TextView dialog;
    @BindView(R.id.indexbar)
    IndexBar indexbar;

    @Override
    protected int getLayout() {
        return R.layout.basic_medical_activity_med_dict_query;
    }

    @Override
    protected void initView() {
        setTitle("药品管理");
        indexbar.setCharSelectedListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void charSelected(String s) {
        dialog.setText(s);
        dialog.setVisibility(View.VISIBLE);
    }

    @Override
    public void cancel() {
        dialog.setVisibility(View.INVISIBLE);
    }
}
