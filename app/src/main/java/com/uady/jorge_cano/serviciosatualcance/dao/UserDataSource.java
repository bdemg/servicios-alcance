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

    public UserDataSource(Context input_context){

        this.userDBHelper = new UserDBHelper(input_context);
    }

    public void open() throws SQLException{

        this.database = this.userDBHelper.getWritableDatabase();
    }

    public void close(){

        this.userDBHelper.close();
    }

    public long insertUser(
            String input_name,
            String input_email,
            String input_phone,
            String input_address,
            String input_password
    ) {

        ContentValues values = new ContentValues();
        values.put(UserContract.COLUMN_NAME_NAME, input_name);
        values.put(UserContract.COLUMN_NAME_EMAIL, input_email);
        values.put(UserContract.COLUMN_NAME_PHONE, input_phone);
        values.put(UserContract.COLUMN_NAME_ADDRESS, input_address);
        values.put(UserContract.COLUMN_NAME_PASSWORD, input_password);
        long newRowId;
        newRowId = database.insert(UserContract.TABLE_NAME, null, values);
        return newRowId;
    }

    public boolean isUserRegistered(String email, String password){
        Cursor cursor = database.rawQuery(
                "SELECT * FROM "+UserContract.TABLE_NAME+" WHERE "+
                UserContract.COLUMN_NAME_EMAIL+"=? AND "+
                UserContract.COLUMN_NAME_PASSWORD+"=?",
                new String[] {email, password}
        );
        return (cursor.getCount() > 0);
    }

    public boolean isEmailRegistered(String email){
        Cursor cursor = database.rawQuery(
                "SELECT * FROM "+UserContract.TABLE_NAME+" WHERE "+
                        UserContract.COLUMN_NAME_EMAIL+"=?",
                new String[] {email}
        );
        return (cursor.getCount() > 0);
    }
}
