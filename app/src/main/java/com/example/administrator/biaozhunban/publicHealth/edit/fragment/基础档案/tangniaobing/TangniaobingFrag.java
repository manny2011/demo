package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.tangniaobing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
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

public class TangniaobingFrag extends BaseFrag {
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvBianhao)
    TextView tvBianhao;
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
    @BindView(R.id.etShenggao)
    EditText etShenggao;
    @BindView(R.id.etTizhong)
    EditText etTizhong;
    @BindView(R.id.etMubiaoTizhong)
    EditText etMubiaoTizhong;
    @BindView(R.id.etBMI)
    EditText etBMI;
    @BindView(R.id.etMubiaoBMI)
    EditText etMubiaoBMI;
    @BindView(R.id.rgZubei)
    RadioGroup rgZubei;
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
    @BindView(R.id.etZhushi)
    EditText etZhushi;
    @BindView(R.id.etMubiaoZhushi)
    EditText etMubiaoZhushi;
    @BindView(R.id.tvXinliTiaozheng)
    TextView tvXinliTiaozheng;
    @BindView(R.id.tvZunyiXingwei)
    TextView tvZunyiXingwei;
    @BindView(R.id.etKongfuXuetang)
    EditText etKongfuXuetang;
    @BindView(R.id.etTanghuaXuehongdanbai)
    EditText etTanghuaXuehongdanbai;
    @BindView(R.id.tvJianchaRiqi)
    TextView tvJianchaRiqi;
    @BindView(R.id.etQitaJiancha1)
    EditText etQitaJiancha1;
    @BindView(R.id.etQitaJiancha2)
    EditText etQitaJiancha2;
    @BindView(R.id.etQitaJiancha3)
    EditText etQitaJiancha3;
    @BindView(R.id.tvYicongxing)
    TextView tvYicongxing;
    @BindView(R.id.rgBuliangFanying)
    RadioGroup rgBuliangFanying;
    @BindView(R.id.etBuliangFanying)
    EditText etBuliangFanying;
    @BindView(R.id.tvDixuetang)
    TextView tvDixuetang;
    @BindView(R.id.tvSuifangFenlei)
    TextView tvSuifangFenlei;
    @BindView(R.id.etYaoMing1)
    EditText etYaoMing1;
    @BindView(R.id.etMeiRi1)
    EditText etMeiRi1;
    @BindView(R.id.etMeici1)
    EditText etMeici1;
    @BindView(R.id.etYaoMing2)
    EditText etYaoMing2;
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
    @BindView(R.id.etYidaosuZhonglei)
    EditText etYidaosuZhonglei;
    @BindView(R.id.etMeiRi4)
    EditText etMeiRi4;
    @BindView(R.id.etMeici4)
    EditText etMeici4;
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
        return R.layout.public_health_fragment_tangniaobingsuifang;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvRiQi, R.id.tvFangshi, R.id.tvZhengzhuang, R.id.tvXinliTiaozheng, R.id.tvZunyiXingwei, R.id.tvJianchaRiqi, R.id.tvYicongxing, R.id.tvDixuetang, R.id.tvSuifangFenlei, R.id.tvXiaciRiqi, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvRiQi:
                break;
            case R.id.tvFangshi:
                break;
            case R.id.tvZhengzhuang:
                break;
            case R.id.tvXinliTiaozheng:
                break;
            case R.id.tvZunyiXingwei:
                break;
            case R.id.tvJianchaRiqi:
                break;
            case R.id.tvYicongxing:
                break;
            case R.id.tvDixuetang:
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
