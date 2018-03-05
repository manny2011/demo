package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.City;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CITY".
*/
public class CityDao extends AbstractDao<City, Long> {

    public static final String TABLENAME = "CITY";

    /**
     * Properties of entity City.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property City_id = new Property(0, Long.class, "city_id", true, "_id");
        public final static Property City_code = new Property(1, String.class, "city_code", false, "CITY_CODE");
        public final static Property City_name = new Property(2, String.class, "city_name", false, "CITY_NAME");
        public final static Property Province_code = new Property(3, String.class, "province_code", false, "PROVINCE_CODE");
        public final static Property CreateDate = new Property(4, String.class, "createDate", false, "CREATE_DATE");
    }


    public CityDao(DaoConfig config) {
        super(config);
    }
    
    public CityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: city_id
                "\"CITY_CODE\" TEXT," + // 1: city_code
                "\"CITY_NAME\" TEXT," + // 2: city_name
                "\"PROVINCE_CODE\" TEXT," + // 3: province_code
                "\"CREATE_DATE\" TEXT);"); // 4: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, City entity) {
        stmt.clearBindings();
 
        Long city_id = entity.getCity_id();
        if (city_id != null) {
            stmt.bindLong(1, city_id);
        }
 
        String city_code = entity.getCity_code();
        if (city_code != null) {
            stmt.bindString(2, city_code);
        }
 
        String city_name = entity.getCity_name();
        if (city_name != null) {
            stmt.bindString(3, city_name);
        }
 
        String province_code = entity.getProvince_code();
        if (province_code != null) {
            stmt.bindString(4, province_code);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(5, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, City entity) {
        stmt.clearBindings();
 
        Long city_id = entity.getCity_id();
        if (city_id != null) {
            stmt.bindLong(1, city_id);
        }
 
        String city_code = entity.getCity_code();
        if (city_code != null) {
            stmt.bindString(2, city_code);
        }
 
        String city_name = entity.getCity_name();
        if (city_name != null) {
            stmt.bindString(3, city_name);
        }
 
        String province_code = entity.getProvince_code();
        if (province_code != null) {
            stmt.bindString(4, province_code);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(5, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public City readEntity(Cursor cursor, int offset) {
        City entity = new City( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // city_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // city_code
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // city_name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // province_code
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, City entity, int offset) {
        entity.setCity_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCity_code(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCity_name(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setProvince_code(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCreateDate(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(City entity, long rowId) {
        entity.setCity_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(City entity) {
        if(entity != null) {
            return entity.getCity_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(City entity) {
        return entity.getCity_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
