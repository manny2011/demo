package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 健康体检表A   （健康体检表、生活方式)
 */
@Entity
public class JianKangTiJianBiao_A extends BaseEntity{
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String jktj_id;//
    @NotNull
    private String na_id;//居民ID
    private String jktj_date;//体检时间
    private String jktj_doctor;//责任医生
    private int symptom_id;//症状id
    private String jktj_tw;//体温
    private String jktj_ml;//脉率
    private String jktj_hxpl;//呼吸频率
    private String zbp_id;//左侧血压
    private String ybp_id;//右侧血压
    private String hw_id;//身高体重
    private String jktj_yaow;//腰围
    private int jktj_lnrjk;//老年人健康状态自我评估
    private int jktj_lnrzl;//老年人生活自理能力自我评估
    private int jktj_lnrrz;//老年人认知能力 0粗筛阴性, 1 0粗筛阳性
    private String jktj_zlzt;//简单智力状态检查，总分
    private int jktj_lnrqg;//老年人情感状态 0粗筛阴性, 1 0粗筛阳性
    private String jktj_lnryy;//老年人抑郁评分检查，总分
    private int jktj_dlpl;//体育锻炼--锻炼频率
    private String jktj_dlsj;//每次锻炼时间
    private String jktj_jcsj;//坚持锻炼时间
    private String jktj_dlfs;//锻炼方式
    private int jktj_ysxg;//饮食习惯
    private int jktj_xyzt;//吸烟情况--吸烟状况
    private String jktj_rxyl;//日吸烟量
    private String jktj_ksxy;//开始吸烟年龄
    private String jktj_jynl;//戒烟年龄
    private int jktj_yjpl;//饮酒情况-----饮酒频率
    private String jktj_ryjl;//日饮酒量
    private int jktj_jiej;//是否戒酒 0未戒酒， 1已戒酒
    private String jktj_jjnl;//戒酒年龄
    private String jktj_ksyj;//开始饮酒年龄
    private int jktj_jnzj;//近一年内是否醉酒 0否 ， 1是
    private int jktj_yjzl;//饮酒种类
    private int jktj_zyb;//职业病危害因素接触史 0无  1有
    private String jktj_zyb_gz;//职业病-------工种
    private String jktj_zyb_cysj;//职业病-------从业时间
    private String jktj_zyb_fc;//职业病-------粉尘
    private int jktj_zyb_fc_fh;//职业病-------粉尘 防护措施 0无 ，1有
    private String jktj_zyb_fc_ms;//职业病-------粉尘 描述
    private String jktj_zyb_fswz;//职业病-------放射物质
    private int jktj_zyb_fswz_fh;//职业病-------放射物质 防护措施 0无 ，1有
    private String jktj_zyb_fswz_ms;//职业病-------放射物质描述
    private String jktj_zyb_wlys;//职业病-------物理因素
    private int jktj_zyb_wlys_fh;//职业病-------物理因素 防护措施 0无 ，1有
    private String jktj_zyb_wlys_ms;//职业病-------物理因素 描述
    private String jktj_zyb_hxwz;//职业病-------化学因素
    private int jktj_zyb_hxwz_fh;//职业病-------化学因素 防护措施 0无 ，1有
    private String jktj_zyb_hxwz_ms;//职业病-------化学因素 描述
    private String jktj_zyb_other;//职业病-------其他
    private int jktj_zyb_other_fh;//职业病-------其他 防护措施 0无 ，1有
    private String jktj_zyb_other_ms;//职业病-------其他描述

//    @Transient
//    public int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1046444845)
    public JianKangTiJianBiao_A(Long id, @NotNull String jktj_id,
            @NotNull String na_id, String jktj_date, String jktj_doctor,
            int symptom_id, String jktj_tw, String jktj_ml, String jktj_hxpl,
            String zbp_id, String ybp_id, String hw_id, String jktj_yaow,
            int jktj_lnrjk, int jktj_lnrzl, int jktj_lnrrz, String jktj_zlzt,
            int jktj_lnrqg, String jktj_lnryy, int jktj_dlpl, String jktj_dlsj,
            String jktj_jcsj, String jktj_dlfs, int jktj_ysxg, int jktj_xyzt,
            String jktj_rxyl, String jktj_ksxy, String jktj_jynl, int jktj_yjpl,
            String jktj_ryjl, int jktj_jiej, String jktj_jjnl, String jktj_ksyj,
            int jktj_jnzj, int jktj_yjzl, int jktj_zyb, String jktj_zyb_gz,
            String jktj_zyb_cysj, String jktj_zyb_fc, int jktj_zyb_fc_fh,
            String jktj_zyb_fc_ms, String jktj_zyb_fswz, int jktj_zyb_fswz_fh,
            String jktj_zyb_fswz_ms, String jktj_zyb_wlys, int jktj_zyb_wlys_fh,
            String jktj_zyb_wlys_ms, String jktj_zyb_hxwz, int jktj_zyb_hxwz_fh,
            String jktj_zyb_hxwz_ms, String jktj_zyb_other, int jktj_zyb_other_fh,
            String jktj_zyb_other_ms, String createDate) {
        this.id = id;
        this.jktj_id = jktj_id;
        this.na_id = na_id;
        this.jktj_date = jktj_date;
        this.jktj_doctor = jktj_doctor;
        this.symptom_id = symptom_id;
        this.jktj_tw = jktj_tw;
        this.jktj_ml = jktj_ml;
        this.jktj_hxpl = jktj_hxpl;
        this.zbp_id = zbp_id;
        this.ybp_id = ybp_id;
        this.hw_id = hw_id;
        this.jktj_yaow = jktj_yaow;
        this.jktj_lnrjk = jktj_lnrjk;
        this.jktj_lnrzl = jktj_lnrzl;
        this.jktj_lnrrz = jktj_lnrrz;
        this.jktj_zlzt = jktj_zlzt;
        this.jktj_lnrqg = jktj_lnrqg;
        this.jktj_lnryy = jktj_lnryy;
        this.jktj_dlpl = jktj_dlpl;
        this.jktj_dlsj = jktj_dlsj;
        this.jktj_jcsj = jktj_jcsj;
        this.jktj_dlfs = jktj_dlfs;
        this.jktj_ysxg = jktj_ysxg;
        this.jktj_xyzt = jktj_xyzt;
        this.jktj_rxyl = jktj_rxyl;
        this.jktj_ksxy = jktj_ksxy;
        this.jktj_jynl = jktj_jynl;
        this.jktj_yjpl = jktj_yjpl;
        this.jktj_ryjl = jktj_ryjl;
        this.jktj_jiej = jktj_jiej;
        this.jktj_jjnl = jktj_jjnl;
        this.jktj_ksyj = jktj_ksyj;
        this.jktj_jnzj = jktj_jnzj;
        this.jktj_yjzl = jktj_yjzl;
        this.jktj_zyb = jktj_zyb;
        this.jktj_zyb_gz = jktj_zyb_gz;
        this.jktj_zyb_cysj = jktj_zyb_cysj;
        this.jktj_zyb_fc = jktj_zyb_fc;
        this.jktj_zyb_fc_fh = jktj_zyb_fc_fh;
        this.jktj_zyb_fc_ms = jktj_zyb_fc_ms;
        this.jktj_zyb_fswz = jktj_zyb_fswz;
        this.jktj_zyb_fswz_fh = jktj_zyb_fswz_fh;
        this.jktj_zyb_fswz_ms = jktj_zyb_fswz_ms;
        this.jktj_zyb_wlys = jktj_zyb_wlys;
        this.jktj_zyb_wlys_fh = jktj_zyb_wlys_fh;
        this.jktj_zyb_wlys_ms = jktj_zyb_wlys_ms;
        this.jktj_zyb_hxwz = jktj_zyb_hxwz;
        this.jktj_zyb_hxwz_fh = jktj_zyb_hxwz_fh;
        this.jktj_zyb_hxwz_ms = jktj_zyb_hxwz_ms;
        this.jktj_zyb_other = jktj_zyb_other;
        this.jktj_zyb_other_fh = jktj_zyb_other_fh;
        this.jktj_zyb_other_ms = jktj_zyb_other_ms;
        this.createDate = createDate;
    }
    @Generated(hash = 1536851573)
    public JianKangTiJianBiao_A() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getJktj_id() {
        return this.jktj_id;
    }
    public void setJktj_id(String jktj_id) {
        this.jktj_id = jktj_id;
    }
    public String getNa_id() {
        return this.na_id;
    }
    public void setNa_id(String na_id) {
        this.na_id = na_id;
    }
    public String getJktj_date() {
        return this.jktj_date;
    }
    public void setJktj_date(String jktj_date) {
        this.jktj_date = jktj_date;
    }
    public String getJktj_doctor() {
        return this.jktj_doctor;
    }
    public void setJktj_doctor(String jktj_doctor) {
        this.jktj_doctor = jktj_doctor;
    }
    public int getSymptom_id() {
        return this.symptom_id;
    }
    public void setSymptom_id(int symptom_id) {
        this.symptom_id = symptom_id;
    }
    public String getJktj_tw() {
        return this.jktj_tw;
    }
    public void setJktj_tw(String jktj_tw) {
        this.jktj_tw = jktj_tw;
    }
    public String getJktj_ml() {
        return this.jktj_ml;
    }
    public void setJktj_ml(String jktj_ml) {
        this.jktj_ml = jktj_ml;
    }
    public String getJktj_hxpl() {
        return this.jktj_hxpl;
    }
    public void setJktj_hxpl(String jktj_hxpl) {
        this.jktj_hxpl = jktj_hxpl;
    }
    public String getZbp_id() {
        return this.zbp_id;
    }
    public void setZbp_id(String zbp_id) {
        this.zbp_id = zbp_id;
    }
    public String getYbp_id() {
        return this.ybp_id;
    }
    public void setYbp_id(String ybp_id) {
        this.ybp_id = ybp_id;
    }
    public String getHw_id() {
        return this.hw_id;
    }
    public void setHw_id(String hw_id) {
        this.hw_id = hw_id;
    }
    public String getJktj_yaow() {
        return this.jktj_yaow;
    }
    public void setJktj_yaow(String jktj_yaow) {
        this.jktj_yaow = jktj_yaow;
    }
    public int getJktj_lnrjk() {
        return this.jktj_lnrjk;
    }
    public void setJktj_lnrjk(int jktj_lnrjk) {
        this.jktj_lnrjk = jktj_lnrjk;
    }
    public int getJktj_lnrzl() {
        return this.jktj_lnrzl;
    }
    public void setJktj_lnrzl(int jktj_lnrzl) {
        this.jktj_lnrzl = jktj_lnrzl;
    }
    public int getJktj_lnrrz() {
        return this.jktj_lnrrz;
    }
    public void setJktj_lnrrz(int jktj_lnrrz) {
        this.jktj_lnrrz = jktj_lnrrz;
    }
    public String getJktj_zlzt() {
        return this.jktj_zlzt;
    }
    public void setJktj_zlzt(String jktj_zlzt) {
        this.jktj_zlzt = jktj_zlzt;
    }
    public int getJktj_lnrqg() {
        return this.jktj_lnrqg;
    }
    public void setJktj_lnrqg(int jktj_lnrqg) {
        this.jktj_lnrqg = jktj_lnrqg;
    }
    public String getJktj_lnryy() {
        return this.jktj_lnryy;
    }
    public void setJktj_lnryy(String jktj_lnryy) {
        this.jktj_lnryy = jktj_lnryy;
    }
    public int getJktj_dlpl() {
        return this.jktj_dlpl;
    }
    public void setJktj_dlpl(int jktj_dlpl) {
        this.jktj_dlpl = jktj_dlpl;
    }
    public String getJktj_dlsj() {
        return this.jktj_dlsj;
    }
    public void setJktj_dlsj(String jktj_dlsj) {
        this.jktj_dlsj = jktj_dlsj;
    }
    public String getJktj_jcsj() {
        return this.jktj_jcsj;
    }
    public void setJktj_jcsj(String jktj_jcsj) {
        this.jktj_jcsj = jktj_jcsj;
    }
    public String getJktj_dlfs() {
        return this.jktj_dlfs;
    }
    public void setJktj_dlfs(String jktj_dlfs) {
        this.jktj_dlfs = jktj_dlfs;
    }
    public int getJktj_ysxg() {
        return this.jktj_ysxg;
    }
    public void setJktj_ysxg(int jktj_ysxg) {
        this.jktj_ysxg = jktj_ysxg;
    }
    public int getJktj_xyzt() {
        return this.jktj_xyzt;
    }
    public void setJktj_xyzt(int jktj_xyzt) {
        this.jktj_xyzt = jktj_xyzt;
    }
    public String getJktj_rxyl() {
        return this.jktj_rxyl;
    }
    public void setJktj_rxyl(String jktj_rxyl) {
        this.jktj_rxyl = jktj_rxyl;
    }
    public String getJktj_ksxy() {
        return this.jktj_ksxy;
    }
    public void setJktj_ksxy(String jktj_ksxy) {
        this.jktj_ksxy = jktj_ksxy;
    }
    public String getJktj_jynl() {
        return this.jktj_jynl;
    }
    public void setJktj_jynl(String jktj_jynl) {
        this.jktj_jynl = jktj_jynl;
    }
    public int getJktj_yjpl() {
        return this.jktj_yjpl;
    }
    public void setJktj_yjpl(int jktj_yjpl) {
        this.jktj_yjpl = jktj_yjpl;
    }
    public String getJktj_ryjl() {
        return this.jktj_ryjl;
    }
    public void setJktj_ryjl(String jktj_ryjl) {
        this.jktj_ryjl = jktj_ryjl;
    }
    public int getJktj_jiej() {
        return this.jktj_jiej;
    }
    public void setJktj_jiej(int jktj_jiej) {
        this.jktj_jiej = jktj_jiej;
    }
    public String getJktj_jjnl() {
        return this.jktj_jjnl;
    }
    public void setJktj_jjnl(String jktj_jjnl) {
        this.jktj_jjnl = jktj_jjnl;
    }
    public String getJktj_ksyj() {
        return this.jktj_ksyj;
    }
    public void setJktj_ksyj(String jktj_ksyj) {
        this.jktj_ksyj = jktj_ksyj;
    }
    public int getJktj_jnzj() {
        return this.jktj_jnzj;
    }
    public void setJktj_jnzj(int jktj_jnzj) {
        this.jktj_jnzj = jktj_jnzj;
    }
    public int getJktj_yjzl() {
        return this.jktj_yjzl;
    }
    public void setJktj_yjzl(int jktj_yjzl) {
        this.jktj_yjzl = jktj_yjzl;
    }
    public int getJktj_zyb() {
        return this.jktj_zyb;
    }
    public void setJktj_zyb(int jktj_zyb) {
        this.jktj_zyb = jktj_zyb;
    }
    public String getJktj_zyb_gz() {
        return this.jktj_zyb_gz;
    }
    public void setJktj_zyb_gz(String jktj_zyb_gz) {
        this.jktj_zyb_gz = jktj_zyb_gz;
    }
    public String getJktj_zyb_cysj() {
        return this.jktj_zyb_cysj;
    }
    public void setJktj_zyb_cysj(String jktj_zyb_cysj) {
        this.jktj_zyb_cysj = jktj_zyb_cysj;
    }
    public String getJktj_zyb_fc() {
        return this.jktj_zyb_fc;
    }
    public void setJktj_zyb_fc(String jktj_zyb_fc) {
        this.jktj_zyb_fc = jktj_zyb_fc;
    }
    public int getJktj_zyb_fc_fh() {
        return this.jktj_zyb_fc_fh;
    }
    public void setJktj_zyb_fc_fh(int jktj_zyb_fc_fh) {
        this.jktj_zyb_fc_fh = jktj_zyb_fc_fh;
    }
    public String getJktj_zyb_fc_ms() {
        return this.jktj_zyb_fc_ms;
    }
    public void setJktj_zyb_fc_ms(String jktj_zyb_fc_ms) {
        this.jktj_zyb_fc_ms = jktj_zyb_fc_ms;
    }
    public String getJktj_zyb_fswz() {
        return this.jktj_zyb_fswz;
    }
    public void setJktj_zyb_fswz(String jktj_zyb_fswz) {
        this.jktj_zyb_fswz = jktj_zyb_fswz;
    }
    public int getJktj_zyb_fswz_fh() {
        return this.jktj_zyb_fswz_fh;
    }
    public void setJktj_zyb_fswz_fh(int jktj_zyb_fswz_fh) {
        this.jktj_zyb_fswz_fh = jktj_zyb_fswz_fh;
    }
    public String getJktj_zyb_fswz_ms() {
        return this.jktj_zyb_fswz_ms;
    }
    public void setJktj_zyb_fswz_ms(String jktj_zyb_fswz_ms) {
        this.jktj_zyb_fswz_ms = jktj_zyb_fswz_ms;
    }
    public String getJktj_zyb_wlys() {
        return this.jktj_zyb_wlys;
    }
    public void setJktj_zyb_wlys(String jktj_zyb_wlys) {
        this.jktj_zyb_wlys = jktj_zyb_wlys;
    }
    public int getJktj_zyb_wlys_fh() {
        return this.jktj_zyb_wlys_fh;
    }
    public void setJktj_zyb_wlys_fh(int jktj_zyb_wlys_fh) {
        this.jktj_zyb_wlys_fh = jktj_zyb_wlys_fh;
    }
    public String getJktj_zyb_wlys_ms() {
        return this.jktj_zyb_wlys_ms;
    }
    public void setJktj_zyb_wlys_ms(String jktj_zyb_wlys_ms) {
        this.jktj_zyb_wlys_ms = jktj_zyb_wlys_ms;
    }
    public String getJktj_zyb_hxwz() {
        return this.jktj_zyb_hxwz;
    }
    public void setJktj_zyb_hxwz(String jktj_zyb_hxwz) {
        this.jktj_zyb_hxwz = jktj_zyb_hxwz;
    }
    public int getJktj_zyb_hxwz_fh() {
        return this.jktj_zyb_hxwz_fh;
    }
    public void setJktj_zyb_hxwz_fh(int jktj_zyb_hxwz_fh) {
        this.jktj_zyb_hxwz_fh = jktj_zyb_hxwz_fh;
    }
    public String getJktj_zyb_hxwz_ms() {
        return this.jktj_zyb_hxwz_ms;
    }
    public void setJktj_zyb_hxwz_ms(String jktj_zyb_hxwz_ms) {
        this.jktj_zyb_hxwz_ms = jktj_zyb_hxwz_ms;
    }
    public String getJktj_zyb_other() {
        return this.jktj_zyb_other;
    }
    public void setJktj_zyb_other(String jktj_zyb_other) {
        this.jktj_zyb_other = jktj_zyb_other;
    }
    public int getJktj_zyb_other_fh() {
        return this.jktj_zyb_other_fh;
    }
    public void setJktj_zyb_other_fh(int jktj_zyb_other_fh) {
        this.jktj_zyb_other_fh = jktj_zyb_other_fh;
    }
    public String getJktj_zyb_other_ms() {
        return this.jktj_zyb_other_ms;
    }
    public void setJktj_zyb_other_ms(String jktj_zyb_other_ms) {
        this.jktj_zyb_other_ms = jktj_zyb_other_ms;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

}
