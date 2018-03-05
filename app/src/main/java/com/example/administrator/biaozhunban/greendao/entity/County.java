package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 县区表
 */
@Entity
public class County {
    @Id(autoincrement = true)
    private Long area_id;
    private String area_code;//
    private String area_name;//区县
    private String city_code;//市code

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 75684566)
    public County(Long area_id, String area_code, String area_name,
            String city_code, String createDate) {
        this.area_id = area_id;
        this.area_code = area_code;
        this.area_name = area_name;
        this.city_code = city_code;
        this.createDate = createDate;
    }
    @Generated(hash = 1991272252)
    public County() {
    }
    public Long getArea_id() {
        return this.area_id;
    }
    public void setArea_id(Long area_id) {
        this.area_id = area_id;
    }
    public String getArea_code() {
        return this.area_code;
    }
    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }
    public String getArea_name() {
        return this.area_name;
    }
    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }
    public String getCity_code() {
        return this.city_code;
    }
    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
