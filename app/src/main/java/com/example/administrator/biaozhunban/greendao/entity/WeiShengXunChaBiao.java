package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/30.
 * 卫生巡查表
 */
@Entity
public class WeiShengXunChaBiao implements Serializable{
    private static final long serialVersionUID = -4096264428681246488L;
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String wsxc_id;//卫生巡查id
    private String wsxc_yljg;//医疗机构名称
    private String wsxc_nd;//年度
    private String wsxc_ddhnr;//巡查地点与内容
    private String wsxc_zywt;//发现的主要问题
    private String wsxc_rq;//巡查日期
    private String wsxc_xcr;//巡查人
    private String wsxc_note;//备注

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1925976112)
    public WeiShengXunChaBiao(Long id, @NotNull String wsxc_id, String wsxc_yljg,
            String wsxc_nd, String wsxc_ddhnr, String wsxc_zywt, String wsxc_rq,
            String wsxc_xcr, String wsxc_note, String createDate) {
        this.id = id;
        this.wsxc_id = wsxc_id;
        this.wsxc_yljg = wsxc_yljg;
        this.wsxc_nd = wsxc_nd;
        this.wsxc_ddhnr = wsxc_ddhnr;
        this.wsxc_zywt = wsxc_zywt;
        this.wsxc_rq = wsxc_rq;
        this.wsxc_xcr = wsxc_xcr;
        this.wsxc_note = wsxc_note;
        this.createDate = createDate;
    }
    @Generated(hash = 1236739014)
    public WeiShengXunChaBiao() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getWsxc_id() {
        return this.wsxc_id;
    }
    public void setWsxc_id(String wsxc_id) {
        this.wsxc_id = wsxc_id;
    }
    public String getWsxc_yljg() {
        return this.wsxc_yljg;
    }
    public void setWsxc_yljg(String wsxc_yljg) {
        this.wsxc_yljg = wsxc_yljg;
    }
    public String getWsxc_nd() {
        return this.wsxc_nd;
    }
    public void setWsxc_nd(String wsxc_nd) {
        this.wsxc_nd = wsxc_nd;
    }
    public String getWsxc_ddhnr() {
        return this.wsxc_ddhnr;
    }
    public void setWsxc_ddhnr(String wsxc_ddhnr) {
        this.wsxc_ddhnr = wsxc_ddhnr;
    }
    public String getWsxc_zywt() {
        return this.wsxc_zywt;
    }
    public void setWsxc_zywt(String wsxc_zywt) {
        this.wsxc_zywt = wsxc_zywt;
    }
    public String getWsxc_rq() {
        return this.wsxc_rq;
    }
    public void setWsxc_rq(String wsxc_rq) {
        this.wsxc_rq = wsxc_rq;
    }
    public String getWsxc_xcr() {
        return this.wsxc_xcr;
    }
    public void setWsxc_xcr(String wsxc_xcr) {
        this.wsxc_xcr = wsxc_xcr;
    }
    public String getWsxc_note() {
        return this.wsxc_note;
    }
    public void setWsxc_note(String wsxc_note) {
        this.wsxc_note = wsxc_note;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
