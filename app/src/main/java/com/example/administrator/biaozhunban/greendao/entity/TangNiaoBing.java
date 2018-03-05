package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 2型糖尿病患者
 */
@Entity
public class TangNiaoBing extends BaseEntity{
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String tnb_id;//
    @NotNull
    private String na_id;//居民id
    private String tnb_Referral;//转诊原因
    private String tnb_Agencies_departments;//机构及科别
    private String tnb_next_follow;//下次随访日期
    private String tnb_doctor_follow;//随访医生
    private String tnb_Drug_use1;//用药情况1
    private String tnb_Drug_use2;//用药情况2
    private String tnb_Drug_use3;//用药情况3
    private String tnb_Drug_use4;//用药情况4
    private String tnb_Drug_use5;//用药情况5
    private int tnb_everyday1;//用法用量1每日
    private int tnb_everyday2;//用法用量2每日
    private int tnb_everyday3;//用法用量3每日
    private int tnb_everyday4;//用法用量4每日
    private int tnb_everyday5;//用法用量5每日
    private String tnb_every_time1;//用法用量1每次
    private String tnb_every_time2;//用法用量2每次
    private String tnb_every_time3;//用法用量3每次
    private String tnb_every_time4;//用法用量4每次
    private String tnb_every_time5;//用法用量5每次
    private int tnb_follow_classify;//随访分类0控制满意1控制不满意2不良反应3并发症
    private int tnb_dxt_reaction;//低血糖反应0无1偶尔2频繁
    private int tnb_fy_Compliance;//服药依从性0规律1间断2不服药
    private int tnb_Adverse_reaction;//不良反应0有1无
    private String tnb_blfy_content;//药物不良反应内容
    private String tnb_other_inspect1;//其他检查1
    private String tnb_other_inspect2;//其他检查2
    private String tnb_other_inspect3;//其他检查3
    private String tnb_other_inspect4;//其他检查4
    private String tnb_other_inspect5;//其他检查5
    private int tnb_Daily_smoking;//日吸烟量
    private int tnb_Target_smoking;//目标吸烟量
    private int tnb_yjl_day;//日饮酒量
    private int tnb_target_yjl;//目标饮酒量
    private String bp_id;//血压表id
    private String hw_id;//身高体重ID
    private int tnb_zbdmbd;//足背动脉搏动 0未触及1触及
    private String tnb_follow_date;//随访日期
    private int tnb_follow_method;//随访方式0门诊1家庭2电话
    private int symptom_id;//糖尿病症状表ID
    private String tnb_other;//其他
    private int tnb_motion_frequency;//运动次数/周
    private int tnb_motion_min;//运动分钟/次
    private int tnb_motion_target;//目标运动次数/周
    private int tnb_ydmb_min;//目标运动分钟/次
    private int tnb_food;//主食克/每天
    private int tnb_food_target;//目标主食克/每天
    private int tnb_Mental_adjustment;//心理调整0良好1一般2差
    private int tnb_Compliance;//遵医行为0良好1一般2差
    private String glu_id;//血糖表ID

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 846900145)
    public TangNiaoBing(Long id, @NotNull String tnb_id, @NotNull String na_id,
            String tnb_Referral, String tnb_Agencies_departments,
            String tnb_next_follow, String tnb_doctor_follow, String tnb_Drug_use1,
            String tnb_Drug_use2, String tnb_Drug_use3, String tnb_Drug_use4,
            String tnb_Drug_use5, int tnb_everyday1, int tnb_everyday2,
            int tnb_everyday3, int tnb_everyday4, int tnb_everyday5,
            String tnb_every_time1, String tnb_every_time2, String tnb_every_time3,
            String tnb_every_time4, String tnb_every_time5, int tnb_follow_classify,
            int tnb_dxt_reaction, int tnb_fy_Compliance, int tnb_Adverse_reaction,
            String tnb_blfy_content, String tnb_other_inspect1,
            String tnb_other_inspect2, String tnb_other_inspect3,
            String tnb_other_inspect4, String tnb_other_inspect5,
            int tnb_Daily_smoking, int tnb_Target_smoking, int tnb_yjl_day,
            int tnb_target_yjl, String bp_id, String hw_id, int tnb_zbdmbd,
            String tnb_follow_date, int tnb_follow_method, int symptom_id,
            String tnb_other, int tnb_motion_frequency, int tnb_motion_min,
            int tnb_motion_target, int tnb_ydmb_min, int tnb_food,
            int tnb_food_target, int tnb_Mental_adjustment, int tnb_Compliance,
            String glu_id, String createDate) {
        this.id = id;
        this.tnb_id = tnb_id;
        this.na_id = na_id;
        this.tnb_Referral = tnb_Referral;
        this.tnb_Agencies_departments = tnb_Agencies_departments;
        this.tnb_next_follow = tnb_next_follow;
        this.tnb_doctor_follow = tnb_doctor_follow;
        this.tnb_Drug_use1 = tnb_Drug_use1;
        this.tnb_Drug_use2 = tnb_Drug_use2;
        this.tnb_Drug_use3 = tnb_Drug_use3;
        this.tnb_Drug_use4 = tnb_Drug_use4;
        this.tnb_Drug_use5 = tnb_Drug_use5;
        this.tnb_everyday1 = tnb_everyday1;
        this.tnb_everyday2 = tnb_everyday2;
        this.tnb_everyday3 = tnb_everyday3;
        this.tnb_everyday4 = tnb_everyday4;
        this.tnb_everyday5 = tnb_everyday5;
        this.tnb_every_time1 = tnb_every_time1;
        this.tnb_every_time2 = tnb_every_time2;
        this.tnb_every_time3 = tnb_every_time3;
        this.tnb_every_time4 = tnb_every_time4;
        this.tnb_every_time5 = tnb_every_time5;
        this.tnb_follow_classify = tnb_follow_classify;
        this.tnb_dxt_reaction = tnb_dxt_reaction;
        this.tnb_fy_Compliance = tnb_fy_Compliance;
        this.tnb_Adverse_reaction = tnb_Adverse_reaction;
        this.tnb_blfy_content = tnb_blfy_content;
        this.tnb_other_inspect1 = tnb_other_inspect1;
        this.tnb_other_inspect2 = tnb_other_inspect2;
        this.tnb_other_inspect3 = tnb_other_inspect3;
        this.tnb_other_inspect4 = tnb_other_inspect4;
        this.tnb_other_inspect5 = tnb_other_inspect5;
        this.tnb_Daily_smoking = tnb_Daily_smoking;
        this.tnb_Target_smoking = tnb_Target_smoking;
        this.tnb_yjl_day = tnb_yjl_day;
        this.tnb_target_yjl = tnb_target_yjl;
        this.bp_id = bp_id;
        this.hw_id = hw_id;
        this.tnb_zbdmbd = tnb_zbdmbd;
        this.tnb_follow_date = tnb_follow_date;
        this.tnb_follow_method = tnb_follow_method;
        this.symptom_id = symptom_id;
        this.tnb_other = tnb_other;
        this.tnb_motion_frequency = tnb_motion_frequency;
        this.tnb_motion_min = tnb_motion_min;
        this.tnb_motion_target = tnb_motion_target;
        this.tnb_ydmb_min = tnb_ydmb_min;
        this.tnb_food = tnb_food;
        this.tnb_food_target = tnb_food_target;
        this.tnb_Mental_adjustment = tnb_Mental_adjustment;
        this.tnb_Compliance = tnb_Compliance;
        this.glu_id = glu_id;
        this.createDate = createDate;
    }
    @Generated(hash = 2043179210)
    public TangNiaoBing() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTnb_id() {
        return this.tnb_id;
    }
    public void setTnb_id(String tnb_id) {
        this.tnb_id = tnb_id;
    }
    public String getTnb_Referral() {
        return this.tnb_Referral;
    }
    public void setTnb_Referral(String tnb_Referral) {
        this.tnb_Referral = tnb_Referral;
    }
    public String getTnb_Agencies_departments() {
        return this.tnb_Agencies_departments;
    }
    public void setTnb_Agencies_departments(String tnb_Agencies_departments) {
        this.tnb_Agencies_departments = tnb_Agencies_departments;
    }
    public String getTnb_next_follow() {
        return this.tnb_next_follow;
    }
    public void setTnb_next_follow(String tnb_next_follow) {
        this.tnb_next_follow = tnb_next_follow;
    }
    public String getTnb_doctor_follow() {
        return this.tnb_doctor_follow;
    }
    public void setTnb_doctor_follow(String tnb_doctor_follow) {
        this.tnb_doctor_follow = tnb_doctor_follow;
    }
    public String getTnb_Drug_use1() {
        return this.tnb_Drug_use1;
    }
    public void setTnb_Drug_use1(String tnb_Drug_use1) {
        this.tnb_Drug_use1 = tnb_Drug_use1;
    }
    public String getTnb_Drug_use2() {
        return this.tnb_Drug_use2;
    }
    public void setTnb_Drug_use2(String tnb_Drug_use2) {
        this.tnb_Drug_use2 = tnb_Drug_use2;
    }
    public String getTnb_Drug_use3() {
        return this.tnb_Drug_use3;
    }
    public void setTnb_Drug_use3(String tnb_Drug_use3) {
        this.tnb_Drug_use3 = tnb_Drug_use3;
    }
    public String getTnb_Drug_use4() {
        return this.tnb_Drug_use4;
    }
    public void setTnb_Drug_use4(String tnb_Drug_use4) {
        this.tnb_Drug_use4 = tnb_Drug_use4;
    }
    public String getTnb_Drug_use5() {
        return this.tnb_Drug_use5;
    }
    public void setTnb_Drug_use5(String tnb_Drug_use5) {
        this.tnb_Drug_use5 = tnb_Drug_use5;
    }
    public int getTnb_everyday1() {
        return this.tnb_everyday1;
    }
    public void setTnb_everyday1(int tnb_everyday1) {
        this.tnb_everyday1 = tnb_everyday1;
    }
    public int getTnb_everyday2() {
        return this.tnb_everyday2;
    }
    public void setTnb_everyday2(int tnb_everyday2) {
        this.tnb_everyday2 = tnb_everyday2;
    }
    public int getTnb_everyday3() {
        return this.tnb_everyday3;
    }
    public void setTnb_everyday3(int tnb_everyday3) {
        this.tnb_everyday3 = tnb_everyday3;
    }
    public int getTnb_everyday4() {
        return this.tnb_everyday4;
    }
    public void setTnb_everyday4(int tnb_everyday4) {
        this.tnb_everyday4 = tnb_everyday4;
    }
    public int getTnb_everyday5() {
        return this.tnb_everyday5;
    }
    public void setTnb_everyday5(int tnb_everyday5) {
        this.tnb_everyday5 = tnb_everyday5;
    }
    public String getTnb_every_time1() {
        return this.tnb_every_time1;
    }
    public void setTnb_every_time1(String tnb_every_time1) {
        this.tnb_every_time1 = tnb_every_time1;
    }
    public String getTnb_every_time2() {
        return this.tnb_every_time2;
    }
    public void setTnb_every_time2(String tnb_every_time2) {
        this.tnb_every_time2 = tnb_every_time2;
    }
    public String getTnb_every_time3() {
        return this.tnb_every_time3;
    }
    public void setTnb_every_time3(String tnb_every_time3) {
        this.tnb_every_time3 = tnb_every_time3;
    }
    public String getTnb_every_time4() {
        return this.tnb_every_time4;
    }
    public void setTnb_every_time4(String tnb_every_time4) {
        this.tnb_every_time4 = tnb_every_time4;
    }
    public String getTnb_every_time5() {
        return this.tnb_every_time5;
    }
    public void setTnb_every_time5(String tnb_every_time5) {
        this.tnb_every_time5 = tnb_every_time5;
    }
    public int getTnb_follow_classify() {
        return this.tnb_follow_classify;
    }
    public void setTnb_follow_classify(int tnb_follow_classify) {
        this.tnb_follow_classify = tnb_follow_classify;
    }
    public int getTnb_dxt_reaction() {
        return this.tnb_dxt_reaction;
    }
    public void setTnb_dxt_reaction(int tnb_dxt_reaction) {
        this.tnb_dxt_reaction = tnb_dxt_reaction;
    }
    public int getTnb_fy_Compliance() {
        return this.tnb_fy_Compliance;
    }
    public void setTnb_fy_Compliance(int tnb_fy_Compliance) {
        this.tnb_fy_Compliance = tnb_fy_Compliance;
    }
    public int getTnb_Adverse_reaction() {
        return this.tnb_Adverse_reaction;
    }
    public void setTnb_Adverse_reaction(int tnb_Adverse_reaction) {
        this.tnb_Adverse_reaction = tnb_Adverse_reaction;
    }
    public String getTnb_blfy_content() {
        return this.tnb_blfy_content;
    }
    public void setTnb_blfy_content(String tnb_blfy_content) {
        this.tnb_blfy_content = tnb_blfy_content;
    }
    public String getTnb_other_inspect1() {
        return this.tnb_other_inspect1;
    }
    public void setTnb_other_inspect1(String tnb_other_inspect1) {
        this.tnb_other_inspect1 = tnb_other_inspect1;
    }
    public String getTnb_other_inspect2() {
        return this.tnb_other_inspect2;
    }
    public void setTnb_other_inspect2(String tnb_other_inspect2) {
        this.tnb_other_inspect2 = tnb_other_inspect2;
    }
    public String getTnb_other_inspect3() {
        return this.tnb_other_inspect3;
    }
    public void setTnb_other_inspect3(String tnb_other_inspect3) {
        this.tnb_other_inspect3 = tnb_other_inspect3;
    }
    public String getTnb_other_inspect4() {
        return this.tnb_other_inspect4;
    }
    public void setTnb_other_inspect4(String tnb_other_inspect4) {
        this.tnb_other_inspect4 = tnb_other_inspect4;
    }
    public String getTnb_other_inspect5() {
        return this.tnb_other_inspect5;
    }
    public void setTnb_other_inspect5(String tnb_other_inspect5) {
        this.tnb_other_inspect5 = tnb_other_inspect5;
    }
    public int getTnb_Daily_smoking() {
        return this.tnb_Daily_smoking;
    }
    public void setTnb_Daily_smoking(int tnb_Daily_smoking) {
        this.tnb_Daily_smoking = tnb_Daily_smoking;
    }
    public int getTnb_Target_smoking() {
        return this.tnb_Target_smoking;
    }
    public void setTnb_Target_smoking(int tnb_Target_smoking) {
        this.tnb_Target_smoking = tnb_Target_smoking;
    }
    public int getTnb_yjl_day() {
        return this.tnb_yjl_day;
    }
    public void setTnb_yjl_day(int tnb_yjl_day) {
        this.tnb_yjl_day = tnb_yjl_day;
    }
    public int getTnb_target_yjl() {
        return this.tnb_target_yjl;
    }
    public void setTnb_target_yjl(int tnb_target_yjl) {
        this.tnb_target_yjl = tnb_target_yjl;
    }
    public String getBp_id() {
        return this.bp_id;
    }
    public void setBp_id(String bp_id) {
        this.bp_id = bp_id;
    }
    public String getHw_id() {
        return this.hw_id;
    }
    public void setHw_id(String hw_id) {
        this.hw_id = hw_id;
    }
    public int getTnb_zbdmbd() {
        return this.tnb_zbdmbd;
    }
    public void setTnb_zbdmbd(int tnb_zbdmbd) {
        this.tnb_zbdmbd = tnb_zbdmbd;
    }
    public String getTnb_follow_date() {
        return this.tnb_follow_date;
    }
    public void setTnb_follow_date(String tnb_follow_date) {
        this.tnb_follow_date = tnb_follow_date;
    }
    public int getTnb_follow_method() {
        return this.tnb_follow_method;
    }
    public void setTnb_follow_method(int tnb_follow_method) {
        this.tnb_follow_method = tnb_follow_method;
    }
    public int getSymptom_id() {
        return this.symptom_id;
    }
    public void setSymptom_id(int symptom_id) {
        this.symptom_id = symptom_id;
    }
    public String getTnb_other() {
        return this.tnb_other;
    }
    public void setTnb_other(String tnb_other) {
        this.tnb_other = tnb_other;
    }
    public int getTnb_motion_frequency() {
        return this.tnb_motion_frequency;
    }
    public void setTnb_motion_frequency(int tnb_motion_frequency) {
        this.tnb_motion_frequency = tnb_motion_frequency;
    }
    public int getTnb_motion_min() {
        return this.tnb_motion_min;
    }
    public void setTnb_motion_min(int tnb_motion_min) {
        this.tnb_motion_min = tnb_motion_min;
    }
    public int getTnb_motion_target() {
        return this.tnb_motion_target;
    }
    public void setTnb_motion_target(int tnb_motion_target) {
        this.tnb_motion_target = tnb_motion_target;
    }
    public int getTnb_ydmb_min() {
        return this.tnb_ydmb_min;
    }
    public void setTnb_ydmb_min(int tnb_ydmb_min) {
        this.tnb_ydmb_min = tnb_ydmb_min;
    }
    public int getTnb_food() {
        return this.tnb_food;
    }
    public void setTnb_food(int tnb_food) {
        this.tnb_food = tnb_food;
    }
    public int getTnb_food_target() {
        return this.tnb_food_target;
    }
    public void setTnb_food_target(int tnb_food_target) {
        this.tnb_food_target = tnb_food_target;
    }
    public int getTnb_Mental_adjustment() {
        return this.tnb_Mental_adjustment;
    }
    public void setTnb_Mental_adjustment(int tnb_Mental_adjustment) {
        this.tnb_Mental_adjustment = tnb_Mental_adjustment;
    }
    public int getTnb_Compliance() {
        return this.tnb_Compliance;
    }
    public void setTnb_Compliance(int tnb_Compliance) {
        this.tnb_Compliance = tnb_Compliance;
    }
    public String getGlu_id() {
        return this.glu_id;
    }
    public void setGlu_id(String glu_id) {
        this.glu_id = glu_id;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    
}
