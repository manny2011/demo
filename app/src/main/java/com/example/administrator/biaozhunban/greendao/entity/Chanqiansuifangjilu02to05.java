package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 * 第2-5次产前随访服务记录表
 */
@Entity
public class Chanqiansuifangjilu02to05 extends BaseEntity{
    @Id
    private Long id;
    @NotNull
    private String ycf2_id;
    @NotNull
    private String na_id;//居民id
    private int ycf2_xm;//项目
    private String ycf2_date;//随访时间
    private String ycf2_yz;//孕周
    private String ycf2_zhus;//主诉
    private String ycf2_weight;//体重
    private String ycf2_gd;//宫底高度
    private String ycf2_yw;//腹围
    private String ycf2_tw;//胎位
    private String ycf2_txl;//胎心率
    private String bp_id;//血压
    private String ycf2_xhdb;//血红蛋白
    private String ycf2_ndb;//尿蛋白
    private String ycf2_qtfz;//其他辅助检查
    private int ycf2_type;//分类 0 未见异常， 1 异常
    private String ycf2_type_ms;//分类描述
    private int ycf2_zd;//指导
    private int ycf2_zz;//转诊 0无 ，1有
    private String ycf2_yy;//原因
    private String ycf2_jgks;//机构及科室
    private String ycf2_nextdate;//下次随访日期
    private String ycf2_doctor;//随访医生签字

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 309217029)
    public Chanqiansuifangjilu02to05(Long id, @NotNull String ycf2_id,
            @NotNull String na_id, int ycf2_xm, String ycf2_date, String ycf2_yz,
            String ycf2_zhus, String ycf2_weight, String ycf2_gd, String ycf2_yw,
            String ycf2_tw, String ycf2_txl, String bp_id, String ycf2_xhdb,
            String ycf2_ndb, String ycf2_qtfz, int ycf2_type, String ycf2_type_ms,
            int ycf2_zd, int ycf2_zz, String ycf2_yy, String ycf2_jgks,
            String ycf2_nextdate, String ycf2_doctor, String createDate) {
        this.id = id;
        this.ycf2_id = ycf2_id;
        this.na_id = na_id;
        this.ycf2_xm = ycf2_xm;
        this.ycf2_date = ycf2_date;
        this.ycf2_yz = ycf2_yz;
        this.ycf2_zhus = ycf2_zhus;
        this.ycf2_weight = ycf2_weight;
        this.ycf2_gd = ycf2_gd;
        this.ycf2_yw = ycf2_yw;
        this.ycf2_tw = ycf2_tw;
        this.ycf2_txl = ycf2_txl;
        this.bp_id = bp_id;
        this.ycf2_xhdb = ycf2_xhdb;
        this.ycf2_ndb = ycf2_ndb;
        this.ycf2_qtfz = ycf2_qtfz;
        this.ycf2_type = ycf2_type;
        this.ycf2_type_ms = ycf2_type_ms;
        this.ycf2_zd = ycf2_zd;
        this.ycf2_zz = ycf2_zz;
        this.ycf2_yy = ycf2_yy;
        this.ycf2_jgks = ycf2_jgks;
        this.ycf2_nextdate = ycf2_nextdate;
        this.ycf2_doctor = ycf2_doctor;
        this.createDate = createDate;
    }
    @Generated(hash = 1245471263)
    public Chanqiansuifangjilu02to05() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getYcf2_id() {
        return this.ycf2_id;
    }
    public void setYcf2_id(String ycf2_id) {
        this.ycf2_id = ycf2_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public int getYcf2_xm() {
        return this.ycf2_xm;
    }
    public void setYcf2_xm(int ycf2_xm) {
        this.ycf2_xm = ycf2_xm;
    }
    public String getYcf2_date() {
        return this.ycf2_date;
    }
    public void setYcf2_date(String ycf2_date) {
        this.ycf2_date = ycf2_date;
    }
    public String getYcf2_yz() {
        return this.ycf2_yz;
    }
    public void setYcf2_yz(String ycf2_yz) {
        this.ycf2_yz = ycf2_yz;
    }
    public String getYcf2_zhus() {
        return this.ycf2_zhus;
    }
    public void setYcf2_zhus(String ycf2_zhus) {
        this.ycf2_zhus = ycf2_zhus;
    }
    public String getYcf2_weight() {
        return this.ycf2_weight;
    }
    public void setYcf2_weight(String ycf2_weight) {
        this.ycf2_weight = ycf2_weight;
    }
    public String getYcf2_gd() {
        return this.ycf2_gd;
    }
    public void setYcf2_gd(String ycf2_gd) {
        this.ycf2_gd = ycf2_gd;
    }
    public String getYcf2_yw() {
        return this.ycf2_yw;
    }
    public void setYcf2_yw(String ycf2_yw) {
        this.ycf2_yw = ycf2_yw;
    }
    public String getYcf2_tw() {
        return this.ycf2_tw;
    }
    public void setYcf2_tw(String ycf2_tw) {
        this.ycf2_tw = ycf2_tw;
    }
    public String getYcf2_txl() {
        return this.ycf2_txl;
    }
    public void setYcf2_txl(String ycf2_txl) {
        this.ycf2_txl = ycf2_txl;
    }
    public String getBp_id() {
        return this.bp_id;
    }
    public void setBp_id(String bp_id) {
        this.bp_id = bp_id;
    }
    public String getYcf2_xhdb() {
        return this.ycf2_xhdb;
    }
    public void setYcf2_xhdb(String ycf2_xhdb) {
        this.ycf2_xhdb = ycf2_xhdb;
    }
    public String getYcf2_ndb() {
        return this.ycf2_ndb;
    }
    public void setYcf2_ndb(String ycf2_ndb) {
        this.ycf2_ndb = ycf2_ndb;
    }
    public String getYcf2_qtfz() {
        return this.ycf2_qtfz;
    }
    public void setYcf2_qtfz(String ycf2_qtfz) {
        this.ycf2_qtfz = ycf2_qtfz;
    }
    public int getYcf2_type() {
        return this.ycf2_type;
    }
    public void setYcf2_type(int ycf2_type) {
        this.ycf2_type = ycf2_type;
    }
    public String getYcf2_type_ms() {
        return this.ycf2_type_ms;
    }
    public void setYcf2_type_ms(String ycf2_type_ms) {
        this.ycf2_type_ms = ycf2_type_ms;
    }
    public int getYcf2_zd() {
        return this.ycf2_zd;
    }
    public void setYcf2_zd(int ycf2_zd) {
        this.ycf2_zd = ycf2_zd;
    }
    public int getYcf2_zz() {
        return this.ycf2_zz;
    }
    public void setYcf2_zz(int ycf2_zz) {
        this.ycf2_zz = ycf2_zz;
    }
    public String getYcf2_yy() {
        return this.ycf2_yy;
    }
    public void setYcf2_yy(String ycf2_yy) {
        this.ycf2_yy = ycf2_yy;
    }
    public String getYcf2_jgks() {
        return this.ycf2_jgks;
    }
    public void setYcf2_jgks(String ycf2_jgks) {
        this.ycf2_jgks = ycf2_jgks;
    }
    public String getYcf2_nextdate() {
        return this.ycf2_nextdate;
    }
    public void setYcf2_nextdate(String ycf2_nextdate) {
        this.ycf2_nextdate = ycf2_nextdate;
    }
    public String getYcf2_doctor() {
        return this.ycf2_doctor;
    }
    public void setYcf2_doctor(String ycf2_doctor) {
        this.ycf2_doctor = ycf2_doctor;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
