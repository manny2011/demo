package com.example.administrator.biaozhunban.publicHealth.edit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.基础档案.JiWangShiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.基础档案.JiaZuShiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.基础档案.JibenxinxiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.基础档案.ShengHuoHuanJingFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class DangAnEditor extends BaseEditor {

    String[] items = {"基础档案", "既往史", "家庭史", "生活环境"};

    Fragment jiChuDangAnFrag;
    Fragment jiWangShiFrag;
    Fragment jiaZuShiFrag;
    Fragment shenHuoHuanJingFrag;

    @Override
    protected void initView() {
        super.initView();
        setTitle("基础档案");
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
                if (jiChuDangAnFrag == null) {
                    jiChuDangAnFrag = new JibenxinxiFrag();

                    transaction.add(R.id.container, jiChuDangAnFrag);
                } else {
                    transaction.show(jiChuDangAnFrag);
                }
                break;
            case 1:
                if (jiWangShiFrag == null) {
                    jiWangShiFrag = new JiWangShiFrag();
                    transaction.add(R.id.container, jiWangShiFrag);
                } else {
                    transaction.show(jiWangShiFrag);
                }
                break;
            case 2:
                if (jiaZuShiFrag == null) {
                    jiaZuShiFrag = new JiaZuShiFrag();
                    transaction.add(R.id.container, jiaZuShiFrag);
                } else {
                    transaction.show(jiaZuShiFrag);
                }
                break;
            case 3:
                if (shenHuoHuanJingFrag == null) {
                    shenHuoHuanJingFrag = new ShengHuoHuanJingFrag();
                    transaction.add(R.id.container, shenHuoHuanJingFrag);
                } else {
                    transaction.show(shenHuoHuanJingFrag);
                }
                break;
        }
        transaction.commit();
    }

    @Override
    protected void hideAllFrags(FragmentTransaction tr) {
        if (jiChuDangAnFrag != null)
            tr.hide(jiChuDangAnFrag);
        if (jiWangShiFrag != null)
            tr.hide(jiWangShiFrag);
        if (jiaZuShiFrag != null)
            tr.hide(jiaZuShiFrag);
        if (shenHuoHuanJingFrag != null)
            tr.hide(shenHuoHuanJingFrag);
    }


}
