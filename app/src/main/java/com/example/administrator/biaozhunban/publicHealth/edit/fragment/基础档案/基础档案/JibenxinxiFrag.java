package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.基础档案;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseFrag;
import com.example.administrator.biaozhunban.comm.Utils;
import com.example.administrator.biaozhunban.greendao.JuMinJiChuDangAnDao;
import com.example.administrator.biaozhunban.greendao.daomanager.DaoManager;
import com.example.administrator.biaozhunban.greendao.daomanager.EntityManager;
import com.fourmob.datetimepicker.date.DatePickerDialog;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2018/2/26.
 */

public class JibenxinxiFrag extends BaseFrag implements DatePickerDialog.OnDateSetListener {

    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvBianhao)
    TextView tvBianhao;
    @BindView(R.id.tvXingbie)
    TextView tvXingbie;
    @BindView(R.id.tvShengri)
    TextView tvShengri;
    @BindView(R.id.etIdcard)
    EditText etIdcard;
    @BindView(R.id.etGongsi)
    EditText etGongsi;
    @BindView(R.id.etPhoneBenren)
    EditText etPhoneBenren;
    @BindView(R.id.etPhoneLianxiren1)
    EditText etPhoneLianxiren1;
    @BindView(R.id.etPhoneLianxiren2)
    EditText etPhoneLianxiren2;
    @BindView(R.id.tvJuzhu)
    TextView tvJuzhu;
    @BindView(R.id.tvMinzu)
    TextView tvMinzu;
    @BindView(R.id.tvXuexing)
    TextView tvXuexing;
    @BindView(R.id.tvRH)
    TextView tvRH;
    @BindView(R.id.tvXueli)
    TextView tvXueli;
    @BindView(R.id.tvZhiye)
    TextView tvZhiye;
    @BindView(R.id.tvHunyin)
    TextView tvHunyin;
    @BindView(R.id.tvZhifufangshi)
    TextView tvZhifufangshi;
    @BindView(R.id.tvGuomin)
    TextView tvGuomin;
    @BindView(R.id.tvBaolou)
    TextView tvBaolou;
    @BindView(R.id.tvCanji)
    TextView tvCanji;
    @BindView(R.id.rgYichuan)
    RadioGroup rgYichuan;
    @BindView(R.id.etJibingming)
    EditText etJibingming;

    JuMinJiChuDangAnDao dangAnDao;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_fragment_jibenxinxi;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        dangAnDao= EntityManager.getInstance().juMinJiChuDangAnDao();

    }

    @OnClick({R.id.tvXingbie, R.id.tvShengri, R.id.tvJuzhu, R.id.tvMinzu, R.id.tvXuexing, R.id.tvRH,
            R.id.tvXueli, R.id.tvZhiye, R.id.tvHunyin, R.id.rlZhifufangshi, R.id.tvGuomin,
            R.id.tvBaolou, R.id.tvCanji, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvXingbie:
                chooseGenderDialog();
                break;
            case R.id.tvShengri:
                Utils.chooseDateDialog(mActivity, "birthdate", this);
                break;
            case R.id.tvJuzhu:
                chooseJuzhuTypeDialog();
                break;
            case R.id.tvMinzu:
                chooseMinzuDialog();
                break;
            case R.id.tvXuexing:
                chooseXuexingDialog();
                break;
            case R.id.tvRH:
                chooseRHDialog();
                break;
            case R.id.tvXueli:
                chooseXueliDialog();
                break;
            case R.id.tvZhiye:
                chooseZhiyeDialog();
                break;
            case R.id.tvHunyin:
                chooseHunyinDialog();
                break;
            case R.id.rlZhifufangshi:
                chooseZhifuTypeDialog();
                break;
            case R.id.tvGuomin:
                chooseGuominDialog();
                break;
            case R.id.tvBaolou:
                chooseBaolouDialog();
                break;
            case R.id.tvCanji:
                chooseCanjiDialog();
                break;
            case R.id.tvConfirm:
                save();
                break;
        }
    }

    private void save() {

    }

    private void chooseCanjiDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("无","视力残疾","听力残疾","言语残疾","肢体残疾","智力残疾","精神残疾","其他残疾")
                .itemsCallbackMultiChoice(null, new MaterialDialog.ListCallbackMultiChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, Integer[] which, CharSequence[] text) {
                        StringBuilder sb = new StringBuilder();
                        for (CharSequence s :
                                text) {
                            sb.append(s).append(',');
                        }
                        String s = sb.toString();
                        if(s.length()>0){
                            String substring = s.substring(0, s.length() - 1);
                            tvCanji.setText(substring);
                        }
                        return true;
                    }
                }).title("请选择残疾情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseBaolouDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("无","化学品","毒物","射线")
                .itemsCallbackMultiChoice(null, new MaterialDialog.ListCallbackMultiChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, Integer[] which, CharSequence[] text) {
                        StringBuilder sb = new StringBuilder();
                        for (CharSequence s :
                                text) {
                            sb.append(s).append(',');
                        }
                        String s = sb.toString();
                        if(s.length()>0){
                            String substring = s.substring(0, s.length() - 1);
                            tvBaolou.setText(substring);
                        }
                        return true;
                    }
                }).title("请选择暴露史")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseGuominDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("无","青霉素","磺胺","链霉素","其他")
                .itemsCallbackMultiChoice(null, new MaterialDialog.ListCallbackMultiChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, Integer[] which, CharSequence[] text) {
                        StringBuilder sb = new StringBuilder();
                        for (CharSequence s :
                                text) {
                            sb.append(s).append(',');
                        }
                        String s = sb.toString();
                        if(s.length()>0){
                            String substring = s.substring(0, s.length() - 1);
                            tvGuomin.setText(substring);
                        }
                        return true;
                    }
                }).title("请选择药物过敏史")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseZhifuTypeDialog() {
        new MaterialDialog.Builder(mActivity)
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .title("请选择医疗支付方式")
                .itemsCallbackMultiChoice(null, new MaterialDialog.ListCallbackMultiChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, Integer[] which, CharSequence[] text) {
                        StringBuilder sb = new StringBuilder();
                        for (CharSequence s :
                                text) {
                            sb.append(s).append(',');
                        }
                        String s = sb.toString();
                        if(s.length()>0){
                            String substring = s.substring(0, s.length() - 1);
                            tvZhifufangshi.setText(substring);
                        }
                        return true;
                    }
                }).items("城镇职工基本医疗保险", "城镇居民基本医疗保险", "新型农村合作医疗", "贫困救助", "商业医疗保险", "全公费", "全自费", "其他")
                .positiveText("确定")
                .negativeText("取消")
                .onPositive((dialog, which) -> dialog.dismiss())
                .show();

    }

    private void chooseHunyinDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("未婚", "已婚", "丧偶", "离婚", "不详")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvHunyin.setText(text);
                    return true;
                }).title("请选择婚姻情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseZhiyeDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("国家机关/党群组织/企业/事业单位负责人", "专业技术人员", "办事人员和有关人员", "商业与服务业人员", "农/林/牧/渔/水利业生产人员",
                        "生产/运输设备操作人员及有关人员", "军人", "不便分类的其他从业人员")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvZhiye.setText(text);
                    return true;
                }).title("请选择职业")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseXueliDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("文盲及半文盲", "小学", "初中", "高中/技校/中专", "大学专科及以上", "不详")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvXueli.setText(text);
                    return true;
                }).title("请选择文化程度")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseRHDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("否", "是", "不详")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvRH.setText(text);
                    return true;
                }).title("RH阴性")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseXuexingDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("A型", "B型", "O型", "AB型", "不详")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvXuexing.setText(text);
                    return true;
                }).title("请选择血型")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseMinzuDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("汉族", "少数民族")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvMinzu.setText(text);
                    return true;
                }).title("请选择民族")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseGenderDialog() {
        final String[] gender = {"男", "女"};
        new MaterialDialog.Builder(mActivity)
                .title("请选择性别")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .items(gender)
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvXingbie.setText(gender[which]);
                    return true;
                })
                .negativeText("取消")
                .build()
                .show();
    }

    private void chooseJuzhuTypeDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("户籍", "非户籍")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvJuzhu.setText(text);
                    return true;
                }).title("请选择常住类型")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
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
        if (TextUtils.equals(type, "birthdate"))
            tvShengri.setText(String.valueOf(year) + '-' + month + '-' + day);
        else
            tvShengri.setText(String.valueOf(year) + '-' + month + '-' + day);
    }

}
