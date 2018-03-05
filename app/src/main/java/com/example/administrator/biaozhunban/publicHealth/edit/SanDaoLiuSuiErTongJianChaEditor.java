package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.liangsuiertong.LiangSuiErTongFangShiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.sandaoliusuiertong.SanDaoLiuSuiErTongFangShiFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class SanDaoLiuSuiErTongJianChaEditor extends BaseEditor {
    String[] items = {"3~6岁儿童健康检查记录"};

    Fragment sanDaoLiuSui;
    @Override
    protected void initView() {
        super.initView();
        setTitle("3~6岁儿童健康检查记录");
        llCheck.setVisibility(View.VISIBLE);

    }

    @Override
    protected String[] getItems() {
        return items;
    }

    @Override
    protected void replaceFragment(int posi) {
        this.posi = posi;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        switch (posi) {
            case 0:
                if (sanDaoLiuSui == null) {
                    sanDaoLiuSui = new SanDaoLiuSuiErTongFangShiFrag();
                    transaction.add(R.id.container, sanDaoLiuSui);
                } else transaction.show(sanDaoLiuSui);
                break;
        }
        transaction.commit();
    }



    @Override
    protected void hideAllFrags(FragmentTransaction tr) {

    }

    @Override
    protected void initData() {
        replaceFragment(0);
    }
}
