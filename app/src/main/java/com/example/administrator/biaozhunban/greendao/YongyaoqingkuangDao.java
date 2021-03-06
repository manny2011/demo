package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.Yongyaoqingkuang;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "YONGYAOQINGKUANG".
*/
public class YongyaoqingkuangDao extends AbstractDao<Yongyaoqingkuang, Long> {

    public static final String TABLENAME = "YONGYAOQINGKUANG";

    /**
     * Properties of entity Yongyaoqingkuang.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Yyqk_id = new Property(1, String.class, "yyqk_id", false, "YYQK_ID");
        public final static Property Jktj_id = new Property(2, String.class, "jktj_id", false, "JKTJ_ID");
        public final static Property Yyqk_ywmc = new Property(3, String.class, "yyqk_ywmc", false, "YYQK_YWMC");
        public final static Property Yyqk_yf = new Property(4, String.class, "yyqk_yf", false, "YYQK_YF");
        public final static Property Yyqk_yl = new Property(5, String.class, "yyqk_yl", false, "YYQK_YL");
        public final static Property Yyqk_yysj = new Property(6, String.class, "yyqk_yysj", false, "YYQK_YYSJ");
        public final static Property Yyqk_ycx = new Property(7, int.class, "yyqk_ycx", false, "YYQK_YCX");
        public final static Property CreateDate = new Property(8, String.class, "createDate", false, "CREATE_DATE");
    }


    public YongyaoqingkuangDao(DaoConfig config) {
        super(config);
    }
    
    public YongyaoqingkuangDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"YONGYAOQINGKUANG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"YYQK_ID\" TEXT NOT NULL ," + // 1: yyqk_id
                "\"JKTJ_ID\" TEXT NOT NULL ," + // 2: jktj_id
                "\"YYQK_YWMC\" TEXT," + // 3: yyqk_ywmc
                "\"YYQK_YF\" TEXT," + // 4: yyqk_yf
                "\"YYQK_YL\" TEXT," + // 5: yyqk_yl
                "\"YYQK_YYSJ\" TEXT," + // 6: yyqk_yysj
                "\"YYQK_YCX\" INTEGER NOT NULL ," + // 7: yyqk_ycx
                "\"CREATE_DATE\" TEXT);"); // 8: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"YONGYAOQINGKUANG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Yongyaoqingkuang entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getYyqk_id());
        stmt.bindString(3, entity.getJktj_id());
 
        String yyqk_ywmc = entity.getYyqk_ywmc();
        if (yyqk_ywmc != null) {
            stmt.bindString(4, yyqk_ywmc);
        }
 
        String yyqk_yf = entity.getYyqk_yf();
        if (yyqk_yf != null) {
            stmt.bindString(5, yyqk_yf);
        }
 
        String yyqk_yl = entity.getYyqk_yl();
        if (yyqk_yl != null) {
            stmt.bindString(6, yyqk_yl);
        }
 
        String yyqk_yysj = entity.getYyqk_yysj();
        if (yyqk_yysj != null) {
            stmt.bindString(7, yyqk_yysj);
        }
        stmt.bindLong(8, entity.getYyqk_ycx());
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(9, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Yongyaoqingkuang entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getYyqk_id());
        stmt.bindString(3, entity.getJktj_id());
 
        String yyqk_ywmc = entity.getYyqk_ywmc();
        if (yyqk_ywmc != null) {
            stmt.bindString(4, yyqk_ywmc);
        }
 
        String yyqk_yf = entity.getYyqk_yf();
        if (yyqk_yf != null) {
            stmt.bindString(5, yyqk_yf);
        }
 
        String yyqk_yl = entity.getYyqk_yl();
        if (yyqk_yl != null) {
            stmt.bindString(6, yyqk_yl);
        }
 
        String yyqk_yysj = entity.getYyqk_yysj();
        if (yyqk_yysj != null) {
            stmt.bindString(7, yyqk_yysj);
        }
        stmt.bindLong(8, entity.getYyqk_ycx());
 
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
    public Yongyaoqingkuang readEntity(Cursor cursor, int offset) {
        Yongyaoqingkuang entity = new Yongyaoqingkuang( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // yyqk_id
            cursor.getString(offset + 2), // jktj_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // yyqk_ywmc
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // yyqk_yf
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // yyqk_yl
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // yyqk_yysj
            cursor.getInt(offset + 7), // yyqk_ycx
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Yongyaoqingkuang entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setYyqk_id(cursor.getString(offset + 1));
        entity.setJktj_id(cursor.getString(offset + 2));
        entity.setYyqk_ywmc(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setYyqk_yf(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setYyqk_yl(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setYyqk_yysj(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setYyqk_ycx(cursor.getInt(offset + 7));
        entity.setCreateDate(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Yongyaoqingkuang entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Yongyaoqingkuang entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Yongyaoqingkuang entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
