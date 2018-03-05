package com.example.administrator.biaozhunban.publicHealth;

import android.os.Bundle;
import android.support.annotation.IntRange;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.blankj.utilcode.util.ToastUtils;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;
import com.example.administrator.biaozhunban.greendao.daomanager.EntityManager;
import com.example.administrator.biaozhunban.greendao.entity.JianKangJiaoYuJiLu;
import com.fourmob.datetimepicker.date.DatePickerDialog;
import com.example.administrator.biaozhunban.comm.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by Administrator on 2018/2/5.
 */

public class JianKangJiaoYuDengJiActivity extends BaseActivity implements DatePickerDialog.OnDateSetListener {
    @BindView(R.id.NavigateHomeLinearLayout)
    LinearLayout NavigateHomeLinearLayout;
    @BindView(R.id.text_hdsj)
    TextView textHdsj;
    @BindView(R.id.editText_hddd)
    EditText editTextHddd;
    @BindView(R.id.editText_hdxx)
    EditText editTextHdxx;
    @BindView(R.id.editText_hdzt)
    EditText editTextHdzt;
    @BindView(R.id.editText_zzz)
    EditText editTextZzz;
    @BindView(R.id.editText_jsjkjyrylb)
    EditText editTextJsjkjyrylb;
    @BindView(R.id.editText_jsjkjyrs)
    EditText editTextJsjkjyrs;
    @BindView(R.id.editText_zlffzljsl)
    EditText editTextZlffzljsl;
    @BindView(R.id.editText_hdnr)
    EditText editTextHdnr;
    @BindView(R.id.editText_hdzjpj)
    EditText editTextHdzjpj;
    @BindView(R.id.text_cdcl)
    TextView textCdcl;
    @BindView(R.id.editText_tbw)
    EditText editTextTbw;
    @BindView(R.id.editText_fzw)
    EditText editTextFzw;
    @BindView(R.id.text_tbsj)
    TextView textTbsj;
    private JianKangJiaoYuJiLu jiLuEntity;
    private final String[] category = {"书面材料", "图片材料", "印刷材料", "影音材料", "签到表", "其他材料"};
    private int cunDangType = -1;

    @Override
    protected int getLayout() {
        return R.layout.public_health_activity_educationrecord;
    }

    @Override
    protected void initView() {
        setTitle("健康教育活动记录表");
        NavigateHomeLinearLayout.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void initData() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) return;
        jiLuEntity = (JianKangJiaoYuJiLu) extras.getSerializable("obj");
        if (jiLuEntity == null) {
            ToastUtils.showShort("数据异常,请返回重试!");
            return;
        }
        textHdsj.setText(jiLuEntity.getJkjy_hdrq());
        editTextHddd.setText(jiLuEntity.getJkjy_hddd());
        editTextHdxx.setText(jiLuEntity.getJkjy_hdxs());
        editTextHdzt.setText(jiLuEntity.getJkjy_hdzt());
        editTextZzz.setText(jiLuEntity.getJkjy_zzz());
        editTextJsjkjyrylb.setText(jiLuEntity.getJkjy_jsrylb());
        editTextJsjkjyrs.setText(jiLuEntity.getJkjy_jsrs());
        editTextZlffzljsl.setText(jiLuEntity.getJkjy_zlffsl());
        editTextHdnr.setText(jiLuEntity.getJkjy_hdnr());
        editTextHdzjpj.setText(jiLuEntity.getJkjy_zjpj());
        cunDangType = jiLuEntity.getJkjy_cdcl();
        if (cunDangType >= 0 && cunDangType < category.length)
            textCdcl.setText(category[cunDangType]);
        editTextTbw.setText(jiLuEntity.getJkjy_tbr());
        editTextFzw.setText(jiLuEntity.getJkjy_fzr());
        textTbsj.setText(jiLuEntity.getJkjy_tbrq());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.text_hdsj, R.id.text_cdcl, R.id.text_tbsj, R.id.text_confrim})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text_hdsj:
                Utils.chooseDateDialog(this, "hdsj", this);
                break;
            case R.id.text_cdcl:
                chooseCundangType();
                break;
            case R.id.text_tbsj:
                Utils.chooseDateDialog(this, "tbsj", this);
                break;
            case R.id.text_confrim:
                save();
                break;
        }
    }

    private void save() {
        String hdsj = textHdsj.getText().toString().trim();
        String hddd = editTextHddd.getText().toString().trim();
        String hdxs = editTextHdxx.getText().toString().trim();
        String hdzt = editTextHdzt.getText().toString().trim();
        String zzz = editTextZzz.getText().toString().trim();
        String shouzhongleibie = editTextJsjkjyrylb.getText().toString().trim();
        String jieshourenshu = editTextJsjkjyrs.getText().toString().trim();
        String ziliaozhonglei = editTextZlffzljsl.getText().toString().trim();
        String hdnr = editTextHdnr.getText().toString().trim();
        String hdzj = editTextHdzjpj.getText().toString().trim();
        String tbr = editTextTbw.getText().toString().trim();
        String fzr=editTextFzw.getText().toString().trim();
        String tbrq = textTbsj.getText().toString().trim();

        jiLuEntity.setJkjy_cdcl(cunDangType);
        jiLuEntity.setJkjy_hdrq(hdsj);
        jiLuEntity.setJkjy_hddd(hddd);
        jiLuEntity.setJkjy_hdxs(hdxs);
        jiLuEntity.setJkjy_hdzt(hdzt);
        jiLuEntity.setJkjy_zzz(zzz);
        jiLuEntity.setJkjy_jsrylb(shouzhongleibie);
        jiLuEntity.setJkjy_jsrs(jieshourenshu);
        jiLuEntity.setJkjy_zlffsl(ziliaozhonglei);
        jiLuEntity.setJkjy_hdnr(hdnr);
        jiLuEntity.setJkjy_zjpj(hdzj);
        jiLuEntity.setJkjy_tbr(tbr);
        jiLuEntity.setJkjy_fzr(fzr);
        jiLuEntity.setJkjy_tbrq(tbrq);

        EntityManager.getInstance().jianKangJiaoYuJiLuDao().rx()
                .update(jiLuEntity)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(jilu->{ToastUtils.showShort("保存成功!");finish();},error->{ToastUtils.showShort("保存失败,请重试!");});
    }

    private void chooseCundangType() {
        new MaterialDialog.Builder(mActivity)
                .titleColor(getResources().getColor(R.color.blue2))
                .title("请选择存档材料")
                .items(category)
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    cunDangType = which;
                    textCdcl.setText(category[cunDangType]);
                    return false;
                })
                .show();
    }

    @Override
    public void onDateSet(DatePickerDialog datePickerDialog, int year, int month, int day) {
        Bundle bundle = datePickerDialog.getArguments();
        if (bundle == null) return;
        String type = bundle.getString("type");
        if (TextUtils.isEmpty(type)) return;
        if (TextUtils.equals("hdsj", type)) {
            textHdsj.setText(String.valueOf(year) + "-" + month + "-" + day);
        } else if (TextUtils.equals("tbsj", type)) {
            textTbsj.setText(String.valueOf(year) + "-" + month + "-" + day);
        }
    }
}
