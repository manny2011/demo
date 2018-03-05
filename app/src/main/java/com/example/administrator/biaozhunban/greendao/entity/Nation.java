package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 * 民族表
 */
@Entity
public class Nation {
    @Id(autoincrement = true)
    private Long nation_id;
    @NotNull
    private String nation_name;

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 57139059)
    public Nation(Long nation_id, @NotNull String nation_name, String createDate) {
        this.nation_id = nation_id;
        this.nation_name = nation_name;
        this.createDate = createDate;
    }
    @Generated(hash = 1001640953)
    public Nation() {
    }
    public Long getNation_id() {
        return this.nation_id;
    }
    public void setNation_id(Long nation_id) {
        this.nation_id = nation_id;
    }
    public String getNation_name() {
        return this.nation_name;
    }
    public void setNation_name(String nation_name) {
        this.nation_name = nation_name;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
