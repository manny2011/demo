package com.example.administrator.biaozhunban.publicHealth;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.biaozhunban.comm.Utils;

import com.blankj.utilcode.util.ToastUtils;
import com.example.administrator.biaozhunban.R;
import com.example.administrator.biaozhunban.base.BaseActivity;
import com.example.administrator.biaozhunban.greendao.ChanhuofangshijiluDao;
import com.example.administrator.biaozhunban.greendao.Chanhuofangshijilutianhou42Dao;
import com.example.administrator.biaozhunban.greendao.Chanqiansuifangjilu01Dao;
import com.example.administrator.biaozhunban.greendao.Chanqiansuifangjilu02to05Dao;
import com.example.administrator.biaozhunban.greendao.GWJiWangJiZuShiDao;
import com.example.administrator.biaozhunban.greendao.GaoXueYaHuanZheDao;
import com.example.administrator.biaozhunban.greendao.JianKangTiJianBiao_ADao;
import com.example.administrator.biaozhunban.greendao.JianKangTiJianBiao_BDao;
import com.example.administrator.biaozhunban.greendao.JianKangTiJianBiao_CDao;
import com.example.administrator.biaozhunban.greendao.JianKangTiJianBiao_DDao;
import com.example.administrator.biaozhunban.greendao.JingshenbinghuanzheDao;
import com.example.administrator.biaozhunban.greendao.JingshenbingjiluDao;
import com.example.administrator.biaozhunban.greendao.JuMinJiChuDangAnDao;
import com.example.administrator.biaozhunban.greendao.LaonianrenjiankangDao;
import com.example.administrator.biaozhunban.greendao.LiangsuiertongjiankangDao;
import com.example.administrator.biaozhunban.greendao.SandaoliusuiertongjiankangDao;
import com.example.administrator.biaozhunban.greendao.TangNiaoBingDao;
import com.example.administrator.biaozhunban.greendao.TuFaChuanRanBingBaoGaoDao;
import com.example.administrator.biaozhunban.greendao.XinshengerjitingfangshiDao;
import com.example.administrator.biaozhunban.greendao.YisuiertongjiankangDao;
import com.example.administrator.biaozhunban.greendao.YufangjiezhongDao;
import com.example.administrator.biaozhunban.greendao.daomanager.EntityManager;
import com.example.administrator.biaozhunban.greendao.entity.BaseEntity;
import com.example.administrator.biaozhunban.greendao.entity.Chanhuofangshijilu;
import com.example.administrator.biaozhunban.greendao.entity.Chanhuofangshijilutianhou42;
import com.example.administrator.biaozhunban.greendao.entity.Chanqiansuifangjilu01;
import com.example.administrator.biaozhunban.greendao.entity.Chanqiansuifangjilu02to05;
import com.example.administrator.biaozhunban.greendao.entity.GaoXueYaHuanZhe;
import com.example.administrator.biaozhunban.greendao.entity.JianKangTiJianBiao_A;
import com.example.administrator.biaozhunban.greendao.entity.JianKangTiJianBiao_B;
import com.example.administrator.biaozhunban.greendao.entity.JianKangTiJianBiao_C;
import com.example.administrator.biaozhunban.greendao.entity.JianKangTiJianBiao_D;
import com.example.administrator.biaozhunban.greendao.entity.Jingshenbinghuanzhe;
import com.example.administrator.biaozhunban.greendao.entity.Jingshenbingjilu;
import com.example.administrator.biaozhunban.greendao.entity.JuMinJiChuDangAn;
import com.example.administrator.biaozhunban.greendao.entity.Laonianrenjiankang;
import com.example.administrator.biaozhunban.greendao.entity.Liangsuiertongjiankang;
import com.example.administrator.biaozhunban.greendao.entity.Sandaoliusuiertongjiankang;
import com.example.administrator.biaozhunban.greendao.entity.TangNiaoBing;
import com.example.administrator.biaozhunban.greendao.entity.TuFaChuanRanBingBaoGao;
import com.example.administrator.biaozhunban.greendao.entity.Xinshengerjitingfangshi;
import com.example.administrator.biaozhunban.greendao.entity.Yisuiertongjiankang;
import com.example.administrator.biaozhunban.greendao.entity.Yufangjiezhong;
import com.example.administrator.biaozhunban.publicHealth.edit.ChanHouFangShi42Editor;
import com.example.administrator.biaozhunban.publicHealth.edit.ChanHouFangShiEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.ChanQianSuiFang02dao05Editor;
import com.example.administrator.biaozhunban.publicHealth.edit.ChanqianSuiFang01Editor;
import com.example.administrator.biaozhunban.publicHealth.edit.ChuanRanBingEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.DangAnEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.GaoXueYaEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.JieZhongEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.JingShenBingFangShiEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.JingShenBingHuanZheXinXiEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.LaoNianRenEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.LiangSuiErTongJianChaEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.SanDaoLiuSuiErTongJianChaEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.TangNiaoBing2XingEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.TiJianBiaoEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.XinShengerFangShiEditor;
import com.example.administrator.biaozhunban.publicHealth.edit.YiSuiErTongJianChaEditor;
import com.zhy.adapter.abslistview.CommonAdapter;
import com.zhy.adapter.abslistview.ViewHolder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import butterknife.BindView;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

/**
 * Created by Administrator on 2018/2/6.
 */

public class DetailServiceActivity extends BaseActivity {

    private static String[] groupData = {"城乡居民健康档案", "预防接种服务", "0~6岁儿童健康管理服务", "孕产妇健康管理服务", "老年人健康管理服务"
            , "高血压患者健康管理服务", "2型糖尿病患者健康管理服务", "重性精神疾病患者管理服务", "肺结核患者管理服务", "传染病及突发公共卫生事件报告和处理服务"};
    private static String[][] childData = {{"基础档案", "健康体检表"}, {"预防接种"}, {"新生儿家庭访视记录", "1岁以内儿童健康检查记录", "1~2岁儿童健康检查记录", "3~6岁儿童健康检查记录"}
            , {"第1次产前随访服务记录", "第2~5次产前随访服务记录", "产后访视记录", "产后42天健康检查记录"}, {"老年人生活处理能力评估"}, {"高血压患者随访服务记录"}
            , {"2型糖尿病患者随访服务记录"}, {"重性精神疾病患者个人信息", "重性精神疾病患者随访服务记录"}, {"肺结核患者第一次入户随访记录", "肺结核患者随访服务记录"}, {"传染病报告"}};

    @BindView(R.id.activity_expandable_list)
    ExpandableListView activityExpandableList;
    @BindView(android.R.id.list)
    ListView list;
    @BindView(android.R.id.text1)
    TextView text1;
    private List data = new ArrayList();
    private ListAdapter listAdapter;

    private JuMinJiChuDangAnDao dangAnDao;
    private JianKangTiJianBiao_ADao aDao;
    private JianKangTiJianBiao_BDao bDao;
    private JianKangTiJianBiao_CDao cDao;
    private JianKangTiJianBiao_DDao dDao;

    private YufangjiezhongDao yufangjiezhongDao;

    private XinshengerjitingfangshiDao xinshengerfangshiDao;
    private YisuiertongjiankangDao yisuiertongjiankangDao;
    private LiangsuiertongjiankangDao liaosuiertongjiankangDao;
    private SandaoliusuiertongjiankangDao sansuiertongjiankangDao;

    private Chanqiansuifangjilu01Dao chanqiansuifangjilu01Dao;
    private Chanqiansuifangjilu02to05Dao chanqiansuifangjilu02to05Dao;
    private ChanhuofangshijiluDao chanhuofangshijiluDao;
    private Chanhuofangshijilutianhou42Dao chanhuofangshijilutianhou42Dao;

    private LaonianrenjiankangDao laonianrenjiankangDao;

    private GaoXueYaHuanZheDao gaoXueYaHuanZheDao;

    private TangNiaoBingDao tangNiaoBingDao;
    private JingshenbinghuanzheDao jingshenbinghuanzheDao;
    private JingshenbingjiluDao jingshenbingjiluDao;
    //结核病->暂时缺少两个
//    private
//    private

    //突发传染病
    private TuFaChuanRanBingBaoGaoDao tuFaChuanRanBingBaoGaoDao;

    @Override
    protected int getLayout() {
        return R.layout.public_health_activity_archives_options;
    }

    @Override
    protected void initView() {
        ExpandListAdapter expandAdapter = new ExpandListAdapter();
        activityExpandableList.setAdapter(expandAdapter);
        listAdapter = new ListAdapter(mActivity, R.layout.public_health_detail_list_item_layout, data);
        list.setAdapter(listAdapter);
        list.setEmptyView(text1);//data为空时的视图
        list.setOnItemClickListener((parent, view, position, id) -> {
            int groupPosi = (int) list.getTag(R.id.groupPosition);
            int childPosi = (int) list.getTag(R.id.childPosition);
            Class target = null;
            Object obj = data.get(position);
            switch (String.valueOf(groupPosi) + childPosi) {
                case "00":
                    target = DangAnEditor.class;

                    break;
                case "01":
                    target = TiJianBiaoEditor.class;
                    break;
                case "10":
                    target = JieZhongEditor.class;
                    break;
                case "20":
                    target = YiSuiErTongJianChaEditor.class;
                    break;
                case "21":
                    target = XinShengerFangShiEditor.class;
                    break;
                case "22":
                    target = LiangSuiErTongJianChaEditor.class;
                    break;
                case "23":
                    target = SanDaoLiuSuiErTongJianChaEditor.class;
                    break;
                case "30":
                    target = ChanqianSuiFang01Editor.class;
                    break;
                case "31":
                    target = ChanQianSuiFang02dao05Editor.class;
                    break;
                case "32":
                    target = ChanHouFangShiEditor.class;
                    break;
                case "33":
                    target = ChanHouFangShi42Editor.class;
                    break;
                case "40":
                    target= LaoNianRenEditor.class;
                    break;
                case "50":
                    target= GaoXueYaEditor.class;
                    break;
                case "60":
                    target= TangNiaoBing2XingEditor.class;
                    break;
                case "70":
                    target= JingShenBingHuanZheXinXiEditor.class;
                    break;
                case "71":
                    target= JingShenBingFangShiEditor.class;
                    break;
                case "80":

                    break;
                case "81":

                    break;
                case "90":
                    target= ChuanRanBingEditor.class;
                    break;
            }
            if (target != null) {
                startActivity(target, null);
            }

        });
        initDao();
    }

    private void initDao() {
        dangAnDao = EntityManager.getInstance().juMinJiChuDangAnDao();

        aDao = EntityManager.getInstance().aDao();
        bDao = EntityManager.getInstance().bDao();
        cDao = EntityManager.getInstance().cDao();
        dDao = EntityManager.getInstance().dDao();

        yufangjiezhongDao = EntityManager.getInstance().yufangjiezhongDao();
        xinshengerfangshiDao = EntityManager.getInstance().xingshenerfangshiDao();
        yisuiertongjiankangDao = EntityManager.getInstance().yisuiertongjiankangDao();
        liaosuiertongjiankangDao = EntityManager.getInstance().liangsuiertongjiankangDao();
        sansuiertongjiankangDao = EntityManager.getInstance().sandaoliusuiertongjiankangDao();

        chanqiansuifangjilu01Dao = EntityManager.getInstance().chanqiansuifangjilu01Dao();
        chanqiansuifangjilu02to05Dao = EntityManager.getInstance().chanqiansuifangjilu02to05Dao();
        chanhuofangshijiluDao = EntityManager.getInstance().chanhoufangshijiluDao();
        chanhuofangshijilutianhou42Dao = EntityManager.getInstance().chanhuofangshijilutianhou42Dao();

        laonianrenjiankangDao = EntityManager.getInstance().laonianrenjiankangDao();

        gaoXueYaHuanZheDao = EntityManager.getInstance().gaoXueYaHuanZheDao();

        tangNiaoBingDao = EntityManager.getInstance().tangNiaoBingDao();

        jingshenbinghuanzheDao = EntityManager.getInstance().jingshenbinghuanzheDao();
        jingshenbingjiluDao = EntityManager.getInstance().jingshenbingjiluDao();

        tuFaChuanRanBingBaoGaoDao = EntityManager.getInstance().tuFaChuanRanBingBaoGaoDao();
    }

    @Override
    protected void initData() {

        activityExpandableList.setOnGroupExpandListener(groupPosition -> {
            for (int i = 0; i < groupData.length; i++) {
                if (groupPosition != i && activityExpandableList.isGroupExpanded(i))
                    activityExpandableList.collapseGroup(i);
            }
        });

        activityExpandableList.setOnChildClickListener((parent, v, groupPosition, childPosition, id) -> {
            unSubscribe();//取消所有订阅
            data.clear();//清空右侧所有数据
            showProgressDialog();
            text1.setVisibility(View.INVISIBLE);
            list.setTag(R.id.groupPosition, groupPosition);
            list.setTag(R.id.childPosition, childPosition);
            Subscription s = null;
            switch (String.valueOf(groupPosition) + childPosition) {
                case "00":
                    s = dangAnDao.rx().loadAll()
                            .flatMap(juMinJiChuDangAns -> {
                                for (int i = 0; i < juMinJiChuDangAns.size(); i++) {
                                    juMinJiChuDangAns.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> juMinJiChuDangAns);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });

                    break;
                case "01":
                    s = aDao.rx().loadAll()
                            .flatMap((Func1<List<JianKangTiJianBiao_A>, Observable<List<JianKangTiJianBiao_A>>>)
                                    jianKangTiJianBiao_as -> Observable.fromCallable(new Callable<List<JianKangTiJianBiao_A>>() {
                                        @Override
                                        public List<JianKangTiJianBiao_A> call() throws Exception {
                                            for (int i = 0; i < jianKangTiJianBiao_as.size(); i++) {
                                                jianKangTiJianBiao_as.get(i).tempOrder = i + 1;
                                            }
                                            return jianKangTiJianBiao_as;
                                        }
                                    }))
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "10":
                    s = yufangjiezhongDao.rx().loadAll()
                            .flatMap(yufangjiezhongs -> {
                                for (int i = 0; i < yufangjiezhongs.size(); i++) {
                                    yufangjiezhongs.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> yufangjiezhongs);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "20":
                    s = xinshengerfangshiDao.rx().loadAll()
                            .flatMap(fangshis -> {
                                for (int i = 0; i < fangshis.size(); i++) {
                                    fangshis.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> fangshis);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "21":
                    s = yisuiertongjiankangDao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "22":
                    s = liaosuiertongjiankangDao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "23":
                    s = sansuiertongjiankangDao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "30":
                    s = chanqiansuifangjilu01Dao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "31":
                    s = chanqiansuifangjilu02to05Dao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "32":
                    s = chanhuofangshijiluDao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "33":
                    s = chanhuofangshijilutianhou42Dao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "40":
                    s = laonianrenjiankangDao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "50":
                    s = gaoXueYaHuanZheDao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "60":
                    s = tangNiaoBingDao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "70":
                    s = jingshenbinghuanzheDao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "71":
                    s = jingshenbingjiluDao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                case "80":

                    break;

                case "81":
                    break;
                case "90":
                    s = tuFaChuanRanBingBaoGaoDao.rx().loadAll()
                            .flatMap(entitys -> {
                                for (int i = 0; i < entitys.size(); i++) {
                                    entitys.get(i).tempOrder = i + 1;
                                }
                                return Observable.fromCallable(() -> entitys);
                            })
                            .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                            .subscribe(result -> {
                                        data.clear();
                                        data.addAll(result);
                                        listAdapter.notifyDataSetChanged();
                                        hideProgressDialog();
                                    }
                                    , error -> {
                                        hideProgressDialog();
                                    });
                    break;
                default:
                    s = null;
                    break;
            }
            if (s != null)
                addSubscription(s);

            return false;
        });

        showDefault();
    }

    private void showDefault() {
        activityExpandableList.expandGroup(0);
        list.setTag(R.id.groupPosition, 0);
        list.setTag(R.id.childPosition, 0);
        dangAnDao.rx().loadAll()
                .flatMap(juMinJiChuDangAns -> {
                    for (int i = 0; i < juMinJiChuDangAns.size(); i++) {
                        juMinJiChuDangAns.get(i).tempOrder = i + 1;
                    }
                    return Observable.fromCallable(() -> juMinJiChuDangAns);
                })
                .observeOn(AndroidSchedulers.mainThread())//按日期降序排列!
                .subscribe(result -> {
                            data.clear();
                            data.addAll(result);
                            listAdapter.notifyDataSetChanged();
                            hideProgressDialog();

                        }
                        , error -> {
                            text1.setVisibility(View.VISIBLE);
                            hideProgressDialog();
                        });
    }

    @OnClick({R.id.NavigateHomeLinearLayout2, R.id.NavigateHomeLinearLayout1, R.id.NavigateHomeLinearLayout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.NavigateHomeLinearLayout2:
                break;
            case R.id.NavigateHomeLinearLayout1:
                break;
            case R.id.NavigateHomeLinearLayout:
                addNewItem();
                break;
        }
    }

    private void addNewItem() {
        int groupPosi = (int) list.getTag(R.id.groupPosition);
        int childPosi = (int) list.getTag(R.id.childPosition);
        Subscription s = null;
        switch (String.valueOf(groupPosi) + childPosi) {
            case "00":
                JuMinJiChuDangAn dangAn = new JuMinJiChuDangAn();
                dangAn.setBs_id(Utils.getUUID());
                dangAn.setBs_date(Utils.getDateString(new Date()));
                dangAn.setCreateDate(Utils.getDateString(new Date()));
                s = dangAnDao.rx().insert(dangAn)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                                    ToastUtils.showShort("插入成功!");
                                    item.tempOrder = data.size() + 1;
                                    data.add(item);
                                    listAdapter.notifyDataSetChanged();
                                    list.smoothScrollToPosition(data.size());
                                }
                                , error -> {
                                    ToastUtils.showShort("插入失败!" + error.getMessage());
                                });
                break;
            case "01":
                //一次要么全部成功,要么全不成功!
                try {
                    String dateStr = Utils.getDateString(new Date());
                    String mainId = Utils.getUUID();
                    JianKangTiJianBiao_A aEntity = new JianKangTiJianBiao_A();
                    aEntity.setJktj_id(mainId);
                    aEntity.setNa_id(Utils.getUUID());
                    aEntity.setCreateDate(dateStr);

                    JianKangTiJianBiao_B bEntity = new JianKangTiJianBiao_B();
                    bEntity.setJktj_id(mainId);
                    bEntity.setJktj1_id(Utils.getUUID());
                    bEntity.setCreateDate(dateStr);

                    JianKangTiJianBiao_C cEntity = new JianKangTiJianBiao_C();
                    cEntity.setJktj_id(mainId);
                    cEntity.setJktj2_id(Utils.getUUID());
                    cEntity.setCreateDate(dateStr);

                    JianKangTiJianBiao_D dEntity = new JianKangTiJianBiao_D();
                    dEntity.setJktj_id(mainId);
                    dEntity.setJktj3_id(Utils.getUUID());
                    dEntity.setCreateDate(dateStr);

                    s = aDao.rx().insert(aEntity)
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe(item -> {
                                bDao.rx().insert(bEntity).subscribe();//TODO 先只插入,忽略结果! #*有漏洞*#
                                cDao.rx().insert(cEntity).subscribe();
                                dDao.rx().insert(dEntity).subscribe();
                                item.tempOrder = data.size() + 1;
                                data.add(item);
                                listAdapter.notifyDataSetChanged();
                                hideProgressDialog();
                            }, error -> {
                            });
                } catch (Exception e) {
                    //忽略错误
                }
                break;
            case "10"://预防接种
                Yufangjiezhong newItem = new Yufangjiezhong();
                newItem.setYfjz_id(Utils.getUUID());
                newItem.setCreateDate(Utils.getDateString(new Date()));
                s = yufangjiezhongDao.rx().insert(newItem)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "20":
                Xinshengerjitingfangshi xinshengerEntity = new Xinshengerjitingfangshi();
                xinshengerEntity.setXse_id(Utils.getUUID());
                xinshengerEntity.setCreateDate(Utils.getDateString(new Date()));
                s = xinshengerfangshiDao.rx().insert(xinshengerEntity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "21":
                Yisuiertongjiankang yisuiertongEntity = new Yisuiertongjiankang();
                yisuiertongEntity.setYsjk_id(Utils.getUUID());
                yisuiertongEntity.setCreateDate(Utils.getDateString(new Date()));
                s = yisuiertongjiankangDao.rx().insert(yisuiertongEntity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "22":
                Liangsuiertongjiankang liangsuiertongEntity = new Liangsuiertongjiankang();
                liangsuiertongEntity.setLsjk_id(Utils.getUUID());
                liangsuiertongEntity.setCreateDate(Utils.getDateString(new Date()));
                s = liaosuiertongjiankangDao.rx().insert(liangsuiertongEntity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "23":
                Sandaoliusuiertongjiankang sandaoliusuiertongEntity = new Sandaoliusuiertongjiankang();
                sandaoliusuiertongEntity.setSsjk_id(Utils.getUUID());
                sandaoliusuiertongEntity.setCreateDate(Utils.getDateString(new Date()));
                s = sansuiertongjiankangDao.rx().insert(sandaoliusuiertongEntity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "30":
                Chanqiansuifangjilu01 chanqiansuifangjilu01Entity = new Chanqiansuifangjilu01();
                chanqiansuifangjilu01Entity.setYcf_id(Utils.getUUID());
                chanqiansuifangjilu01Entity.setNa_id(Utils.getUUID());//TODO 这个居民ID如何得到呢?
                chanqiansuifangjilu01Entity.setCreateDate(Utils.getDateString(new Date()));
                s = chanqiansuifangjilu01Dao.rx().insert(chanqiansuifangjilu01Entity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "31":
                Chanqiansuifangjilu02to05 chanqiansuifangjilu02to05Entity = new Chanqiansuifangjilu02to05();
                chanqiansuifangjilu02to05Entity.setYcf2_id(Utils.getUUID());
                chanqiansuifangjilu02to05Entity.setNa_id(Utils.getUUID());//TODO 这个居民ID如何得到呢?
                chanqiansuifangjilu02to05Entity.setCreateDate(Utils.getDateString(new Date()));
                s = chanqiansuifangjilu02to05Dao.rx().insert(chanqiansuifangjilu02to05Entity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "32":
                Chanhuofangshijilu chanhuofangshijiluEntity = new Chanhuofangshijilu();
                chanhuofangshijiluEntity.setYcfp_id(Utils.getUUID());
                chanhuofangshijiluEntity.setNa_id(Utils.getUUID());//TODO 这个居民ID如何得到呢?
                chanhuofangshijiluEntity.setCreateDate(Utils.getDateString(new Date()));
                s = chanhuofangshijiluDao.rx().insert(chanhuofangshijiluEntity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "33":
                Chanhuofangshijilutianhou42 chanhuofangshijilutianhou42Entity = new Chanhuofangshijilutianhou42();
                chanhuofangshijilutianhou42Entity.setYcfp2_id(Utils.getUUID());
                chanhuofangshijilutianhou42Entity.setNa_id(Utils.getUUID());//TODO 这个居民ID如何得到呢?
                chanhuofangshijilutianhou42Entity.setCreateDate(Utils.getDateString(new Date()));
                s = chanhuofangshijilutianhou42Dao.rx().insert(chanhuofangshijilutianhou42Entity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "40":
                Laonianrenjiankang laonianrenjiankangEntity = new Laonianrenjiankang();
                laonianrenjiankangEntity.setLnr_id(Utils.getUUID());
                laonianrenjiankangEntity.setNa_id(Utils.getUUID());//TODO
                laonianrenjiankangEntity.setCreateDate(Utils.getDateString(new Date()));
                s = laonianrenjiankangDao.rx().insert(laonianrenjiankangEntity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "50":
                GaoXueYaHuanZhe gaoxueyahuanzheEntity = new GaoXueYaHuanZhe();
                gaoxueyahuanzheEntity.setGxy_id(Utils.getUUID());
                gaoxueyahuanzheEntity.setNa_id(Utils.getUUID());//TODO
                gaoxueyahuanzheEntity.setCreateDate(Utils.getDateString(new Date()));
                s = gaoXueYaHuanZheDao.rx().insert(gaoxueyahuanzheEntity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "60":
                TangNiaoBing tangniaobingEntity = new TangNiaoBing();
                tangniaobingEntity.setTnb_id(Utils.getUUID());
                tangniaobingEntity.setNa_id(Utils.getUUID());//TODO 这个表中是否也应该有na_id字段呢?
                tangniaobingEntity.setCreateDate(Utils.getDateString(new Date()));
                s = tangNiaoBingDao.rx().insert(tangniaobingEntity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "70":
                Jingshenbinghuanzhe jingshenbinghuanzheEntity = new Jingshenbinghuanzhe();
                jingshenbinghuanzheEntity.setJsb_id(Utils.getUUID());
                jingshenbinghuanzheEntity.setNa_id(Utils.getUUID());
                jingshenbinghuanzheEntity.setCreateDate(Utils.getDateString(new Date()));
                s = jingshenbinghuanzheDao.rx().insert(jingshenbinghuanzheEntity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "71":
                Jingshenbingjilu jingshenbingjiluEntity = new Jingshenbingjilu();
                jingshenbingjiluEntity.setJsb_f_id(Utils.getUUID());
                jingshenbingjiluEntity.setNa_id(Utils.getUUID());
                jingshenbingjiluEntity.setCreateDate(Utils.getDateString(new Date()));
                s = jingshenbingjiluDao.rx().insert(jingshenbingjiluEntity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
            case "80":

                break;

            case "81":

                break;
            case "90":
                TuFaChuanRanBingBaoGao baoGaoEntity = new TuFaChuanRanBingBaoGao();
                baoGaoEntity.setCrb_id(Utils.getUUID());
                baoGaoEntity.setNa_id(Utils.getUUID());
                baoGaoEntity.setCreateDate(Utils.getDateString(new Date()));
                s = tuFaChuanRanBingBaoGaoDao.rx().insert(baoGaoEntity)
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(item -> {
                            item.tempOrder = data.size() + 1;
                            data.add(item);
                            listAdapter.notifyDataSetChanged();
                            ToastUtils.showShort("添加成功!");
                        }, error -> {
                            ToastUtils.showShort("添加失败!");
                        });
                break;
        }
        if (s != null)
            addSubscription(s);


    }

    class ListAdapter extends CommonAdapter<Object> {

        ListAdapter(Context context, int layoutId, List<Object> datas) {
            super(context, layoutId, datas);
        }

        @Override
        protected void convert(ViewHolder viewHolder, Object item, int position) {
            int groupPosi = (int) list.getTag(R.id.groupPosition);
            int childPosi = (int) list.getTag(R.id.childPosition);
            View.OnClickListener listener = null;
            switch (String.valueOf(groupPosi) + childPosi) {
                case "00":
                    JuMinJiChuDangAn dangAnEntity = (JuMinJiChuDangAn) item;
                    viewHolder.setText(R.id.tvRiQi, dangAnEntity.getCreateDate());
                    viewHolder.setText(R.id.tvBiaoMing, childData[0][0]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(dangAnEntity.getCreateDate()));
                    viewHolder.setVisible(R.id.btnDelete, false);
                    viewHolder.setText(R.id.tvNum, String.valueOf(dangAnEntity.tempOrder));

                    break;
                case "01":
                    JianKangTiJianBiao_A tiJianBiaoA = (JianKangTiJianBiao_A) item;
                    viewHolder.setText(R.id.tvRiQi, tiJianBiaoA.getCreateDate());
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(tiJianBiaoA.getCreateDate()));
                    viewHolder.setText(R.id.tvBiaoMing, childData[0][1]);
                    viewHolder.setText(R.id.tvNum, String.valueOf(tiJianBiaoA.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    String mainId = tiJianBiaoA.getJktj_id();
                    listener = v -> {
                        aDao.rx().delete(tiJianBiaoA)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    bDao.delete(bDao.queryBuilder().where(JianKangTiJianBiao_BDao.Properties.Jktj_id.eq(mainId)).unique());
                                    cDao.delete(cDao.queryBuilder().where(JianKangTiJianBiao_CDao.Properties.Jktj_id.eq(mainId)).unique());
                                    dDao.delete(dDao.queryBuilder().where(JianKangTiJianBiao_DDao.Properties.Jktj_id.eq(mainId)).unique());
                                    data.remove(tiJianBiaoA);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "10":
                    Yufangjiezhong yufangjiezhong = (Yufangjiezhong) item;
                    viewHolder.setText(R.id.tvRiQi, yufangjiezhong.getCreateDate());
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(yufangjiezhong.getCreateDate()));
                    viewHolder.setText(R.id.tvBiaoMing, childData[1][0]);
                    viewHolder.setText(R.id.tvNum, String.valueOf(yufangjiezhong.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        yufangjiezhongDao.rx().delete(yufangjiezhong)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(yufangjiezhong);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "20":
                    Xinshengerjitingfangshi xinshengerEntity = (Xinshengerjitingfangshi) item;
                    viewHolder.setText(R.id.tvRiQi, xinshengerEntity.getCreateDate());
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(xinshengerEntity.getCreateDate()));
                    viewHolder.setText(R.id.tvBiaoMing, childData[2][0]);
                    viewHolder.setText(R.id.tvNum, String.valueOf(xinshengerEntity.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        xinshengerfangshiDao.rx().delete(xinshengerEntity)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(xinshengerEntity);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "21":
                    Yisuiertongjiankang yisuiEntity = (Yisuiertongjiankang) item;
                    viewHolder.setText(R.id.tvRiQi, yisuiEntity.getCreateDate());
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(yisuiEntity.getCreateDate()));
                    viewHolder.setText(R.id.tvBiaoMing, childData[2][1]);
                    viewHolder.setText(R.id.tvNum, String.valueOf(yisuiEntity.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        yisuiertongjiankangDao.rx().delete(yisuiEntity)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(yisuiEntity);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "22":
                    Liangsuiertongjiankang liangsuiEntity = (Liangsuiertongjiankang) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[2][2]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(liangsuiEntity.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, liangsuiEntity.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(liangsuiEntity.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        liaosuiertongjiankangDao.rx().delete(liangsuiEntity)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(liangsuiEntity);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "23":
                    Sandaoliusuiertongjiankang sandaoliusuiEntity = (Sandaoliusuiertongjiankang) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[2][3]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(sandaoliusuiEntity.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, sandaoliusuiEntity.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(sandaoliusuiEntity.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        sansuiertongjiankangDao.rx().delete(sandaoliusuiEntity)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(sandaoliusuiEntity);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "30":
                    Chanqiansuifangjilu01 chanqiansuifangjilu01 = (Chanqiansuifangjilu01) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[3][0]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(chanqiansuifangjilu01.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, chanqiansuifangjilu01.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(chanqiansuifangjilu01.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        chanqiansuifangjilu01Dao.rx().delete(chanqiansuifangjilu01)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(chanqiansuifangjilu01);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "31":
                    Chanqiansuifangjilu02to05 chanqiansuifangjilu02to05 = (Chanqiansuifangjilu02to05) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[3][1]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(chanqiansuifangjilu02to05.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, chanqiansuifangjilu02to05.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(chanqiansuifangjilu02to05.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        chanqiansuifangjilu02to05Dao.rx().delete(chanqiansuifangjilu02to05)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(chanqiansuifangjilu02to05);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "32":
                    Chanhuofangshijilu chanhuofangshijilu = (Chanhuofangshijilu) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[3][2]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(chanhuofangshijilu.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, chanhuofangshijilu.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(chanhuofangshijilu.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        chanhuofangshijiluDao.rx().delete(chanhuofangshijilu)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(chanhuofangshijilu);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "33":
                    Chanhuofangshijilutianhou42 chanhuofangshijilutianhou42 = (Chanhuofangshijilutianhou42) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[3][3]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(chanhuofangshijilutianhou42.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, chanhuofangshijilutianhou42.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(chanhuofangshijilutianhou42.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        chanhuofangshijilutianhou42Dao.rx().delete(chanhuofangshijilutianhou42)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(chanhuofangshijilutianhou42);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "40":
                    Laonianrenjiankang laonianrenjiankang = (Laonianrenjiankang) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[4][0]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(laonianrenjiankang.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, laonianrenjiankang.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(laonianrenjiankang.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        laonianrenjiankangDao.rx().delete(laonianrenjiankang)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(laonianrenjiankang);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "50":
                    GaoXueYaHuanZhe gaoXueYaHuanZhe = (GaoXueYaHuanZhe) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[5][0]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(gaoXueYaHuanZhe.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, gaoXueYaHuanZhe.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(gaoXueYaHuanZhe.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        gaoXueYaHuanZheDao.rx().delete(gaoXueYaHuanZhe)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(gaoXueYaHuanZhe);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "60":
                    TangNiaoBing tangNiaoBing = (TangNiaoBing) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[6][0]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(tangNiaoBing.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, tangNiaoBing.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(tangNiaoBing.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        tangNiaoBingDao.rx().delete(tangNiaoBing)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(tangNiaoBing);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "70":
                    Jingshenbinghuanzhe jingshenbinghuanzhe = (Jingshenbinghuanzhe) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[7][0]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(jingshenbinghuanzhe.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, jingshenbinghuanzhe.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(jingshenbinghuanzhe.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        jingshenbinghuanzheDao.rx().delete(jingshenbinghuanzhe)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(jingshenbinghuanzhe);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "71":
                    Jingshenbingjilu jingshenbingjilu = (Jingshenbingjilu) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[7][1]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(jingshenbingjilu.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, jingshenbingjilu.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(jingshenbingjilu.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        jingshenbingjiluDao.rx().delete(jingshenbingjilu)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(jingshenbingjilu);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
                case "80":

                    break;

                case "81":

                    break;
                case "90":
                    TuFaChuanRanBingBaoGao chuanRanBingBaoGao = (TuFaChuanRanBingBaoGao) item;
                    viewHolder.setText(R.id.tvBiaoMing, childData[9][0]);
                    viewHolder.setText(R.id.tvZhouJi, Utils.getWeekFromDateStr(chuanRanBingBaoGao.getCreateDate()));
                    viewHolder.setText(R.id.tvRiQi, chuanRanBingBaoGao.getCreateDate());
                    viewHolder.setText(R.id.tvNum, String.valueOf(chuanRanBingBaoGao.tempOrder));
                    viewHolder.setVisible(R.id.btnDelete, true);
                    listener = v -> {
                        tuFaChuanRanBingBaoGaoDao.rx().delete(chuanRanBingBaoGao)
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(Void -> {
                                    data.remove(chuanRanBingBaoGao);
                                    resort(data);
                                    listAdapter.notifyDataSetChanged();
                                    ToastUtils.showShort("删除成功!");
                                });
                    };
                    break;
            }
            if (listener != null)
                viewHolder.setOnClickListener(R.id.btnDelete, listener);
        }
    }

    class ExpandListAdapter extends BaseExpandableListAdapter {

        @Override
        public int getGroupCount() {
            return groupData.length;
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            return childData[groupPosition].length;
        }

        @Override
        public String getGroup(int groupPosition) {
            return groupData[groupPosition];
        }

        @Override
        public String getChild(int groupPosition, int childPosition) {
            return childData[groupPosition][childPosition];
        }

        @Override
        public long getGroupId(int groupPosition) {
            return groupPosition;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        @Override
        public boolean hasStableIds() {
            return false;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.public_health_expand_group_layout, parent, false);
            String groupName = getGroup(groupPosition);
            TextView tv = inflate.findViewById(R.id.title);
            tv.setText(groupName);
            int drawableLeft;
            switch (groupPosition) {
                case 0:
                    drawableLeft = R.drawable.ic_idno;
                    break;
                case 1:
                    drawableLeft = R.drawable.ic_syringe;
                    break;
                case 2:
                    drawableLeft = R.drawable.ic_children;

                    break;
                case 3:
                    drawableLeft = R.drawable.ic_woman;

                    break;
                case 4:
                    drawableLeft = R.drawable.ic_the_old;

                    break;
                case 5:
                    drawableLeft = R.drawable.ebm_small;

                    break;
                case 6:
                    drawableLeft = R.drawable.ic_pill;

                    break;
                case 7:
                    drawableLeft = R.drawable.ic_ambulance;

                    break;
                case 8:
                    drawableLeft = R.drawable.ic_ambulance;

                    break;
                case 9:
                    drawableLeft = R.drawable.test;

                    break;
                default:
                    drawableLeft = R.drawable.ic_syringe;
                    break;
            }
            tv.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(drawableLeft), null, null, null);
            ImageView groupIndicator = (ImageView) inflate.findViewById(R.id.ivIndicator);
            if (isExpanded) groupIndicator.setImageResource(R.drawable.ic_arrow_down_white);
            else groupIndicator.setImageResource(R.drawable.ic_arrow_left_white);
            return inflate;
        }

        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.public_health_expand_child_layout, parent, false);
            String child = getChild(groupPosition, childPosition);
            TextView tv = inflate.findViewById(R.id.title);
            tv.setText(child);
            return inflate;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return true;
        }

    }

    private void resort(List<BaseEntity> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).tempOrder = i + 1;
        }
    }
}
