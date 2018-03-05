package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.YuFangJieZhong;

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

public class JieZhongKaFrag extends BaseFrag implements DatePickerDialog.OnDateSetListener {
    @BindView(R.id.tvGender)
    TextView tvGender;
    @BindView(R.id.tvShengri)
    TextView tvShengri;
    @BindView(R.id.etXingming)
    EditText etXingming;
    @BindView(R.id.etGuanxi)
    EditText etGuanxi;
    @BindView(R.id.etDianhua)
    EditText etDianhua;
    @BindView(R.id.etXianqu)
    EditText etXianqu;
    @BindView(R.id.etXiang1)
    EditText etXiang1;//上面的乡镇
    @BindView(R.id.rgHuji)
    RadioGroup rgHuji;
    @BindView(R.id.etSheng)
    EditText etSheng;
    @BindView(R.id.etShi)
    EditText etShi;
    @BindView(R.id.etXian)
    EditText etXian;
    @BindView(R.id.etXiang2)
    EditText etXiang2;//下面的乡镇
    @BindView(R.id.tvQianru)
    TextView tvQianru;
    @BindView(R.id.tvQianchu)
    TextView tvQianchu;
    @BindView(R.id.etYuanyin)
    EditText etYuanyin;
    @BindView(R.id.etFanying)
    EditText etFanying;
    @BindView(R.id.etJingji)
    EditText etJingji;
    @BindView(R.id.etChuanran)
    EditText etChuanran;
    @BindView(R.id.tvJianka)
    TextView tvJianka;
    @BindView(R.id.etJiankaren)
    EditText etJiankaren;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_jiezhongka;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvGender, R.id.tvShengri, R.id.tvQianru, R.id.tvQianchu, R.id.tvJianka, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvGender:
                chooseGenderDialog();
                break;
            case R.id.tvShengri:
                Utils.chooseDateDialog(mActivity, "shengri", this);
                break;
            case R.id.tvQianru:
                Utils.chooseDateDialog(mActivity, "qianru", this);
                break;
            case R.id.tvQianchu:
                Utils.chooseDateDialog(mActivity, "qianchu", this);
                break;
            case R.id.tvJianka:
                Utils.chooseDateDialog(mActivity, "jianka", this);
                break;
            case R.id.tvConfirm:
                save();
                break;
        }
    }

    private void save() {

    }


    @Override
    public void onDateSet(DatePickerDialog datePickerDialog, int year, int month, int day) {
        Bundle bundle = datePickerDialog.getArguments();
        if (bundle == null) return;
        String type = bundle.getString("type");
        if (TextUtils.isEmpty(type)) return;
        String date = String.valueOf(year) + '-' + month + '-' + day;
        switch (type) {
            case "shengri":
                tvShengri.setText(date);
                break;
            case "qianru":
                tvQianru.setText(date);
                break;
            case "qianchu":
                tvQianchu.setText(date);
                break;
            case "jianka":
                tvJianka.setText(date);
                break;
        }
    }

    private void chooseGenderDialog() {
        final String[] gender = {"男", "女"};
        new MaterialDialog.Builder(mActivity)
                .title("请选择性别")
                .items(gender)
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvGender.setText(gender[which]);
                    return true;
                })
                .negativeText("取消")
                .build()
                .show();
    }
}
