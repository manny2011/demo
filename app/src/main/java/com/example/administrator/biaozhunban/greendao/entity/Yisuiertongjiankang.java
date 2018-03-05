package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 */
@Entity
public class Yisuiertongjiankang extends BaseEntity{
    @Id
    private Long id;
    @NotNull
    private String ysjk_id;//1岁健康ID
    private String na_id;//居民ID

    private int months_age;//months_age
    private String check_date;//v随访日期
    private String hw_id;//身高体重id
    private int tiz_develop;//体重发育0上1中2下
    private int sg_develop;//身高发育0上1中2下
    private String ys_head;//头围CM
    private int ys__complexion;//一岁面色0红润1黄染2其他
    private int ys_skin;//皮肤0正常1异常
    private int ys_qianx;//前囟0未闭合1闭合
    private String ys_qxcmx;//前囟未闭合cmx
    private String ys_qxcm;//前囟未闭合cm
    private int ys_jbbk;//1岁颈部包块0无1有
    private int ys_yanwg;//1岁眼外观0正常1异常
    private int ys_erwg;//1岁耳外观0正常1异常
    private int ys_tingl;//1岁听力0通过1未过
    private int ys_oral_cavity;//1岁口腔0正常1异常
    private int ys_xinf;//1岁心肺0正常1异常
    private int ys_fub;//1岁腹部0正常1异常
    private int ys_qib;//1岁脐部0正常1异常
    private int ys_gmwszq;//1岁肛门外生殖器0正常1异常
    private int ys_glb_zz;//佝偻病症状0无1夜惊2多汗3烦躁
    private int ys_glb_tz;//佝偻病体征0头部颅骨软化1肋串珠2脊柱四肢弯曲
    private String ys_activity;//户外活动小时/日
    private String ys_fuyvd;//服用维生素D--IU/日
    private int ys_faypg;//发育评估0通过1未过
    private int ys_lcsfqk;//两次随访患病情况0未患病1患病
    private String ys_other;//其他
    private int ys_zzjy;//转诊建议0无1有
    private String ys_zzyy;//转诊建议0无1有
    private String ys_jgks;//机构及原因
    private int ys_zhid;//指导0科学喂养1生长发育2疾病预防3预防伤害4口腔保健
    private String ys_next_date;//下次随访日期
    private String ys_doctor;//随访医生签名
    private String xhdb_id;//血红蛋白id
    private int ys_szjk;//四肢0正常1异常

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1575143324)
    public Yisuiertongjiankang(Long id, @NotNull String ysjk_id, String na_id,
            int months_age, String check_date, String hw_id, int tiz_develop,
            int sg_develop, String ys_head, int ys__complexion, int ys_skin,
            int ys_qianx, String ys_qxcmx, String ys_qxcm, int ys_jbbk,
            int ys_yanwg, int ys_erwg, int ys_tingl, int ys_oral_cavity,
            int ys_xinf, int ys_fub, int ys_qib, int ys_gmwszq, int ys_glb_zz,
            int ys_glb_tz, String ys_activity, String ys_fuyvd, int ys_faypg,
            int ys_lcsfqk, String ys_other, int ys_zzjy, String ys_zzyy,
            String ys_jgks, int ys_zhid, String ys_next_date, String ys_doctor,
            String xhdb_id, int ys_szjk, String createDate) {
        this.id = id;
        this.ysjk_id = ysjk_id;
        this.na_id = na_id;
        this.months_age = months_age;
        this.check_date = check_date;
        this.hw_id = hw_id;
        this.tiz_develop = tiz_develop;
        this.sg_develop = sg_develop;
        this.ys_head = ys_head;
        this.ys__complexion = ys__complexion;
        this.ys_skin = ys_skin;
        this.ys_qianx = ys_qianx;
        this.ys_qxcmx = ys_qxcmx;
        this.ys_qxcm = ys_qxcm;
        this.ys_jbbk = ys_jbbk;
        this.ys_yanwg = ys_yanwg;
        this.ys_erwg = ys_erwg;
        this.ys_tingl = ys_tingl;
        this.ys_oral_cavity = ys_oral_cavity;
        this.ys_xinf = ys_xinf;
        this.ys_fub = ys_fub;
        this.ys_qib = ys_qib;
        this.ys_gmwszq = ys_gmwszq;
        this.ys_glb_zz = ys_glb_zz;
        this.ys_glb_tz = ys_glb_tz;
        this.ys_activity = ys_activity;
        this.ys_fuyvd = ys_fuyvd;
        this.ys_faypg = ys_faypg;
        this.ys_lcsfqk = ys_lcsfqk;
        this.ys_other = ys_other;
        this.ys_zzjy = ys_zzjy;
        this.ys_zzyy = ys_zzyy;
        this.ys_jgks = ys_jgks;
        this.ys_zhid = ys_zhid;
        this.ys_next_date = ys_next_date;
        this.ys_doctor = ys_doctor;
        this.xhdb_id = xhdb_id;
        this.ys_szjk = ys_szjk;
        this.createDate = createDate;
    }
    @Generated(hash = 1199490596)
    public Yisuiertongjiankang() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getYsjk_id() {
        return this.ysjk_id;
    }
    public void setYsjk_id(String ysjk_id) {
        this.ysjk_id = ysjk_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public int getMonths_age() {
        return this.months_age;
    }
    public void setMonths_age(int months_age) {
        this.months_age = months_age;
    }
    public String getCheck_date() {
        return this.check_date;
    }
    public void setCheck_date(String check_date) {
        this.check_date = check_date;
    }
    public String getHw_id() {
        return this.hw_id;
    }
    public void setHw_id(String hw_id) {
        this.hw_id = hw_id;
    }
    public int getTiz_develop() {
        return this.tiz_develop;
    }
    public void setTiz_develop(int tiz_develop) {
        this.tiz_develop = tiz_develop;
    }
    public int getSg_develop() {
        return this.sg_develop;
    }
    public void setSg_develop(int sg_develop) {
        this.sg_develop = sg_develop;
    }
    public String getYs_head() {
        return this.ys_head;
    }
    public void setYs_head(String ys_head) {
        this.ys_head = ys_head;
    }
    public int getYs__complexion() {
        return this.ys__complexion;
    }
    public void setYs__complexion(int ys__complexion) {
        this.ys__complexion = ys__complexion;
    }
    public int getYs_skin() {
        return this.ys_skin;
    }
    public void setYs_skin(int ys_skin) {
        this.ys_skin = ys_skin;
    }
    public int getYs_qianx() {
        return this.ys_qianx;
    }
    public void setYs_qianx(int ys_qianx) {
        this.ys_qianx = ys_qianx;
    }
    public String getYs_qxcmx() {
        return this.ys_qxcmx;
    }
    public void setYs_qxcmx(String ys_qxcmx) {
        this.ys_qxcmx = ys_qxcmx;
    }
    public String getYs_qxcm() {
        return this.ys_qxcm;
    }
    public void setYs_qxcm(String ys_qxcm) {
        this.ys_qxcm = ys_qxcm;
    }
    public int getYs_jbbk() {
        return this.ys_jbbk;
    }
    public void setYs_jbbk(int ys_jbbk) {
        this.ys_jbbk = ys_jbbk;
    }
    public int getYs_yanwg() {
        return this.ys_yanwg;
    }
    public void setYs_yanwg(int ys_yanwg) {
        this.ys_yanwg = ys_yanwg;
    }
    public int getYs_erwg() {
        return this.ys_erwg;
    }
    public void setYs_erwg(int ys_erwg) {
        this.ys_erwg = ys_erwg;
    }
    public int getYs_tingl() {
        return this.ys_tingl;
    }
    public void setYs_tingl(int ys_tingl) {
        this.ys_tingl = ys_tingl;
    }
    public int getYs_oral_cavity() {
        return this.ys_oral_cavity;
    }
    public void setYs_oral_cavity(int ys_oral_cavity) {
        this.ys_oral_cavity = ys_oral_cavity;
    }
    public int getYs_xinf() {
        return this.ys_xinf;
    }
    public void setYs_xinf(int ys_xinf) {
        this.ys_xinf = ys_xinf;
    }
    public int getYs_fub() {
        return this.ys_fub;
    }
    public void setYs_fub(int ys_fub) {
        this.ys_fub = ys_fub;
    }
    public int getYs_qib() {
        return this.ys_qib;
    }
    public void setYs_qib(int ys_qib) {
        this.ys_qib = ys_qib;
    }
    public int getYs_gmwszq() {
        return this.ys_gmwszq;
    }
    public void setYs_gmwszq(int ys_gmwszq) {
        this.ys_gmwszq = ys_gmwszq;
    }
    public int getYs_glb_zz() {
        return this.ys_glb_zz;
    }
    public void setYs_glb_zz(int ys_glb_zz) {
        this.ys_glb_zz = ys_glb_zz;
    }
    public int getYs_glb_tz() {
        return this.ys_glb_tz;
    }
    public void setYs_glb_tz(int ys_glb_tz) {
        this.ys_glb_tz = ys_glb_tz;
    }
    public String getYs_activity() {
        return this.ys_activity;
    }
    public void setYs_activity(String ys_activity) {
        this.ys_activity = ys_activity;
    }
    public String getYs_fuyvd() {
        return this.ys_fuyvd;
    }
    public void setYs_fuyvd(String ys_fuyvd) {
        this.ys_fuyvd = ys_fuyvd;
    }
    public int getYs_faypg() {
        return this.ys_faypg;
    }
    public void setYs_faypg(int ys_faypg) {
        this.ys_faypg = ys_faypg;
    }
    public int getYs_lcsfqk() {
        return this.ys_lcsfqk;
    }
    public void setYs_lcsfqk(int ys_lcsfqk) {
        this.ys_lcsfqk = ys_lcsfqk;
    }
    public String getYs_other() {
        return this.ys_other;
    }
    public void setYs_other(String ys_other) {
        this.ys_other = ys_other;
    }
    public int getYs_zzjy() {
        return this.ys_zzjy;
    }
    public void setYs_zzjy(int ys_zzjy) {
        this.ys_zzjy = ys_zzjy;
    }
    public String getYs_zzyy() {
        return this.ys_zzyy;
    }
    public void setYs_zzyy(String ys_zzyy) {
        this.ys_zzyy = ys_zzyy;
    }
    public String getYs_jgks() {
        return this.ys_jgks;
    }
    public void setYs_jgks(String ys_jgks) {
        this.ys_jgks = ys_jgks;
    }
    public int getYs_zhid() {
        return this.ys_zhid;
    }
    public void setYs_zhid(int ys_zhid) {
        this.ys_zhid = ys_zhid;
    }
    public String getYs_next_date() {
        return this.ys_next_date;
    }
    public void setYs_next_date(String ys_next_date) {
        this.ys_next_date = ys_next_date;
    }
    public String getYs_doctor() {
        return this.ys_doctor;
    }
    public void setYs_doctor(String ys_doctor) {
        this.ys_doctor = ys_doctor;
    }
    public String getXhdb_id() {
        return this.xhdb_id;
    }
    public void setXhdb_id(String xhdb_id) {
        this.xhdb_id = xhdb_id;
    }
    public int getYs_szjk() {
        return this.ys_szjk;
    }
    public void setYs_szjk(int ys_szjk) {
        this.ys_szjk = ys_szjk;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
