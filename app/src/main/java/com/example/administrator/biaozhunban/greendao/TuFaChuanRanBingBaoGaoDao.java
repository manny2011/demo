package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.TuFaChuanRanBingBaoGao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TU_FA_CHUAN_RAN_BING_BAO_GAO".
*/
public class TuFaChuanRanBingBaoGaoDao extends AbstractDao<TuFaChuanRanBingBaoGao, Long> {

    public static final String TABLENAME = "TU_FA_CHUAN_RAN_BING_BAO_GAO";

    /**
     * Properties of entity TuFaChuanRanBingBaoGao.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Crb_id = new Property(1, String.class, "crb_id", false, "CRB_ID");
        public final static Property Na_id = new Property(2, String.class, "na_id", false, "NA_ID");
        public final static Property Nation_id = new Property(3, int.class, "nation_id", false, "NATION_ID");
        public final static Property Crb_Company = new Property(4, String.class, "crb_Company", false, "CRB__COMPANY");
        public final static Property Crb_Occupation = new Property(5, String.class, "crb_Occupation", false, "CRB__OCCUPATION");
        public final static Property Crb_disease_time = new Property(6, String.class, "crb_disease_time", false, "CRB_DISEASE_TIME");
        public final static Property Crb_visit_time = new Property(7, String.class, "crb_visit_time", false, "CRB_VISIT_TIME");
        public final static Property Crb_admission_time = new Property(8, String.class, "crb_admission_time", false, "CRB_ADMISSION_TIME");
        public final static Property Crb_death_time = new Property(9, String.class, "crb_death_time", false, "CRB_DEATH_TIME");
        public final static Property Crb_report_time = new Property(10, String.class, "crb_report_time", false, "CRB_REPORT_TIME");
        public final static Property Crb_Reporting_unit = new Property(11, String.class, "crb_Reporting_unit", false, "CRB__REPORTING_UNIT");
        public final static Property Crb_Rapporteur = new Property(12, String.class, "crb_Rapporteur", false, "CRB__RAPPORTEUR");
        public final static Property Crb_clinical = new Property(13, String.class, "crb_clinical", false, "CRB_CLINICAL");
        public final static Property Crb_type_id = new Property(14, int.class, "crb_type_id", false, "CRB_TYPE_ID");
        public final static Property Crb_creattime = new Property(15, String.class, "crb_creattime", false, "CRB_CREATTIME");
        public final static Property CreateDate = new Property(16, String.class, "createDate", false, "CREATE_DATE");
    }


    public TuFaChuanRanBingBaoGaoDao(DaoConfig config) {
        super(config);
    }
    
    public TuFaChuanRanBingBaoGaoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TU_FA_CHUAN_RAN_BING_BAO_GAO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"CRB_ID\" TEXT NOT NULL ," + // 1: crb_id
                "\"NA_ID\" TEXT NOT NULL ," + // 2: na_id
                "\"NATION_ID\" INTEGER NOT NULL ," + // 3: nation_id
                "\"CRB__COMPANY\" TEXT," + // 4: crb_Company
                "\"CRB__OCCUPATION\" TEXT," + // 5: crb_Occupation
                "\"CRB_DISEASE_TIME\" TEXT," + // 6: crb_disease_time
                "\"CRB_VISIT_TIME\" TEXT," + // 7: crb_visit_time
                "\"CRB_ADMISSION_TIME\" TEXT," + // 8: crb_admission_time
                "\"CRB_DEATH_TIME\" TEXT," + // 9: crb_death_time
                "\"CRB_REPORT_TIME\" TEXT," + // 10: crb_report_time
                "\"CRB__REPORTING_UNIT\" TEXT," + // 11: crb_Reporting_unit
                "\"CRB__RAPPORTEUR\" TEXT," + // 12: crb_Rapporteur
                "\"CRB_CLINICAL\" TEXT," + // 13: crb_clinical
                "\"CRB_TYPE_ID\" INTEGER NOT NULL ," + // 14: crb_type_id
                "\"CRB_CREATTIME\" TEXT," + // 15: crb_creattime
                "\"CREATE_DATE\" TEXT);"); // 16: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TU_FA_CHUAN_RAN_BING_BAO_GAO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TuFaChuanRanBingBaoGao entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getCrb_id());
        stmt.bindString(3, entity.getNa_id());
        stmt.bindLong(4, entity.getNation_id());
 
        String crb_Company = entity.getCrb_Company();
        if (crb_Company != null) {
            stmt.bindString(5, crb_Company);
        }
 
        String crb_Occupation = entity.getCrb_Occupation();
        if (crb_Occupation != null) {
            stmt.bindString(6, crb_Occupation);
        }
 
        String crb_disease_time = entity.getCrb_disease_time();
        if (crb_disease_time != null) {
            stmt.bindString(7, crb_disease_time);
        }
 
        String crb_visit_time = entity.getCrb_visit_time();
        if (crb_visit_time != null) {
            stmt.bindString(8, crb_visit_time);
        }
 
        String crb_admission_time = entity.getCrb_admission_time();
        if (crb_admission_time != null) {
            stmt.bindString(9, crb_admission_time);
        }
 
        String crb_death_time = entity.getCrb_death_time();
        if (crb_death_time != null) {
            stmt.bindString(10, crb_death_time);
        }
 
        String crb_report_time = entity.getCrb_report_time();
        if (crb_report_time != null) {
            stmt.bindString(11, crb_report_time);
        }
 
        String crb_Reporting_unit = entity.getCrb_Reporting_unit();
        if (crb_Reporting_unit != null) {
            stmt.bindString(12, crb_Reporting_unit);
        }
 
        String crb_Rapporteur = entity.getCrb_Rapporteur();
        if (crb_Rapporteur != null) {
            stmt.bindString(13, crb_Rapporteur);
        }
 
        String crb_clinical = entity.getCrb_clinical();
        if (crb_clinical != null) {
            stmt.bindString(14, crb_clinical);
        }
        stmt.bindLong(15, entity.getCrb_type_id());
 
        String crb_creattime = entity.getCrb_creattime();
        if (crb_creattime != null) {
            stmt.bindString(16, crb_creattime);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(17, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TuFaChuanRanBingBaoGao entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getCrb_id());
        stmt.bindString(3, entity.getNa_id());
        stmt.bindLong(4, entity.getNation_id());
 
        String crb_Company = entity.getCrb_Company();
        if (crb_Company != null) {
            stmt.bindString(5, crb_Company);
        }
 
        String crb_Occupation = entity.getCrb_Occupation();
        if (crb_Occupation != null) {
            stmt.bindString(6, crb_Occupation);
        }
 
        String crb_disease_time = entity.getCrb_disease_time();
        if (crb_disease_time != null) {
            stmt.bindString(7, crb_disease_time);
        }
 
        String crb_visit_time = entity.getCrb_visit_time();
        if (crb_visit_time != null) {
            stmt.bindString(8, crb_visit_time);
        }
 
        String crb_admission_time = entity.getCrb_admission_time();
        if (crb_admission_time != null) {
            stmt.bindString(9, crb_admission_time);
        }
 
        String crb_death_time = entity.getCrb_death_time();
        if (crb_death_time != null) {
            stmt.bindString(10, crb_death_time);
        }
 
        String crb_report_time = entity.getCrb_report_time();
        if (crb_report_time != null) {
            stmt.bindString(11, crb_report_time);
        }
 
        String crb_Reporting_unit = entity.getCrb_Reporting_unit();
        if (crb_Reporting_unit != null) {
            stmt.bindString(12, crb_Reporting_unit);
        }
 
        String crb_Rapporteur = entity.getCrb_Rapporteur();
        if (crb_Rapporteur != null) {
            stmt.bindString(13, crb_Rapporteur);
        }
 
        String crb_clinical = entity.getCrb_clinical();
        if (crb_clinical != null) {
            stmt.bindString(14, crb_clinical);
        }
        stmt.bindLong(15, entity.getCrb_type_id());
 
        String crb_creattime = entity.getCrb_creattime();
        if (crb_creattime != null) {
            stmt.bindString(16, crb_creattime);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(17, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TuFaChuanRanBingBaoGao readEntity(Cursor cursor, int offset) {
        TuFaChuanRanBingBaoGao entity = new TuFaChuanRanBingBaoGao( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // crb_id
            cursor.getString(offset + 2), // na_id
            cursor.getInt(offset + 3), // nation_id
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // crb_Company
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // crb_Occupation
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // crb_disease_time
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // crb_visit_time
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // crb_admission_time
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // crb_death_time
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // crb_report_time
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // crb_Reporting_unit
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // crb_Rapporteur
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // crb_clinical
            cursor.getInt(offset + 14), // crb_type_id
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // crb_creattime
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TuFaChuanRanBingBaoGao entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCrb_id(cursor.getString(offset + 1));
        entity.setNa_id(cursor.getString(offset + 2));
        entity.setNation_id(cursor.getInt(offset + 3));
        entity.setCrb_Company(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCrb_Occupation(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCrb_disease_time(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCrb_visit_time(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCrb_admission_time(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setCrb_death_time(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setCrb_report_time(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setCrb_Reporting_unit(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setCrb_Rapporteur(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setCrb_clinical(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setCrb_type_id(cursor.getInt(offset + 14));
        entity.setCrb_creattime(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setCreateDate(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TuFaChuanRanBingBaoGao entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TuFaChuanRanBingBaoGao entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TuFaChuanRanBingBaoGao entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}