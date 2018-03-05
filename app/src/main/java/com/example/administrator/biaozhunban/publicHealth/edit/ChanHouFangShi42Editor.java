package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanhousuifang42.Chanhousuifang42Frag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.sandaoliusuiertong.SanDaoLiuSuiErTongFangShiFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class ChanHouFangShi42Editor extends BaseEditor {
    String[] items = {"产后42天访视记录表"};

    Fragment chanHou42;

    @Override
    protected void initView() {
        super.initView();
        setTitle("产后42天访视记录");
        llCheck.setVisibility(View.VISIBLE);
    }

    @Override
    protected void replaceFragment(int posi) {
        this.posi = posi;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        switch (posi) {
            case 0:
                if (chanHou42 == null) {
                    chanHou42 = new Chanhousuifang42Frag();
                    transaction.add(R.id.container, chanHou42);
                } else transaction.show(chanHou42);
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
