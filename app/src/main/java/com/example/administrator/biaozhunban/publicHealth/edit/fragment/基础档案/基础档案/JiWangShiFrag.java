package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.基础档案;

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

public class JiWangShiFrag extends BaseFrag implements DatePickerDialog.OnDateSetListener {
    @BindView(R.id.tvJB1)
    TextView tvJB1;
    @BindView(R.id.tvQZ1)
    TextView tvQZ1;
    @BindView(R.id.tvJB2)
    TextView tvJB2;
    @BindView(R.id.tvQZ2)
    TextView tvQZ2;
    @BindView(R.id.tvJB3)
    TextView tvJB3;
    @BindView(R.id.tvQZ3)
    TextView tvQZ3;
    @BindView(R.id.tvJB4)
    TextView tvJB4;
    @BindView(R.id.tvQZ4)
    TextView tvQZ4;
    @BindView(R.id.tvJB5)
    TextView tvJB5;
    @BindView(R.id.tvQZ5)
    TextView tvQZ5;
    @BindView(R.id.tvJB6)
    TextView tvJB6;
    @BindView(R.id.tvQZ6)
    TextView tvQZ6;
    @BindView(R.id.etZhongliu)
    EditText etZhongliu;
    @BindView(R.id.etZhiyebing)
    EditText etZhiyebing;
    @BindView(R.id.etQita)
    EditText etQita;
    @BindView(R.id.rgShoushu)
    RadioGroup rgShoushu;
    @BindView(R.id.etShoushu1)
    EditText etShoushu1;
    @BindView(R.id.tvShoushushijian1)
    TextView tvShoushushijian1;
    @BindView(R.id.etShoushu2)
    EditText etShoushu2;
    @BindView(R.id.tvShoushushijian2)
    TextView tvShoushushijian2;
    @BindView(R.id.rgWaishang)
    RadioGroup rgWaishang;
    @BindView(R.id.etWS1)
    EditText etWS1;
    @BindView(R.id.etWS2)
    EditText etWS2;
    @BindView(R.id.rgShuxie)
    RadioGroup rgShuxie;
    @BindView(R.id.etShuxieyuanyin1)
    EditText etShuxieyuanyin1;
    @BindView(R.id.tvShuxieshijian1)
    TextView tvShuxieshijian1;
    @BindView(R.id.etShuxieyuanyin2)
    EditText etShuxieyuanyin2;
    @BindView(R.id.tvShuxieshijian2)
    TextView tvShuxieshijian2;
    @BindView(R.id.tvWSSJ1)
    TextView tvWSSJ1;
    @BindView(R.id.tvWSSJ2)
    TextView tvWSSJ2;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_jiwangshi;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvJB1, R.id.tvQZ1, R.id.tvJB2, R.id.tvQZ2, R.id.tvJB3, R.id.tvQZ3,
            R.id.tvJB4, R.id.tvQZ4, R.id.tvJB5, R.id.tvQZ5, R.id.tvJB6, R.id.tvQZ6,
            R.id.tvShoushushijian1, R.id.tvShoushushijian2, R.id.tvWSSJ1,
            R.id.tvWSSJ2, R.id.tvShuxieshijian1,
            R.id.tvShuxieshijian2, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvJB1:
                chooseJiBingDialog(1);
                break;
            case R.id.tvQZ1:
                Utils.chooseDateDialog(mActivity, "qz1", this);
                break;
            case R.id.tvJB2:
                chooseJiBingDialog(2);
                break;
            case R.id.tvQZ2:
                Utils.chooseDateDialog(mActivity, "qz2", this);
                break;
            case R.id.tvJB3:
                chooseJiBingDialog(3);
                break;
            case R.id.tvQZ3:
                Utils.chooseDateDialog(mActivity, "qz3", this);
                break;
            case R.id.tvJB4:
                chooseJiBingDialog(4);
                break;
            case R.id.tvQZ4:
                Utils.chooseDateDialog(mActivity, "qz4", this);
                break;
            case R.id.tvJB5:
                chooseJiBingDialog(5);
                break;
            case R.id.tvQZ5:
                Utils.chooseDateDialog(mActivity, "qz5", this);
                break;
            case R.id.tvJB6:
                chooseJiBingDialog(6);
                break;
            case R.id.tvQZ6:
                Utils.chooseDateDialog(mActivity, "qz6", this);
                break;
            case R.id.tvShoushushijian1:
                Utils.chooseDateDialog(mActivity, "shoushu1", this);
                break;
            case R.id.tvShoushushijian2:
                Utils.chooseDateDialog(mActivity, "shoushu2", this);
                break;
            case R.id.tvWSSJ1:
                Utils.chooseDateDialog(mActivity, "waishang1", this);
                break;
            case R.id.tvWSSJ2:
                Utils.chooseDateDialog(mActivity, "waishang2", this);
                break;
            case R.id.tvShuxieshijian1:
                Utils.chooseDateDialog(mActivity, "shuxie1", this);
                break;
            case R.id.tvShuxieshijian2:
                Utils.chooseDateDialog(mActivity, "shuxie2", this);
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
                            tvJB1.setText(text);
                            break;
                        case 2:
                            tvJB2.setText(text);
                            break;
                        case 3:
                            tvJB3.setText(text);
                            break;
                        case 4:
                            tvJB4.setText(text);
                            break;
                        case 5:
                            tvJB5.setText(text);
                            break;
                        case 6:
                            tvJB6.setText(text);
                            break;
                    }
                    return true;
                })
                .negativeText("取消")
                .build()
                .show();
    }

    @Override
    public void onDateSet(DatePickerDialog datePickerDialog, int year, int month, int day) {
        Bundle bundle = datePickerDialog.getArguments();
        if (bundle == null) return;
        String type = bundle.getString("type");
        if (TextUtils.isEmpty(type)) return;
        String date = String.valueOf(year) + '-' + month + '-' + day;
        switch (type) {
            case "qz1":
                tvQZ1.setText(date);
                break;
            case "qz2":
                tvQZ2.setText(date);
                break;
            case "qz3":
                tvQZ3.setText(date);
                break;
            case "qz4":
                tvQZ4.setText(date);
                break;
            case "qz5":
                tvQZ5.setText(date);
                break;
            case "qz6":
                tvQZ6.setText(date);
                break;
            case "shoushu1":
                tvShoushushijian1.setText(date);
                break;
            case "shoushu2":
                tvShoushushijian2.setText(date);
                break;
            case "shuxie1":
                tvShuxieshijian1.setText(date);
                break;
            case "shuxie2":
                tvShuxieshijian2.setText(date);
                break;
            case "waishang1":
                tvWSSJ1.setText(date);
                break;
            case "waishang2":
                tvWSSJ2.setText(date);
                break;
        }
    }


}
