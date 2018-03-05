package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.jingshenbinghuanzhexinxi.JingshenbinghuanzheXinxiBuChongFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class JingShenBingHuanZheXinXiEditor extends BaseEditor {
    String[] items = {"重性精神病患者个人信息补充"};

    Fragment jingShenBingXinxi;

    @Override
    protected void initView() {
        super.initView();
        setTitle("重性精神病患者个人信息");
    }

    @Override
    protected void replaceFragment(int posi) {
        this.posi = posi;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        switch (posi) {
            case 0:
                if (jingShenBingXinxi == null) {
                    jingShenBingXinxi = new JingshenbinghuanzheXinxiBuChongFrag();
                    transaction.add(R.id.container, jingShenBingXinxi);
                } else transaction.show(jingShenBingXinxi);
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
