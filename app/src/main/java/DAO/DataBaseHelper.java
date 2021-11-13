package DAO;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {

    // this is called the first time a db is accessed. There should be code here to create a new db
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    // this is called if the db version number. It prevents previous users apps from breaking when you change the db design.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
