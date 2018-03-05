package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanhousuifang.ChanhousuifangFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.sandaoliusuiertong.SanDaoLiuSuiErTongFangShiFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class ChanHouFangShiEditor extends BaseEditor {
    String[] items = {"产后访视记录表"};

    Fragment chanHou01;

    @Override
    protected void initView() {
        super.initView();
        setTitle("产后访视记录");
        llCheck.setVisibility(View.VISIBLE);
    }

    @Override
    protected void replaceFragment(int posi) {
        this.posi = posi;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        switch (posi) {
            case 0:
                if (chanHou01 == null) {
                    chanHou01 = new ChanhousuifangFrag();
                    transaction.add(R.id.container, chanHou01);
                } else transaction.show(chanHou01);
                break;
        }
        transaction.commit();
    }

    @Override
    protected String[] getItems() {
        return items;
    }

    @Override
    protected void hideAllFrags(FragmentTransaction tr) {

    }

    @Override
    protected void initData() {
        replaceFragment(0);
    }
}
