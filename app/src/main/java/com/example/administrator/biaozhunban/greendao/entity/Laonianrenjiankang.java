package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 */
@Entity
public class Laonianrenjiankang extends BaseEntity{
    @Id
    private Long id;
    @NotNull
    private String lnr_id;//老年人ID
    private String na_id;//居民id
    private String lnr_Evaluation_date;//评估日期
    private int lnr_The_meal;//进餐
    private int lnr_Freshen;//梳洗
    private int lnr_Dressing;//穿衣
    private int lnr_toilet;//如厕
    private int lnr_activity;//活动
    private int lnr_score;//总评分
    private String lnr_result;//整体评估

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 690411066)
    public Laonianrenjiankang(Long id, @NotNull String lnr_id, String na_id,
            String lnr_Evaluation_date, int lnr_The_meal, int lnr_Freshen,
            int lnr_Dressing, int lnr_toilet, int lnr_activity, int lnr_score,
            String lnr_result, String createDate) {
        this.id = id;
        this.lnr_id = lnr_id;
        this.na_id = na_id;
        this.lnr_Evaluation_date = lnr_Evaluation_date;
        this.lnr_The_meal = lnr_The_meal;
        this.lnr_Freshen = lnr_Freshen;
        this.lnr_Dressing = lnr_Dressing;
        this.lnr_toilet = lnr_toilet;
        this.lnr_activity = lnr_activity;
        this.lnr_score = lnr_score;
        this.lnr_result = lnr_result;
        this.createDate = createDate;
    }
    @Generated(hash = 36517934)
    public Laonianrenjiankang() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLnr_id() {
        return this.lnr_id;
    }
    public void setLnr_id(String lnr_id) {
        this.lnr_id = lnr_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getLnr_Evaluation_date() {
        return this.lnr_Evaluation_date;
    }
    public void setLnr_Evaluation_date(String lnr_Evaluation_date) {
        this.lnr_Evaluation_date = lnr_Evaluation_date;
    }
    public int getLnr_The_meal() {
        return this.lnr_The_meal;
    }
    public void setLnr_The_meal(int lnr_The_meal) {
        this.lnr_The_meal = lnr_The_meal;
    }
    public int getLnr_Freshen() {
        return this.lnr_Freshen;
    }
    public void setLnr_Freshen(int lnr_Freshen) {
        this.lnr_Freshen = lnr_Freshen;
    }
    public int getLnr_Dressing() {
        return this.lnr_Dressing;
    }
    public void setLnr_Dressing(int lnr_Dressing) {
        this.lnr_Dressing = lnr_Dressing;
    }
    public int getLnr_toilet() {
        return this.lnr_toilet;
    }
    public void setLnr_toilet(int lnr_toilet) {
        this.lnr_toilet = lnr_toilet;
    }
    public int getLnr_activity() {
        return this.lnr_activity;
    }
    public void setLnr_activity(int lnr_activity) {
        this.lnr_activity = lnr_activity;
    }
    public int getLnr_score() {
        return this.lnr_score;
    }
    public void setLnr_score(int lnr_score) {
        this.lnr_score = lnr_score;
    }
    public String getLnr_result() {
        return this.lnr_result;
    }
    public void setLnr_result(String lnr_result) {
        this.lnr_result = lnr_result;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
