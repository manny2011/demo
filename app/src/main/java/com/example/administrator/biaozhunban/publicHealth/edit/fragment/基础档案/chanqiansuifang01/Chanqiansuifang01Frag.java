package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanqiansuifang01;

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

public class Chanqiansuifang01Frag extends BaseFrag {
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvBianhao)
    TextView tvBianhao;
    @BindView(R.id.tvRiQi)
    TextView tvRiQi;
    @BindView(R.id.etYunzhou)
    EditText etYunzhou;
    @BindView(R.id.etYunfuNianling)
    EditText etYunfuNianling;
    @BindView(R.id.etZhangfuName)
    EditText etZhangfuName;
    @BindView(R.id.etZhangfuNianling)
    EditText etZhangfuNianling;
    @BindView(R.id.etZhangfuPhone)
    EditText etZhangfuPhone;
    @BindView(R.id.etYunci)
    EditText etYunci;
    @BindView(R.id.etZhengchangCishu)
    EditText etZhengchangCishu;
    @BindView(R.id.etPaogongCishu)
    EditText etPaogongCishu;
    @BindView(R.id.tvMociYuejingRiqi)
    TextView tvMociYuejingRiqi;
    @BindView(R.id.tvYuchanQi)
    TextView tvYuchanQi;
    @BindView(R.id.tvJiwangShi)
    TextView tvJiwangShi;
    @BindView(R.id.tvJiazushi)
    TextView tvJiazushi;
    @BindView(R.id.tvGerenshi)
    TextView tvGerenshi;
    @BindView(R.id.rgFukeShoushushi)
    RadioGroup rgFukeShoushushi;
    @BindView(R.id.editText_fksss)
    EditText editTextFksss;
    @BindView(R.id.etLiuchan)
    EditText etLiuchan;
    @BindView(R.id.etSitai)
    EditText etSitai;
    @BindView(R.id.etShunchan)
    EditText etShunchan;
    @BindView(R.id.etXinshengerSiwang)
    EditText etXinshengerSiwang;
    @BindView(R.id.etQuexian)
    EditText etQuexian;
    @BindView(R.id.etShenggao)
    EditText etShenggao;
    @BindView(R.id.etTizhong)
    EditText etTizhong;
    @BindView(R.id.etBMI)
    EditText etBMI;
    @BindView(R.id.etXueyaLeft1)
    EditText etXueyaLeft1;
    @BindView(R.id.etXueyaRight)
    EditText etXueyaRight;
    @BindView(R.id.rgXinzangYichang)
    RadioGroup rgXinzangYichang;
    @BindView(R.id.etXinzangYichang)
    EditText etXinzangYichang;
    @BindView(R.id.rgFeibu)
    RadioGroup rgFeibu;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_chanqiansuifang01;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvRiQi, R.id.tvMociYuejingRiqi, R.id.tvYuchanQi, R.id.tvJiwangShi, R.id.tvJiazushi, R.id.tvGerenshi, R.id.text_confrim})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvRiQi:
                break;
            case R.id.tvMociYuejingRiqi:
                break;
            case R.id.tvYuchanQi:
                break;
            case R.id.tvJiwangShi:
                break;
            case R.id.tvJiazushi:
                break;
            case R.id.tvGerenshi:
                break;
            case R.id.text_confrim:
                break;
        }
    }
}
