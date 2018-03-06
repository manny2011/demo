package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.jingshenbinghuanzhexinxi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public class JingshenbinghuanzheXinxiBuChongFrag extends BaseFrag {
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvBianhao)
    TextView tvBianhao;
    @BindView(R.id.etJianhuRenMing)
    EditText etJianhuRenMing;
    @BindView(R.id.etGuanxi)
    EditText etGuanxi;
    @BindView(R.id.etZhuzhi)
    EditText etZhuzhi;
    @BindView(R.id.etDianhua)
    EditText etDianhua;
    @BindView(R.id.etJuweihuiMing)
    EditText etJuweihuiMing;
    @BindView(R.id.etJuweihuiDianhua)
    EditText etJuweihuiDianhua;
    @BindView(R.id.tvZhiqing)
    TextView tvZhiqing;
    @BindView(R.id.etQianzi)
    EditText etQianzi;
    @BindView(R.id.tvQianziShijian)
    TextView tvQianziShijian;
    @BindView(R.id.tvChuciFabingShijian)
    TextView tvChuciFabingShijian;
    @BindView(R.id.tvZhuyaoZhengzhuang)
    TextView tvZhuyaoZhengzhuang;
    @BindView(R.id.tvNeiZhen)
    TextView tvMeiZhen;
    @BindView(R.id.tvShouciZhiliaoShijian)
    TextView tvShouciZhiliaoShijian;
    @BindView(R.id.etCengzhuYiyuan)
    EditText etCengzhuYiyuanCishu;
    @BindView(R.id.etZhenDuan)
    EditText etZhenDuan;
    @BindView(R.id.etQuezhenYiyuan)
    EditText etQuezhenYiyuan;
    @BindView(R.id.tvQuezhenRiqi)
    TextView tvQuezhenRiqi;
    @BindView(R.id.tvZhilaoXiaoguo)
    TextView tvZhilaoXiaoguo;
    @BindView(R.id.etZishi1)
    EditText etZishi1;
    @BindView(R.id.etZishi2)
    EditText etZishi2;
    @BindView(R.id.etZishi4)
    EditText etZishi4;
    @BindView(R.id.etZishi3)
    EditText etZishi3;
    @BindView(R.id.etZishi5)
    EditText etZishi5;
    @BindView(R.id.switcherYingxiang)
    Switch switcherYingxiang;
    @BindView(R.id.tvGuansuoQingkuang)
    TextView tvGuansuoQingkuang;
    @BindView(R.id.tvJingjiQingkuang)
    TextView tvJingjiQingkuang;
    @BindView(R.id.etYishengYijian)
    EditText etYishengYijian;
    @BindView(R.id.tvTianbiaoRiqi)
    TextView tvTianbiaoRiqi;
    @BindView(R.id.etYisheng)
    EditText etYisheng;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_fragment_jingshenbingxinxibuchong;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvChuciFabingShijian, R.id.tvZhuyaoZhengzhuang, R.id.tvNeiZhen, R.id.tvShouciZhiliaoShijian,
            R.id.tvQuezhenRiqi, R.id.tvZhilaoXiaoguo, R.id.tvGuansuoQingkuang,
            R.id.tvJingjiQingkuang, R.id.tvTianbiaoRiqi, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvChuciFabingShijian:
                break;
            case R.id.tvZhuyaoZhengzhuang:
                break;
            case R.id.tvNeiZhen:
                break;
            case R.id.tvShouciZhiliaoShijian:
                break;
            case R.id.tvQuezhenRiqi:
                break;
            case R.id.tvZhilaoXiaoguo:
                break;
            case R.id.tvGuansuoQingkuang:
                break;
            case R.id.tvJingjiQingkuang:
                break;
            case R.id.tvTianbiaoRiqi:
                break;
            case R.id.tvConfirm:
                break;
        }
    }
}
