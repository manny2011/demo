package com.example.administrator.biaozhunban.publicHealth;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.blankj.utilcode.util.ToastUtils;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;
import com.example.administrator.biaozhunban.comm.Utils;
import com.example.administrator.biaozhunban.greendao.JianKangJiaoYuJiLuDao;
import com.example.administrator.biaozhunban.greendao.WeiShengXieGuanBiaoDao;
import com.example.administrator.biaozhunban.greendao.WeiShengXunChaBiaoDao;
import com.example.administrator.biaozhunban.greendao.daomanager.EntityManager;
import com.example.administrator.biaozhunban.greendao.entity.JianKangJiaoYuJiLu;
import com.example.administrator.biaozhunban.greendao.entity.WeiShengXieGuanBiao;
import com.example.administrator.biaozhunban.greendao.entity.WeiShengXunChaBiao;
import com.zhy.adapter.abslistview.CommonAdapter;
import com.zhy.adapter.abslistview.ViewHolder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by Administrator on 2018/2/4.
 */

public class DengjiListActivity extends BaseActivity {

    @BindView(R.id.list)
    ListView list;
    private int queryType;//1.信息登记报告 2,巡查报告 3,健康教育活动记录
    private List data;
    private ListAdapter adapter;
    private WeiShengXunChaBiaoDao xunChaBiaoDao;
    private WeiShengXieGuanBiaoDao xieGuanBiaoDao;
    private JianKangJiaoYuJiLuDao jianKangDao;

    @Override
    protected int getLayout() {
        return R.layout.public_health_activity_list;
    }

    @Override
    protected void initView() {
        Bundle bundle = getIntent().getExtras();
        if (bundle == null) {
            ToastUtils.showShort("数据异常,请返回!");
            return;
        }
        String title = bundle.getString("title", getResources().getString(R.string.app_name));
        queryType = bundle.getInt("type");
        if (queryType != 1 && queryType != 2 && queryType != 3) {
            ToastUtils.showShort("查询失败,请稍后重试!");
            return;
        }
        setTitle(title);
    }

    @Override
    protected void initData() {
        showProgressDialog();
        if (queryType == 2) {//巡查
            data = new ArrayList<WeiShengXunChaBiao>();
            adapter = new ListAdapter<WeiShengXunChaBiao>(mActivity, R.layout.weishengjiandu_item_layout, data);
            xunChaBiaoDao = EntityManager.getInstance().weiShengXunChaBiaoDao();
            xunChaBiaoDao.rx().loadAll()
//                    .delay(1000, TimeUnit.MILLISECONDS)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<List<WeiShengXunChaBiao>>() {
                        @Override
                        public void onCompleted() {
                            hideProgressDialog();
                        }

                        @Override
                        public void onError(Throwable e) {
                            hideProgressDialog();
                            ToastUtils.showShort("数据异常,加载失败!");
                        }

                        @Override
                        public void onNext(List<WeiShengXunChaBiao> weiShengXunChaBiaos) {
                            data.clear();
                            data.addAll(weiShengXunChaBiaos);
                            adapter.notifyDataSetChanged();
                        }
                    });
        } else if (queryType == 1) {//协管
            data = new ArrayList<WeiShengXieGuanBiao>();
            adapter = new ListAdapter<WeiShengXieGuanBiao>(mActivity, R.layout.weishengjiandu_item_layout, data);
            xieGuanBiaoDao = EntityManager.getInstance().weiShengXieGuanBiaoDao();
            xieGuanBiaoDao.rx().loadAll()
//                    .delay(1000, TimeUnit.MILLISECONDS)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<List<WeiShengXieGuanBiao>>() {
                        @Override
                        public void onCompleted() {
                            hideProgressDialog();
                        }

                        @Override
                        public void onError(Throwable e) {
                            hideProgressDialog();
                            ToastUtils.showShort("数据异常,加载失败!");

                        }

                        @Override
                        public void onNext(List<WeiShengXieGuanBiao> weiShengXieGuanBiaos) {
                            hideProgressDialog();
                            data.clear();
                            data.addAll(weiShengXieGuanBiaos);
                            adapter.notifyDataSetChanged();
                        }
                    });
        } else if (queryType == 3) {
            data = new ArrayList<JianKangJiaoYuJiLu>();
            adapter = new ListAdapter<JianKangJiaoYuJiLu>(mActivity, R.layout.weishengjiandu_item_layout, data);
            jianKangDao = EntityManager.getInstance().jianKangJiaoYuJiLuDao();
            jianKangDao.rx().loadAll()
//                    .delay(1000, TimeUnit.MILLISECONDS)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(jilus -> {
                        hideProgressDialog();
                        data.clear();
                        data.addAll(jilus);
                        adapter.notifyDataSetChanged();
                    }, e -> {
                        hideProgressDialog();
                        ToastUtils.showShort("数据异常,加载失败!");
                    });
        }
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                Bundle bundle = new Bundle();
                if (queryType == 1) {//1.协管
                    WeiShengXieGuanBiao xieGuanEntity = (WeiShengXieGuanBiao) data.get(position);
                    bundle.putSerializable("obj", xieGuanEntity);
                    startActivity(XieGuanDengJiActivity.class, bundle);
                } else if (queryType == 2) {//巡查
                    WeiShengXunChaBiao xunChaEntity = (WeiShengXunChaBiao) data.get(position);
                    bundle.putSerializable("obj", xunChaEntity);
                    startActivity(XunChaDengJiActivity.class, bundle);
                } else if(queryType==3){//健康教育服务
                    JianKangJiaoYuJiLu jiluEntity= (JianKangJiaoYuJiLu) data.get(position);
                    bundle.putSerializable("obj",jiluEntity);
                    startActivity(JianKangJiaoYuDengJiActivity.class,bundle);
                }
            }
        });
    }

    @OnClick(R.id.NavigateHomeLinearLayout)
    public void onViewClicked() {
        if (queryType == 1) {
            WeiShengXieGuanBiao newEntity = new WeiShengXieGuanBiao();
            newEntity.setWsxx_bgsj(Utils.getDateString(new Date()));
            xieGuanBiaoDao.rx().insert(newEntity)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<WeiShengXieGuanBiao>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            ToastUtils.showShort("创建失败!");
                        }

                        @Override
                        public void onNext(WeiShengXieGuanBiao weiShengXieGuanBiao) {
                            data.add(weiShengXieGuanBiao);
                            adapter.notifyDataSetChanged();
                            list.smoothScrollToPosition(data.size());
                            ToastUtils.showShort("创建成功!");
                        }
                    });
        } else if(queryType==2) {
            WeiShengXunChaBiao newEntity = new WeiShengXunChaBiao();
            newEntity.setWsxc_rq(Utils.getDateString(new Date()));
            newEntity.setWsxc_id(Utils.getUUID());
            xunChaBiaoDao.rx().insert(newEntity)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<WeiShengXunChaBiao>() {
                        @Override
                        public void onCompleted() {
                        }

                        @Override
                        public void onError(Throwable e) {
                            ToastUtils.showShort("创建失败" + e.getMessage());
                            e.printStackTrace();
                        }

                        @Override
                        public void onNext(WeiShengXunChaBiao weiShengXunChaBiao) {
                            data.add(weiShengXunChaBiao);
                            adapter.notifyDataSetChanged();
                            list.smoothScrollToPosition(data.size());
                            ToastUtils.showShort("创建成功!");
                        }
                    });
        } else if(queryType==3){
            JianKangJiaoYuJiLu newJiLu=new JianKangJiaoYuJiLu();
            newJiLu.setJkjy_id(Utils.getUUID());
            newJiLu.setJkjy_hdrq(Utils.getDateString(new Date()));
            newJiLu.setJkjy_tbrq(Utils.getDateString(new Date()));
            newJiLu.setJkjy_cdcl(-1);//存档类型全部初始化为无效的 -1
            jianKangDao.rx().insert(newJiLu)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(jilu->{data.add(jilu);adapter.notifyDataSetChanged();list.smoothScrollToPosition(data.size());},error->{ToastUtils.showShort("新增失败,请重试!");});
        }
    }

    class ListAdapter<T> extends CommonAdapter<T> {

        ListAdapter(Context context, int layoutId, List<T> datas) {
            super(context, layoutId, datas);
        }

        @Override
        protected void convert(ViewHolder viewHolder, final T item, int position) {
            if (queryType == 1) {
                WeiShengXieGuanBiao bean = (WeiShengXieGuanBiao) item;
                viewHolder.setText(R.id.tvNum, bean.getId().toString());
                viewHolder.setText(R.id.tvDate, bean.getWsxx_bgsj());
                viewHolder.setText(R.id.tvName, "卫生监督协管信息报告登记表");
            } else if (queryType == 2) {
                WeiShengXunChaBiao bean = (WeiShengXunChaBiao) item;
                viewHolder.setText(R.id.tvNum, bean.getId().toString());
                viewHolder.setText(R.id.tvDate, bean.getWsxc_rq());
                viewHolder.setText(R.id.tvName, "卫生监督协管巡查登记表");
            } else if(queryType==3){
                JianKangJiaoYuJiLu bean= (JianKangJiaoYuJiLu) item;
                viewHolder.setText(R.id.tvNum,bean.getId().toString());
                viewHolder.setText(R.id.tvDate,bean.getJkjy_hdrq());
                viewHolder.setText(R.id.tvName,"健康教育活动记录表");
            }
            viewHolder.setOnClickListener(R.id.delete, v-> {
                    if (queryType == 2) {
                        xunChaBiaoDao.rx().delete((WeiShengXunChaBiao) item)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(new Observer<Void>() {
                                    @Override
                                    public void onCompleted() {

                                    }

                                    @Override
                                    public void onError(Throwable e) {
                                        ToastUtils.showShort("操作异常,请稍后再试!");
                                    }

                                    @Override
                                    public void onNext(Void aVoid) {
                                        ToastUtils.showShort("删除成功!");
                                        data.remove(item);
                                        adapter.notifyDataSetChanged();
                                    }
                                });
                    } else if (queryType == 1) {//协管
                        xieGuanBiaoDao.rx().delete((WeiShengXieGuanBiao) item)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(new Observer<Void>() {
                                    @Override
                                    public void onCompleted() {

                                    }

                                    @Override
                                    public void onError(Throwable e) {
                                        ToastUtils.showShort("操作异常,请稍后再试!");
                                    }

                                    @Override
                                    public void onNext(Void aVoid) {
                                        ToastUtils.showShort("删除成功!");
                                        data.remove(item);
                                        adapter.notifyDataSetChanged();
                                    }
                                });
                    } else if(queryType==3){//健康教育服务
                        jianKangDao.rx().delete((JianKangJiaoYuJiLu) item)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(aVoid -> {ToastUtils.showShort("删除成功!");data.remove(item);adapter.notifyDataSetChanged();},
                                        error-> ToastUtils.showShort("删除失败,请重试!"),
                                        ()->{});
                    }

            });
        }
    }
}
