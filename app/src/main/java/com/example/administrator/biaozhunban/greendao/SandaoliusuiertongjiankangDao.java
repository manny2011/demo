package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.Sandaoliusuiertongjiankang;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SANDAOLIUSUIERTONGJIANKANG".
*/
public class SandaoliusuiertongjiankangDao extends AbstractDao<Sandaoliusuiertongjiankang, Long> {

    public static final String TABLENAME = "SANDAOLIUSUIERTONGJIANKANG";

    /**
     * Properties of entity Sandaoliusuiertongjiankang.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Ssjk_id = new Property(1, String.class, "ssjk_id", false, "SSJK_ID");
        public final static Property Na_id = new Property(2, String.class, "na_id", false, "NA_ID");
        public final static Property Ss_yuel = new Property(3, int.class, "ss_yuel", false, "SS_YUEL");
        public final static Property Ss_follow_date = new Property(4, String.class, "ss_follow_date", false, "SS_FOLLOW_DATE");
        public final static Property Hw_id = new Property(5, String.class, "hw_id", false, "HW_ID");
        public final static Property Ss_sgfy = new Property(6, int.class, "ss_sgfy", false, "SS_SGFY");
        public final static Property Ss_tzfy = new Property(7, int.class, "ss_tzfy", false, "SS_TZFY");
        public final static Property Ss_shil = new Property(8, String.class, "ss_shil", false, "SS_SHIL");
        public final static Property Ss_tingl = new Property(9, int.class, "ss_tingl", false, "SS_TINGL");
        public final static Property Ss_cys = new Property(10, String.class, "ss_cys", false, "SS_CYS");
        public final static Property Ss_qcs = new Property(11, String.class, "ss_qcs", false, "SS_QCS");
        public final static Property Ss_xinf = new Property(12, int.class, "ss_xinf", false, "SS_XINF");
        public final static Property Ss_fub = new Property(13, int.class, "ss_fub", false, "SS_FUB");
        public final static Property Xhdb_id = new Property(14, String.class, "xhdb_id", false, "XHDB_ID");
        public final static Property Ss_lcsfhb = new Property(15, int.class, "ss_lcsfhb", false, "SS_LCSFHB");
        public final static Property Ss_feiy = new Property(16, String.class, "ss_feiy", false, "SS_FEIY");
        public final static Property Ss_fux = new Property(17, String.class, "ss_fux", false, "SS_FUX");
        public final static Property Ss_wais = new Property(18, String.class, "ss_wais", false, "SS_WAIS");
        public final static Property Ss_qit = new Property(19, String.class, "ss_qit", false, "SS_QIT");
        public final static Property Ss_zzjy = new Property(20, int.class, "ss_zzjy", false, "SS_ZZJY");
        public final static Property Ss_zzyy = new Property(21, String.class, "ss_zzyy", false, "SS_ZZYY");
        public final static Property Ss_jgks = new Property(22, String.class, "ss_jgks", false, "SS_JGKS");
        public final static Property Ss_zhid = new Property(23, int.class, "ss_zhid", false, "SS_ZHID");
        public final static Property Ss_next_date = new Property(24, String.class, "ss_next_date", false, "SS_NEXT_DATE");
        public final static Property Ss_doctor = new Property(25, String.class, "ss_doctor", false, "SS_DOCTOR");
        public final static Property Ss_tigfypj = new Property(26, int.class, "ss_tigfypj", false, "SS_TIGFYPJ");
        public final static Property Ss_qit1 = new Property(27, String.class, "ss_qit1", false, "SS_QIT1");
        public final static Property CreateDate = new Property(28, String.class, "createDate", false, "CREATE_DATE");
    }


    public SandaoliusuiertongjiankangDao(DaoConfig config) {
        super(config);
    }
    
    public SandaoliusuiertongjiankangDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SANDAOLIUSUIERTONGJIANKANG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"SSJK_ID\" TEXT NOT NULL ," + // 1: ssjk_id
                "\"NA_ID\" TEXT," + // 2: na_id
                "\"SS_YUEL\" INTEGER NOT NULL ," + // 3: ss_yuel
                "\"SS_FOLLOW_DATE\" TEXT," + // 4: ss_follow_date
                "\"HW_ID\" TEXT," + // 5: hw_id
                "\"SS_SGFY\" INTEGER NOT NULL ," + // 6: ss_sgfy
                "\"SS_TZFY\" INTEGER NOT NULL ," + // 7: ss_tzfy
                "\"SS_SHIL\" TEXT," + // 8: ss_shil
                "\"SS_TINGL\" INTEGER NOT NULL ," + // 9: ss_tingl
                "\"SS_CYS\" TEXT," + // 10: ss_cys
                "\"SS_QCS\" TEXT," + // 11: ss_qcs
                "\"SS_XINF\" INTEGER NOT NULL ," + // 12: ss_xinf
                "\"SS_FUB\" INTEGER NOT NULL ," + // 13: ss_fub
                "\"XHDB_ID\" TEXT," + // 14: xhdb_id
                "\"SS_LCSFHB\" INTEGER NOT NULL ," + // 15: ss_lcsfhb
                "\"SS_FEIY\" TEXT," + // 16: ss_feiy
                "\"SS_FUX\" TEXT," + // 17: ss_fux
                "\"SS_WAIS\" TEXT," + // 18: ss_wais
                "\"SS_QIT\" TEXT," + // 19: ss_qit
                "\"SS_ZZJY\" INTEGER NOT NULL ," + // 20: ss_zzjy
                "\"SS_ZZYY\" TEXT," + // 21: ss_zzyy
                "\"SS_JGKS\" TEXT," + // 22: ss_jgks
                "\"SS_ZHID\" INTEGER NOT NULL ," + // 23: ss_zhid
                "\"SS_NEXT_DATE\" TEXT," + // 24: ss_next_date
                "\"SS_DOCTOR\" TEXT," + // 25: ss_doctor
                "\"SS_TIGFYPJ\" INTEGER NOT NULL ," + // 26: ss_tigfypj
                "\"SS_QIT1\" TEXT," + // 27: ss_qit1
                "\"CREATE_DATE\" TEXT);"); // 28: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SANDAOLIUSUIERTONGJIANKANG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Sandaoliusuiertongjiankang entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getSsjk_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
        stmt.bindLong(4, entity.getSs_yuel());
 
        String ss_follow_date = entity.getSs_follow_date();
        if (ss_follow_date != null) {
            stmt.bindString(5, ss_follow_date);
        }
 
        String hw_id = entity.getHw_id();
        if (hw_id != null) {
            stmt.bindString(6, hw_id);
        }
        stmt.bindLong(7, entity.getSs_sgfy());
        stmt.bindLong(8, entity.getSs_tzfy());
 
        String ss_shil = entity.getSs_shil();
        if (ss_shil != null) {
            stmt.bindString(9, ss_shil);
        }
        stmt.bindLong(10, entity.getSs_tingl());
 
        String ss_cys = entity.getSs_cys();
        if (ss_cys != null) {
            stmt.bindString(11, ss_cys);
        }
 
        String ss_qcs = entity.getSs_qcs();
        if (ss_qcs != null) {
            stmt.bindString(12, ss_qcs);
        }
        stmt.bindLong(13, entity.getSs_xinf());
        stmt.bindLong(14, entity.getSs_fub());
 
        String xhdb_id = entity.getXhdb_id();
        if (xhdb_id != null) {
            stmt.bindString(15, xhdb_id);
        }
        stmt.bindLong(16, entity.getSs_lcsfhb());
 
        String ss_feiy = entity.getSs_feiy();
        if (ss_feiy != null) {
            stmt.bindString(17, ss_feiy);
        }
 
        String ss_fux = entity.getSs_fux();
        if (ss_fux != null) {
            stmt.bindString(18, ss_fux);
        }
 
        String ss_wais = entity.getSs_wais();
        if (ss_wais != null) {
            stmt.bindString(19, ss_wais);
        }
 
        String ss_qit = entity.getSs_qit();
        if (ss_qit != null) {
            stmt.bindString(20, ss_qit);
        }
        stmt.bindLong(21, entity.getSs_zzjy());
 
        String ss_zzyy = entity.getSs_zzyy();
        if (ss_zzyy != null) {
            stmt.bindString(22, ss_zzyy);
        }
 
        String ss_jgks = entity.getSs_jgks();
        if (ss_jgks != null) {
            stmt.bindString(23, ss_jgks);
        }
        stmt.bindLong(24, entity.getSs_zhid());
 
        String ss_next_date = entity.getSs_next_date();
        if (ss_next_date != null) {
            stmt.bindString(25, ss_next_date);
        }
 
        String ss_doctor = entity.getSs_doctor();
        if (ss_doctor != null) {
            stmt.bindString(26, ss_doctor);
        }
        stmt.bindLong(27, entity.getSs_tigfypj());
 
        String ss_qit1 = entity.getSs_qit1();
        if (ss_qit1 != null) {
            stmt.bindString(28, ss_qit1);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(29, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Sandaoliusuiertongjiankang entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getSsjk_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
        stmt.bindLong(4, entity.getSs_yuel());
 
        String ss_follow_date = entity.getSs_follow_date();
        if (ss_follow_date != null) {
            stmt.bindString(5, ss_follow_date);
        }
 
        String hw_id = entity.getHw_id();
        if (hw_id != null) {
            stmt.bindString(6, hw_id);
        }
        stmt.bindLong(7, entity.getSs_sgfy());
        stmt.bindLong(8, entity.getSs_tzfy());
 
        String ss_shil = entity.getSs_shil();
        if (ss_shil != null) {
            stmt.bindString(9, ss_shil);
        }
        stmt.bindLong(10, entity.getSs_tingl());
 
        String ss_cys = entity.getSs_cys();
        if (ss_cys != null) {
            stmt.bindString(11, ss_cys);
        }
 
        String ss_qcs = entity.getSs_qcs();
        if (ss_qcs != null) {
            stmt.bindString(12, ss_qcs);
        }
        stmt.bindLong(13, entity.getSs_xinf());
        stmt.bindLong(14, entity.getSs_fub());
 
        String xhdb_id = entity.getXhdb_id();
        if (xhdb_id != null) {
            stmt.bindString(15, xhdb_id);
        }
        stmt.bindLong(16, entity.getSs_lcsfhb());
 
        String ss_feiy = entity.getSs_feiy();
        if (ss_feiy != null) {
            stmt.bindString(17, ss_feiy);
        }
 
        String ss_fux = entity.getSs_fux();
        if (ss_fux != null) {
            stmt.bindString(18, ss_fux);
        }
 
        String ss_wais = entity.getSs_wais();
        if (ss_wais != null) {
            stmt.bindString(19, ss_wais);
        }
 
        String ss_qit = entity.getSs_qit();
        if (ss_qit != null) {
            stmt.bindString(20, ss_qit);
        }
        stmt.bindLong(21, entity.getSs_zzjy());
 
        String ss_zzyy = entity.getSs_zzyy();
        if (ss_zzyy != null) {
            stmt.bindString(22, ss_zzyy);
        }
 
        String ss_jgks = entity.getSs_jgks();
        if (ss_jgks != null) {
            stmt.bindString(23, ss_jgks);
        }
        stmt.bindLong(24, entity.getSs_zhid());
 
        String ss_next_date = entity.getSs_next_date();
        if (ss_next_date != null) {
            stmt.bindString(25, ss_next_date);
        }
 
        String ss_doctor = entity.getSs_doctor();
        if (ss_doctor != null) {
            stmt.bindString(26, ss_doctor);
        }
        stmt.bindLong(27, entity.getSs_tigfypj());
 
        String ss_qit1 = entity.getSs_qit1();
        if (ss_qit1 != null) {
            stmt.bindString(28, ss_qit1);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(29, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Sandaoliusuiertongjiankang readEntity(Cursor cursor, int offset) {
        Sandaoliusuiertongjiankang entity = new Sandaoliusuiertongjiankang( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // ssjk_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // na_id
            cursor.getInt(offset + 3), // ss_yuel
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ss_follow_date
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // hw_id
            cursor.getInt(offset + 6), // ss_sgfy
            cursor.getInt(offset + 7), // ss_tzfy
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // ss_shil
            cursor.getInt(offset + 9), // ss_tingl
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // ss_cys
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // ss_qcs
            cursor.getInt(offset + 12), // ss_xinf
            cursor.getInt(offset + 13), // ss_fub
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // xhdb_id
            cursor.getInt(offset + 15), // ss_lcsfhb
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // ss_feiy
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // ss_fux
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // ss_wais
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // ss_qit
            cursor.getInt(offset + 20), // ss_zzjy
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // ss_zzyy
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // ss_jgks
            cursor.getInt(offset + 23), // ss_zhid
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // ss_next_date
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // ss_doctor
            cursor.getInt(offset + 26), // ss_tigfypj
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // ss_qit1
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Sandaoliusuiertongjiankang entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSsjk_id(cursor.getString(offset + 1));
        entity.setNa_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSs_yuel(cursor.getInt(offset + 3));
        entity.setSs_follow_date(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setHw_id(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSs_sgfy(cursor.getInt(offset + 6));
        entity.setSs_tzfy(cursor.getInt(offset + 7));
        entity.setSs_shil(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setSs_tingl(cursor.getInt(offset + 9));
        entity.setSs_cys(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSs_qcs(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setSs_xinf(cursor.getInt(offset + 12));
        entity.setSs_fub(cursor.getInt(offset + 13));
        entity.setXhdb_id(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setSs_lcsfhb(cursor.getInt(offset + 15));
        entity.setSs_feiy(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setSs_fux(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setSs_wais(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setSs_qit(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setSs_zzjy(cursor.getInt(offset + 20));
        entity.setSs_zzyy(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setSs_jgks(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setSs_zhid(cursor.getInt(offset + 23));
        entity.setSs_next_date(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setSs_doctor(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setSs_tigfypj(cursor.getInt(offset + 26));
        entity.setSs_qit1(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setCreateDate(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Sandaoliusuiertongjiankang entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Sandaoliusuiertongjiankang entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Sandaoliusuiertongjiankang entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
