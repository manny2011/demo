package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.chuanranbingbaogao.ChuanranbingBaoGaoFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.liangsuiertong.LiangSuiErTongFangShiFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class ChuanRanBingEditor extends BaseEditor {
    String[] items = {"传染病报告"};

    Fragment chuanRanBing;

    @Override
    protected void initView() {
        super.initView();
        setTitle("传染病报告卡");
    }

    @Override
    protected void replaceFragment(int posi) {
        this.posi = posi;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        switch (posi) {
            case 0:
                if (chuanRanBing == null) {
                    chuanRanBing = new ChuanranbingBaoGaoFrag();
                    transaction.add(R.id.container, chuanRanBing);
                } else transaction.show(chuanRanBing);
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
