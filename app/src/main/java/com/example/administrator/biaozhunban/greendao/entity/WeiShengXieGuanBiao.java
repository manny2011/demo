package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/30.
 * 卫生监督协管服务'
 */
@Entity
public class WeiShengXieGuanBiao implements Serializable {
    private static final long serialVersionUID = -4361310611687523069L;
    @Id(autoincrement = true)
    private Long id;
    private String wsxx_id;//卫生监督协管服务ID
    private String wsxx_yljg;//医疗机构名称
    private String wsxx_fxsj;//发现时间
    private int wsxx_xxlb;//信息类别
    private String wsxx_xxnr;//信息内容
    private String wsxx_bgsj;//报告时间
    private String wsxx_bgr;//报告人

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1406895766)
    public WeiShengXieGuanBiao(Long id, String wsxx_id, String wsxx_yljg,
            String wsxx_fxsj, int wsxx_xxlb, String wsxx_xxnr, String wsxx_bgsj,
            String wsxx_bgr, String createDate) {
        this.id = id;
        this.wsxx_id = wsxx_id;
        this.wsxx_yljg = wsxx_yljg;
        this.wsxx_fxsj = wsxx_fxsj;
        this.wsxx_xxlb = wsxx_xxlb;
        this.wsxx_xxnr = wsxx_xxnr;
        this.wsxx_bgsj = wsxx_bgsj;
        this.wsxx_bgr = wsxx_bgr;
        this.createDate = createDate;
    }
    @Generated(hash = 1430348077)
    public WeiShengXieGuanBiao() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getWsxx_id() {
        return this.wsxx_id;
    }
    public void setWsxx_id(String wsxx_id) {
        this.wsxx_id = wsxx_id;
    }
    public String getWsxx_yljg() {
        return this.wsxx_yljg;
    }
    public void setWsxx_yljg(String wsxx_yljg) {
        this.wsxx_yljg = wsxx_yljg;
    }
    public String getWsxx_fxsj() {
        return this.wsxx_fxsj;
    }
    public void setWsxx_fxsj(String wsxx_fxsj) {
        this.wsxx_fxsj = wsxx_fxsj;
    }
    public int getWsxx_xxlb() {
        return this.wsxx_xxlb;
    }
    public void setWsxx_xxlb(int wsxx_xxlb) {
        this.wsxx_xxlb = wsxx_xxlb;
    }
    public String getWsxx_xxnr() {
        return this.wsxx_xxnr;
    }
    public void setWsxx_xxnr(String wsxx_xxnr) {
        this.wsxx_xxnr = wsxx_xxnr;
    }
    public String getWsxx_bgsj() {
        return this.wsxx_bgsj;
    }
    public void setWsxx_bgsj(String wsxx_bgsj) {
        this.wsxx_bgsj = wsxx_bgsj;
    }
    public String getWsxx_bgr() {
        return this.wsxx_bgr;
    }
    public void setWsxx_bgr(String wsxx_bgr) {
        this.wsxx_bgr = wsxx_bgr;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
