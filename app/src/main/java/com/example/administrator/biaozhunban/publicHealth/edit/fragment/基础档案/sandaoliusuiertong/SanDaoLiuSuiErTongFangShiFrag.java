package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.sandaoliusuiertong;

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

public class SanDaoLiuSuiErTongFangShiFrag extends BaseFrag {
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvBianhao)
    TextView tvBianhao;
    @BindView(R.id.tvYueling)
    TextView tvYueling;
    @BindView(R.id.tvRiQi)
    TextView tvRiQi;
    @BindView(R.id.etTizhong)
    EditText etTizhong;
    @BindView(R.id.tvTizhongFayu)
    TextView tvTizhongFayu;
    @BindView(R.id.etTichang)
    EditText etTichang;
    @BindView(R.id.tvTichangFayu)
    TextView tvTichangFayu;
    @BindView(R.id.tvFayuPingjia)
    TextView tvFayuPingjia;
    @BindView(R.id.etShili)
    EditText etShili;
    @BindView(R.id.switchTingli)
    Switch switchTingli;
    @BindView(R.id.etChuyashu)
    EditText etChuyashu;
    @BindView(R.id.etQuchishu)
    EditText etQuchishu;
    @BindView(R.id.switchXinfei)
    Switch switchXinfei;
    @BindView(R.id.switchFubu)
    Switch switchFubu;
    @BindView(R.id.etXuehongdanbai)
    EditText etXuehongdanbai;
    @BindView(R.id.etQita)
    EditText etQita;
    @BindView(R.id.etFeiyan)
    EditText etFeiyan;
    @BindView(R.id.etFuxie)
    EditText etFuxie;
    @BindView(R.id.etWaishang)
    EditText etWaishang;
    @BindView(R.id.etHuanBingQita)
    EditText etHuanBingQita;
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
        return R.layout.public_health_fragment_sandaoliusuiertongfangshi;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.tvYueling, R.id.tvRiQi, R.id.tvTizhongFayu, R.id.tvTichangFayu, R.id.tvFayuPingjia, R.id.tvZhidao, R.id.tvXiaciRiqi, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvYueling:
                break;
            case R.id.tvRiQi:
                break;
            case R.id.tvTizhongFayu:
                break;
            case R.id.tvTichangFayu:
                break;
            case R.id.tvFayuPingjia:
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
