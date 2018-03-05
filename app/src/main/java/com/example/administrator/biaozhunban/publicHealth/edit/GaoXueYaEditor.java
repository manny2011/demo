package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.gaoxueya.GaoxueyaFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.liangsuiertong.LiangSuiErTongFangShiFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class GaoXueYaEditor extends BaseEditor {
    String[] items = {"高血压患者随访服务记录表"};

    Fragment gaoXueYa;

    @Override
    protected void initView() {
        super.initView();
        setTitle("高血压患者随访服务记录");
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
                if (gaoXueYa == null) {
                    gaoXueYa = new GaoxueyaFrag();
                    transaction.add(R.id.container, gaoXueYa);
                } else transaction.show(gaoXueYa);
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
