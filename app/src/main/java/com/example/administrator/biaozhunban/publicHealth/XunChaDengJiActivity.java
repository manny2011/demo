package com.example.administrator.biaozhunban.publicHealth;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.blankj.utilcode.util.ToastUtils;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;
import com.example.administrator.biaozhunban.comm.Utils;
import com.example.administrator.biaozhunban.greendao.WeiShengXunChaBiaoDao;
import com.example.administrator.biaozhunban.greendao.daomanager.EntityManager;
import com.example.administrator.biaozhunban.greendao.entity.WeiShengXunChaBiao;
import com.fourmob.datetimepicker.date.DatePickerDialog;

import butterknife.BindView;
import butterknife.OnClick;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by Administrator on 2018/2/5.
 */

public class XunChaDengJiActivity extends BaseActivity implements DatePickerDialog.OnDateSetListener{
    @BindView(R.id.NavigateHomeLinearLayout)
    LinearLayout NavigateHomeLinearLayout;
    @BindView(R.id.editText_yljg)
    EditText editTextYljg;
    @BindView(R.id.editText_nd)
    EditText editTextNd;
    @BindView(R.id.editText_xcddynr)
    EditText editTextXcddynr;
    @BindView(R.id.editText_fxdzywt)
    EditText editTextFxdzywt;
    @BindView(R.id.text_xcrq)
    TextView textXcrq;
    @BindView(R.id.editText_xcr)
    EditText editTextXcr;
    @BindView(R.id.editText_bz)
    EditText editTextBz;
    private WeiShengXunChaBiao xunchaEntity;

    @Override
    protected int getLayout() {
        return R.layout.public_health_activity_supervisionpatrol;
    }

    @Override
    protected void initView() {
        setTitle("卫生监督协管巡查登记表");
        NavigateHomeLinearLayout.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void initData() {
        xunchaEntity = (WeiShengXunChaBiao) getIntent().getSerializableExtra("obj");
        if(xunchaEntity ==null)return;
        editTextYljg.setText(xunchaEntity.getWsxc_yljg());
        editTextNd.setText(xunchaEntity.getWsxc_nd());
        editTextXcddynr.setText(xunchaEntity.getWsxc_ddhnr());
        editTextFxdzywt.setText(xunchaEntity.getWsxc_zywt());
        textXcrq.setText(xunchaEntity.getWsxc_rq());
        editTextXcr.setText(xunchaEntity.getWsxc_xcr());
        editTextBz.setText(xunchaEntity.getWsxc_note());
    }

    @OnClick({R.id.text_xcrq, R.id.text_confrim})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text_xcrq:
                Utils.chooseDateDialog(this,"xcrq",this);
                break;
            case R.id.text_confrim:
                save();
                break;
        }
    }

    private void save() {
        if (xunchaEntity == null) {
            ToastUtils.showShort("操作异常!");
            finish();
        }
        String yljg = editTextYljg.getText().toString().trim();
        String niand = editTextNd.getText().toString().trim();
        String didian = editTextXcddynr.getText().toString().trim();
        String weiti = editTextFxdzywt.getText().toString().trim();
        String rq = textXcrq.getText().toString().trim();
        String xuncharen = editTextXcr.getText().toString().trim();
        String beizhu = editTextBz.getText().toString().trim();
        xunchaEntity.setWsxc_yljg(yljg);
        xunchaEntity.setWsxc_nd(niand);
        xunchaEntity.setWsxc_ddhnr(didian);
        xunchaEntity.setWsxc_zywt(weiti);
        xunchaEntity.setWsxc_rq(rq);
        xunchaEntity.setWsxc_xcr(xuncharen);
        xunchaEntity.setWsxc_note(beizhu);

        WeiShengXunChaBiaoDao xunChaBiaoDao = EntityManager.getInstance().weiShengXunChaBiaoDao();
        xunChaBiaoDao.rx().update(xunchaEntity)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeiShengXunChaBiao>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtils.showShort("保存失败!");
                    }

                    @Override
                    public void onNext(WeiShengXunChaBiao xunChaBiaoEntity) {
                        ToastUtils.showShort("保存成功!");
                        finish();
                    }
                });
    }
    @Override
    public void onDateSet(DatePickerDialog datePickerDialog, int year, int month, int day) {
        Bundle bundle = datePickerDialog.getArguments();
        if (bundle == null) return;
        String type = bundle.getString("type");
        if (TextUtils.isEmpty(type)) return;
        if (TextUtils.equals("xcrq", type)) {
            textXcrq.setText(String.valueOf(year) + "-" + month + "-" + day);
        }
    }
}
