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
public class Xinshengerjitingfangshi extends BaseEntity{
    @Id
    private Long id;
    @NotNull
    private String xse_id;//新生儿家庭访视ID
    private String na_id;//居民ID
    private String hw_id;//身高体重id
    private String spo_id;//血氧表id
    private String cs_height;//出生身高
    private String temp_id;//体温表id
    private String xse_hxpl;//呼吸频率
    private String father_name;//父亲姓名
    private String father_pro;//父亲职业
    private String father_tel;//父亲电话
    private String father_bir;//父亲出生日期
    private String mother_name;//母亲姓名
    private String mother_pro;//母亲职业
    private String mother_tel;//母亲电话
    private String mother_bir;//母亲出生日期
    private String birth_week;//出生孕周
    private int mother_hbqk;//母亲妊娠期患病情况0糖尿病1高血压3其他
    private String midwifery;//助产机构
    private int birth_con;//出生情况0顺产1胎头吸引2产钳3剖宫4双胞胎5臀位6其他
    private int xse_asphyxia;//新生儿窒息0无1有
    private int apgar_score;//Apgar评分0一分钟1五分钟2不详
    private int xse_jix;//新生儿畸形0有1无
    private String jix_content;//畸形内容
    private int xse_tlsc;//新生儿听力筛查0通过1未通过2未筛查3不详
    private int xse_jbsc;//新生儿疾病筛查0甲低1苯丙酮尿症2其他遗传代谢病
    private String xse_cstz;//新生儿出生体重
    private int xse_wyfs;//喂养方式0纯母乳1混合2人工
    private String xse_chinl;//吃奶量 ml/次
    private int xse_chincs;//吃奶次数 次/日
    private int xse_huxpl;//呼吸频率 次/分钟
    private int xse_complexion;//新生儿面色0红润1黄染2其他
    private int xse_hdbw;//黄疸部位0面部1躯干2四肢3手足
    private String bregmatic1;//前囟1cmx
    private String bregmatic2;//前囟2cm
    private int bregmatic_situa;//前囟情况0正常1膨隆2凹陷3其他
    private int eye_appearance;//眼外观0没有异常1异常
    private String yanwgnr;//眼外观说明
    private int sizhdd;//四肢活动度0正常1异常
    private String sjzhddnr;//四肢活动度内容
    private int erwg;//耳外观0正常1异常
    private String erwgnr;//耳外观说明
    private int jingbbk;//颈部包块0无1有
    private int xse_nose;//鼻0正常1异常
    private int xse_skin;//皮肤0正常1湿疹2糜烂3其他
    private int oral_cavity;//口腔0正常1异常
    private String oral_cavitynr;//口腔内容
    private int xse_anus;//肛门0正常1异常
    private String xse_anusnr;//肛门内容
    private int xse_xftz;//心肺听诊0正常1异常
    private String xse_xftznr;//心肺听诊内容
    private int xse_wszq;//外生殖器0正常1异常
    private String xse_wszqnr;//外生殖器内容
    private int xse_fbqz;//腹部确诊0正常1异常
    private String xse_fbqznr;//腹部确诊内容
    private int xse_jiz;//新生儿脊柱0正常1异常
    private String xse_jiznr;//新生儿脊柱内容
    private int xse_qid;//脐带0未脱1脱落2脐部有渗出3其他
    private String zhuanzjy;//转诊建议0无1有
    private String zz_reason;//转诊原因
    private String mechanism;//机构及科室
    private int guidance;//指导0喂养1发育2防病3预防伤害4空腔
    private String xse_follow_date;//本次随访日期
    private String xse_follow_next;//下次随访日期
    private String follow_site;//下次随访地点
    private String xse_follow_doctor;//随访医生 关联医生注册
    private int xse_out;//新生儿呕吐0无1有
    private int xse_dab;//大便0糊状1稀
    private int xse_dabcs;//大便次数
    private String xse_nosenr;//鼻内容
    private String jingbbknr;//颈部包块说明

//    @Transient
//    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1024538261)
    public Xinshengerjitingfangshi(Long id, @NotNull String xse_id, String na_id,
            String hw_id, String spo_id, String cs_height, String temp_id,
            String xse_hxpl, String father_name, String father_pro,
            String father_tel, String father_bir, String mother_name,
            String mother_pro, String mother_tel, String mother_bir,
            String birth_week, int mother_hbqk, String midwifery, int birth_con,
            int xse_asphyxia, int apgar_score, int xse_jix, String jix_content,
            int xse_tlsc, int xse_jbsc, String xse_cstz, int xse_wyfs,
            String xse_chinl, int xse_chincs, int xse_huxpl, int xse_complexion,
            int xse_hdbw, String bregmatic1, String bregmatic2, int bregmatic_situa,
            int eye_appearance, String yanwgnr, int sizhdd, String sjzhddnr,
            int erwg, String erwgnr, int jingbbk, int xse_nose, int xse_skin,
            int oral_cavity, String oral_cavitynr, int xse_anus, String xse_anusnr,
            int xse_xftz, String xse_xftznr, int xse_wszq, String xse_wszqnr,
            int xse_fbqz, String xse_fbqznr, int xse_jiz, String xse_jiznr,
            int xse_qid, String zhuanzjy, String zz_reason, String mechanism,
            int guidance, String xse_follow_date, String xse_follow_next,
            String follow_site, String xse_follow_doctor, int xse_out, int xse_dab,
            int xse_dabcs, String xse_nosenr, String jingbbknr, String createDate) {
        this.id = id;
        this.xse_id = xse_id;
        this.na_id = na_id;
        this.hw_id = hw_id;
        this.spo_id = spo_id;
        this.cs_height = cs_height;
        this.temp_id = temp_id;
        this.xse_hxpl = xse_hxpl;
        this.father_name = father_name;
        this.father_pro = father_pro;
        this.father_tel = father_tel;
        this.father_bir = father_bir;
        this.mother_name = mother_name;
        this.mother_pro = mother_pro;
        this.mother_tel = mother_tel;
        this.mother_bir = mother_bir;
        this.birth_week = birth_week;
        this.mother_hbqk = mother_hbqk;
        this.midwifery = midwifery;
        this.birth_con = birth_con;
        this.xse_asphyxia = xse_asphyxia;
        this.apgar_score = apgar_score;
        this.xse_jix = xse_jix;
        this.jix_content = jix_content;
        this.xse_tlsc = xse_tlsc;
        this.xse_jbsc = xse_jbsc;
        this.xse_cstz = xse_cstz;
        this.xse_wyfs = xse_wyfs;
        this.xse_chinl = xse_chinl;
        this.xse_chincs = xse_chincs;
        this.xse_huxpl = xse_huxpl;
        this.xse_complexion = xse_complexion;
        this.xse_hdbw = xse_hdbw;
        this.bregmatic1 = bregmatic1;
        this.bregmatic2 = bregmatic2;
        this.bregmatic_situa = bregmatic_situa;
        this.eye_appearance = eye_appearance;
        this.yanwgnr = yanwgnr;
        this.sizhdd = sizhdd;
        this.sjzhddnr = sjzhddnr;
        this.erwg = erwg;
        this.erwgnr = erwgnr;
        this.jingbbk = jingbbk;
        this.xse_nose = xse_nose;
        this.xse_skin = xse_skin;
        this.oral_cavity = oral_cavity;
        this.oral_cavitynr = oral_cavitynr;
        this.xse_anus = xse_anus;
        this.xse_anusnr = xse_anusnr;
        this.xse_xftz = xse_xftz;
        this.xse_xftznr = xse_xftznr;
        this.xse_wszq = xse_wszq;
        this.xse_wszqnr = xse_wszqnr;
        this.xse_fbqz = xse_fbqz;
        this.xse_fbqznr = xse_fbqznr;
        this.xse_jiz = xse_jiz;
        this.xse_jiznr = xse_jiznr;
        this.xse_qid = xse_qid;
        this.zhuanzjy = zhuanzjy;
        this.zz_reason = zz_reason;
        this.mechanism = mechanism;
        this.guidance = guidance;
        this.xse_follow_date = xse_follow_date;
        this.xse_follow_next = xse_follow_next;
        this.follow_site = follow_site;
        this.xse_follow_doctor = xse_follow_doctor;
        this.xse_out = xse_out;
        this.xse_dab = xse_dab;
        this.xse_dabcs = xse_dabcs;
        this.xse_nosenr = xse_nosenr;
        this.jingbbknr = jingbbknr;
        this.createDate = createDate;
    }
    @Generated(hash = 922820669)
    public Xinshengerjitingfangshi() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getXse_id() {
        return this.xse_id;
    }
    public void setXse_id(String xse_id) {
        this.xse_id = xse_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
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
    public String getCs_height() {
        return this.cs_height;
    }
    public void setCs_height(String cs_height) {
        this.cs_height = cs_height;
    }
    public String getTemp_id() {
        return this.temp_id;
    }
    public void setTemp_id(String temp_id) {
        this.temp_id = temp_id;
    }
    public String getXse_hxpl() {
        return this.xse_hxpl;
    }
    public void setXse_hxpl(String xse_hxpl) {
        this.xse_hxpl = xse_hxpl;
    }
    public String getFather_name() {
        return this.father_name;
    }
    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }
    public String getFather_pro() {
        return this.father_pro;
    }
    public void setFather_pro(String father_pro) {
        this.father_pro = father_pro;
    }
    public String getFather_tel() {
        return this.father_tel;
    }
    public void setFather_tel(String father_tel) {
        this.father_tel = father_tel;
    }
    public String getFather_bir() {
        return this.father_bir;
    }
    public void setFather_bir(String father_bir) {
        this.father_bir = father_bir;
    }
    public String getMother_name() {
        return this.mother_name;
    }
    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }
    public String getMother_pro() {
        return this.mother_pro;
    }
    public void setMother_pro(String mother_pro) {
        this.mother_pro = mother_pro;
    }
    public String getMother_tel() {
        return this.mother_tel;
    }
    public void setMother_tel(String mother_tel) {
        this.mother_tel = mother_tel;
    }
    public String getMother_bir() {
        return this.mother_bir;
    }
    public void setMother_bir(String mother_bir) {
        this.mother_bir = mother_bir;
    }
    public String getBirth_week() {
        return this.birth_week;
    }
    public void setBirth_week(String birth_week) {
        this.birth_week = birth_week;
    }
    public int getMother_hbqk() {
        return this.mother_hbqk;
    }
    public void setMother_hbqk(int mother_hbqk) {
        this.mother_hbqk = mother_hbqk;
    }
    public String getMidwifery() {
        return this.midwifery;
    }
    public void setMidwifery(String midwifery) {
        this.midwifery = midwifery;
    }
    public int getBirth_con() {
        return this.birth_con;
    }
    public void setBirth_con(int birth_con) {
        this.birth_con = birth_con;
    }
    public int getXse_asphyxia() {
        return this.xse_asphyxia;
    }
    public void setXse_asphyxia(int xse_asphyxia) {
        this.xse_asphyxia = xse_asphyxia;
    }
    public int getApgar_score() {
        return this.apgar_score;
    }
    public void setApgar_score(int apgar_score) {
        this.apgar_score = apgar_score;
    }
    public int getXse_jix() {
        return this.xse_jix;
    }
    public void setXse_jix(int xse_jix) {
        this.xse_jix = xse_jix;
    }
    public String getJix_content() {
        return this.jix_content;
    }
    public void setJix_content(String jix_content) {
        this.jix_content = jix_content;
    }
    public int getXse_tlsc() {
        return this.xse_tlsc;
    }
    public void setXse_tlsc(int xse_tlsc) {
        this.xse_tlsc = xse_tlsc;
    }
    public int getXse_jbsc() {
        return this.xse_jbsc;
    }
    public void setXse_jbsc(int xse_jbsc) {
        this.xse_jbsc = xse_jbsc;
    }
    public String getXse_cstz() {
        return this.xse_cstz;
    }
    public void setXse_cstz(String xse_cstz) {
        this.xse_cstz = xse_cstz;
    }
    public int getXse_wyfs() {
        return this.xse_wyfs;
    }
    public void setXse_wyfs(int xse_wyfs) {
        this.xse_wyfs = xse_wyfs;
    }
    public String getXse_chinl() {
        return this.xse_chinl;
    }
    public void setXse_chinl(String xse_chinl) {
        this.xse_chinl = xse_chinl;
    }
    public int getXse_chincs() {
        return this.xse_chincs;
    }
    public void setXse_chincs(int xse_chincs) {
        this.xse_chincs = xse_chincs;
    }
    public int getXse_huxpl() {
        return this.xse_huxpl;
    }
    public void setXse_huxpl(int xse_huxpl) {
        this.xse_huxpl = xse_huxpl;
    }
    public int getXse_complexion() {
        return this.xse_complexion;
    }
    public void setXse_complexion(int xse_complexion) {
        this.xse_complexion = xse_complexion;
    }
    public int getXse_hdbw() {
        return this.xse_hdbw;
    }
    public void setXse_hdbw(int xse_hdbw) {
        this.xse_hdbw = xse_hdbw;
    }
    public String getBregmatic1() {
        return this.bregmatic1;
    }
    public void setBregmatic1(String bregmatic1) {
        this.bregmatic1 = bregmatic1;
    }
    public String getBregmatic2() {
        return this.bregmatic2;
    }
    public void setBregmatic2(String bregmatic2) {
        this.bregmatic2 = bregmatic2;
    }
    public int getBregmatic_situa() {
        return this.bregmatic_situa;
    }
    public void setBregmatic_situa(int bregmatic_situa) {
        this.bregmatic_situa = bregmatic_situa;
    }
    public int getEye_appearance() {
        return this.eye_appearance;
    }
    public void setEye_appearance(int eye_appearance) {
        this.eye_appearance = eye_appearance;
    }
    public String getYanwgnr() {
        return this.yanwgnr;
    }
    public void setYanwgnr(String yanwgnr) {
        this.yanwgnr = yanwgnr;
    }
    public int getSizhdd() {
        return this.sizhdd;
    }
    public void setSizhdd(int sizhdd) {
        this.sizhdd = sizhdd;
    }
    public String getSjzhddnr() {
        return this.sjzhddnr;
    }
    public void setSjzhddnr(String sjzhddnr) {
        this.sjzhddnr = sjzhddnr;
    }
    public int getErwg() {
        return this.erwg;
    }
    public void setErwg(int erwg) {
        this.erwg = erwg;
    }
    public String getErwgnr() {
        return this.erwgnr;
    }
    public void setErwgnr(String erwgnr) {
        this.erwgnr = erwgnr;
    }
    public int getJingbbk() {
        return this.jingbbk;
    }
    public void setJingbbk(int jingbbk) {
        this.jingbbk = jingbbk;
    }
    public int getXse_nose() {
        return this.xse_nose;
    }
    public void setXse_nose(int xse_nose) {
        this.xse_nose = xse_nose;
    }
    public int getXse_skin() {
        return this.xse_skin;
    }
    public void setXse_skin(int xse_skin) {
        this.xse_skin = xse_skin;
    }
    public int getOral_cavity() {
        return this.oral_cavity;
    }
    public void setOral_cavity(int oral_cavity) {
        this.oral_cavity = oral_cavity;
    }
    public String getOral_cavitynr() {
        return this.oral_cavitynr;
    }
    public void setOral_cavitynr(String oral_cavitynr) {
        this.oral_cavitynr = oral_cavitynr;
    }
    public int getXse_anus() {
        return this.xse_anus;
    }
    public void setXse_anus(int xse_anus) {
        this.xse_anus = xse_anus;
    }
    public String getXse_anusnr() {
        return this.xse_anusnr;
    }
    public void setXse_anusnr(String xse_anusnr) {
        this.xse_anusnr = xse_anusnr;
    }
    public int getXse_xftz() {
        return this.xse_xftz;
    }
    public void setXse_xftz(int xse_xftz) {
        this.xse_xftz = xse_xftz;
    }
    public String getXse_xftznr() {
        return this.xse_xftznr;
    }
    public void setXse_xftznr(String xse_xftznr) {
        this.xse_xftznr = xse_xftznr;
    }
    public int getXse_wszq() {
        return this.xse_wszq;
    }
    public void setXse_wszq(int xse_wszq) {
        this.xse_wszq = xse_wszq;
    }
    public String getXse_wszqnr() {
        return this.xse_wszqnr;
    }
    public void setXse_wszqnr(String xse_wszqnr) {
        this.xse_wszqnr = xse_wszqnr;
    }
    public int getXse_fbqz() {
        return this.xse_fbqz;
    }
    public void setXse_fbqz(int xse_fbqz) {
        this.xse_fbqz = xse_fbqz;
    }
    public String getXse_fbqznr() {
        return this.xse_fbqznr;
    }
    public void setXse_fbqznr(String xse_fbqznr) {
        this.xse_fbqznr = xse_fbqznr;
    }
    public int getXse_jiz() {
        return this.xse_jiz;
    }
    public void setXse_jiz(int xse_jiz) {
        this.xse_jiz = xse_jiz;
    }
    public String getXse_jiznr() {
        return this.xse_jiznr;
    }
    public void setXse_jiznr(String xse_jiznr) {
        this.xse_jiznr = xse_jiznr;
    }
    public int getXse_qid() {
        return this.xse_qid;
    }
    public void setXse_qid(int xse_qid) {
        this.xse_qid = xse_qid;
    }
    public String getZhuanzjy() {
        return this.zhuanzjy;
    }
    public void setZhuanzjy(String zhuanzjy) {
        this.zhuanzjy = zhuanzjy;
    }
    public String getZz_reason() {
        return this.zz_reason;
    }
    public void setZz_reason(String zz_reason) {
        this.zz_reason = zz_reason;
    }
    public String getMechanism() {
        return this.mechanism;
    }
    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }
    public int getGuidance() {
        return this.guidance;
    }
    public void setGuidance(int guidance) {
        this.guidance = guidance;
    }
    public String getXse_follow_date() {
        return this.xse_follow_date;
    }
    public void setXse_follow_date(String xse_follow_date) {
        this.xse_follow_date = xse_follow_date;
    }
    public String getXse_follow_next() {
        return this.xse_follow_next;
    }
    public void setXse_follow_next(String xse_follow_next) {
        this.xse_follow_next = xse_follow_next;
    }
    public String getFollow_site() {
        return this.follow_site;
    }
    public void setFollow_site(String follow_site) {
        this.follow_site = follow_site;
    }
    public String getXse_follow_doctor() {
        return this.xse_follow_doctor;
    }
    public void setXse_follow_doctor(String xse_follow_doctor) {
        this.xse_follow_doctor = xse_follow_doctor;
    }
    public int getXse_out() {
        return this.xse_out;
    }
    public void setXse_out(int xse_out) {
        this.xse_out = xse_out;
    }
    public int getXse_dab() {
        return this.xse_dab;
    }
    public void setXse_dab(int xse_dab) {
        this.xse_dab = xse_dab;
    }
    public int getXse_dabcs() {
        return this.xse_dabcs;
    }
    public void setXse_dabcs(int xse_dabcs) {
        this.xse_dabcs = xse_dabcs;
    }
    public String getXse_nosenr() {
        return this.xse_nosenr;
    }
    public void setXse_nosenr(String xse_nosenr) {
        this.xse_nosenr = xse_nosenr;
    }
    public String getJingbbknr() {
        return this.jingbbknr;
    }
    public void setJingbbknr(String jingbbknr) {
        this.jingbbknr = jingbbknr;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
