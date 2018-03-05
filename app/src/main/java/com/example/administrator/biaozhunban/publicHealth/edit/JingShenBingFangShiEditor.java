package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.jingshenbinghuanzhesuifang.JingshenbingsuifangFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.liangsuiertong.LiangSuiErTongFangShiFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class JingShenBingFangShiEditor extends BaseEditor {
    String[] items = {"重性精神疾病患者随访服务记录表"};

    Fragment suiFang;

    @Override
    protected void initView() {
        super.initView();
        setTitle("重性精神疾病患者随访服务记录");
    }

    @Override
    protected void replaceFragment(int posi) {
        this.posi = posi;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        switch (posi) {
            case 0:
                if (suiFang == null) {
                    suiFang = new JingshenbingsuifangFrag();
                    transaction.add(R.id.container, suiFang);
                } else transaction.show(suiFang);
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
