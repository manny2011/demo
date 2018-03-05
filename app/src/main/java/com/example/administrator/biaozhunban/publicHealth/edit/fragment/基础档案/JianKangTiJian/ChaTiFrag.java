package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseFrag;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2018/2/26.
 */

public class ChaTiFrag extends BaseFrag {
    @BindView(R.id.rgYandi)
    RadioGroup rgYandi;
    @BindView(R.id.etYandi)
    EditText etYandi;
    @BindView(R.id.tvPifu)
    TextView tvPifu;
    @BindView(R.id.tvGongmo)
    TextView tvGongmo;
    @BindView(R.id.tvLinba)
    TextView tvLinba;
    @BindView(R.id.rgTongfei)
    RadioGroup rgTongfei;
    @BindView(R.id.rgHuxiyin)
    RadioGroup rgHuxiyin;
    @BindView(R.id.editText_breathSounds)
    EditText editTextBreathSounds;
    @BindView(R.id.tvLuoyin)
    TextView tvLuoyin;
    @BindView(R.id.etXinlv)
    EditText etXinlv;
    @BindView(R.id.tvXinlv)
    TextView tvXinlv;
    @BindView(R.id.rgZayin)
    RadioGroup rgZayin;
    @BindView(R.id.etZayin)
    EditText etZayin;
    @BindView(R.id.rgYatong)
    RadioGroup rgYatong;
    @BindView(R.id.editText_yt)
    EditText editTextYt;
    @BindView(R.id.rgBaokuai)
    RadioGroup rgBaokuai;
    @BindView(R.id.rgGanda)
    RadioGroup rgGanda;
    @BindView(R.id.etGanda)
    EditText etGanda;
    @BindView(R.id.rgPida)
    RadioGroup rgPida;
    @BindView(R.id.rgZhuyin)
    RadioGroup rgZhuyin;
    @BindView(R.id.tvZhuyin)
    EditText tvZhuyin;
    @BindView(R.id.tvShuizhong)
    TextView tvShuizhong;
    @BindView(R.id.tvZubei)
    TextView tvZubei;
    @BindView(R.id.tvGangmen)
    TextView tvGangmen;
    @BindView(R.id.tvRuxian)
    TextView tvRuxian;
    @BindView(R.id.rgWaiyin)
    RadioGroup rgWaiyin;
    @BindView(R.id.editText_vulva)
    EditText editTextVulva;
    @BindView(R.id.rgYindao)
    RadioGroup rgYindao;
    @BindView(R.id.etWaiyin)
    EditText etWaiyin;
    @BindView(R.id.rgGongjing)
    RadioGroup rgGongjing;
    @BindView(R.id.etGongjing)
    EditText etGongjing;
    @BindView(R.id.rgGongti)
    RadioGroup rgGongti;
    @BindView(R.id.etGongti)
    EditText etGongti;
    @BindView(R.id.rgFujian)
    RadioGroup rgFujian;
    @BindView(R.id.etFujian)
    EditText etFujian;
    @BindView(R.id.etQita)
    EditText etQita;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_chati;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.tvPifu, R.id.tvGongmo, R.id.tvLinba, R.id.tvLuoyin, R.id.tvXinlv, R.id.tvShuizhong, R.id.tvZubei, R.id.tvGangmen, R.id.tvRuxian, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvPifu:
                choosePifuDialog();
                break;
            case R.id.tvGongmo:
                chooseGongmoDialog();
                break;
            case R.id.tvLinba:
                chooseLinbaDialog();
                break;
            case R.id.tvLuoyin:
                chooseLuoyinDialog();
                break;
            case R.id.tvXinlv:
                chooseXinlvDialog();
                break;
            case R.id.tvShuizhong:
                chooseShuizhongDialog();
                break;
            case R.id.tvZubei:
                chooseZubeiDialog();
                break;
            case R.id.tvGangmen:
                chooseGangMenDialog();
                break;
            case R.id.tvRuxian:
                chooseRuxianDialog();
                break;
            case R.id.tvConfirm:
                break;
        }
    }

    private void choosePifuDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("正常", "潮红", "苍白","发绀","黄染","色彩沉着","其他")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvPifu.setText(text);
                    return true;
                }).title("请选择皮肤状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseGongmoDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("正常", "黄染", "充血","其他")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvGongmo.setText(text);
                    return true;
                }).title("请选择巩膜状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseLinbaDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("未触及", "锁骨", "腋窝")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvLinba.setText(text);
                    return true;
                }).title("请选择淋巴结状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseLuoyinDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("无", "干罗音", "湿罗音","其他")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvLuoyin.setText(text);
                    return true;
                }).title("请选择罗音状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseXinlvDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("齐", "不齐", "绝对不齐")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvXinlv.setText(text);
                    return true;
                }).title("请选择心率状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseShuizhongDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("无", "单侧", "双侧不对称","双侧对称")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvShuizhong.setText(text);
                    return true;
                }).title("请选择下肢水肿状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseZubeiDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("未触及", "触及双侧对称", "触及左侧弱或消失","触及右侧弱或消失")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvZubei.setText(text);
                    return true;
                }).title("请选择足背动脉搏动状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseGangMenDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("未见异常", "触痛", "包块","前列腺异常","其他")
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    tvGangmen.setText(text);
                    return true;
                }).title("请选择肛门指诊状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }

    private void chooseRuxianDialog() {
        new MaterialDialog.Builder(mActivity)
                .items("未见异常","乳房切除","异常泌乳","乳腺包块","其他")
                .itemsCallbackMultiChoice(null, (dialog, which, text) -> {
                    StringBuilder sb = new StringBuilder();
                    for (CharSequence s :
                            text) {
                        sb.append(s).append(',');
                    }
                    String s = sb.toString();
                    if(s.length()>0){
                        String substring = s.substring(0, s.length() - 1);
                        tvRuxian.setText(substring);
                    }
                    return true;
                }).title("请选择乳腺状况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .negativeText("取消")
                .positiveText("确定")
                .onNegative((dialog, which) -> {
                    dialog.dismiss();
                })
                .build().show();
    }
}
