package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * '健康体检表 C （中医体质、现存健康问题、健康评价与指导）'
 * *关联A表*
 */
@Entity
public class JianKangTiJianBiao_C {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String jktj2_id;
    @NotNull
    private String jktj_id;//健康体检表ID
    private int jktj2_maintz;//主体质
    private String jktj2_othertz;//倾向体质 ，分割
    private int jktj2_naoxg;//现存主要健康问题------脑血管疾病
    private int jktj2_shenz;//肾脏疾病
    private int jktj2_xinz;//心脏疾病
    private int jktj2_xueg;//血管疾病
    private int jktj2_yanb;//眼部疾病
    private int jktj2_shenjx;//神经系统疾病 0未发现， 1有
    private String jktj2_shenjx_ms;//神经系统疾病 描述
    private int jktj2_qitjb;//其他系统疾病 0未发现， 1有
    private String jktj2_qitjb_ms;//其他系统疾病 描述
    private int jktj2_jkpj;//健康评价 0体检无异常， 1有异常
    private String jktj2_jkyc1;//异常描述1
    private String jktj2_jkyc2;//异常描述2
    private String jktj2_jkyc3;//异常描述3
    private String jktj2_jkyc4;//异常描述4
    private int jktj2_jiany;//健康指导------建议
    private int jktj2_wxys;//危险因素控制
    private String jktj2_mbtz;//减体重 (目标)
    private String jktj2_jyym;//建议接种疫苗
    private String jktj2_bz;//其他（备注）

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 827945366)
    public JianKangTiJianBiao_C(Long id, @NotNull String jktj2_id,
            @NotNull String jktj_id, int jktj2_maintz, String jktj2_othertz,
            int jktj2_naoxg, int jktj2_shenz, int jktj2_xinz, int jktj2_xueg,
            int jktj2_yanb, int jktj2_shenjx, String jktj2_shenjx_ms,
            int jktj2_qitjb, String jktj2_qitjb_ms, int jktj2_jkpj,
            String jktj2_jkyc1, String jktj2_jkyc2, String jktj2_jkyc3,
            String jktj2_jkyc4, int jktj2_jiany, int jktj2_wxys, String jktj2_mbtz,
            String jktj2_jyym, String jktj2_bz, String createDate) {
        this.id = id;
        this.jktj2_id = jktj2_id;
        this.jktj_id = jktj_id;
        this.jktj2_maintz = jktj2_maintz;
        this.jktj2_othertz = jktj2_othertz;
        this.jktj2_naoxg = jktj2_naoxg;
        this.jktj2_shenz = jktj2_shenz;
        this.jktj2_xinz = jktj2_xinz;
        this.jktj2_xueg = jktj2_xueg;
        this.jktj2_yanb = jktj2_yanb;
        this.jktj2_shenjx = jktj2_shenjx;
        this.jktj2_shenjx_ms = jktj2_shenjx_ms;
        this.jktj2_qitjb = jktj2_qitjb;
        this.jktj2_qitjb_ms = jktj2_qitjb_ms;
        this.jktj2_jkpj = jktj2_jkpj;
        this.jktj2_jkyc1 = jktj2_jkyc1;
        this.jktj2_jkyc2 = jktj2_jkyc2;
        this.jktj2_jkyc3 = jktj2_jkyc3;
        this.jktj2_jkyc4 = jktj2_jkyc4;
        this.jktj2_jiany = jktj2_jiany;
        this.jktj2_wxys = jktj2_wxys;
        this.jktj2_mbtz = jktj2_mbtz;
        this.jktj2_jyym = jktj2_jyym;
        this.jktj2_bz = jktj2_bz;
        this.createDate = createDate;
    }
    @Generated(hash = 1602701084)
    public JianKangTiJianBiao_C() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getJktj2_id() {
        return this.jktj2_id;
    }
    public void setJktj2_id(String jktj2_id) {
        this.jktj2_id = jktj2_id;
    }
    public String getJktj_id() {
        return this.jktj_id;
    }
    public void setJktj_id(String jktj_id) {
        this.jktj_id = jktj_id;
    }
    public int getJktj2_maintz() {
        return this.jktj2_maintz;
    }
    public void setJktj2_maintz(int jktj2_maintz) {
        this.jktj2_maintz = jktj2_maintz;
    }
    public String getJktj2_othertz() {
        return this.jktj2_othertz;
    }
    public void setJktj2_othertz(String jktj2_othertz) {
        this.jktj2_othertz = jktj2_othertz;
    }
    public int getJktj2_naoxg() {
        return this.jktj2_naoxg;
    }
    public void setJktj2_naoxg(int jktj2_naoxg) {
        this.jktj2_naoxg = jktj2_naoxg;
    }
    public int getJktj2_shenz() {
        return this.jktj2_shenz;
    }
    public void setJktj2_shenz(int jktj2_shenz) {
        this.jktj2_shenz = jktj2_shenz;
    }
    public int getJktj2_xinz() {
        return this.jktj2_xinz;
    }
    public void setJktj2_xinz(int jktj2_xinz) {
        this.jktj2_xinz = jktj2_xinz;
    }
    public int getJktj2_xueg() {
        return this.jktj2_xueg;
    }
    public void setJktj2_xueg(int jktj2_xueg) {
        this.jktj2_xueg = jktj2_xueg;
    }
    public int getJktj2_yanb() {
        return this.jktj2_yanb;
    }
    public void setJktj2_yanb(int jktj2_yanb) {
        this.jktj2_yanb = jktj2_yanb;
    }
    public int getJktj2_shenjx() {
        return this.jktj2_shenjx;
    }
    public void setJktj2_shenjx(int jktj2_shenjx) {
        this.jktj2_shenjx = jktj2_shenjx;
    }
    public String getJktj2_shenjx_ms() {
        return this.jktj2_shenjx_ms;
    }
    public void setJktj2_shenjx_ms(String jktj2_shenjx_ms) {
        this.jktj2_shenjx_ms = jktj2_shenjx_ms;
    }
    public int getJktj2_qitjb() {
        return this.jktj2_qitjb;
    }
    public void setJktj2_qitjb(int jktj2_qitjb) {
        this.jktj2_qitjb = jktj2_qitjb;
    }
    public String getJktj2_qitjb_ms() {
        return this.jktj2_qitjb_ms;
    }
    public void setJktj2_qitjb_ms(String jktj2_qitjb_ms) {
        this.jktj2_qitjb_ms = jktj2_qitjb_ms;
    }
    public int getJktj2_jkpj() {
        return this.jktj2_jkpj;
    }
    public void setJktj2_jkpj(int jktj2_jkpj) {
        this.jktj2_jkpj = jktj2_jkpj;
    }
    public String getJktj2_jkyc1() {
        return this.jktj2_jkyc1;
    }
    public void setJktj2_jkyc1(String jktj2_jkyc1) {
        this.jktj2_jkyc1 = jktj2_jkyc1;
    }
    public String getJktj2_jkyc2() {
        return this.jktj2_jkyc2;
    }
    public void setJktj2_jkyc2(String jktj2_jkyc2) {
        this.jktj2_jkyc2 = jktj2_jkyc2;
    }
    public String getJktj2_jkyc3() {
        return this.jktj2_jkyc3;
    }
    public void setJktj2_jkyc3(String jktj2_jkyc3) {
        this.jktj2_jkyc3 = jktj2_jkyc3;
    }
    public String getJktj2_jkyc4() {
        return this.jktj2_jkyc4;
    }
    public void setJktj2_jkyc4(String jktj2_jkyc4) {
        this.jktj2_jkyc4 = jktj2_jkyc4;
    }
    public int getJktj2_jiany() {
        return this.jktj2_jiany;
    }
    public void setJktj2_jiany(int jktj2_jiany) {
        this.jktj2_jiany = jktj2_jiany;
    }
    public int getJktj2_wxys() {
        return this.jktj2_wxys;
    }
    public void setJktj2_wxys(int jktj2_wxys) {
        this.jktj2_wxys = jktj2_wxys;
    }
    public String getJktj2_mbtz() {
        return this.jktj2_mbtz;
    }
    public void setJktj2_mbtz(String jktj2_mbtz) {
        this.jktj2_mbtz = jktj2_mbtz;
    }
    public String getJktj2_jyym() {
        return this.jktj2_jyym;
    }
    public void setJktj2_jyym(String jktj2_jyym) {
        this.jktj2_jyym = jktj2_jyym;
    }
    public String getJktj2_bz() {
        return this.jktj2_bz;
    }
    public void setJktj2_bz(String jktj2_bz) {
        this.jktj2_bz = jktj2_bz;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
