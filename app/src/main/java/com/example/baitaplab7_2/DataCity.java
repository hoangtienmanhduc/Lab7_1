package com.example.baitaplab7_2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataCity extends SQLiteOpenHelper {
    public DataCity(@Nullable Context context,
                    @Nullable String name,
                    @Nullable SQLiteDatabase.CursorFactory factory,
                    int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql = "CREATE TABLE city (" +
                " id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nameCity TEXT NOT NULL)";
                sqLiteDatabase.execSQL(sql);
    }

    //Add User
    public void addCity(City city){
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put("nameCity",city.getNameCity());
        db.insert("city",null,values);

    }

    public List<City> getAll(){
        List<City> cityList = new ArrayList<>();
        String sql = "select * from city";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        if(cursor.moveToFirst()){
            do {
                City city = new City();
                city.setId(cursor.getInt(0));
                city.setNameCity(cursor.getString(1));

                cityList.add(city);
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return cityList;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
