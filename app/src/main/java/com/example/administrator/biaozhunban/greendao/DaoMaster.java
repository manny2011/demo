package com.example.administrator.biaozhunban.greendao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * Master of DAO (schema version 1000): knows all DAOs.
 */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 1000;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(Database db, boolean ifNotExists) {
        AgencyDao.createTable(db, ifNotExists);
        BTDeviceDao.createTable(db, ifNotExists);
        ChanhuofangshijiluDao.createTable(db, ifNotExists);
        Chanhuofangshijilutianhou42Dao.createTable(db, ifNotExists);
        Chanqiansuifangjilu01Dao.createTable(db, ifNotExists);
        Chanqiansuifangjilu02to05Dao.createTable(db, ifNotExists);
        ChuanRanBingLeiXingDao.createTable(db, ifNotExists);
        CityDao.createTable(db, ifNotExists);
        CountyDao.createTable(db, ifNotExists);
        DrugDao.createTable(db, ifNotExists);
        FeiMianYiYuFangJieZhongDao.createTable(db, ifNotExists);
        GaoXueYaHuanZheDao.createTable(db, ifNotExists);
        GWJiWangJiZuShiDao.createTable(db, ifNotExists);
        JianKangJiaoYuJiLuDao.createTable(db, ifNotExists);
        JianKangTiJianBiao_ADao.createTable(db, ifNotExists);
        JianKangTiJianBiao_BDao.createTable(db, ifNotExists);
        JianKangTiJianBiao_CDao.createTable(db, ifNotExists);
        JianKangTiJianBiao_DDao.createTable(db, ifNotExists);
        JingshenbinghuanzheDao.createTable(db, ifNotExists);
        JingshenbingjiluDao.createTable(db, ifNotExists);
        JuMinJiChuDangAnDao.createTable(db, ifNotExists);
        LaonianrenjiankangDao.createTable(db, ifNotExists);
        LiangsuiertongjiankangDao.createTable(db, ifNotExists);
        NationDao.createTable(db, ifNotExists);
        NativesDao.createTable(db, ifNotExists);
        ProvinceDao.createTable(db, ifNotExists);
        SandaoliusuiertongjiankangDao.createTable(db, ifNotExists);
        SheBeiDao.createTable(db, ifNotExists);
        SheBeiNiaoJianDao.createTable(db, ifNotExists);
        SheBeiTiWenDao.createTable(db, ifNotExists);
        SheBeiXueTangDao.createTable(db, ifNotExists);
        SheBeiXueYaJiDao.createTable(db, ifNotExists);
        SheBeiXueYangDao.createTable(db, ifNotExists);
        ShengaotizhongDao.createTable(db, ifNotExists);
        TangNiaoBingDao.createTable(db, ifNotExists);
        TuFaChuanRanBingBaoGaoDao.createTable(db, ifNotExists);
        UserDao.createTable(db, ifNotExists);
        WeiShengXieGuanBiaoDao.createTable(db, ifNotExists);
        WeiShengXunChaBiaoDao.createTable(db, ifNotExists);
        XinshengerjitingfangshiDao.createTable(db, ifNotExists);
        XueHongDanBaiDao.createTable(db, ifNotExists);
        YimiaoDao.createTable(db, ifNotExists);
        YisuiertongjiankangDao.createTable(db, ifNotExists);
        YongyaoqingkuangDao.createTable(db, ifNotExists);
        YufangjiezhongDao.createTable(db, ifNotExists);
        ZhengzhuangDao.createTable(db, ifNotExists);
        ZhuyuanzhiliaoqingkuangDao.createTable(db, ifNotExists);
    }

    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(Database db, boolean ifExists) {
        AgencyDao.dropTable(db, ifExists);
        BTDeviceDao.dropTable(db, ifExists);
        ChanhuofangshijiluDao.dropTable(db, ifExists);
        Chanhuofangshijilutianhou42Dao.dropTable(db, ifExists);
        Chanqiansuifangjilu01Dao.dropTable(db, ifExists);
        Chanqiansuifangjilu02to05Dao.dropTable(db, ifExists);
        ChuanRanBingLeiXingDao.dropTable(db, ifExists);
        CityDao.dropTable(db, ifExists);
        CountyDao.dropTable(db, ifExists);
        DrugDao.dropTable(db, ifExists);
        FeiMianYiYuFangJieZhongDao.dropTable(db, ifExists);
        GaoXueYaHuanZheDao.dropTable(db, ifExists);
        GWJiWangJiZuShiDao.dropTable(db, ifExists);
        JianKangJiaoYuJiLuDao.dropTable(db, ifExists);
        JianKangTiJianBiao_ADao.dropTable(db, ifExists);
        JianKangTiJianBiao_BDao.dropTable(db, ifExists);
        JianKangTiJianBiao_CDao.dropTable(db, ifExists);
        JianKangTiJianBiao_DDao.dropTable(db, ifExists);
        JingshenbinghuanzheDao.dropTable(db, ifExists);
        JingshenbingjiluDao.dropTable(db, ifExists);
        JuMinJiChuDangAnDao.dropTable(db, ifExists);
        LaonianrenjiankangDao.dropTable(db, ifExists);
        LiangsuiertongjiankangDao.dropTable(db, ifExists);
        NationDao.dropTable(db, ifExists);
        NativesDao.dropTable(db, ifExists);
        ProvinceDao.dropTable(db, ifExists);
        SandaoliusuiertongjiankangDao.dropTable(db, ifExists);
        SheBeiDao.dropTable(db, ifExists);
        SheBeiNiaoJianDao.dropTable(db, ifExists);
        SheBeiTiWenDao.dropTable(db, ifExists);
        SheBeiXueTangDao.dropTable(db, ifExists);
        SheBeiXueYaJiDao.dropTable(db, ifExists);
        SheBeiXueYangDao.dropTable(db, ifExists);
        ShengaotizhongDao.dropTable(db, ifExists);
        TangNiaoBingDao.dropTable(db, ifExists);
        TuFaChuanRanBingBaoGaoDao.dropTable(db, ifExists);
        UserDao.dropTable(db, ifExists);
        WeiShengXieGuanBiaoDao.dropTable(db, ifExists);
        WeiShengXunChaBiaoDao.dropTable(db, ifExists);
        XinshengerjitingfangshiDao.dropTable(db, ifExists);
        XueHongDanBaiDao.dropTable(db, ifExists);
        YimiaoDao.dropTable(db, ifExists);
        YisuiertongjiankangDao.dropTable(db, ifExists);
        YongyaoqingkuangDao.dropTable(db, ifExists);
        YufangjiezhongDao.dropTable(db, ifExists);
        ZhengzhuangDao.dropTable(db, ifExists);
        ZhuyuanzhiliaoqingkuangDao.dropTable(db, ifExists);
    }

    /**
     * WARNING: Drops all table on Upgrade! Use only during development.
     * Convenience method using a {@link DevOpenHelper}.
     */
    public static DaoSession newDevSession(Context context, String name) {
        Database db = new DevOpenHelper(context, name).getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        return daoMaster.newSession();
    }

    public DaoMaster(SQLiteDatabase db) {
        this(new StandardDatabase(db));
    }

    public DaoMaster(Database db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(AgencyDao.class);
        registerDaoClass(BTDeviceDao.class);
        registerDaoClass(ChanhuofangshijiluDao.class);
        registerDaoClass(Chanhuofangshijilutianhou42Dao.class);
        registerDaoClass(Chanqiansuifangjilu01Dao.class);
        registerDaoClass(Chanqiansuifangjilu02to05Dao.class);
        registerDaoClass(ChuanRanBingLeiXingDao.class);
        registerDaoClass(CityDao.class);
        registerDaoClass(CountyDao.class);
        registerDaoClass(DrugDao.class);
        registerDaoClass(FeiMianYiYuFangJieZhongDao.class);
        registerDaoClass(GaoXueYaHuanZheDao.class);
        registerDaoClass(GWJiWangJiZuShiDao.class);
        registerDaoClass(JianKangJiaoYuJiLuDao.class);
        registerDaoClass(JianKangTiJianBiao_ADao.class);
        registerDaoClass(JianKangTiJianBiao_BDao.class);
        registerDaoClass(JianKangTiJianBiao_CDao.class);
        registerDaoClass(JianKangTiJianBiao_DDao.class);
        registerDaoClass(JingshenbinghuanzheDao.class);
        registerDaoClass(JingshenbingjiluDao.class);
        registerDaoClass(JuMinJiChuDangAnDao.class);
        registerDaoClass(LaonianrenjiankangDao.class);
        registerDaoClass(LiangsuiertongjiankangDao.class);
        registerDaoClass(NationDao.class);
        registerDaoClass(NativesDao.class);
        registerDaoClass(ProvinceDao.class);
        registerDaoClass(SandaoliusuiertongjiankangDao.class);
        registerDaoClass(SheBeiDao.class);
        registerDaoClass(SheBeiNiaoJianDao.class);
        registerDaoClass(SheBeiTiWenDao.class);
        registerDaoClass(SheBeiXueTangDao.class);
        registerDaoClass(SheBeiXueYaJiDao.class);
        registerDaoClass(SheBeiXueYangDao.class);
        registerDaoClass(ShengaotizhongDao.class);
        registerDaoClass(TangNiaoBingDao.class);
        registerDaoClass(TuFaChuanRanBingBaoGaoDao.class);
        registerDaoClass(UserDao.class);
        registerDaoClass(WeiShengXieGuanBiaoDao.class);
        registerDaoClass(WeiShengXunChaBiaoDao.class);
        registerDaoClass(XinshengerjitingfangshiDao.class);
        registerDaoClass(XueHongDanBaiDao.class);
        registerDaoClass(YimiaoDao.class);
        registerDaoClass(YisuiertongjiankangDao.class);
        registerDaoClass(YongyaoqingkuangDao.class);
        registerDaoClass(YufangjiezhongDao.class);
        registerDaoClass(ZhengzhuangDao.class);
        registerDaoClass(ZhuyuanzhiliaoqingkuangDao.class);
    }

    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }

    /**
     * Calls {@link #createAllTables(Database, boolean)} in {@link #onCreate(Database)} -
     */
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }

    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name) {
            super(context, name);
        }

        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

}
