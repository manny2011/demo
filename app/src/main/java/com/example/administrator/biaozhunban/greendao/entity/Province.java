package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 */
@Entity
public class Province {
    @Id(autoincrement = true)
    private Long province_id;
    private String province_code;
    private String province_name;

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 505375962)
    public Province(Long province_id, String province_code, String province_name,
            String createDate) {
        this.province_id = province_id;
        this.province_code = province_code;
        this.province_name = province_name;
        this.createDate = createDate;
    }
    @Generated(hash = 1309009906)
    public Province() {
    }
    public Long getProvince_id() {
        return this.province_id;
    }
    public void setProvince_id(Long province_id) {
        this.province_id = province_id;
    }
    public String getProvince_code() {
        return this.province_code;
    }
    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }
    public String getProvince_name() {
        return this.province_name;
    }
    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
