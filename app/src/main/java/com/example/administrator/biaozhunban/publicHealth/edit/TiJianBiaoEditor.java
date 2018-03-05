package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian.ChaTiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian.FeimianyiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian.FuZhuJianChaFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian.JianKangPingJiaFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian.JianKangTiJianFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian.ShengHuoFangShiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian.XianCunWenTiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian.ZangQiGongNengFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian.ZhongyitizhiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian.ZhuyaoyongyaoFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian.ZhuyuanzhiliaoFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class TiJianBiaoEditor extends BaseEditor {

    String[] items = {"健康体检表", "生活方式", "脏器功能", "查体", "辅助功能", "中医体质辨识", "现存主要健康问题", "住院治疗情况",
            "主要用药情况", "非免疫预防接种史", "健康评价与指导"};

    Fragment jianKang;
    Fragment shenHuo;
    Fragment zangQi;
    Fragment chaTi;
    Fragment fuZhu;
    Fragment zhongYi;
    Fragment zhuYaoWenTi;
    Fragment zhiLiao;
    Fragment yongYao;
    Fragment feiMianYi;
    Fragment pingJia;

    @Override
    protected void initView() {
        super.initView();
        setTitle("健康体检表");
        llBlackboard.setVisibility(View.VISIBLE);
        llPrint.setVisibility(View.VISIBLE);
        llSearch.setVisibility(View.VISIBLE);
        llBlackboard.setVisibility(View.VISIBLE);
        llCheck.setVisibility(View.VISIBLE);

    }

    @Override
    protected String[] getItems() {
        return items;
    }

    @Override
    protected void initData() {
        replaceFragment(0);
    }

    @Override
    protected void replaceFragment(int posi) {
        this.posi = posi;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        switch (posi) {
            case 0:
                if (jianKang == null) {
                    jianKang = new JianKangTiJianFrag();
                    transaction.add(R.id.container, jianKang);
                } else {
                    transaction.show(jianKang);
                }
                break;
            case 1:
                if (shenHuo == null) {
                    shenHuo = new ShengHuoFangShiFrag();
                    transaction.add(R.id.container, shenHuo);
                } else {
                    transaction.show(shenHuo);
                }
                break;
            case 2:
                if (zangQi == null) {
                    zangQi = new ZangQiGongNengFrag();
                    transaction.add(R.id.container, zangQi);
                } else {
                    transaction.show(zangQi);
                }
                break;
            case 3:
                if (chaTi == null) {
                    chaTi = new ChaTiFrag();
                    transaction.add(R.id.container, chaTi);
                } else {
                    transaction.show(chaTi);
                }
                break;
            case 4:
                if (fuZhu == null) {
                    fuZhu = new FuZhuJianChaFrag();
                    transaction.add(R.id.container, fuZhu);
                } else {
                    transaction.show(fuZhu);
                }
                break;
            case 5:
                if (zhongYi == null) {
                    zhongYi = new ZhongyitizhiFrag();
                    transaction.add(R.id.container, zhongYi);
                } else {
                    transaction.show(zhongYi);
                }
                break;
            case 6:
                if (zhuYaoWenTi == null) {
                    zhuYaoWenTi = new XianCunWenTiFrag();
                    transaction.add(R.id.container, zhuYaoWenTi);
                } else {
                    transaction.show(zhuYaoWenTi);
                }
                break;
            case 7:
                if (zhiLiao == null) {
                    zhiLiao = new ZhuyuanzhiliaoFrag();
                    transaction.add(R.id.container, zhiLiao);
                } else {
                    transaction.show(zhiLiao);
                }
                break;
            case 8:
                if (yongYao == null) {
                    yongYao = new ZhuyaoyongyaoFrag();
                    transaction.add(R.id.container, yongYao);
                } else {
                    transaction.show(yongYao);
                }
                break;
            case 9:
                if (feiMianYi == null) {
                    feiMianYi = new FeimianyiFrag();
                    transaction.add(R.id.container, feiMianYi);
                } else {
                    transaction.show(feiMianYi);
                }
                break;
            case 10:
                if (pingJia == null) {
                    pingJia = new JianKangPingJiaFrag();
                    transaction.add(R.id.container, pingJia);
                } else {
                    transaction.show(pingJia);
                }
                break;

        }
        transaction.commit();
    }

    @Override
    protected void hideAllFrags(FragmentTransaction tr) {
        if (jianKang != null)
            tr.hide(jianKang);
        if (shenHuo != null)
            tr.hide(shenHuo);
        if (zangQi != null)
            tr.hide(zangQi);
        if (chaTi != null)
            tr.hide(chaTi);
        if (fuZhu != null)
            tr.hide(fuZhu);
        if (zhongYi != null)
            tr.hide(zhongYi);
        if (zhuYaoWenTi != null)
            tr.hide(zhuYaoWenTi);
        if (zhiLiao != null)
            tr.hide(zhiLiao);
        if (yongYao != null)
            tr.hide(yongYao);
        if (feiMianYi != null)
            tr.hide(feiMianYi);
        if (pingJia != null)
            tr.hide(pingJia);
    }
}
