package com.example.administrator.biaozhunban.publicHealth;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.blankj.utilcode.util.ToastUtils;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;
import com.example.administrator.biaozhunban.comm.Utils;
import com.example.administrator.biaozhunban.constant.IntentConst;
import com.fourmob.datetimepicker.date.DatePickerDialog;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/1/12.
 */

public class QueryActivity extends BaseActivity implements DatePickerDialog.OnDateSetListener {
    @BindView(R.id.editText_idno)
    EditText editTextIdno;
    @BindView(R.id.editText_jkdah)
    EditText editTextJkdah;
    @BindView(R.id.editText_xm)
    EditText editTextXm;
    @BindView(R.id.editText_address)
    EditText editTextAddress;
    @BindView(R.id.editText_age)
    EditText editTextAge;
    @BindView(R.id.editText_age1)
    EditText editTextAge1;
    @BindView(R.id.radioGroup1)
    RadioGroup radioGroup1;
    @BindView(R.id.checkBoxPregnantWoman)
    CheckBox checkBoxPregnantWoman;
    @BindView(R.id.checkBoxHypertension)
    CheckBox checkBoxHypertension;
    @BindView(R.id.checkBoxDiabetes)
    CheckBox checkBoxDiabetes;
    @BindView(R.id.checkBoxHolergasia)
    CheckBox checkBoxHolergasia;
    @BindView(R.id.NavigateHomeLinearLayout)
    LinearLayout navigateHomeLinearLayout;
    @BindView(R.id.text_select_sex)
    TextView textSelectSex;
    @BindView(R.id.text_select_jdsj1)
    TextView textSelectJdsj1;
    @BindView(R.id.text_select_jdsj2)
    TextView textSelectJdsj2;

    @Override
    protected int getLayout() {
        return R.layout.public_health_activity_query_and_archives;
    }

    @Override
    protected void initView() {
        setTitle("筛选条件");
        navigateHomeLinearLayout.setVisibility(View.GONE);
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

    @OnClick({R.id.text_select_sex, R.id.text_confrim, R.id.text_select_jdsj1, R.id.text_select_jdsj2
            ,R.id.text_new, R.id.text_list, R.id.text_usb, R.id.text_search})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text_select_jdsj1:
                Utils.chooseDateDialog(this,"fromDate",this);
                break;
            case R.id.text_select_jdsj2:
                Utils.chooseDateDialog(this,"toDate",this);
                break;
            case R.id.text_select_sex:
                chooseGenderDialog();
                break;
            case R.id.text_confrim:
                query();
                break;
            case R.id.text_new:
                startActivity(ArchiveActivity.class);
                break;
            case R.id.text_list:
                startActivity(ListActivity.class,null);
                break;
            case R.id.text_usb:
                showCardType();
                break;
            case R.id.text_search:
                break;
        }
    }

    private void showCardType() {
        new MaterialDialog.Builder(mActivity)
                .title("请选择USB读卡类型")
                .titleColor(getResources().getColor(R.color.blue2))
                .dividerColor(getResources().getColor(R.color.gray2))
                .items("身份证","居民健康卡","社保卡")
                .itemsCallbackSingleChoice(-1, new MaterialDialog.ListCallbackSingleChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {

                        return false;
                    }
                })
                .show();
    }

    private void query() {
        String idcard = editTextIdno.getText().toString().trim();
        String danganhao = editTextJkdah.getText().toString().trim();
        String name = editTextXm.getText().toString().trim();
        String strGender = textSelectSex.getText().toString().trim();
        String addr = editTextAddress.getText().toString().trim();
        String strFromAge = editTextAge.getText().toString().trim();
        String strToAge = editTextAge1.getText().toString().trim();
        String fromDate = textSelectJdsj1.getText().toString().trim();
        String toDate = textSelectJdsj2.getText().toString().trim();
        int checkedRadioButtonId = radioGroup1.getCheckedRadioButtonId();
        switch (checkedRadioButtonId) {
            case R.id.checkBox07child:
                strFromAge = "0";
                strToAge = "7";
                break;
            case R.id.checkBox1549woman:
                strGender = "女";
                strFromAge = "15";
                strToAge = "49";
                break;
            case R.id.checkBox65oldman:
                strFromAge = "65";
                strToAge = "150";
                break;
            default:
                break;
        }

        boolean pregnent = checkBoxPregnantWoman.isChecked();
        boolean hyperTension = checkBoxHypertension.isChecked();
        boolean diabet = checkBoxDiabetes.isChecked();
        boolean jingshenbing = checkBoxHolergasia.isChecked();

        int gender = TextUtils.isEmpty(strGender) ? -1 : (TextUtils.equals("男", strFromAge) ? 0 : 1);

        Bundle bundle = new Bundle();
        bundle.putString(IntentConst.idcard, idcard);
        bundle.putString(IntentConst.danganhao, danganhao);
        bundle.putString(IntentConst.name, name);
        bundle.putInt(IntentConst.gender, gender);
        bundle.putString(IntentConst.addr, addr);
        bundle.putString(IntentConst.strFromAge, strFromAge);
        bundle.putString(IntentConst.strToAge, strToAge);
        bundle.putString(IntentConst.strFromDate, fromDate);
        bundle.putString(IntentConst.strToDate, toDate);
        bundle.putBoolean(IntentConst.isPregnant, pregnent);
        bundle.putBoolean(IntentConst.isHyperTension, hyperTension);
        bundle.putBoolean(IntentConst.isDiabet, diabet);
        bundle.putBoolean(IntentConst.isJingshenbing, jingshenbing);

        startActivity(ListActivity.class, bundle);

    }

    private void chooseGenderDialog() {
        final String[] gender = {"男", "女"};
        new MaterialDialog.Builder(mActivity)
                .title("请选择性别")
                .items(gender)
                .itemsCallbackSingleChoice(-1, new MaterialDialog.ListCallbackSingleChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, View itemView, int which, CharSequence text) {
                        textSelectSex.setText(gender[which]);
                        return true;
                    }
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
        if (TextUtils.equals("fromDate", type)) {
            textSelectJdsj1.setText(String.valueOf(year) + "-" + month + "-" + day);
        } else if (TextUtils.equals("toDate", type)) {
            textSelectJdsj2.setText(String.valueOf(year) + "-" + month + "-" + day);
        }
    }

}
