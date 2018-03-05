package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 */
@Entity
public class User {
    @Id(autoincrement = true)
    private Long user_id;
    @NotNull
    private String user_name;
    @NotNull
    private String user_passport;
    @NotNull
    private String user_passward;
    @NotNull
    private int user_admin;//0普通用户 ,1超级管理员,2机构领导
    private int user_sex;
    private int user_age;
    private String user_birthday;
    private String user_idcard;
    private String user_email;
    private String user_tel;
    private String agency_id;
    private String user_login_date;
    private int user_type;
    private String note;

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 2141784750)
    public User(Long user_id, @NotNull String user_name,
            @NotNull String user_passport, @NotNull String user_passward,
            int user_admin, int user_sex, int user_age, String user_birthday,
            String user_idcard, String user_email, String user_tel,
            String agency_id, String user_login_date, int user_type, String note,
            String createDate) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_passport = user_passport;
        this.user_passward = user_passward;
        this.user_admin = user_admin;
        this.user_sex = user_sex;
        this.user_age = user_age;
        this.user_birthday = user_birthday;
        this.user_idcard = user_idcard;
        this.user_email = user_email;
        this.user_tel = user_tel;
        this.agency_id = agency_id;
        this.user_login_date = user_login_date;
        this.user_type = user_type;
        this.note = note;
        this.createDate = createDate;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getUser_id() {
        return this.user_id;
    }
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
    public String getUser_name() {
        return this.user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getUser_passport() {
        return this.user_passport;
    }
    public void setUser_passport(String user_passport) {
        this.user_passport = user_passport;
    }
    public String getUser_passward() {
        return this.user_passward;
    }
    public void setUser_passward(String user_passward) {
        this.user_passward = user_passward;
    }
    public int getUser_sex() {
        return this.user_sex;
    }
    public void setUser_sex(int user_sex) {
        this.user_sex = user_sex;
    }
    public int getUser_age() {
        return this.user_age;
    }
    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }
    public String getUser_birthday() {
        return this.user_birthday;
    }
    public void setUser_birthday(String user_birthday) {
        this.user_birthday = user_birthday;
    }
    public String getUser_idcard() {
        return this.user_idcard;
    }
    public void setUser_idcard(String user_idcard) {
        this.user_idcard = user_idcard;
    }
    public String getUser_email() {
        return this.user_email;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    public String getUser_tel() {
        return this.user_tel;
    }
    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }
    public String getAgency_id() {
        return this.agency_id;
    }
    public void setAgency_id(String agency_id) {
        this.agency_id = agency_id;
    }
    public String getUser_login_date() {
        return this.user_login_date;
    }
    public void setUser_login_date(String user_login_date) {
        this.user_login_date = user_login_date;
    }
    public int getUser_type() {
        return this.user_type;
    }
    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }
    public String getNote() {
        return this.note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public int getUser_admin() {
        return this.user_admin;
    }
    public void setUser_admin(int user_admin) {
        this.user_admin = user_admin;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
