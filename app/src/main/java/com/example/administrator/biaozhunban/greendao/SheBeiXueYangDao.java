package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.SheBeiXueYang;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SHE_BEI_XUE_YANG".
*/
public class SheBeiXueYangDao extends AbstractDao<SheBeiXueYang, Long> {

    public static final String TABLENAME = "SHE_BEI_XUE_YANG";

    /**
     * Properties of entity SheBeiXueYang.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Spo_id = new Property(1, String.class, "spo_id", false, "SPO_ID");
        public final static Property Na_id = new Property(2, String.class, "na_id", false, "NA_ID");
        public final static Property Equip_id = new Property(3, String.class, "equip_id", false, "EQUIP_ID");
        public final static Property Spo_pulse = new Property(4, String.class, "spo_pulse", false, "SPO_PULSE");
        public final static Property Spo_saturation = new Property(5, String.class, "spo_saturation", false, "SPO_SATURATION");
        public final static Property Spo_score = new Property(6, String.class, "spo_score", false, "SPO_SCORE");
        public final static Property Spo_time = new Property(7, String.class, "spo_time", false, "SPO_TIME");
        public final static Property CreateDate = new Property(8, String.class, "createDate", false, "CREATE_DATE");
    }


    public SheBeiXueYangDao(DaoConfig config) {
        super(config);
    }
    
    public SheBeiXueYangDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SHE_BEI_XUE_YANG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"SPO_ID\" TEXT NOT NULL ," + // 1: spo_id
                "\"NA_ID\" TEXT," + // 2: na_id
                "\"EQUIP_ID\" TEXT," + // 3: equip_id
                "\"SPO_PULSE\" TEXT," + // 4: spo_pulse
                "\"SPO_SATURATION\" TEXT," + // 5: spo_saturation
                "\"SPO_SCORE\" TEXT," + // 6: spo_score
                "\"SPO_TIME\" TEXT," + // 7: spo_time
                "\"CREATE_DATE\" TEXT);"); // 8: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SHE_BEI_XUE_YANG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SheBeiXueYang entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getSpo_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
 
        String equip_id = entity.getEquip_id();
        if (equip_id != null) {
            stmt.bindString(4, equip_id);
        }
 
        String spo_pulse = entity.getSpo_pulse();
        if (spo_pulse != null) {
            stmt.bindString(5, spo_pulse);
        }
 
        String spo_saturation = entity.getSpo_saturation();
        if (spo_saturation != null) {
            stmt.bindString(6, spo_saturation);
        }
 
        String spo_score = entity.getSpo_score();
        if (spo_score != null) {
            stmt.bindString(7, spo_score);
        }
 
        String spo_time = entity.getSpo_time();
        if (spo_time != null) {
            stmt.bindString(8, spo_time);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(9, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SheBeiXueYang entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getSpo_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
 
        String equip_id = entity.getEquip_id();
        if (equip_id != null) {
            stmt.bindString(4, equip_id);
        }
 
        String spo_pulse = entity.getSpo_pulse();
        if (spo_pulse != null) {
            stmt.bindString(5, spo_pulse);
        }
 
        String spo_saturation = entity.getSpo_saturation();
        if (spo_saturation != null) {
            stmt.bindString(6, spo_saturation);
        }
 
        String spo_score = entity.getSpo_score();
        if (spo_score != null) {
            stmt.bindString(7, spo_score);
        }
 
        String spo_time = entity.getSpo_time();
        if (spo_time != null) {
            stmt.bindString(8, spo_time);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(9, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public SheBeiXueYang readEntity(Cursor cursor, int offset) {
        SheBeiXueYang entity = new SheBeiXueYang( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // spo_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // na_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // equip_id
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // spo_pulse
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // spo_saturation
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // spo_score
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // spo_time
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SheBeiXueYang entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSpo_id(cursor.getString(offset + 1));
        entity.setNa_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEquip_id(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSpo_pulse(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSpo_saturation(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSpo_score(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSpo_time(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCreateDate(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SheBeiXueYang entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SheBeiXueYang entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SheBeiXueYang entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
