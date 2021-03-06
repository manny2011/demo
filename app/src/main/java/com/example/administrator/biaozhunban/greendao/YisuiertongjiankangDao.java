package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.Yisuiertongjiankang;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "YISUIERTONGJIANKANG".
*/
public class YisuiertongjiankangDao extends AbstractDao<Yisuiertongjiankang, Long> {

    public static final String TABLENAME = "YISUIERTONGJIANKANG";

    /**
     * Properties of entity Yisuiertongjiankang.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Ysjk_id = new Property(1, String.class, "ysjk_id", false, "YSJK_ID");
        public final static Property Na_id = new Property(2, String.class, "na_id", false, "NA_ID");
        public final static Property Months_age = new Property(3, int.class, "months_age", false, "MONTHS_AGE");
        public final static Property Check_date = new Property(4, String.class, "check_date", false, "CHECK_DATE");
        public final static Property Hw_id = new Property(5, String.class, "hw_id", false, "HW_ID");
        public final static Property Tiz_develop = new Property(6, int.class, "tiz_develop", false, "TIZ_DEVELOP");
        public final static Property Sg_develop = new Property(7, int.class, "sg_develop", false, "SG_DEVELOP");
        public final static Property Ys_head = new Property(8, String.class, "ys_head", false, "YS_HEAD");
        public final static Property Ys__complexion = new Property(9, int.class, "ys__complexion", false, "YS__COMPLEXION");
        public final static Property Ys_skin = new Property(10, int.class, "ys_skin", false, "YS_SKIN");
        public final static Property Ys_qianx = new Property(11, int.class, "ys_qianx", false, "YS_QIANX");
        public final static Property Ys_qxcmx = new Property(12, String.class, "ys_qxcmx", false, "YS_QXCMX");
        public final static Property Ys_qxcm = new Property(13, String.class, "ys_qxcm", false, "YS_QXCM");
        public final static Property Ys_jbbk = new Property(14, int.class, "ys_jbbk", false, "YS_JBBK");
        public final static Property Ys_yanwg = new Property(15, int.class, "ys_yanwg", false, "YS_YANWG");
        public final static Property Ys_erwg = new Property(16, int.class, "ys_erwg", false, "YS_ERWG");
        public final static Property Ys_tingl = new Property(17, int.class, "ys_tingl", false, "YS_TINGL");
        public final static Property Ys_oral_cavity = new Property(18, int.class, "ys_oral_cavity", false, "YS_ORAL_CAVITY");
        public final static Property Ys_xinf = new Property(19, int.class, "ys_xinf", false, "YS_XINF");
        public final static Property Ys_fub = new Property(20, int.class, "ys_fub", false, "YS_FUB");
        public final static Property Ys_qib = new Property(21, int.class, "ys_qib", false, "YS_QIB");
        public final static Property Ys_gmwszq = new Property(22, int.class, "ys_gmwszq", false, "YS_GMWSZQ");
        public final static Property Ys_glb_zz = new Property(23, int.class, "ys_glb_zz", false, "YS_GLB_ZZ");
        public final static Property Ys_glb_tz = new Property(24, int.class, "ys_glb_tz", false, "YS_GLB_TZ");
        public final static Property Ys_activity = new Property(25, String.class, "ys_activity", false, "YS_ACTIVITY");
        public final static Property Ys_fuyvd = new Property(26, String.class, "ys_fuyvd", false, "YS_FUYVD");
        public final static Property Ys_faypg = new Property(27, int.class, "ys_faypg", false, "YS_FAYPG");
        public final static Property Ys_lcsfqk = new Property(28, int.class, "ys_lcsfqk", false, "YS_LCSFQK");
        public final static Property Ys_other = new Property(29, String.class, "ys_other", false, "YS_OTHER");
        public final static Property Ys_zzjy = new Property(30, int.class, "ys_zzjy", false, "YS_ZZJY");
        public final static Property Ys_zzyy = new Property(31, String.class, "ys_zzyy", false, "YS_ZZYY");
        public final static Property Ys_jgks = new Property(32, String.class, "ys_jgks", false, "YS_JGKS");
        public final static Property Ys_zhid = new Property(33, int.class, "ys_zhid", false, "YS_ZHID");
        public final static Property Ys_next_date = new Property(34, String.class, "ys_next_date", false, "YS_NEXT_DATE");
        public final static Property Ys_doctor = new Property(35, String.class, "ys_doctor", false, "YS_DOCTOR");
        public final static Property Xhdb_id = new Property(36, String.class, "xhdb_id", false, "XHDB_ID");
        public final static Property Ys_szjk = new Property(37, int.class, "ys_szjk", false, "YS_SZJK");
        public final static Property CreateDate = new Property(38, String.class, "createDate", false, "CREATE_DATE");
    }


    public YisuiertongjiankangDao(DaoConfig config) {
        super(config);
    }
    
    public YisuiertongjiankangDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"YISUIERTONGJIANKANG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"YSJK_ID\" TEXT NOT NULL ," + // 1: ysjk_id
                "\"NA_ID\" TEXT," + // 2: na_id
                "\"MONTHS_AGE\" INTEGER NOT NULL ," + // 3: months_age
                "\"CHECK_DATE\" TEXT," + // 4: check_date
                "\"HW_ID\" TEXT," + // 5: hw_id
                "\"TIZ_DEVELOP\" INTEGER NOT NULL ," + // 6: tiz_develop
                "\"SG_DEVELOP\" INTEGER NOT NULL ," + // 7: sg_develop
                "\"YS_HEAD\" TEXT," + // 8: ys_head
                "\"YS__COMPLEXION\" INTEGER NOT NULL ," + // 9: ys__complexion
                "\"YS_SKIN\" INTEGER NOT NULL ," + // 10: ys_skin
                "\"YS_QIANX\" INTEGER NOT NULL ," + // 11: ys_qianx
                "\"YS_QXCMX\" TEXT," + // 12: ys_qxcmx
                "\"YS_QXCM\" TEXT," + // 13: ys_qxcm
                "\"YS_JBBK\" INTEGER NOT NULL ," + // 14: ys_jbbk
                "\"YS_YANWG\" INTEGER NOT NULL ," + // 15: ys_yanwg
                "\"YS_ERWG\" INTEGER NOT NULL ," + // 16: ys_erwg
                "\"YS_TINGL\" INTEGER NOT NULL ," + // 17: ys_tingl
                "\"YS_ORAL_CAVITY\" INTEGER NOT NULL ," + // 18: ys_oral_cavity
                "\"YS_XINF\" INTEGER NOT NULL ," + // 19: ys_xinf
                "\"YS_FUB\" INTEGER NOT NULL ," + // 20: ys_fub
                "\"YS_QIB\" INTEGER NOT NULL ," + // 21: ys_qib
                "\"YS_GMWSZQ\" INTEGER NOT NULL ," + // 22: ys_gmwszq
                "\"YS_GLB_ZZ\" INTEGER NOT NULL ," + // 23: ys_glb_zz
                "\"YS_GLB_TZ\" INTEGER NOT NULL ," + // 24: ys_glb_tz
                "\"YS_ACTIVITY\" TEXT," + // 25: ys_activity
                "\"YS_FUYVD\" TEXT," + // 26: ys_fuyvd
                "\"YS_FAYPG\" INTEGER NOT NULL ," + // 27: ys_faypg
                "\"YS_LCSFQK\" INTEGER NOT NULL ," + // 28: ys_lcsfqk
                "\"YS_OTHER\" TEXT," + // 29: ys_other
                "\"YS_ZZJY\" INTEGER NOT NULL ," + // 30: ys_zzjy
                "\"YS_ZZYY\" TEXT," + // 31: ys_zzyy
                "\"YS_JGKS\" TEXT," + // 32: ys_jgks
                "\"YS_ZHID\" INTEGER NOT NULL ," + // 33: ys_zhid
                "\"YS_NEXT_DATE\" TEXT," + // 34: ys_next_date
                "\"YS_DOCTOR\" TEXT," + // 35: ys_doctor
                "\"XHDB_ID\" TEXT," + // 36: xhdb_id
                "\"YS_SZJK\" INTEGER NOT NULL ," + // 37: ys_szjk
                "\"CREATE_DATE\" TEXT);"); // 38: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"YISUIERTONGJIANKANG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Yisuiertongjiankang entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getYsjk_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
        stmt.bindLong(4, entity.getMonths_age());
 
        String check_date = entity.getCheck_date();
        if (check_date != null) {
            stmt.bindString(5, check_date);
        }
 
        String hw_id = entity.getHw_id();
        if (hw_id != null) {
            stmt.bindString(6, hw_id);
        }
        stmt.bindLong(7, entity.getTiz_develop());
        stmt.bindLong(8, entity.getSg_develop());
 
        String ys_head = entity.getYs_head();
        if (ys_head != null) {
            stmt.bindString(9, ys_head);
        }
        stmt.bindLong(10, entity.getYs__complexion());
        stmt.bindLong(11, entity.getYs_skin());
        stmt.bindLong(12, entity.getYs_qianx());
 
        String ys_qxcmx = entity.getYs_qxcmx();
        if (ys_qxcmx != null) {
            stmt.bindString(13, ys_qxcmx);
        }
 
        String ys_qxcm = entity.getYs_qxcm();
        if (ys_qxcm != null) {
            stmt.bindString(14, ys_qxcm);
        }
        stmt.bindLong(15, entity.getYs_jbbk());
        stmt.bindLong(16, entity.getYs_yanwg());
        stmt.bindLong(17, entity.getYs_erwg());
        stmt.bindLong(18, entity.getYs_tingl());
        stmt.bindLong(19, entity.getYs_oral_cavity());
        stmt.bindLong(20, entity.getYs_xinf());
        stmt.bindLong(21, entity.getYs_fub());
        stmt.bindLong(22, entity.getYs_qib());
        stmt.bindLong(23, entity.getYs_gmwszq());
        stmt.bindLong(24, entity.getYs_glb_zz());
        stmt.bindLong(25, entity.getYs_glb_tz());
 
        String ys_activity = entity.getYs_activity();
        if (ys_activity != null) {
            stmt.bindString(26, ys_activity);
        }
 
        String ys_fuyvd = entity.getYs_fuyvd();
        if (ys_fuyvd != null) {
            stmt.bindString(27, ys_fuyvd);
        }
        stmt.bindLong(28, entity.getYs_faypg());
        stmt.bindLong(29, entity.getYs_lcsfqk());
 
        String ys_other = entity.getYs_other();
        if (ys_other != null) {
            stmt.bindString(30, ys_other);
        }
        stmt.bindLong(31, entity.getYs_zzjy());
 
        String ys_zzyy = entity.getYs_zzyy();
        if (ys_zzyy != null) {
            stmt.bindString(32, ys_zzyy);
        }
 
        String ys_jgks = entity.getYs_jgks();
        if (ys_jgks != null) {
            stmt.bindString(33, ys_jgks);
        }
        stmt.bindLong(34, entity.getYs_zhid());
 
        String ys_next_date = entity.getYs_next_date();
        if (ys_next_date != null) {
            stmt.bindString(35, ys_next_date);
        }
 
        String ys_doctor = entity.getYs_doctor();
        if (ys_doctor != null) {
            stmt.bindString(36, ys_doctor);
        }
 
        String xhdb_id = entity.getXhdb_id();
        if (xhdb_id != null) {
            stmt.bindString(37, xhdb_id);
        }
        stmt.bindLong(38, entity.getYs_szjk());
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(39, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Yisuiertongjiankang entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getYsjk_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
        stmt.bindLong(4, entity.getMonths_age());
 
        String check_date = entity.getCheck_date();
        if (check_date != null) {
            stmt.bindString(5, check_date);
        }
 
        String hw_id = entity.getHw_id();
        if (hw_id != null) {
            stmt.bindString(6, hw_id);
        }
        stmt.bindLong(7, entity.getTiz_develop());
        stmt.bindLong(8, entity.getSg_develop());
 
        String ys_head = entity.getYs_head();
        if (ys_head != null) {
            stmt.bindString(9, ys_head);
        }
        stmt.bindLong(10, entity.getYs__complexion());
        stmt.bindLong(11, entity.getYs_skin());
        stmt.bindLong(12, entity.getYs_qianx());
 
        String ys_qxcmx = entity.getYs_qxcmx();
        if (ys_qxcmx != null) {
            stmt.bindString(13, ys_qxcmx);
        }
 
        String ys_qxcm = entity.getYs_qxcm();
        if (ys_qxcm != null) {
            stmt.bindString(14, ys_qxcm);
        }
        stmt.bindLong(15, entity.getYs_jbbk());
        stmt.bindLong(16, entity.getYs_yanwg());
        stmt.bindLong(17, entity.getYs_erwg());
        stmt.bindLong(18, entity.getYs_tingl());
        stmt.bindLong(19, entity.getYs_oral_cavity());
        stmt.bindLong(20, entity.getYs_xinf());
        stmt.bindLong(21, entity.getYs_fub());
        stmt.bindLong(22, entity.getYs_qib());
        stmt.bindLong(23, entity.getYs_gmwszq());
        stmt.bindLong(24, entity.getYs_glb_zz());
        stmt.bindLong(25, entity.getYs_glb_tz());
 
        String ys_activity = entity.getYs_activity();
        if (ys_activity != null) {
            stmt.bindString(26, ys_activity);
        }
 
        String ys_fuyvd = entity.getYs_fuyvd();
        if (ys_fuyvd != null) {
            stmt.bindString(27, ys_fuyvd);
        }
        stmt.bindLong(28, entity.getYs_faypg());
        stmt.bindLong(29, entity.getYs_lcsfqk());
 
        String ys_other = entity.getYs_other();
        if (ys_other != null) {
            stmt.bindString(30, ys_other);
        }
        stmt.bindLong(31, entity.getYs_zzjy());
 
        String ys_zzyy = entity.getYs_zzyy();
        if (ys_zzyy != null) {
            stmt.bindString(32, ys_zzyy);
        }
 
        String ys_jgks = entity.getYs_jgks();
        if (ys_jgks != null) {
            stmt.bindString(33, ys_jgks);
        }
        stmt.bindLong(34, entity.getYs_zhid());
 
        String ys_next_date = entity.getYs_next_date();
        if (ys_next_date != null) {
            stmt.bindString(35, ys_next_date);
        }
 
        String ys_doctor = entity.getYs_doctor();
        if (ys_doctor != null) {
            stmt.bindString(36, ys_doctor);
        }
 
        String xhdb_id = entity.getXhdb_id();
        if (xhdb_id != null) {
            stmt.bindString(37, xhdb_id);
        }
        stmt.bindLong(38, entity.getYs_szjk());
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(39, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Yisuiertongjiankang readEntity(Cursor cursor, int offset) {
        Yisuiertongjiankang entity = new Yisuiertongjiankang( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // ysjk_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // na_id
            cursor.getInt(offset + 3), // months_age
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // check_date
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // hw_id
            cursor.getInt(offset + 6), // tiz_develop
            cursor.getInt(offset + 7), // sg_develop
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // ys_head
            cursor.getInt(offset + 9), // ys__complexion
            cursor.getInt(offset + 10), // ys_skin
            cursor.getInt(offset + 11), // ys_qianx
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // ys_qxcmx
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // ys_qxcm
            cursor.getInt(offset + 14), // ys_jbbk
            cursor.getInt(offset + 15), // ys_yanwg
            cursor.getInt(offset + 16), // ys_erwg
            cursor.getInt(offset + 17), // ys_tingl
            cursor.getInt(offset + 18), // ys_oral_cavity
            cursor.getInt(offset + 19), // ys_xinf
            cursor.getInt(offset + 20), // ys_fub
            cursor.getInt(offset + 21), // ys_qib
            cursor.getInt(offset + 22), // ys_gmwszq
            cursor.getInt(offset + 23), // ys_glb_zz
            cursor.getInt(offset + 24), // ys_glb_tz
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // ys_activity
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // ys_fuyvd
            cursor.getInt(offset + 27), // ys_faypg
            cursor.getInt(offset + 28), // ys_lcsfqk
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // ys_other
            cursor.getInt(offset + 30), // ys_zzjy
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // ys_zzyy
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32), // ys_jgks
            cursor.getInt(offset + 33), // ys_zhid
            cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34), // ys_next_date
            cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35), // ys_doctor
            cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36), // xhdb_id
            cursor.getInt(offset + 37), // ys_szjk
            cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Yisuiertongjiankang entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setYsjk_id(cursor.getString(offset + 1));
        entity.setNa_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMonths_age(cursor.getInt(offset + 3));
        entity.setCheck_date(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setHw_id(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTiz_develop(cursor.getInt(offset + 6));
        entity.setSg_develop(cursor.getInt(offset + 7));
        entity.setYs_head(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setYs__complexion(cursor.getInt(offset + 9));
        entity.setYs_skin(cursor.getInt(offset + 10));
        entity.setYs_qianx(cursor.getInt(offset + 11));
        entity.setYs_qxcmx(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setYs_qxcm(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setYs_jbbk(cursor.getInt(offset + 14));
        entity.setYs_yanwg(cursor.getInt(offset + 15));
        entity.setYs_erwg(cursor.getInt(offset + 16));
        entity.setYs_tingl(cursor.getInt(offset + 17));
        entity.setYs_oral_cavity(cursor.getInt(offset + 18));
        entity.setYs_xinf(cursor.getInt(offset + 19));
        entity.setYs_fub(cursor.getInt(offset + 20));
        entity.setYs_qib(cursor.getInt(offset + 21));
        entity.setYs_gmwszq(cursor.getInt(offset + 22));
        entity.setYs_glb_zz(cursor.getInt(offset + 23));
        entity.setYs_glb_tz(cursor.getInt(offset + 24));
        entity.setYs_activity(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setYs_fuyvd(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setYs_faypg(cursor.getInt(offset + 27));
        entity.setYs_lcsfqk(cursor.getInt(offset + 28));
        entity.setYs_other(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setYs_zzjy(cursor.getInt(offset + 30));
        entity.setYs_zzyy(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setYs_jgks(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
        entity.setYs_zhid(cursor.getInt(offset + 33));
        entity.setYs_next_date(cursor.isNull(offset + 34) ? null : cursor.getString(offset + 34));
        entity.setYs_doctor(cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35));
        entity.setXhdb_id(cursor.isNull(offset + 36) ? null : cursor.getString(offset + 36));
        entity.setYs_szjk(cursor.getInt(offset + 37));
        entity.setCreateDate(cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Yisuiertongjiankang entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Yisuiertongjiankang entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Yisuiertongjiankang entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
