package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 重性精神病患者'
 */
@Entity
public class Jingshenbinghuanzhe extends BaseEntity{
    @Id
    private Long id;
    @NotNull
    private String jsb_id;
    @NotNull
    private String na_id;//居民id
    private String jsb_jh_name;//监护人姓名
    private String jsb_jh_rela;//与患者关系
    private String jsb_jh_tel;//监护人电话
    private String jsb_jh_address;//监护人地址
    private String jsb_cwh_name;//村委会联系人姓名
    private String jsb_cwh_tel;//村委会联系人电话
    private int jsb_cwh_ifm;//村委会知情同意 0:同意参与管理 1：不同意
    private String jsb_cwh_sign;//签字
    private String jsb_cwh_signdata;//签字时间
    private String jsb_initial_data;//初次发病时间
    private int symptom_id;//既往主要症状表id
    private String jsb_past_outpa;//既往治疗-门诊
    private String jsb_past_firstdata;//既往治疗-首次抗精神病药治疗时间
    private int jsb_past_more;//既往治疗-住院次数
    private String jsb_current_result;//诊断结果
    private String jsb_current_job;//确诊医院
    private String jsb_current_data;//确诊日期
    private String jsb_current_effect;//最近一次治疗效果
    private int jsb_home;//对家庭社会的影响 0：无， 1：有
    private int jsb_home1;//轻度滋事次数
    private int jsb_home2;//肇事次数
    private int jsb_home3;//肇祸次数
    private int jsb_home4;//自伤次数
    private int jsb_home5;//自杀未遂次数
    private int jsb_lock;//关锁情况 0：无关锁， 1关锁，2关锁已解除
    private int jsb_money;//经济情况 0贫困，1非贫困 ， 2不详
    private String jsb_opinion;//专科医生意见
    private String jsb_data;//填表日期
    private String jsb_doctor;//医生签字

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1882727048)
    public Jingshenbinghuanzhe(Long id, @NotNull String jsb_id,
            @NotNull String na_id, String jsb_jh_name, String jsb_jh_rela,
            String jsb_jh_tel, String jsb_jh_address, String jsb_cwh_name,
            String jsb_cwh_tel, int jsb_cwh_ifm, String jsb_cwh_sign,
            String jsb_cwh_signdata, String jsb_initial_data, int symptom_id,
            String jsb_past_outpa, String jsb_past_firstdata, int jsb_past_more,
            String jsb_current_result, String jsb_current_job,
            String jsb_current_data, String jsb_current_effect, int jsb_home,
            int jsb_home1, int jsb_home2, int jsb_home3, int jsb_home4,
            int jsb_home5, int jsb_lock, int jsb_money, String jsb_opinion,
            String jsb_data, String jsb_doctor, String createDate) {
        this.id = id;
        this.jsb_id = jsb_id;
        this.na_id = na_id;
        this.jsb_jh_name = jsb_jh_name;
        this.jsb_jh_rela = jsb_jh_rela;
        this.jsb_jh_tel = jsb_jh_tel;
        this.jsb_jh_address = jsb_jh_address;
        this.jsb_cwh_name = jsb_cwh_name;
        this.jsb_cwh_tel = jsb_cwh_tel;
        this.jsb_cwh_ifm = jsb_cwh_ifm;
        this.jsb_cwh_sign = jsb_cwh_sign;
        this.jsb_cwh_signdata = jsb_cwh_signdata;
        this.jsb_initial_data = jsb_initial_data;
        this.symptom_id = symptom_id;
        this.jsb_past_outpa = jsb_past_outpa;
        this.jsb_past_firstdata = jsb_past_firstdata;
        this.jsb_past_more = jsb_past_more;
        this.jsb_current_result = jsb_current_result;
        this.jsb_current_job = jsb_current_job;
        this.jsb_current_data = jsb_current_data;
        this.jsb_current_effect = jsb_current_effect;
        this.jsb_home = jsb_home;
        this.jsb_home1 = jsb_home1;
        this.jsb_home2 = jsb_home2;
        this.jsb_home3 = jsb_home3;
        this.jsb_home4 = jsb_home4;
        this.jsb_home5 = jsb_home5;
        this.jsb_lock = jsb_lock;
        this.jsb_money = jsb_money;
        this.jsb_opinion = jsb_opinion;
        this.jsb_data = jsb_data;
        this.jsb_doctor = jsb_doctor;
        this.createDate = createDate;
    }
    @Generated(hash = 681176142)
    public Jingshenbinghuanzhe() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getJsb_id() {
        return this.jsb_id;
    }
    public void setJsb_id(String jsb_id) {
        this.jsb_id = jsb_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getJsb_jh_name() {
        return this.jsb_jh_name;
    }
    public void setJsb_jh_name(String jsb_jh_name) {
        this.jsb_jh_name = jsb_jh_name;
    }
    public String getJsb_jh_rela() {
        return this.jsb_jh_rela;
    }
    public void setJsb_jh_rela(String jsb_jh_rela) {
        this.jsb_jh_rela = jsb_jh_rela;
    }
    public String getJsb_jh_tel() {
        return this.jsb_jh_tel;
    }
    public void setJsb_jh_tel(String jsb_jh_tel) {
        this.jsb_jh_tel = jsb_jh_tel;
    }
    public String getJsb_jh_address() {
        return this.jsb_jh_address;
    }
    public void setJsb_jh_address(String jsb_jh_address) {
        this.jsb_jh_address = jsb_jh_address;
    }
    public String getJsb_cwh_name() {
        return this.jsb_cwh_name;
    }
    public void setJsb_cwh_name(String jsb_cwh_name) {
        this.jsb_cwh_name = jsb_cwh_name;
    }
    public String getJsb_cwh_tel() {
        return this.jsb_cwh_tel;
    }
    public void setJsb_cwh_tel(String jsb_cwh_tel) {
        this.jsb_cwh_tel = jsb_cwh_tel;
    }
    public int getJsb_cwh_ifm() {
        return this.jsb_cwh_ifm;
    }
    public void setJsb_cwh_ifm(int jsb_cwh_ifm) {
        this.jsb_cwh_ifm = jsb_cwh_ifm;
    }
    public String getJsb_cwh_sign() {
        return this.jsb_cwh_sign;
    }
    public void setJsb_cwh_sign(String jsb_cwh_sign) {
        this.jsb_cwh_sign = jsb_cwh_sign;
    }
    public String getJsb_cwh_signdata() {
        return this.jsb_cwh_signdata;
    }
    public void setJsb_cwh_signdata(String jsb_cwh_signdata) {
        this.jsb_cwh_signdata = jsb_cwh_signdata;
    }
    public String getJsb_initial_data() {
        return this.jsb_initial_data;
    }
    public void setJsb_initial_data(String jsb_initial_data) {
        this.jsb_initial_data = jsb_initial_data;
    }
    public int getSymptom_id() {
        return this.symptom_id;
    }
    public void setSymptom_id(int symptom_id) {
        this.symptom_id = symptom_id;
    }
    public String getJsb_past_outpa() {
        return this.jsb_past_outpa;
    }
    public void setJsb_past_outpa(String jsb_past_outpa) {
        this.jsb_past_outpa = jsb_past_outpa;
    }
    public String getJsb_past_firstdata() {
        return this.jsb_past_firstdata;
    }
    public void setJsb_past_firstdata(String jsb_past_firstdata) {
        this.jsb_past_firstdata = jsb_past_firstdata;
    }
    public int getJsb_past_more() {
        return this.jsb_past_more;
    }
    public void setJsb_past_more(int jsb_past_more) {
        this.jsb_past_more = jsb_past_more;
    }
    public String getJsb_current_result() {
        return this.jsb_current_result;
    }
    public void setJsb_current_result(String jsb_current_result) {
        this.jsb_current_result = jsb_current_result;
    }
    public String getJsb_current_job() {
        return this.jsb_current_job;
    }
    public void setJsb_current_job(String jsb_current_job) {
        this.jsb_current_job = jsb_current_job;
    }
    public String getJsb_current_data() {
        return this.jsb_current_data;
    }
    public void setJsb_current_data(String jsb_current_data) {
        this.jsb_current_data = jsb_current_data;
    }
    public String getJsb_current_effect() {
        return this.jsb_current_effect;
    }
    public void setJsb_current_effect(String jsb_current_effect) {
        this.jsb_current_effect = jsb_current_effect;
    }
    public int getJsb_home() {
        return this.jsb_home;
    }
    public void setJsb_home(int jsb_home) {
        this.jsb_home = jsb_home;
    }
    public int getJsb_home1() {
        return this.jsb_home1;
    }
    public void setJsb_home1(int jsb_home1) {
        this.jsb_home1 = jsb_home1;
    }
    public int getJsb_home2() {
        return this.jsb_home2;
    }
    public void setJsb_home2(int jsb_home2) {
        this.jsb_home2 = jsb_home2;
    }
    public int getJsb_home3() {
        return this.jsb_home3;
    }
    public void setJsb_home3(int jsb_home3) {
        this.jsb_home3 = jsb_home3;
    }
    public int getJsb_home4() {
        return this.jsb_home4;
    }
    public void setJsb_home4(int jsb_home4) {
        this.jsb_home4 = jsb_home4;
    }
    public int getJsb_home5() {
        return this.jsb_home5;
    }
    public void setJsb_home5(int jsb_home5) {
        this.jsb_home5 = jsb_home5;
    }
    public int getJsb_lock() {
        return this.jsb_lock;
    }
    public void setJsb_lock(int jsb_lock) {
        this.jsb_lock = jsb_lock;
    }
    public int getJsb_money() {
        return this.jsb_money;
    }
    public void setJsb_money(int jsb_money) {
        this.jsb_money = jsb_money;
    }
    public String getJsb_opinion() {
        return this.jsb_opinion;
    }
    public void setJsb_opinion(String jsb_opinion) {
        this.jsb_opinion = jsb_opinion;
    }
    public String getJsb_data() {
        return this.jsb_data;
    }
    public void setJsb_data(String jsb_data) {
        this.jsb_data = jsb_data;
    }
    public String getJsb_doctor() {
        return this.jsb_doctor;
    }
    public void setJsb_doctor(String jsb_doctor) {
        this.jsb_doctor = jsb_doctor;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
