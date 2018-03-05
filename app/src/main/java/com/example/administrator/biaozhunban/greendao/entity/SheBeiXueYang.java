package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 外接设备---血氧
 */
@Entity
public class SheBeiXueYang {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String spo_id;//
    private String na_id;//居民Id
    private String equip_id;//设备id
    private String spo_pulse;//脉率
    private String spo_saturation;//血氧饱和度
    private String spo_score;//分数
    private String spo_time;//检测时间

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1840832915)
    public SheBeiXueYang(Long id, @NotNull String spo_id, String na_id,
            String equip_id, String spo_pulse, String spo_saturation,
            String spo_score, String spo_time, String createDate) {
        this.id = id;
        this.spo_id = spo_id;
        this.na_id = na_id;
        this.equip_id = equip_id;
        this.spo_pulse = spo_pulse;
        this.spo_saturation = spo_saturation;
        this.spo_score = spo_score;
        this.spo_time = spo_time;
        this.createDate = createDate;
    }
    @Generated(hash = 982374838)
    public SheBeiXueYang() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSpo_id() {
        return this.spo_id;
    }
    public void setSpo_id(String spo_id) {
        this.spo_id = spo_id;
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
    public String getSpo_pulse() {
        return this.spo_pulse;
    }
    public void setSpo_pulse(String spo_pulse) {
        this.spo_pulse = spo_pulse;
    }
    public String getSpo_saturation() {
        return this.spo_saturation;
    }
    public void setSpo_saturation(String spo_saturation) {
        this.spo_saturation = spo_saturation;
    }
    public String getSpo_score() {
        return this.spo_score;
    }
    public void setSpo_score(String spo_score) {
        this.spo_score = spo_score;
    }
    public String getSpo_time() {
        return this.spo_time;
    }
    public void setSpo_time(String spo_time) {
        this.spo_time = spo_time;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
