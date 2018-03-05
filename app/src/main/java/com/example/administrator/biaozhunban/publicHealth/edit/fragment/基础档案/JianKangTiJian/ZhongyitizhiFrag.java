package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseFrag;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/2/26.
 */

public class ZhongyitizhiFrag extends BaseFrag {
    @BindView(R.id.rgPHZ)
    RadioGroup rgPHZ;
    @BindView(R.id.rgQXZ)
    RadioGroup rgQXZ;
    @BindView(R.id.rgYXZ)
    RadioGroup rgYXZ;
    @BindView(R.id.rgYinXZ)
    RadioGroup rgYinXZ;
    @BindView(R.id.rgTSZ)
    RadioGroup rgTSZ;
    @BindView(R.id.rgSRZ)
    RadioGroup rgSRZ;
    @BindView(R.id.rgXYZ)
    RadioGroup rgXYZ;
    @BindView(R.id.rgQYZ)
    RadioGroup rgQYZ;
    @BindView(R.id.rgTBZ)
    RadioGroup rgTBZ;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_zhongyitizhi;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.tvConfirm)
    public void onViewClicked() {
    }
}
