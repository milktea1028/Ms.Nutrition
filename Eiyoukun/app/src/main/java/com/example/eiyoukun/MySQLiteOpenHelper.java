package com.example.eiyoukun;


import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.content.ContentValues;

public class MySQLiteOpenHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "Sqlite1.db";   // DB名
    private static final String TABLE_NAME = "sqlite1";

    private static int DB_VERSION = 1;           // DBのVersion
    // コンストラクタ
    // CREATE用のSQLを取得する
    public MySQLiteOpenHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    // DBが存在しない状態でOpenすると、onCreateがコールされる
    // 新規作成されたDBのインスタンスが付与されるので、テーブルを作成する。
    @Override
    public void onCreate(SQLiteDatabase db) {
        //テーブルの作成用SQL文の設定
        String sql = "CREATE TABLE Prpducts" ;
        sql += " id INTEGER PRIMARY KEY AUTOINCREMENT" ;
        sql += "name TEXT NOT NULL" ;
        sql += "purpose TEXT NOT NULL" ;
        sql += "sex TEXt NOT NULL" ;
        sql += "age INTEGER NOT NULL" ;
        sql += "weight INTEGER NOT NULL" ;
        sql += "height INTEGER NOT NULL";
        sql += "activityLevel TEXT NOT NULL";

        //テーブル作成用SQL文を実行
        db.execSQL(sql) ;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }


}
