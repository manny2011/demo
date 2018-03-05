package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.YuFangJieZhong.JieZhongKaFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.YuFangJieZhong.YiMiaoJiCiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.基础档案.JiWangShiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.基础档案.JiaZuShiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.基础档案.JibenxinxiFrag;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.基础档案.ShengHuoHuanJingFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class JieZhongEditor extends BaseEditor {

    String[] items={"预防接种卡","疫苗与剂次"};

    Fragment jieZhong;
    Fragment yiMiao;

    @Override
    protected void initView() {
        super.initView();
        setTitle("预防接种");
    }

    @Override
    protected String[] getItems() {
        return items;
    }

    @Override
    protected void hideAllFrags(FragmentTransaction tr) {
        if (jieZhong != null)
            tr.hide(jieZhong);
        if (yiMiao != null)
            tr.hide(yiMiao);
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
                if (jieZhong == null) {
                    jieZhong = new JieZhongKaFrag();
                    transaction.add(R.id.container, jieZhong);
                } else {
                    transaction.show(jieZhong);
                }
                break;
            case 1:
                if (yiMiao == null) {
                    yiMiao = new YiMiaoJiCiFrag();
                    transaction.add(R.id.container, yiMiao);
                } else {
                    transaction.show(yiMiao);
                }
                break;
        }
        transaction.commit();
    }
}
