package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.SheBeiTiWen;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SHE_BEI_TI_WEN".
*/
public class SheBeiTiWenDao extends AbstractDao<SheBeiTiWen, Long> {

    public static final String TABLENAME = "SHE_BEI_TI_WEN";

    /**
     * Properties of entity SheBeiTiWen.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Temp_id = new Property(1, String.class, "temp_id", false, "TEMP_ID");
        public final static Property Na_id = new Property(2, String.class, "na_id", false, "NA_ID");
        public final static Property Equip_id = new Property(3, String.class, "equip_id", false, "EQUIP_ID");
        public final static Property Temp_num = new Property(4, String.class, "temp_num", false, "TEMP_NUM");
        public final static Property Temp_time = new Property(5, String.class, "temp_time", false, "TEMP_TIME");
        public final static Property CreateDate = new Property(6, String.class, "createDate", false, "CREATE_DATE");
    }


    public SheBeiTiWenDao(DaoConfig config) {
        super(config);
    }
    
    public SheBeiTiWenDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SHE_BEI_TI_WEN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TEMP_ID\" TEXT NOT NULL ," + // 1: temp_id
                "\"NA_ID\" TEXT," + // 2: na_id
                "\"EQUIP_ID\" TEXT," + // 3: equip_id
                "\"TEMP_NUM\" TEXT," + // 4: temp_num
                "\"TEMP_TIME\" TEXT," + // 5: temp_time
                "\"CREATE_DATE\" TEXT);"); // 6: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SHE_BEI_TI_WEN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SheBeiTiWen entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getTemp_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
 
        String equip_id = entity.getEquip_id();
        if (equip_id != null) {
            stmt.bindString(4, equip_id);
        }
 
        String temp_num = entity.getTemp_num();
        if (temp_num != null) {
            stmt.bindString(5, temp_num);
        }
 
        String temp_time = entity.getTemp_time();
        if (temp_time != null) {
            stmt.bindString(6, temp_time);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(7, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SheBeiTiWen entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getTemp_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
 
        String equip_id = entity.getEquip_id();
        if (equip_id != null) {
            stmt.bindString(4, equip_id);
        }
 
        String temp_num = entity.getTemp_num();
        if (temp_num != null) {
            stmt.bindString(5, temp_num);
        }
 
        String temp_time = entity.getTemp_time();
        if (temp_time != null) {
            stmt.bindString(6, temp_time);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(7, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public SheBeiTiWen readEntity(Cursor cursor, int offset) {
        SheBeiTiWen entity = new SheBeiTiWen( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // temp_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // na_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // equip_id
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // temp_num
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // temp_time
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SheBeiTiWen entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTemp_id(cursor.getString(offset + 1));
        entity.setNa_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEquip_id(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setTemp_num(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTemp_time(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCreateDate(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SheBeiTiWen entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SheBeiTiWen entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SheBeiTiWen entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
