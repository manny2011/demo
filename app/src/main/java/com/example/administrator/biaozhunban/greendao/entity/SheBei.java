package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 外接设备
 */
@Entity
public class SheBei {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String equip_id;//设备ID
    private String equip_name;//仪器名
    private String equip_model;//仪器序号
    private String equip_type;//仪器类型
    private String equip_number;//序列号
    private int equip_qc;//质控  0不需要， 1需要
    private String equip_time;//安装日期
    private String equip_installer;//安装者
    private String equip_remark;//备注

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;


    @Generated(hash = 568154694)
    public SheBei(Long id, @NotNull String equip_id, String equip_name,
            String equip_model, String equip_type, String equip_number,
            int equip_qc, String equip_time, String equip_installer,
            String equip_remark, String createDate) {
        this.id = id;
        this.equip_id = equip_id;
        this.equip_name = equip_name;
        this.equip_model = equip_model;
        this.equip_type = equip_type;
        this.equip_number = equip_number;
        this.equip_qc = equip_qc;
        this.equip_time = equip_time;
        this.equip_installer = equip_installer;
        this.equip_remark = equip_remark;
        this.createDate = createDate;
    }
    @Generated(hash = 1235276475)
    public SheBei() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEquip_id() {
        return this.equip_id;
    }
    public void setEquip_id(String equip_id) {
        this.equip_id = equip_id;
    }
    public String getEquip_name() {
        return this.equip_name;
    }
    public void setEquip_name(String equip_name) {
        this.equip_name = equip_name;
    }
    public String getEquip_model() {
        return this.equip_model;
    }
    public void setEquip_model(String equip_model) {
        this.equip_model = equip_model;
    }
    public String getEquip_type() {
        return this.equip_type;
    }
    public void setEquip_type(String equip_type) {
        this.equip_type = equip_type;
    }
    public String getEquip_number() {
        return this.equip_number;
    }
    public void setEquip_number(String equip_number) {
        this.equip_number = equip_number;
    }
    public int getEquip_qc() {
        return this.equip_qc;
    }
    public void setEquip_qc(int equip_qc) {
        this.equip_qc = equip_qc;
    }
    public String getEquip_time() {
        return this.equip_time;
    }
    public void setEquip_time(String equip_time) {
        this.equip_time = equip_time;
    }
    public String getEquip_installer() {
        return this.equip_installer;
    }
    public void setEquip_installer(String equip_installer) {
        this.equip_installer = equip_installer;
    }
    public String getEquip_remark() {
        return this.equip_remark;
    }
    public void setEquip_remark(String equip_remark) {
        this.equip_remark = equip_remark;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
