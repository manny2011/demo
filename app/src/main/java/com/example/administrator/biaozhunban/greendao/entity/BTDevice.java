package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018/2/4.
 */
@Entity
public class BTDevice {
    @Id(autoincrement = true)
    private Long id;
    private String deviceName;
    @NotNull
    private String alias;
    @NotNull
    @Unique
    private String address;
    private String pairDate;

    @Transient
    private int tempOrder;//临时的排列序号
    private String createDate;

    @Generated(hash = 297624678)
    public BTDevice(Long id, String deviceName, @NotNull String alias,
            @NotNull String address, String pairDate, String createDate) {
        this.id = id;
        this.deviceName = deviceName;
        this.alias = alias;
        this.address = address;
        this.pairDate = pairDate;
        this.createDate = createDate;
    }
    @Generated(hash = 1268407415)
    public BTDevice() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDeviceName() {
        return this.deviceName;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public String getAlias() {
        return this.alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPairDate() {
        return this.pairDate;
    }
    public void setPairDate(String pairDate) {
        this.pairDate = pairDate;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

}
