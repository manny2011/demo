package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 城市表
 */
@Entity
public class City {
    @Id(autoincrement = true)
    private Long city_id;
    private String city_code;//
    private String city_name;//
    private String province_code;//

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 162631288)
    public City(Long city_id, String city_code, String city_name,
            String province_code, String createDate) {
        this.city_id = city_id;
        this.city_code = city_code;
        this.city_name = city_name;
        this.province_code = province_code;
        this.createDate = createDate;
    }
    @Generated(hash = 750791287)
    public City() {
    }
    public Long getCity_id() {
        return this.city_id;
    }
    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }
    public String getCity_code() {
        return this.city_code;
    }
    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }
    public String getCity_name() {
        return this.city_name;
    }
    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
    public String getProvince_code() {
        return this.province_code;
    }
    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
