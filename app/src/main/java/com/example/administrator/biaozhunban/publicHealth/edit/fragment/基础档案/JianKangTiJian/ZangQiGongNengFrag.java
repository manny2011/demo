package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public class ZangQiGongNengFrag extends BaseFrag {
    @BindView(R.id.tvKouchun)
    TextView tvKouchun;
    @BindView(R.id.tvChilie)
    TextView tvChilie;
    @BindView(R.id.etQuechi1)
    EditText etQuechi1;
    @BindView(R.id.etQuechi2)
    EditText etQuechi2;
    @BindView(R.id.etQuechi3)
    EditText etQuechi3;
    @BindView(R.id.etQuechi4)
    EditText etQuechi4;
    @BindView(R.id.etQuchi1)
    EditText etQuchi1;
    @BindView(R.id.etQuchi2)
    EditText etQuchi2;
    @BindView(R.id.etQuchi3)
    EditText etQuchi3;
    @BindView(R.id.etQuchi4)
    EditText etQuchi4;
    @BindView(R.id.etYichi1)
    EditText etYichi1;
    @BindView(R.id.etYichi2)
    EditText etYichi2;
    @BindView(R.id.etYichi3)
    EditText etYichi3;
    @BindView(R.id.etYichi4)
    EditText etYichi4;
    @BindView(R.id.tvYanbu)
    TextView tvYanbu;
    @BindView(R.id.etShilileft)
    EditText etShilileft;
    @BindView(R.id.etShiliRight)
    EditText etShiliRight;
    @BindView(R.id.etJiaozhengLeft)
    EditText etJiaozhengLeft;
    @BindView(R.id.etJiaozhengRight)
    EditText etJiaozhengRight;
    @BindView(R.id.tvTingli)
    TextView tvTingli;
    @BindView(R.id.tvYundong)
    TextView tvYundong;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_zangqigongneng;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvKouchun, R.id.tvChilie, R.id.tvYanbu, R.id.tvTingli,R.id.tvYundong, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvKouchun:
                chooseKouchunDialog();
                break;
            case R.id.tvChilie:
                chooseChilieDialog();
                break;
            case R.id.tvYanbu:
                chooseYanbuDialog();
                break;
            case R.id.tvTingli:
                chooseTingliDialog();
                break;
            case R.id.tvYundong:
                chooseYundongDialog();
                break;
            case R.id.tvConfirm:
                save();
                break;
        }
    }

    private void save() {

    }

    private void chooseYanbuDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("无充血", "充血", "淋巴滤泡丧生")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvYanbu.setText(text);
                    return true;
                }).title("请选择口唇状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseKouchunDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("红润", "苍白", "发绀","皲裂","疱疹")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvKouchun.setText(text);
                    return true;
                }).title("请选择口唇状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }
    private void chooseChilieDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("正常", "缺齿", "龋齿","义齿")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvChilie.setText(text);
                    return true;
                }).title("请选择齿列状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }
    private void chooseTingliDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("听见", "听不清或无法听见")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvTingli.setText(text);
                    return true;
                }).title("请选择听力情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }
    private void chooseYundongDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("可顺利完成", "无法独立完成其中任何一个动作")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvYundong.setText(text);
                    return true;
                }).title("请选择运动功能情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }
}
