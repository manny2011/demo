package com.example.administrator.biaozhunban.publicHealth.edit;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;

import java.util.Arrays;

import butterknife.BindView;

/**
 * Created by Administrator on 2018/2/25.
 */

public abstract class BaseEditor extends BaseActivity {
    @BindView(R.id.ll_blackboard)
    LinearLayout llBlackboard;
    @BindView(R.id.ll_print)
    LinearLayout llPrint;
    @BindView(R.id.ll_search)
    LinearLayout llSearch;
    @BindView(R.id.ll_dc)
    LinearLayout llDc;
    @BindView(R.id.ll_check)
    LinearLayout llCheck;

    @BindView(R.id.lv)
    ListView lv;
    @BindView(R.id.container)
    FrameLayout container;
    private EditorAdapter adapter;

    String POSI = "position";
    int posi = -1;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(POSI, posi);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        int posi = savedInstanceState.getInt(POSI);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideAllFrags(transaction);
        transaction.commit();
        replaceFragment(posi);
        adapter.changeSelectedPosi(posi);
    }

    @Override
    protected int getLayout() {
        return R.layout.editor_layout_dangan;
    }

    @Override
    protected void initView() {

        adapter = new EditorAdapter(mActivity, Arrays.asList(getItems()));
        lv.setAdapter(adapter);
        lv.setOnItemClickListener((parent, view, position, id) -> {
            boolean changed = adapter.changeSelectedPosi(position);
            if (changed) {//react
                replaceFragment(position);
            }
        });
    }

    protected abstract void replaceFragment(int posi);

    protected abstract String[] getItems();

    protected abstract void hideAllFrags(FragmentTransaction tr);
}
