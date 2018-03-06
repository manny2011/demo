package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.laonianren;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseFrag;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/2/27.
 */

public class LaonianrenFrag extends BaseFrag {
    @BindView(R.id.tvJincan)
    TextView tvJincan;
    @BindView(R.id.tvJiancanFen)
    TextView tvJiancanFen;
    @BindView(R.id.tvShuxi)
    TextView tvShuxi;
    @BindView(R.id.tvShuxiFen)
    TextView tvShuxiFen;
    @BindView(R.id.tvChuanyi)
    TextView tvChuanyi;
    @BindView(R.id.tvChuanyiFen)
    TextView tvChuanyiFen;
    @BindView(R.id.tvRuce)
    TextView tvRuce;
    @BindView(R.id.tvRuceFen)
    TextView tvRuceFen;
    @BindView(R.id.tvHuodong)
    TextView tvHuodong;
    @BindView(R.id.tvHuodongFen)
    TextView tvHuodongFen;
    @BindView(R.id.tvZongFen)
    TextView tvZongFen;
    @BindView(R.id.tvJielun)
    TextView tvJielun;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_fragment_laonianren;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvJincan, R.id.tvShuxi, R.id.tvChuanyi, R.id.tvRuce, R.id.tvHuodong, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvJincan:
                break;
            case R.id.tvShuxi:
                break;
            case R.id.tvChuanyi:
                break;
            case R.id.tvRuce:
                break;
            case R.id.tvHuodong:
                break;
            case R.id.tvConfirm:
                break;
        }
    }
}
