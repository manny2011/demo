package com.example.administrator.biaozhunban.publicHealth.edit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.xinshengertongfangshi.XinShengErTongFangShiFrag;

/**
 * Created by Administrator on 2018/2/25.
 */

public class XinShengerFangShiEditor extends BaseEditor {

    String[] items={"新生儿家庭访视记录"};
    Fragment xinshen;

    @Override
    protected void initView() {
        super.initView();
        setTitle("新生儿家庭访视记录");
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
        switch (posi){
            case 0:
                if(xinshen==null){
                    xinshen=new XinShengErTongFangShiFrag();
                    transaction.add(R.id.container,xinshen);
                }else transaction.show(xinshen);

                break;
        }
    }
}
