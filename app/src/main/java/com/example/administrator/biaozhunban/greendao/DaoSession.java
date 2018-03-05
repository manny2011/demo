package com.example.administrator.biaozhunban.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.administrator.biaozhunban.greendao.entity.Agency;
import com.example.administrator.biaozhunban.greendao.entity.BTDevice;
import com.example.administrator.biaozhunban.greendao.entity.Chanhuofangshijilu;
import com.example.administrator.biaozhunban.greendao.entity.Chanhuofangshijilutianhou42;
import com.example.administrator.biaozhunban.greendao.entity.Chanqiansuifangjilu01;
import com.example.administrator.biaozhunban.greendao.entity.Chanqiansuifangjilu02to05;
import com.example.administrator.biaozhunban.greendao.entity.ChuanRanBingLeiXing;
import com.example.administrator.biaozhunban.greendao.entity.City;
import com.example.administrator.biaozhunban.greendao.entity.County;
import com.example.administrator.biaozhunban.greendao.entity.Drug;
import com.example.administrator.biaozhunban.greendao.entity.FeiMianYiYuFangJieZhong;
import com.example.administrator.biaozhunban.greendao.entity.GaoXueYaHuanZhe;
import com.example.administrator.biaozhunban.greendao.entity.GWJiWangJiZuShi;
import com.example.administrator.biaozhunban.greendao.entity.JianKangJiaoYuJiLu;
import com.example.administrator.biaozhunban.greendao.entity.JianKangTiJianBiao_A;
import com.example.administrator.biaozhunban.greendao.entity.JianKangTiJianBiao_B;
import com.example.administrator.biaozhunban.greendao.entity.JianKangTiJianBiao_C;
import com.example.administrator.biaozhunban.greendao.entity.JianKangTiJianBiao_D;
import com.example.administrator.biaozhunban.greendao.entity.Jingshenbinghuanzhe;
import com.example.administrator.biaozhunban.greendao.entity.Jingshenbingjilu;
import com.example.administrator.biaozhunban.greendao.entity.JuMinJiChuDangAn;
import com.example.administrator.biaozhunban.greendao.entity.Laonianrenjiankang;
import com.example.administrator.biaozhunban.greendao.entity.Liangsuiertongjiankang;
import com.example.administrator.biaozhunban.greendao.entity.Nation;
import com.example.administrator.biaozhunban.greendao.entity.Natives;
import com.example.administrator.biaozhunban.greendao.entity.Province;
import com.example.administrator.biaozhunban.greendao.entity.Sandaoliusuiertongjiankang;
import com.example.administrator.biaozhunban.greendao.entity.SheBei;
import com.example.administrator.biaozhunban.greendao.entity.SheBeiNiaoJian;
import com.example.administrator.biaozhunban.greendao.entity.SheBeiTiWen;
import com.example.administrator.biaozhunban.greendao.entity.SheBeiXueTang;
import com.example.administrator.biaozhunban.greendao.entity.SheBeiXueYaJi;
import com.example.administrator.biaozhunban.greendao.entity.SheBeiXueYang;
import com.example.administrator.biaozhunban.greendao.entity.Shengaotizhong;
import com.example.administrator.biaozhunban.greendao.entity.TangNiaoBing;
import com.example.administrator.biaozhunban.greendao.entity.TuFaChuanRanBingBaoGao;
import com.example.administrator.biaozhunban.greendao.entity.User;
import com.example.administrator.biaozhunban.greendao.entity.WeiShengXieGuanBiao;
import com.example.administrator.biaozhunban.greendao.entity.WeiShengXunChaBiao;
import com.example.administrator.biaozhunban.greendao.entity.Xinshengerjitingfangshi;
import com.example.administrator.biaozhunban.greendao.entity.XueHongDanBai;
import com.example.administrator.biaozhunban.greendao.entity.Yimiao;
import com.example.administrator.biaozhunban.greendao.entity.Yisuiertongjiankang;
import com.example.administrator.biaozhunban.greendao.entity.Yongyaoqingkuang;
import com.example.administrator.biaozhunban.greendao.entity.Yufangjiezhong;
import com.example.administrator.biaozhunban.greendao.entity.Zhengzhuang;
import com.example.administrator.biaozhunban.greendao.entity.Zhuyuanzhiliaoqingkuang;

import com.example.administrator.biaozhunban.greendao.AgencyDao;
import com.example.administrator.biaozhunban.greendao.BTDeviceDao;
import com.example.administrator.biaozhunban.greendao.ChanhuofangshijiluDao;
import com.example.administrator.biaozhunban.greendao.Chanhuofangshijilutianhou42Dao;
import com.example.administrator.biaozhunban.greendao.Chanqiansuifangjilu01Dao;
import com.example.administrator.biaozhunban.greendao.Chanqiansuifangjilu02to05Dao;
import com.example.administrator.biaozhunban.greendao.ChuanRanBingLeiXingDao;
import com.example.administrator.biaozhunban.greendao.CityDao;
import com.example.administrator.biaozhunban.greendao.CountyDao;
import com.example.administrator.biaozhunban.greendao.DrugDao;
import com.example.administrator.biaozhunban.greendao.FeiMianYiYuFangJieZhongDao;
import com.example.administrator.biaozhunban.greendao.GaoXueYaHuanZheDao;
import com.example.administrator.biaozhunban.greendao.GWJiWangJiZuShiDao;
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
import com.example.administrator.biaozhunban.greendao.NationDao;
import com.example.administrator.biaozhunban.greendao.NativesDao;
import com.example.administrator.biaozhunban.greendao.ProvinceDao;
import com.example.administrator.biaozhunban.greendao.SandaoliusuiertongjiankangDao;
import com.example.administrator.biaozhunban.greendao.SheBeiDao;
import com.example.administrator.biaozhunban.greendao.SheBeiNiaoJianDao;
import com.example.administrator.biaozhunban.greendao.SheBeiTiWenDao;
import com.example.administrator.biaozhunban.greendao.SheBeiXueTangDao;
import com.example.administrator.biaozhunban.greendao.SheBeiXueYaJiDao;
import com.example.administrator.biaozhunban.greendao.SheBeiXueYangDao;
import com.example.administrator.biaozhunban.greendao.ShengaotizhongDao;
import com.example.administrator.biaozhunban.greendao.TangNiaoBingDao;
import com.example.administrator.biaozhunban.greendao.TuFaChuanRanBingBaoGaoDao;
import com.example.administrator.biaozhunban.greendao.UserDao;
import com.example.administrator.biaozhunban.greendao.WeiShengXieGuanBiaoDao;
import com.example.administrator.biaozhunban.greendao.WeiShengXunChaBiaoDao;
import com.example.administrator.biaozhunban.greendao.XinshengerjitingfangshiDao;
import com.example.administrator.biaozhunban.greendao.XueHongDanBaiDao;
import com.example.administrator.biaozhunban.greendao.YimiaoDao;
import com.example.administrator.biaozhunban.greendao.YisuiertongjiankangDao;
import com.example.administrator.biaozhunban.greendao.YongyaoqingkuangDao;
import com.example.administrator.biaozhunban.greendao.YufangjiezhongDao;
import com.example.administrator.biaozhunban.greendao.ZhengzhuangDao;
import com.example.administrator.biaozhunban.greendao.ZhuyuanzhiliaoqingkuangDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig agencyDaoConfig;
    private final DaoConfig bTDeviceDaoConfig;
    private final DaoConfig chanhuofangshijiluDaoConfig;
    private final DaoConfig chanhuofangshijilutianhou42DaoConfig;
    private final DaoConfig chanqiansuifangjilu01DaoConfig;
    private final DaoConfig chanqiansuifangjilu02to05DaoConfig;
    private final DaoConfig chuanRanBingLeiXingDaoConfig;
    private final DaoConfig cityDaoConfig;
    private final DaoConfig countyDaoConfig;
    private final DaoConfig drugDaoConfig;
    private final DaoConfig feiMianYiYuFangJieZhongDaoConfig;
    private final DaoConfig gaoXueYaHuanZheDaoConfig;
    private final DaoConfig gWJiWangJiZuShiDaoConfig;
    private final DaoConfig jianKangJiaoYuJiLuDaoConfig;
    private final DaoConfig jianKangTiJianBiao_ADaoConfig;
    private final DaoConfig jianKangTiJianBiao_BDaoConfig;
    private final DaoConfig jianKangTiJianBiao_CDaoConfig;
    private final DaoConfig jianKangTiJianBiao_DDaoConfig;
    private final DaoConfig jingshenbinghuanzheDaoConfig;
    private final DaoConfig jingshenbingjiluDaoConfig;
    private final DaoConfig juMinJiChuDangAnDaoConfig;
    private final DaoConfig laonianrenjiankangDaoConfig;
    private final DaoConfig liangsuiertongjiankangDaoConfig;
    private final DaoConfig nationDaoConfig;
    private final DaoConfig nativesDaoConfig;
    private final DaoConfig provinceDaoConfig;
    private final DaoConfig sandaoliusuiertongjiankangDaoConfig;
    private final DaoConfig sheBeiDaoConfig;
    private final DaoConfig sheBeiNiaoJianDaoConfig;
    private final DaoConfig sheBeiTiWenDaoConfig;
    private final DaoConfig sheBeiXueTangDaoConfig;
    private final DaoConfig sheBeiXueYaJiDaoConfig;
    private final DaoConfig sheBeiXueYangDaoConfig;
    private final DaoConfig shengaotizhongDaoConfig;
    private final DaoConfig tangNiaoBingDaoConfig;
    private final DaoConfig tuFaChuanRanBingBaoGaoDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig weiShengXieGuanBiaoDaoConfig;
    private final DaoConfig weiShengXunChaBiaoDaoConfig;
    private final DaoConfig xinshengerjitingfangshiDaoConfig;
    private final DaoConfig xueHongDanBaiDaoConfig;
    private final DaoConfig yimiaoDaoConfig;
    private final DaoConfig yisuiertongjiankangDaoConfig;
    private final DaoConfig yongyaoqingkuangDaoConfig;
    private final DaoConfig yufangjiezhongDaoConfig;
    private final DaoConfig zhengzhuangDaoConfig;
    private final DaoConfig zhuyuanzhiliaoqingkuangDaoConfig;

    private final AgencyDao agencyDao;
    private final BTDeviceDao bTDeviceDao;
    private final ChanhuofangshijiluDao chanhuofangshijiluDao;
    private final Chanhuofangshijilutianhou42Dao chanhuofangshijilutianhou42Dao;
    private final Chanqiansuifangjilu01Dao chanqiansuifangjilu01Dao;
    private final Chanqiansuifangjilu02to05Dao chanqiansuifangjilu02to05Dao;
    private final ChuanRanBingLeiXingDao chuanRanBingLeiXingDao;
    private final CityDao cityDao;
    private final CountyDao countyDao;
    private final DrugDao drugDao;
    private final FeiMianYiYuFangJieZhongDao feiMianYiYuFangJieZhongDao;
    private final GaoXueYaHuanZheDao gaoXueYaHuanZheDao;
    private final GWJiWangJiZuShiDao gWJiWangJiZuShiDao;
    private final JianKangJiaoYuJiLuDao jianKangJiaoYuJiLuDao;
    private final JianKangTiJianBiao_ADao jianKangTiJianBiao_ADao;
    private final JianKangTiJianBiao_BDao jianKangTiJianBiao_BDao;
    private final JianKangTiJianBiao_CDao jianKangTiJianBiao_CDao;
    private final JianKangTiJianBiao_DDao jianKangTiJianBiao_DDao;
    private final JingshenbinghuanzheDao jingshenbinghuanzheDao;
    private final JingshenbingjiluDao jingshenbingjiluDao;
    private final JuMinJiChuDangAnDao juMinJiChuDangAnDao;
    private final LaonianrenjiankangDao laonianrenjiankangDao;
    private final LiangsuiertongjiankangDao liangsuiertongjiankangDao;
    private final NationDao nationDao;
    private final NativesDao nativesDao;
    private final ProvinceDao provinceDao;
    private final SandaoliusuiertongjiankangDao sandaoliusuiertongjiankangDao;
    private final SheBeiDao sheBeiDao;
    private final SheBeiNiaoJianDao sheBeiNiaoJianDao;
    private final SheBeiTiWenDao sheBeiTiWenDao;
    private final SheBeiXueTangDao sheBeiXueTangDao;
    private final SheBeiXueYaJiDao sheBeiXueYaJiDao;
    private final SheBeiXueYangDao sheBeiXueYangDao;
    private final ShengaotizhongDao shengaotizhongDao;
    private final TangNiaoBingDao tangNiaoBingDao;
    private final TuFaChuanRanBingBaoGaoDao tuFaChuanRanBingBaoGaoDao;
    private final UserDao userDao;
    private final WeiShengXieGuanBiaoDao weiShengXieGuanBiaoDao;
    private final WeiShengXunChaBiaoDao weiShengXunChaBiaoDao;
    private final XinshengerjitingfangshiDao xinshengerjitingfangshiDao;
    private final XueHongDanBaiDao xueHongDanBaiDao;
    private final YimiaoDao yimiaoDao;
    private final YisuiertongjiankangDao yisuiertongjiankangDao;
    private final YongyaoqingkuangDao yongyaoqingkuangDao;
    private final YufangjiezhongDao yufangjiezhongDao;
    private final ZhengzhuangDao zhengzhuangDao;
    private final ZhuyuanzhiliaoqingkuangDao zhuyuanzhiliaoqingkuangDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        agencyDaoConfig = daoConfigMap.get(AgencyDao.class).clone();
        agencyDaoConfig.initIdentityScope(type);

        bTDeviceDaoConfig = daoConfigMap.get(BTDeviceDao.class).clone();
        bTDeviceDaoConfig.initIdentityScope(type);

        chanhuofangshijiluDaoConfig = daoConfigMap.get(ChanhuofangshijiluDao.class).clone();
        chanhuofangshijiluDaoConfig.initIdentityScope(type);

        chanhuofangshijilutianhou42DaoConfig = daoConfigMap.get(Chanhuofangshijilutianhou42Dao.class).clone();
        chanhuofangshijilutianhou42DaoConfig.initIdentityScope(type);

        chanqiansuifangjilu01DaoConfig = daoConfigMap.get(Chanqiansuifangjilu01Dao.class).clone();
        chanqiansuifangjilu01DaoConfig.initIdentityScope(type);

        chanqiansuifangjilu02to05DaoConfig = daoConfigMap.get(Chanqiansuifangjilu02to05Dao.class).clone();
        chanqiansuifangjilu02to05DaoConfig.initIdentityScope(type);

        chuanRanBingLeiXingDaoConfig = daoConfigMap.get(ChuanRanBingLeiXingDao.class).clone();
        chuanRanBingLeiXingDaoConfig.initIdentityScope(type);

        cityDaoConfig = daoConfigMap.get(CityDao.class).clone();
        cityDaoConfig.initIdentityScope(type);

        countyDaoConfig = daoConfigMap.get(CountyDao.class).clone();
        countyDaoConfig.initIdentityScope(type);

        drugDaoConfig = daoConfigMap.get(DrugDao.class).clone();
        drugDaoConfig.initIdentityScope(type);

        feiMianYiYuFangJieZhongDaoConfig = daoConfigMap.get(FeiMianYiYuFangJieZhongDao.class).clone();
        feiMianYiYuFangJieZhongDaoConfig.initIdentityScope(type);

        gaoXueYaHuanZheDaoConfig = daoConfigMap.get(GaoXueYaHuanZheDao.class).clone();
        gaoXueYaHuanZheDaoConfig.initIdentityScope(type);

        gWJiWangJiZuShiDaoConfig = daoConfigMap.get(GWJiWangJiZuShiDao.class).clone();
        gWJiWangJiZuShiDaoConfig.initIdentityScope(type);

        jianKangJiaoYuJiLuDaoConfig = daoConfigMap.get(JianKangJiaoYuJiLuDao.class).clone();
        jianKangJiaoYuJiLuDaoConfig.initIdentityScope(type);

        jianKangTiJianBiao_ADaoConfig = daoConfigMap.get(JianKangTiJianBiao_ADao.class).clone();
        jianKangTiJianBiao_ADaoConfig.initIdentityScope(type);

        jianKangTiJianBiao_BDaoConfig = daoConfigMap.get(JianKangTiJianBiao_BDao.class).clone();
        jianKangTiJianBiao_BDaoConfig.initIdentityScope(type);

        jianKangTiJianBiao_CDaoConfig = daoConfigMap.get(JianKangTiJianBiao_CDao.class).clone();
        jianKangTiJianBiao_CDaoConfig.initIdentityScope(type);

        jianKangTiJianBiao_DDaoConfig = daoConfigMap.get(JianKangTiJianBiao_DDao.class).clone();
        jianKangTiJianBiao_DDaoConfig.initIdentityScope(type);

        jingshenbinghuanzheDaoConfig = daoConfigMap.get(JingshenbinghuanzheDao.class).clone();
        jingshenbinghuanzheDaoConfig.initIdentityScope(type);

        jingshenbingjiluDaoConfig = daoConfigMap.get(JingshenbingjiluDao.class).clone();
        jingshenbingjiluDaoConfig.initIdentityScope(type);

        juMinJiChuDangAnDaoConfig = daoConfigMap.get(JuMinJiChuDangAnDao.class).clone();
        juMinJiChuDangAnDaoConfig.initIdentityScope(type);

        laonianrenjiankangDaoConfig = daoConfigMap.get(LaonianrenjiankangDao.class).clone();
        laonianrenjiankangDaoConfig.initIdentityScope(type);

        liangsuiertongjiankangDaoConfig = daoConfigMap.get(LiangsuiertongjiankangDao.class).clone();
        liangsuiertongjiankangDaoConfig.initIdentityScope(type);

        nationDaoConfig = daoConfigMap.get(NationDao.class).clone();
        nationDaoConfig.initIdentityScope(type);

        nativesDaoConfig = daoConfigMap.get(NativesDao.class).clone();
        nativesDaoConfig.initIdentityScope(type);

        provinceDaoConfig = daoConfigMap.get(ProvinceDao.class).clone();
        provinceDaoConfig.initIdentityScope(type);

        sandaoliusuiertongjiankangDaoConfig = daoConfigMap.get(SandaoliusuiertongjiankangDao.class).clone();
        sandaoliusuiertongjiankangDaoConfig.initIdentityScope(type);

        sheBeiDaoConfig = daoConfigMap.get(SheBeiDao.class).clone();
        sheBeiDaoConfig.initIdentityScope(type);

        sheBeiNiaoJianDaoConfig = daoConfigMap.get(SheBeiNiaoJianDao.class).clone();
        sheBeiNiaoJianDaoConfig.initIdentityScope(type);

        sheBeiTiWenDaoConfig = daoConfigMap.get(SheBeiTiWenDao.class).clone();
        sheBeiTiWenDaoConfig.initIdentityScope(type);

        sheBeiXueTangDaoConfig = daoConfigMap.get(SheBeiXueTangDao.class).clone();
        sheBeiXueTangDaoConfig.initIdentityScope(type);

        sheBeiXueYaJiDaoConfig = daoConfigMap.get(SheBeiXueYaJiDao.class).clone();
        sheBeiXueYaJiDaoConfig.initIdentityScope(type);

        sheBeiXueYangDaoConfig = daoConfigMap.get(SheBeiXueYangDao.class).clone();
        sheBeiXueYangDaoConfig.initIdentityScope(type);

        shengaotizhongDaoConfig = daoConfigMap.get(ShengaotizhongDao.class).clone();
        shengaotizhongDaoConfig.initIdentityScope(type);

        tangNiaoBingDaoConfig = daoConfigMap.get(TangNiaoBingDao.class).clone();
        tangNiaoBingDaoConfig.initIdentityScope(type);

        tuFaChuanRanBingBaoGaoDaoConfig = daoConfigMap.get(TuFaChuanRanBingBaoGaoDao.class).clone();
        tuFaChuanRanBingBaoGaoDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        weiShengXieGuanBiaoDaoConfig = daoConfigMap.get(WeiShengXieGuanBiaoDao.class).clone();
        weiShengXieGuanBiaoDaoConfig.initIdentityScope(type);

        weiShengXunChaBiaoDaoConfig = daoConfigMap.get(WeiShengXunChaBiaoDao.class).clone();
        weiShengXunChaBiaoDaoConfig.initIdentityScope(type);

        xinshengerjitingfangshiDaoConfig = daoConfigMap.get(XinshengerjitingfangshiDao.class).clone();
        xinshengerjitingfangshiDaoConfig.initIdentityScope(type);

        xueHongDanBaiDaoConfig = daoConfigMap.get(XueHongDanBaiDao.class).clone();
        xueHongDanBaiDaoConfig.initIdentityScope(type);

        yimiaoDaoConfig = daoConfigMap.get(YimiaoDao.class).clone();
        yimiaoDaoConfig.initIdentityScope(type);

        yisuiertongjiankangDaoConfig = daoConfigMap.get(YisuiertongjiankangDao.class).clone();
        yisuiertongjiankangDaoConfig.initIdentityScope(type);

        yongyaoqingkuangDaoConfig = daoConfigMap.get(YongyaoqingkuangDao.class).clone();
        yongyaoqingkuangDaoConfig.initIdentityScope(type);

        yufangjiezhongDaoConfig = daoConfigMap.get(YufangjiezhongDao.class).clone();
        yufangjiezhongDaoConfig.initIdentityScope(type);

        zhengzhuangDaoConfig = daoConfigMap.get(ZhengzhuangDao.class).clone();
        zhengzhuangDaoConfig.initIdentityScope(type);

        zhuyuanzhiliaoqingkuangDaoConfig = daoConfigMap.get(ZhuyuanzhiliaoqingkuangDao.class).clone();
        zhuyuanzhiliaoqingkuangDaoConfig.initIdentityScope(type);

        agencyDao = new AgencyDao(agencyDaoConfig, this);
        bTDeviceDao = new BTDeviceDao(bTDeviceDaoConfig, this);
        chanhuofangshijiluDao = new ChanhuofangshijiluDao(chanhuofangshijiluDaoConfig, this);
        chanhuofangshijilutianhou42Dao = new Chanhuofangshijilutianhou42Dao(chanhuofangshijilutianhou42DaoConfig, this);
        chanqiansuifangjilu01Dao = new Chanqiansuifangjilu01Dao(chanqiansuifangjilu01DaoConfig, this);
        chanqiansuifangjilu02to05Dao = new Chanqiansuifangjilu02to05Dao(chanqiansuifangjilu02to05DaoConfig, this);
        chuanRanBingLeiXingDao = new ChuanRanBingLeiXingDao(chuanRanBingLeiXingDaoConfig, this);
        cityDao = new CityDao(cityDaoConfig, this);
        countyDao = new CountyDao(countyDaoConfig, this);
        drugDao = new DrugDao(drugDaoConfig, this);
        feiMianYiYuFangJieZhongDao = new FeiMianYiYuFangJieZhongDao(feiMianYiYuFangJieZhongDaoConfig, this);
        gaoXueYaHuanZheDao = new GaoXueYaHuanZheDao(gaoXueYaHuanZheDaoConfig, this);
        gWJiWangJiZuShiDao = new GWJiWangJiZuShiDao(gWJiWangJiZuShiDaoConfig, this);
        jianKangJiaoYuJiLuDao = new JianKangJiaoYuJiLuDao(jianKangJiaoYuJiLuDaoConfig, this);
        jianKangTiJianBiao_ADao = new JianKangTiJianBiao_ADao(jianKangTiJianBiao_ADaoConfig, this);
        jianKangTiJianBiao_BDao = new JianKangTiJianBiao_BDao(jianKangTiJianBiao_BDaoConfig, this);
        jianKangTiJianBiao_CDao = new JianKangTiJianBiao_CDao(jianKangTiJianBiao_CDaoConfig, this);
        jianKangTiJianBiao_DDao = new JianKangTiJianBiao_DDao(jianKangTiJianBiao_DDaoConfig, this);
        jingshenbinghuanzheDao = new JingshenbinghuanzheDao(jingshenbinghuanzheDaoConfig, this);
        jingshenbingjiluDao = new JingshenbingjiluDao(jingshenbingjiluDaoConfig, this);
        juMinJiChuDangAnDao = new JuMinJiChuDangAnDao(juMinJiChuDangAnDaoConfig, this);
        laonianrenjiankangDao = new LaonianrenjiankangDao(laonianrenjiankangDaoConfig, this);
        liangsuiertongjiankangDao = new LiangsuiertongjiankangDao(liangsuiertongjiankangDaoConfig, this);
        nationDao = new NationDao(nationDaoConfig, this);
        nativesDao = new NativesDao(nativesDaoConfig, this);
        provinceDao = new ProvinceDao(provinceDaoConfig, this);
        sandaoliusuiertongjiankangDao = new SandaoliusuiertongjiankangDao(sandaoliusuiertongjiankangDaoConfig, this);
        sheBeiDao = new SheBeiDao(sheBeiDaoConfig, this);
        sheBeiNiaoJianDao = new SheBeiNiaoJianDao(sheBeiNiaoJianDaoConfig, this);
        sheBeiTiWenDao = new SheBeiTiWenDao(sheBeiTiWenDaoConfig, this);
        sheBeiXueTangDao = new SheBeiXueTangDao(sheBeiXueTangDaoConfig, this);
        sheBeiXueYaJiDao = new SheBeiXueYaJiDao(sheBeiXueYaJiDaoConfig, this);
        sheBeiXueYangDao = new SheBeiXueYangDao(sheBeiXueYangDaoConfig, this);
        shengaotizhongDao = new ShengaotizhongDao(shengaotizhongDaoConfig, this);
        tangNiaoBingDao = new TangNiaoBingDao(tangNiaoBingDaoConfig, this);
        tuFaChuanRanBingBaoGaoDao = new TuFaChuanRanBingBaoGaoDao(tuFaChuanRanBingBaoGaoDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        weiShengXieGuanBiaoDao = new WeiShengXieGuanBiaoDao(weiShengXieGuanBiaoDaoConfig, this);
        weiShengXunChaBiaoDao = new WeiShengXunChaBiaoDao(weiShengXunChaBiaoDaoConfig, this);
        xinshengerjitingfangshiDao = new XinshengerjitingfangshiDao(xinshengerjitingfangshiDaoConfig, this);
        xueHongDanBaiDao = new XueHongDanBaiDao(xueHongDanBaiDaoConfig, this);
        yimiaoDao = new YimiaoDao(yimiaoDaoConfig, this);
        yisuiertongjiankangDao = new YisuiertongjiankangDao(yisuiertongjiankangDaoConfig, this);
        yongyaoqingkuangDao = new YongyaoqingkuangDao(yongyaoqingkuangDaoConfig, this);
        yufangjiezhongDao = new YufangjiezhongDao(yufangjiezhongDaoConfig, this);
        zhengzhuangDao = new ZhengzhuangDao(zhengzhuangDaoConfig, this);
        zhuyuanzhiliaoqingkuangDao = new ZhuyuanzhiliaoqingkuangDao(zhuyuanzhiliaoqingkuangDaoConfig, this);

        registerDao(Agency.class, agencyDao);
        registerDao(BTDevice.class, bTDeviceDao);
        registerDao(Chanhuofangshijilu.class, chanhuofangshijiluDao);
        registerDao(Chanhuofangshijilutianhou42.class, chanhuofangshijilutianhou42Dao);
        registerDao(Chanqiansuifangjilu01.class, chanqiansuifangjilu01Dao);
        registerDao(Chanqiansuifangjilu02to05.class, chanqiansuifangjilu02to05Dao);
        registerDao(ChuanRanBingLeiXing.class, chuanRanBingLeiXingDao);
        registerDao(City.class, cityDao);
        registerDao(County.class, countyDao);
        registerDao(Drug.class, drugDao);
        registerDao(FeiMianYiYuFangJieZhong.class, feiMianYiYuFangJieZhongDao);
        registerDao(GaoXueYaHuanZhe.class, gaoXueYaHuanZheDao);
        registerDao(GWJiWangJiZuShi.class, gWJiWangJiZuShiDao);
        registerDao(JianKangJiaoYuJiLu.class, jianKangJiaoYuJiLuDao);
        registerDao(JianKangTiJianBiao_A.class, jianKangTiJianBiao_ADao);
        registerDao(JianKangTiJianBiao_B.class, jianKangTiJianBiao_BDao);
        registerDao(JianKangTiJianBiao_C.class, jianKangTiJianBiao_CDao);
        registerDao(JianKangTiJianBiao_D.class, jianKangTiJianBiao_DDao);
        registerDao(Jingshenbinghuanzhe.class, jingshenbinghuanzheDao);
        registerDao(Jingshenbingjilu.class, jingshenbingjiluDao);
        registerDao(JuMinJiChuDangAn.class, juMinJiChuDangAnDao);
        registerDao(Laonianrenjiankang.class, laonianrenjiankangDao);
        registerDao(Liangsuiertongjiankang.class, liangsuiertongjiankangDao);
        registerDao(Nation.class, nationDao);
        registerDao(Natives.class, nativesDao);
        registerDao(Province.class, provinceDao);
        registerDao(Sandaoliusuiertongjiankang.class, sandaoliusuiertongjiankangDao);
        registerDao(SheBei.class, sheBeiDao);
        registerDao(SheBeiNiaoJian.class, sheBeiNiaoJianDao);
        registerDao(SheBeiTiWen.class, sheBeiTiWenDao);
        registerDao(SheBeiXueTang.class, sheBeiXueTangDao);
        registerDao(SheBeiXueYaJi.class, sheBeiXueYaJiDao);
        registerDao(SheBeiXueYang.class, sheBeiXueYangDao);
        registerDao(Shengaotizhong.class, shengaotizhongDao);
        registerDao(TangNiaoBing.class, tangNiaoBingDao);
        registerDao(TuFaChuanRanBingBaoGao.class, tuFaChuanRanBingBaoGaoDao);
        registerDao(User.class, userDao);
        registerDao(WeiShengXieGuanBiao.class, weiShengXieGuanBiaoDao);
        registerDao(WeiShengXunChaBiao.class, weiShengXunChaBiaoDao);
        registerDao(Xinshengerjitingfangshi.class, xinshengerjitingfangshiDao);
        registerDao(XueHongDanBai.class, xueHongDanBaiDao);
        registerDao(Yimiao.class, yimiaoDao);
        registerDao(Yisuiertongjiankang.class, yisuiertongjiankangDao);
        registerDao(Yongyaoqingkuang.class, yongyaoqingkuangDao);
        registerDao(Yufangjiezhong.class, yufangjiezhongDao);
        registerDao(Zhengzhuang.class, zhengzhuangDao);
        registerDao(Zhuyuanzhiliaoqingkuang.class, zhuyuanzhiliaoqingkuangDao);
    }
    
    public void clear() {
        agencyDaoConfig.clearIdentityScope();
        bTDeviceDaoConfig.clearIdentityScope();
        chanhuofangshijiluDaoConfig.clearIdentityScope();
        chanhuofangshijilutianhou42DaoConfig.clearIdentityScope();
        chanqiansuifangjilu01DaoConfig.clearIdentityScope();
        chanqiansuifangjilu02to05DaoConfig.clearIdentityScope();
        chuanRanBingLeiXingDaoConfig.clearIdentityScope();
        cityDaoConfig.clearIdentityScope();
        countyDaoConfig.clearIdentityScope();
        drugDaoConfig.clearIdentityScope();
        feiMianYiYuFangJieZhongDaoConfig.clearIdentityScope();
        gaoXueYaHuanZheDaoConfig.clearIdentityScope();
        gWJiWangJiZuShiDaoConfig.clearIdentityScope();
        jianKangJiaoYuJiLuDaoConfig.clearIdentityScope();
        jianKangTiJianBiao_ADaoConfig.clearIdentityScope();
        jianKangTiJianBiao_BDaoConfig.clearIdentityScope();
        jianKangTiJianBiao_CDaoConfig.clearIdentityScope();
        jianKangTiJianBiao_DDaoConfig.clearIdentityScope();
        jingshenbinghuanzheDaoConfig.clearIdentityScope();
        jingshenbingjiluDaoConfig.clearIdentityScope();
        juMinJiChuDangAnDaoConfig.clearIdentityScope();
        laonianrenjiankangDaoConfig.clearIdentityScope();
        liangsuiertongjiankangDaoConfig.clearIdentityScope();
        nationDaoConfig.clearIdentityScope();
        nativesDaoConfig.clearIdentityScope();
        provinceDaoConfig.clearIdentityScope();
        sandaoliusuiertongjiankangDaoConfig.clearIdentityScope();
        sheBeiDaoConfig.clearIdentityScope();
        sheBeiNiaoJianDaoConfig.clearIdentityScope();
        sheBeiTiWenDaoConfig.clearIdentityScope();
        sheBeiXueTangDaoConfig.clearIdentityScope();
        sheBeiXueYaJiDaoConfig.clearIdentityScope();
        sheBeiXueYangDaoConfig.clearIdentityScope();
        shengaotizhongDaoConfig.clearIdentityScope();
        tangNiaoBingDaoConfig.clearIdentityScope();
        tuFaChuanRanBingBaoGaoDaoConfig.clearIdentityScope();
        userDaoConfig.clearIdentityScope();
        weiShengXieGuanBiaoDaoConfig.clearIdentityScope();
        weiShengXunChaBiaoDaoConfig.clearIdentityScope();
        xinshengerjitingfangshiDaoConfig.clearIdentityScope();
        xueHongDanBaiDaoConfig.clearIdentityScope();
        yimiaoDaoConfig.clearIdentityScope();
        yisuiertongjiankangDaoConfig.clearIdentityScope();
        yongyaoqingkuangDaoConfig.clearIdentityScope();
        yufangjiezhongDaoConfig.clearIdentityScope();
        zhengzhuangDaoConfig.clearIdentityScope();
        zhuyuanzhiliaoqingkuangDaoConfig.clearIdentityScope();
    }

    public AgencyDao getAgencyDao() {
        return agencyDao;
    }

    public BTDeviceDao getBTDeviceDao() {
        return bTDeviceDao;
    }

    public ChanhuofangshijiluDao getChanhuofangshijiluDao() {
        return chanhuofangshijiluDao;
    }

    public Chanhuofangshijilutianhou42Dao getChanhuofangshijilutianhou42Dao() {
        return chanhuofangshijilutianhou42Dao;
    }

    public Chanqiansuifangjilu01Dao getChanqiansuifangjilu01Dao() {
        return chanqiansuifangjilu01Dao;
    }

    public Chanqiansuifangjilu02to05Dao getChanqiansuifangjilu02to05Dao() {
        return chanqiansuifangjilu02to05Dao;
    }

    public ChuanRanBingLeiXingDao getChuanRanBingLeiXingDao() {
        return chuanRanBingLeiXingDao;
    }

    public CityDao getCityDao() {
        return cityDao;
    }

    public CountyDao getCountyDao() {
        return countyDao;
    }

    public DrugDao getDrugDao() {
        return drugDao;
    }

    public FeiMianYiYuFangJieZhongDao getFeiMianYiYuFangJieZhongDao() {
        return feiMianYiYuFangJieZhongDao;
    }

    public GaoXueYaHuanZheDao getGaoXueYaHuanZheDao() {
        return gaoXueYaHuanZheDao;
    }

    public GWJiWangJiZuShiDao getGWJiWangJiZuShiDao() {
        return gWJiWangJiZuShiDao;
    }

    public JianKangJiaoYuJiLuDao getJianKangJiaoYuJiLuDao() {
        return jianKangJiaoYuJiLuDao;
    }

    public JianKangTiJianBiao_ADao getJianKangTiJianBiao_ADao() {
        return jianKangTiJianBiao_ADao;
    }

    public JianKangTiJianBiao_BDao getJianKangTiJianBiao_BDao() {
        return jianKangTiJianBiao_BDao;
    }

    public JianKangTiJianBiao_CDao getJianKangTiJianBiao_CDao() {
        return jianKangTiJianBiao_CDao;
    }

    public JianKangTiJianBiao_DDao getJianKangTiJianBiao_DDao() {
        return jianKangTiJianBiao_DDao;
    }

    public JingshenbinghuanzheDao getJingshenbinghuanzheDao() {
        return jingshenbinghuanzheDao;
    }

    public JingshenbingjiluDao getJingshenbingjiluDao() {
        return jingshenbingjiluDao;
    }

    public JuMinJiChuDangAnDao getJuMinJiChuDangAnDao() {
        return juMinJiChuDangAnDao;
    }

    public LaonianrenjiankangDao getLaonianrenjiankangDao() {
        return laonianrenjiankangDao;
    }

    public LiangsuiertongjiankangDao getLiangsuiertongjiankangDao() {
        return liangsuiertongjiankangDao;
    }

    public NationDao getNationDao() {
        return nationDao;
    }

    public NativesDao getNativesDao() {
        return nativesDao;
    }

    public ProvinceDao getProvinceDao() {
        return provinceDao;
    }

    public SandaoliusuiertongjiankangDao getSandaoliusuiertongjiankangDao() {
        return sandaoliusuiertongjiankangDao;
    }

    public SheBeiDao getSheBeiDao() {
        return sheBeiDao;
    }

    public SheBeiNiaoJianDao getSheBeiNiaoJianDao() {
        return sheBeiNiaoJianDao;
    }

    public SheBeiTiWenDao getSheBeiTiWenDao() {
        return sheBeiTiWenDao;
    }

    public SheBeiXueTangDao getSheBeiXueTangDao() {
        return sheBeiXueTangDao;
    }

    public SheBeiXueYaJiDao getSheBeiXueYaJiDao() {
        return sheBeiXueYaJiDao;
    }

    public SheBeiXueYangDao getSheBeiXueYangDao() {
        return sheBeiXueYangDao;
    }

    public ShengaotizhongDao getShengaotizhongDao() {
        return shengaotizhongDao;
    }

    public TangNiaoBingDao getTangNiaoBingDao() {
        return tangNiaoBingDao;
    }

    public TuFaChuanRanBingBaoGaoDao getTuFaChuanRanBingBaoGaoDao() {
        return tuFaChuanRanBingBaoGaoDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public WeiShengXieGuanBiaoDao getWeiShengXieGuanBiaoDao() {
        return weiShengXieGuanBiaoDao;
    }

    public WeiShengXunChaBiaoDao getWeiShengXunChaBiaoDao() {
        return weiShengXunChaBiaoDao;
    }

    public XinshengerjitingfangshiDao getXinshengerjitingfangshiDao() {
        return xinshengerjitingfangshiDao;
    }

    public XueHongDanBaiDao getXueHongDanBaiDao() {
        return xueHongDanBaiDao;
    }

    public YimiaoDao getYimiaoDao() {
        return yimiaoDao;
    }

    public YisuiertongjiankangDao getYisuiertongjiankangDao() {
        return yisuiertongjiankangDao;
    }

    public YongyaoqingkuangDao getYongyaoqingkuangDao() {
        return yongyaoqingkuangDao;
    }

    public YufangjiezhongDao getYufangjiezhongDao() {
        return yufangjiezhongDao;
    }

    public ZhengzhuangDao getZhengzhuangDao() {
        return zhengzhuangDao;
    }

    public ZhuyuanzhiliaoqingkuangDao getZhuyuanzhiliaoqingkuangDao() {
        return zhuyuanzhiliaoqingkuangDao;
    }

}
