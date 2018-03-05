package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chanqiansuifang02to05.ChanQianSuiFang02to05Frag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.sandaoliusuiertong.SanDaoLiuSuiErTongFangShiFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class ChanQianSuiFang02dao05Editor extends BaseEditor {
    String[] items = {"第2~5次产前随访服务记录"};

    Fragment chanQian02;

    @Override
    protected void initView() {
        super.initView();
        setTitle("第2~5次产前随访服务记录");
        llCheck.setVisibility(View.VISIBLE);
    }

    @Override
    protected void replaceFragment(int posi) {
        this.posi = posi;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        switch (posi) {
            case 0:
                if (chanQian02 == null) {
                    chanQian02 = new ChanQianSuiFang02to05Frag();
                    transaction.add(R.id.container, chanQian02);
                } else transaction.show(chanQian02);
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
