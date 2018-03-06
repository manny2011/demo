package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.YiSuiErTong;

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
 * Created by Administrator on 2018/2/26.
 */

public class YiSuiErTongFangShiFrag extends BaseFrag {
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvBianhao)
    TextView tvBianhao;
    @BindView(R.id.tvYueling)
    TextView tvYueling;
    @BindView(R.id.tvSuifangRiqi)
    TextView tvSuifangRiqi;
    @BindView(R.id.etTizhong)
    EditText etTizhong;
    @BindView(R.id.tvTizhongFayu)
    TextView tvTizhongFayu;
    @BindView(R.id.etShenChang)
    EditText etShenChang;
    @BindView(R.id.tvTichangFayu)
    TextView tvTichangFayu;
    @BindView(R.id.etTouwei)
    EditText etTouwei;
    @BindView(R.id.tvMianse)
    TextView tvMianse;
    @BindView(R.id.switchPifu)
    Switch switchPifu;
    @BindView(R.id.switchQianlu)
    Switch switchQianlu;
    @BindView(R.id.etQianluKuan)
    EditText etQianluKuan;
    @BindView(R.id.etQianluGao)
    EditText etQianluGao;
    @BindView(R.id.switchJingbu)
    Switch switchJingbu;
    @BindView(R.id.switchYanWaiguan)
    Switch switchYanWaiguan;
    @BindView(R.id.switchErWaiguan)
    Switch switchErWaiguan;
    @BindView(R.id.switchTingli)
    Switch switchTingli;
    @BindView(R.id.tvKouqiang)
    TextView tvKouqiang;
    @BindView(R.id.switchXinfei)
    Switch switchXinfei;
    @BindView(R.id.switchFubu)
    Switch switchFubu;
    @BindView(R.id.tvQibu)
    TextView tvQibu;
    @BindView(R.id.switchSizhi)
    Switch switchSizhi;
    @BindView(R.id.tvGoulouZhengzhuang)
    TextView tvGoulouZhengzhuang;
    @BindView(R.id.tvGoulouTizheng)
    TextView tvGoulouTizheng;
    @BindView(R.id.switchShengzhi)
    Switch switchShengzhi;
    @BindView(R.id.etXuehongdanbai)
    EditText etXuehongdanbai;
    @BindView(R.id.etHuwai)
    EditText etHuwai;
    @BindView(R.id.etWeishengsu)
    EditText etWeishengsu;
    @BindView(R.id.switchFayu)
    Switch switchFayu;
    @BindView(R.id.switchQiJianHuanBing)
    Switch switchQiJianHuanBing;
    @BindView(R.id.etQita)
    EditText etQita;
    @BindView(R.id.rgZhuanzhen)
    RadioGroup rgZhuanzhen;
    @BindView(R.id.etZhuanzhenYuanyin)
    EditText etZhuanzhenYuanyin;
    @BindView(R.id.etJigouKeshi)
    EditText etJigouKeshi;
    @BindView(R.id.tvZhidao)
    TextView tvZhidao;
    @BindView(R.id.tvXiaciRiqi)
    TextView tvXiaciRiqi;
    @BindView(R.id.etYisheng)
    EditText etYisheng;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_fragment_yisuiertongfangshi;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvYueling, R.id.tvSuifangRiqi, R.id.tvTichangFayu, R.id.tvMianse, R.id.tvKouqiang, R.id.tvQibu, R.id.tvGoulouZhengzhuang, R.id.tvGoulouTizheng, R.id.tvZhidao, R.id.tvXiaciRiqi, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvYueling:

                break;
            case R.id.tvSuifangRiqi:

                break;
            case R.id.tvTichangFayu:

                break;
            case R.id.tvMianse:

                break;
            case R.id.tvKouqiang:

                break;
            case R.id.tvQibu:

                break;
            case R.id.tvGoulouZhengzhuang:

                break;
            case R.id.tvGoulouTizheng:
                break;
            case R.id.tvZhidao:
                break;
            case R.id.tvXiaciRiqi:
                break;
            case R.id.tvConfirm:
                break;
        }
    }
}
