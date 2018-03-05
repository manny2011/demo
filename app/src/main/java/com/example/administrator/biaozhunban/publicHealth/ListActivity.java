package com.example.administrator.biaozhunban.publicHealth;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.allen.library.SuperTextView;
import com.blankj.utilcode.util.ToastUtils;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;
import com.example.administrator.biaozhunban.greendao.NativesDao;
import com.example.administrator.biaozhunban.greendao.daomanager.EntityManager;
import com.example.administrator.biaozhunban.greendao.entity.Natives;
import com.zhy.adapter.abslistview.CommonAdapter;
import com.zhy.adapter.abslistview.ViewHolder;

import org.greenrobot.greendao.rx.RxDao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by Administrator on 2018/1/13.
 */

public class ListActivity extends BaseActivity {
    @BindView(R.id.list)
    ListView list;
    List<Natives> data = new ArrayList<>(9);
    NativesDao nativesDao;
    private ListAdapter adapter;

    @Override
    protected int getLayout() {
        return R.layout.public_health_activity_list;
    }

    @Override
    protected void initView() {
        setTitle("健康档案");
        adapter = new ListAdapter(mActivity, R.layout.archive_item_layout, data);
        list.setAdapter(adapter);
        nativesDao = EntityManager.getInstance().nativeDao();
        list.setOnItemClickListener((parent,v,which,id)->{startActivity(DetailServiceActivity.class);});
    }

    @Override
    protected void initData() {
        RxDao<Natives, Long> rxDao = nativesDao.rx();
        showProgressDialog();
        Subscription subscription = rxDao.loadAll()
//                .delay(2000, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Natives>>() {
                    @Override
                    public void onCompleted() {
                        hideProgressDialog();
                    }

                    @Override
                    public void onError(Throwable e) {
                        hideProgressDialog();
                    }

                    @Override
                    public void onNext(List<Natives> natives) {
                        data.clear();
                        data.addAll(natives);
                        adapter.notifyDataSetChanged();
                        hideProgressDialog();
                    }
                });
        addSubscription(subscription);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick(R.id.NavigateHomeLinearLayout)
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.NavigateHomeLinearLayout:
                startActivity(ArchiveActivity.class);
                break;
        }
    }

    class ListAdapter extends CommonAdapter<Natives> {

        private View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showShort("LALA");
                switch (v.getId()) {
                    case R.id.btnQianyue:

                        break;
                    case R.id.btnJilu:

                        break;
                    case R.id.btnChengyuan:

                        break;
                    case R.id.btnXiugai:

                        break;
                    case R.id.btnShanchu:

                        break;
                }
            }
        };

        ListAdapter(Context context, int layoutId, List<Natives> datas) {
            super(context, layoutId, datas);
        }

        @Override
        protected void convert(ViewHolder viewHolder, Natives item, int position) {
            SuperTextView dangan = viewHolder.getView(R.id.danganxingming);
            SuperTextView nianling = viewHolder.getView(R.id.nianlingxingbie);
            SuperTextView xianzhuzhi = viewHolder.getView(R.id.xianzhuzhi);
            viewHolder.setOnClickListener(R.id.btnQianyue, listener);
            viewHolder.setOnClickListener(R.id.btnJilu, listener);
            viewHolder.setOnClickListener(R.id.btnChengyuan, listener);
            viewHolder.setOnClickListener(R.id.btnXiugai, listener);
            viewHolder.setOnClickListener(R.id.btnShanchu, listener);

            dangan.setLeftBottomString(item.getNa_name());
            nianling.setCenterTopString(String.valueOf(item.getNa_age()));
            nianling.setCenterBottomString(item.getNa_sex() == 0 ? "男" : "女");
            xianzhuzhi.setRightString(item.getNa_address());

        }
    }
}
