package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
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

public class JianKangPingJiaFrag extends BaseFrag {
    @BindView(R.id.rgYichang)
    RadioGroup rgYichang;
    @BindView(R.id.etYichang1)
    EditText etYichang1;
    @BindView(R.id.etYichang2)
    EditText etYichang2;
    @BindView(R.id.etYichang3)
    EditText etYichang3;
    @BindView(R.id.etYichang4)
    EditText etYichang4;
    @BindView(R.id.tvJianyi)
    TextView tvJianyi;
    @BindView(R.id.tvWeixian)
    TextView tvWeixian;
    @BindView(R.id.etMubiao)
    EditText etMubiao;
    @BindView(R.id.etYimiao)
    EditText etYimiao;
    @BindView(R.id.etQita)
    EditText etQita;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_jiankangpingjia;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvJianyi, R.id.tvWeixian, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvJianyi:
                chooseJianyiDialog();
                break;
            case R.id.tvWeixian:
                chooseKongzhiDialog();
                break;
            case R.id.tvConfirm:
                save();
                break;
        }
    }

    private void save() {

    }

    private void chooseJianyiDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("纳入慢性病患者健康管理","建议复查","建议转诊","定期随访")
                .itemsCallbackMultiChoice(null, (dialog, which, text) -> {
                    StringBuilder sb = new StringBuilder();
                    for (CharSequence s :
                            text) {
                        sb.append(s).append(',');
                    }
                    String s = sb.toString();
                    if(s.length()>0){
                        String substring = s.substring(0, s.length() - 1);
                        tvJianyi.setText(substring);
                    }
                    return true;
                }).title("请选择健康评价")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseKongzhiDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("戒烟","健康饮酒","饮食","锻炼","减体重","建议接种疫苗","其他")
                .itemsCallbackMultiChoice(null, (dialog, which, text) -> {
                    StringBuilder sb = new StringBuilder();
                    for (CharSequence s :
                            text) {
                        sb.append(s).append(',');
                    }
                    String s = sb.toString();
                    if(s.length()>0){
                        String substring = s.substring(0, s.length() - 1);
                        tvWeixian.setText(substring);
                    }
                    return true;
                }).title("请选择药物过敏史")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }
}
