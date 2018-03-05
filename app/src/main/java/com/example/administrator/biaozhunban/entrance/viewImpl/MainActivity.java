package com.example.administrator.biaozhunban.entrance.viewImpl;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;

import java.text.DateFormat;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/1/10.
 */

public class MainActivity extends BaseActivity {

    @BindView(R.id.text_doctor)
    TextView textDoctor;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        SpannableString s = SpannableString.valueOf("Version!");
        s.setSpan(new UnderlineSpan(), 0, s.length() - 1, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        textDoctor.setText(s);
    }

    @Override
    protected void initData() {
        int densityDpi = getResources().getDisplayMetrics().densityDpi;
        float xdpi = getResources().getDisplayMetrics().xdpi;
        float ydpi = getResources().getDisplayMetrics().ydpi;
        LogUtils.e("densityDpi=" + densityDpi);
        LogUtils.e("x=" + xdpi);
        LogUtils.e("y=" + ydpi);
    }

    @OnClick({R.id.text_ggwsfw, R.id.text_jcylgl, R.id.text_fzzd, R.id.text_jkjy, R.id.text_shfw, R.id.text_zk,R.id.text_doctor, R.id.setting})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text_doctor:
                startActivity(LoginActivity.class);
                break;
            case R.id.setting:
                startActivity(SettingActivity.class);
                break;
            case R.id.text_ggwsfw:
                startActivity(com.example.administrator.biaozhunban.publicHealth.MainActivity.class);
                break;
            case R.id.text_jcylgl:
                startActivity(com.example.administrator.biaozhunban.basicHealth.MainActivity.class);
                break;
            case R.id.text_fzzd:
                startActivity(com.example.administrator.biaozhunban.assistant.MainActivity.class);
                break;
            case R.id.text_jkjy:
                startActivity(com.example.administrator.biaozhunban.education.MainActivity.class);
                break;
            case R.id.text_shfw:
                startActivity(com.example.administrator.biaozhunban.customerService.MainActivity.class);
                break;
            case R.id.text_zk:
                startActivity(com.example.administrator.biaozhunban.qualityControl.MainActivity.class);
                break;
        }
    }
}
