package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.YuFangJieZhong;

import android.os.Bundle;
import android.support.annotation.NonNull;
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
 * Created by Administrator on 2018/2/26.
 */

public class YiMiaoJiCiFrag extends BaseFrag {
    @BindView(R.id.tvYiganRiqi1)
    TextView tvYiganRiqi1;
    @BindView(R.id.etYiganBuwei1)
    EditText etYiganBuwei1;
    @BindView(R.id.etYiganPihao1)
    EditText etYiganPihao1;
    @BindView(R.id.etYiganYisheng1)
    EditText etYiganYisheng1;
    @BindView(R.id.etYiganBeizhu1)
    EditText etYiganBeizhu1;
    @BindView(R.id.tvYiganRiqi2)
    TextView tvYiganRiqi2;
    @BindView(R.id.etYiganBuwei2)
    EditText etYiganBuwei2;
    @BindView(R.id.etYiganPihao2)
    EditText etYiganPihao2;
    @BindView(R.id.etYiganYisheng2)
    EditText etYiganYisheng2;
    @BindView(R.id.etYiganBeizhu2)
    EditText etYiganBeizhu2;
    @BindView(R.id.tvYiganRiqi3)
    TextView tvYiganRiqi3;
    @BindView(R.id.etYiganBuwei3)
    EditText etYiganBuwei3;
    @BindView(R.id.etYiganPihao3)
    EditText etYiganPihao3;
    @BindView(R.id.etYiganYisheng3)
    EditText etYiganYisheng3;
    @BindView(R.id.etYiganBeizhu3)
    EditText etYiganBeizhu3;
    @BindView(R.id.tvKajieRiqi1)
    TextView tvKajieRiqi1;
    @BindView(R.id.tvKajieBuwei1)
    EditText tvKajieBuwei1;
    @BindView(R.id.tvKajiePihao1)
    EditText tvKajiePihao1;
    @BindView(R.id.tvKajieYisheng1)
    EditText tvKajieYisheng1;
    @BindView(R.id.tvKajieBeizhu1)
    EditText tvKajieBeizhu1;
    @BindView(R.id.tvJihuiRiqi1)
    TextView tvJihuiRiqi1;
    @BindView(R.id.etJihuiBuwei1)
    EditText etJihuiBuwei1;
    @BindView(R.id.etJihuiPihao1)
    EditText etJihuiPihao1;
    @BindView(R.id.etJihuiYisheng1)
    EditText etJihuiYisheng1;
    @BindView(R.id.etJihuiBeizhu1)
    EditText etJihuiBeizhu1;
    @BindView(R.id.tvJihuiRiqi2)
    TextView tvJihuiRiqi2;
    @BindView(R.id.etJihuiBuwei2)
    EditText etJihuiBuwei2;
    @BindView(R.id.etJihuiPihao2)
    EditText etJihuiPihao2;
    @BindView(R.id.etJihuiYisheng2)
    EditText etJihuiYisheng2;
    @BindView(R.id.etJihuiBeizhu2)
    EditText etJihuiBeizhu2;
    @BindView(R.id.tvJihuiRiqi3)
    TextView tvJihuiRiqi3;
    @BindView(R.id.etJihuiBuwei3)
    EditText etJihuiBuwei3;
    @BindView(R.id.etJihuiPihao3)
    EditText etJihuiPihao3;
    @BindView(R.id.etJihuiYisheng3)
    EditText etJihuiYisheng3;
    @BindView(R.id.etJihuiBeizhu3)
    EditText etJihuiBeizhu3;
    @BindView(R.id.tvJihuiRiqi4)
    TextView tvJihuiRiqi4;
    @BindView(R.id.etJihuiBuwei4)
    EditText etJihuiBuwei4;
    @BindView(R.id.etJihuiPihao4)
    EditText etJihuiPihao4;
    @BindView(R.id.etJihuiYisheng4)
    EditText etJihuiYisheng4;
    @BindView(R.id.etJihuiBeizhu4)
    EditText etJihuiBeizhu4;
    @BindView(R.id.tvBaibaipoRiqi1)
    TextView tvBaibaipoRiqi1;
    @BindView(R.id.etBaibaipoBuwei1)
    EditText etBaibaipoBuwei1;
    @BindView(R.id.etBaibaipoPihao1)
    EditText etBaibaipoPihao1;
    @BindView(R.id.etBaibaipoYisheng1)
    EditText etBaibaipoYisheng1;
    @BindView(R.id.etBaibaipoBeizhu1)
    EditText etBaibaipoBeizhu1;
    @BindView(R.id.tvBaibaipoRiqi2)
    TextView tvBaibaipoRiqi2;
    @BindView(R.id.etBaibaipoBuwei2)
    EditText etBaibaipoBuwei2;
    @BindView(R.id.etBaibaipoYisheng2)
    EditText etBaibaipoYisheng2;
    @BindView(R.id.editText_bbpym2bz)
    EditText editTextBbpym2bz;
    @BindView(R.id.tvBaibaipoRiqi3)
    TextView tvBaibaipoRiqi3;
    @BindView(R.id.etBaibaipoBuwei3)
    EditText etBaibaipoBuwei3;
    @BindView(R.id.etBaibaipoYisheng3)
    EditText etBaibaipoYisheng3;
    @BindView(R.id.tvBaibaipoRiqi4)
    TextView tvBaibaipoRiqi4;
    @BindView(R.id.etBaibaipoBuwei4)
    EditText etBaibaipoBuwei4;
    @BindView(R.id.etBaibaipoYisheng4)
    EditText etBaibaipoYisheng4;
    @BindView(R.id.tvBaipoRq1)
    TextView tvBaipoRq1;
    @BindView(R.id.tvBaipoBuwei1)
    EditText tvBaipoBuwei1;
    @BindView(R.id.tvBaipoPihao1)
    EditText tvBaipoPihao1;
    @BindView(R.id.tvBaipoYisheng1)
    EditText tvBaipoYisheng1;
    @BindView(R.id.etBaipoBeizhu1)
    EditText etBaipoBeizhu1;
    @BindView(R.id.tvMafenRq1)
    TextView tvMafenRq1;
    @BindView(R.id.etMafengBuwei1)
    EditText etMafengBuwei1;
    @BindView(R.id.etMafengPihao1)
    EditText etMafengPihao1;
    @BindView(R.id.etMafengYisheng1)
    EditText etMafengYisheng1;
    @BindView(R.id.etMafengBeizhu1)
    EditText etMafengBeizhu1;
    @BindView(R.id.tvMasaifengRiqi1)
    TextView tvMasaifengRiqi1;
    @BindView(R.id.etMasaifengBuwei1)
    EditText etMasaifengBuwei1;
    @BindView(R.id.etMasaifengPihao1)
    EditText etMasaifengPihao1;
    @BindView(R.id.etMasaifengYisheng1)
    EditText etMasaifengYisheng1;
    @BindView(R.id.etMasaifengBeizhu1)
    EditText etMasaifengBeizhu1;
    @BindView(R.id.tvMasaifengRiqi2)
    TextView tvMasaifengRiqi2;
    @BindView(R.id.etMasaifengBuwei2)
    EditText etMasaifengBuwei2;
    @BindView(R.id.etMafengPihao2)
    EditText etMafengPihao2;
    @BindView(R.id.etMasaifengYisheng2)
    EditText etMasaifengYisheng2;
    @BindView(R.id.etMasaifengBeizhu2)
    EditText etMasaifengBeizhu2;
    @BindView(R.id.etMasaiBuwei1)
    EditText etMasaiBuwei1;
    @BindView(R.id.etMasaiPihao1)
    EditText etMasaiPihao1;
    @BindView(R.id.etMasaiYisheng1)
    EditText etMasaiYisheng1;
    @BindView(R.id.etMasaiBeizhu1)
    EditText etMasaiBeizhu1;
    @BindView(R.id.tvMazhenRiqi1)
    TextView tvMazhenRiqi1;
    @BindView(R.id.etMazhenBuwei1)
    EditText etMazhenBuwei1;
    @BindView(R.id.etMazhenPihao1)
    EditText etMazhenPihao1;
    @BindView(R.id.etMazhenYisheng1)
    EditText etMazhenYisheng1;
    @BindView(R.id.etMazhenBeizhu1)
    EditText etMazhenBeizhu1;
    @BindView(R.id.tvMazhenRiqi2)
    TextView tvMazhenRiqi2;
    @BindView(R.id.etMazhenBuwei2)
    EditText etMazhenBuwei2;
    @BindView(R.id.etMazhenPihao2)
    EditText etMazhenPihao2;
    @BindView(R.id.etMazhenYisheng2)
    EditText etMazhenYisheng2;
    @BindView(R.id.etMazhenBeizhu2)
    EditText etMazhenBeizhu2;
    @BindView(R.id.tvANaoliuRiqi1)
    TextView tvANaoliuRiqi1;
    @BindView(R.id.etANaoliuBuwei1)
    EditText etANaoliuBuwei1;
    @BindView(R.id.etANaoliuPihao1)
    EditText etANaoliuPihao1;
    @BindView(R.id.etANaoliuYisheng1)
    EditText etANaoliuYisheng1;
    @BindView(R.id.etANaoliuBeizhu1)
    EditText etANaoliuBeizhu1;
    @BindView(R.id.tvANaoliuRiqi2)
    TextView tvANaoliuRiqi2;
    @BindView(R.id.etANaoliuBuwei2)
    EditText etANaoliuBuwei2;
    @BindView(R.id.etANaoliuPihao2)
    EditText etANaoliuPihao2;
    @BindView(R.id.etANaoliuYisheng2)
    EditText etANaoliuYisheng2;
    @BindView(R.id.etANaoliuBeizhu2)
    EditText etANaoliuBeizhu2;
    @BindView(R.id.tvQunliuRiqi1)
    TextView tvQunliuRiqi1;
    @BindView(R.id.etQunliuBuwei1)
    EditText etQunliuBuwei1;
    @BindView(R.id.etQunliuPihao1)
    EditText etQunliuPihao1;
    @BindView(R.id.etQunliuYisheng1)
    EditText etQunliuYisheng1;
    @BindView(R.id.etQunliuBeizhu1)
    EditText etQunliuBeizhu1;
    @BindView(R.id.tvQunliuRiqi2)
    TextView tvQunliuRiqi2;
    @BindView(R.id.etQunliuBuwei2)
    EditText etQunliuBuwei2;
    @BindView(R.id.etQunliuPihao2)
    EditText etQunliuPihao2;
    @BindView(R.id.etQunliuYisheng2)
    EditText etQunliuYisheng2;
    @BindView(R.id.etQunliuBeizhu2)
    EditText etQunliuBeizhu2;
    @BindView(R.id.tvYinaoRiqi1)
    TextView tvYinaoRiqi1;
    @BindView(R.id.etYinaoBuwei1)
    EditText etYinaoBuwei1;
    @BindView(R.id.etYinaoPihao1)
    EditText etYinaoPihao1;
    @BindView(R.id.etYinaoYisheng1)
    EditText etYinaoYisheng1;
    @BindView(R.id.etYinaoBeizhu1)
    EditText etYinaoBeizhu1;
    @BindView(R.id.tvYinaoRiqi2)
    TextView tvYinaoRiqi2;
    @BindView(R.id.etYinaoBuwei2)
    EditText etYinaoBuwei2;
    @BindView(R.id.etYinaoPihao2)
    EditText etYinaoPihao2;
    @BindView(R.id.etYinaoYisheng2)
    EditText etYinaoYisheng2;
    @BindView(R.id.etYinaoBeizhu2)
    EditText etYinaoBeizhu2;
    @BindView(R.id.tvYinaomiehuoRiqi1)
    TextView tvYinaomiehuoRiqi1;
    @BindView(R.id.etYinaomiehuoBuwei1)
    EditText etYinaomiehuoBuwei1;
    @BindView(R.id.etYinaomiehuoPihao1)
    EditText etYinaomiehuoPihao1;
    @BindView(R.id.etYinaomiehuoYisheng1)
    EditText etYinaomiehuoYisheng1;
    @BindView(R.id.etYinaomiehuoBeizhu1)
    EditText etYinaomiehuoBeizhu1;
    @BindView(R.id.tvYinaomiehuoRiqi2)
    TextView tvYinaomiehuoRiqi2;
    @BindView(R.id.etYinaomiehuoBuwei2)
    EditText etYinaomiehuoBuwei2;
    @BindView(R.id.etYinaomiehuoPihao2)
    EditText etYinaomiehuoPihao2;
    @BindView(R.id.etYinaomiehuoYisheng2)
    EditText etYinaomiehuoYisheng2;
    @BindView(R.id.etYinaomiehuoBeizhu2)
    EditText etYinaomiehuoBeizhu2;
    @BindView(R.id.tvYinaomiehuoRiqi3)
    TextView tvYinaomiehuoRiqi3;
    @BindView(R.id.etYinaomiehuoBuwei3)
    EditText etYinaomiehuoBuwei3;
    @BindView(R.id.etYinaomiehuoPihao3)
    EditText etYinaomiehuoPihao3;
    @BindView(R.id.etYinaomiehuoYisheng3)
    EditText etYinaomiehuoYisheng3;
    @BindView(R.id.etYinaomiehuoBeizhu3)
    EditText etYinaomiehuoBeizhu3;
    @BindView(R.id.tvYinaomiehuoRiqi4)
    TextView tvYinaomiehuoRiqi4;
    @BindView(R.id.etYinaomiehuoBuwei4)
    EditText etYinaomiehuoBuwei4;
    @BindView(R.id.etYinaomiehuoPihao4)
    EditText etYinaomiehuoPihao4;
    @BindView(R.id.etYinaomiehuoYisheng4)
    EditText etYinaomiehuoYisheng4;
    @BindView(R.id.etYinaomiehuoBeizhu4)
    EditText etYinaomiehuoBeizhu4;
    @BindView(R.id.tvJiaganjianduRiqi1)
    TextView tvJiaganjianduRiqi1;
    @BindView(R.id.etJiaganjianduBuwei1)
    EditText etJiaganjianduBuwei1;
    @BindView(R.id.etJiaganjianduPihao1)
    EditText etJiaganjianduPihao1;
    @BindView(R.id.etJiaganjianduYisheng1)
    EditText etJiaganjianduYisheng1;
    @BindView(R.id.etJiaganjianduBeizhu1)
    EditText etJiaganjianduBeizhu1;
    @BindView(R.id.tvJiaganmiehuoRiqi1)
    TextView tvJiaganmiehuoRiqi1;
    @BindView(R.id.etJiaganmiehuoBuwei1)
    EditText etJiaganmiehuoBuwei1;
    @BindView(R.id.etJiaganmiehuoPihao1)
    EditText etJiaganmiehuoPihao1;
    @BindView(R.id.etJiaganmiehuoYisheng1)
    EditText etJiaganmiehuoYisheng1;
    @BindView(R.id.etJiaganmiehuoBeizhu1)
    EditText etJiaganmiehuoBeizhu1;
    @BindView(R.id.tvJiaganmiehuoRiqi2)
    TextView tvJiaganmiehuoRiqi2;
    @BindView(R.id.etJiaganmiehuoBuwei2)
    EditText etJiaganmiehuoBuwei2;
    @BindView(R.id.etJiaganmiehuoPihao2)
    EditText etJiaganmiehuoPihao2;
    @BindView(R.id.etJiaganmiehuoYisheng2)
    EditText etJiaganmiehuoYisheng2;
    @BindView(R.id.etJiaganmiehuoBeizhu2)
    EditText etJiaganmiehuoBeizhu2;
    @BindView(R.id.etQitaMingcheng1)
    EditText etQitaMingcheng1;
    @BindView(R.id.tvQita1Riqi)
    TextView tvQita1Riqi;
    @BindView(R.id.etQita1Buwei)
    EditText etQita1Buwei;
    @BindView(R.id.etQita1Pihao)
    EditText etQita1Pihao;
    @BindView(R.id.etQita1Yisheng)
    EditText etQita1Yisheng;
    @BindView(R.id.etQita1Beizhu)
    EditText etQita1Beizhu;
    @BindView(R.id.etQita2Mingcheng)
    EditText etQita2Mingcheng;
    @BindView(R.id.tvQita2Riqi)
    TextView tvQita2Riqi;
    @BindView(R.id.etQita2Buwei)
    EditText etQita2Buwei;
    @BindView(R.id.etQita2Pihao)
    EditText etQita2Pihao;
    @BindView(R.id.etQita2Yisheng)
    EditText etQita2Yisheng;
    @BindView(R.id.etQita2Beizhu)
    EditText etQita2Beizhu;
    @BindView(R.id.etQita3Mingcheng)
    EditText etQita3Mingcheng;
    @BindView(R.id.tvQita3Riqi)
    TextView tvQita3Riqi;
    @BindView(R.id.etQita3Buwei)
    EditText etQita3Buwei;
    @BindView(R.id.etQita3Pihao)
    EditText etQita3Pihao;
    @BindView(R.id.etQita3Yisheng)
    EditText etQita3Yisheng;
    @BindView(R.id.etQita3Beizhu)
    EditText etQita3Beizhu;
    @BindView(R.id.etQita4Mingcheng)
    EditText etQita4Mingcheng;
    @BindView(R.id.tvQita4Riqi)
    TextView tvQita4Riqi;
    @BindView(R.id.etQita4Buwei)
    EditText etQita4Buwei;
    @BindView(R.id.etQita4Pihao)
    EditText etQita4Pihao;
    @BindView(R.id.etQita4Yisheng)
    EditText etQita4Yisheng;
    @BindView(R.id.etQita4Beizhu)
    EditText etQita4Beizhu;
    Unbinder unbinder;//TODO 开始写麻腮风疫苗了!

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_fragment_yimiaojici;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvYiganRiqi1, R.id.tvYiganRiqi2, R.id.tvYiganRiqi3, R.id.tvKajieRiqi1, R.id.tvJihuiRiqi1, R.id.tvJihuiRiqi2, R.id.tvJihuiRiqi3, R.id.tvJihuiRiqi4, R.id.tvBaibaipoRiqi1, R.id.tvBaibaipoRiqi2, R.id.tvBaibaipoRiqi3, R.id.tvBaibaipoRiqi4, R.id.tvBaipoRq1, R.id.tvMafenRq1, R.id.tvMasaifengRiqi1, R.id.tvMasaifengRiqi2, R.id.tvMazhenRiqi1, R.id.tvMazhenRiqi2, R.id.tvANaoliuRiqi1, R.id.tvANaoliuRiqi2, R.id.tvQunliuRiqi1, R.id.tvQunliuRiqi2, R.id.tvYinaoRiqi1, R.id.tvYinaoRiqi2, R.id.tvYinaomiehuoRiqi1, R.id.tvYinaomiehuoRiqi2, R.id.tvYinaomiehuoRiqi3, R.id.tvYinaomiehuoRiqi4, R.id.tvJiaganjianduRiqi1, R.id.tvJiaganmiehuoRiqi1, R.id.tvJiaganmiehuoRiqi2, R.id.tvQita1Riqi, R.id.tvQita2Riqi, R.id.tvQita3Riqi, R.id.tvQita4Riqi, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvYiganRiqi1:
                break;
            case R.id.tvYiganRiqi2:
                break;
            case R.id.tvYiganRiqi3:
                break;
            case R.id.tvKajieRiqi1:
                break;
            case R.id.tvJihuiRiqi1:
                break;
            case R.id.tvJihuiRiqi2:
                break;
            case R.id.tvJihuiRiqi3:
                break;
            case R.id.tvJihuiRiqi4:
                break;
            case R.id.tvBaibaipoRiqi1:
                break;
            case R.id.tvBaibaipoRiqi2:
                break;
            case R.id.tvBaibaipoRiqi3:
                break;
            case R.id.tvBaibaipoRiqi4:
                break;
            case R.id.tvBaipoRq1:
                break;
            case R.id.tvMafenRq1:
                break;
            case R.id.tvMasaifengRiqi1:
                break;
            case R.id.tvMasaifengRiqi2:
                break;
            case R.id.tvMazhenRiqi1:
                break;
            case R.id.tvMazhenRiqi2:
                break;
            case R.id.tvANaoliuRiqi1:
                break;
            case R.id.tvANaoliuRiqi2:
                break;
            case R.id.tvQunliuRiqi1:
                break;
            case R.id.tvQunliuRiqi2:
                break;
            case R.id.tvYinaoRiqi1:
                break;
            case R.id.tvYinaoRiqi2:
                break;
            case R.id.tvYinaomiehuoRiqi1:
                break;
            case R.id.tvYinaomiehuoRiqi2:
                break;
            case R.id.tvYinaomiehuoRiqi3:
                break;
            case R.id.tvYinaomiehuoRiqi4:
                break;
            case R.id.tvJiaganjianduRiqi1:
                break;
            case R.id.tvJiaganmiehuoRiqi1:
                break;
            case R.id.tvJiaganmiehuoRiqi2:
                break;
            case R.id.tvQita1Riqi:
                break;
            case R.id.tvQita2Riqi:
                break;
            case R.id.tvQita3Riqi:
                break;
            case R.id.tvQita4Riqi:
                break;
            case R.id.tvConfirm:
                break;
        }
    }
}
