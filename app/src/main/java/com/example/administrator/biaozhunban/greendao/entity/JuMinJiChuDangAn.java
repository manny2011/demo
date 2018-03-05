package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 城乡居民基础档案
 * 与GWJiWangJiZuShi表相关联的!
 */
@Entity
public class JuMinJiChuDangAn extends BaseEntity{
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String bs_id;//
    private String na_id;//居民id
    private String bs_othername;//其他联系人
    private String bs_othertel;//其他联系人电话
    private int bs_live_type;//常住类型 0户籍，1非户籍
    private int nation_id;//民族表id
    private int bs_blood_type;//血型  A,B,AB,O
    private int bs_rh;//RH阴性  0 是，1 否，2 不详
    private int bs_education;//文化程度
    private int bs_marriage;//婚姻状况
    private int bs_pay;//医疗费用支付方式
    private int bs_allergy;//药物过敏史
    private int bs_expose;//暴露史
    private int bs_disability;//残疾情况
    private int bs_genetic;//遗传病  0：无，1：有
    private String bs_disease_name;//遗传病名称
    private String bs_date;//建档日期
    private String bs_work;//工作单位
    private int bs_zhiy;//职业

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1838148617)
    public JuMinJiChuDangAn(Long id, @NotNull String bs_id, String na_id,
            String bs_othername, String bs_othertel, int bs_live_type,
            int nation_id, int bs_blood_type, int bs_rh, int bs_education,
            int bs_marriage, int bs_pay, int bs_allergy, int bs_expose,
            int bs_disability, int bs_genetic, String bs_disease_name,
            String bs_date, String bs_work, int bs_zhiy, String createDate) {
        this.id = id;
        this.bs_id = bs_id;
        this.na_id = na_id;
        this.bs_othername = bs_othername;
        this.bs_othertel = bs_othertel;
        this.bs_live_type = bs_live_type;
        this.nation_id = nation_id;
        this.bs_blood_type = bs_blood_type;
        this.bs_rh = bs_rh;
        this.bs_education = bs_education;
        this.bs_marriage = bs_marriage;
        this.bs_pay = bs_pay;
        this.bs_allergy = bs_allergy;
        this.bs_expose = bs_expose;
        this.bs_disability = bs_disability;
        this.bs_genetic = bs_genetic;
        this.bs_disease_name = bs_disease_name;
        this.bs_date = bs_date;
        this.bs_work = bs_work;
        this.bs_zhiy = bs_zhiy;
        this.createDate = createDate;
    }
    @Generated(hash = 1378103621)
    public JuMinJiChuDangAn() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBs_id() {
        return this.bs_id;
    }
    public void setBs_id(String bs_id) {
        this.bs_id = bs_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getBs_othername() {
        return this.bs_othername;
    }
    public void setBs_othername(String bs_othername) {
        this.bs_othername = bs_othername;
    }
    public String getBs_othertel() {
        return this.bs_othertel;
    }
    public void setBs_othertel(String bs_othertel) {
        this.bs_othertel = bs_othertel;
    }
    public int getBs_live_type() {
        return this.bs_live_type;
    }
    public void setBs_live_type(int bs_live_type) {
        this.bs_live_type = bs_live_type;
    }
    public int getNation_id() {
        return this.nation_id;
    }
    public void setNation_id(int nation_id) {
        this.nation_id = nation_id;
    }
    public int getBs_blood_type() {
        return this.bs_blood_type;
    }
    public void setBs_blood_type(int bs_blood_type) {
        this.bs_blood_type = bs_blood_type;
    }
    public int getBs_rh() {
        return this.bs_rh;
    }
    public void setBs_rh(int bs_rh) {
        this.bs_rh = bs_rh;
    }
    public int getBs_education() {
        return this.bs_education;
    }
    public void setBs_education(int bs_education) {
        this.bs_education = bs_education;
    }
    public int getBs_marriage() {
        return this.bs_marriage;
    }
    public void setBs_marriage(int bs_marriage) {
        this.bs_marriage = bs_marriage;
    }
    public int getBs_pay() {
        return this.bs_pay;
    }
    public void setBs_pay(int bs_pay) {
        this.bs_pay = bs_pay;
    }
    public int getBs_allergy() {
        return this.bs_allergy;
    }
    public void setBs_allergy(int bs_allergy) {
        this.bs_allergy = bs_allergy;
    }
    public int getBs_expose() {
        return this.bs_expose;
    }
    public void setBs_expose(int bs_expose) {
        this.bs_expose = bs_expose;
    }
    public int getBs_disability() {
        return this.bs_disability;
    }
    public void setBs_disability(int bs_disability) {
        this.bs_disability = bs_disability;
    }
    public int getBs_genetic() {
        return this.bs_genetic;
    }
    public void setBs_genetic(int bs_genetic) {
        this.bs_genetic = bs_genetic;
    }
    public String getBs_disease_name() {
        return this.bs_disease_name;
    }
    public void setBs_disease_name(String bs_disease_name) {
        this.bs_disease_name = bs_disease_name;
    }
    public String getBs_date() {
        return this.bs_date;
    }
    public void setBs_date(String bs_date) {
        this.bs_date = bs_date;
    }
    public String getBs_work() {
        return this.bs_work;
    }
    public void setBs_work(String bs_work) {
        this.bs_work = bs_work;
    }
    public int getBs_zhiy() {
        return this.bs_zhiy;
    }
    public void setBs_zhiy(int bs_zhiy) {
        this.bs_zhiy = bs_zhiy;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

}
