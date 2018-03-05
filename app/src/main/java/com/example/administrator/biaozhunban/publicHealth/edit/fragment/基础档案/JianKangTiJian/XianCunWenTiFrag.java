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

public class XianCunWenTiFrag extends BaseFrag {
    @BindView(R.id.tvNaoxueguan)
    TextView tvNaoxueguan;
    @BindView(R.id.tvShenzang)
    TextView tvShenzang;
    @BindView(R.id.tvXinzang)
    TextView tvXinzang;
    @BindView(R.id.tvXueguan)
    TextView tvXueguan;
    @BindView(R.id.tvYanbu)
    TextView tvYanbu;
    @BindView(R.id.rgShenjing)
    RadioGroup rgShenjing;
    @BindView(R.id.etShengjing)
    EditText etShengjing;
    @BindView(R.id.rgQita)
    RadioGroup rgQita;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_xiancunwenti;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvNaoxueguan, R.id.tvShenzang, R.id.tvXinzang, R.id.tvXueguan, R.id.tvYanbu, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvNaoxueguan:
                chooseNaoxueguanDialog();
                break;
            case R.id.tvShenzang:
                chooseShenzangDialog();
                break;
            case R.id.tvXinzang:
                chooseXinzangDialog();
                break;
            case R.id.tvXueguan:
                chooseXueguanDialog();
                break;
            case R.id.tvYanbu:
                chooseYanbuDialog();
                break;
            case R.id.tvConfirm:
                break;
        }
    }

    private void chooseNaoxueguanDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("未发现","缺血性卒中","脑出血","蛛网膜下腔出血","短暂性脑缺血发作","其他")
                .itemsCallbackMultiChoice(null, (dialog, which, text) -> {
                    StringBuilder sb = new StringBuilder();
                    for (CharSequence s :
                            text) {
                        sb.append(s).append(',');
                    }
                    String s = sb.toString();
                    if(s.length()>0){
                        String substring = s.substring(0, s.length() - 1);
                        tvNaoxueguan.setText(substring);
                    }
                    return true;
                }).title("请选择脑血管疾病情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseShenzangDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("未发现","糖尿病肾病","肾功能衰竭","急性肾炎","慢性肾炎","其他")
                .itemsCallbackMultiChoice(null, (dialog, which, text) -> {
                    StringBuilder sb = new StringBuilder();
                    for (CharSequence s :
                            text) {
                        sb.append(s).append(',');
                    }
                    String s = sb.toString();
                    if(s.length()>0){
                        String substring = s.substring(0, s.length() - 1);
                        tvShenzang.setText(substring);
                    }
                    return true;
                }).title("请选择肾脏疾病情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseXinzangDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("未发现","心肌梗死","心绞痛","冠状动脉血运重建","充血性心力衰竭","心前区疼痛","其他")
                .itemsCallbackMultiChoice(null, (dialog, which, text) -> {
                    StringBuilder sb = new StringBuilder();
                    for (CharSequence s :
                            text) {
                        sb.append(s).append(',');
                    }
                    String s = sb.toString();
                    if(s.length()>0){
                        String substring = s.substring(0, s.length() - 1);
                        tvXinzang.setText(substring);
                    }
                    return true;
                }).title("请选择心脏疾病情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseXueguanDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("未发现","夹层动脉瘤","动脉闭塞性疾病","其他")
                .itemsCallbackMultiChoice(null, (dialog, which, text) -> {
                    StringBuilder sb = new StringBuilder();
                    for (CharSequence s :
                            text) {
                        sb.append(s).append(',');
                    }
                    String s = sb.toString();
                    if(s.length()>0){
                        String substring = s.substring(0, s.length() - 1);
                        tvXueguan.setText(substring);
                    }
                    return true;
                }).title("请选择血管疾病情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseYanbuDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("未发现","视网膜出血或渗出","视乳头水肿","白内障","其他")
                .itemsCallbackMultiChoice(null, (dialog, which, text) -> {
                    StringBuilder sb = new StringBuilder();
                    for (CharSequence s :
                            text) {
                        sb.append(s).append(',');
                    }
                    String s = sb.toString();
                    if(s.length()>0){
                        String substring = s.substring(0, s.length() - 1);
                        tvYanbu.setText(substring);
                    }
                    return true;
                }).title("请选择眼部疾病情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }
}
