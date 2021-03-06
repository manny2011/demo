package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.SheBeiNiaoJian;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SHE_BEI_NIAO_JIAN".
*/
public class SheBeiNiaoJianDao extends AbstractDao<SheBeiNiaoJian, Long> {

    public static final String TABLENAME = "SHE_BEI_NIAO_JIAN";

    /**
     * Properties of entity SheBeiNiaoJian.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Urine_id = new Property(1, String.class, "urine_id", false, "URINE_ID");
        public final static Property Na_id = new Property(2, String.class, "na_id", false, "NA_ID");
        public final static Property Equip_id = new Property(3, String.class, "equip_id", false, "EQUIP_ID");
        public final static Property Urine_time = new Property(4, String.class, "urine_time", false, "URINE_TIME");
        public final static Property CreateDate = new Property(5, String.class, "createDate", false, "CREATE_DATE");
    }


    public SheBeiNiaoJianDao(DaoConfig config) {
        super(config);
    }
    
    public SheBeiNiaoJianDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SHE_BEI_NIAO_JIAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"URINE_ID\" TEXT NOT NULL ," + // 1: urine_id
                "\"NA_ID\" TEXT," + // 2: na_id
                "\"EQUIP_ID\" TEXT," + // 3: equip_id
                "\"URINE_TIME\" TEXT," + // 4: urine_time
                "\"CREATE_DATE\" TEXT);"); // 5: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SHE_BEI_NIAO_JIAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SheBeiNiaoJian entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getUrine_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
 
        String equip_id = entity.getEquip_id();
        if (equip_id != null) {
            stmt.bindString(4, equip_id);
        }
 
        String urine_time = entity.getUrine_time();
        if (urine_time != null) {
            stmt.bindString(5, urine_time);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(6, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SheBeiNiaoJian entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getUrine_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
 
        String equip_id = entity.getEquip_id();
        if (equip_id != null) {
            stmt.bindString(4, equip_id);
        }
 
        String urine_time = entity.getUrine_time();
        if (urine_time != null) {
            stmt.bindString(5, urine_time);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(6, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public SheBeiNiaoJian readEntity(Cursor cursor, int offset) {
        SheBeiNiaoJian entity = new SheBeiNiaoJian( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // urine_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // na_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // equip_id
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // urine_time
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SheBeiNiaoJian entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUrine_id(cursor.getString(offset + 1));
        entity.setNa_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEquip_id(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUrine_time(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCreateDate(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SheBeiNiaoJian entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SheBeiNiaoJian entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SheBeiNiaoJian entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
