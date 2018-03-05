package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian;

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
 * Created by Administrator on 2018/2/26.
 *
 */

public class FuZhuJianChaFrag extends BaseFrag {//TODO 这个界面与最新的变化太大,最后再来改!!!
    @BindView(R.id.etXuehongdanbai)
    EditText etXuehongdanbai;
    @BindView(R.id.etBaixibao)
    EditText etBaixibao;
    @BindView(R.id.etXuexiaoban)
    EditText etXuexiaoban;
    @BindView(R.id.etQitaXue)
    EditText etQitaXue;
    @BindView(R.id.etNiaodanbai)
    EditText etNiaodanbai;
    @BindView(R.id.etNiaotongti)
    EditText etNiaotongti;
    @BindView(R.id.etNiaotang)
    EditText etNiaotang;
    @BindView(R.id.etNiaoqianxue)
    EditText etNiaoqianxue;
    @BindView(R.id.etQitaNiao)
    EditText etQitaNiao;
    @BindView(R.id.etXuexing)
    EditText etXuexing;
    @BindView(R.id.etRH)
    EditText etRH;
    @BindView(R.id.etXuetang)
    EditText etXuetang;
    @BindView(R.id.tvFeimiwu)
    TextView tvFeimiwu;
    @BindView(R.id.tvQingjiedu)
    TextView tvQingjiedu;
    @BindView(R.id.etGubing)
    EditText etGubing;
    @BindView(R.id.etGucao)
    EditText etGucao;
    @BindView(R.id.etXuedanbai)
    EditText etXuedanbai;
    @BindView(R.id.etJieheDanhongsu)
    EditText etJieheDanhongsu;
    @BindView(R.id.etJigan)
    EditText etJigan;
    @BindView(R.id.etNiaosudan)
    EditText etNiaosudan;
    @BindView(R.id.etXuejia)
    EditText etXuejia;
    @BindView(R.id.etXuena)
    EditText etXuena;
    @BindView(R.id.etBiaomiankangyuan)
    EditText etBiaomiankangyuan;
    @BindView(R.id.etBiaomiankangti)
    EditText etBiaomiankangti;
    @BindView(R.id.etEKangyuan)
    EditText etEKangyuan;
    @BindView(R.id.etEKangti)
    EditText etEKangti;
    @BindView(R.id.etHexinkangti)
    EditText etHexinkangti;
    @BindView(R.id.rgMeidu)
    RadioGroup rgMeidu;
    @BindView(R.id.rgHIV)
    RadioGroup rgHIV;
    @BindView(R.id.etBichao)
    EditText etBichao;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_fragment_fuzhujiancha;
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

    @OnClick({R.id.tvFeimiwu, R.id.tvQingjiedu, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvFeimiwu:
                break;
            case R.id.tvQingjiedu:
                break;
            case R.id.tvConfirm:
                break;
        }
    }
}
