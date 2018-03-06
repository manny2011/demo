package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanqiansuifang01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseFrag;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/2/27.
 */

public class ZongTiPingGuFrag extends BaseFrag {
    @BindView(R.id.switchPinggu)
    Switch switchPinggu;
    @BindView(R.id.etPinggu)
    EditText etPinggu;
    @BindView(R.id.tvZhidao)
    TextView tvZhidao;
    @BindView(R.id.rgZhuanzhen)
    RadioGroup rgZhuanzhen;
    @BindView(R.id.etZhuanzhenYuanyin)
    EditText etZhuanzhenYuanyin;
    @BindView(R.id.etJigouKeshi)
    EditText etJigouKeshi;
    @BindView(R.id.tvXiaciRiqi)
    TextView tvXiaciRiqi;
    @BindView(R.id.etYisheng)
    EditText etYisheng;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_zongtipinggu;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvZhidao, R.id.tvXiaciRiqi, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvZhidao:
                break;
            case R.id.tvXiaciRiqi:
                break;
            case R.id.tvConfirm:
                break;
        }
    }
}
