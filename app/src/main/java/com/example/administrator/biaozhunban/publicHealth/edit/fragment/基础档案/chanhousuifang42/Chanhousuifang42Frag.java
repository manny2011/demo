package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanhousuifang42;

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

public class Chanhousuifang42Frag extends BaseFrag {
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvBianhao)
    TextView tvBianhao;
    @BindView(R.id.tvRiQi)
    TextView tvRiQi;
    @BindView(R.id.etYibanJiankang)
    EditText etYibanJiankang;
    @BindView(R.id.etYibanXinli)
    EditText etYibanXinli;
    @BindView(R.id.etXueyaLeft1)
    EditText etXueyaLeft1;
    @BindView(R.id.etXueyaRight)
    EditText etXueyaRight;
    @BindView(R.id.switch_rf)
    Switch switchRf;
    @BindView(R.id.etRufang)
    EditText etRufang;
    @BindView(R.id.switchELou)
    Switch switchELou;
    @BindView(R.id.etELou)
    EditText etELou;
    @BindView(R.id.switchZiGong)
    Switch switchZiGong;
    @BindView(R.id.etZiGong)
    EditText etZiGong;
    @BindView(R.id.switchShangkou)
    Switch switchShangkou;
    @BindView(R.id.etShangkou)
    EditText etShangkou;
    @BindView(R.id.etQita)
    EditText etQita;
    @BindView(R.id.switchFenlei)
    Switch switchFenlei;
    @BindView(R.id.etFenlei)
    EditText etFenlei;
    @BindView(R.id.tvZhidao)
    TextView tvZhidao;
    @BindView(R.id.switchChuli)
    Switch switchChuli;
    @BindView(R.id.etYuanyin)
    EditText etYuanyin;
    @BindView(R.id.etJigouKeshi)
    EditText etJigouKeshi;
    @BindView(R.id.etYisheng)
    EditText etYisheng;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_fragment_chanhousuifang42;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvRiQi, R.id.tvZhidao, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvRiQi:
                break;
            case R.id.tvZhidao:
                break;
            case R.id.tvConfirm:
                break;
        }
    }
}
