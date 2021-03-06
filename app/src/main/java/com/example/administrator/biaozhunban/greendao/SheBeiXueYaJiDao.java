package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.SheBeiXueYaJi;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SHE_BEI_XUE_YA_JI".
*/
public class SheBeiXueYaJiDao extends AbstractDao<SheBeiXueYaJi, Long> {

    public static final String TABLENAME = "SHE_BEI_XUE_YA_JI";

    /**
     * Properties of entity SheBeiXueYaJi.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Bp_id = new Property(1, String.class, "bp_id", false, "BP_ID");
        public final static Property Na_id = new Property(2, String.class, "na_id", false, "NA_ID");
        public final static Property Equip_id = new Property(3, String.class, "equip_id", false, "EQUIP_ID");
        public final static Property Bp_sbp = new Property(4, String.class, "bp_sbp", false, "BP_SBP");
        public final static Property Bp_dbp = new Property(5, String.class, "bp_dbp", false, "BP_DBP");
        public final static Property Bp_heart = new Property(6, String.class, "bp_heart", false, "BP_HEART");
        public final static Property Bp_time = new Property(7, String.class, "bp_time", false, "BP_TIME");
        public final static Property Bp_score = new Property(8, int.class, "bp_score", false, "BP_SCORE");
        public final static Property Bp_health_state = new Property(9, int.class, "bp_health_state", false, "BP_HEALTH_STATE");
        public final static Property Bp_sbp_state = new Property(10, int.class, "bp_sbp_state", false, "BP_SBP_STATE");
        public final static Property Bp_dbp_state = new Property(11, int.class, "bp_dbp_state", false, "BP_DBP_STATE");
        public final static Property CreateDate = new Property(12, String.class, "createDate", false, "CREATE_DATE");
    }


    public SheBeiXueYaJiDao(DaoConfig config) {
        super(config);
    }
    
    public SheBeiXueYaJiDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SHE_BEI_XUE_YA_JI\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BP_ID\" TEXT NOT NULL ," + // 1: bp_id
                "\"NA_ID\" TEXT," + // 2: na_id
                "\"EQUIP_ID\" TEXT," + // 3: equip_id
                "\"BP_SBP\" TEXT," + // 4: bp_sbp
                "\"BP_DBP\" TEXT," + // 5: bp_dbp
                "\"BP_HEART\" TEXT," + // 6: bp_heart
                "\"BP_TIME\" TEXT," + // 7: bp_time
                "\"BP_SCORE\" INTEGER NOT NULL ," + // 8: bp_score
                "\"BP_HEALTH_STATE\" INTEGER NOT NULL ," + // 9: bp_health_state
                "\"BP_SBP_STATE\" INTEGER NOT NULL ," + // 10: bp_sbp_state
                "\"BP_DBP_STATE\" INTEGER NOT NULL ," + // 11: bp_dbp_state
                "\"CREATE_DATE\" TEXT);"); // 12: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SHE_BEI_XUE_YA_JI\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SheBeiXueYaJi entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getBp_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
 
        String equip_id = entity.getEquip_id();
        if (equip_id != null) {
            stmt.bindString(4, equip_id);
        }
 
        String bp_sbp = entity.getBp_sbp();
        if (bp_sbp != null) {
            stmt.bindString(5, bp_sbp);
        }
 
        String bp_dbp = entity.getBp_dbp();
        if (bp_dbp != null) {
            stmt.bindString(6, bp_dbp);
        }
 
        String bp_heart = entity.getBp_heart();
        if (bp_heart != null) {
            stmt.bindString(7, bp_heart);
        }
 
        String bp_time = entity.getBp_time();
        if (bp_time != null) {
            stmt.bindString(8, bp_time);
        }
        stmt.bindLong(9, entity.getBp_score());
        stmt.bindLong(10, entity.getBp_health_state());
        stmt.bindLong(11, entity.getBp_sbp_state());
        stmt.bindLong(12, entity.getBp_dbp_state());
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(13, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SheBeiXueYaJi entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getBp_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
 
        String equip_id = entity.getEquip_id();
        if (equip_id != null) {
            stmt.bindString(4, equip_id);
        }
 
        String bp_sbp = entity.getBp_sbp();
        if (bp_sbp != null) {
            stmt.bindString(5, bp_sbp);
        }
 
        String bp_dbp = entity.getBp_dbp();
        if (bp_dbp != null) {
            stmt.bindString(6, bp_dbp);
        }
 
        String bp_heart = entity.getBp_heart();
        if (bp_heart != null) {
            stmt.bindString(7, bp_heart);
        }
 
        String bp_time = entity.getBp_time();
        if (bp_time != null) {
            stmt.bindString(8, bp_time);
        }
        stmt.bindLong(9, entity.getBp_score());
        stmt.bindLong(10, entity.getBp_health_state());
        stmt.bindLong(11, entity.getBp_sbp_state());
        stmt.bindLong(12, entity.getBp_dbp_state());
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(13, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public SheBeiXueYaJi readEntity(Cursor cursor, int offset) {
        SheBeiXueYaJi entity = new SheBeiXueYaJi( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // bp_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // na_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // equip_id
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // bp_sbp
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // bp_dbp
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // bp_heart
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // bp_time
            cursor.getInt(offset + 8), // bp_score
            cursor.getInt(offset + 9), // bp_health_state
            cursor.getInt(offset + 10), // bp_sbp_state
            cursor.getInt(offset + 11), // bp_dbp_state
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SheBeiXueYaJi entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBp_id(cursor.getString(offset + 1));
        entity.setNa_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEquip_id(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setBp_sbp(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBp_dbp(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setBp_heart(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setBp_time(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setBp_score(cursor.getInt(offset + 8));
        entity.setBp_health_state(cursor.getInt(offset + 9));
        entity.setBp_sbp_state(cursor.getInt(offset + 10));
        entity.setBp_dbp_state(cursor.getInt(offset + 11));
        entity.setCreateDate(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SheBeiXueYaJi entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SheBeiXueYaJi entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SheBeiXueYaJi entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
