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

public class ShengHuoHuanJingFrag extends BaseFrag {

    @BindView(R.id.tvPaifeng)
    TextView tvPaifeng;
    @BindView(R.id.tvRanliao)
    TextView tvRanliao;
    @BindView(R.id.tvYinshui)
    TextView tvYinshui;
    @BindView(R.id.tvCesuo)
    TextView tvCesuo;
    @BindView(R.id.tvQinxu)
    TextView tvQinxu;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_shenghuohuanjing;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvPaifeng, R.id.tvRanliao, R.id.tvYinshui, R.id.tvCesuo, R.id.tvQinxu, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvPaifeng:
                choosePaifengDialog();
                break;
            case R.id.tvRanliao:
                chooseRanliaoDialog();
                break;
            case R.id.tvYinshui:
                chooseYinshuiDialog();
                break;
            case R.id.tvCesuo:
                chooseCesuoDialog();
                break;
            case R.id.tvQinxu:
                chooseQinxuDialog();
                break;
            case R.id.tvConfirm:
                save();
                break;
        }
    }

    private void save() {

    }

    private void chooseRanliaoDialog() {
        final String[] jb = {"液化气", "煤", "天然气", "沼气", "柴火", "其他"};
        new MaterialDialog.Builder(mActivity)
                .title("请选择燃料类型")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .items(jb)
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvRanliao.setText(text);
                    return true;
                })
                .negativeText("取消")
                .build()
                .show();
    }

    private void chooseCesuoDialog() {
        final String[] jb = {"卫生厕所", "一格或二格粪池式", "马桶", "露天粪坑", "简易棚厕"};
        new MaterialDialog.Builder(mActivity)
                .title("请选择厕所类型")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .items(jb)
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvCesuo.setText(text);
                    return true;
                })
                .negativeText("取消")
                .build()
                .show();
    }

    private void chooseYinshuiDialog() {
        final String[] jb = {"自来水", "经净化过滤的水", "井水", "河湖水", "塘水", "其他"};
        new MaterialDialog.Builder(mActivity)
                .title("请选择饮水类型")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .items(jb)
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvYinshui.setText(text);
                    return true;
                })
                .negativeText("取消")
                .build()
                .show();
    }

    private void chooseQinxuDialog() {
        final String[] jb = {"单设", "室内", "室外"};
        new MaterialDialog.Builder(mActivity)
                .title("禽畜类厕所")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .items(jb)
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvQinxu.setText(text);
                    return true;
                })
                .negativeText("取消")
                .build()
                .show();
    }

    private void choosePaifengDialog() {
        final String[] jb = {"无", "油烟机", "换气扇", "烟囱"};
        new MaterialDialog.Builder(mActivity)
                .title("请选择厨房排风设施")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .items(jb)
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvPaifeng.setText(text);
                    return true;
                })
                .negativeText("取消")
                .build()
                .show();
    }
}
