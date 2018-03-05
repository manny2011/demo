package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 住院治疗情况
 */
@Entity
public class Zhuyuanzhiliaoqingkuang {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String zyzl_id;//住院治疗ID
    @NotNull
    private String jktj_id;//健康体检表ID
    private int zyzl_type;//类型 0住院史  1家庭病床史
    private String zyzl_ru;//入院/建床 日期
    private String zyzl_chu;//出院/撤床 日期
    private String zyzl_yy;//原因
    private String zyzl_jg;//医疗机构名称
    private String zyzl_ba;//病案号

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 433195995)
    public Zhuyuanzhiliaoqingkuang(Long id, @NotNull String zyzl_id,
            @NotNull String jktj_id, int zyzl_type, String zyzl_ru, String zyzl_chu,
            String zyzl_yy, String zyzl_jg, String zyzl_ba, String createDate) {
        this.id = id;
        this.zyzl_id = zyzl_id;
        this.jktj_id = jktj_id;
        this.zyzl_type = zyzl_type;
        this.zyzl_ru = zyzl_ru;
        this.zyzl_chu = zyzl_chu;
        this.zyzl_yy = zyzl_yy;
        this.zyzl_jg = zyzl_jg;
        this.zyzl_ba = zyzl_ba;
        this.createDate = createDate;
    }
    @Generated(hash = 1085459196)
    public Zhuyuanzhiliaoqingkuang() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getZyzl_id() {
        return this.zyzl_id;
    }
    public void setZyzl_id(String zyzl_id) {
        this.zyzl_id = zyzl_id;
    }
    public String getJktj_id() {
        return this.jktj_id;
    }
    public void setJktj_id(String jktj_id) {
        this.jktj_id = jktj_id;
    }
    public int getZyzl_type() {
        return this.zyzl_type;
    }
    public void setZyzl_type(int zyzl_type) {
        this.zyzl_type = zyzl_type;
    }
    public String getZyzl_ru() {
        return this.zyzl_ru;
    }
    public void setZyzl_ru(String zyzl_ru) {
        this.zyzl_ru = zyzl_ru;
    }
    public String getZyzl_chu() {
        return this.zyzl_chu;
    }
    public void setZyzl_chu(String zyzl_chu) {
        this.zyzl_chu = zyzl_chu;
    }
    public String getZyzl_yy() {
        return this.zyzl_yy;
    }
    public void setZyzl_yy(String zyzl_yy) {
        this.zyzl_yy = zyzl_yy;
    }
    public String getZyzl_jg() {
        return this.zyzl_jg;
    }
    public void setZyzl_jg(String zyzl_jg) {
        this.zyzl_jg = zyzl_jg;
    }
    public String getZyzl_ba() {
        return this.zyzl_ba;
    }
    public void setZyzl_ba(String zyzl_ba) {
        this.zyzl_ba = zyzl_ba;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
