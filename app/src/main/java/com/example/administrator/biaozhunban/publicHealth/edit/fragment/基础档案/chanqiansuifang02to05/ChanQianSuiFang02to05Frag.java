package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanqiansuifang02to05;

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

public class ChanQianSuiFang02to05Frag extends BaseFrag {
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvBianhao)
    TextView tvBianhao;
    @BindView(R.id.tvXiangmu)
    TextView tvXiangmu;
    @BindView(R.id.tvRiQi)
    TextView tvRiQi;
    @BindView(R.id.etYunzhou)
    EditText etYunzhou;
    @BindView(R.id.etZhusu)
    EditText etZhusu;
    @BindView(R.id.etTizhong)
    EditText etTizhong;
    @BindView(R.id.etGongdiGaodu)
    EditText etGongdiGaodu;
    @BindView(R.id.etFuwei)
    EditText etFuwei;
    @BindView(R.id.etTaiwei)
    EditText etTaiwei;
    @BindView(R.id.etTaixinlv)
    EditText etTaixinlv;
    @BindView(R.id.etXueyaLeft1)
    EditText etXueyaLeft1;
    @BindView(R.id.etXueyaRight)
    EditText etXueyaRight;
    @BindView(R.id.etXuehongdanbai)
    EditText etXuehongdanbai;
    @BindView(R.id.etNiaodanbai)
    EditText etNiaodanbai;
    @BindView(R.id.etQita)
    EditText etQita;
    @BindView(R.id.switchFenlei)
    Switch switchFenlei;
    @BindView(R.id.etFenlei)
    EditText etFenlei;
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
        return R.layout.public_health_fragment_chanqiansuifang02to05;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvRiQi, R.id.tvXiaciRiqi, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvRiQi:
                break;
            case R.id.tvXiaciRiqi:
                break;
            case R.id.tvConfirm:
                break;
        }
    }
}
