package com.example.administrator.biaozhunban.greendao.entity;

import org.greenrobot.greendao.annotation.Transient;

/**
 * Created by Administrator on 2018/2/7.
 */

public class BaseEntity {
    //    private String xuHao;//调整后,随时更新,从小至大排列
//    private String chuangJianRiQi;//创建日期
//    private String xingQiJi;//周几
//    private String biaoMing;//表名称
    @Transient
    public int tempOrder;//临时的排列序号
}
