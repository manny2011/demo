package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 * '3-6儿童健康管理'
 */
@Entity
public class Sandaoliusuiertongjiankang extends BaseEntity{
    @Id
    private Long id;
    @NotNull
    private String ssjk_id;//3-6儿童健康管理
    private String na_id;//居民id
    private int ss_yuel;//月龄0三岁1四岁2五岁3六岁
    private String ss_follow_date;//3-6岁随访日期
    private String hw_id;//身高体重id
    private int ss_sgfy;//身高发育0上1中2下
    private int ss_tzfy;//体重发育0上1中2下
    private String ss_shil;//视力
    private int ss_tingl;//听力0通过1未通过
    private String ss_cys;//出牙数(颗)
    private String ss_qcs;//龋齿数(颗)
    private int ss_xinf;//心肺0正常1异常
    private int ss_fub;//腹部0正常1异常
    private String xhdb_id;//血红蛋白id
    private int ss_lcsfhb;//两次随访患病情况0无1肺炎2腹泻3外伤4其他
    private String ss_feiy;//肺炎(次)
    private String ss_fux;//腹泻(次)
    private String ss_wais;//外伤(次)
    private String ss_qit;//其他(次)
    private int ss_zzjy;//转诊建议0无1有
    private String ss_zzyy;//转诊原因
    private String ss_jgks;//机构科室
    private int ss_zhid;//指导0科学喂养1生长发育2疾病预防3预防意外伤害4口腔保健5其他
    private String ss_next_date;//下次随访日期
    private String ss_doctor;//随访医生
    private int ss_tigfypj;//体格发育评价0正常1低体重2消瘦3发育迟缓4超重
    private String ss_qit1;//

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 967788874)
    public Sandaoliusuiertongjiankang(Long id, @NotNull String ssjk_id,
            String na_id, int ss_yuel, String ss_follow_date, String hw_id,
            int ss_sgfy, int ss_tzfy, String ss_shil, int ss_tingl, String ss_cys,
            String ss_qcs, int ss_xinf, int ss_fub, String xhdb_id, int ss_lcsfhb,
            String ss_feiy, String ss_fux, String ss_wais, String ss_qit,
            int ss_zzjy, String ss_zzyy, String ss_jgks, int ss_zhid,
            String ss_next_date, String ss_doctor, int ss_tigfypj, String ss_qit1,
            String createDate) {
        this.id = id;
        this.ssjk_id = ssjk_id;
        this.na_id = na_id;
        this.ss_yuel = ss_yuel;
        this.ss_follow_date = ss_follow_date;
        this.hw_id = hw_id;
        this.ss_sgfy = ss_sgfy;
        this.ss_tzfy = ss_tzfy;
        this.ss_shil = ss_shil;
        this.ss_tingl = ss_tingl;
        this.ss_cys = ss_cys;
        this.ss_qcs = ss_qcs;
        this.ss_xinf = ss_xinf;
        this.ss_fub = ss_fub;
        this.xhdb_id = xhdb_id;
        this.ss_lcsfhb = ss_lcsfhb;
        this.ss_feiy = ss_feiy;
        this.ss_fux = ss_fux;
        this.ss_wais = ss_wais;
        this.ss_qit = ss_qit;
        this.ss_zzjy = ss_zzjy;
        this.ss_zzyy = ss_zzyy;
        this.ss_jgks = ss_jgks;
        this.ss_zhid = ss_zhid;
        this.ss_next_date = ss_next_date;
        this.ss_doctor = ss_doctor;
        this.ss_tigfypj = ss_tigfypj;
        this.ss_qit1 = ss_qit1;
        this.createDate = createDate;
    }
    @Generated(hash = 514859956)
    public Sandaoliusuiertongjiankang() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSsjk_id() {
        return this.ssjk_id;
    }
    public void setSsjk_id(String ssjk_id) {
        this.ssjk_id = ssjk_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public int getSs_yuel() {
        return this.ss_yuel;
    }
    public void setSs_yuel(int ss_yuel) {
        this.ss_yuel = ss_yuel;
    }
    public String getSs_follow_date() {
        return this.ss_follow_date;
    }
    public void setSs_follow_date(String ss_follow_date) {
        this.ss_follow_date = ss_follow_date;
    }
    public String getHw_id() {
        return this.hw_id;
    }
    public void setHw_id(String hw_id) {
        this.hw_id = hw_id;
    }
    public int getSs_sgfy() {
        return this.ss_sgfy;
    }
    public void setSs_sgfy(int ss_sgfy) {
        this.ss_sgfy = ss_sgfy;
    }
    public int getSs_tzfy() {
        return this.ss_tzfy;
    }
    public void setSs_tzfy(int ss_tzfy) {
        this.ss_tzfy = ss_tzfy;
    }
    public String getSs_shil() {
        return this.ss_shil;
    }
    public void setSs_shil(String ss_shil) {
        this.ss_shil = ss_shil;
    }
    public int getSs_tingl() {
        return this.ss_tingl;
    }
    public void setSs_tingl(int ss_tingl) {
        this.ss_tingl = ss_tingl;
    }
    public String getSs_cys() {
        return this.ss_cys;
    }
    public void setSs_cys(String ss_cys) {
        this.ss_cys = ss_cys;
    }
    public String getSs_qcs() {
        return this.ss_qcs;
    }
    public void setSs_qcs(String ss_qcs) {
        this.ss_qcs = ss_qcs;
    }
    public int getSs_xinf() {
        return this.ss_xinf;
    }
    public void setSs_xinf(int ss_xinf) {
        this.ss_xinf = ss_xinf;
    }
    public int getSs_fub() {
        return this.ss_fub;
    }
    public void setSs_fub(int ss_fub) {
        this.ss_fub = ss_fub;
    }
    public String getXhdb_id() {
        return this.xhdb_id;
    }
    public void setXhdb_id(String xhdb_id) {
        this.xhdb_id = xhdb_id;
    }
    public int getSs_lcsfhb() {
        return this.ss_lcsfhb;
    }
    public void setSs_lcsfhb(int ss_lcsfhb) {
        this.ss_lcsfhb = ss_lcsfhb;
    }
    public String getSs_feiy() {
        return this.ss_feiy;
    }
    public void setSs_feiy(String ss_feiy) {
        this.ss_feiy = ss_feiy;
    }
    public String getSs_fux() {
        return this.ss_fux;
    }
    public void setSs_fux(String ss_fux) {
        this.ss_fux = ss_fux;
    }
    public String getSs_wais() {
        return this.ss_wais;
    }
    public void setSs_wais(String ss_wais) {
        this.ss_wais = ss_wais;
    }
    public String getSs_qit() {
        return this.ss_qit;
    }
    public void setSs_qit(String ss_qit) {
        this.ss_qit = ss_qit;
    }
    public int getSs_zzjy() {
        return this.ss_zzjy;
    }
    public void setSs_zzjy(int ss_zzjy) {
        this.ss_zzjy = ss_zzjy;
    }
    public String getSs_zzyy() {
        return this.ss_zzyy;
    }
    public void setSs_zzyy(String ss_zzyy) {
        this.ss_zzyy = ss_zzyy;
    }
    public String getSs_jgks() {
        return this.ss_jgks;
    }
    public void setSs_jgks(String ss_jgks) {
        this.ss_jgks = ss_jgks;
    }
    public int getSs_zhid() {
        return this.ss_zhid;
    }
    public void setSs_zhid(int ss_zhid) {
        this.ss_zhid = ss_zhid;
    }
    public String getSs_next_date() {
        return this.ss_next_date;
    }
    public void setSs_next_date(String ss_next_date) {
        this.ss_next_date = ss_next_date;
    }
    public String getSs_doctor() {
        return this.ss_doctor;
    }
    public void setSs_doctor(String ss_doctor) {
        this.ss_doctor = ss_doctor;
    }
    public int getSs_tigfypj() {
        return this.ss_tigfypj;
    }
    public void setSs_tigfypj(int ss_tigfypj) {
        this.ss_tigfypj = ss_tigfypj;
    }
    public String getSs_qit1() {
        return this.ss_qit1;
    }
    public void setSs_qit1(String ss_qit1) {
        this.ss_qit1 = ss_qit1;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
