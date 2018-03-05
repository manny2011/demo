package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian;

import android.graphics.BitmapRegionDecoder;
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

public class ShengHuoFangShiFrag extends BaseFrag {
    @BindView(R.id.tvPinlv)
    TextView tvPinlv;
    @BindView(R.id.etDuanlianshijian)
    EditText etDuanlianshijian;
    @BindView(R.id.etJianchishijian)
    EditText etJianchishijian;
    @BindView(R.id.etDuanlianfangshi)
    EditText etDuanlianfangshi;
    @BindView(R.id.tvYinshi)
    TextView tvYinshi;
    @BindView(R.id.tvXiyian)
    TextView tvXiyian;
    @BindView(R.id.etXishi)
    EditText etXishi;
    @BindView(R.id.etXiyanKaishi)
    EditText etXiyanKaishi;
    @BindView(R.id.etXiyanJieshu)
    EditText etXiyanJieshu;
    @BindView(R.id.tvYinjiu)
    TextView tvYinjiu;
    @BindView(R.id.etJiuliang)
    EditText etJiuliang;
    @BindView(R.id.rbJiejiu)
    RadioGroup rbJiejiu;
    @BindView(R.id.etJiejiunianling)
    EditText etJiejiunianling;
    @BindView(R.id.etYinjiuKaishi)
    EditText etYinjiuKaishi;
    @BindView(R.id.rgZuijiu)
    RadioGroup rgZuijiu;
    @BindView(R.id.tvYinjiuType)
    TextView tvYinjiuType;
    @BindView(R.id.rgZhiyebing)
    RadioGroup rgZhiyebing;
    @BindView(R.id.etGongzhong)
    EditText etGongzhong;
    @BindView(R.id.etCongyeshijian)
    EditText etCongyeshijian;
    @BindView(R.id.etFenchen)
    EditText etFenchen;
    @BindView(R.id.rgFanghu1)
    RadioGroup rgFanghu1;
    @BindView(R.id.etFanghu1)
    EditText etFanghu1;
    @BindView(R.id.etFangshe)
    EditText etFangshe;
    @BindView(R.id.rgFanghu2)
    RadioGroup rgFanghu2;
    @BindView(R.id.etFanghu2)
    EditText etFanghu2;
    @BindView(R.id.etWuli)
    EditText etWuli;
    @BindView(R.id.rgFanghu3)
    RadioGroup rgFanghu3;
    @BindView(R.id.etFanghu3)
    EditText etFanghu3;
    @BindView(R.id.rgFanghu4)
    RadioGroup rgFanghu4;
    @BindView(R.id.etFanghu4)
    EditText etFanghu4;
    @BindView(R.id.etQita)
    EditText etQita;
    @BindView(R.id.rgFanghu5)
    RadioGroup rgFanghu5;
    @BindView(R.id.etFanghu5)
    EditText etFanghu5;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_shenghuofangshi;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvPinlv, R.id.tvYinshi, R.id.tvXiyian, R.id.tvYinjiu, R.id.tvYinjiuType, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvPinlv:
                choosePinlvDialog();
                break;
            case R.id.tvYinshi:
                chooseYinshiDialog();
                break;
            case R.id.tvXiyian:
                chooseXiyanDialog();
                break;
            case R.id.tvYinjiu:
                chooseYinjiuDialog();
                break;
            case R.id.tvYinjiuType:
                chooseYinjiuTypeDialog();
                break;
            case R.id.tvConfirm:
                save();
                break;
        }
    }

    private void save() {

    }

    private void chooseYinjiuTypeDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("白酒","啤酒","红酒","黄酒","其他")
                .itemsCallbackMultiChoice(null, (dialog, which, text) -> {
                    StringBuilder sb = new StringBuilder();
                    for (CharSequence s :
                            text) {
                        sb.append(s).append(',');
                    }
                    String s = sb.toString();
                    if(s.length()>0){
                        String substring = s.substring(0, s.length() - 1);
                        tvYinjiuType.setText(substring);
                    }
                    return true;
                }).title("请选择饮酒种类")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseYinjiuDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("从不", "偶尔", "经常","每天")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvYinjiu.setText(text);
                    return true;
                }).title("请选择饮酒频率")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseXiyanDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("从不吸烟", "已戒烟", "吸烟")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvXiyian.setText(text);
                    return true;
                }).title("请选择吸烟状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseYinshiDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("荤素均衡","荦依为主","素食为主","嗜盐","嗜油","嗜糖")
                .itemsCallbackMultiChoice(null, new MaterialDialog.ListCallbackMultiChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, Integer[] which, CharSequence[] text) {
                        StringBuilder sb = new StringBuilder();
                        for (CharSequence s :
                                text) {
                            sb.append(s).append(',');
                        }
                        String s = sb.toString();
                        if(s.length()>0){
                            String substring = s.substring(0, s.length() - 1);
                            tvYinshi.setText(substring);
                        }
                        return true;
                    }
                }).title("请选择饮食习惯")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void choosePinlvDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("每天", "每周一次以上", "偶尔", "不锻炼")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvPinlv.setText(text);
                    return true;
                }).title("请选择锻炼频率")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }
}
