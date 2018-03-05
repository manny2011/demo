package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.Chanhuofangshijilu;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CHANHUOFANGSHIJILU".
*/
public class ChanhuofangshijiluDao extends AbstractDao<Chanhuofangshijilu, Long> {

    public static final String TABLENAME = "CHANHUOFANGSHIJILU";

    /**
     * Properties of entity Chanhuofangshijilu.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Ycfp_id = new Property(1, String.class, "ycfp_id", false, "YCFP_ID");
        public final static Property Na_id = new Property(2, String.class, "na_id", false, "NA_ID");
        public final static Property Ycfp_date = new Property(3, String.class, "ycfp_date", false, "YCFP_DATE");
        public final static Property Temp_id = new Property(4, String.class, "temp_id", false, "TEMP_ID");
        public final static Property Ycfp_jkql = new Property(5, String.class, "ycfp_jkql", false, "YCFP_JKQL");
        public final static Property Ycfp_xlzk = new Property(6, String.class, "ycfp_xlzk", false, "YCFP_XLZK");
        public final static Property Bp_id = new Property(7, String.class, "bp_id", false, "BP_ID");
        public final static Property Ycfp_rf = new Property(8, int.class, "ycfp_rf", false, "YCFP_RF");
        public final static Property Ycfp_rf_ms = new Property(9, String.class, "ycfp_rf_ms", false, "YCFP_RF_MS");
        public final static Property Ycfp_el = new Property(10, int.class, "ycfp_el", false, "YCFP_EL");
        public final static Property Ycfp_el_ms = new Property(11, String.class, "ycfp_el_ms", false, "YCFP_EL_MS");
        public final static Property Ycfp_zg = new Property(12, int.class, "ycfp_zg", false, "YCFP_ZG");
        public final static Property Ycfp_zg_ms = new Property(13, String.class, "ycfp_zg_ms", false, "YCFP_ZG_MS");
        public final static Property Ycfp_sk = new Property(14, int.class, "ycfp_sk", false, "YCFP_SK");
        public final static Property Ycfp_sk_ms = new Property(15, String.class, "ycfp_sk_ms", false, "YCFP_SK_MS");
        public final static Property Ycfp_other = new Property(16, String.class, "ycfp_other", false, "YCFP_OTHER");
        public final static Property Ycfp_type = new Property(17, int.class, "ycfp_type", false, "YCFP_TYPE");
        public final static Property Ycfp_type_ms = new Property(18, String.class, "ycfp_type_ms", false, "YCFP_TYPE_MS");
        public final static Property Ycfp_zd = new Property(19, int.class, "ycfp_zd", false, "YCFP_ZD");
        public final static Property Ycfp_zz = new Property(20, int.class, "ycfp_zz", false, "YCFP_ZZ");
        public final static Property Ycfp_yy = new Property(21, String.class, "ycfp_yy", false, "YCFP_YY");
        public final static Property Ycfp_jgks = new Property(22, String.class, "ycfp_jgks", false, "YCFP_JGKS");
        public final static Property Ycfp_nextdate = new Property(23, String.class, "ycfp_nextdate", false, "YCFP_NEXTDATE");
        public final static Property Ycfp_doctor = new Property(24, String.class, "ycfp_doctor", false, "YCFP_DOCTOR");
        public final static Property CreateDate = new Property(25, String.class, "createDate", false, "CREATE_DATE");
    }


    public ChanhuofangshijiluDao(DaoConfig config) {
        super(config);
    }
    
    public ChanhuofangshijiluDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CHANHUOFANGSHIJILU\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"YCFP_ID\" TEXT NOT NULL ," + // 1: ycfp_id
                "\"NA_ID\" TEXT NOT NULL ," + // 2: na_id
                "\"YCFP_DATE\" TEXT," + // 3: ycfp_date
                "\"TEMP_ID\" TEXT," + // 4: temp_id
                "\"YCFP_JKQL\" TEXT," + // 5: ycfp_jkql
                "\"YCFP_XLZK\" TEXT," + // 6: ycfp_xlzk
                "\"BP_ID\" TEXT," + // 7: bp_id
                "\"YCFP_RF\" INTEGER NOT NULL ," + // 8: ycfp_rf
                "\"YCFP_RF_MS\" TEXT," + // 9: ycfp_rf_ms
                "\"YCFP_EL\" INTEGER NOT NULL ," + // 10: ycfp_el
                "\"YCFP_EL_MS\" TEXT," + // 11: ycfp_el_ms
                "\"YCFP_ZG\" INTEGER NOT NULL ," + // 12: ycfp_zg
                "\"YCFP_ZG_MS\" TEXT," + // 13: ycfp_zg_ms
                "\"YCFP_SK\" INTEGER NOT NULL ," + // 14: ycfp_sk
                "\"YCFP_SK_MS\" TEXT," + // 15: ycfp_sk_ms
                "\"YCFP_OTHER\" TEXT," + // 16: ycfp_other
                "\"YCFP_TYPE\" INTEGER NOT NULL ," + // 17: ycfp_type
                "\"YCFP_TYPE_MS\" TEXT," + // 18: ycfp_type_ms
                "\"YCFP_ZD\" INTEGER NOT NULL ," + // 19: ycfp_zd
                "\"YCFP_ZZ\" INTEGER NOT NULL ," + // 20: ycfp_zz
                "\"YCFP_YY\" TEXT," + // 21: ycfp_yy
                "\"YCFP_JGKS\" TEXT," + // 22: ycfp_jgks
                "\"YCFP_NEXTDATE\" TEXT," + // 23: ycfp_nextdate
                "\"YCFP_DOCTOR\" TEXT," + // 24: ycfp_doctor
                "\"CREATE_DATE\" TEXT);"); // 25: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CHANHUOFANGSHIJILU\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Chanhuofangshijilu entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getYcfp_id());
        stmt.bindString(3, entity.getNa_id());
 
        String ycfp_date = entity.getYcfp_date();
        if (ycfp_date != null) {
            stmt.bindString(4, ycfp_date);
        }
 
        String temp_id = entity.getTemp_id();
        if (temp_id != null) {
            stmt.bindString(5, temp_id);
        }
 
        String ycfp_jkql = entity.getYcfp_jkql();
        if (ycfp_jkql != null) {
            stmt.bindString(6, ycfp_jkql);
        }
 
        String ycfp_xlzk = entity.getYcfp_xlzk();
        if (ycfp_xlzk != null) {
            stmt.bindString(7, ycfp_xlzk);
        }
 
        String bp_id = entity.getBp_id();
        if (bp_id != null) {
            stmt.bindString(8, bp_id);
        }
        stmt.bindLong(9, entity.getYcfp_rf());
 
        String ycfp_rf_ms = entity.getYcfp_rf_ms();
        if (ycfp_rf_ms != null) {
            stmt.bindString(10, ycfp_rf_ms);
        }
        stmt.bindLong(11, entity.getYcfp_el());
 
        String ycfp_el_ms = entity.getYcfp_el_ms();
        if (ycfp_el_ms != null) {
            stmt.bindString(12, ycfp_el_ms);
        }
        stmt.bindLong(13, entity.getYcfp_zg());
 
        String ycfp_zg_ms = entity.getYcfp_zg_ms();
        if (ycfp_zg_ms != null) {
            stmt.bindString(14, ycfp_zg_ms);
        }
        stmt.bindLong(15, entity.getYcfp_sk());
 
        String ycfp_sk_ms = entity.getYcfp_sk_ms();
        if (ycfp_sk_ms != null) {
            stmt.bindString(16, ycfp_sk_ms);
        }
 
        String ycfp_other = entity.getYcfp_other();
        if (ycfp_other != null) {
            stmt.bindString(17, ycfp_other);
        }
        stmt.bindLong(18, entity.getYcfp_type());
 
        String ycfp_type_ms = entity.getYcfp_type_ms();
        if (ycfp_type_ms != null) {
            stmt.bindString(19, ycfp_type_ms);
        }
        stmt.bindLong(20, entity.getYcfp_zd());
        stmt.bindLong(21, entity.getYcfp_zz());
 
        String ycfp_yy = entity.getYcfp_yy();
        if (ycfp_yy != null) {
            stmt.bindString(22, ycfp_yy);
        }
 
        String ycfp_jgks = entity.getYcfp_jgks();
        if (ycfp_jgks != null) {
            stmt.bindString(23, ycfp_jgks);
        }
 
        String ycfp_nextdate = entity.getYcfp_nextdate();
        if (ycfp_nextdate != null) {
            stmt.bindString(24, ycfp_nextdate);
        }
 
        String ycfp_doctor = entity.getYcfp_doctor();
        if (ycfp_doctor != null) {
            stmt.bindString(25, ycfp_doctor);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(26, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Chanhuofangshijilu entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getYcfp_id());
        stmt.bindString(3, entity.getNa_id());
 
        String ycfp_date = entity.getYcfp_date();
        if (ycfp_date != null) {
            stmt.bindString(4, ycfp_date);
        }
 
        String temp_id = entity.getTemp_id();
        if (temp_id != null) {
            stmt.bindString(5, temp_id);
        }
 
        String ycfp_jkql = entity.getYcfp_jkql();
        if (ycfp_jkql != null) {
            stmt.bindString(6, ycfp_jkql);
        }
 
        String ycfp_xlzk = entity.getYcfp_xlzk();
        if (ycfp_xlzk != null) {
            stmt.bindString(7, ycfp_xlzk);
        }
 
        String bp_id = entity.getBp_id();
        if (bp_id != null) {
            stmt.bindString(8, bp_id);
        }
        stmt.bindLong(9, entity.getYcfp_rf());
 
        String ycfp_rf_ms = entity.getYcfp_rf_ms();
        if (ycfp_rf_ms != null) {
            stmt.bindString(10, ycfp_rf_ms);
        }
        stmt.bindLong(11, entity.getYcfp_el());
 
        String ycfp_el_ms = entity.getYcfp_el_ms();
        if (ycfp_el_ms != null) {
            stmt.bindString(12, ycfp_el_ms);
        }
        stmt.bindLong(13, entity.getYcfp_zg());
 
        String ycfp_zg_ms = entity.getYcfp_zg_ms();
        if (ycfp_zg_ms != null) {
            stmt.bindString(14, ycfp_zg_ms);
        }
        stmt.bindLong(15, entity.getYcfp_sk());
 
        String ycfp_sk_ms = entity.getYcfp_sk_ms();
        if (ycfp_sk_ms != null) {
            stmt.bindString(16, ycfp_sk_ms);
        }
 
        String ycfp_other = entity.getYcfp_other();
        if (ycfp_other != null) {
            stmt.bindString(17, ycfp_other);
        }
        stmt.bindLong(18, entity.getYcfp_type());
 
        String ycfp_type_ms = entity.getYcfp_type_ms();
        if (ycfp_type_ms != null) {
            stmt.bindString(19, ycfp_type_ms);
        }
        stmt.bindLong(20, entity.getYcfp_zd());
        stmt.bindLong(21, entity.getYcfp_zz());
 
        String ycfp_yy = entity.getYcfp_yy();
        if (ycfp_yy != null) {
            stmt.bindString(22, ycfp_yy);
        }
 
        String ycfp_jgks = entity.getYcfp_jgks();
        if (ycfp_jgks != null) {
            stmt.bindString(23, ycfp_jgks);
        }
 
        String ycfp_nextdate = entity.getYcfp_nextdate();
        if (ycfp_nextdate != null) {
            stmt.bindString(24, ycfp_nextdate);
        }
 
        String ycfp_doctor = entity.getYcfp_doctor();
        if (ycfp_doctor != null) {
            stmt.bindString(25, ycfp_doctor);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(26, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Chanhuofangshijilu readEntity(Cursor cursor, int offset) {
        Chanhuofangshijilu entity = new Chanhuofangshijilu( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // ycfp_id
            cursor.getString(offset + 2), // na_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ycfp_date
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // temp_id
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // ycfp_jkql
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // ycfp_xlzk
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // bp_id
            cursor.getInt(offset + 8), // ycfp_rf
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // ycfp_rf_ms
            cursor.getInt(offset + 10), // ycfp_el
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // ycfp_el_ms
            cursor.getInt(offset + 12), // ycfp_zg
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // ycfp_zg_ms
            cursor.getInt(offset + 14), // ycfp_sk
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // ycfp_sk_ms
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // ycfp_other
            cursor.getInt(offset + 17), // ycfp_type
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // ycfp_type_ms
            cursor.getInt(offset + 19), // ycfp_zd
            cursor.getInt(offset + 20), // ycfp_zz
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // ycfp_yy
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // ycfp_jgks
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // ycfp_nextdate
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // ycfp_doctor
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Chanhuofangshijilu entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setYcfp_id(cursor.getString(offset + 1));
        entity.setNa_id(cursor.getString(offset + 2));
        entity.setYcfp_date(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTemp_id(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setYcfp_jkql(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setYcfp_xlzk(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setBp_id(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setYcfp_rf(cursor.getInt(offset + 8));
        entity.setYcfp_rf_ms(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setYcfp_el(cursor.getInt(offset + 10));
        entity.setYcfp_el_ms(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setYcfp_zg(cursor.getInt(offset + 12));
        entity.setYcfp_zg_ms(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setYcfp_sk(cursor.getInt(offset + 14));
        entity.setYcfp_sk_ms(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setYcfp_other(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setYcfp_type(cursor.getInt(offset + 17));
        entity.setYcfp_type_ms(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setYcfp_zd(cursor.getInt(offset + 19));
        entity.setYcfp_zz(cursor.getInt(offset + 20));
        entity.setYcfp_yy(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setYcfp_jgks(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setYcfp_nextdate(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setYcfp_doctor(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setCreateDate(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Chanhuofangshijilu entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Chanhuofangshijilu entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Chanhuofangshijilu entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
