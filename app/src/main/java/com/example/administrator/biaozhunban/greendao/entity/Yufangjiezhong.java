package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 */
@Entity
public class Yufangjiezhong extends BaseEntity{
    @Id(autoincrement = true)
    private Long id;
    @Index
    private String yfjz_id;//
    private String na_id;//居民id
    private String yfjz_jhrxm;//监护人姓名
    private String yfjz_yetgx;//与儿童关系
    private String yfjz_lxfs;//联系方式
    private String yfjz_jtxzz;//家庭现住址
    private String yfjz_hjtype;//户籍地址-类型
    private String yfjz_hjdz;//户籍地址
    private String yfjz_qrsj;//迁入时间
    private String yfjz_qcsj;//迁出时间
    private String yfjz_qcyy;//迁出原因
    private String yfjz_ymyc;//疫苗异常反应史
    private String yfjz_zhjj;//接种禁忌
    private String yfjz_crbs;//传染病史
    private String yfjz_date;//建卡时间
    private String yfjz_jkr;//建卡人

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1752091912)
    public Yufangjiezhong(Long id, String yfjz_id, String na_id, String yfjz_jhrxm,
            String yfjz_yetgx, String yfjz_lxfs, String yfjz_jtxzz,
            String yfjz_hjtype, String yfjz_hjdz, String yfjz_qrsj,
            String yfjz_qcsj, String yfjz_qcyy, String yfjz_ymyc, String yfjz_zhjj,
            String yfjz_crbs, String yfjz_date, String yfjz_jkr,
            String createDate) {
        this.id = id;
        this.yfjz_id = yfjz_id;
        this.na_id = na_id;
        this.yfjz_jhrxm = yfjz_jhrxm;
        this.yfjz_yetgx = yfjz_yetgx;
        this.yfjz_lxfs = yfjz_lxfs;
        this.yfjz_jtxzz = yfjz_jtxzz;
        this.yfjz_hjtype = yfjz_hjtype;
        this.yfjz_hjdz = yfjz_hjdz;
        this.yfjz_qrsj = yfjz_qrsj;
        this.yfjz_qcsj = yfjz_qcsj;
        this.yfjz_qcyy = yfjz_qcyy;
        this.yfjz_ymyc = yfjz_ymyc;
        this.yfjz_zhjj = yfjz_zhjj;
        this.yfjz_crbs = yfjz_crbs;
        this.yfjz_date = yfjz_date;
        this.yfjz_jkr = yfjz_jkr;
        this.createDate = createDate;
    }
    @Generated(hash = 1358449609)
    public Yufangjiezhong() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getYfjz_id() {
        return this.yfjz_id;
    }
    public void setYfjz_id(String yfjz_id) {
        this.yfjz_id = yfjz_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getYfjz_jhrxm() {
        return this.yfjz_jhrxm;
    }
    public void setYfjz_jhrxm(String yfjz_jhrxm) {
        this.yfjz_jhrxm = yfjz_jhrxm;
    }
    public String getYfjz_yetgx() {
        return this.yfjz_yetgx;
    }
    public void setYfjz_yetgx(String yfjz_yetgx) {
        this.yfjz_yetgx = yfjz_yetgx;
    }
    public String getYfjz_lxfs() {
        return this.yfjz_lxfs;
    }
    public void setYfjz_lxfs(String yfjz_lxfs) {
        this.yfjz_lxfs = yfjz_lxfs;
    }
    public String getYfjz_jtxzz() {
        return this.yfjz_jtxzz;
    }
    public void setYfjz_jtxzz(String yfjz_jtxzz) {
        this.yfjz_jtxzz = yfjz_jtxzz;
    }
    public String getYfjz_hjtype() {
        return this.yfjz_hjtype;
    }
    public void setYfjz_hjtype(String yfjz_hjtype) {
        this.yfjz_hjtype = yfjz_hjtype;
    }
    public String getYfjz_hjdz() {
        return this.yfjz_hjdz;
    }
    public void setYfjz_hjdz(String yfjz_hjdz) {
        this.yfjz_hjdz = yfjz_hjdz;
    }
    public String getYfjz_qrsj() {
        return this.yfjz_qrsj;
    }
    public void setYfjz_qrsj(String yfjz_qrsj) {
        this.yfjz_qrsj = yfjz_qrsj;
    }
    public String getYfjz_qcsj() {
        return this.yfjz_qcsj;
    }
    public void setYfjz_qcsj(String yfjz_qcsj) {
        this.yfjz_qcsj = yfjz_qcsj;
    }
    public String getYfjz_qcyy() {
        return this.yfjz_qcyy;
    }
    public void setYfjz_qcyy(String yfjz_qcyy) {
        this.yfjz_qcyy = yfjz_qcyy;
    }
    public String getYfjz_ymyc() {
        return this.yfjz_ymyc;
    }
    public void setYfjz_ymyc(String yfjz_ymyc) {
        this.yfjz_ymyc = yfjz_ymyc;
    }
    public String getYfjz_zhjj() {
        return this.yfjz_zhjj;
    }
    public void setYfjz_zhjj(String yfjz_zhjj) {
        this.yfjz_zhjj = yfjz_zhjj;
    }
    public String getYfjz_crbs() {
        return this.yfjz_crbs;
    }
    public void setYfjz_crbs(String yfjz_crbs) {
        this.yfjz_crbs = yfjz_crbs;
    }
    public String getYfjz_date() {
        return this.yfjz_date;
    }
    public void setYfjz_date(String yfjz_date) {
        this.yfjz_date = yfjz_date;
    }
    public String getYfjz_jkr() {
        return this.yfjz_jkr;
    }
    public void setYfjz_jkr(String yfjz_jkr) {
        this.yfjz_jkr = yfjz_jkr;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
