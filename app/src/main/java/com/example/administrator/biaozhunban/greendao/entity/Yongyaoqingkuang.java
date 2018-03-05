package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 主要用药情况
 */
@Entity
public class Yongyaoqingkuang {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String yyqk_id;//用药情况ID
    @NotNull
    private String jktj_id;//健康体检表ID
    private String yyqk_ywmc;//药物名称
    private String yyqk_yf;//用法
    private String yyqk_yl;//用量
    private String yyqk_yysj;//用药时间
    private int yyqk_ycx;//服药依从性

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;


    @Generated(hash = 67446633)
    public Yongyaoqingkuang(Long id, @NotNull String yyqk_id,
            @NotNull String jktj_id, String yyqk_ywmc, String yyqk_yf,
            String yyqk_yl, String yyqk_yysj, int yyqk_ycx, String createDate) {
        this.id = id;
        this.yyqk_id = yyqk_id;
        this.jktj_id = jktj_id;
        this.yyqk_ywmc = yyqk_ywmc;
        this.yyqk_yf = yyqk_yf;
        this.yyqk_yl = yyqk_yl;
        this.yyqk_yysj = yyqk_yysj;
        this.yyqk_ycx = yyqk_ycx;
        this.createDate = createDate;
    }
    @Generated(hash = 915771266)
    public Yongyaoqingkuang() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getYyqk_id() {
        return this.yyqk_id;
    }
    public void setYyqk_id(String yyqk_id) {
        this.yyqk_id = yyqk_id;
    }
    public String getJktj_id() {
        return this.jktj_id;
    }
    public void setJktj_id(String jktj_id) {
        this.jktj_id = jktj_id;
    }
    public String getYyqk_ywmc() {
        return this.yyqk_ywmc;
    }
    public void setYyqk_ywmc(String yyqk_ywmc) {
        this.yyqk_ywmc = yyqk_ywmc;
    }
    public String getYyqk_yf() {
        return this.yyqk_yf;
    }
    public void setYyqk_yf(String yyqk_yf) {
        this.yyqk_yf = yyqk_yf;
    }
    public String getYyqk_yl() {
        return this.yyqk_yl;
    }
    public void setYyqk_yl(String yyqk_yl) {
        this.yyqk_yl = yyqk_yl;
    }
    public String getYyqk_yysj() {
        return this.yyqk_yysj;
    }
    public void setYyqk_yysj(String yyqk_yysj) {
        this.yyqk_yysj = yyqk_yysj;
    }
    public int getYyqk_ycx() {
        return this.yyqk_ycx;
    }
    public void setYyqk_ycx(int yyqk_ycx) {
        this.yyqk_ycx = yyqk_ycx;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
