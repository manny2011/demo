package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.FeiMianYiYuFangJieZhong;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FEI_MIAN_YI_YU_FANG_JIE_ZHONG".
*/
public class FeiMianYiYuFangJieZhongDao extends AbstractDao<FeiMianYiYuFangJieZhong, Long> {

    public static final String TABLENAME = "FEI_MIAN_YI_YU_FANG_JIE_ZHONG";

    /**
     * Properties of entity FeiMianYiYuFangJieZhong.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Fmyjz_id = new Property(1, String.class, "fmyjz_id", false, "FMYJZ_ID");
        public final static Property Jktj_id = new Property(2, String.class, "jktj_id", false, "JKTJ_ID");
        public final static Property Fmyjz_name = new Property(3, String.class, "fmyjz_name", false, "FMYJZ_NAME");
        public final static Property Fmyjz_date = new Property(4, String.class, "fmyjz_date", false, "FMYJZ_DATE");
        public final static Property Fmyjz_jzjg = new Property(5, String.class, "fmyjz_jzjg", false, "FMYJZ_JZJG");
        public final static Property CreateDate = new Property(6, String.class, "createDate", false, "CREATE_DATE");
    }


    public FeiMianYiYuFangJieZhongDao(DaoConfig config) {
        super(config);
    }
    
    public FeiMianYiYuFangJieZhongDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FEI_MIAN_YI_YU_FANG_JIE_ZHONG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"FMYJZ_ID\" TEXT NOT NULL ," + // 1: fmyjz_id
                "\"JKTJ_ID\" TEXT NOT NULL ," + // 2: jktj_id
                "\"FMYJZ_NAME\" TEXT," + // 3: fmyjz_name
                "\"FMYJZ_DATE\" TEXT," + // 4: fmyjz_date
                "\"FMYJZ_JZJG\" TEXT," + // 5: fmyjz_jzjg
                "\"CREATE_DATE\" TEXT);"); // 6: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FEI_MIAN_YI_YU_FANG_JIE_ZHONG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FeiMianYiYuFangJieZhong entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getFmyjz_id());
        stmt.bindString(3, entity.getJktj_id());
 
        String fmyjz_name = entity.getFmyjz_name();
        if (fmyjz_name != null) {
            stmt.bindString(4, fmyjz_name);
        }
 
        String fmyjz_date = entity.getFmyjz_date();
        if (fmyjz_date != null) {
            stmt.bindString(5, fmyjz_date);
        }
 
        String fmyjz_jzjg = entity.getFmyjz_jzjg();
        if (fmyjz_jzjg != null) {
            stmt.bindString(6, fmyjz_jzjg);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(7, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FeiMianYiYuFangJieZhong entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getFmyjz_id());
        stmt.bindString(3, entity.getJktj_id());
 
        String fmyjz_name = entity.getFmyjz_name();
        if (fmyjz_name != null) {
            stmt.bindString(4, fmyjz_name);
        }
 
        String fmyjz_date = entity.getFmyjz_date();
        if (fmyjz_date != null) {
            stmt.bindString(5, fmyjz_date);
        }
 
        String fmyjz_jzjg = entity.getFmyjz_jzjg();
        if (fmyjz_jzjg != null) {
            stmt.bindString(6, fmyjz_jzjg);
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
    public FeiMianYiYuFangJieZhong readEntity(Cursor cursor, int offset) {
        FeiMianYiYuFangJieZhong entity = new FeiMianYiYuFangJieZhong( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // fmyjz_id
            cursor.getString(offset + 2), // jktj_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // fmyjz_name
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // fmyjz_date
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // fmyjz_jzjg
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FeiMianYiYuFangJieZhong entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFmyjz_id(cursor.getString(offset + 1));
        entity.setJktj_id(cursor.getString(offset + 2));
        entity.setFmyjz_name(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFmyjz_date(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFmyjz_jzjg(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCreateDate(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FeiMianYiYuFangJieZhong entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FeiMianYiYuFangJieZhong entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FeiMianYiYuFangJieZhong entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
