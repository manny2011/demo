package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 传染病类型  (固定数据|需要初始化到数据库)
 */
@Entity
public class ChuanRanBingLeiXing {
    @Id(autoincrement = true)
    private Long crb_type_id;
    private String crb_type_name;//

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;
    @Generated(hash = 1873392059)
    public ChuanRanBingLeiXing(Long crb_type_id, String crb_type_name,
            String createDate) {
        this.crb_type_id = crb_type_id;
        this.crb_type_name = crb_type_name;
        this.createDate = createDate;
    }
    @Generated(hash = 1414310304)
    public ChuanRanBingLeiXing() {
    }
    public Long getCrb_type_id() {
        return this.crb_type_id;
    }
    public void setCrb_type_id(Long crb_type_id) {
        this.crb_type_id = crb_type_id;
    }
    public String getCrb_type_name() {
        return this.crb_type_name;
    }
    public void setCrb_type_name(String crb_type_name) {
        this.crb_type_name = crb_type_name;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

}
