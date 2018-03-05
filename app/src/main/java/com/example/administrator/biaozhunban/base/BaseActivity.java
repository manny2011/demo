package com.example.administrator.biaozhunban.base;

import android.accessibilityservice.AccessibilityService;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.inputmethodservice.InputMethodService;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.administrator.biaozhunban.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

/**
 * Created by Administrator on 2018/1/10.
 */

@SuppressLint("Registered")
public abstract class BaseActivity extends AppCompatActivity {
    protected Activity mActivity;
    private Unbinder unbinder;
    protected CompositeSubscription compositeSubscription;
    protected ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        mActivity = this;
        unbinder = ButterKnife.bind(this);
        initView();
        TextView tvTitle = findViewById(R.id.NavigateTitle);
        if (tvTitle != null) tvTitle.setText(getTitle());
        LinearLayout ll_left = findViewById(R.id.NavigateBackLinearLayout);
        if (ll_left != null) ll_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        initData();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null) unbinder.unbind();
        unSubscribe();
    }

    protected void addSubscription(Subscription s){
        if(compositeSubscription==null)
            compositeSubscription = new CompositeSubscription();
        compositeSubscription.add(s);
    }

    protected void unSubscribe(){
        if (compositeSubscription != null && compositeSubscription.hasSubscriptions()){
            compositeSubscription.unsubscribe();
            compositeSubscription=null;//一句话解决这个问题!
        }
    }

    protected abstract int getLayout();

    protected abstract void initView();

    protected abstract void initData();

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==KeyEvent.KEYCODE_BACK){
            finish();
            return true;//自己处理掉了!
        }
        return super.onKeyDown(keyCode, event);
    }

    public void startActivity(Class clz, Bundle bundle) {
        Intent intent = new Intent(mActivity, clz);
        if (bundle != null)
            intent.putExtras(bundle);
        startActivity(intent);
    }

    public void startActivity(Class clz) {
        Intent intent = new Intent(mActivity, clz);
        startActivity(intent);
    }

    protected void showProgressDialog() {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(mActivity);
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progressDialog.setCancelable(true);
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.setMessage("加载中...");
        }
        if (!isFinishing() && !progressDialog.isShowing())
            progressDialog.show();
    }

    protected void hideProgressDialog() {
        if (progressDialog != null) progressDialog.dismiss();
    }
}
