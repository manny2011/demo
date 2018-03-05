package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 血红蛋白
 */
@Entity
public class XueHongDanBai {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String xhdb_id;//血红蛋白ID
    private String xhdb_num;//血红蛋白数值
    private String equip_id;//仪器表ID
    private String na_id;//居民id
    private String xhdb_time;//检测时间

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 333459268)
    public XueHongDanBai(Long id, @NotNull String xhdb_id, String xhdb_num,
            String equip_id, String na_id, String xhdb_time, String createDate) {
        this.id = id;
        this.xhdb_id = xhdb_id;
        this.xhdb_num = xhdb_num;
        this.equip_id = equip_id;
        this.na_id = na_id;
        this.xhdb_time = xhdb_time;
        this.createDate = createDate;
    }
    @Generated(hash = 1555763331)
    public XueHongDanBai() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getXhdb_id() {
        return this.xhdb_id;
    }
    public void setXhdb_id(String xhdb_id) {
        this.xhdb_id = xhdb_id;
    }
    public String getXhdb_num() {
        return this.xhdb_num;
    }
    public void setXhdb_num(String xhdb_num) {
        this.xhdb_num = xhdb_num;
    }
    public String getEquip_id() {
        return this.equip_id;
    }
    public void setEquip_id(String equip_id) {
        this.equip_id = equip_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getXhdb_time() {
        return this.xhdb_time;
    }
    public void setXhdb_time(String xhdb_time) {
        this.xhdb_time = xhdb_time;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
