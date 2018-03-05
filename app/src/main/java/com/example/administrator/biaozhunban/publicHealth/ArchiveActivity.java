package com.example.administrator.biaozhunban.publicHealth;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.blankj.utilcode.util.ToastUtils;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;
import com.example.administrator.biaozhunban.comm.Utils;
import com.example.administrator.biaozhunban.greendao.NativesDao;
import com.example.administrator.biaozhunban.greendao.daomanager.EntityManager;
import com.example.administrator.biaozhunban.greendao.entity.Natives;
import com.fourmob.datetimepicker.date.DatePickerDialog;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/1/12.
 */

public class ArchiveActivity extends BaseActivity implements DatePickerDialog.OnDateSetListener {

    @BindView(R.id.editText_tableNumber)
    EditText editTextTableNumber;
    @BindView(R.id.editText_peopleName)
    EditText editTextPeopleName;
    @BindView(R.id.text_select_sex)
    TextView textSelectSex;
    @BindView(R.id.editText_pepole_code)
    EditText editTextPepoleCode;
    @BindView(R.id.editText_currAddress)
    EditText editTextCurrAddress;
    @BindView(R.id.editText_hjdz)
    EditText editTextHjdz;
    @BindView(R.id.editText_lxdh)
    EditText editTextLxdh;
    @BindView(R.id.text_birthday)
    TextView textBirthday;
    @BindView(R.id.editText_xzjdmc)
    EditText editTextXzjdmc;
    @BindView(R.id.editText_cjwhmc)
    EditText editTextCjwhmc;
    @BindView(R.id.editText_zrys)
    EditText editTextZrys;
    @BindView(R.id.text_createdate)
    TextView textCreatedate;

    @Override
    protected int getLayout() {
        return R.layout.public_health_activity_archives_detail;
    }

    @Override
    protected void initView() {
        setTitle("居民健康档案");
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.ll_duka,R.id.ll_leixing,R.id.text_select_sex, R.id.text_birthday, R.id.text_createdate, R.id.text_confrim})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text_select_sex:
                chooseGenderDialog();
                break;
            case R.id.text_birthday:
                Utils.chooseDateDialog(this,"birthdate",this);
                break;
            case R.id.text_createdate:
                Utils.chooseDateDialog(this,"createdate",this);
                break;
            case R.id.ll_leixing:
                chooseTypeDialog();
                break;
            case R.id.ll_duka:
                readIDCard();
                break;
            case R.id.text_confrim:
                saveData();
                break;

        }
    }

    private void chooseTypeDialog() {
        new MaterialDialog.Builder(mActivity)
                .title("请选择USB读卡类型")
                .titleColor(getResources().getColor(R.color.blue2))
                .items("身份证","居民健康卡","社保卡")
                .itemsCallbackSingleChoice(-1, new MaterialDialog.ListCallbackSingleChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {
                            readUSB(which);
                        return false;
                    }
                })
                .show();
    }

    private void readUSB(int type) {
        ToastUtils.showShort("USB读取卡!");
    }


    private void readIDCard() {
    }

    private void saveData() {

        String idcard = editTextPepoleCode.getText().toString().trim();
        if (TextUtils.isEmpty(idcard)) {
            ToastUtils.showShort("身份证号不能为空!");
            return;
        }
        NativesDao nativeDao = EntityManager.getInstance().nativeDao();
        long count = nativeDao.queryBuilder().where(NativesDao.Properties.Na_idcard.eq(idcard)).count();
        if (count == 1) {
            ToastUtils.showShort("当前身份证号已经存在于数据库中!");
            return;
        }
        String name = editTextPeopleName.getText().toString().trim();
        if (TextUtils.isEmpty(name)) {
            ToastUtils.showShort("姓名不能为空!");
            return;
        }
        String strGender = textSelectSex.getText().toString().trim();
        if (TextUtils.equals("请选择", strGender)) {
            ToastUtils.showShort("性别不能为空!");
            return;
        }

        String birthday = textBirthday.getText().toString().trim();
        if (TextUtils.equals("请选择", birthday)) {
            ToastUtils.showShort("出生年月不能为空!");
            return;
        }

        int age = Utils.getAgeFromBirthTime(birthday);

        String currAddr = editTextCurrAddress.getText().toString().trim();
        String hujiAddr = editTextHjdz.getText().toString().trim();
        String tel = editTextLxdh.getText().toString().trim();
        String jiedao = editTextXzjdmc.getText().toString().trim();
        String cunweihui = editTextCjwhmc.getText().toString().trim();
        String doctor = editTextZrys.getText().toString().trim();
        String createdate = textCreatedate.getText().toString().trim();
        if (TextUtils.equals("请选择", createdate)) {//当前日期默认为创建日期!
            createdate = new SimpleDateFormat("yyyy-mm-dd").format(new Date());
        }
        int gender;
        if (TextUtils.equals("男", strGender)) {
            gender = 0;
        } else {
            gender = 1;//女
        }
        Natives natives = new Natives(null, Utils.getUUID(), Utils.getUUID(), name, gender, age, idcard, currAddr, hujiAddr,
                tel, birthday, jiedao, cunweihui, doctor, createdate, null,null);

        long rowId = nativeDao.insert(natives);
        if (rowId == 0) {//插入失败
            ToastUtils.showShort("保存数据失败,稍后重试!");
        } else {
            startActivity(ListActivity.class);
            finish();
        }

    }

    private void chooseGenderDialog() {
        final String[] gender = {"男", "女"};
        new MaterialDialog.Builder(mActivity)
                .title("请选择性别")
                .items(gender)
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    textSelectSex.setText(gender[which]);
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
        if(TextUtils.isEmpty(type))return;
        if (TextUtils.equals(type, "birthdate"))
            textBirthday.setText(String.valueOf(year) + '-' + month + '-' + day);
        else
            textCreatedate.setText(String.valueOf(year) + '-' + month + '-' + day);
    }


}
