package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.xinshengertongfangshi;

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

public class XinShengErTongFangShiFrag extends BaseFrag {
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvBianhao)
    TextView tvBianhao;
    @BindView(R.id.tvXingbie)
    TextView tvXingbie;
    @BindView(R.id.tvShengri)
    TextView tvShengri;
    @BindView(R.id.etIdcard)
    EditText etIdcard;
    @BindView(R.id.etAddress)
    EditText etAddress;
    @BindView(R.id.etFuqin)
    EditText etFuqin;
    @BindView(R.id.etFuZhiye)
    EditText etFuZhiye;
    @BindView(R.id.etFuDianhua)
    EditText etFuDianhua;
    @BindView(R.id.tvFuRiqi)
    TextView tvFuRiqi;
    @BindView(R.id.etMuqin)
    EditText etMuqin;
    @BindView(R.id.etMuZhiye)
    EditText etMuZhiye;
    @BindView(R.id.etMuDianhua)
    EditText etMuDianhua;
    @BindView(R.id.tvMuRiqi)
    TextView tvMuRiqi;
    @BindView(R.id.etYunzhou)
    EditText etYunzhou;
    @BindView(R.id.tvMuHuanbing)
    TextView tvMuHuanbing;
    @BindView(R.id.etZhuchanjigou)
    EditText etZhuchanjigou;
    @BindView(R.id.tvChushengqingkuang)
    TextView tvChushengqingkuang;
    @BindView(R.id.tvZhixi)
    TextView tvZhixi;
    @BindView(R.id.tvApgarPingfen)
    TextView tvApgarPingfen;
    @BindView(R.id.switch_sfyqx)
    Switch switchSfyqx;
    @BindView(R.id.etJixing)
    EditText etJixing;
    @BindView(R.id.tvTingli)
    TextView tvTingli;
    @BindView(R.id.tvJibing)
    TextView tvJibing;
    @BindView(R.id.etChushengTizhong)
    EditText etChushengTizhong;
    @BindView(R.id.etXianTizhong)
    EditText etXianTizhong;
    @BindView(R.id.etChushengTichang)
    EditText etChushengTichang;
    @BindView(R.id.tvWeiyangFangshi)
    TextView tvWeiyangFangshi;
    @BindView(R.id.etChinailiang)
    EditText etChinailiang;
    @BindView(R.id.etChinaiCishv)
    EditText etChinaiCishv;
    @BindView(R.id.SwitchOutu)
    Switch SwitchOutu;
    @BindView(R.id.tvDabian)
    TextView tvDabian;
    @BindView(R.id.etDabianCishu)
    EditText etDabianCishu;
    @BindView(R.id.etTiwen)
    EditText etTiwen;
    @BindView(R.id.etMailv)
    EditText etMailv;
    @BindView(R.id.etHuxilv)
    EditText etHuxilv;
    @BindView(R.id.tvMianse)
    TextView tvMianse;
    @BindView(R.id.tvHuangdanBuwei)
    TextView tvHuangdanBuwei;
    @BindView(R.id.etQianluKuan)
    EditText etQianluKuan;
    @BindView(R.id.etQianluGao)
    EditText etQianluGao;
    @BindView(R.id.tvQianluQingkuang)
    TextView tvQianluQingkuang;
    @BindView(R.id.switchYanWaiguan)
    Switch switchYanWaiguan;
    @BindView(R.id.etYanWaiguan)
    EditText etYanWaiguan;
    @BindView(R.id.switchSizhi)
    Switch switchSizhi;
    @BindView(R.id.etSizhi)
    EditText etSizhi;
    @BindView(R.id.switchErWaiguan)
    Switch switchErWaiguan;
    @BindView(R.id.etErWaiguan)
    EditText etErWaiguan;
    @BindView(R.id.switchJingbu)
    Switch switchJingbu;
    @BindView(R.id.etJingbu)
    EditText etJingbu;
    @BindView(R.id.switchBizi)
    Switch switchBizi;
    @BindView(R.id.etBizi)
    EditText etBizi;
    @BindView(R.id.tvPifu)
    TextView tvPifu;
    @BindView(R.id.switchKouqiang)
    Switch switchKouqiang;
    @BindView(R.id.etKouqiang)
    EditText etKouqiang;
    @BindView(R.id.switchGangmen)
    Switch switchGangmen;
    @BindView(R.id.etGangmen)
    EditText etGangmen;
    @BindView(R.id.switchXinfei)
    Switch switchXinfei;
    @BindView(R.id.etXinfei)
    EditText etXinfei;
    @BindView(R.id.switchWaiShengzhi)
    Switch switchWaiShengzhi;
    @BindView(R.id.etWaiShengzhi)
    EditText etWaiShengzhi;
    @BindView(R.id.switchFubu)
    Switch switchFubu;
    @BindView(R.id.etFubu)
    EditText etFubu;
    @BindView(R.id.switchJizhu)
    Switch switchJizhu;
    @BindView(R.id.etJizhu)
    EditText etJizhu;
    @BindView(R.id.tvQidai)
    TextView tvQidai;
    @BindView(R.id.rgZhuanzhen)
    RadioGroup rgZhuanzhen;
    @BindView(R.id.etYuanyin)
    EditText etYuanyin;
    @BindView(R.id.etJigouKeshi)
    EditText etJigouKeshi;
    @BindView(R.id.tvZhidao)
    TextView tvZhidao;
    @BindView(R.id.tvDangqianRiqi)
    TextView tvDangqianRiqi;
    @BindView(R.id.etXiaciDidian)
    EditText etXiaciDidian;
    @BindView(R.id.tvXiaciRiqi)
    TextView tvXiaciRiqi;
    @BindView(R.id.etYisheng)
    EditText etYisheng;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_fragment_xinshenertongfangshi;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvXingbie, R.id.tvShengri, R.id.tvFuRiqi, R.id.tvMuRiqi, R.id.tvChushengqingkuang, R.id.tvZhixi, R.id.tvApgarPingfen, R.id.tvTingli, R.id.tvJibing, R.id.tvWeiyangFangshi, R.id.tvDabian, R.id.tvMianse, R.id.tvHuangdanBuwei, R.id.tvQianluQingkuang, R.id.tvPifu, R.id.tvQidai, R.id.tvZhidao, R.id.tvDangqianRiqi, R.id.tvXiaciRiqi, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvXingbie:
                break;
            case R.id.tvShengri:
                break;
            case R.id.tvFuRiqi:
                break;
            case R.id.tvMuRiqi:
                break;
            case R.id.tvChushengqingkuang:
                break;
            case R.id.tvZhixi:
                break;
            case R.id.tvApgarPingfen:
                break;
            case R.id.tvTingli:
                break;
            case R.id.tvJibing:
                break;
            case R.id.tvWeiyangFangshi:
                break;
            case R.id.tvDabian:
                break;
            case R.id.tvMianse:
                break;
            case R.id.tvHuangdanBuwei:
                break;
            case R.id.tvQianluQingkuang:
                break;
            case R.id.tvPifu:
                break;
            case R.id.tvQidai:
                break;
            case R.id.tvZhidao:
                break;
            case R.id.tvDangqianRiqi:
                break;
            case R.id.tvXiaciRiqi:
                break;
            case R.id.tvConfirm:

                break;
        }
    }
}
