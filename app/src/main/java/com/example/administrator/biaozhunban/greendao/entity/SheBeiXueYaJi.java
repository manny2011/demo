package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * '外接设备---血压计'
 */
@Entity
public class SheBeiXueYaJi {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String bp_id;//
    private String na_id;//居民Id
    private String equip_id;//设备id
    private String bp_sbp;//本次检测收缩压（俗称高压）
    private String bp_dbp;//本次检测舒张压（俗称低压）
    private String bp_heart;//心跳频率
    private String bp_time;//检测时间
    private int bp_score;//检测分数
    private int bp_health_state;//总状态 0健康 1亚健康 2不健康
    private int bp_sbp_state;//收缩压健康状态 0健康 1亚健康 2不健康
    private int bp_dbp_state;//舒张压健康状态 0健康 1亚健康 2不健康

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1564075660)
    public SheBeiXueYaJi(Long id, @NotNull String bp_id, String na_id,
            String equip_id, String bp_sbp, String bp_dbp, String bp_heart,
            String bp_time, int bp_score, int bp_health_state, int bp_sbp_state,
            int bp_dbp_state, String createDate) {
        this.id = id;
        this.bp_id = bp_id;
        this.na_id = na_id;
        this.equip_id = equip_id;
        this.bp_sbp = bp_sbp;
        this.bp_dbp = bp_dbp;
        this.bp_heart = bp_heart;
        this.bp_time = bp_time;
        this.bp_score = bp_score;
        this.bp_health_state = bp_health_state;
        this.bp_sbp_state = bp_sbp_state;
        this.bp_dbp_state = bp_dbp_state;
        this.createDate = createDate;
    }
    @Generated(hash = 1079550944)
    public SheBeiXueYaJi() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBp_id() {
        return this.bp_id;
    }
    public void setBp_id(String bp_id) {
        this.bp_id = bp_id;
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
    public String getBp_sbp() {
        return this.bp_sbp;
    }
    public void setBp_sbp(String bp_sbp) {
        this.bp_sbp = bp_sbp;
    }
    public String getBp_dbp() {
        return this.bp_dbp;
    }
    public void setBp_dbp(String bp_dbp) {
        this.bp_dbp = bp_dbp;
    }
    public String getBp_heart() {
        return this.bp_heart;
    }
    public void setBp_heart(String bp_heart) {
        this.bp_heart = bp_heart;
    }
    public String getBp_time() {
        return this.bp_time;
    }
    public void setBp_time(String bp_time) {
        this.bp_time = bp_time;
    }
    public int getBp_score() {
        return this.bp_score;
    }
    public void setBp_score(int bp_score) {
        this.bp_score = bp_score;
    }
    public int getBp_health_state() {
        return this.bp_health_state;
    }
    public void setBp_health_state(int bp_health_state) {
        this.bp_health_state = bp_health_state;
    }
    public int getBp_sbp_state() {
        return this.bp_sbp_state;
    }
    public void setBp_sbp_state(int bp_sbp_state) {
        this.bp_sbp_state = bp_sbp_state;
    }
    public int getBp_dbp_state() {
        return this.bp_dbp_state;
    }
    public void setBp_dbp_state(int bp_dbp_state) {
        this.bp_dbp_state = bp_dbp_state;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
