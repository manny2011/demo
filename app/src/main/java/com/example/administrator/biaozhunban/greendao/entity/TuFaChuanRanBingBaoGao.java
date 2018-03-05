package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * '传染病及突发公共卫生事件报告和处理服务'
 */
@Entity
public class TuFaChuanRanBingBaoGao extends BaseEntity{
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String crb_id;//
    @NotNull
    private String na_id;//居民id
    private int nation_id;//民族id
    private String crb_Company;//单位
    private String crb_Occupation;//职业
    private String crb_disease_time;//发病日期
    private String crb_visit_time;//出诊日期
    private String crb_admission_time;//入院日期
    private String crb_death_time;//死亡日期
    private String crb_report_time;//报告日期
    private String crb_Reporting_unit;//报告单位
    private String crb_Rapporteur;//报告人
    private String crb_clinical;//临床特征
    private int crb_type_id;//传染病类型id
    private String crb_creattime;//创建时间

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 459199499)
    public TuFaChuanRanBingBaoGao(Long id, @NotNull String crb_id,
            @NotNull String na_id, int nation_id, String crb_Company,
            String crb_Occupation, String crb_disease_time, String crb_visit_time,
            String crb_admission_time, String crb_death_time,
            String crb_report_time, String crb_Reporting_unit,
            String crb_Rapporteur, String crb_clinical, int crb_type_id,
            String crb_creattime, String createDate) {
        this.id = id;
        this.crb_id = crb_id;
        this.na_id = na_id;
        this.nation_id = nation_id;
        this.crb_Company = crb_Company;
        this.crb_Occupation = crb_Occupation;
        this.crb_disease_time = crb_disease_time;
        this.crb_visit_time = crb_visit_time;
        this.crb_admission_time = crb_admission_time;
        this.crb_death_time = crb_death_time;
        this.crb_report_time = crb_report_time;
        this.crb_Reporting_unit = crb_Reporting_unit;
        this.crb_Rapporteur = crb_Rapporteur;
        this.crb_clinical = crb_clinical;
        this.crb_type_id = crb_type_id;
        this.crb_creattime = crb_creattime;
        this.createDate = createDate;
    }
    @Generated(hash = 1015246116)
    public TuFaChuanRanBingBaoGao() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCrb_id() {
        return this.crb_id;
    }
    public void setCrb_id(String crb_id) {
        this.crb_id = crb_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public int getNation_id() {
        return this.nation_id;
    }
    public void setNation_id(int nation_id) {
        this.nation_id = nation_id;
    }
    public String getCrb_Company() {
        return this.crb_Company;
    }
    public void setCrb_Company(String crb_Company) {
        this.crb_Company = crb_Company;
    }
    public String getCrb_Occupation() {
        return this.crb_Occupation;
    }
    public void setCrb_Occupation(String crb_Occupation) {
        this.crb_Occupation = crb_Occupation;
    }
    public String getCrb_disease_time() {
        return this.crb_disease_time;
    }
    public void setCrb_disease_time(String crb_disease_time) {
        this.crb_disease_time = crb_disease_time;
    }
    public String getCrb_visit_time() {
        return this.crb_visit_time;
    }
    public void setCrb_visit_time(String crb_visit_time) {
        this.crb_visit_time = crb_visit_time;
    }
    public String getCrb_admission_time() {
        return this.crb_admission_time;
    }
    public void setCrb_admission_time(String crb_admission_time) {
        this.crb_admission_time = crb_admission_time;
    }
    public String getCrb_death_time() {
        return this.crb_death_time;
    }
    public void setCrb_death_time(String crb_death_time) {
        this.crb_death_time = crb_death_time;
    }
    public String getCrb_report_time() {
        return this.crb_report_time;
    }
    public void setCrb_report_time(String crb_report_time) {
        this.crb_report_time = crb_report_time;
    }
    public String getCrb_Reporting_unit() {
        return this.crb_Reporting_unit;
    }
    public void setCrb_Reporting_unit(String crb_Reporting_unit) {
        this.crb_Reporting_unit = crb_Reporting_unit;
    }
    public String getCrb_Rapporteur() {
        return this.crb_Rapporteur;
    }
    public void setCrb_Rapporteur(String crb_Rapporteur) {
        this.crb_Rapporteur = crb_Rapporteur;
    }
    public String getCrb_clinical() {
        return this.crb_clinical;
    }
    public void setCrb_clinical(String crb_clinical) {
        this.crb_clinical = crb_clinical;
    }
    public int getCrb_type_id() {
        return this.crb_type_id;
    }
    public void setCrb_type_id(int crb_type_id) {
        this.crb_type_id = crb_type_id;
    }
    public String getCrb_creattime() {
        return this.crb_creattime;
    }
    public void setCrb_creattime(String crb_creattime) {
        this.crb_creattime = crb_creattime;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
