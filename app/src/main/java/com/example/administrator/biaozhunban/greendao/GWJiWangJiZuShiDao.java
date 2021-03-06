package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.GWJiWangJiZuShi;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GWJI_WANG_JI_ZU_SHI".
*/
public class GWJiWangJiZuShiDao extends AbstractDao<GWJiWangJiZuShi, Long> {

    public static final String TABLENAME = "GWJI_WANG_JI_ZU_SHI";

    /**
     * Properties of entity GWJiWangJiZuShi.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Other_id = new Property(1, String.class, "other_id", false, "OTHER_ID");
        public final static Property Jws_jb1 = new Property(2, int.class, "jws_jb1", false, "JWS_JB1");
        public final static Property Jws_jb2 = new Property(3, int.class, "jws_jb2", false, "JWS_JB2");
        public final static Property Jws_jb3 = new Property(4, int.class, "jws_jb3", false, "JWS_JB3");
        public final static Property Jws_jb4 = new Property(5, int.class, "jws_jb4", false, "JWS_JB4");
        public final static Property Jws_jb5 = new Property(6, int.class, "jws_jb5", false, "JWS_JB5");
        public final static Property Jws_jb6 = new Property(7, int.class, "jws_jb6", false, "JWS_JB6");
        public final static Property Jws_qzsj1 = new Property(8, String.class, "jws_qzsj1", false, "JWS_QZSJ1");
        public final static Property Jws_qzsj2 = new Property(9, String.class, "jws_qzsj2", false, "JWS_QZSJ2");
        public final static Property Jws_qzsj3 = new Property(10, String.class, "jws_qzsj3", false, "JWS_QZSJ3");
        public final static Property Jws_qzsj4 = new Property(11, String.class, "jws_qzsj4", false, "JWS_QZSJ4");
        public final static Property Jws_qzsj5 = new Property(12, String.class, "jws_qzsj5", false, "JWS_QZSJ5");
        public final static Property Jws_qzsj6 = new Property(13, String.class, "jws_qzsj6", false, "JWS_QZSJ6");
        public final static Property Jws_exzl = new Property(14, String.class, "jws_exzl", false, "JWS_EXZL");
        public final static Property Jws_zyb = new Property(15, String.class, "jws_zyb", false, "JWS_ZYB");
        public final static Property Jws_other = new Property(16, String.class, "jws_other", false, "JWS_OTHER");
        public final static Property Jws_ss = new Property(17, int.class, "jws_ss", false, "JWS_SS");
        public final static Property Jws_ssmc1 = new Property(18, String.class, "jws_ssmc1", false, "JWS_SSMC1");
        public final static Property Jws_ssmc2 = new Property(19, String.class, "jws_ssmc2", false, "JWS_SSMC2");
        public final static Property Jws_sssj1 = new Property(20, String.class, "jws_sssj1", false, "JWS_SSSJ1");
        public final static Property Jws_sssj2 = new Property(21, String.class, "jws_sssj2", false, "JWS_SSSJ2");
        public final static Property Jws_ws = new Property(22, int.class, "jws_ws", false, "JWS_WS");
        public final static Property Jws_wsmc1 = new Property(23, String.class, "jws_wsmc1", false, "JWS_WSMC1");
        public final static Property Jws_wsmc2 = new Property(24, String.class, "jws_wsmc2", false, "JWS_WSMC2");
        public final static Property Jws_wssj1 = new Property(25, String.class, "jws_wssj1", false, "JWS_WSSJ1");
        public final static Property Jws_wssj2 = new Property(26, String.class, "jws_wssj2", false, "JWS_WSSJ2");
        public final static Property Symptom_id = new Property(27, int.class, "symptom_id", false, "SYMPTOM_ID");
        public final static Property Jws_sx = new Property(28, int.class, "jws_sx", false, "JWS_SX");
        public final static Property Jws_sxyy1 = new Property(29, String.class, "jws_sxyy1", false, "JWS_SXYY1");
        public final static Property Jws_sxyy2 = new Property(30, String.class, "jws_sxyy2", false, "JWS_SXYY2");
        public final static Property Jws_sxsj1 = new Property(31, String.class, "jws_sxsj1", false, "JWS_SXSJ1");
        public final static Property Jws_sxsj2 = new Property(32, String.class, "jws_sxsj2", false, "JWS_SXSJ2");
        public final static Property Jzs_father = new Property(33, int.class, "jzs_father", false, "JZS_FATHER");
        public final static Property Jzs_mother = new Property(34, int.class, "jzs_mother", false, "JZS_MOTHER");
        public final static Property Jzs_brother_sister = new Property(35, int.class, "jzs_brother_sister", false, "JZS_BROTHER_SISTER");
        public final static Property Jzs_child = new Property(36, int.class, "jzs_child", false, "JZS_CHILD");
        public final static Property Shhj_cfss = new Property(37, int.class, "shhj_cfss", false, "SHHJ_CFSS");
        public final static Property Shhj_rllx = new Property(38, int.class, "shhj_rllx", false, "SHHJ_RLLX");
        public final static Property Shhj_ys = new Property(39, int.class, "shhj_ys", false, "SHHJ_YS");
        public final static Property Shhj_cs = new Property(40, int.class, "shhj_cs", false, "SHHJ_CS");
        public final static Property Shhj_qcl = new Property(41, int.class, "shhj_qcl", false, "SHHJ_QCL");
        public final static Property Bs_id = new Property(42, String.class, "bs_id", false, "BS_ID");
        public final static Property CreateDate = new Property(43, String.class, "createDate", false, "CREATE_DATE");
    }


    public GWJiWangJiZuShiDao(DaoConfig config) {
        super(config);
    }
    
    public GWJiWangJiZuShiDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GWJI_WANG_JI_ZU_SHI\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"OTHER_ID\" TEXT NOT NULL ," + // 1: other_id
                "\"JWS_JB1\" INTEGER NOT NULL ," + // 2: jws_jb1
                "\"JWS_JB2\" INTEGER NOT NULL ," + // 3: jws_jb2
                "\"JWS_JB3\" INTEGER NOT NULL ," + // 4: jws_jb3
                "\"JWS_JB4\" INTEGER NOT NULL ," + // 5: jws_jb4
                "\"JWS_JB5\" INTEGER NOT NULL ," + // 6: jws_jb5
                "\"JWS_JB6\" INTEGER NOT NULL ," + // 7: jws_jb6
                "\"JWS_QZSJ1\" TEXT," + // 8: jws_qzsj1
                "\"JWS_QZSJ2\" TEXT," + // 9: jws_qzsj2
                "\"JWS_QZSJ3\" TEXT," + // 10: jws_qzsj3
                "\"JWS_QZSJ4\" TEXT," + // 11: jws_qzsj4
                "\"JWS_QZSJ5\" TEXT," + // 12: jws_qzsj5
                "\"JWS_QZSJ6\" TEXT," + // 13: jws_qzsj6
                "\"JWS_EXZL\" TEXT," + // 14: jws_exzl
                "\"JWS_ZYB\" TEXT," + // 15: jws_zyb
                "\"JWS_OTHER\" TEXT," + // 16: jws_other
                "\"JWS_SS\" INTEGER NOT NULL ," + // 17: jws_ss
                "\"JWS_SSMC1\" TEXT," + // 18: jws_ssmc1
                "\"JWS_SSMC2\" TEXT," + // 19: jws_ssmc2
                "\"JWS_SSSJ1\" TEXT," + // 20: jws_sssj1
                "\"JWS_SSSJ2\" TEXT," + // 21: jws_sssj2
                "\"JWS_WS\" INTEGER NOT NULL ," + // 22: jws_ws
                "\"JWS_WSMC1\" TEXT," + // 23: jws_wsmc1
                "\"JWS_WSMC2\" TEXT," + // 24: jws_wsmc2
                "\"JWS_WSSJ1\" TEXT," + // 25: jws_wssj1
                "\"JWS_WSSJ2\" TEXT," + // 26: jws_wssj2
                "\"SYMPTOM_ID\" INTEGER NOT NULL ," + // 27: symptom_id
                "\"JWS_SX\" INTEGER NOT NULL ," + // 28: jws_sx
                "\"JWS_SXYY1\" TEXT," + // 29: jws_sxyy1
                "\"JWS_SXYY2\" TEXT," + // 30: jws_sxyy2
                "\"JWS_SXSJ1\" TEXT," + // 31: jws_sxsj1
                "\"JWS_SXSJ2\" TEXT," + // 32: jws_sxsj2
                "\"JZS_FATHER\" INTEGER NOT NULL ," + // 33: jzs_father
                "\"JZS_MOTHER\" INTEGER NOT NULL ," + // 34: jzs_mother
                "\"JZS_BROTHER_SISTER\" INTEGER NOT NULL ," + // 35: jzs_brother_sister
                "\"JZS_CHILD\" INTEGER NOT NULL ," + // 36: jzs_child
                "\"SHHJ_CFSS\" INTEGER NOT NULL ," + // 37: shhj_cfss
                "\"SHHJ_RLLX\" INTEGER NOT NULL ," + // 38: shhj_rllx
                "\"SHHJ_YS\" INTEGER NOT NULL ," + // 39: shhj_ys
                "\"SHHJ_CS\" INTEGER NOT NULL ," + // 40: shhj_cs
                "\"SHHJ_QCL\" INTEGER NOT NULL ," + // 41: shhj_qcl
                "\"BS_ID\" TEXT," + // 42: bs_id
                "\"CREATE_DATE\" TEXT);"); // 43: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GWJI_WANG_JI_ZU_SHI\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, GWJiWangJiZuShi entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getOther_id());
        stmt.bindLong(3, entity.getJws_jb1());
        stmt.bindLong(4, entity.getJws_jb2());
        stmt.bindLong(5, entity.getJws_jb3());
        stmt.bindLong(6, entity.getJws_jb4());
        stmt.bindLong(7, entity.getJws_jb5());
        stmt.bindLong(8, entity.getJws_jb6());
 
        String jws_qzsj1 = entity.getJws_qzsj1();
        if (jws_qzsj1 != null) {
            stmt.bindString(9, jws_qzsj1);
        }
 
        String jws_qzsj2 = entity.getJws_qzsj2();
        if (jws_qzsj2 != null) {
            stmt.bindString(10, jws_qzsj2);
        }
 
        String jws_qzsj3 = entity.getJws_qzsj3();
        if (jws_qzsj3 != null) {
            stmt.bindString(11, jws_qzsj3);
        }
 
        String jws_qzsj4 = entity.getJws_qzsj4();
        if (jws_qzsj4 != null) {
            stmt.bindString(12, jws_qzsj4);
        }
 
        String jws_qzsj5 = entity.getJws_qzsj5();
        if (jws_qzsj5 != null) {
            stmt.bindString(13, jws_qzsj5);
        }
 
        String jws_qzsj6 = entity.getJws_qzsj6();
        if (jws_qzsj6 != null) {
            stmt.bindString(14, jws_qzsj6);
        }
 
        String jws_exzl = entity.getJws_exzl();
        if (jws_exzl != null) {
            stmt.bindString(15, jws_exzl);
        }
 
        String jws_zyb = entity.getJws_zyb();
        if (jws_zyb != null) {
            stmt.bindString(16, jws_zyb);
        }
 
        String jws_other = entity.getJws_other();
        if (jws_other != null) {
            stmt.bindString(17, jws_other);
        }
        stmt.bindLong(18, entity.getJws_ss());
 
        String jws_ssmc1 = entity.getJws_ssmc1();
        if (jws_ssmc1 != null) {
            stmt.bindString(19, jws_ssmc1);
        }
 
        String jws_ssmc2 = entity.getJws_ssmc2();
        if (jws_ssmc2 != null) {
            stmt.bindString(20, jws_ssmc2);
        }
 
        String jws_sssj1 = entity.getJws_sssj1();
        if (jws_sssj1 != null) {
            stmt.bindString(21, jws_sssj1);
        }
 
        String jws_sssj2 = entity.getJws_sssj2();
        if (jws_sssj2 != null) {
            stmt.bindString(22, jws_sssj2);
        }
        stmt.bindLong(23, entity.getJws_ws());
 
        String jws_wsmc1 = entity.getJws_wsmc1();
        if (jws_wsmc1 != null) {
            stmt.bindString(24, jws_wsmc1);
        }
 
        String jws_wsmc2 = entity.getJws_wsmc2();
        if (jws_wsmc2 != null) {
            stmt.bindString(25, jws_wsmc2);
        }
 
        String jws_wssj1 = entity.getJws_wssj1();
        if (jws_wssj1 != null) {
            stmt.bindString(26, jws_wssj1);
        }
 
        String jws_wssj2 = entity.getJws_wssj2();
        if (jws_wssj2 != null) {
            stmt.bindString(27, jws_wssj2);
        }
        stmt.bindLong(28, entity.getSymptom_id());
        stmt.bindLong(29, entity.getJws_sx());
 
        String jws_sxyy1 = entity.getJws_sxyy1();
        if (jws_sxyy1 != null) {
            stmt.bindString(30, jws_sxyy1);
        }
 
        String jws_sxyy2 = entity.getJws_sxyy2();
        if (jws_sxyy2 != null) {
            stmt.bindString(31, jws_sxyy2);
        }
 
        String jws_sxsj1 = entity.getJws_sxsj1();
        if (jws_sxsj1 != null) {
            stmt.bindString(32, jws_sxsj1);
        }
 
        String jws_sxsj2 = entity.getJws_sxsj2();
        if (jws_sxsj2 != null) {
            stmt.bindString(33, jws_sxsj2);
        }
        stmt.bindLong(34, entity.getJzs_father());
        stmt.bindLong(35, entity.getJzs_mother());
        stmt.bindLong(36, entity.getJzs_brother_sister());
        stmt.bindLong(37, entity.getJzs_child());
        stmt.bindLong(38, entity.getShhj_cfss());
        stmt.bindLong(39, entity.getShhj_rllx());
        stmt.bindLong(40, entity.getShhj_ys());
        stmt.bindLong(41, entity.getShhj_cs());
        stmt.bindLong(42, entity.getShhj_qcl());
 
        String bs_id = entity.getBs_id();
        if (bs_id != null) {
            stmt.bindString(43, bs_id);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(44, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, GWJiWangJiZuShi entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getOther_id());
        stmt.bindLong(3, entity.getJws_jb1());
        stmt.bindLong(4, entity.getJws_jb2());
        stmt.bindLong(5, entity.getJws_jb3());
        stmt.bindLong(6, entity.getJws_jb4());
        stmt.bindLong(7, entity.getJws_jb5());
        stmt.bindLong(8, entity.getJws_jb6());
 
        String jws_qzsj1 = entity.getJws_qzsj1();
        if (jws_qzsj1 != null) {
            stmt.bindString(9, jws_qzsj1);
        }
 
        String jws_qzsj2 = entity.getJws_qzsj2();
        if (jws_qzsj2 != null) {
            stmt.bindString(10, jws_qzsj2);
        }
 
        String jws_qzsj3 = entity.getJws_qzsj3();
        if (jws_qzsj3 != null) {
            stmt.bindString(11, jws_qzsj3);
        }
 
        String jws_qzsj4 = entity.getJws_qzsj4();
        if (jws_qzsj4 != null) {
            stmt.bindString(12, jws_qzsj4);
        }
 
        String jws_qzsj5 = entity.getJws_qzsj5();
        if (jws_qzsj5 != null) {
            stmt.bindString(13, jws_qzsj5);
        }
 
        String jws_qzsj6 = entity.getJws_qzsj6();
        if (jws_qzsj6 != null) {
            stmt.bindString(14, jws_qzsj6);
        }
 
        String jws_exzl = entity.getJws_exzl();
        if (jws_exzl != null) {
            stmt.bindString(15, jws_exzl);
        }
 
        String jws_zyb = entity.getJws_zyb();
        if (jws_zyb != null) {
            stmt.bindString(16, jws_zyb);
        }
 
        String jws_other = entity.getJws_other();
        if (jws_other != null) {
            stmt.bindString(17, jws_other);
        }
        stmt.bindLong(18, entity.getJws_ss());
 
        String jws_ssmc1 = entity.getJws_ssmc1();
        if (jws_ssmc1 != null) {
            stmt.bindString(19, jws_ssmc1);
        }
 
        String jws_ssmc2 = entity.getJws_ssmc2();
        if (jws_ssmc2 != null) {
            stmt.bindString(20, jws_ssmc2);
        }
 
        String jws_sssj1 = entity.getJws_sssj1();
        if (jws_sssj1 != null) {
            stmt.bindString(21, jws_sssj1);
        }
 
        String jws_sssj2 = entity.getJws_sssj2();
        if (jws_sssj2 != null) {
            stmt.bindString(22, jws_sssj2);
        }
        stmt.bindLong(23, entity.getJws_ws());
 
        String jws_wsmc1 = entity.getJws_wsmc1();
        if (jws_wsmc1 != null) {
            stmt.bindString(24, jws_wsmc1);
        }
 
        String jws_wsmc2 = entity.getJws_wsmc2();
        if (jws_wsmc2 != null) {
            stmt.bindString(25, jws_wsmc2);
        }
 
        String jws_wssj1 = entity.getJws_wssj1();
        if (jws_wssj1 != null) {
            stmt.bindString(26, jws_wssj1);
        }
 
        String jws_wssj2 = entity.getJws_wssj2();
        if (jws_wssj2 != null) {
            stmt.bindString(27, jws_wssj2);
        }
        stmt.bindLong(28, entity.getSymptom_id());
        stmt.bindLong(29, entity.getJws_sx());
 
        String jws_sxyy1 = entity.getJws_sxyy1();
        if (jws_sxyy1 != null) {
            stmt.bindString(30, jws_sxyy1);
        }
 
        String jws_sxyy2 = entity.getJws_sxyy2();
        if (jws_sxyy2 != null) {
            stmt.bindString(31, jws_sxyy2);
        }
 
        String jws_sxsj1 = entity.getJws_sxsj1();
        if (jws_sxsj1 != null) {
            stmt.bindString(32, jws_sxsj1);
        }
 
        String jws_sxsj2 = entity.getJws_sxsj2();
        if (jws_sxsj2 != null) {
            stmt.bindString(33, jws_sxsj2);
        }
        stmt.bindLong(34, entity.getJzs_father());
        stmt.bindLong(35, entity.getJzs_mother());
        stmt.bindLong(36, entity.getJzs_brother_sister());
        stmt.bindLong(37, entity.getJzs_child());
        stmt.bindLong(38, entity.getShhj_cfss());
        stmt.bindLong(39, entity.getShhj_rllx());
        stmt.bindLong(40, entity.getShhj_ys());
        stmt.bindLong(41, entity.getShhj_cs());
        stmt.bindLong(42, entity.getShhj_qcl());
 
        String bs_id = entity.getBs_id();
        if (bs_id != null) {
            stmt.bindString(43, bs_id);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(44, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public GWJiWangJiZuShi readEntity(Cursor cursor, int offset) {
        GWJiWangJiZuShi entity = new GWJiWangJiZuShi( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // other_id
            cursor.getInt(offset + 2), // jws_jb1
            cursor.getInt(offset + 3), // jws_jb2
            cursor.getInt(offset + 4), // jws_jb3
            cursor.getInt(offset + 5), // jws_jb4
            cursor.getInt(offset + 6), // jws_jb5
            cursor.getInt(offset + 7), // jws_jb6
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // jws_qzsj1
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // jws_qzsj2
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // jws_qzsj3
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // jws_qzsj4
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // jws_qzsj5
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // jws_qzsj6
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // jws_exzl
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // jws_zyb
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // jws_other
            cursor.getInt(offset + 17), // jws_ss
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // jws_ssmc1
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // jws_ssmc2
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // jws_sssj1
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // jws_sssj2
            cursor.getInt(offset + 22), // jws_ws
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // jws_wsmc1
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // jws_wsmc2
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // jws_wssj1
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // jws_wssj2
            cursor.getInt(offset + 27), // symptom_id
            cursor.getInt(offset + 28), // jws_sx
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // jws_sxyy1
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // jws_sxyy2
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // jws_sxsj1
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32), // jws_sxsj2
            cursor.getInt(offset + 33), // jzs_father
            cursor.getInt(offset + 34), // jzs_mother
            cursor.getInt(offset + 35), // jzs_brother_sister
            cursor.getInt(offset + 36), // jzs_child
            cursor.getInt(offset + 37), // shhj_cfss
            cursor.getInt(offset + 38), // shhj_rllx
            cursor.getInt(offset + 39), // shhj_ys
            cursor.getInt(offset + 40), // shhj_cs
            cursor.getInt(offset + 41), // shhj_qcl
            cursor.isNull(offset + 42) ? null : cursor.getString(offset + 42), // bs_id
            cursor.isNull(offset + 43) ? null : cursor.getString(offset + 43) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, GWJiWangJiZuShi entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setOther_id(cursor.getString(offset + 1));
        entity.setJws_jb1(cursor.getInt(offset + 2));
        entity.setJws_jb2(cursor.getInt(offset + 3));
        entity.setJws_jb3(cursor.getInt(offset + 4));
        entity.setJws_jb4(cursor.getInt(offset + 5));
        entity.setJws_jb5(cursor.getInt(offset + 6));
        entity.setJws_jb6(cursor.getInt(offset + 7));
        entity.setJws_qzsj1(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setJws_qzsj2(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setJws_qzsj3(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setJws_qzsj4(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setJws_qzsj5(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setJws_qzsj6(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setJws_exzl(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setJws_zyb(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setJws_other(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setJws_ss(cursor.getInt(offset + 17));
        entity.setJws_ssmc1(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setJws_ssmc2(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setJws_sssj1(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setJws_sssj2(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setJws_ws(cursor.getInt(offset + 22));
        entity.setJws_wsmc1(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setJws_wsmc2(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setJws_wssj1(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setJws_wssj2(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setSymptom_id(cursor.getInt(offset + 27));
        entity.setJws_sx(cursor.getInt(offset + 28));
        entity.setJws_sxyy1(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setJws_sxyy2(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setJws_sxsj1(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setJws_sxsj2(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
        entity.setJzs_father(cursor.getInt(offset + 33));
        entity.setJzs_mother(cursor.getInt(offset + 34));
        entity.setJzs_brother_sister(cursor.getInt(offset + 35));
        entity.setJzs_child(cursor.getInt(offset + 36));
        entity.setShhj_cfss(cursor.getInt(offset + 37));
        entity.setShhj_rllx(cursor.getInt(offset + 38));
        entity.setShhj_ys(cursor.getInt(offset + 39));
        entity.setShhj_cs(cursor.getInt(offset + 40));
        entity.setShhj_qcl(cursor.getInt(offset + 41));
        entity.setBs_id(cursor.isNull(offset + 42) ? null : cursor.getString(offset + 42));
        entity.setCreateDate(cursor.isNull(offset + 43) ? null : cursor.getString(offset + 43));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(GWJiWangJiZuShi entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(GWJiWangJiZuShi entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(GWJiWangJiZuShi entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
