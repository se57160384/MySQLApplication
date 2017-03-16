package com.layout.panurut.mysqlapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ADMIN on 10/2/2560.
 */

public class DbHelper extends SQLiteOpenHelper {

    private static final String databaseName = "dbtodolist.sqlite";
    private static final  int databaseVersion = 1;
    Context myContext;
    private static final String SQLCreateTable =
            "CREATE TABLE tbtodo_list("+
            "taskid INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "taskname TEXT)";
    public DbHelper(Context context){
        super(context,databaseName,null,databaseVersion);
        this.myContext=context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQLCreateTable);
        String insertData1 = "INSERT INTO tbtodo_list (taskname) VALUES ('INNOCENT1')";
        String insertData2 = "INSERT INTO tbtodo_list (taskname) VALUES ('INNOCENT2')";
        String insertData3 = "INSERT INTO tbtodo_list (taskname) VALUES ('INNOCENT3')";
        db.execSQL(insertData1);
        db.execSQL(insertData2);
        db.execSQL(insertData3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
