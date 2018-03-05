package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 * 身高体重表
 */
@Entity
public class Shengaotizhong {
    @Id(autoincrement = true)
    private Long hw_id;
    @NotNull
    private String na_id;//居民
    private int yq_id;//身高体重秤ID
    private String height;
    private String weight;
    private String BMI;
    private String hw_time;//检测日期

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;


    @Generated(hash = 709189486)
    public Shengaotizhong(Long hw_id, @NotNull String na_id, int yq_id,
            String height, String weight, String BMI, String hw_time,
            String createDate) {
        this.hw_id = hw_id;
        this.na_id = na_id;
        this.yq_id = yq_id;
        this.height = height;
        this.weight = weight;
        this.BMI = BMI;
        this.hw_time = hw_time;
        this.createDate = createDate;
    }
    @Generated(hash = 127549121)
    public Shengaotizhong() {
    }
    public Long getHw_id() {
        return this.hw_id;
    }
    public void setHw_id(Long hw_id) {
        this.hw_id = hw_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public int getYq_id() {
        return this.yq_id;
    }
    public void setYq_id(int yq_id) {
        this.yq_id = yq_id;
    }
    public String getHeight() {
        return this.height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getWeight() {
        return this.weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getBMI() {
        return this.BMI;
    }
    public void setBMI(String BMI) {
        this.BMI = BMI;
    }
    public String getHw_time() {
        return this.hw_time;
    }
    public void setHw_time(String hw_time) {
        this.hw_time = hw_time;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }


}
