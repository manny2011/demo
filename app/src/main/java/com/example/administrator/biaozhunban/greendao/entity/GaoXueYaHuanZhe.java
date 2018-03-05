package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * '高血压患者'
 */
@Entity
public class GaoXueYaHuanZhe extends BaseEntity{
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String gxy_id;//
    @NotNull
    private String na_id;//居民id
    private String gxy_data;//随访日期
    private String gxy_type;//随访方式
    private int symptom_id;//症状Id
    private int bp_id;//血压id
    private String hw_id;//身高体重id
    private String spo_id;//血氧id
    private String gxy_report;//体征报告
    private String gxy_sign;//体征 其他
    private int gxy_smoke;//日吸烟量（支）
    private int gxy_wine;//日饮酒量（两）
    private int gxy_motion1;//运动 次/周
    private int gxy_motion2;//运动 分钟/次
    private int gxy_motion_target1;//运动目标 次/周
    private int gxy_motion_target2;//运动目标 分钟/次
    private int gxy_salt;//摄盐情况（咸淡）
    private int gxy_mind;//心理调整
    private int gxy_follow;//遵医行为
    private String gxy_assist;//辅助检查
    private int gxy_dose;//服药依从性
    private int gxy_detail;//药物不良反应
    private int gxy_effect;//此次随访分类
    private int gxy_drug1;//药物名称1
    private int gxy_drug1_num;//药物名称1 用法每日
    private int gxy_drug1_amount;//药物名称1 用量每次
    private int gxy_drug2;//药物名称2
    private int gxy_drug2_num;//药物名称2 用法每日
    private int gxy_drug2_amount;//药物名称2 用量每次
    private int gxy_drug3;//药物名称3
    private int gxy_drug3_num;//药物名称3 用法每日
    private int gxy_drug3_amount;//药物名称3 用量每次
    private String gxy_rf_cause;//转诊原因
    private String gxy_rf_detail;//转诊机构及科别
    private String gxy_nextdata;//下次随访日期
    private String gxy_doctor;//随访医生签字

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 456138897)
    public GaoXueYaHuanZhe(Long id, @NotNull String gxy_id, @NotNull String na_id,
            String gxy_data, String gxy_type, int symptom_id, int bp_id,
            String hw_id, String spo_id, String gxy_report, String gxy_sign,
            int gxy_smoke, int gxy_wine, int gxy_motion1, int gxy_motion2,
            int gxy_motion_target1, int gxy_motion_target2, int gxy_salt,
            int gxy_mind, int gxy_follow, String gxy_assist, int gxy_dose,
            int gxy_detail, int gxy_effect, int gxy_drug1, int gxy_drug1_num,
            int gxy_drug1_amount, int gxy_drug2, int gxy_drug2_num,
            int gxy_drug2_amount, int gxy_drug3, int gxy_drug3_num,
            int gxy_drug3_amount, String gxy_rf_cause, String gxy_rf_detail,
            String gxy_nextdata, String gxy_doctor, String createDate) {
        this.id = id;
        this.gxy_id = gxy_id;
        this.na_id = na_id;
        this.gxy_data = gxy_data;
        this.gxy_type = gxy_type;
        this.symptom_id = symptom_id;
        this.bp_id = bp_id;
        this.hw_id = hw_id;
        this.spo_id = spo_id;
        this.gxy_report = gxy_report;
        this.gxy_sign = gxy_sign;
        this.gxy_smoke = gxy_smoke;
        this.gxy_wine = gxy_wine;
        this.gxy_motion1 = gxy_motion1;
        this.gxy_motion2 = gxy_motion2;
        this.gxy_motion_target1 = gxy_motion_target1;
        this.gxy_motion_target2 = gxy_motion_target2;
        this.gxy_salt = gxy_salt;
        this.gxy_mind = gxy_mind;
        this.gxy_follow = gxy_follow;
        this.gxy_assist = gxy_assist;
        this.gxy_dose = gxy_dose;
        this.gxy_detail = gxy_detail;
        this.gxy_effect = gxy_effect;
        this.gxy_drug1 = gxy_drug1;
        this.gxy_drug1_num = gxy_drug1_num;
        this.gxy_drug1_amount = gxy_drug1_amount;
        this.gxy_drug2 = gxy_drug2;
        this.gxy_drug2_num = gxy_drug2_num;
        this.gxy_drug2_amount = gxy_drug2_amount;
        this.gxy_drug3 = gxy_drug3;
        this.gxy_drug3_num = gxy_drug3_num;
        this.gxy_drug3_amount = gxy_drug3_amount;
        this.gxy_rf_cause = gxy_rf_cause;
        this.gxy_rf_detail = gxy_rf_detail;
        this.gxy_nextdata = gxy_nextdata;
        this.gxy_doctor = gxy_doctor;
        this.createDate = createDate;
    }
    @Generated(hash = 1165081145)
    public GaoXueYaHuanZhe() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGxy_id() {
        return this.gxy_id;
    }
    public void setGxy_id(String gxy_id) {
        this.gxy_id = gxy_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getGxy_data() {
        return this.gxy_data;
    }
    public void setGxy_data(String gxy_data) {
        this.gxy_data = gxy_data;
    }
    public String getGxy_type() {
        return this.gxy_type;
    }
    public void setGxy_type(String gxy_type) {
        this.gxy_type = gxy_type;
    }
    public int getSymptom_id() {
        return this.symptom_id;
    }
    public void setSymptom_id(int symptom_id) {
        this.symptom_id = symptom_id;
    }
    public int getBp_id() {
        return this.bp_id;
    }
    public void setBp_id(int bp_id) {
        this.bp_id = bp_id;
    }
    public String getHw_id() {
        return this.hw_id;
    }
    public void setHw_id(String hw_id) {
        this.hw_id = hw_id;
    }
    public String getSpo_id() {
        return this.spo_id;
    }
    public void setSpo_id(String spo_id) {
        this.spo_id = spo_id;
    }
    public String getGxy_report() {
        return this.gxy_report;
    }
    public void setGxy_report(String gxy_report) {
        this.gxy_report = gxy_report;
    }
    public String getGxy_sign() {
        return this.gxy_sign;
    }
    public void setGxy_sign(String gxy_sign) {
        this.gxy_sign = gxy_sign;
    }
    public int getGxy_smoke() {
        return this.gxy_smoke;
    }
    public void setGxy_smoke(int gxy_smoke) {
        this.gxy_smoke = gxy_smoke;
    }
    public int getGxy_wine() {
        return this.gxy_wine;
    }
    public void setGxy_wine(int gxy_wine) {
        this.gxy_wine = gxy_wine;
    }
    public int getGxy_motion1() {
        return this.gxy_motion1;
    }
    public void setGxy_motion1(int gxy_motion1) {
        this.gxy_motion1 = gxy_motion1;
    }
    public int getGxy_motion2() {
        return this.gxy_motion2;
    }
    public void setGxy_motion2(int gxy_motion2) {
        this.gxy_motion2 = gxy_motion2;
    }
    public int getGxy_motion_target1() {
        return this.gxy_motion_target1;
    }
    public void setGxy_motion_target1(int gxy_motion_target1) {
        this.gxy_motion_target1 = gxy_motion_target1;
    }
    public int getGxy_motion_target2() {
        return this.gxy_motion_target2;
    }
    public void setGxy_motion_target2(int gxy_motion_target2) {
        this.gxy_motion_target2 = gxy_motion_target2;
    }
    public int getGxy_salt() {
        return this.gxy_salt;
    }
    public void setGxy_salt(int gxy_salt) {
        this.gxy_salt = gxy_salt;
    }
    public int getGxy_mind() {
        return this.gxy_mind;
    }
    public void setGxy_mind(int gxy_mind) {
        this.gxy_mind = gxy_mind;
    }
    public int getGxy_follow() {
        return this.gxy_follow;
    }
    public void setGxy_follow(int gxy_follow) {
        this.gxy_follow = gxy_follow;
    }
    public String getGxy_assist() {
        return this.gxy_assist;
    }
    public void setGxy_assist(String gxy_assist) {
        this.gxy_assist = gxy_assist;
    }
    public int getGxy_dose() {
        return this.gxy_dose;
    }
    public void setGxy_dose(int gxy_dose) {
        this.gxy_dose = gxy_dose;
    }
    public int getGxy_detail() {
        return this.gxy_detail;
    }
    public void setGxy_detail(int gxy_detail) {
        this.gxy_detail = gxy_detail;
    }
    public int getGxy_effect() {
        return this.gxy_effect;
    }
    public void setGxy_effect(int gxy_effect) {
        this.gxy_effect = gxy_effect;
    }
    public int getGxy_drug1() {
        return this.gxy_drug1;
    }
    public void setGxy_drug1(int gxy_drug1) {
        this.gxy_drug1 = gxy_drug1;
    }
    public int getGxy_drug1_num() {
        return this.gxy_drug1_num;
    }
    public void setGxy_drug1_num(int gxy_drug1_num) {
        this.gxy_drug1_num = gxy_drug1_num;
    }
    public int getGxy_drug1_amount() {
        return this.gxy_drug1_amount;
    }
    public void setGxy_drug1_amount(int gxy_drug1_amount) {
        this.gxy_drug1_amount = gxy_drug1_amount;
    }
    public int getGxy_drug2() {
        return this.gxy_drug2;
    }
    public void setGxy_drug2(int gxy_drug2) {
        this.gxy_drug2 = gxy_drug2;
    }
    public int getGxy_drug2_num() {
        return this.gxy_drug2_num;
    }
    public void setGxy_drug2_num(int gxy_drug2_num) {
        this.gxy_drug2_num = gxy_drug2_num;
    }
    public int getGxy_drug2_amount() {
        return this.gxy_drug2_amount;
    }
    public void setGxy_drug2_amount(int gxy_drug2_amount) {
        this.gxy_drug2_amount = gxy_drug2_amount;
    }
    public int getGxy_drug3() {
        return this.gxy_drug3;
    }
    public void setGxy_drug3(int gxy_drug3) {
        this.gxy_drug3 = gxy_drug3;
    }
    public int getGxy_drug3_num() {
        return this.gxy_drug3_num;
    }
    public void setGxy_drug3_num(int gxy_drug3_num) {
        this.gxy_drug3_num = gxy_drug3_num;
    }
    public int getGxy_drug3_amount() {
        return this.gxy_drug3_amount;
    }
    public void setGxy_drug3_amount(int gxy_drug3_amount) {
        this.gxy_drug3_amount = gxy_drug3_amount;
    }
    public String getGxy_rf_cause() {
        return this.gxy_rf_cause;
    }
    public void setGxy_rf_cause(String gxy_rf_cause) {
        this.gxy_rf_cause = gxy_rf_cause;
    }
    public String getGxy_rf_detail() {
        return this.gxy_rf_detail;
    }
    public void setGxy_rf_detail(String gxy_rf_detail) {
        this.gxy_rf_detail = gxy_rf_detail;
    }
    public String getGxy_nextdata() {
        return this.gxy_nextdata;
    }
    public void setGxy_nextdata(String gxy_nextdata) {
        this.gxy_nextdata = gxy_nextdata;
    }
    public String getGxy_doctor() {
        return this.gxy_doctor;
    }
    public void setGxy_doctor(String gxy_doctor) {
        this.gxy_doctor = gxy_doctor;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
