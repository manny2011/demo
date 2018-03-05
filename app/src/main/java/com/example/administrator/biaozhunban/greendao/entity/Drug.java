package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/1/30.
 * 药品表
 * (TODO 后期要改的!)
 */
@Entity
public class Drug {
    @Id(autoincrement = true)
    private Long id;
    private String gid;//药品id
    private String createuser;//创建人
    private String createtime;//创建时间
    private String isvalid;//
    private String upflag;//
    private String type;//
    private String dictgid;//
    private String code;//
    private String name;//药品名称
    private String bcode;//
    private String sfid;//
    private String jxid;//
    private String unit;//
    private String unitprice;//
    private String smallunit;//
    private String smallunitconv;//
    private String smallunitdose;//
    private String doseunit;//
    private String spec;//
    private String factory;//
    private String stock;//
    private String maxstock;//
    private String minstock;//

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 1206610501)
    public Drug(Long id, String gid, String createuser, String createtime,
            String isvalid, String upflag, String type, String dictgid, String code,
            String name, String bcode, String sfid, String jxid, String unit,
            String unitprice, String smallunit, String smallunitconv,
            String smallunitdose, String doseunit, String spec, String factory,
            String stock, String maxstock, String minstock, String createDate) {
        this.id = id;
        this.gid = gid;
        this.createuser = createuser;
        this.createtime = createtime;
        this.isvalid = isvalid;
        this.upflag = upflag;
        this.type = type;
        this.dictgid = dictgid;
        this.code = code;
        this.name = name;
        this.bcode = bcode;
        this.sfid = sfid;
        this.jxid = jxid;
        this.unit = unit;
        this.unitprice = unitprice;
        this.smallunit = smallunit;
        this.smallunitconv = smallunitconv;
        this.smallunitdose = smallunitdose;
        this.doseunit = doseunit;
        this.spec = spec;
        this.factory = factory;
        this.stock = stock;
        this.maxstock = maxstock;
        this.minstock = minstock;
        this.createDate = createDate;
    }
    @Generated(hash = 90337038)
    public Drug() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getGid() {
        return this.gid;
    }
    public void setGid(String gid) {
        this.gid = gid;
    }
    public String getCreateuser() {
        return this.createuser;
    }
    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }
    public String getCreatetime() {
        return this.createtime;
    }
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
    public String getIsvalid() {
        return this.isvalid;
    }
    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid;
    }
    public String getUpflag() {
        return this.upflag;
    }
    public void setUpflag(String upflag) {
        this.upflag = upflag;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDictgid() {
        return this.dictgid;
    }
    public void setDictgid(String dictgid) {
        this.dictgid = dictgid;
    }
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBcode() {
        return this.bcode;
    }
    public void setBcode(String bcode) {
        this.bcode = bcode;
    }
    public String getSfid() {
        return this.sfid;
    }
    public void setSfid(String sfid) {
        this.sfid = sfid;
    }
    public String getJxid() {
        return this.jxid;
    }
    public void setJxid(String jxid) {
        this.jxid = jxid;
    }
    public String getUnit() {
        return this.unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getUnitprice() {
        return this.unitprice;
    }
    public void setUnitprice(String unitprice) {
        this.unitprice = unitprice;
    }
    public String getSmallunit() {
        return this.smallunit;
    }
    public void setSmallunit(String smallunit) {
        this.smallunit = smallunit;
    }
    public String getSmallunitconv() {
        return this.smallunitconv;
    }
    public void setSmallunitconv(String smallunitconv) {
        this.smallunitconv = smallunitconv;
    }
    public String getSmallunitdose() {
        return this.smallunitdose;
    }
    public void setSmallunitdose(String smallunitdose) {
        this.smallunitdose = smallunitdose;
    }
    public String getDoseunit() {
        return this.doseunit;
    }
    public void setDoseunit(String doseunit) {
        this.doseunit = doseunit;
    }
    public String getSpec() {
        return this.spec;
    }
    public void setSpec(String spec) {
        this.spec = spec;
    }
    public String getFactory() {
        return this.factory;
    }
    public void setFactory(String factory) {
        this.factory = factory;
    }
    public String getStock() {
        return this.stock;
    }
    public void setStock(String stock) {
        this.stock = stock;
    }
    public String getMaxstock() {
        return this.maxstock;
    }
    public void setMaxstock(String maxstock) {
        this.maxstock = maxstock;
    }
    public String getMinstock() {
        return this.minstock;
    }
    public void setMinstock(String minstock) {
        this.minstock = minstock;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
