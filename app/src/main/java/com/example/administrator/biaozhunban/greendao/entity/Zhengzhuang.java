package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 各个检查项的症状
 */
@Entity
public class Zhengzhuang {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String symptom_id;//
    @NotNull
    private String gw_type;//0精神病，1糖尿病，2高血压，3健康体检表
    @NotNull
    private String symptom_name;//症状名

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 170474478)
    public Zhengzhuang(Long id, @NotNull String symptom_id, @NotNull String gw_type,
            @NotNull String symptom_name, String createDate) {
        this.id = id;
        this.symptom_id = symptom_id;
        this.gw_type = gw_type;
        this.symptom_name = symptom_name;
        this.createDate = createDate;
    }
    @Generated(hash = 275921900)
    public Zhengzhuang() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSymptom_id() {
        return this.symptom_id;
    }
    public void setSymptom_id(String symptom_id) {
        this.symptom_id = symptom_id;
    }
    public String getGw_type() {
        return this.gw_type;
    }
    public void setGw_type(String gw_type) {
        this.gw_type = gw_type;
    }
    public String getSymptom_name() {
        return this.symptom_name;
    }
    public void setSymptom_name(String symptom_name) {
        this.symptom_name = symptom_name;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
