package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 医疗机构表
 */
@Entity
public class Agency {
    @Id(autoincrement = true)
    private Long id;
    private String agency_id;//机构id
    private String agency_name;//机构名称
    private String agency_tel;//机构电话
    private String agency_address;//机构地址
    private String province_code;//省
    private String city_code;//市
    private String area_code;//医疗机构所在区县 id
    private String note;//备注

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1214784966)
    public Agency(Long id, String agency_id, String agency_name, String agency_tel,
            String agency_address, String province_code, String city_code,
            String area_code, String note, String createDate) {
        this.id = id;
        this.agency_id = agency_id;
        this.agency_name = agency_name;
        this.agency_tel = agency_tel;
        this.agency_address = agency_address;
        this.province_code = province_code;
        this.city_code = city_code;
        this.area_code = area_code;
        this.note = note;
        this.createDate = createDate;
    }
    @Generated(hash = 1434236926)
    public Agency() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getAgency_id() {
        return this.agency_id;
    }
    public void setAgency_id(String agency_id) {
        this.agency_id = agency_id;
    }
    public String getAgency_name() {
        return this.agency_name;
    }
    public void setAgency_name(String agency_name) {
        this.agency_name = agency_name;
    }
    public String getAgency_tel() {
        return this.agency_tel;
    }
    public void setAgency_tel(String agency_tel) {
        this.agency_tel = agency_tel;
    }
    public String getAgency_address() {
        return this.agency_address;
    }
    public void setAgency_address(String agency_address) {
        this.agency_address = agency_address;
    }
    public String getProvince_code() {
        return this.province_code;
    }
    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }
    public String getCity_code() {
        return this.city_code;
    }
    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }
    public String getArea_code() {
        return this.area_code;
    }
    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }
    public String getNote() {
        return this.note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
