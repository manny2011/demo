package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanqiansuifang01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseFrag;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/2/27.
 */

public class FuKeJianChaFrag extends BaseFrag {
    @BindView(R.id.rgWaiyinStatus)
    RadioGroup rgWaiyinStatus;
    @BindView(R.id.etWaiyin)
    EditText etWaiyin;
    @BindView(R.id.rgYindaoStatus)
    RadioGroup rgYindaoStatus;
    @BindView(R.id.etYindao)
    EditText etYindao;
    @BindView(R.id.rgGongjingStatus)
    RadioGroup rgGongjingStatus;
    @BindView(R.id.etGongjing)
    EditText etGongjing;
    @BindView(R.id.rgZigongStatus)
    RadioGroup rgZigongStatus;
    @BindView(R.id.etZiGong)
    EditText etZiGong;
    @BindView(R.id.rgFujianStatus)
    RadioGroup rgFujianStatus;
    @BindView(R.id.etFujian)
    EditText etFujian;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_fukejiancha;
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
