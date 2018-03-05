package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 外接设备---尿检
 */
@Entity
public class SheBeiNiaoJian {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String urine_id;//
    private String na_id;//居民Id
    private String equip_id;//设备id
    private String urine_time;//检测时间

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1185464531)
    public SheBeiNiaoJian(Long id, @NotNull String urine_id, String na_id,
            String equip_id, String urine_time, String createDate) {
        this.id = id;
        this.urine_id = urine_id;
        this.na_id = na_id;
        this.equip_id = equip_id;
        this.urine_time = urine_time;
        this.createDate = createDate;
    }
    @Generated(hash = 1954168665)
    public SheBeiNiaoJian() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUrine_id() {
        return this.urine_id;
    }
    public void setUrine_id(String urine_id) {
        this.urine_id = urine_id;
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
    public String getUrine_time() {
        return this.urine_time;
    }
    public void setUrine_time(String urine_time) {
        this.urine_time = urine_time;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
