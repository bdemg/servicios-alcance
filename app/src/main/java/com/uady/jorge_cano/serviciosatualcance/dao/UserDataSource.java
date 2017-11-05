package com.uady.jorge_cano.serviciosatualcance.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by José on 07/02/2017.
 */

public class UserDataSource {

    private SQLiteDatabase database;
    private UserDBHelper userDBHelper;
    private String[] allColumns = {
            UserContract.COLUMN_NAME_EMAIL,
            UserContract.COLUMN_NAME_PASSWORD
    };

    public UserDataSource(Context input_context){

        this.userDBHelper = new UserDBHelper(input_context);
    }

    public void open() throws SQLException{

        this.database = this.userDBHelper.getWritableDatabase();
    }

    public void close(){

        this.userDBHelper.close();
    }

    public long insertUser(String input_email, String input_password) {

        ContentValues values = new ContentValues();
        values.put(UserContract.COLUMN_NAME_EMAIL, input_email);
        values.put(UserContract.COLUMN_NAME_PASSWORD, input_password);
        long newRowId;
        newRowId = database.insert(UserContract.TABLE_NAME, null, values);
        return newRowId;
    }

    public User getUser() {

        Cursor cursor = database.query(UserContract.TABLE_NAME, allColumns, null, null, null, null, null);
        cursor.moveToFirst();
        User user = cursorToUser(cursor);
        cursor.close();
        return user;
    }

    private User cursorToUser(Cursor cursor){

        User user = new User();
        user.setEmail(cursor.getString(0));
        user.setPassword(cursor.getString(1));
        return user;
    }
}
