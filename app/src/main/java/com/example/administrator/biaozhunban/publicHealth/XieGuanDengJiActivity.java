package com.example.administrator.biaozhunban.publicHealth;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.blankj.utilcode.util.ToastUtils;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;
import com.example.administrator.biaozhunban.comm.Utils;
import com.example.administrator.biaozhunban.greendao.WeiShengXieGuanBiaoDao;
import com.example.administrator.biaozhunban.greendao.daomanager.EntityManager;
import com.example.administrator.biaozhunban.greendao.entity.WeiShengXieGuanBiao;
import com.fourmob.datetimepicker.date.DatePickerDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by Administrator on 2018/2/5.
 */

public class XieGuanDengJiActivity extends BaseActivity implements DatePickerDialog.OnDateSetListener {
    @BindView(R.id.editText_yljg)
    EditText editTextYljg;
    @BindView(R.id.text_fxsj)
    TextView textFxsj;
    @BindView(R.id.text_xxlb)
    TextView textXxlb;
    @BindView(R.id.editText_xxnr)
    EditText editTextXxnr;
    @BindView(R.id.text_bbsj)
    TextView textBbsj;
    @BindView(R.id.editText_bbr)
    EditText editTextBbr;
    @BindView(R.id.NavigateHomeLinearLayout)
    LinearLayout NavigateHomeLinearLayout;
    private WeiShengXieGuanBiao xieGuanEntity;
    private static final String[] category = {"食品安全", "饮用水卫生", "职业病危害", "学校卫生", "非法行医(采供血)"};
    private int xxlb = -1;

    @Override
    protected int getLayout() {
        return R.layout.public_health_activity_supervisionreg;
    }

    @Override
    protected void initView() {
        setTitle("卫生监督协管信息报告登记表");
        NavigateHomeLinearLayout.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void initData() {
        Bundle extras = getIntent().getExtras();
        xieGuanEntity = (WeiShengXieGuanBiao) extras.getSerializable("obj");
        if (xieGuanEntity == null) return;
        editTextYljg.setText(xieGuanEntity.getWsxx_yljg());
        textFxsj.setText(xieGuanEntity.getWsxx_fxsj());
        xxlb = xieGuanEntity.getWsxx_xxlb();
        textXxlb.setText(category[xxlb]);
        editTextXxnr.setText(xieGuanEntity.getWsxx_xxnr());
        textBbsj.setText(xieGuanEntity.getWsxx_bgsj());
        editTextBbr.setText(xieGuanEntity.getWsxx_bgr());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.text_fxsj, R.id.text_xxlb, R.id.text_bbsj, R.id.text_confrim})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text_fxsj:
                Utils.chooseDateDialog(this, "fxsj", this);
                break;
            case R.id.text_xxlb:
                chooseXxlbDialog();
                break;
            case R.id.text_bbsj:
                Utils.chooseDateDialog(this, "bgsj", this);
                break;
            case R.id.text_confrim:
                save();
                break;
        }
    }

    private void save() {
        if (xieGuanEntity == null) {
            ToastUtils.showShort("操作异常!");
            finish();
        }
        String yljg = editTextYljg.getText().toString().trim();
        String fxsj = textFxsj.getText().toString().trim();
        String xxnr = editTextXxnr.getText().toString().trim();
        String bgsj = textBbsj.getText().toString().trim();
        String bgr = editTextBbr.getText().toString().trim();
        xieGuanEntity.setWsxx_yljg(yljg);
        xieGuanEntity.setWsxx_fxsj(fxsj);
        xieGuanEntity.setWsxx_xxlb(xxlb);
        xieGuanEntity.setWsxx_xxnr(xxnr);
        xieGuanEntity.setWsxx_bgsj(bgsj);
        xieGuanEntity.setWsxx_bgr(bgr);

        WeiShengXieGuanBiaoDao xieGuanBiaoDao = EntityManager.getInstance().weiShengXieGuanBiaoDao();
        xieGuanBiaoDao.rx().update(xieGuanEntity)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeiShengXieGuanBiao>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtils.showShort("保存失败!");
                    }

                    @Override
                    public void onNext(WeiShengXieGuanBiao weiShengXieGuanBiao) {
                        ToastUtils.showShort("保存成功!");
                        finish();
                    }
                });
    }

    private void chooseXxlbDialog() {
        new MaterialDialog.Builder(mActivity)
                .title("请选择信息类别")
                .titleColor(getResources().getColor(R.color.blue2))
                .items(category)
                .itemsCallbackSingleChoice(-1, new MaterialDialog.ListCallbackSingleChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {
                        xxlb = which;
                        textXxlb.setText(category[xxlb]);
                        return false;
                    }
                })
                .negativeText("取消")
                .show();
    }

    @Override
    public void onDateSet(DatePickerDialog datePickerDialog, int year, int month, int day) {
        Bundle bundle = datePickerDialog.getArguments();
        if (bundle == null) return;
        String type = bundle.getString("type");
        if (TextUtils.isEmpty(type)) return;
        if (TextUtils.equals("fxsj", type)) {
            textFxsj.setText(String.valueOf(year) + "-" + month + "-" + day);
        } else if (TextUtils.equals("bgsj", type)) {
            textBbsj.setText(String.valueOf(year) + "-" + month + "-" + day);
        }
    }
}
