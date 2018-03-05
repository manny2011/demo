package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.tangniaobing.TangniaobingFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class TangNiaoBing2XingEditor extends BaseEditor {
    String[] items = {"2型糖尿病患者随访服务记录表"};

    Fragment tangNiaoBing;

    @Override
    protected void initView() {
        super.initView();
        setTitle("2型糖尿病患者随访服务记录");
        llDc.setVisibility(View.VISIBLE);
        llCheck.setVisibility(View.VISIBLE);
    }

    @Override
    protected void replaceFragment(int posi) {
        this.posi = posi;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        switch (posi) {
            case 0:
                if (tangNiaoBing == null) {
                    tangNiaoBing = new TangniaobingFrag();
                    transaction.add(R.id.container, tangNiaoBing);
                } else transaction.show(tangNiaoBing);
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
