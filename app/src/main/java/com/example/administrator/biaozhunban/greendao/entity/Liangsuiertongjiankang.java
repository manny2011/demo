package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 * 新生儿2岁健康
 */
@Entity
public class Liangsuiertongjiankang extends BaseEntity{
    @Id
    private Long id;
    @NotNull
    private String lsjk_id;//新生儿2岁健康ID
    private String na_id;//居民ID
    private int ls_months_age;//1-2岁月龄0十二1十八2二十四3三十
    private String ls_follow_date;//1-2随访日期
    private String hw_id;//身高体重id
    private int ls_tizfy;//体重发育0上1中2下
    private int ls_sgfy;//身高发育0上1中2下
    private int ls_mians;//面色0红润1其他
    private String ls_mssm;//面色其他说明
    private int ls_pif;//皮肤0正常1异常
    private int ls_qianx;//前囟0闭合1未闭合
    private String ls_qxcmx;//前囟cmx
    private String ls_qxcm;//前囟cm
    private int ls_ywg;//眼外观0正常1异常
    private int ls_ewg;//耳外观0正常1异常
    private int ls_tingl;//听力0通过1未过
    private int ls_cys;//出牙数(颗)
    private int ls_qcs;//龋齿数(颗)
    private int ls_xinf;//心肺0正常1异常
    private int ls_fub;//腹部0正常1异常
    private int ls_siz;//四肢0正常1异常
    private int ls_but;//步态0正常1异常
    private int ls_kjglz;//可见佝偻症0x型腿1O型腿
    private String xhdb_id;//血红蛋白ID
    private String ls_hwhd;//户外活动小时/日
    private String ls_fyvd;//服药维生素D-IU/日
    private int ls_fypg;//发育评估0通过1未过
    private int ls_lcsfhb;//两次随访患病0患病1未患病
    private String ls_other;//其他
    private int ls_zzjy;//转诊建议0无1有
    private String ls_zzyy;//转诊原因
    private String ls_jgks;//机构及科室
    private int ls_zhid;//指导0科学喂养1生长发育2疾病预防3意外伤害4空腔保健5其他
    private String ls_next_date;//下次随访日期

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 451197480)
    public Liangsuiertongjiankang(Long id, @NotNull String lsjk_id, String na_id,
            int ls_months_age, String ls_follow_date, String hw_id, int ls_tizfy,
            int ls_sgfy, int ls_mians, String ls_mssm, int ls_pif, int ls_qianx,
            String ls_qxcmx, String ls_qxcm, int ls_ywg, int ls_ewg, int ls_tingl,
            int ls_cys, int ls_qcs, int ls_xinf, int ls_fub, int ls_siz, int ls_but,
            int ls_kjglz, String xhdb_id, String ls_hwhd, String ls_fyvd,
            int ls_fypg, int ls_lcsfhb, String ls_other, int ls_zzjy,
            String ls_zzyy, String ls_jgks, int ls_zhid, String ls_next_date,
            String createDate) {
        this.id = id;
        this.lsjk_id = lsjk_id;
        this.na_id = na_id;
        this.ls_months_age = ls_months_age;
        this.ls_follow_date = ls_follow_date;
        this.hw_id = hw_id;
        this.ls_tizfy = ls_tizfy;
        this.ls_sgfy = ls_sgfy;
        this.ls_mians = ls_mians;
        this.ls_mssm = ls_mssm;
        this.ls_pif = ls_pif;
        this.ls_qianx = ls_qianx;
        this.ls_qxcmx = ls_qxcmx;
        this.ls_qxcm = ls_qxcm;
        this.ls_ywg = ls_ywg;
        this.ls_ewg = ls_ewg;
        this.ls_tingl = ls_tingl;
        this.ls_cys = ls_cys;
        this.ls_qcs = ls_qcs;
        this.ls_xinf = ls_xinf;
        this.ls_fub = ls_fub;
        this.ls_siz = ls_siz;
        this.ls_but = ls_but;
        this.ls_kjglz = ls_kjglz;
        this.xhdb_id = xhdb_id;
        this.ls_hwhd = ls_hwhd;
        this.ls_fyvd = ls_fyvd;
        this.ls_fypg = ls_fypg;
        this.ls_lcsfhb = ls_lcsfhb;
        this.ls_other = ls_other;
        this.ls_zzjy = ls_zzjy;
        this.ls_zzyy = ls_zzyy;
        this.ls_jgks = ls_jgks;
        this.ls_zhid = ls_zhid;
        this.ls_next_date = ls_next_date;
        this.createDate = createDate;
    }
    @Generated(hash = 1457308164)
    public Liangsuiertongjiankang() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLsjk_id() {
        return this.lsjk_id;
    }
    public void setLsjk_id(String lsjk_id) {
        this.lsjk_id = lsjk_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public int getLs_months_age() {
        return this.ls_months_age;
    }
    public void setLs_months_age(int ls_months_age) {
        this.ls_months_age = ls_months_age;
    }
    public String getLs_follow_date() {
        return this.ls_follow_date;
    }
    public void setLs_follow_date(String ls_follow_date) {
        this.ls_follow_date = ls_follow_date;
    }
    public String getHw_id() {
        return this.hw_id;
    }
    public void setHw_id(String hw_id) {
        this.hw_id = hw_id;
    }
    public int getLs_tizfy() {
        return this.ls_tizfy;
    }
    public void setLs_tizfy(int ls_tizfy) {
        this.ls_tizfy = ls_tizfy;
    }
    public int getLs_sgfy() {
        return this.ls_sgfy;
    }
    public void setLs_sgfy(int ls_sgfy) {
        this.ls_sgfy = ls_sgfy;
    }
    public int getLs_mians() {
        return this.ls_mians;
    }
    public void setLs_mians(int ls_mians) {
        this.ls_mians = ls_mians;
    }
    public String getLs_mssm() {
        return this.ls_mssm;
    }
    public void setLs_mssm(String ls_mssm) {
        this.ls_mssm = ls_mssm;
    }
    public int getLs_pif() {
        return this.ls_pif;
    }
    public void setLs_pif(int ls_pif) {
        this.ls_pif = ls_pif;
    }
    public int getLs_qianx() {
        return this.ls_qianx;
    }
    public void setLs_qianx(int ls_qianx) {
        this.ls_qianx = ls_qianx;
    }
    public String getLs_qxcmx() {
        return this.ls_qxcmx;
    }
    public void setLs_qxcmx(String ls_qxcmx) {
        this.ls_qxcmx = ls_qxcmx;
    }
    public String getLs_qxcm() {
        return this.ls_qxcm;
    }
    public void setLs_qxcm(String ls_qxcm) {
        this.ls_qxcm = ls_qxcm;
    }
    public int getLs_ywg() {
        return this.ls_ywg;
    }
    public void setLs_ywg(int ls_ywg) {
        this.ls_ywg = ls_ywg;
    }
    public int getLs_ewg() {
        return this.ls_ewg;
    }
    public void setLs_ewg(int ls_ewg) {
        this.ls_ewg = ls_ewg;
    }
    public int getLs_tingl() {
        return this.ls_tingl;
    }
    public void setLs_tingl(int ls_tingl) {
        this.ls_tingl = ls_tingl;
    }
    public int getLs_cys() {
        return this.ls_cys;
    }
    public void setLs_cys(int ls_cys) {
        this.ls_cys = ls_cys;
    }
    public int getLs_qcs() {
        return this.ls_qcs;
    }
    public void setLs_qcs(int ls_qcs) {
        this.ls_qcs = ls_qcs;
    }
    public int getLs_xinf() {
        return this.ls_xinf;
    }
    public void setLs_xinf(int ls_xinf) {
        this.ls_xinf = ls_xinf;
    }
    public int getLs_fub() {
        return this.ls_fub;
    }
    public void setLs_fub(int ls_fub) {
        this.ls_fub = ls_fub;
    }
    public int getLs_siz() {
        return this.ls_siz;
    }
    public void setLs_siz(int ls_siz) {
        this.ls_siz = ls_siz;
    }
    public int getLs_but() {
        return this.ls_but;
    }
    public void setLs_but(int ls_but) {
        this.ls_but = ls_but;
    }
    public int getLs_kjglz() {
        return this.ls_kjglz;
    }
    public void setLs_kjglz(int ls_kjglz) {
        this.ls_kjglz = ls_kjglz;
    }
    public String getXhdb_id() {
        return this.xhdb_id;
    }
    public void setXhdb_id(String xhdb_id) {
        this.xhdb_id = xhdb_id;
    }
    public String getLs_hwhd() {
        return this.ls_hwhd;
    }
    public void setLs_hwhd(String ls_hwhd) {
        this.ls_hwhd = ls_hwhd;
    }
    public String getLs_fyvd() {
        return this.ls_fyvd;
    }
    public void setLs_fyvd(String ls_fyvd) {
        this.ls_fyvd = ls_fyvd;
    }
    public int getLs_fypg() {
        return this.ls_fypg;
    }
    public void setLs_fypg(int ls_fypg) {
        this.ls_fypg = ls_fypg;
    }
    public int getLs_lcsfhb() {
        return this.ls_lcsfhb;
    }
    public void setLs_lcsfhb(int ls_lcsfhb) {
        this.ls_lcsfhb = ls_lcsfhb;
    }
    public String getLs_other() {
        return this.ls_other;
    }
    public void setLs_other(String ls_other) {
        this.ls_other = ls_other;
    }
    public int getLs_zzjy() {
        return this.ls_zzjy;
    }
    public void setLs_zzjy(int ls_zzjy) {
        this.ls_zzjy = ls_zzjy;
    }
    public String getLs_zzyy() {
        return this.ls_zzyy;
    }
    public void setLs_zzyy(String ls_zzyy) {
        this.ls_zzyy = ls_zzyy;
    }
    public String getLs_jgks() {
        return this.ls_jgks;
    }
    public void setLs_jgks(String ls_jgks) {
        this.ls_jgks = ls_jgks;
    }
    public int getLs_zhid() {
        return this.ls_zhid;
    }
    public void setLs_zhid(int ls_zhid) {
        this.ls_zhid = ls_zhid;
    }
    public String getLs_next_date() {
        return this.ls_next_date;
    }
    public void setLs_next_date(String ls_next_date) {
        this.ls_next_date = ls_next_date;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
