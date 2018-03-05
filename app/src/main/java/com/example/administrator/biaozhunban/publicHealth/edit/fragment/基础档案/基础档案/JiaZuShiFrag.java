package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.基础档案;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseFrag;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/2/26.
 */

public class JiaZuShiFrag extends BaseFrag {
    @BindView(R.id.tvFu)
    TextView tvFu;
    @BindView(R.id.tvMu)
    TextView tvMu;
    @BindView(R.id.tvXiongdi)
    TextView tvXiongdi;
    @BindView(R.id.tvZinv)
    TextView tvZinv;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_jiazushi;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvFu, R.id.tvMu, R.id.tvXiongdi, R.id.tvZinv, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvFu:
                chooseJiBingDialog(1);
                break;
            case R.id.tvMu:
                chooseJiBingDialog(2);
                break;
            case R.id.tvXiongdi:
                chooseJiBingDialog(3);
                break;
            case R.id.tvZinv:
                chooseJiBingDialog(4);
                break;
            case R.id.tvConfirm:
                save();
                break;

        }
    }

    private void save() {

    }

    private void chooseJiBingDialog(int i) {
        final String[] jb = {"无", "高血压", "糖尿病", "冠心病", "慢性阻塞性肺疾病", "恶性肿瘤", "脑卒中", "重性精神疾病", "结核病", "结核病", "肝炎", "其他法定传染病", "职业病", "其他"};
        new MaterialDialog.Builder(mActivity)
                .title("请选择性别")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .items(jb)
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    switch (i) {
                        case 1:
                            tvFu.setText(text);
                            break;
                        case 2:
                            tvMu.setText(text);
                            break;
                        case 3:
                            tvXiongdi.setText(text);
                            break;
                        case 4:
                            tvZinv.setText(text);
                            break;
                    }
                    return true;
                })
                .negativeText("取消")
                .build()
                .show();
    }
}
