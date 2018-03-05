package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.YiSuiErTong.YiSuiErTongFangShiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.liangsuiertong.LiangSuiErTongFangShiFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class LiangSuiErTongJianChaEditor extends BaseEditor {
    String[] items={"1~2岁儿童健康检查记录"};

    Fragment liangSui;

    @Override
    protected void initView() {
        super.initView();
        setTitle("1~2岁儿童健康检查记录");
        llCheck.setVisibility(View.VISIBLE);
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

    @Override
    protected void replaceFragment(int posi) {
        this.posi = posi;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        switch (posi) {
            case 0:
                if(liangSui==null){
                    liangSui=new LiangSuiErTongFangShiFrag();
                    transaction.add(R.id.container,liangSui);
                }else transaction.show(liangSui);
                break;
        }
        transaction.commit();
    }
}
