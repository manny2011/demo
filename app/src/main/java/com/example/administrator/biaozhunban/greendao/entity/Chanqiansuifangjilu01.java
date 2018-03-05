package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 * 第一次产前随访服务记录表
 */
@Entity
public class Chanqiansuifangjilu01 extends BaseEntity{
    @Id
    private Long id;//
    @NotNull
    private String ycf_id;//
    @NotNull
    private String na_id;//居民id
    private String ycf_date;//填表时间
    private int ycf_week;//填表孕周
    private int ycf_age;//孕妇年龄
    private String ycf_man_name;//丈夫姓名
    private int ycf_man_age;//丈夫年龄
    private String ycf_man_tel;//丈夫电话
    private int ycf_number;//孕次
    private int ycf_fm;//产次 正常分娩
    private int ycf_pfc;//剖腹产
    private String ycf_mcyj;//末次月经
    private String ycf_ycq;//预产期
    private int ycf_jws;//既往史
    private int ycf_jzs;//家族史
    private int ycf__grs;//个人史
    private int ycf_fkss;//妇科手术 0无 1 有
    private String ycf_fkss_details;//妇科手术 描述
    private String ycf_liuc;//流产
    private String ycf_sit;//死胎
    private String ycf_shunc;//顺产
    private String ycf_xssw;//新生儿死亡
    private String ycf_csqx;//出生缺陷
    private String hw_id;//身高体重id
    private String bp_id;//血压id
    private int ycf_xz;//听诊 心脏 0未见异常  1异常
    private String ycf_xz_details;//听诊 心脏 描述
    private int ycf_fei;//听诊 肺部 0未见异常  1异常
    private String ycf_fei_details;//听诊 肺部 描述
    private int ycf_wy;//妇科检查 外阴 0未见异常  1异常
    private String ycf_wy_details;//妇科检查 外阴 描述
    private int ycf_yd;//妇科检查 阴道 0未见异常  1异常
    private String ycf_yd_details;//妇科检查 阴道 描述
    private int ycf_gj;//妇科检查 宫颈 0未见异常  1异常
    private String ycf_gj_details;//妇科检查 宫颈 描述
    private int ycf_zg;//妇科检查 子宫 0未见异常  1异常
    private String ycf_zg_details;//妇科检查 子宫 描述
    private int ycf_fj;//妇科检查 附件 0未见异常  1异常
    private String ycf_fj_details;//妇科检查 附件 描述
    private String ycf_xhdb;//血红蛋白
    private String ycf_bxb;//白细胞计数值
    private String ycf_xxb;//血小板计数值
    private String ycf_xqt;//血常规-其他
    private String ycf_ndb;//尿蛋白
    private String ycf_ntt;//尿酮体
    private String ycf_nt;//尿糖
    private String ycf_nqx;//尿潜血
    private String ycf_nqt;//尿常规-其他
    private String ycf_fz_xx;//血型ABC
    private String ycf_fz_rh;//Rh
    private String ycf_fz_xt;//血糖
    private int ycf_fz_fmw;//阴道分泌物
    private int ycf_fz_qjd;//阴道清洁度
    private String ycf_gan_xqgb;//肝功能 血清谷丙转氨酶
    private String ycf_gan_xqgc;//肝功能 血清谷草转氨酶
    private String ycf_gan_bdb;//肝功能 白蛋白
    private String ycf_gan_zdhs;//肝功能 总胆红素
    private String ycf_gan_jhdhs;//肝功能 结合胆红素
    private String ycf_shen_xq;//肾功能 血清肌酐
    private String ycf_shen_xn;//肾功能 血尿素氨
    private String ycf_yg_bmky;//乙型肝炎 表面抗原
    private String ycf_yg_bmkt;//乙型肝炎 表面抗体
    private String ycf_yg_eky;//乙型肝炎 e抗原
    private String ycf_yg_ekt;//乙型肝炎 e抗体
    private String ycf_yg_hxkt;//乙型肝炎 核心抗体
    private int ycf_fz_mdxq;//梅毒血清学试验  0阴性 , 1阳性
    private int ycf_fz_hv;//HV抗体检测  0阴性 , 1阳性
    private String ycf_fz_bc;//B超
    private int ycf_ztpg;//总体评估  0未见异常， 1异常
    private String ycf_zt_details;//总体评估  描述
    private String ycf_bjzd;//保健指导
    private String ycf_zz;//转诊 0无， 1有
    private String ycf_yy;//转诊原因
    private String ycf_jg;//转诊 机构及科室
    private String ycf_nextdate;//下次随访日期
    private String ycf_doctor;//随访医生签字

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 584279007)
    public Chanqiansuifangjilu01(Long id, @NotNull String ycf_id,
            @NotNull String na_id, String ycf_date, int ycf_week, int ycf_age,
            String ycf_man_name, int ycf_man_age, String ycf_man_tel,
            int ycf_number, int ycf_fm, int ycf_pfc, String ycf_mcyj,
            String ycf_ycq, int ycf_jws, int ycf_jzs, int ycf__grs, int ycf_fkss,
            String ycf_fkss_details, String ycf_liuc, String ycf_sit,
            String ycf_shunc, String ycf_xssw, String ycf_csqx, String hw_id,
            String bp_id, int ycf_xz, String ycf_xz_details, int ycf_fei,
            String ycf_fei_details, int ycf_wy, String ycf_wy_details, int ycf_yd,
            String ycf_yd_details, int ycf_gj, String ycf_gj_details, int ycf_zg,
            String ycf_zg_details, int ycf_fj, String ycf_fj_details,
            String ycf_xhdb, String ycf_bxb, String ycf_xxb, String ycf_xqt,
            String ycf_ndb, String ycf_ntt, String ycf_nt, String ycf_nqx,
            String ycf_nqt, String ycf_fz_xx, String ycf_fz_rh, String ycf_fz_xt,
            int ycf_fz_fmw, int ycf_fz_qjd, String ycf_gan_xqgb,
            String ycf_gan_xqgc, String ycf_gan_bdb, String ycf_gan_zdhs,
            String ycf_gan_jhdhs, String ycf_shen_xq, String ycf_shen_xn,
            String ycf_yg_bmky, String ycf_yg_bmkt, String ycf_yg_eky,
            String ycf_yg_ekt, String ycf_yg_hxkt, int ycf_fz_mdxq, int ycf_fz_hv,
            String ycf_fz_bc, int ycf_ztpg, String ycf_zt_details, String ycf_bjzd,
            String ycf_zz, String ycf_yy, String ycf_jg, String ycf_nextdate,
            String ycf_doctor, String createDate) {
        this.id = id;
        this.ycf_id = ycf_id;
        this.na_id = na_id;
        this.ycf_date = ycf_date;
        this.ycf_week = ycf_week;
        this.ycf_age = ycf_age;
        this.ycf_man_name = ycf_man_name;
        this.ycf_man_age = ycf_man_age;
        this.ycf_man_tel = ycf_man_tel;
        this.ycf_number = ycf_number;
        this.ycf_fm = ycf_fm;
        this.ycf_pfc = ycf_pfc;
        this.ycf_mcyj = ycf_mcyj;
        this.ycf_ycq = ycf_ycq;
        this.ycf_jws = ycf_jws;
        this.ycf_jzs = ycf_jzs;
        this.ycf__grs = ycf__grs;
        this.ycf_fkss = ycf_fkss;
        this.ycf_fkss_details = ycf_fkss_details;
        this.ycf_liuc = ycf_liuc;
        this.ycf_sit = ycf_sit;
        this.ycf_shunc = ycf_shunc;
        this.ycf_xssw = ycf_xssw;
        this.ycf_csqx = ycf_csqx;
        this.hw_id = hw_id;
        this.bp_id = bp_id;
        this.ycf_xz = ycf_xz;
        this.ycf_xz_details = ycf_xz_details;
        this.ycf_fei = ycf_fei;
        this.ycf_fei_details = ycf_fei_details;
        this.ycf_wy = ycf_wy;
        this.ycf_wy_details = ycf_wy_details;
        this.ycf_yd = ycf_yd;
        this.ycf_yd_details = ycf_yd_details;
        this.ycf_gj = ycf_gj;
        this.ycf_gj_details = ycf_gj_details;
        this.ycf_zg = ycf_zg;
        this.ycf_zg_details = ycf_zg_details;
        this.ycf_fj = ycf_fj;
        this.ycf_fj_details = ycf_fj_details;
        this.ycf_xhdb = ycf_xhdb;
        this.ycf_bxb = ycf_bxb;
        this.ycf_xxb = ycf_xxb;
        this.ycf_xqt = ycf_xqt;
        this.ycf_ndb = ycf_ndb;
        this.ycf_ntt = ycf_ntt;
        this.ycf_nt = ycf_nt;
        this.ycf_nqx = ycf_nqx;
        this.ycf_nqt = ycf_nqt;
        this.ycf_fz_xx = ycf_fz_xx;
        this.ycf_fz_rh = ycf_fz_rh;
        this.ycf_fz_xt = ycf_fz_xt;
        this.ycf_fz_fmw = ycf_fz_fmw;
        this.ycf_fz_qjd = ycf_fz_qjd;
        this.ycf_gan_xqgb = ycf_gan_xqgb;
        this.ycf_gan_xqgc = ycf_gan_xqgc;
        this.ycf_gan_bdb = ycf_gan_bdb;
        this.ycf_gan_zdhs = ycf_gan_zdhs;
        this.ycf_gan_jhdhs = ycf_gan_jhdhs;
        this.ycf_shen_xq = ycf_shen_xq;
        this.ycf_shen_xn = ycf_shen_xn;
        this.ycf_yg_bmky = ycf_yg_bmky;
        this.ycf_yg_bmkt = ycf_yg_bmkt;
        this.ycf_yg_eky = ycf_yg_eky;
        this.ycf_yg_ekt = ycf_yg_ekt;
        this.ycf_yg_hxkt = ycf_yg_hxkt;
        this.ycf_fz_mdxq = ycf_fz_mdxq;
        this.ycf_fz_hv = ycf_fz_hv;
        this.ycf_fz_bc = ycf_fz_bc;
        this.ycf_ztpg = ycf_ztpg;
        this.ycf_zt_details = ycf_zt_details;
        this.ycf_bjzd = ycf_bjzd;
        this.ycf_zz = ycf_zz;
        this.ycf_yy = ycf_yy;
        this.ycf_jg = ycf_jg;
        this.ycf_nextdate = ycf_nextdate;
        this.ycf_doctor = ycf_doctor;
        this.createDate = createDate;
    }
    @Generated(hash = 898848902)
    public Chanqiansuifangjilu01() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getYcf_id() {
        return this.ycf_id;
    }
    public void setYcf_id(String ycf_id) {
        this.ycf_id = ycf_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getYcf_date() {
        return this.ycf_date;
    }
    public void setYcf_date(String ycf_date) {
        this.ycf_date = ycf_date;
    }
    public int getYcf_week() {
        return this.ycf_week;
    }
    public void setYcf_week(int ycf_week) {
        this.ycf_week = ycf_week;
    }
    public int getYcf_age() {
        return this.ycf_age;
    }
    public void setYcf_age(int ycf_age) {
        this.ycf_age = ycf_age;
    }
    public String getYcf_man_name() {
        return this.ycf_man_name;
    }
    public void setYcf_man_name(String ycf_man_name) {
        this.ycf_man_name = ycf_man_name;
    }
    public int getYcf_man_age() {
        return this.ycf_man_age;
    }
    public void setYcf_man_age(int ycf_man_age) {
        this.ycf_man_age = ycf_man_age;
    }
    public String getYcf_man_tel() {
        return this.ycf_man_tel;
    }
    public void setYcf_man_tel(String ycf_man_tel) {
        this.ycf_man_tel = ycf_man_tel;
    }
    public int getYcf_number() {
        return this.ycf_number;
    }
    public void setYcf_number(int ycf_number) {
        this.ycf_number = ycf_number;
    }
    public int getYcf_fm() {
        return this.ycf_fm;
    }
    public void setYcf_fm(int ycf_fm) {
        this.ycf_fm = ycf_fm;
    }
    public int getYcf_pfc() {
        return this.ycf_pfc;
    }
    public void setYcf_pfc(int ycf_pfc) {
        this.ycf_pfc = ycf_pfc;
    }
    public String getYcf_mcyj() {
        return this.ycf_mcyj;
    }
    public void setYcf_mcyj(String ycf_mcyj) {
        this.ycf_mcyj = ycf_mcyj;
    }
    public String getYcf_ycq() {
        return this.ycf_ycq;
    }
    public void setYcf_ycq(String ycf_ycq) {
        this.ycf_ycq = ycf_ycq;
    }
    public int getYcf_jws() {
        return this.ycf_jws;
    }
    public void setYcf_jws(int ycf_jws) {
        this.ycf_jws = ycf_jws;
    }
    public int getYcf_jzs() {
        return this.ycf_jzs;
    }
    public void setYcf_jzs(int ycf_jzs) {
        this.ycf_jzs = ycf_jzs;
    }
    public int getYcf__grs() {
        return this.ycf__grs;
    }
    public void setYcf__grs(int ycf__grs) {
        this.ycf__grs = ycf__grs;
    }
    public int getYcf_fkss() {
        return this.ycf_fkss;
    }
    public void setYcf_fkss(int ycf_fkss) {
        this.ycf_fkss = ycf_fkss;
    }
    public String getYcf_fkss_details() {
        return this.ycf_fkss_details;
    }
    public void setYcf_fkss_details(String ycf_fkss_details) {
        this.ycf_fkss_details = ycf_fkss_details;
    }
    public String getYcf_liuc() {
        return this.ycf_liuc;
    }
    public void setYcf_liuc(String ycf_liuc) {
        this.ycf_liuc = ycf_liuc;
    }
    public String getYcf_sit() {
        return this.ycf_sit;
    }
    public void setYcf_sit(String ycf_sit) {
        this.ycf_sit = ycf_sit;
    }
    public String getYcf_shunc() {
        return this.ycf_shunc;
    }
    public void setYcf_shunc(String ycf_shunc) {
        this.ycf_shunc = ycf_shunc;
    }
    public String getYcf_xssw() {
        return this.ycf_xssw;
    }
    public void setYcf_xssw(String ycf_xssw) {
        this.ycf_xssw = ycf_xssw;
    }
    public String getYcf_csqx() {
        return this.ycf_csqx;
    }
    public void setYcf_csqx(String ycf_csqx) {
        this.ycf_csqx = ycf_csqx;
    }
    public String getHw_id() {
        return this.hw_id;
    }
    public void setHw_id(String hw_id) {
        this.hw_id = hw_id;
    }
    public String getBp_id() {
        return this.bp_id;
    }
    public void setBp_id(String bp_id) {
        this.bp_id = bp_id;
    }
    public int getYcf_xz() {
        return this.ycf_xz;
    }
    public void setYcf_xz(int ycf_xz) {
        this.ycf_xz = ycf_xz;
    }
    public String getYcf_xz_details() {
        return this.ycf_xz_details;
    }
    public void setYcf_xz_details(String ycf_xz_details) {
        this.ycf_xz_details = ycf_xz_details;
    }
    public int getYcf_fei() {
        return this.ycf_fei;
    }
    public void setYcf_fei(int ycf_fei) {
        this.ycf_fei = ycf_fei;
    }
    public String getYcf_fei_details() {
        return this.ycf_fei_details;
    }
    public void setYcf_fei_details(String ycf_fei_details) {
        this.ycf_fei_details = ycf_fei_details;
    }
    public int getYcf_wy() {
        return this.ycf_wy;
    }
    public void setYcf_wy(int ycf_wy) {
        this.ycf_wy = ycf_wy;
    }
    public String getYcf_wy_details() {
        return this.ycf_wy_details;
    }
    public void setYcf_wy_details(String ycf_wy_details) {
        this.ycf_wy_details = ycf_wy_details;
    }
    public int getYcf_yd() {
        return this.ycf_yd;
    }
    public void setYcf_yd(int ycf_yd) {
        this.ycf_yd = ycf_yd;
    }
    public String getYcf_yd_details() {
        return this.ycf_yd_details;
    }
    public void setYcf_yd_details(String ycf_yd_details) {
        this.ycf_yd_details = ycf_yd_details;
    }
    public int getYcf_gj() {
        return this.ycf_gj;
    }
    public void setYcf_gj(int ycf_gj) {
        this.ycf_gj = ycf_gj;
    }
    public String getYcf_gj_details() {
        return this.ycf_gj_details;
    }
    public void setYcf_gj_details(String ycf_gj_details) {
        this.ycf_gj_details = ycf_gj_details;
    }
    public int getYcf_zg() {
        return this.ycf_zg;
    }
    public void setYcf_zg(int ycf_zg) {
        this.ycf_zg = ycf_zg;
    }
    public String getYcf_zg_details() {
        return this.ycf_zg_details;
    }
    public void setYcf_zg_details(String ycf_zg_details) {
        this.ycf_zg_details = ycf_zg_details;
    }
    public int getYcf_fj() {
        return this.ycf_fj;
    }
    public void setYcf_fj(int ycf_fj) {
        this.ycf_fj = ycf_fj;
    }
    public String getYcf_fj_details() {
        return this.ycf_fj_details;
    }
    public void setYcf_fj_details(String ycf_fj_details) {
        this.ycf_fj_details = ycf_fj_details;
    }
    public String getYcf_xhdb() {
        return this.ycf_xhdb;
    }
    public void setYcf_xhdb(String ycf_xhdb) {
        this.ycf_xhdb = ycf_xhdb;
    }
    public String getYcf_bxb() {
        return this.ycf_bxb;
    }
    public void setYcf_bxb(String ycf_bxb) {
        this.ycf_bxb = ycf_bxb;
    }
    public String getYcf_xxb() {
        return this.ycf_xxb;
    }
    public void setYcf_xxb(String ycf_xxb) {
        this.ycf_xxb = ycf_xxb;
    }
    public String getYcf_xqt() {
        return this.ycf_xqt;
    }
    public void setYcf_xqt(String ycf_xqt) {
        this.ycf_xqt = ycf_xqt;
    }
    public String getYcf_ndb() {
        return this.ycf_ndb;
    }
    public void setYcf_ndb(String ycf_ndb) {
        this.ycf_ndb = ycf_ndb;
    }
    public String getYcf_ntt() {
        return this.ycf_ntt;
    }
    public void setYcf_ntt(String ycf_ntt) {
        this.ycf_ntt = ycf_ntt;
    }
    public String getYcf_nt() {
        return this.ycf_nt;
    }
    public void setYcf_nt(String ycf_nt) {
        this.ycf_nt = ycf_nt;
    }
    public String getYcf_nqx() {
        return this.ycf_nqx;
    }
    public void setYcf_nqx(String ycf_nqx) {
        this.ycf_nqx = ycf_nqx;
    }
    public String getYcf_nqt() {
        return this.ycf_nqt;
    }
    public void setYcf_nqt(String ycf_nqt) {
        this.ycf_nqt = ycf_nqt;
    }
    public String getYcf_fz_xx() {
        return this.ycf_fz_xx;
    }
    public void setYcf_fz_xx(String ycf_fz_xx) {
        this.ycf_fz_xx = ycf_fz_xx;
    }
    public String getYcf_fz_rh() {
        return this.ycf_fz_rh;
    }
    public void setYcf_fz_rh(String ycf_fz_rh) {
        this.ycf_fz_rh = ycf_fz_rh;
    }
    public String getYcf_fz_xt() {
        return this.ycf_fz_xt;
    }
    public void setYcf_fz_xt(String ycf_fz_xt) {
        this.ycf_fz_xt = ycf_fz_xt;
    }
    public int getYcf_fz_fmw() {
        return this.ycf_fz_fmw;
    }
    public void setYcf_fz_fmw(int ycf_fz_fmw) {
        this.ycf_fz_fmw = ycf_fz_fmw;
    }
    public int getYcf_fz_qjd() {
        return this.ycf_fz_qjd;
    }
    public void setYcf_fz_qjd(int ycf_fz_qjd) {
        this.ycf_fz_qjd = ycf_fz_qjd;
    }
    public String getYcf_gan_xqgb() {
        return this.ycf_gan_xqgb;
    }
    public void setYcf_gan_xqgb(String ycf_gan_xqgb) {
        this.ycf_gan_xqgb = ycf_gan_xqgb;
    }
    public String getYcf_gan_xqgc() {
        return this.ycf_gan_xqgc;
    }
    public void setYcf_gan_xqgc(String ycf_gan_xqgc) {
        this.ycf_gan_xqgc = ycf_gan_xqgc;
    }
    public String getYcf_gan_bdb() {
        return this.ycf_gan_bdb;
    }
    public void setYcf_gan_bdb(String ycf_gan_bdb) {
        this.ycf_gan_bdb = ycf_gan_bdb;
    }
    public String getYcf_gan_zdhs() {
        return this.ycf_gan_zdhs;
    }
    public void setYcf_gan_zdhs(String ycf_gan_zdhs) {
        this.ycf_gan_zdhs = ycf_gan_zdhs;
    }
    public String getYcf_gan_jhdhs() {
        return this.ycf_gan_jhdhs;
    }
    public void setYcf_gan_jhdhs(String ycf_gan_jhdhs) {
        this.ycf_gan_jhdhs = ycf_gan_jhdhs;
    }
    public String getYcf_shen_xq() {
        return this.ycf_shen_xq;
    }
    public void setYcf_shen_xq(String ycf_shen_xq) {
        this.ycf_shen_xq = ycf_shen_xq;
    }
    public String getYcf_shen_xn() {
        return this.ycf_shen_xn;
    }
    public void setYcf_shen_xn(String ycf_shen_xn) {
        this.ycf_shen_xn = ycf_shen_xn;
    }
    public String getYcf_yg_bmky() {
        return this.ycf_yg_bmky;
    }
    public void setYcf_yg_bmky(String ycf_yg_bmky) {
        this.ycf_yg_bmky = ycf_yg_bmky;
    }
    public String getYcf_yg_bmkt() {
        return this.ycf_yg_bmkt;
    }
    public void setYcf_yg_bmkt(String ycf_yg_bmkt) {
        this.ycf_yg_bmkt = ycf_yg_bmkt;
    }
    public String getYcf_yg_eky() {
        return this.ycf_yg_eky;
    }
    public void setYcf_yg_eky(String ycf_yg_eky) {
        this.ycf_yg_eky = ycf_yg_eky;
    }
    public String getYcf_yg_ekt() {
        return this.ycf_yg_ekt;
    }
    public void setYcf_yg_ekt(String ycf_yg_ekt) {
        this.ycf_yg_ekt = ycf_yg_ekt;
    }
    public String getYcf_yg_hxkt() {
        return this.ycf_yg_hxkt;
    }
    public void setYcf_yg_hxkt(String ycf_yg_hxkt) {
        this.ycf_yg_hxkt = ycf_yg_hxkt;
    }
    public int getYcf_fz_mdxq() {
        return this.ycf_fz_mdxq;
    }
    public void setYcf_fz_mdxq(int ycf_fz_mdxq) {
        this.ycf_fz_mdxq = ycf_fz_mdxq;
    }
    public int getYcf_fz_hv() {
        return this.ycf_fz_hv;
    }
    public void setYcf_fz_hv(int ycf_fz_hv) {
        this.ycf_fz_hv = ycf_fz_hv;
    }
    public String getYcf_fz_bc() {
        return this.ycf_fz_bc;
    }
    public void setYcf_fz_bc(String ycf_fz_bc) {
        this.ycf_fz_bc = ycf_fz_bc;
    }
    public int getYcf_ztpg() {
        return this.ycf_ztpg;
    }
    public void setYcf_ztpg(int ycf_ztpg) {
        this.ycf_ztpg = ycf_ztpg;
    }
    public String getYcf_zt_details() {
        return this.ycf_zt_details;
    }
    public void setYcf_zt_details(String ycf_zt_details) {
        this.ycf_zt_details = ycf_zt_details;
    }
    public String getYcf_bjzd() {
        return this.ycf_bjzd;
    }
    public void setYcf_bjzd(String ycf_bjzd) {
        this.ycf_bjzd = ycf_bjzd;
    }
    public String getYcf_zz() {
        return this.ycf_zz;
    }
    public void setYcf_zz(String ycf_zz) {
        this.ycf_zz = ycf_zz;
    }
    public String getYcf_yy() {
        return this.ycf_yy;
    }
    public void setYcf_yy(String ycf_yy) {
        this.ycf_yy = ycf_yy;
    }
    public String getYcf_jg() {
        return this.ycf_jg;
    }
    public void setYcf_jg(String ycf_jg) {
        this.ycf_jg = ycf_jg;
    }
    public String getYcf_nextdate() {
        return this.ycf_nextdate;
    }
    public void setYcf_nextdate(String ycf_nextdate) {
        this.ycf_nextdate = ycf_nextdate;
    }
    public String getYcf_doctor() {
        return this.ycf_doctor;
    }
    public void setYcf_doctor(String ycf_doctor) {
        this.ycf_doctor = ycf_doctor;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
