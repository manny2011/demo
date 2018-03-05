package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Unique;

/**
 * Created by Administrator on 2018/1/29.
 * 居民表
 */
@Entity
public class Natives {
    @Id(autoincrement = true)
    private Long id;
    private String na_id;
    @NotNull
    private String na_number;
    @NotNull
    private String na_name;
    @NotNull
    private int na_sex;
    @NotNull
    private int na_age;
    @NotNull
    @Unique
    private String na_idcard;
    private String na_address;
    private String na_household;
    private String na_tel;
    private String na_birthday;
    private String na_country;
    private String na_villages;
    private String user_id;
    private String na_creattime;
    private String na_note;

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1751138081)
    public Natives(Long id, String na_id, @NotNull String na_number,
            @NotNull String na_name, int na_sex, int na_age,
            @NotNull String na_idcard, String na_address, String na_household,
            String na_tel, String na_birthday, String na_country,
            String na_villages, String user_id, String na_creattime, String na_note,
            String createDate) {
        this.id = id;
        this.na_id = na_id;
        this.na_number = na_number;
        this.na_name = na_name;
        this.na_sex = na_sex;
        this.na_age = na_age;
        this.na_idcard = na_idcard;
        this.na_address = na_address;
        this.na_household = na_household;
        this.na_tel = na_tel;
        this.na_birthday = na_birthday;
        this.na_country = na_country;
        this.na_villages = na_villages;
        this.user_id = user_id;
        this.na_creattime = na_creattime;
        this.na_note = na_note;
        this.createDate = createDate;
    }
    @Generated(hash = 1070649648)
    public Natives() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getNa_number() {
        return this.na_number;
    }
    public void setNa_number(String na_number) {
        this.na_number = na_number;
    }
    public String getNa_name() {
        return this.na_name;
    }
    public void setNa_name(String na_name) {
        this.na_name = na_name;
    }
    public int getNa_sex() {
        return this.na_sex;
    }
    public void setNa_sex(int na_sex) {
        this.na_sex = na_sex;
    }
    public int getNa_age() {
        return this.na_age;
    }
    public void setNa_age(int na_age) {
        this.na_age = na_age;
    }
    public String getNa_idcard() {
        return this.na_idcard;
    }
    public void setNa_idcard(String na_idcard) {
        this.na_idcard = na_idcard;
    }
    public String getNa_address() {
        return this.na_address;
    }
    public void setNa_address(String na_address) {
        this.na_address = na_address;
    }
    public String getNa_household() {
        return this.na_household;
    }
    public void setNa_household(String na_household) {
        this.na_household = na_household;
    }
    public String getNa_tel() {
        return this.na_tel;
    }
    public void setNa_tel(String na_tel) {
        this.na_tel = na_tel;
    }
    public String getNa_birthday() {
        return this.na_birthday;
    }
    public void setNa_birthday(String na_birthday) {
        this.na_birthday = na_birthday;
    }
    public String getNa_country() {
        return this.na_country;
    }
    public void setNa_country(String na_country) {
        this.na_country = na_country;
    }
    public String getNa_villages() {
        return this.na_villages;
    }
    public void setNa_villages(String na_villages) {
        this.na_villages = na_villages;
    }
    public String getUser_id() {
        return this.user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getNa_creattime() {
        return this.na_creattime;
    }
    public void setNa_creattime(String na_creattime) {
        this.na_creattime = na_creattime;
    }
    public String getNa_note() {
        return this.na_note;
    }
    public void setNa_note(String na_note) {
        this.na_note = na_note;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }


}
