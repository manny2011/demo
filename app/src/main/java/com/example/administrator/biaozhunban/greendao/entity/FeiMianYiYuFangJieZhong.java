package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 非免疫预防接种
 */
@Entity
public class FeiMianYiYuFangJieZhong {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String fmyjz_id;
    @NotNull
    private String jktj_id;//健康体检表 Id
    private String fmyjz_name;//接种名称
    private String fmyjz_date;//接种日期
    private String fmyjz_jzjg;//接种机构

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 412894091)
    public FeiMianYiYuFangJieZhong(Long id, @NotNull String fmyjz_id,
            @NotNull String jktj_id, String fmyjz_name, String fmyjz_date,
            String fmyjz_jzjg, String createDate) {
        this.id = id;
        this.fmyjz_id = fmyjz_id;
        this.jktj_id = jktj_id;
        this.fmyjz_name = fmyjz_name;
        this.fmyjz_date = fmyjz_date;
        this.fmyjz_jzjg = fmyjz_jzjg;
        this.createDate = createDate;
    }
    @Generated(hash = 1523083772)
    public FeiMianYiYuFangJieZhong() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFmyjz_id() {
        return this.fmyjz_id;
    }
    public void setFmyjz_id(String fmyjz_id) {
        this.fmyjz_id = fmyjz_id;
    }
    public String getJktj_id() {
        return this.jktj_id;
    }
    public void setJktj_id(String jktj_id) {
        this.jktj_id = jktj_id;
    }
    public String getFmyjz_name() {
        return this.fmyjz_name;
    }
    public void setFmyjz_name(String fmyjz_name) {
        this.fmyjz_name = fmyjz_name;
    }
    public String getFmyjz_date() {
        return this.fmyjz_date;
    }
    public void setFmyjz_date(String fmyjz_date) {
        this.fmyjz_date = fmyjz_date;
    }
    public String getFmyjz_jzjg() {
        return this.fmyjz_jzjg;
    }
    public void setFmyjz_jzjg(String fmyjz_jzjg) {
        this.fmyjz_jzjg = fmyjz_jzjg;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
