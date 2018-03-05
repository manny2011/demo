package com.example.administrator.biaozhunban.greendao.daomanager;

import com.example.administrator.biaozhunban.greendao.ChanhuofangshijiluDao;
import com.example.administrator.biaozhunban.greendao.Chanhuofangshijilutianhou42Dao;
import com.example.administrator.biaozhunban.greendao.Chanqiansuifangjilu01Dao;
import com.example.administrator.biaozhunban.greendao.Chanqiansuifangjilu02to05Dao;
import com.example.administrator.biaozhunban.greendao.DaoSession;
import com.example.administrator.biaozhunban.greendao.GWJiWangJiZuShiDao;
import com.example.administrator.biaozhunban.greendao.GaoXueYaHuanZheDao;
import com.example.administrator.biaozhunban.greendao.JianKangJiaoYuJiLuDao;
import com.example.administrator.biaozhunban.greendao.JianKangTiJianBiao_ADao;
import com.example.administrator.biaozhunban.greendao.JianKangTiJianBiao_BDao;
import com.example.administrator.biaozhunban.greendao.JianKangTiJianBiao_CDao;
import com.example.administrator.biaozhunban.greendao.JianKangTiJianBiao_DDao;
import com.example.administrator.biaozhunban.greendao.JingshenbinghuanzheDao;
import com.example.administrator.biaozhunban.greendao.JingshenbingjiluDao;
import com.example.administrator.biaozhunban.greendao.JuMinJiChuDangAnDao;
import com.example.administrator.biaozhunban.greendao.LaonianrenjiankangDao;
import com.example.administrator.biaozhunban.greendao.LiangsuiertongjiankangDao;
import com.example.administrator.biaozhunban.greendao.NativesDao;
import com.example.administrator.biaozhunban.greendao.SandaoliusuiertongjiankangDao;
import com.example.administrator.biaozhunban.greendao.TangNiaoBingDao;
import com.example.administrator.biaozhunban.greendao.TuFaChuanRanBingBaoGaoDao;
import com.example.administrator.biaozhunban.greendao.UserDao;
import com.example.administrator.biaozhunban.greendao.WeiShengXieGuanBiaoDao;
import com.example.administrator.biaozhunban.greendao.WeiShengXunChaBiaoDao;
import com.example.administrator.biaozhunban.greendao.XinshengerjitingfangshiDao;
import com.example.administrator.biaozhunban.greendao.YisuiertongjiankangDao;
import com.example.administrator.biaozhunban.greendao.YufangjiezhongDao;

/**
 * Created by Administrator on 2018/1/26.
 */

public class EntityManager {
    private static final Object lock = new Object();
    private static EntityManager entityManager;
    private static DaoSession daoSession;

    private EntityManager() {
        daoSession = DaoManager.getInstance().getDaoSession();
    }

    public static EntityManager getInstance() {
        if (entityManager == null) {
            synchronized (lock) {
                if (entityManager == null)
                    entityManager = new EntityManager();
            }
        }
        return entityManager;
    }

    //对外接口!
    public UserDao personDao() {
        return daoSession.getUserDao();
    }
    public NativesDao nativeDao() {
        return daoSession.getNativesDao();
    }
    public WeiShengXieGuanBiaoDao weiShengXieGuanBiaoDao(){return daoSession.getWeiShengXieGuanBiaoDao();}
    public WeiShengXunChaBiaoDao weiShengXunChaBiaoDao(){return daoSession.getWeiShengXunChaBiaoDao();}
    public JianKangJiaoYuJiLuDao jianKangJiaoYuJiLuDao(){return daoSession.getJianKangJiaoYuJiLuDao();}
    public JuMinJiChuDangAnDao juMinJiChuDangAnDao(){return daoSession.getJuMinJiChuDangAnDao();}

    public JianKangTiJianBiao_ADao aDao(){return daoSession.getJianKangTiJianBiao_ADao();}
    public JianKangTiJianBiao_BDao bDao(){return daoSession.getJianKangTiJianBiao_BDao();}
    public JianKangTiJianBiao_CDao cDao(){return daoSession.getJianKangTiJianBiao_CDao();}
    public JianKangTiJianBiao_DDao dDao(){return daoSession.getJianKangTiJianBiao_DDao();}


    public GWJiWangJiZuShiDao gwJiWangJiZuShiDao(){return daoSession.getGWJiWangJiZuShiDao();}
    public YufangjiezhongDao yufangjiezhongDao(){return daoSession.getYufangjiezhongDao();}

    public XinshengerjitingfangshiDao xingshenerfangshiDao(){return daoSession.getXinshengerjitingfangshiDao();}
    public YisuiertongjiankangDao yisuiertongjiankangDao(){return daoSession.getYisuiertongjiankangDao();}
    public LiangsuiertongjiankangDao liangsuiertongjiankangDao(){return daoSession.getLiangsuiertongjiankangDao();}
    public SandaoliusuiertongjiankangDao sandaoliusuiertongjiankangDao(){return daoSession.getSandaoliusuiertongjiankangDao();}

    public Chanqiansuifangjilu01Dao chanqiansuifangjilu01Dao(){return daoSession.getChanqiansuifangjilu01Dao();}
    public Chanqiansuifangjilu02to05Dao chanqiansuifangjilu02to05Dao(){return daoSession.getChanqiansuifangjilu02to05Dao();}
    public ChanhuofangshijiluDao chanhoufangshijiluDao(){return daoSession.getChanhuofangshijiluDao();}
    public Chanhuofangshijilutianhou42Dao chanhuofangshijilutianhou42Dao(){return daoSession.getChanhuofangshijilutianhou42Dao();}

    public LaonianrenjiankangDao laonianrenjiankangDao(){return daoSession.getLaonianrenjiankangDao();}

    public GaoXueYaHuanZheDao gaoXueYaHuanZheDao(){return daoSession.getGaoXueYaHuanZheDao();}

    public TangNiaoBingDao tangNiaoBingDao(){return daoSession.getTangNiaoBingDao();}

    public JingshenbinghuanzheDao jingshenbinghuanzheDao(){return daoSession.getJingshenbinghuanzheDao();}
    public JingshenbingjiluDao jingshenbingjiluDao(){return daoSession.getJingshenbingjiluDao();}

    public TuFaChuanRanBingBaoGaoDao tuFaChuanRanBingBaoGaoDao(){return daoSession.getTuFaChuanRanBingBaoGaoDao();}





}
