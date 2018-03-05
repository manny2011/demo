package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.WeiShengXieGuanBiao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WEI_SHENG_XIE_GUAN_BIAO".
*/
public class WeiShengXieGuanBiaoDao extends AbstractDao<WeiShengXieGuanBiao, Long> {

    public static final String TABLENAME = "WEI_SHENG_XIE_GUAN_BIAO";

    /**
     * Properties of entity WeiShengXieGuanBiao.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Wsxx_id = new Property(1, String.class, "wsxx_id", false, "WSXX_ID");
        public final static Property Wsxx_yljg = new Property(2, String.class, "wsxx_yljg", false, "WSXX_YLJG");
        public final static Property Wsxx_fxsj = new Property(3, String.class, "wsxx_fxsj", false, "WSXX_FXSJ");
        public final static Property Wsxx_xxlb = new Property(4, int.class, "wsxx_xxlb", false, "WSXX_XXLB");
        public final static Property Wsxx_xxnr = new Property(5, String.class, "wsxx_xxnr", false, "WSXX_XXNR");
        public final static Property Wsxx_bgsj = new Property(6, String.class, "wsxx_bgsj", false, "WSXX_BGSJ");
        public final static Property Wsxx_bgr = new Property(7, String.class, "wsxx_bgr", false, "WSXX_BGR");
        public final static Property CreateDate = new Property(8, String.class, "createDate", false, "CREATE_DATE");
    }


    public WeiShengXieGuanBiaoDao(DaoConfig config) {
        super(config);
    }
    
    public WeiShengXieGuanBiaoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WEI_SHENG_XIE_GUAN_BIAO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"WSXX_ID\" TEXT," + // 1: wsxx_id
                "\"WSXX_YLJG\" TEXT," + // 2: wsxx_yljg
                "\"WSXX_FXSJ\" TEXT," + // 3: wsxx_fxsj
                "\"WSXX_XXLB\" INTEGER NOT NULL ," + // 4: wsxx_xxlb
                "\"WSXX_XXNR\" TEXT," + // 5: wsxx_xxnr
                "\"WSXX_BGSJ\" TEXT," + // 6: wsxx_bgsj
                "\"WSXX_BGR\" TEXT," + // 7: wsxx_bgr
                "\"CREATE_DATE\" TEXT);"); // 8: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WEI_SHENG_XIE_GUAN_BIAO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, WeiShengXieGuanBiao entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String wsxx_id = entity.getWsxx_id();
        if (wsxx_id != null) {
            stmt.bindString(2, wsxx_id);
        }
 
        String wsxx_yljg = entity.getWsxx_yljg();
        if (wsxx_yljg != null) {
            stmt.bindString(3, wsxx_yljg);
        }
 
        String wsxx_fxsj = entity.getWsxx_fxsj();
        if (wsxx_fxsj != null) {
            stmt.bindString(4, wsxx_fxsj);
        }
        stmt.bindLong(5, entity.getWsxx_xxlb());
 
        String wsxx_xxnr = entity.getWsxx_xxnr();
        if (wsxx_xxnr != null) {
            stmt.bindString(6, wsxx_xxnr);
        }
 
        String wsxx_bgsj = entity.getWsxx_bgsj();
        if (wsxx_bgsj != null) {
            stmt.bindString(7, wsxx_bgsj);
        }
 
        String wsxx_bgr = entity.getWsxx_bgr();
        if (wsxx_bgr != null) {
            stmt.bindString(8, wsxx_bgr);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(9, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, WeiShengXieGuanBiao entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String wsxx_id = entity.getWsxx_id();
        if (wsxx_id != null) {
            stmt.bindString(2, wsxx_id);
        }
 
        String wsxx_yljg = entity.getWsxx_yljg();
        if (wsxx_yljg != null) {
            stmt.bindString(3, wsxx_yljg);
        }
 
        String wsxx_fxsj = entity.getWsxx_fxsj();
        if (wsxx_fxsj != null) {
            stmt.bindString(4, wsxx_fxsj);
        }
        stmt.bindLong(5, entity.getWsxx_xxlb());
 
        String wsxx_xxnr = entity.getWsxx_xxnr();
        if (wsxx_xxnr != null) {
            stmt.bindString(6, wsxx_xxnr);
        }
 
        String wsxx_bgsj = entity.getWsxx_bgsj();
        if (wsxx_bgsj != null) {
            stmt.bindString(7, wsxx_bgsj);
        }
 
        String wsxx_bgr = entity.getWsxx_bgr();
        if (wsxx_bgr != null) {
            stmt.bindString(8, wsxx_bgr);
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
    public WeiShengXieGuanBiao readEntity(Cursor cursor, int offset) {
        WeiShengXieGuanBiao entity = new WeiShengXieGuanBiao( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // wsxx_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // wsxx_yljg
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // wsxx_fxsj
            cursor.getInt(offset + 4), // wsxx_xxlb
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // wsxx_xxnr
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // wsxx_bgsj
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // wsxx_bgr
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, WeiShengXieGuanBiao entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setWsxx_id(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setWsxx_yljg(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setWsxx_fxsj(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setWsxx_xxlb(cursor.getInt(offset + 4));
        entity.setWsxx_xxnr(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setWsxx_bgsj(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setWsxx_bgr(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCreateDate(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(WeiShengXieGuanBiao entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(WeiShengXieGuanBiao entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(WeiShengXieGuanBiao entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}