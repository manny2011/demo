package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.laonianren.LaonianrenFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.liangsuiertong.LiangSuiErTongFangShiFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class LaoNianRenEditor extends BaseEditor {
    String[] items = {"老年人生活自理能力评估表"};

    Fragment laoNianRen;

    @Override
    protected void initView() {
        super.initView();
        setTitle("老年人生活自理能力评估");
    }

    @Override
    protected void replaceFragment(int posi) {
        this.posi = posi;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        switch (posi) {
            case 0:
                if (laoNianRen == null) {
                    laoNianRen = new LaonianrenFrag();
                    transaction.add(R.id.container, laoNianRen);
                } else transaction.show(laoNianRen);
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
