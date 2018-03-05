package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/29.
 * 预防接种服务--疫苗与剂次
 */
@Entity
public class Yimiao {
    @Id(autoincrement = true)
    private Long ym_id;
    @NotNull
    private String yfjz_id;//预防接种服务 Id
    @NotNull
    private int ym_type;//'0:其他, 1:乙肝, 2:卡介苗, 3:脊灰疫苗, 4:百白破, 5:白破, 6:麻风, 7:麻腮风, 8:麻腮, 9:麻疹, 10:A群流脑, 11:AC群流脑, 12:乙脑活, 13:乙脑灭活, 14:甲肝解毒活, 15:甲肝灭活',
    private String ym_name;//其他疫苗--名称
    @NotNull
    private String ym_date;//接种时间
    private String ym_bw;//接种部位
    private String ym_ph;//疫苗批号
    private String ym_ys;//接种医生
    private String ym_bz;//备注

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;


    @Generated(hash = 1376413669)
    public Yimiao(Long ym_id, @NotNull String yfjz_id, int ym_type, String ym_name, @NotNull String ym_date, String ym_bw, String ym_ph, String ym_ys,
            String ym_bz, String createDate) {
        this.ym_id = ym_id;
        this.yfjz_id = yfjz_id;
        this.ym_type = ym_type;
        this.ym_name = ym_name;
        this.ym_date = ym_date;
        this.ym_bw = ym_bw;
        this.ym_ph = ym_ph;
        this.ym_ys = ym_ys;
        this.ym_bz = ym_bz;
        this.createDate = createDate;
    }
    @Generated(hash = 1902778073)
    public Yimiao() {
    }
    public Long getYm_id() {
        return this.ym_id;
    }
    public void setYm_id(Long ym_id) {
        this.ym_id = ym_id;
    }
    public String getYfjz_id() {
        return this.yfjz_id;
    }
    public void setYfjz_id(String yfjz_id) {
        this.yfjz_id = yfjz_id;
    }
    public int getYm_type() {
        return this.ym_type;
    }
    public void setYm_type(int ym_type) {
        this.ym_type = ym_type;
    }
    public String getYm_name() {
        return this.ym_name;
    }
    public void setYm_name(String ym_name) {
        this.ym_name = ym_name;
    }
    public String getYm_date() {
        return this.ym_date;
    }
    public void setYm_date(String ym_date) {
        this.ym_date = ym_date;
    }
    public String getYm_bw() {
        return this.ym_bw;
    }
    public void setYm_bw(String ym_bw) {
        this.ym_bw = ym_bw;
    }
    public String getYm_ph() {
        return this.ym_ph;
    }
    public void setYm_ph(String ym_ph) {
        this.ym_ph = ym_ph;
    }
    public String getYm_ys() {
        return this.ym_ys;
    }
    public void setYm_ys(String ym_ys) {
        this.ym_ys = ym_ys;
    }
    public String getYm_bz() {
        return this.ym_bz;
    }
    public void setYm_bz(String ym_bz) {
        this.ym_bz = ym_bz;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
