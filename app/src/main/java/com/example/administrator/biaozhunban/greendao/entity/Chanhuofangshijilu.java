package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 * 产后健康检查记录表
 */
@Entity
public class Chanhuofangshijilu extends BaseEntity{
    @Id
    private Long id;//
    @NotNull
    private String ycfp_id;//
    @NotNull
    private String na_id;//居民id
    private String ycfp_date;//随访日期
    private String temp_id;//体温id
    private String ycfp_jkql;//一般健康情况
    private String ycfp_xlzk;//一般心理状况
    private String bp_id;//血压ID
    private int ycfp_rf;//乳房
    private String ycfp_rf_ms;//乳房 描述
    private int ycfp_el;//恶露
    private String ycfp_el_ms;//恶露 描述
    private int ycfp_zg;//子宫
    private String ycfp_zg_ms;//子宫 描述
    private int ycfp_sk;//伤口
    private String ycfp_sk_ms;//伤口 描述
    private String ycfp_other;//其他
    private int ycfp_type;//分类
    private String ycfp_type_ms;//分类 描述
    private int ycfp_zd;//指导
    private int ycfp_zz;//转诊
    private String ycfp_yy;//转诊原因
    private String ycfp_jgks;//转诊 机构科室
    private String ycfp_nextdate;//下次随访日期
    private String ycfp_doctor;//随访医生签字

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;
    @Generated(hash = 1745094947)
    public Chanhuofangshijilu(Long id, @NotNull String ycfp_id,
            @NotNull String na_id, String ycfp_date, String temp_id,
            String ycfp_jkql, String ycfp_xlzk, String bp_id, int ycfp_rf,
            String ycfp_rf_ms, int ycfp_el, String ycfp_el_ms, int ycfp_zg,
            String ycfp_zg_ms, int ycfp_sk, String ycfp_sk_ms, String ycfp_other,
            int ycfp_type, String ycfp_type_ms, int ycfp_zd, int ycfp_zz,
            String ycfp_yy, String ycfp_jgks, String ycfp_nextdate,
            String ycfp_doctor, String createDate) {
        this.id = id;
        this.ycfp_id = ycfp_id;
        this.na_id = na_id;
        this.ycfp_date = ycfp_date;
        this.temp_id = temp_id;
        this.ycfp_jkql = ycfp_jkql;
        this.ycfp_xlzk = ycfp_xlzk;
        this.bp_id = bp_id;
        this.ycfp_rf = ycfp_rf;
        this.ycfp_rf_ms = ycfp_rf_ms;
        this.ycfp_el = ycfp_el;
        this.ycfp_el_ms = ycfp_el_ms;
        this.ycfp_zg = ycfp_zg;
        this.ycfp_zg_ms = ycfp_zg_ms;
        this.ycfp_sk = ycfp_sk;
        this.ycfp_sk_ms = ycfp_sk_ms;
        this.ycfp_other = ycfp_other;
        this.ycfp_type = ycfp_type;
        this.ycfp_type_ms = ycfp_type_ms;
        this.ycfp_zd = ycfp_zd;
        this.ycfp_zz = ycfp_zz;
        this.ycfp_yy = ycfp_yy;
        this.ycfp_jgks = ycfp_jgks;
        this.ycfp_nextdate = ycfp_nextdate;
        this.ycfp_doctor = ycfp_doctor;
        this.createDate = createDate;
    }
    @Generated(hash = 1674006418)
    public Chanhuofangshijilu() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getYcfp_id() {
        return this.ycfp_id;
    }
    public void setYcfp_id(String ycfp_id) {
        this.ycfp_id = ycfp_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getYcfp_date() {
        return this.ycfp_date;
    }
    public void setYcfp_date(String ycfp_date) {
        this.ycfp_date = ycfp_date;
    }
    public String getTemp_id() {
        return this.temp_id;
    }
    public void setTemp_id(String temp_id) {
        this.temp_id = temp_id;
    }
    public String getYcfp_jkql() {
        return this.ycfp_jkql;
    }
    public void setYcfp_jkql(String ycfp_jkql) {
        this.ycfp_jkql = ycfp_jkql;
    }
    public String getYcfp_xlzk() {
        return this.ycfp_xlzk;
    }
    public void setYcfp_xlzk(String ycfp_xlzk) {
        this.ycfp_xlzk = ycfp_xlzk;
    }
    public String getBp_id() {
        return this.bp_id;
    }
    public void setBp_id(String bp_id) {
        this.bp_id = bp_id;
    }
    public int getYcfp_rf() {
        return this.ycfp_rf;
    }
    public void setYcfp_rf(int ycfp_rf) {
        this.ycfp_rf = ycfp_rf;
    }
    public String getYcfp_rf_ms() {
        return this.ycfp_rf_ms;
    }
    public void setYcfp_rf_ms(String ycfp_rf_ms) {
        this.ycfp_rf_ms = ycfp_rf_ms;
    }
    public int getYcfp_el() {
        return this.ycfp_el;
    }
    public void setYcfp_el(int ycfp_el) {
        this.ycfp_el = ycfp_el;
    }
    public String getYcfp_el_ms() {
        return this.ycfp_el_ms;
    }
    public void setYcfp_el_ms(String ycfp_el_ms) {
        this.ycfp_el_ms = ycfp_el_ms;
    }
    public int getYcfp_zg() {
        return this.ycfp_zg;
    }
    public void setYcfp_zg(int ycfp_zg) {
        this.ycfp_zg = ycfp_zg;
    }
    public String getYcfp_zg_ms() {
        return this.ycfp_zg_ms;
    }
    public void setYcfp_zg_ms(String ycfp_zg_ms) {
        this.ycfp_zg_ms = ycfp_zg_ms;
    }
    public int getYcfp_sk() {
        return this.ycfp_sk;
    }
    public void setYcfp_sk(int ycfp_sk) {
        this.ycfp_sk = ycfp_sk;
    }
    public String getYcfp_sk_ms() {
        return this.ycfp_sk_ms;
    }
    public void setYcfp_sk_ms(String ycfp_sk_ms) {
        this.ycfp_sk_ms = ycfp_sk_ms;
    }
    public String getYcfp_other() {
        return this.ycfp_other;
    }
    public void setYcfp_other(String ycfp_other) {
        this.ycfp_other = ycfp_other;
    }
    public int getYcfp_type() {
        return this.ycfp_type;
    }
    public void setYcfp_type(int ycfp_type) {
        this.ycfp_type = ycfp_type;
    }
    public String getYcfp_type_ms() {
        return this.ycfp_type_ms;
    }
    public void setYcfp_type_ms(String ycfp_type_ms) {
        this.ycfp_type_ms = ycfp_type_ms;
    }
    public int getYcfp_zd() {
        return this.ycfp_zd;
    }
    public void setYcfp_zd(int ycfp_zd) {
        this.ycfp_zd = ycfp_zd;
    }
    public int getYcfp_zz() {
        return this.ycfp_zz;
    }
    public void setYcfp_zz(int ycfp_zz) {
        this.ycfp_zz = ycfp_zz;
    }
    public String getYcfp_yy() {
        return this.ycfp_yy;
    }
    public void setYcfp_yy(String ycfp_yy) {
        this.ycfp_yy = ycfp_yy;
    }
    public String getYcfp_jgks() {
        return this.ycfp_jgks;
    }
    public void setYcfp_jgks(String ycfp_jgks) {
        this.ycfp_jgks = ycfp_jgks;
    }
    public String getYcfp_nextdate() {
        return this.ycfp_nextdate;
    }
    public void setYcfp_nextdate(String ycfp_nextdate) {
        this.ycfp_nextdate = ycfp_nextdate;
    }
    public String getYcfp_doctor() {
        return this.ycfp_doctor;
    }
    public void setYcfp_doctor(String ycfp_doctor) {
        this.ycfp_doctor = ycfp_doctor;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
