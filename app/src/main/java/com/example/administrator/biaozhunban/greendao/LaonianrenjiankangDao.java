package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.Laonianrenjiankang;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LAONIANRENJIANKANG".
*/
public class LaonianrenjiankangDao extends AbstractDao<Laonianrenjiankang, Long> {

    public static final String TABLENAME = "LAONIANRENJIANKANG";

    /**
     * Properties of entity Laonianrenjiankang.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Lnr_id = new Property(1, String.class, "lnr_id", false, "LNR_ID");
        public final static Property Na_id = new Property(2, String.class, "na_id", false, "NA_ID");
        public final static Property Lnr_Evaluation_date = new Property(3, String.class, "lnr_Evaluation_date", false, "LNR__EVALUATION_DATE");
        public final static Property Lnr_The_meal = new Property(4, int.class, "lnr_The_meal", false, "LNR__THE_MEAL");
        public final static Property Lnr_Freshen = new Property(5, int.class, "lnr_Freshen", false, "LNR__FRESHEN");
        public final static Property Lnr_Dressing = new Property(6, int.class, "lnr_Dressing", false, "LNR__DRESSING");
        public final static Property Lnr_toilet = new Property(7, int.class, "lnr_toilet", false, "LNR_TOILET");
        public final static Property Lnr_activity = new Property(8, int.class, "lnr_activity", false, "LNR_ACTIVITY");
        public final static Property Lnr_score = new Property(9, int.class, "lnr_score", false, "LNR_SCORE");
        public final static Property Lnr_result = new Property(10, String.class, "lnr_result", false, "LNR_RESULT");
        public final static Property CreateDate = new Property(11, String.class, "createDate", false, "CREATE_DATE");
    }


    public LaonianrenjiankangDao(DaoConfig config) {
        super(config);
    }
    
    public LaonianrenjiankangDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LAONIANRENJIANKANG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"LNR_ID\" TEXT NOT NULL ," + // 1: lnr_id
                "\"NA_ID\" TEXT," + // 2: na_id
                "\"LNR__EVALUATION_DATE\" TEXT," + // 3: lnr_Evaluation_date
                "\"LNR__THE_MEAL\" INTEGER NOT NULL ," + // 4: lnr_The_meal
                "\"LNR__FRESHEN\" INTEGER NOT NULL ," + // 5: lnr_Freshen
                "\"LNR__DRESSING\" INTEGER NOT NULL ," + // 6: lnr_Dressing
                "\"LNR_TOILET\" INTEGER NOT NULL ," + // 7: lnr_toilet
                "\"LNR_ACTIVITY\" INTEGER NOT NULL ," + // 8: lnr_activity
                "\"LNR_SCORE\" INTEGER NOT NULL ," + // 9: lnr_score
                "\"LNR_RESULT\" TEXT," + // 10: lnr_result
                "\"CREATE_DATE\" TEXT);"); // 11: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LAONIANRENJIANKANG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Laonianrenjiankang entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getLnr_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
 
        String lnr_Evaluation_date = entity.getLnr_Evaluation_date();
        if (lnr_Evaluation_date != null) {
            stmt.bindString(4, lnr_Evaluation_date);
        }
        stmt.bindLong(5, entity.getLnr_The_meal());
        stmt.bindLong(6, entity.getLnr_Freshen());
        stmt.bindLong(7, entity.getLnr_Dressing());
        stmt.bindLong(8, entity.getLnr_toilet());
        stmt.bindLong(9, entity.getLnr_activity());
        stmt.bindLong(10, entity.getLnr_score());
 
        String lnr_result = entity.getLnr_result();
        if (lnr_result != null) {
            stmt.bindString(11, lnr_result);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(12, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Laonianrenjiankang entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getLnr_id());
 
        String na_id = entity.getNa_id();
        if (na_id != null) {
            stmt.bindString(3, na_id);
        }
 
        String lnr_Evaluation_date = entity.getLnr_Evaluation_date();
        if (lnr_Evaluation_date != null) {
            stmt.bindString(4, lnr_Evaluation_date);
        }
        stmt.bindLong(5, entity.getLnr_The_meal());
        stmt.bindLong(6, entity.getLnr_Freshen());
        stmt.bindLong(7, entity.getLnr_Dressing());
        stmt.bindLong(8, entity.getLnr_toilet());
        stmt.bindLong(9, entity.getLnr_activity());
        stmt.bindLong(10, entity.getLnr_score());
 
        String lnr_result = entity.getLnr_result();
        if (lnr_result != null) {
            stmt.bindString(11, lnr_result);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(12, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Laonianrenjiankang readEntity(Cursor cursor, int offset) {
        Laonianrenjiankang entity = new Laonianrenjiankang( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // lnr_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // na_id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // lnr_Evaluation_date
            cursor.getInt(offset + 4), // lnr_The_meal
            cursor.getInt(offset + 5), // lnr_Freshen
            cursor.getInt(offset + 6), // lnr_Dressing
            cursor.getInt(offset + 7), // lnr_toilet
            cursor.getInt(offset + 8), // lnr_activity
            cursor.getInt(offset + 9), // lnr_score
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // lnr_result
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Laonianrenjiankang entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLnr_id(cursor.getString(offset + 1));
        entity.setNa_id(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLnr_Evaluation_date(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLnr_The_meal(cursor.getInt(offset + 4));
        entity.setLnr_Freshen(cursor.getInt(offset + 5));
        entity.setLnr_Dressing(cursor.getInt(offset + 6));
        entity.setLnr_toilet(cursor.getInt(offset + 7));
        entity.setLnr_activity(cursor.getInt(offset + 8));
        entity.setLnr_score(cursor.getInt(offset + 9));
        entity.setLnr_result(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setCreateDate(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Laonianrenjiankang entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Laonianrenjiankang entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Laonianrenjiankang entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
