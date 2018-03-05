package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * '基础档案既往史家族史生活环境'
 * 与城乡居民基础档案JuMinJiChuDanAn相关联!
 */
@Entity
public class GWJiWangJiZuShi {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String other_id;//基础档案既往史家族史生活环境ID
    private int jws_jb1;//既往史疾病1
    private int jws_jb2;//既往史疾病2
    private int jws_jb3;//3
    private int jws_jb4;//4
    private int jws_jb5;//5
    private int jws_jb6;//6
    private String jws_qzsj1;//既往史确诊时间1
    private String jws_qzsj2;//2
    private String jws_qzsj3;//3
    private String jws_qzsj4;//4
    private String jws_qzsj5;//5
    private String jws_qzsj6;//6
    private String jws_exzl;//恶性肿瘤
    private String jws_zyb;//职业病
    private String jws_other;//既往史其他
    private int jws_ss;//既往史手术0无1有
    private String jws_ssmc1;//既往史手术名称1
    private String jws_ssmc2;//既往史手术名称2
    private String jws_sssj1;//既往史手术名称1时间
    private String jws_sssj2;//既往史手术名称2时间
    private int jws_ws;//既往史外伤0无1有
    private String jws_wsmc1;//既往史外伤名称1
    private String jws_wsmc2;//既往史外伤名称2
    private String jws_wssj1;//既往史外伤时间1
    private String jws_wssj2;//既往史外伤时间2
    private int symptom_id;//疾病表id
    private int jws_sx;//既往史输血0无1有
    private String jws_sxyy1;//既往史输血输血原因1
    private String jws_sxyy2;//既往史输血输血原因2
    private String jws_sxsj1;//既往史输血时间1
    private String jws_sxsj2;//既往史输血时间2
    private int jzs_father;//家族史父亲
    private int jzs_mother;//家族史母亲
    private int jzs_brother_sister;//家族史兄弟姐妹
    private int jzs_child;//家族史子女
    private int shhj_cfss;//生活环境厨房设施
    private int shhj_rllx;//生活环境燃料类型
    private int shhj_ys;//生活环境饮水
    private int shhj_cs;//生活环境测试
    private int shhj_qcl;//生活环境禽畜栏
    private String bs_id;//健康档案id

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1237451179)
    public GWJiWangJiZuShi(Long id, @NotNull String other_id, int jws_jb1,
            int jws_jb2, int jws_jb3, int jws_jb4, int jws_jb5, int jws_jb6,
            String jws_qzsj1, String jws_qzsj2, String jws_qzsj3, String jws_qzsj4,
            String jws_qzsj5, String jws_qzsj6, String jws_exzl, String jws_zyb,
            String jws_other, int jws_ss, String jws_ssmc1, String jws_ssmc2,
            String jws_sssj1, String jws_sssj2, int jws_ws, String jws_wsmc1,
            String jws_wsmc2, String jws_wssj1, String jws_wssj2, int symptom_id,
            int jws_sx, String jws_sxyy1, String jws_sxyy2, String jws_sxsj1,
            String jws_sxsj2, int jzs_father, int jzs_mother,
            int jzs_brother_sister, int jzs_child, int shhj_cfss, int shhj_rllx,
            int shhj_ys, int shhj_cs, int shhj_qcl, String bs_id,
            String createDate) {
        this.id = id;
        this.other_id = other_id;
        this.jws_jb1 = jws_jb1;
        this.jws_jb2 = jws_jb2;
        this.jws_jb3 = jws_jb3;
        this.jws_jb4 = jws_jb4;
        this.jws_jb5 = jws_jb5;
        this.jws_jb6 = jws_jb6;
        this.jws_qzsj1 = jws_qzsj1;
        this.jws_qzsj2 = jws_qzsj2;
        this.jws_qzsj3 = jws_qzsj3;
        this.jws_qzsj4 = jws_qzsj4;
        this.jws_qzsj5 = jws_qzsj5;
        this.jws_qzsj6 = jws_qzsj6;
        this.jws_exzl = jws_exzl;
        this.jws_zyb = jws_zyb;
        this.jws_other = jws_other;
        this.jws_ss = jws_ss;
        this.jws_ssmc1 = jws_ssmc1;
        this.jws_ssmc2 = jws_ssmc2;
        this.jws_sssj1 = jws_sssj1;
        this.jws_sssj2 = jws_sssj2;
        this.jws_ws = jws_ws;
        this.jws_wsmc1 = jws_wsmc1;
        this.jws_wsmc2 = jws_wsmc2;
        this.jws_wssj1 = jws_wssj1;
        this.jws_wssj2 = jws_wssj2;
        this.symptom_id = symptom_id;
        this.jws_sx = jws_sx;
        this.jws_sxyy1 = jws_sxyy1;
        this.jws_sxyy2 = jws_sxyy2;
        this.jws_sxsj1 = jws_sxsj1;
        this.jws_sxsj2 = jws_sxsj2;
        this.jzs_father = jzs_father;
        this.jzs_mother = jzs_mother;
        this.jzs_brother_sister = jzs_brother_sister;
        this.jzs_child = jzs_child;
        this.shhj_cfss = shhj_cfss;
        this.shhj_rllx = shhj_rllx;
        this.shhj_ys = shhj_ys;
        this.shhj_cs = shhj_cs;
        this.shhj_qcl = shhj_qcl;
        this.bs_id = bs_id;
        this.createDate = createDate;
    }
    @Generated(hash = 1723432792)
    public GWJiWangJiZuShi() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getOther_id() {
        return this.other_id;
    }
    public void setOther_id(String other_id) {
        this.other_id = other_id;
    }
    public int getJws_jb1() {
        return this.jws_jb1;
    }
    public void setJws_jb1(int jws_jb1) {
        this.jws_jb1 = jws_jb1;
    }
    public int getJws_jb2() {
        return this.jws_jb2;
    }
    public void setJws_jb2(int jws_jb2) {
        this.jws_jb2 = jws_jb2;
    }
    public int getJws_jb3() {
        return this.jws_jb3;
    }
    public void setJws_jb3(int jws_jb3) {
        this.jws_jb3 = jws_jb3;
    }
    public int getJws_jb4() {
        return this.jws_jb4;
    }
    public void setJws_jb4(int jws_jb4) {
        this.jws_jb4 = jws_jb4;
    }
    public int getJws_jb5() {
        return this.jws_jb5;
    }
    public void setJws_jb5(int jws_jb5) {
        this.jws_jb5 = jws_jb5;
    }
    public int getJws_jb6() {
        return this.jws_jb6;
    }
    public void setJws_jb6(int jws_jb6) {
        this.jws_jb6 = jws_jb6;
    }
    public String getJws_qzsj1() {
        return this.jws_qzsj1;
    }
    public void setJws_qzsj1(String jws_qzsj1) {
        this.jws_qzsj1 = jws_qzsj1;
    }
    public String getJws_qzsj2() {
        return this.jws_qzsj2;
    }
    public void setJws_qzsj2(String jws_qzsj2) {
        this.jws_qzsj2 = jws_qzsj2;
    }
    public String getJws_qzsj3() {
        return this.jws_qzsj3;
    }
    public void setJws_qzsj3(String jws_qzsj3) {
        this.jws_qzsj3 = jws_qzsj3;
    }
    public String getJws_qzsj4() {
        return this.jws_qzsj4;
    }
    public void setJws_qzsj4(String jws_qzsj4) {
        this.jws_qzsj4 = jws_qzsj4;
    }
    public String getJws_qzsj5() {
        return this.jws_qzsj5;
    }
    public void setJws_qzsj5(String jws_qzsj5) {
        this.jws_qzsj5 = jws_qzsj5;
    }
    public String getJws_qzsj6() {
        return this.jws_qzsj6;
    }
    public void setJws_qzsj6(String jws_qzsj6) {
        this.jws_qzsj6 = jws_qzsj6;
    }
    public String getJws_exzl() {
        return this.jws_exzl;
    }
    public void setJws_exzl(String jws_exzl) {
        this.jws_exzl = jws_exzl;
    }
    public String getJws_zyb() {
        return this.jws_zyb;
    }
    public void setJws_zyb(String jws_zyb) {
        this.jws_zyb = jws_zyb;
    }
    public String getJws_other() {
        return this.jws_other;
    }
    public void setJws_other(String jws_other) {
        this.jws_other = jws_other;
    }
    public int getJws_ss() {
        return this.jws_ss;
    }
    public void setJws_ss(int jws_ss) {
        this.jws_ss = jws_ss;
    }
    public String getJws_ssmc1() {
        return this.jws_ssmc1;
    }
    public void setJws_ssmc1(String jws_ssmc1) {
        this.jws_ssmc1 = jws_ssmc1;
    }
    public String getJws_ssmc2() {
        return this.jws_ssmc2;
    }
    public void setJws_ssmc2(String jws_ssmc2) {
        this.jws_ssmc2 = jws_ssmc2;
    }
    public String getJws_sssj1() {
        return this.jws_sssj1;
    }
    public void setJws_sssj1(String jws_sssj1) {
        this.jws_sssj1 = jws_sssj1;
    }
    public String getJws_sssj2() {
        return this.jws_sssj2;
    }
    public void setJws_sssj2(String jws_sssj2) {
        this.jws_sssj2 = jws_sssj2;
    }
    public int getJws_ws() {
        return this.jws_ws;
    }
    public void setJws_ws(int jws_ws) {
        this.jws_ws = jws_ws;
    }
    public String getJws_wsmc1() {
        return this.jws_wsmc1;
    }
    public void setJws_wsmc1(String jws_wsmc1) {
        this.jws_wsmc1 = jws_wsmc1;
    }
    public String getJws_wsmc2() {
        return this.jws_wsmc2;
    }
    public void setJws_wsmc2(String jws_wsmc2) {
        this.jws_wsmc2 = jws_wsmc2;
    }
    public String getJws_wssj1() {
        return this.jws_wssj1;
    }
    public void setJws_wssj1(String jws_wssj1) {
        this.jws_wssj1 = jws_wssj1;
    }
    public String getJws_wssj2() {
        return this.jws_wssj2;
    }
    public void setJws_wssj2(String jws_wssj2) {
        this.jws_wssj2 = jws_wssj2;
    }
    public int getSymptom_id() {
        return this.symptom_id;
    }
    public void setSymptom_id(int symptom_id) {
        this.symptom_id = symptom_id;
    }
    public int getJws_sx() {
        return this.jws_sx;
    }
    public void setJws_sx(int jws_sx) {
        this.jws_sx = jws_sx;
    }
    public String getJws_sxyy1() {
        return this.jws_sxyy1;
    }
    public void setJws_sxyy1(String jws_sxyy1) {
        this.jws_sxyy1 = jws_sxyy1;
    }
    public String getJws_sxyy2() {
        return this.jws_sxyy2;
    }
    public void setJws_sxyy2(String jws_sxyy2) {
        this.jws_sxyy2 = jws_sxyy2;
    }
    public String getJws_sxsj1() {
        return this.jws_sxsj1;
    }
    public void setJws_sxsj1(String jws_sxsj1) {
        this.jws_sxsj1 = jws_sxsj1;
    }
    public String getJws_sxsj2() {
        return this.jws_sxsj2;
    }
    public void setJws_sxsj2(String jws_sxsj2) {
        this.jws_sxsj2 = jws_sxsj2;
    }
    public int getJzs_father() {
        return this.jzs_father;
    }
    public void setJzs_father(int jzs_father) {
        this.jzs_father = jzs_father;
    }
    public int getJzs_mother() {
        return this.jzs_mother;
    }
    public void setJzs_mother(int jzs_mother) {
        this.jzs_mother = jzs_mother;
    }
    public int getJzs_brother_sister() {
        return this.jzs_brother_sister;
    }
    public void setJzs_brother_sister(int jzs_brother_sister) {
        this.jzs_brother_sister = jzs_brother_sister;
    }
    public int getJzs_child() {
        return this.jzs_child;
    }
    public void setJzs_child(int jzs_child) {
        this.jzs_child = jzs_child;
    }
    public int getShhj_cfss() {
        return this.shhj_cfss;
    }
    public void setShhj_cfss(int shhj_cfss) {
        this.shhj_cfss = shhj_cfss;
    }
    public int getShhj_rllx() {
        return this.shhj_rllx;
    }
    public void setShhj_rllx(int shhj_rllx) {
        this.shhj_rllx = shhj_rllx;
    }
    public int getShhj_ys() {
        return this.shhj_ys;
    }
    public void setShhj_ys(int shhj_ys) {
        this.shhj_ys = shhj_ys;
    }
    public int getShhj_cs() {
        return this.shhj_cs;
    }
    public void setShhj_cs(int shhj_cs) {
        this.shhj_cs = shhj_cs;
    }
    public int getShhj_qcl() {
        return this.shhj_qcl;
    }
    public void setShhj_qcl(int shhj_qcl) {
        this.shhj_qcl = shhj_qcl;
    }
    public String getBs_id() {
        return this.bs_id;
    }
    public void setBs_id(String bs_id) {
        this.bs_id = bs_id;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
