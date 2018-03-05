package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 * 产后42天健康检查记录表
 */
@Entity
public class Chanhuofangshijilutianhou42 extends BaseEntity{
    @Id
    private Long id;//
    @NotNull
    private String ycfp2_id;//
    @NotNull
    private String na_id;//居民id
    private String ycfp2_date;//随访日期
    private String ycfp2_jkql;//一般健康情况
    private String ycfp2_xlzk;//一般心理状况
    private String bp_id;//血压ID
    private int ycfp2_rf;//乳房
    private String ycfp2_rf_ms;//乳房 描述
    private int ycfp2_el;//恶露
    private String ycfp2_el_ms;//恶露 描述
    private int ycfp2_zg;//子宫
    private String ycfp2_zg_ms;//子宫 描述
    private int ycfp2_sk;//伤口
    private String ycfp2_sk_ms;//伤口 描述
    private String ycfp2_other;//其他
    private int ycfp2_type;//分类 0已恢复 ， 1未恢复
    private String ycfp2_type_ms;//分类 描述
    private int ycfp2_zd;//指导
    private int ycfp2_cl;//处理 0结束，1转诊
    private String ycfp2_yy;//转诊原因
    private String ycfp2_jgks;//转诊 机构科室
    private String ycfp2_doctor;//随访医生签字

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;
    @Generated(hash = 2046537696)
    public Chanhuofangshijilutianhou42(Long id, @NotNull String ycfp2_id,
            @NotNull String na_id, String ycfp2_date, String ycfp2_jkql,
            String ycfp2_xlzk, String bp_id, int ycfp2_rf, String ycfp2_rf_ms,
            int ycfp2_el, String ycfp2_el_ms, int ycfp2_zg, String ycfp2_zg_ms,
            int ycfp2_sk, String ycfp2_sk_ms, String ycfp2_other, int ycfp2_type,
            String ycfp2_type_ms, int ycfp2_zd, int ycfp2_cl, String ycfp2_yy,
            String ycfp2_jgks, String ycfp2_doctor, String createDate) {
        this.id = id;
        this.ycfp2_id = ycfp2_id;
        this.na_id = na_id;
        this.ycfp2_date = ycfp2_date;
        this.ycfp2_jkql = ycfp2_jkql;
        this.ycfp2_xlzk = ycfp2_xlzk;
        this.bp_id = bp_id;
        this.ycfp2_rf = ycfp2_rf;
        this.ycfp2_rf_ms = ycfp2_rf_ms;
        this.ycfp2_el = ycfp2_el;
        this.ycfp2_el_ms = ycfp2_el_ms;
        this.ycfp2_zg = ycfp2_zg;
        this.ycfp2_zg_ms = ycfp2_zg_ms;
        this.ycfp2_sk = ycfp2_sk;
        this.ycfp2_sk_ms = ycfp2_sk_ms;
        this.ycfp2_other = ycfp2_other;
        this.ycfp2_type = ycfp2_type;
        this.ycfp2_type_ms = ycfp2_type_ms;
        this.ycfp2_zd = ycfp2_zd;
        this.ycfp2_cl = ycfp2_cl;
        this.ycfp2_yy = ycfp2_yy;
        this.ycfp2_jgks = ycfp2_jgks;
        this.ycfp2_doctor = ycfp2_doctor;
        this.createDate = createDate;
    }
    @Generated(hash = 2015107213)
    public Chanhuofangshijilutianhou42() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getYcfp2_id() {
        return this.ycfp2_id;
    }
    public void setYcfp2_id(String ycfp2_id) {
        this.ycfp2_id = ycfp2_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getYcfp2_date() {
        return this.ycfp2_date;
    }
    public void setYcfp2_date(String ycfp2_date) {
        this.ycfp2_date = ycfp2_date;
    }
    public String getYcfp2_jkql() {
        return this.ycfp2_jkql;
    }
    public void setYcfp2_jkql(String ycfp2_jkql) {
        this.ycfp2_jkql = ycfp2_jkql;
    }
    public String getYcfp2_xlzk() {
        return this.ycfp2_xlzk;
    }
    public void setYcfp2_xlzk(String ycfp2_xlzk) {
        this.ycfp2_xlzk = ycfp2_xlzk;
    }
    public String getBp_id() {
        return this.bp_id;
    }
    public void setBp_id(String bp_id) {
        this.bp_id = bp_id;
    }
    public int getYcfp2_rf() {
        return this.ycfp2_rf;
    }
    public void setYcfp2_rf(int ycfp2_rf) {
        this.ycfp2_rf = ycfp2_rf;
    }
    public String getYcfp2_rf_ms() {
        return this.ycfp2_rf_ms;
    }
    public void setYcfp2_rf_ms(String ycfp2_rf_ms) {
        this.ycfp2_rf_ms = ycfp2_rf_ms;
    }
    public int getYcfp2_el() {
        return this.ycfp2_el;
    }
    public void setYcfp2_el(int ycfp2_el) {
        this.ycfp2_el = ycfp2_el;
    }
    public String getYcfp2_el_ms() {
        return this.ycfp2_el_ms;
    }
    public void setYcfp2_el_ms(String ycfp2_el_ms) {
        this.ycfp2_el_ms = ycfp2_el_ms;
    }
    public int getYcfp2_zg() {
        return this.ycfp2_zg;
    }
    public void setYcfp2_zg(int ycfp2_zg) {
        this.ycfp2_zg = ycfp2_zg;
    }
    public String getYcfp2_zg_ms() {
        return this.ycfp2_zg_ms;
    }
    public void setYcfp2_zg_ms(String ycfp2_zg_ms) {
        this.ycfp2_zg_ms = ycfp2_zg_ms;
    }
    public int getYcfp2_sk() {
        return this.ycfp2_sk;
    }
    public void setYcfp2_sk(int ycfp2_sk) {
        this.ycfp2_sk = ycfp2_sk;
    }
    public String getYcfp2_sk_ms() {
        return this.ycfp2_sk_ms;
    }
    public void setYcfp2_sk_ms(String ycfp2_sk_ms) {
        this.ycfp2_sk_ms = ycfp2_sk_ms;
    }
    public String getYcfp2_other() {
        return this.ycfp2_other;
    }
    public void setYcfp2_other(String ycfp2_other) {
        this.ycfp2_other = ycfp2_other;
    }
    public int getYcfp2_type() {
        return this.ycfp2_type;
    }
    public void setYcfp2_type(int ycfp2_type) {
        this.ycfp2_type = ycfp2_type;
    }
    public String getYcfp2_type_ms() {
        return this.ycfp2_type_ms;
    }
    public void setYcfp2_type_ms(String ycfp2_type_ms) {
        this.ycfp2_type_ms = ycfp2_type_ms;
    }
    public int getYcfp2_zd() {
        return this.ycfp2_zd;
    }
    public void setYcfp2_zd(int ycfp2_zd) {
        this.ycfp2_zd = ycfp2_zd;
    }
    public int getYcfp2_cl() {
        return this.ycfp2_cl;
    }
    public void setYcfp2_cl(int ycfp2_cl) {
        this.ycfp2_cl = ycfp2_cl;
    }
    public String getYcfp2_yy() {
        return this.ycfp2_yy;
    }
    public void setYcfp2_yy(String ycfp2_yy) {
        this.ycfp2_yy = ycfp2_yy;
    }
    public String getYcfp2_jgks() {
        return this.ycfp2_jgks;
    }
    public void setYcfp2_jgks(String ycfp2_jgks) {
        this.ycfp2_jgks = ycfp2_jgks;
    }
    public String getYcfp2_doctor() {
        return this.ycfp2_doctor;
    }
    public void setYcfp2_doctor(String ycfp2_doctor) {
        this.ycfp2_doctor = ycfp2_doctor;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
