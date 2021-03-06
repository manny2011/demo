package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.JianKangTiJianBiao_C;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "JIAN_KANG_TI_JIAN_BIAO__C".
*/
public class JianKangTiJianBiao_CDao extends AbstractDao<JianKangTiJianBiao_C, Long> {

    public static final String TABLENAME = "JIAN_KANG_TI_JIAN_BIAO__C";

    /**
     * Properties of entity JianKangTiJianBiao_C.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Jktj2_id = new Property(1, String.class, "jktj2_id", false, "JKTJ2_ID");
        public final static Property Jktj_id = new Property(2, String.class, "jktj_id", false, "JKTJ_ID");
        public final static Property Jktj2_maintz = new Property(3, int.class, "jktj2_maintz", false, "JKTJ2_MAINTZ");
        public final static Property Jktj2_othertz = new Property(4, String.class, "jktj2_othertz", false, "JKTJ2_OTHERTZ");
        public final static Property Jktj2_naoxg = new Property(5, int.class, "jktj2_naoxg", false, "JKTJ2_NAOXG");
        public final static Property Jktj2_shenz = new Property(6, int.class, "jktj2_shenz", false, "JKTJ2_SHENZ");
        public final static Property Jktj2_xinz = new Property(7, int.class, "jktj2_xinz", false, "JKTJ2_XINZ");
        public final static Property Jktj2_xueg = new Property(8, int.class, "jktj2_xueg", false, "JKTJ2_XUEG");
        public final static Property Jktj2_yanb = new Property(9, int.class, "jktj2_yanb", false, "JKTJ2_YANB");
        public final static Property Jktj2_shenjx = new Property(10, int.class, "jktj2_shenjx", false, "JKTJ2_SHENJX");
        public final static Property Jktj2_shenjx_ms = new Property(11, String.class, "jktj2_shenjx_ms", false, "JKTJ2_SHENJX_MS");
        public final static Property Jktj2_qitjb = new Property(12, int.class, "jktj2_qitjb", false, "JKTJ2_QITJB");
        public final static Property Jktj2_qitjb_ms = new Property(13, String.class, "jktj2_qitjb_ms", false, "JKTJ2_QITJB_MS");
        public final static Property Jktj2_jkpj = new Property(14, int.class, "jktj2_jkpj", false, "JKTJ2_JKPJ");
        public final static Property Jktj2_jkyc1 = new Property(15, String.class, "jktj2_jkyc1", false, "JKTJ2_JKYC1");
        public final static Property Jktj2_jkyc2 = new Property(16, String.class, "jktj2_jkyc2", false, "JKTJ2_JKYC2");
        public final static Property Jktj2_jkyc3 = new Property(17, String.class, "jktj2_jkyc3", false, "JKTJ2_JKYC3");
        public final static Property Jktj2_jkyc4 = new Property(18, String.class, "jktj2_jkyc4", false, "JKTJ2_JKYC4");
        public final static Property Jktj2_jiany = new Property(19, int.class, "jktj2_jiany", false, "JKTJ2_JIANY");
        public final static Property Jktj2_wxys = new Property(20, int.class, "jktj2_wxys", false, "JKTJ2_WXYS");
        public final static Property Jktj2_mbtz = new Property(21, String.class, "jktj2_mbtz", false, "JKTJ2_MBTZ");
        public final static Property Jktj2_jyym = new Property(22, String.class, "jktj2_jyym", false, "JKTJ2_JYYM");
        public final static Property Jktj2_bz = new Property(23, String.class, "jktj2_bz", false, "JKTJ2_BZ");
        public final static Property CreateDate = new Property(24, String.class, "createDate", false, "CREATE_DATE");
    }


    public JianKangTiJianBiao_CDao(DaoConfig config) {
        super(config);
    }
    
    public JianKangTiJianBiao_CDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"JIAN_KANG_TI_JIAN_BIAO__C\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"JKTJ2_ID\" TEXT NOT NULL ," + // 1: jktj2_id
                "\"JKTJ_ID\" TEXT NOT NULL ," + // 2: jktj_id
                "\"JKTJ2_MAINTZ\" INTEGER NOT NULL ," + // 3: jktj2_maintz
                "\"JKTJ2_OTHERTZ\" TEXT," + // 4: jktj2_othertz
                "\"JKTJ2_NAOXG\" INTEGER NOT NULL ," + // 5: jktj2_naoxg
                "\"JKTJ2_SHENZ\" INTEGER NOT NULL ," + // 6: jktj2_shenz
                "\"JKTJ2_XINZ\" INTEGER NOT NULL ," + // 7: jktj2_xinz
                "\"JKTJ2_XUEG\" INTEGER NOT NULL ," + // 8: jktj2_xueg
                "\"JKTJ2_YANB\" INTEGER NOT NULL ," + // 9: jktj2_yanb
                "\"JKTJ2_SHENJX\" INTEGER NOT NULL ," + // 10: jktj2_shenjx
                "\"JKTJ2_SHENJX_MS\" TEXT," + // 11: jktj2_shenjx_ms
                "\"JKTJ2_QITJB\" INTEGER NOT NULL ," + // 12: jktj2_qitjb
                "\"JKTJ2_QITJB_MS\" TEXT," + // 13: jktj2_qitjb_ms
                "\"JKTJ2_JKPJ\" INTEGER NOT NULL ," + // 14: jktj2_jkpj
                "\"JKTJ2_JKYC1\" TEXT," + // 15: jktj2_jkyc1
                "\"JKTJ2_JKYC2\" TEXT," + // 16: jktj2_jkyc2
                "\"JKTJ2_JKYC3\" TEXT," + // 17: jktj2_jkyc3
                "\"JKTJ2_JKYC4\" TEXT," + // 18: jktj2_jkyc4
                "\"JKTJ2_JIANY\" INTEGER NOT NULL ," + // 19: jktj2_jiany
                "\"JKTJ2_WXYS\" INTEGER NOT NULL ," + // 20: jktj2_wxys
                "\"JKTJ2_MBTZ\" TEXT," + // 21: jktj2_mbtz
                "\"JKTJ2_JYYM\" TEXT," + // 22: jktj2_jyym
                "\"JKTJ2_BZ\" TEXT," + // 23: jktj2_bz
                "\"CREATE_DATE\" TEXT);"); // 24: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"JIAN_KANG_TI_JIAN_BIAO__C\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, JianKangTiJianBiao_C entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getJktj2_id());
        stmt.bindString(3, entity.getJktj_id());
        stmt.bindLong(4, entity.getJktj2_maintz());
 
        String jktj2_othertz = entity.getJktj2_othertz();
        if (jktj2_othertz != null) {
            stmt.bindString(5, jktj2_othertz);
        }
        stmt.bindLong(6, entity.getJktj2_naoxg());
        stmt.bindLong(7, entity.getJktj2_shenz());
        stmt.bindLong(8, entity.getJktj2_xinz());
        stmt.bindLong(9, entity.getJktj2_xueg());
        stmt.bindLong(10, entity.getJktj2_yanb());
        stmt.bindLong(11, entity.getJktj2_shenjx());
 
        String jktj2_shenjx_ms = entity.getJktj2_shenjx_ms();
        if (jktj2_shenjx_ms != null) {
            stmt.bindString(12, jktj2_shenjx_ms);
        }
        stmt.bindLong(13, entity.getJktj2_qitjb());
 
        String jktj2_qitjb_ms = entity.getJktj2_qitjb_ms();
        if (jktj2_qitjb_ms != null) {
            stmt.bindString(14, jktj2_qitjb_ms);
        }
        stmt.bindLong(15, entity.getJktj2_jkpj());
 
        String jktj2_jkyc1 = entity.getJktj2_jkyc1();
        if (jktj2_jkyc1 != null) {
            stmt.bindString(16, jktj2_jkyc1);
        }
 
        String jktj2_jkyc2 = entity.getJktj2_jkyc2();
        if (jktj2_jkyc2 != null) {
            stmt.bindString(17, jktj2_jkyc2);
        }
 
        String jktj2_jkyc3 = entity.getJktj2_jkyc3();
        if (jktj2_jkyc3 != null) {
            stmt.bindString(18, jktj2_jkyc3);
        }
 
        String jktj2_jkyc4 = entity.getJktj2_jkyc4();
        if (jktj2_jkyc4 != null) {
            stmt.bindString(19, jktj2_jkyc4);
        }
        stmt.bindLong(20, entity.getJktj2_jiany());
        stmt.bindLong(21, entity.getJktj2_wxys());
 
        String jktj2_mbtz = entity.getJktj2_mbtz();
        if (jktj2_mbtz != null) {
            stmt.bindString(22, jktj2_mbtz);
        }
 
        String jktj2_jyym = entity.getJktj2_jyym();
        if (jktj2_jyym != null) {
            stmt.bindString(23, jktj2_jyym);
        }
 
        String jktj2_bz = entity.getJktj2_bz();
        if (jktj2_bz != null) {
            stmt.bindString(24, jktj2_bz);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(25, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, JianKangTiJianBiao_C entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getJktj2_id());
        stmt.bindString(3, entity.getJktj_id());
        stmt.bindLong(4, entity.getJktj2_maintz());
 
        String jktj2_othertz = entity.getJktj2_othertz();
        if (jktj2_othertz != null) {
            stmt.bindString(5, jktj2_othertz);
        }
        stmt.bindLong(6, entity.getJktj2_naoxg());
        stmt.bindLong(7, entity.getJktj2_shenz());
        stmt.bindLong(8, entity.getJktj2_xinz());
        stmt.bindLong(9, entity.getJktj2_xueg());
        stmt.bindLong(10, entity.getJktj2_yanb());
        stmt.bindLong(11, entity.getJktj2_shenjx());
 
        String jktj2_shenjx_ms = entity.getJktj2_shenjx_ms();
        if (jktj2_shenjx_ms != null) {
            stmt.bindString(12, jktj2_shenjx_ms);
        }
        stmt.bindLong(13, entity.getJktj2_qitjb());
 
        String jktj2_qitjb_ms = entity.getJktj2_qitjb_ms();
        if (jktj2_qitjb_ms != null) {
            stmt.bindString(14, jktj2_qitjb_ms);
        }
        stmt.bindLong(15, entity.getJktj2_jkpj());
 
        String jktj2_jkyc1 = entity.getJktj2_jkyc1();
        if (jktj2_jkyc1 != null) {
            stmt.bindString(16, jktj2_jkyc1);
        }
 
        String jktj2_jkyc2 = entity.getJktj2_jkyc2();
        if (jktj2_jkyc2 != null) {
            stmt.bindString(17, jktj2_jkyc2);
        }
 
        String jktj2_jkyc3 = entity.getJktj2_jkyc3();
        if (jktj2_jkyc3 != null) {
            stmt.bindString(18, jktj2_jkyc3);
        }
 
        String jktj2_jkyc4 = entity.getJktj2_jkyc4();
        if (jktj2_jkyc4 != null) {
            stmt.bindString(19, jktj2_jkyc4);
        }
        stmt.bindLong(20, entity.getJktj2_jiany());
        stmt.bindLong(21, entity.getJktj2_wxys());
 
        String jktj2_mbtz = entity.getJktj2_mbtz();
        if (jktj2_mbtz != null) {
            stmt.bindString(22, jktj2_mbtz);
        }
 
        String jktj2_jyym = entity.getJktj2_jyym();
        if (jktj2_jyym != null) {
            stmt.bindString(23, jktj2_jyym);
        }
 
        String jktj2_bz = entity.getJktj2_bz();
        if (jktj2_bz != null) {
            stmt.bindString(24, jktj2_bz);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(25, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public JianKangTiJianBiao_C readEntity(Cursor cursor, int offset) {
        JianKangTiJianBiao_C entity = new JianKangTiJianBiao_C( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // jktj2_id
            cursor.getString(offset + 2), // jktj_id
            cursor.getInt(offset + 3), // jktj2_maintz
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // jktj2_othertz
            cursor.getInt(offset + 5), // jktj2_naoxg
            cursor.getInt(offset + 6), // jktj2_shenz
            cursor.getInt(offset + 7), // jktj2_xinz
            cursor.getInt(offset + 8), // jktj2_xueg
            cursor.getInt(offset + 9), // jktj2_yanb
            cursor.getInt(offset + 10), // jktj2_shenjx
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // jktj2_shenjx_ms
            cursor.getInt(offset + 12), // jktj2_qitjb
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // jktj2_qitjb_ms
            cursor.getInt(offset + 14), // jktj2_jkpj
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // jktj2_jkyc1
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // jktj2_jkyc2
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // jktj2_jkyc3
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // jktj2_jkyc4
            cursor.getInt(offset + 19), // jktj2_jiany
            cursor.getInt(offset + 20), // jktj2_wxys
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // jktj2_mbtz
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // jktj2_jyym
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // jktj2_bz
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, JianKangTiJianBiao_C entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setJktj2_id(cursor.getString(offset + 1));
        entity.setJktj_id(cursor.getString(offset + 2));
        entity.setJktj2_maintz(cursor.getInt(offset + 3));
        entity.setJktj2_othertz(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setJktj2_naoxg(cursor.getInt(offset + 5));
        entity.setJktj2_shenz(cursor.getInt(offset + 6));
        entity.setJktj2_xinz(cursor.getInt(offset + 7));
        entity.setJktj2_xueg(cursor.getInt(offset + 8));
        entity.setJktj2_yanb(cursor.getInt(offset + 9));
        entity.setJktj2_shenjx(cursor.getInt(offset + 10));
        entity.setJktj2_shenjx_ms(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setJktj2_qitjb(cursor.getInt(offset + 12));
        entity.setJktj2_qitjb_ms(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setJktj2_jkpj(cursor.getInt(offset + 14));
        entity.setJktj2_jkyc1(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setJktj2_jkyc2(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setJktj2_jkyc3(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setJktj2_jkyc4(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setJktj2_jiany(cursor.getInt(offset + 19));
        entity.setJktj2_wxys(cursor.getInt(offset + 20));
        entity.setJktj2_mbtz(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setJktj2_jyym(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setJktj2_bz(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setCreateDate(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(JianKangTiJianBiao_C entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(JianKangTiJianBiao_C entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(JianKangTiJianBiao_C entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
