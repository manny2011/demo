package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.Drug;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DRUG".
*/
public class DrugDao extends AbstractDao<Drug, Long> {

    public static final String TABLENAME = "DRUG";

    /**
     * Properties of entity Drug.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Gid = new Property(1, String.class, "gid", false, "GID");
        public final static Property Createuser = new Property(2, String.class, "createuser", false, "CREATEUSER");
        public final static Property Createtime = new Property(3, String.class, "createtime", false, "CREATETIME");
        public final static Property Isvalid = new Property(4, String.class, "isvalid", false, "ISVALID");
        public final static Property Upflag = new Property(5, String.class, "upflag", false, "UPFLAG");
        public final static Property Type = new Property(6, String.class, "type", false, "TYPE");
        public final static Property Dictgid = new Property(7, String.class, "dictgid", false, "DICTGID");
        public final static Property Code = new Property(8, String.class, "code", false, "CODE");
        public final static Property Name = new Property(9, String.class, "name", false, "NAME");
        public final static Property Bcode = new Property(10, String.class, "bcode", false, "BCODE");
        public final static Property Sfid = new Property(11, String.class, "sfid", false, "SFID");
        public final static Property Jxid = new Property(12, String.class, "jxid", false, "JXID");
        public final static Property Unit = new Property(13, String.class, "unit", false, "UNIT");
        public final static Property Unitprice = new Property(14, String.class, "unitprice", false, "UNITPRICE");
        public final static Property Smallunit = new Property(15, String.class, "smallunit", false, "SMALLUNIT");
        public final static Property Smallunitconv = new Property(16, String.class, "smallunitconv", false, "SMALLUNITCONV");
        public final static Property Smallunitdose = new Property(17, String.class, "smallunitdose", false, "SMALLUNITDOSE");
        public final static Property Doseunit = new Property(18, String.class, "doseunit", false, "DOSEUNIT");
        public final static Property Spec = new Property(19, String.class, "spec", false, "SPEC");
        public final static Property Factory = new Property(20, String.class, "factory", false, "FACTORY");
        public final static Property Stock = new Property(21, String.class, "stock", false, "STOCK");
        public final static Property Maxstock = new Property(22, String.class, "maxstock", false, "MAXSTOCK");
        public final static Property Minstock = new Property(23, String.class, "minstock", false, "MINSTOCK");
        public final static Property CreateDate = new Property(24, String.class, "createDate", false, "CREATE_DATE");
    }


    public DrugDao(DaoConfig config) {
        super(config);
    }
    
    public DrugDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DRUG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"GID\" TEXT," + // 1: gid
                "\"CREATEUSER\" TEXT," + // 2: createuser
                "\"CREATETIME\" TEXT," + // 3: createtime
                "\"ISVALID\" TEXT," + // 4: isvalid
                "\"UPFLAG\" TEXT," + // 5: upflag
                "\"TYPE\" TEXT," + // 6: type
                "\"DICTGID\" TEXT," + // 7: dictgid
                "\"CODE\" TEXT," + // 8: code
                "\"NAME\" TEXT," + // 9: name
                "\"BCODE\" TEXT," + // 10: bcode
                "\"SFID\" TEXT," + // 11: sfid
                "\"JXID\" TEXT," + // 12: jxid
                "\"UNIT\" TEXT," + // 13: unit
                "\"UNITPRICE\" TEXT," + // 14: unitprice
                "\"SMALLUNIT\" TEXT," + // 15: smallunit
                "\"SMALLUNITCONV\" TEXT," + // 16: smallunitconv
                "\"SMALLUNITDOSE\" TEXT," + // 17: smallunitdose
                "\"DOSEUNIT\" TEXT," + // 18: doseunit
                "\"SPEC\" TEXT," + // 19: spec
                "\"FACTORY\" TEXT," + // 20: factory
                "\"STOCK\" TEXT," + // 21: stock
                "\"MAXSTOCK\" TEXT," + // 22: maxstock
                "\"MINSTOCK\" TEXT," + // 23: minstock
                "\"CREATE_DATE\" TEXT);"); // 24: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DRUG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Drug entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String gid = entity.getGid();
        if (gid != null) {
            stmt.bindString(2, gid);
        }
 
        String createuser = entity.getCreateuser();
        if (createuser != null) {
            stmt.bindString(3, createuser);
        }
 
        String createtime = entity.getCreatetime();
        if (createtime != null) {
            stmt.bindString(4, createtime);
        }
 
        String isvalid = entity.getIsvalid();
        if (isvalid != null) {
            stmt.bindString(5, isvalid);
        }
 
        String upflag = entity.getUpflag();
        if (upflag != null) {
            stmt.bindString(6, upflag);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(7, type);
        }
 
        String dictgid = entity.getDictgid();
        if (dictgid != null) {
            stmt.bindString(8, dictgid);
        }
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(9, code);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(10, name);
        }
 
        String bcode = entity.getBcode();
        if (bcode != null) {
            stmt.bindString(11, bcode);
        }
 
        String sfid = entity.getSfid();
        if (sfid != null) {
            stmt.bindString(12, sfid);
        }
 
        String jxid = entity.getJxid();
        if (jxid != null) {
            stmt.bindString(13, jxid);
        }
 
        String unit = entity.getUnit();
        if (unit != null) {
            stmt.bindString(14, unit);
        }
 
        String unitprice = entity.getUnitprice();
        if (unitprice != null) {
            stmt.bindString(15, unitprice);
        }
 
        String smallunit = entity.getSmallunit();
        if (smallunit != null) {
            stmt.bindString(16, smallunit);
        }
 
        String smallunitconv = entity.getSmallunitconv();
        if (smallunitconv != null) {
            stmt.bindString(17, smallunitconv);
        }
 
        String smallunitdose = entity.getSmallunitdose();
        if (smallunitdose != null) {
            stmt.bindString(18, smallunitdose);
        }
 
        String doseunit = entity.getDoseunit();
        if (doseunit != null) {
            stmt.bindString(19, doseunit);
        }
 
        String spec = entity.getSpec();
        if (spec != null) {
            stmt.bindString(20, spec);
        }
 
        String factory = entity.getFactory();
        if (factory != null) {
            stmt.bindString(21, factory);
        }
 
        String stock = entity.getStock();
        if (stock != null) {
            stmt.bindString(22, stock);
        }
 
        String maxstock = entity.getMaxstock();
        if (maxstock != null) {
            stmt.bindString(23, maxstock);
        }
 
        String minstock = entity.getMinstock();
        if (minstock != null) {
            stmt.bindString(24, minstock);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(25, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Drug entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String gid = entity.getGid();
        if (gid != null) {
            stmt.bindString(2, gid);
        }
 
        String createuser = entity.getCreateuser();
        if (createuser != null) {
            stmt.bindString(3, createuser);
        }
 
        String createtime = entity.getCreatetime();
        if (createtime != null) {
            stmt.bindString(4, createtime);
        }
 
        String isvalid = entity.getIsvalid();
        if (isvalid != null) {
            stmt.bindString(5, isvalid);
        }
 
        String upflag = entity.getUpflag();
        if (upflag != null) {
            stmt.bindString(6, upflag);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(7, type);
        }
 
        String dictgid = entity.getDictgid();
        if (dictgid != null) {
            stmt.bindString(8, dictgid);
        }
 
        String code = entity.getCode();
        if (code != null) {
            stmt.bindString(9, code);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(10, name);
        }
 
        String bcode = entity.getBcode();
        if (bcode != null) {
            stmt.bindString(11, bcode);
        }
 
        String sfid = entity.getSfid();
        if (sfid != null) {
            stmt.bindString(12, sfid);
        }
 
        String jxid = entity.getJxid();
        if (jxid != null) {
            stmt.bindString(13, jxid);
        }
 
        String unit = entity.getUnit();
        if (unit != null) {
            stmt.bindString(14, unit);
        }
 
        String unitprice = entity.getUnitprice();
        if (unitprice != null) {
            stmt.bindString(15, unitprice);
        }
 
        String smallunit = entity.getSmallunit();
        if (smallunit != null) {
            stmt.bindString(16, smallunit);
        }
 
        String smallunitconv = entity.getSmallunitconv();
        if (smallunitconv != null) {
            stmt.bindString(17, smallunitconv);
        }
 
        String smallunitdose = entity.getSmallunitdose();
        if (smallunitdose != null) {
            stmt.bindString(18, smallunitdose);
        }
 
        String doseunit = entity.getDoseunit();
        if (doseunit != null) {
            stmt.bindString(19, doseunit);
        }
 
        String spec = entity.getSpec();
        if (spec != null) {
            stmt.bindString(20, spec);
        }
 
        String factory = entity.getFactory();
        if (factory != null) {
            stmt.bindString(21, factory);
        }
 
        String stock = entity.getStock();
        if (stock != null) {
            stmt.bindString(22, stock);
        }
 
        String maxstock = entity.getMaxstock();
        if (maxstock != null) {
            stmt.bindString(23, maxstock);
        }
 
        String minstock = entity.getMinstock();
        if (minstock != null) {
            stmt.bindString(24, minstock);
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
    public Drug readEntity(Cursor cursor, int offset) {
        Drug entity = new Drug( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // gid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // createuser
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // createtime
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // isvalid
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // upflag
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // type
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // dictgid
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // code
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // name
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // bcode
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // sfid
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // jxid
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // unit
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // unitprice
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // smallunit
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // smallunitconv
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // smallunitdose
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // doseunit
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // spec
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // factory
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // stock
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // maxstock
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // minstock
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Drug entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setGid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCreateuser(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCreatetime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIsvalid(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUpflag(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setType(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDictgid(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCode(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setName(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setBcode(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSfid(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setJxid(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setUnit(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setUnitprice(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setSmallunit(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setSmallunitconv(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setSmallunitdose(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setDoseunit(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setSpec(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setFactory(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setStock(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setMaxstock(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setMinstock(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setCreateDate(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Drug entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Drug entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Drug entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
