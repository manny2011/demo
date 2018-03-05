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

public class ZhuyuanzhiliaoFrag extends BaseFrag implements DatePickerDialog.OnDateSetListener {
    @BindView(R.id.tvRuyuan1)
    TextView tvRuyuan1;
    @BindView(R.id.tvChuyuan1)
    TextView tvChuyuan1;
    @BindView(R.id.etZhuYuanyin1)
    EditText etZhuYuanyin1;
    @BindView(R.id.etZhuMing1)
    EditText etZhuMing1;
    @BindView(R.id.etZhuYuanHao1)
    EditText etZhuYuanHao1;
    @BindView(R.id.tvRuyuan2)
    TextView tvRuyuan2;
    @BindView(R.id.tvChuyuan2)
    TextView tvChuyuan2;
    @BindView(R.id.etZhuYuanyin2)
    EditText etZhuYuanyin2;
    @BindView(R.id.etZhuMing2)
    EditText etZhuMing2;
    @BindView(R.id.etZhuYuanHao2)
    EditText etZhuYuanHao2;
    @BindView(R.id.tvChuangRu1)
    TextView tvChuangRu1;
    @BindView(R.id.tvChuangChu1)
    TextView tvChuangChu1;
    @BindView(R.id.etChuangYin1)
    EditText etChuangYin1;
    @BindView(R.id.etChuangMing1)
    EditText etChuangMing1;
    @BindView(R.id.etChuangHao1)
    EditText etChuangHao1;
    @BindView(R.id.tvChuangRu2)
    TextView tvChuangRu2;
    @BindView(R.id.tvChuangChu2)
    TextView tvChuangChu2;
    @BindView(R.id.etChuangYin2)
    EditText etChuangYin2;
    @BindView(R.id.etChuangMing2)
    EditText etChuangMing2;
    @BindView(R.id.etChuangHao2)
    EditText etChuangHao2;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_zhuyuanzhiliao;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvRuyuan1, R.id.tvChuyuan1, R.id.tvRuyuan2, R.id.tvChuyuan2, R.id.tvChuangRu1, R.id.tvChuangChu1, R.id.tvChuangRu2, R.id.tvChuangChu2, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvRuyuan1:
                Utils.chooseDateDialog(mActivity,"zhu_ru1",this);
                break;
            case R.id.tvChuyuan1:
                Utils.chooseDateDialog(mActivity,"zhu_chu1",this);
                break;
            case R.id.tvRuyuan2:
                Utils.chooseDateDialog(mActivity,"zhu_ru2",this);
                break;
            case R.id.tvChuyuan2:
                Utils.chooseDateDialog(mActivity,"zhu_chu2",this);
                break;
            case R.id.tvChuangRu1:
                Utils.chooseDateDialog(mActivity,"chuang_jian1",this);
                break;
            case R.id.tvChuangChu1:
                Utils.chooseDateDialog(mActivity,"chuang_che1",this);
                break;
            case R.id.tvChuangRu2:
                Utils.chooseDateDialog(mActivity,"chuang_jian2",this);
                break;
            case R.id.tvChuangChu2:
                Utils.chooseDateDialog(mActivity,"chuang_che2",this);
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
            case "zhu_ru1":
                tvRuyuan1.setText(date);
                break;
            case "zhu_chu1":
                tvChuyuan1.setText(date);
                break;
            case "zhu_ru2":
                tvRuyuan2.setText(date);
                break;
            case "zhu_chu2":
                tvChuyuan2.setText(date);
                break;
            case "chuang_jian1":
                tvChuangRu1.setText(date);
                break;
            case "chuang_che1":
                tvChuangChu1.setText(date);
                break;
            case "chuang_jian2":
                tvChuangRu2.setText(date);
                break;
            case "chuang_che2":
                tvChuangChu2.setText(date);
                break;

        }
    }
}
