package com.example.administrator.biaozhunban.greendao.daomanager;

import android.content.Context;

import com.example.administrator.biaozhunban.greendao.DaoMaster;
import com.example.administrator.biaozhunban.greendao.DaoSession;

/**
 * Created by Administrator on 2018/1/26.
 */

public class DaoManager {
    private static final Object lock = new Object();
    private static DaoManager daoManager;
    private DaoSession daoSession;

    public void initDao(Context context){
        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(context.getApplicationContext(),"data.db",null);
        DaoMaster daoMaster = new DaoMaster(openHelper.getWritableDb());
        daoSession = daoMaster.newSession();
    }

    public static DaoManager getInstance(){
        if(daoManager==null){
            synchronized (lock){
                if(daoManager==null)
                    daoManager=new DaoManager();
            }
        }
        return daoManager;
    }

    public DaoSession getDaoSession(){
        if(daoSession==null) throw new IllegalStateException("daoSession is NULL , Need To Init DaoManager First!");
        else return daoSession;
    }
}
