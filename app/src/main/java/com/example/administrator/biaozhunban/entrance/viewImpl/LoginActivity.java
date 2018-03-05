package com.example.administrator.biaozhunban.entrance.viewImpl;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;

import butterknife.OnClick;

/**
 * Created by Administrator on 2018/1/10.
 */

public class LoginActivity extends BaseActivity {
    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.NavigateHome)
    public void onViewClicked() {
        startActivity(RegisterActivity.class);
    }
}
