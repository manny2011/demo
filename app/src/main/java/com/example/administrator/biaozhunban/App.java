package com.example.administrator.biaozhunban;

import android.app.Application;
import android.view.Gravity;

import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.example.administrator.biaozhunban.greendao.daomanager.DaoManager;

/**
 * Created by Administrator on 2018/1/10.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        ToastUtils.setGravity(Gravity.CENTER,0,0);
        DaoManager.getInstance().initDao(getApplicationContext());
    }
}
