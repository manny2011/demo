package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 外接设备---体温
 */
@Entity
public class SheBeiTiWen {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String temp_id;//体温ID
    private String na_id;//居民Id
    private String equip_id;//设备id
    private String temp_num;//体温值℃
    private String temp_time;//检测时间

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 276696227)
    public SheBeiTiWen(Long id, @NotNull String temp_id, String na_id,
            String equip_id, String temp_num, String temp_time, String createDate) {
        this.id = id;
        this.temp_id = temp_id;
        this.na_id = na_id;
        this.equip_id = equip_id;
        this.temp_num = temp_num;
        this.temp_time = temp_time;
        this.createDate = createDate;
    }
    @Generated(hash = 1036472644)
    public SheBeiTiWen() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTemp_id() {
        return this.temp_id;
    }
    public void setTemp_id(String temp_id) {
        this.temp_id = temp_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getEquip_id() {
        return this.equip_id;
    }
    public void setEquip_id(String equip_id) {
        this.equip_id = equip_id;
    }
    public String getTemp_num() {
        return this.temp_num;
    }
    public void setTemp_num(String temp_num) {
        this.temp_num = temp_num;
    }
    public String getTemp_time() {
        return this.temp_time;
    }
    public void setTemp_time(String temp_time) {
        this.temp_time = temp_time;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
