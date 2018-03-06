package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.gaoxueya;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public class GaoxueyaFrag extends BaseFrag {
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvRiQi)
    TextView tvRiQi;
    @BindView(R.id.tvFangshi)
    TextView tvFangshi;
    @BindView(R.id.tvZhengzhuang)
    TextView tvZhengzhuang;
    @BindView(R.id.etGaoya)
    EditText etGaoya;
    @BindView(R.id.etDiya)
    EditText etDiya;
    @BindView(R.id.etMubiaoGaoya)
    EditText etMubiaoGaoya;
    @BindView(R.id.etMubiaoDiya)
    EditText etMubiaoDiya;
    @BindView(R.id.etShengao)
    EditText etShengao;
    @BindView(R.id.etTizhong)
    EditText etTizhong;
    @BindView(R.id.etMubiaoTizhong)
    EditText etMubiaoTizhong;
    @BindView(R.id.etBMI)
    EditText etBMI;
    @BindView(R.id.etMubiaoBMI)
    EditText etMubiaoBMI;
    @BindView(R.id.etXinlv)
    EditText etXinlv;
    @BindView(R.id.etMubiaoXinlv)
    EditText etMubiaoXinlv;
    @BindView(R.id.etQitaTizheng)
    EditText etQitaTizheng;
    @BindView(R.id.etRixishi)
    EditText etRixishi;
    @BindView(R.id.etMubiaoRixishi)
    EditText etMubiaoRixishi;
    @BindView(R.id.etRiyinjiu)
    EditText etRiyinjiu;
    @BindView(R.id.etMubiaoRiyinjiu)
    EditText etMubiaoRiyinjiu;
    @BindView(R.id.etYundongCishu)
    EditText etYundongCishu;
    @BindView(R.id.etYundongShichang)
    EditText etYundongShichang;
    @BindView(R.id.etMubiaoYundongCishu)
    EditText etMubiaoYundongCishu;
    @BindView(R.id.etMubiaoYundongShichang)
    EditText etMubiaoYundongShichang;
    @BindView(R.id.tvSheyanQingkuang)
    TextView tvSheyanQingkuang;
    @BindView(R.id.tvMubiaoSheyanQingkuang)
    TextView tvMubiaoSheyanQingkuang;
    @BindView(R.id.tvXilitiaozheng)
    TextView tvXilitiaozheng;
    @BindView(R.id.tvZunyiXingwei)
    TextView tvZunyiXingwei;
    @BindView(R.id.etFuzhuJiancha)
    EditText etFuzhuJiancha;
    @BindView(R.id.tvYicongxing)
    TextView tvYicongxing;
    @BindView(R.id.tvBuliangFanying)
    TextView tvBuliangFanying;
    @BindView(R.id.tvSuifangFenlei)
    TextView tvSuifangFenlei;
    @BindView(R.id.etYaoMing1)
    EditText etYaoMing1;
    @BindView(R.id.etMeiRi1)
    EditText etMeiRi1;
    @BindView(R.id.etMeici1)
    EditText etMeici1;
    @BindView(R.id.etMing2)
    EditText etMing2;
    @BindView(R.id.etMeiRi2)
    EditText etMeiRi2;
    @BindView(R.id.etMeici2)
    EditText etMeici2;
    @BindView(R.id.etYaoMing3)
    EditText etYaoMing3;
    @BindView(R.id.etMeiRi3)
    EditText etMeiRi3;
    @BindView(R.id.etMeici3)
    EditText etMeici3;
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
        return R.layout.public_health_fragment_gaoxueyasuifang;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }


    @OnClick({R.id.tvRiQi, R.id.tvFangshi, R.id.tvZhengzhuang, R.id.tvSheyanQingkuang, R.id.tvMubiaoSheyanQingkuang, R.id.tvXilitiaozheng, R.id.tvZunyiXingwei, R.id.tvYicongxing, R.id.tvBuliangFanying, R.id.tvSuifangFenlei, R.id.tvXiaciRiqi, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvRiQi:
                break;
            case R.id.tvFangshi:
                break;
            case R.id.tvZhengzhuang:
                break;
            case R.id.tvSheyanQingkuang:
                break;
            case R.id.tvMubiaoSheyanQingkuang:
                break;
            case R.id.tvXilitiaozheng:
                break;
            case R.id.tvZunyiXingwei:
                break;
            case R.id.tvYicongxing:
                break;
            case R.id.tvBuliangFanying:
                break;
            case R.id.tvSuifangFenlei:
                break;
            case R.id.tvXiaciRiqi:
                break;
            case R.id.tvConfirm:
                break;
        }
    }
}
