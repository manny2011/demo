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
public class Jingshenbingjilu extends BaseEntity{
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String jsb_f_id;//疾病记录ID
    @NotNull
    private String na_id;//居民id
    private String jsb_f_data;//本次随访日期
    private int jsb_f_danger;//危险性 0-5级
    private int symptom_id;//目前症状表Id
    private int jsb_f_insight;//自知力 0自知力完全，1自知力不全，2自知力缺失
    private int jsb_f_sleep;//睡眠情况 0良好， 1一般， 2较差
    private int jsb_f_diet;//饮食情况 0良好， 1一般， 2较差
    private int jsb_f_life;//个人生活料理 0良好， 1一般， 2较差
    private int jsb_f_labour;//家务劳动 0良好， 1一般， 2较差
    private int jsb_f_work;//生产劳动及工作 0良好， 1一般， 2较差，3此项不适用
    private int jsb_f_study;//学习能力 0良好， 1一般， 2较差
    private int jsb_f_world;//社会人际关系 0良好， 1一般， 2较差
    private int jsb_f_home;//患者对家庭社会的影响 0：无， 1：有
    private int jsb_f_home1;//轻度滋事次数
    private int jsb_f_home2;//肇事次数
    private int jsb_f_home3;//肇祸次数
    private int jsb_f_home4;//自伤次数
    private int jsb_f_home5;//自杀未遂次数
    private int jsb_f_lock;//关锁情况 0：无关锁， 1关锁，2关锁已解除
    private int jsb_f_leave;//住院情况 0从未住院，1正在住院，2既往住院,现未住院
    private String jsb_f_lastdata;//末次出院时间
    private int jsb_f_lab;//实验室检查 0：无， 1：有
    private String jsb_f_lab_detail;//实验室检查描述
    private int jsb_f_rct;//药物不良反应 0：无， 1：有
    private String jsb_f_rct_detail;//药物不良反应描述
    private int jsb_f_dose;//服药依从性 0规律，  1间断，  2不服药
    private int jsb_f_effect;//治疗效果 0痊愈，  1好转，  2无变化，  3加重
    private int jsb_f_referral;//是否转诊 0 否，  1 是
    private String jsb_f_rf_cause;//转诊原因
    private String jsb_f_rf_detail;//转诊至机构及科室
    private String jsb_f_drug1;//用药情况  药品1-名称
    private String jsb_f_drug1_num;//药品1-用法 每日(月) --次
    private String jsb_f_drug1_amount;//药品1-每次剂量--mg
    private String jsb_f_drug2;//用药情况  药品2-名称
    private String jsb_f_drug2_num;//药品2-用法 每日(月) --次
    private String jsb_f_drug2_amount;//药品2-每次剂量--mg
    private String jsb_f_drug3;//用药情况  药品3-名称
    private String jsb_f_drug3_num;//药品3-用法 每日(月) --次
    private String jsb_f_drug3_amount;//药品3-每次剂量--mg
    private int jsb_f_step;//康复措施 0生活劳动能力， 1职业训练， 2学习能力， 3社会交往， 4其他
    private int jsb_f_type;//本次随访分类 0不稳定， 1基本稳定， 2稳定， 3未访到
    private String jsb_f_nextdata;//下次随访日期
    private String jsb_f_doctor;//随访医生签名

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1331959043)
    public Jingshenbingjilu(Long id, @NotNull String jsb_f_id,
            @NotNull String na_id, String jsb_f_data, int jsb_f_danger,
            int symptom_id, int jsb_f_insight, int jsb_f_sleep, int jsb_f_diet,
            int jsb_f_life, int jsb_f_labour, int jsb_f_work, int jsb_f_study,
            int jsb_f_world, int jsb_f_home, int jsb_f_home1, int jsb_f_home2,
            int jsb_f_home3, int jsb_f_home4, int jsb_f_home5, int jsb_f_lock,
            int jsb_f_leave, String jsb_f_lastdata, int jsb_f_lab,
            String jsb_f_lab_detail, int jsb_f_rct, String jsb_f_rct_detail,
            int jsb_f_dose, int jsb_f_effect, int jsb_f_referral,
            String jsb_f_rf_cause, String jsb_f_rf_detail, String jsb_f_drug1,
            String jsb_f_drug1_num, String jsb_f_drug1_amount, String jsb_f_drug2,
            String jsb_f_drug2_num, String jsb_f_drug2_amount, String jsb_f_drug3,
            String jsb_f_drug3_num, String jsb_f_drug3_amount, int jsb_f_step,
            int jsb_f_type, String jsb_f_nextdata, String jsb_f_doctor,
            String createDate) {
        this.id = id;
        this.jsb_f_id = jsb_f_id;
        this.na_id = na_id;
        this.jsb_f_data = jsb_f_data;
        this.jsb_f_danger = jsb_f_danger;
        this.symptom_id = symptom_id;
        this.jsb_f_insight = jsb_f_insight;
        this.jsb_f_sleep = jsb_f_sleep;
        this.jsb_f_diet = jsb_f_diet;
        this.jsb_f_life = jsb_f_life;
        this.jsb_f_labour = jsb_f_labour;
        this.jsb_f_work = jsb_f_work;
        this.jsb_f_study = jsb_f_study;
        this.jsb_f_world = jsb_f_world;
        this.jsb_f_home = jsb_f_home;
        this.jsb_f_home1 = jsb_f_home1;
        this.jsb_f_home2 = jsb_f_home2;
        this.jsb_f_home3 = jsb_f_home3;
        this.jsb_f_home4 = jsb_f_home4;
        this.jsb_f_home5 = jsb_f_home5;
        this.jsb_f_lock = jsb_f_lock;
        this.jsb_f_leave = jsb_f_leave;
        this.jsb_f_lastdata = jsb_f_lastdata;
        this.jsb_f_lab = jsb_f_lab;
        this.jsb_f_lab_detail = jsb_f_lab_detail;
        this.jsb_f_rct = jsb_f_rct;
        this.jsb_f_rct_detail = jsb_f_rct_detail;
        this.jsb_f_dose = jsb_f_dose;
        this.jsb_f_effect = jsb_f_effect;
        this.jsb_f_referral = jsb_f_referral;
        this.jsb_f_rf_cause = jsb_f_rf_cause;
        this.jsb_f_rf_detail = jsb_f_rf_detail;
        this.jsb_f_drug1 = jsb_f_drug1;
        this.jsb_f_drug1_num = jsb_f_drug1_num;
        this.jsb_f_drug1_amount = jsb_f_drug1_amount;
        this.jsb_f_drug2 = jsb_f_drug2;
        this.jsb_f_drug2_num = jsb_f_drug2_num;
        this.jsb_f_drug2_amount = jsb_f_drug2_amount;
        this.jsb_f_drug3 = jsb_f_drug3;
        this.jsb_f_drug3_num = jsb_f_drug3_num;
        this.jsb_f_drug3_amount = jsb_f_drug3_amount;
        this.jsb_f_step = jsb_f_step;
        this.jsb_f_type = jsb_f_type;
        this.jsb_f_nextdata = jsb_f_nextdata;
        this.jsb_f_doctor = jsb_f_doctor;
        this.createDate = createDate;
    }
    @Generated(hash = 1964538774)
    public Jingshenbingjilu() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getJsb_f_id() {
        return this.jsb_f_id;
    }
    public void setJsb_f_id(String jsb_f_id) {
        this.jsb_f_id = jsb_f_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getJsb_f_data() {
        return this.jsb_f_data;
    }
    public void setJsb_f_data(String jsb_f_data) {
        this.jsb_f_data = jsb_f_data;
    }
    public int getJsb_f_danger() {
        return this.jsb_f_danger;
    }
    public void setJsb_f_danger(int jsb_f_danger) {
        this.jsb_f_danger = jsb_f_danger;
    }
    public int getSymptom_id() {
        return this.symptom_id;
    }
    public void setSymptom_id(int symptom_id) {
        this.symptom_id = symptom_id;
    }
    public int getJsb_f_insight() {
        return this.jsb_f_insight;
    }
    public void setJsb_f_insight(int jsb_f_insight) {
        this.jsb_f_insight = jsb_f_insight;
    }
    public int getJsb_f_sleep() {
        return this.jsb_f_sleep;
    }
    public void setJsb_f_sleep(int jsb_f_sleep) {
        this.jsb_f_sleep = jsb_f_sleep;
    }
    public int getJsb_f_diet() {
        return this.jsb_f_diet;
    }
    public void setJsb_f_diet(int jsb_f_diet) {
        this.jsb_f_diet = jsb_f_diet;
    }
    public int getJsb_f_life() {
        return this.jsb_f_life;
    }
    public void setJsb_f_life(int jsb_f_life) {
        this.jsb_f_life = jsb_f_life;
    }
    public int getJsb_f_labour() {
        return this.jsb_f_labour;
    }
    public void setJsb_f_labour(int jsb_f_labour) {
        this.jsb_f_labour = jsb_f_labour;
    }
    public int getJsb_f_work() {
        return this.jsb_f_work;
    }
    public void setJsb_f_work(int jsb_f_work) {
        this.jsb_f_work = jsb_f_work;
    }
    public int getJsb_f_study() {
        return this.jsb_f_study;
    }
    public void setJsb_f_study(int jsb_f_study) {
        this.jsb_f_study = jsb_f_study;
    }
    public int getJsb_f_world() {
        return this.jsb_f_world;
    }
    public void setJsb_f_world(int jsb_f_world) {
        this.jsb_f_world = jsb_f_world;
    }
    public int getJsb_f_home() {
        return this.jsb_f_home;
    }
    public void setJsb_f_home(int jsb_f_home) {
        this.jsb_f_home = jsb_f_home;
    }
    public int getJsb_f_home1() {
        return this.jsb_f_home1;
    }
    public void setJsb_f_home1(int jsb_f_home1) {
        this.jsb_f_home1 = jsb_f_home1;
    }
    public int getJsb_f_home2() {
        return this.jsb_f_home2;
    }
    public void setJsb_f_home2(int jsb_f_home2) {
        this.jsb_f_home2 = jsb_f_home2;
    }
    public int getJsb_f_home3() {
        return this.jsb_f_home3;
    }
    public void setJsb_f_home3(int jsb_f_home3) {
        this.jsb_f_home3 = jsb_f_home3;
    }
    public int getJsb_f_home4() {
        return this.jsb_f_home4;
    }
    public void setJsb_f_home4(int jsb_f_home4) {
        this.jsb_f_home4 = jsb_f_home4;
    }
    public int getJsb_f_home5() {
        return this.jsb_f_home5;
    }
    public void setJsb_f_home5(int jsb_f_home5) {
        this.jsb_f_home5 = jsb_f_home5;
    }
    public int getJsb_f_lock() {
        return this.jsb_f_lock;
    }
    public void setJsb_f_lock(int jsb_f_lock) {
        this.jsb_f_lock = jsb_f_lock;
    }
    public int getJsb_f_leave() {
        return this.jsb_f_leave;
    }
    public void setJsb_f_leave(int jsb_f_leave) {
        this.jsb_f_leave = jsb_f_leave;
    }
    public String getJsb_f_lastdata() {
        return this.jsb_f_lastdata;
    }
    public void setJsb_f_lastdata(String jsb_f_lastdata) {
        this.jsb_f_lastdata = jsb_f_lastdata;
    }
    public int getJsb_f_lab() {
        return this.jsb_f_lab;
    }
    public void setJsb_f_lab(int jsb_f_lab) {
        this.jsb_f_lab = jsb_f_lab;
    }
    public String getJsb_f_lab_detail() {
        return this.jsb_f_lab_detail;
    }
    public void setJsb_f_lab_detail(String jsb_f_lab_detail) {
        this.jsb_f_lab_detail = jsb_f_lab_detail;
    }
    public int getJsb_f_rct() {
        return this.jsb_f_rct;
    }
    public void setJsb_f_rct(int jsb_f_rct) {
        this.jsb_f_rct = jsb_f_rct;
    }
    public String getJsb_f_rct_detail() {
        return this.jsb_f_rct_detail;
    }
    public void setJsb_f_rct_detail(String jsb_f_rct_detail) {
        this.jsb_f_rct_detail = jsb_f_rct_detail;
    }
    public int getJsb_f_dose() {
        return this.jsb_f_dose;
    }
    public void setJsb_f_dose(int jsb_f_dose) {
        this.jsb_f_dose = jsb_f_dose;
    }
    public int getJsb_f_effect() {
        return this.jsb_f_effect;
    }
    public void setJsb_f_effect(int jsb_f_effect) {
        this.jsb_f_effect = jsb_f_effect;
    }
    public int getJsb_f_referral() {
        return this.jsb_f_referral;
    }
    public void setJsb_f_referral(int jsb_f_referral) {
        this.jsb_f_referral = jsb_f_referral;
    }
    public String getJsb_f_rf_cause() {
        return this.jsb_f_rf_cause;
    }
    public void setJsb_f_rf_cause(String jsb_f_rf_cause) {
        this.jsb_f_rf_cause = jsb_f_rf_cause;
    }
    public String getJsb_f_rf_detail() {
        return this.jsb_f_rf_detail;
    }
    public void setJsb_f_rf_detail(String jsb_f_rf_detail) {
        this.jsb_f_rf_detail = jsb_f_rf_detail;
    }
    public String getJsb_f_drug1() {
        return this.jsb_f_drug1;
    }
    public void setJsb_f_drug1(String jsb_f_drug1) {
        this.jsb_f_drug1 = jsb_f_drug1;
    }
    public String getJsb_f_drug1_num() {
        return this.jsb_f_drug1_num;
    }
    public void setJsb_f_drug1_num(String jsb_f_drug1_num) {
        this.jsb_f_drug1_num = jsb_f_drug1_num;
    }
    public String getJsb_f_drug1_amount() {
        return this.jsb_f_drug1_amount;
    }
    public void setJsb_f_drug1_amount(String jsb_f_drug1_amount) {
        this.jsb_f_drug1_amount = jsb_f_drug1_amount;
    }
    public String getJsb_f_drug2() {
        return this.jsb_f_drug2;
    }
    public void setJsb_f_drug2(String jsb_f_drug2) {
        this.jsb_f_drug2 = jsb_f_drug2;
    }
    public String getJsb_f_drug2_num() {
        return this.jsb_f_drug2_num;
    }
    public void setJsb_f_drug2_num(String jsb_f_drug2_num) {
        this.jsb_f_drug2_num = jsb_f_drug2_num;
    }
    public String getJsb_f_drug2_amount() {
        return this.jsb_f_drug2_amount;
    }
    public void setJsb_f_drug2_amount(String jsb_f_drug2_amount) {
        this.jsb_f_drug2_amount = jsb_f_drug2_amount;
    }
    public String getJsb_f_drug3() {
        return this.jsb_f_drug3;
    }
    public void setJsb_f_drug3(String jsb_f_drug3) {
        this.jsb_f_drug3 = jsb_f_drug3;
    }
    public String getJsb_f_drug3_num() {
        return this.jsb_f_drug3_num;
    }
    public void setJsb_f_drug3_num(String jsb_f_drug3_num) {
        this.jsb_f_drug3_num = jsb_f_drug3_num;
    }
    public String getJsb_f_drug3_amount() {
        return this.jsb_f_drug3_amount;
    }
    public void setJsb_f_drug3_amount(String jsb_f_drug3_amount) {
        this.jsb_f_drug3_amount = jsb_f_drug3_amount;
    }
    public int getJsb_f_step() {
        return this.jsb_f_step;
    }
    public void setJsb_f_step(int jsb_f_step) {
        this.jsb_f_step = jsb_f_step;
    }
    public int getJsb_f_type() {
        return this.jsb_f_type;
    }
    public void setJsb_f_type(int jsb_f_type) {
        this.jsb_f_type = jsb_f_type;
    }
    public String getJsb_f_nextdata() {
        return this.jsb_f_nextdata;
    }
    public void setJsb_f_nextdata(String jsb_f_nextdata) {
        this.jsb_f_nextdata = jsb_f_nextdata;
    }
    public String getJsb_f_doctor() {
        return this.jsb_f_doctor;
    }
    public void setJsb_f_doctor(String jsb_f_doctor) {
        this.jsb_f_doctor = jsb_f_doctor;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
