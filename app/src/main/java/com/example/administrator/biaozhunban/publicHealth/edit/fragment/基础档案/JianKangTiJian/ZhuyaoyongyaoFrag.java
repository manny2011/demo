package com.example.administrator.biaozhunban.publicHealth.edit.fragment.基础档案.JianKangTiJian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public class ZhuyaoyongyaoFrag extends BaseFrag {
    @BindView(R.id.etMing1)
    EditText etMing1;
    @BindView(R.id.etFa1)
    EditText etFa1;
    @BindView(R.id.etLiang1)
    EditText etLiang1;
    @BindView(R.id.etSJ1)
    EditText etSJ1;
    @BindView(R.id.tv1)
    TextView tv1;
    @BindView(R.id.etMing2)
    EditText etMing2;
    @BindView(R.id.etFa2)
    EditText etFa2;
    @BindView(R.id.etLiang2)
    EditText etLiang2;
    @BindView(R.id.etSJ2)
    EditText etSJ2;
    @BindView(R.id.tv2)
    TextView tv2;
    @BindView(R.id.etming3)
    EditText etming3;
    @BindView(R.id.etFa3)
    EditText etFa3;
    @BindView(R.id.etLiang3)
    EditText etLiang3;
    @BindView(R.id.etSJ3)
    EditText etSJ3;
    @BindView(R.id.tv3)
    TextView tv3;
    @BindView(R.id.etMing4)
    EditText etMing4;
    @BindView(R.id.etFa4)
    EditText etFa4;
    @BindView(R.id.etLiang4)
    EditText etLiang4;
    @BindView(R.id.etSJ4)
    EditText etSJ4;
    @BindView(R.id.tv4)
    TextView tv4;
    @BindView(R.id.etMing5)
    EditText etMing5;
    @BindView(R.id.etFa5)
    EditText etFa5;
    @BindView(R.id.etLiang5)
    EditText etLiang5;
    @BindView(R.id.etSJ5)
    EditText etSJ5;
    @BindView(R.id.tv5)
    TextView tv5;
    @BindView(R.id.etMing6)
    EditText etMing6;
    @BindView(R.id.etFa6)
    EditText etFa6;
    @BindView(R.id.etLiang6)
    EditText etLiang6;
    @BindView(R.id.etSJ6)
    EditText etSJ6;
    @BindView(R.id.tv6)
    TextView tv6;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.public_health_framgnet_zhuyaoyongyao;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
    }
    @OnClick({R.id.tv1, R.id.tv2, R.id.tv3, R.id.tv4, R.id.tv5, R.id.tv6, R.id.tvConfirm})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv1:
                chooseJiBingDialog(1);
                break;
            case R.id.tv2:
                chooseJiBingDialog(2);
                break;
            case R.id.tv3:
                chooseJiBingDialog(3);
                break;
            case R.id.tv4:
                chooseJiBingDialog(4);
                break;
            case R.id.tv5:
                chooseJiBingDialog(5);
                break;
            case R.id.tv6:
                chooseJiBingDialog(6);
                break;
            case R.id.tvConfirm:
                save();
                break;
        }
    }

    private void save() {

    }

    private void chooseJiBingDialog(int i) {
        final String[] jb = {"规律", "间断",  "不服药"};
        new MaterialDialog.Builder(mActivity)
                .title("请选择服药依从性情况")
                .titleColor(getResources().getColor(R.color.dialogTitleColor))
                .items(jb)
                .itemsCallbackSingleChoice(-1, (dialog, itemView, which, text) -> {
                    switch (i) {
                        case 1:
                            tv1.setText(text);
                            break;
                        case 2:
                            tv2.setText(text);
                            break;
                        case 3:
                            tv3.setText(text);
                            break;
                        case 4:
                            tv4.setText(text);
                            break;
                        case 5:
                            tv5.setText(text);
                            break;
                        case 6:
                            tv6.setText(text);
                            break;
                    }
                    return true;
                })
                .negativeText("取消")
                .build()
                .show();
    }
}
