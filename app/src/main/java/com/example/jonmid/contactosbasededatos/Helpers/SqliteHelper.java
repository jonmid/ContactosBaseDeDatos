package com.example.jonmid.contactosbasededatos.Helpers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.jonmid.contactosbasededatos.Utilities.Constants;

/**
 * Created by jonmid on 26/10/17.
 */

public class SqliteHelper extends SQLiteOpenHelper {

    public SqliteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constants.CREATE_TABLE_USERS);
        db.execSQL(Constants.CREATE_TABLE_COMMENTS);

        db.execSQL("INSERT INTO users (name, phone, email) VALUES ('aaaaa', '11111', 'aaaaa@gmail.com')");
        db.execSQL("INSERT INTO users (name, phone, email) VALUES ('bbbbb', '22222', 'bbbbb@gmail.com')");
        db.execSQL("INSERT INTO users (name, phone, email) VALUES ('ccccc', '33333', 'ccccc@gmail.com')");
        db.execSQL("INSERT INTO users (name, phone, email) VALUES ('ddddd', '44444', 'ddddd@gmail.com')");
        db.execSQL("INSERT INTO users (name, phone, email) VALUES ('eeeee', '55555', 'eeeee@gmail.com')");
        db.execSQL("INSERT INTO users (name, phone, email) VALUES ('fffff', '66666', 'fffff@gmail.com')");
        db.execSQL("INSERT INTO users (name, phone, email) VALUES ('ggggg', '77777', 'ggggg@gmail.com')");
        db.execSQL("INSERT INTO users (name, phone, email) VALUES ('hhhhh', '88888', 'hhhhh@gmail.com')");
        db.execSQL("INSERT INTO users (name, phone, email) VALUES ('iiiii', '99999', 'iiiii@gmail.com')");
        db.execSQL("INSERT INTO users (name, phone, email) VALUES ('jjjjj', '10101', 'jjjjj@gmail.com')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Constants.TABLA_NAME_USERS);
        db.execSQL("DROP TABLE IF EXISTS "+Constants.TABLA_NAME_COMMENTS);
        onCreate(db);
    }
}
