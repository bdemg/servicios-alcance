package com.uady.jorge_cano.serviciosatualcance.dao;

import android.provider.BaseColumns;

/**
 * Created by José on 07/02/2017.
 */

public class UserContract implements BaseColumns {

    public static final String TABLE_NAME = "Users";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_NAME_EMAIL = "email";
    public static final String COLUMN_NAME_PHONE = "phone";
    public static final String COLUMN_NAME_ADDRESS = "address";
    public static final String COLUMN_NAME_PASSWORD = "password";

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_USERS =
            "CREATE TABLE " + TABLE_NAME + " (" + _ID + " INTEGER PRIMARY KEY," +
            COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
            COLUMN_NAME_EMAIL + TEXT_TYPE + COMMA_SEP +
            COLUMN_NAME_PHONE + TEXT_TYPE + COMMA_SEP +
            COLUMN_NAME_ADDRESS + TEXT_TYPE + COMMA_SEP +
            COLUMN_NAME_PASSWORD + TEXT_TYPE +
            " )";

    public static final String SQL_DELETE_USERS =
            "DROP TABLE IF EXISTS " + TABLE_NAME;
}
