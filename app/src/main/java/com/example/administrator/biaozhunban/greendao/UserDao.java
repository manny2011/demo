package com.example.administrator.biaozhunban.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.administrator.biaozhunban.greendao.entity.User;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER".
*/
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property User_id = new Property(0, Long.class, "user_id", true, "_id");
        public final static Property User_name = new Property(1, String.class, "user_name", false, "USER_NAME");
        public final static Property User_passport = new Property(2, String.class, "user_passport", false, "USER_PASSPORT");
        public final static Property User_passward = new Property(3, String.class, "user_passward", false, "USER_PASSWARD");
        public final static Property User_admin = new Property(4, int.class, "user_admin", false, "USER_ADMIN");
        public final static Property User_sex = new Property(5, int.class, "user_sex", false, "USER_SEX");
        public final static Property User_age = new Property(6, int.class, "user_age", false, "USER_AGE");
        public final static Property User_birthday = new Property(7, String.class, "user_birthday", false, "USER_BIRTHDAY");
        public final static Property User_idcard = new Property(8, String.class, "user_idcard", false, "USER_IDCARD");
        public final static Property User_email = new Property(9, String.class, "user_email", false, "USER_EMAIL");
        public final static Property User_tel = new Property(10, String.class, "user_tel", false, "USER_TEL");
        public final static Property Agency_id = new Property(11, String.class, "agency_id", false, "AGENCY_ID");
        public final static Property User_login_date = new Property(12, String.class, "user_login_date", false, "USER_LOGIN_DATE");
        public final static Property User_type = new Property(13, int.class, "user_type", false, "USER_TYPE");
        public final static Property Note = new Property(14, String.class, "note", false, "NOTE");
        public final static Property CreateDate = new Property(15, String.class, "createDate", false, "CREATE_DATE");
    }


    public UserDao(DaoConfig config) {
        super(config);
    }
    
    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: user_id
                "\"USER_NAME\" TEXT NOT NULL ," + // 1: user_name
                "\"USER_PASSPORT\" TEXT NOT NULL ," + // 2: user_passport
                "\"USER_PASSWARD\" TEXT NOT NULL ," + // 3: user_passward
                "\"USER_ADMIN\" INTEGER NOT NULL ," + // 4: user_admin
                "\"USER_SEX\" INTEGER NOT NULL ," + // 5: user_sex
                "\"USER_AGE\" INTEGER NOT NULL ," + // 6: user_age
                "\"USER_BIRTHDAY\" TEXT," + // 7: user_birthday
                "\"USER_IDCARD\" TEXT," + // 8: user_idcard
                "\"USER_EMAIL\" TEXT," + // 9: user_email
                "\"USER_TEL\" TEXT," + // 10: user_tel
                "\"AGENCY_ID\" TEXT," + // 11: agency_id
                "\"USER_LOGIN_DATE\" TEXT," + // 12: user_login_date
                "\"USER_TYPE\" INTEGER NOT NULL ," + // 13: user_type
                "\"NOTE\" TEXT," + // 14: note
                "\"CREATE_DATE\" TEXT);"); // 15: createDate
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long user_id = entity.getUser_id();
        if (user_id != null) {
            stmt.bindLong(1, user_id);
        }
        stmt.bindString(2, entity.getUser_name());
        stmt.bindString(3, entity.getUser_passport());
        stmt.bindString(4, entity.getUser_passward());
        stmt.bindLong(5, entity.getUser_admin());
        stmt.bindLong(6, entity.getUser_sex());
        stmt.bindLong(7, entity.getUser_age());
 
        String user_birthday = entity.getUser_birthday();
        if (user_birthday != null) {
            stmt.bindString(8, user_birthday);
        }
 
        String user_idcard = entity.getUser_idcard();
        if (user_idcard != null) {
            stmt.bindString(9, user_idcard);
        }
 
        String user_email = entity.getUser_email();
        if (user_email != null) {
            stmt.bindString(10, user_email);
        }
 
        String user_tel = entity.getUser_tel();
        if (user_tel != null) {
            stmt.bindString(11, user_tel);
        }
 
        String agency_id = entity.getAgency_id();
        if (agency_id != null) {
            stmt.bindString(12, agency_id);
        }
 
        String user_login_date = entity.getUser_login_date();
        if (user_login_date != null) {
            stmt.bindString(13, user_login_date);
        }
        stmt.bindLong(14, entity.getUser_type());
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(15, note);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(16, createDate);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();
 
        Long user_id = entity.getUser_id();
        if (user_id != null) {
            stmt.bindLong(1, user_id);
        }
        stmt.bindString(2, entity.getUser_name());
        stmt.bindString(3, entity.getUser_passport());
        stmt.bindString(4, entity.getUser_passward());
        stmt.bindLong(5, entity.getUser_admin());
        stmt.bindLong(6, entity.getUser_sex());
        stmt.bindLong(7, entity.getUser_age());
 
        String user_birthday = entity.getUser_birthday();
        if (user_birthday != null) {
            stmt.bindString(8, user_birthday);
        }
 
        String user_idcard = entity.getUser_idcard();
        if (user_idcard != null) {
            stmt.bindString(9, user_idcard);
        }
 
        String user_email = entity.getUser_email();
        if (user_email != null) {
            stmt.bindString(10, user_email);
        }
 
        String user_tel = entity.getUser_tel();
        if (user_tel != null) {
            stmt.bindString(11, user_tel);
        }
 
        String agency_id = entity.getAgency_id();
        if (agency_id != null) {
            stmt.bindString(12, agency_id);
        }
 
        String user_login_date = entity.getUser_login_date();
        if (user_login_date != null) {
            stmt.bindString(13, user_login_date);
        }
        stmt.bindLong(14, entity.getUser_type());
 
        String note = entity.getNote();
        if (note != null) {
            stmt.bindString(15, note);
        }
 
        String createDate = entity.getCreateDate();
        if (createDate != null) {
            stmt.bindString(16, createDate);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // user_id
            cursor.getString(offset + 1), // user_name
            cursor.getString(offset + 2), // user_passport
            cursor.getString(offset + 3), // user_passward
            cursor.getInt(offset + 4), // user_admin
            cursor.getInt(offset + 5), // user_sex
            cursor.getInt(offset + 6), // user_age
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // user_birthday
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // user_idcard
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // user_email
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // user_tel
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // agency_id
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // user_login_date
            cursor.getInt(offset + 13), // user_type
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // note
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15) // createDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setUser_id(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUser_name(cursor.getString(offset + 1));
        entity.setUser_passport(cursor.getString(offset + 2));
        entity.setUser_passward(cursor.getString(offset + 3));
        entity.setUser_admin(cursor.getInt(offset + 4));
        entity.setUser_sex(cursor.getInt(offset + 5));
        entity.setUser_age(cursor.getInt(offset + 6));
        entity.setUser_birthday(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setUser_idcard(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setUser_email(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setUser_tel(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setAgency_id(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setUser_login_date(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setUser_type(cursor.getInt(offset + 13));
        entity.setNote(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setCreateDate(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setUser_id(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(User entity) {
        if(entity != null) {
            return entity.getUser_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(User entity) {
        return entity.getUser_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
