package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 外接设备---血糖
 */
@Entity
public class SheBeiXueTang {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String glu_id;//
    private String na_id;//居民Id
    private String equip_id;//设备id
    private String Fasting_glu;//空腹血糖值
    private String After_meal_glu;//餐后血糖值
    private String glu_thxhdb;//糖化血红蛋白百分比
    private String glu_time;//检查日期

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1972270986)
    public SheBeiXueTang(Long id, @NotNull String glu_id, String na_id,
            String equip_id, String Fasting_glu, String After_meal_glu,
            String glu_thxhdb, String glu_time, String createDate) {
        this.id = id;
        this.glu_id = glu_id;
        this.na_id = na_id;
        this.equip_id = equip_id;
        this.Fasting_glu = Fasting_glu;
        this.After_meal_glu = After_meal_glu;
        this.glu_thxhdb = glu_thxhdb;
        this.glu_time = glu_time;
        this.createDate = createDate;
    }
    @Generated(hash = 1696166242)
    public SheBeiXueTang() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGlu_id() {
        return this.glu_id;
    }
    public void setGlu_id(String glu_id) {
        this.glu_id = glu_id;
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
    public String getFasting_glu() {
        return this.Fasting_glu;
    }
    public void setFasting_glu(String Fasting_glu) {
        this.Fasting_glu = Fasting_glu;
    }
    public String getAfter_meal_glu() {
        return this.After_meal_glu;
    }
    public void setAfter_meal_glu(String After_meal_glu) {
        this.After_meal_glu = After_meal_glu;
    }
    public String getGlu_thxhdb() {
        return this.glu_thxhdb;
    }
    public void setGlu_thxhdb(String glu_thxhdb) {
        this.glu_thxhdb = glu_thxhdb;
    }
    public String getGlu_time() {
        return this.glu_time;
    }
    public void setGlu_time(String glu_time) {
        this.glu_time = glu_time;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
