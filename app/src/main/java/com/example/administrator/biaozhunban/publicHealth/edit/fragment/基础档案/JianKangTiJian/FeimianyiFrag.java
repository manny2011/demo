package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

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

public class FeimianyiFrag extends BaseFrag implements DatePickerDialog.OnDateSetListener {
    @BindView(R.id.etMing1)
    EditText etMing1;
    @BindView(R.id.tvRQ1)
    TextView tvRQ1;
    @BindView(R.id.etJiGou1)
    EditText etJiGou1;
    @BindView(R.id.etMing2)
    EditText etMing2;
    @BindView(R.id.tvRQ2)
    TextView tvRQ2;
    @BindView(R.id.etJiGou2)
    EditText etJiGou2;
    @BindView(R.id.etMing3)
    EditText etMing3;
    @BindView(R.id.tvRQ3)
    TextView tvRQ3;
    @BindView(R.id.etJiGou3)
    EditText etJiGou3;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_feimianyiyufang;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvRQ1, R.id.tvRQ2, R.id.tvRQ3, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvRQ1:
                Utils.chooseDateDialog(mActivity, "rq1", this);
                break;
            case R.id.tvRQ2:
                Utils.chooseDateDialog(mActivity, "rq2", this);
                break;
            case R.id.tvRQ3:
                Utils.chooseDateDialog(mActivity, "rq3", this);
                break;
            case R.id.tvConfirm:
                break;
        }
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
                tvRQ1.setText(date);
                break;
            case "qz2":
                tvRQ2.setText(date);
                break;
            case "qz3":
                tvRQ3.setText(date);
                break;
        }
    }
}
