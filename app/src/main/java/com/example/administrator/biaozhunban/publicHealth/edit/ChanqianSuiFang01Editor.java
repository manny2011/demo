package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanqiansuifang01.Chanqiansuifang01Frag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanqiansuifang01.FuKeJianChaFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanqiansuifang01.FuZhuJianChaFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanqiansuifang01.ZongTiPingGuFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.sandaoliusuiertong.SanDaoLiuSuiErTongFangShiFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class ChanqianSuiFang01Editor extends BaseEditor {

    String[] items = {"第1次产前随访服务记录", "妇科检查", "辅助检查", "总体评估"};

    Fragment chanQian01;
    Fragment fuKe;
    Fragment fuZhu;
    Fragment zongTi;

    @Override
    protected void initView() {
        super.initView();
        setTitle("第1次产前随访服务记录");
        llCheck.setVisibility(View.VISIBLE);
    }

    @Override
    protected String[] getItems() {
        return items;
    }

    @Override
    protected void hideAllFrags(FragmentTransaction tr) {
        if(chanQian01!=null)tr.hide(chanQian01);
        if(fuKe!=null)tr.hide(fuKe);
        if(fuZhu!=null)tr.hide(fuZhu);
        if(zongTi!=null)tr.hide(zongTi);
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
                if (chanQian01 == null) {
                    chanQian01 = new Chanqiansuifang01Frag();
                    transaction.add(R.id.container, chanQian01);
                } else transaction.show(chanQian01);
                break;
            case 1:
                if (fuKe == null) {
                    fuKe = new FuKeJianChaFrag();
                    transaction.add(R.id.container, fuKe);
                } else transaction.show(fuKe);
                break;
            case 2:
                if (fuZhu == null) {
                    fuZhu = new FuZhuJianChaFrag();
                    transaction.add(R.id.container, fuZhu);
                } else transaction.show(fuZhu);
                break;
            case 3:
                if (zongTi == null) {
                    zongTi = new ZongTiPingGuFrag();
                    transaction.add(R.id.container, zongTi);
                } else transaction.show(zongTi);
                break;
        }
        transaction.commit();
    }

}
