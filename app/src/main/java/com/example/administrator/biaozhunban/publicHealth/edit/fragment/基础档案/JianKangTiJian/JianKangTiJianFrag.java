package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseFrag;
import com.example.administrator.biaozhunban.comm.Utils;
import com.fourmob.datetimepicker.date.DatePickerDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/2/26.
 */

public class JianKangTiJianFrag extends BaseFrag implements DatePickerDialog.OnDateSetListener {
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvBianhao)
    TextView tvBianhao;
    @BindView(R.id.tvTijianriqi)
    TextView tvTijianriqi;
    @BindView(R.id.etDoctor)
    EditText etDoctor;
    @BindView(R.id.tvZhengzhuang)
    TextView tvZhengzhuang;
    @BindView(R.id.etTiwen)
    EditText etTiwen;
    @BindView(R.id.etMailv)
    EditText etMailv;
    @BindView(R.id.etHuxi)
    EditText etHuxi;
    @BindView(R.id.etXueyaLeft1)
    EditText etXueyaLeft1;
    @BindView(R.id.etXueyaLeft2)
    EditText etXueyaLeft2;
    @BindView(R.id.etXueyaRight1)
    EditText etXueyaRight1;
    @BindView(R.id.etXueyaRight2)
    EditText etXueyaRight2;
    @BindView(R.id.etShenggao)
    EditText etShenggao;
    @BindView(R.id.etTizhong)
    EditText etTizhong;
    @BindView(R.id.etYaowei)
    EditText etYaowei;
    @BindView(R.id.etBMI)
    EditText etBMI;
    @BindView(R.id.tvJiankangzhuangtai)
    TextView tvJiankangzhuangtai;
    @BindView(R.id.textView_lnrshzlnlzwpg)
    TextView textViewLnrshzlnlzwpg;
    @BindView(R.id.tvZilinengli)
    TextView tvZilinengli;
    @BindView(R.id.rgRenzhi)
    RadioGroup rgRenzhi;
    @BindView(R.id.etZhili)
    EditText etZhili;
    @BindView(R.id.rgQinggan)
    RadioGroup rgQinggan;
    @BindView(R.id.etYiyu)
    EditText etYiyu;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_jiankangtijianbiao;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvTijianriqi, R.id.tvZhengzhuang, R.id.tvJiankangzhuangtai, R.id.tvZilinengli, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvTijianriqi:
                Utils.chooseDateDialog(mActivity,"tijian",this);
                break;
            case R.id.tvZhengzhuang:
                chooseZhengzhuangDialog();
                break;
            case R.id.tvJiankangzhuangtai:
                chooseJiankangzhuangtaiDialog();
                break;
            case R.id.tvZilinengli:
                chooseZiliDialog();
                break;
            case R.id.tvConfirm:
                save();
                break;
        }
    }

    private void save() {

    }

    private void chooseZiliDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("可处理(0~3分)", "轻度依赖(4~8分)", "中度依赖(9~18分)", "不能自理(>19分)")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvZilinengli.setText(text);
                    return true;
                }).title("请选择老年人生活自理能力自我评估情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseJiankangzhuangtaiDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("满意", "基本满意", "说不清楚", "不太满意", "不满意")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvJiankangzhuangtai.setText(text);
                    return true;
                }).title("请选择老年人健康状态自我评估情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseZhengzhuangDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("无症状","头痛","头晕","心悸","胸闷","胸痛","慢性咳嗽","咳痰","呼吸困难","多饮","多尿","体重下降","乏力","关节肿痛",
                        "手脚麻木","尿急","尿痛","便秘","腹泻","恶心呕吐","眼花","耳鸣","乳房胀痛","其他")
                .itemsCallbackMultiChoice(null, (dialog, which, text) -> {
                    StringBuilder sb = new StringBuilder();
                    for (CharSequence s :
                            text) {
                        sb.append(s).append(',');
                    }
                    String s = sb.toString();
                    if(s.length()>0){
                        String substring = s.substring(0, s.length() - 1);
                        tvZhengzhuang.setText(substring);
                    }
                    return true;
                }).title("请选择症状")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    @Override
    public void onDateSet(DatePickerDialog datePickerDialog, int year, int month, int day) {
        Bundle bundle = datePickerDialog.getArguments();
        if (bundle == null) return;
        String type = bundle.getString("type");
        if (TextUtils.isEmpty(type)) return;
        if (TextUtils.equals(type, "tijian"))
            tvTijianriqi.setText(String.valueOf(year) + '-' + month + '-' + day);
    }
}
