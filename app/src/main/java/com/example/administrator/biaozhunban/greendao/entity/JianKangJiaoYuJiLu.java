package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/30.
 * '健康教育活动记录'
 */
@Entity
public class JianKangJiaoYuJiLu implements Serializable{
    private static final long serialVersionUID = 7167654653675457147L;
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String jkjy_id;//健康教育主键
    private String jkjy_hdrq;//活动日期
    private String jkjy_hddd;//活动地点
    private String jkjy_hdxs;//活动形式
    private String jkjy_hdzt;//活动主题
    private String jkjy_zzz;//组织者
    private String jkjy_jsrylb;//接受健康教育人员类别
    private String jkjy_jsrs;//接受健康教育人数
    private String jkjy_zlffsl;//健康资料发放种类及数量
    private String jkjy_hdnr;//活动内容
    private String jkjy_zjpj;//活动总结评价
    private int jkjy_cdcl;//存档材料
    private String jkjy_tbr;//填表人
    private String jkjy_fzr;//负责人
    private String jkjy_tbrq;//填报日期

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1530489587)
    public JianKangJiaoYuJiLu(Long id, @NotNull String jkjy_id, String jkjy_hdrq,
            String jkjy_hddd, String jkjy_hdxs, String jkjy_hdzt, String jkjy_zzz,
            String jkjy_jsrylb, String jkjy_jsrs, String jkjy_zlffsl,
            String jkjy_hdnr, String jkjy_zjpj, int jkjy_cdcl, String jkjy_tbr,
            String jkjy_fzr, String jkjy_tbrq, String createDate) {
        this.id = id;
        this.jkjy_id = jkjy_id;
        this.jkjy_hdrq = jkjy_hdrq;
        this.jkjy_hddd = jkjy_hddd;
        this.jkjy_hdxs = jkjy_hdxs;
        this.jkjy_hdzt = jkjy_hdzt;
        this.jkjy_zzz = jkjy_zzz;
        this.jkjy_jsrylb = jkjy_jsrylb;
        this.jkjy_jsrs = jkjy_jsrs;
        this.jkjy_zlffsl = jkjy_zlffsl;
        this.jkjy_hdnr = jkjy_hdnr;
        this.jkjy_zjpj = jkjy_zjpj;
        this.jkjy_cdcl = jkjy_cdcl;
        this.jkjy_tbr = jkjy_tbr;
        this.jkjy_fzr = jkjy_fzr;
        this.jkjy_tbrq = jkjy_tbrq;
        this.createDate = createDate;
    }
    @Generated(hash = 1484532102)
    public JianKangJiaoYuJiLu() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getJkjy_id() {
        return this.jkjy_id;
    }
    public void setJkjy_id(String jkjy_id) {
        this.jkjy_id = jkjy_id;
    }
    public String getJkjy_hdrq() {
        return this.jkjy_hdrq;
    }
    public void setJkjy_hdrq(String jkjy_hdrq) {
        this.jkjy_hdrq = jkjy_hdrq;
    }
    public String getJkjy_hddd() {
        return this.jkjy_hddd;
    }
    public void setJkjy_hddd(String jkjy_hddd) {
        this.jkjy_hddd = jkjy_hddd;
    }
    public String getJkjy_hdxs() {
        return this.jkjy_hdxs;
    }
    public void setJkjy_hdxs(String jkjy_hdxs) {
        this.jkjy_hdxs = jkjy_hdxs;
    }
    public String getJkjy_hdzt() {
        return this.jkjy_hdzt;
    }
    public void setJkjy_hdzt(String jkjy_hdzt) {
        this.jkjy_hdzt = jkjy_hdzt;
    }
    public String getJkjy_zzz() {
        return this.jkjy_zzz;
    }
    public void setJkjy_zzz(String jkjy_zzz) {
        this.jkjy_zzz = jkjy_zzz;
    }
    public String getJkjy_jsrylb() {
        return this.jkjy_jsrylb;
    }
    public void setJkjy_jsrylb(String jkjy_jsrylb) {
        this.jkjy_jsrylb = jkjy_jsrylb;
    }
    public String getJkjy_jsrs() {
        return this.jkjy_jsrs;
    }
    public void setJkjy_jsrs(String jkjy_jsrs) {
        this.jkjy_jsrs = jkjy_jsrs;
    }
    public String getJkjy_zlffsl() {
        return this.jkjy_zlffsl;
    }
    public void setJkjy_zlffsl(String jkjy_zlffsl) {
        this.jkjy_zlffsl = jkjy_zlffsl;
    }
    public String getJkjy_hdnr() {
        return this.jkjy_hdnr;
    }
    public void setJkjy_hdnr(String jkjy_hdnr) {
        this.jkjy_hdnr = jkjy_hdnr;
    }
    public String getJkjy_zjpj() {
        return this.jkjy_zjpj;
    }
    public void setJkjy_zjpj(String jkjy_zjpj) {
        this.jkjy_zjpj = jkjy_zjpj;
    }
    public int getJkjy_cdcl() {
        return this.jkjy_cdcl;
    }
    public void setJkjy_cdcl(int jkjy_cdcl) {
        this.jkjy_cdcl = jkjy_cdcl;
    }
    public String getJkjy_tbr() {
        return this.jkjy_tbr;
    }
    public void setJkjy_tbr(String jkjy_tbr) {
        this.jkjy_tbr = jkjy_tbr;
    }
    public String getJkjy_fzr() {
        return this.jkjy_fzr;
    }
    public void setJkjy_fzr(String jkjy_fzr) {
        this.jkjy_fzr = jkjy_fzr;
    }
    public String getJkjy_tbrq() {
        return this.jkjy_tbrq;
    }
    public void setJkjy_tbrq(String jkjy_tbrq) {
        this.jkjy_tbrq = jkjy_tbrq;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
