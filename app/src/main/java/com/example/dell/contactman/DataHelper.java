package com.example.dell.contactman;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dell on 2/5/2017.
 */

public class DataHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="contact.db";
    public static final String TABLE_NAME="contact";
   /* private static final String CONTACT_ID="ID";
    public static final String CONTACT_NAME="NAME";
    public static final String CONTACT_NUMBER="MOBILE_NUMBER";
    public static final String CONTACT_MAIL="MAIL"; */


    public DataHelper(Context context) {
        super(context ,DATABASE_NAME ,null ,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
   /* String query =" CREATE TABLE " + TABLE_NAME + " (" +
               CONTACT_ID + " INTEGER PRIMARY KEY " +
                CONTACT_NAME + " TEXT NOT NULL " +
        CONTACT_NUMBER + " INTEGER NOT NULL " +
        CONTACT_MAIL + " TEXT NOT NULL " + ")";
        db.execSQL(query);*/
db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, MOBILE_NUMBER INTEGER, MAIL TEXT); ");
}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);


    }
    public boolean insertdata(String name, int mobile_number, String mail){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues content= new ContentValues();
        content.put("NAME ",name);
        content.put("MOBILE_NUMBER ", mobile_number);
        content.put("MAIL ", mail);
      long result= db.insert(TABLE_NAME, null , content);
        if (result==-1)
            return false;
        else
            return true;
    }


   public Cursor getdata(String mobile_number) {
       SQLiteDatabase db=this.getWritableDatabase();
       String query ="SELECT * FROM " + TABLE_NAME + " WHERE MOBILE_NUMBER = '"+mobile_number+"'";
       Cursor cursor=db.rawQuery(query,null);
    //  db.close();
       return cursor;

   }
    public void delitedata(String mobile_number){
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete(TABLE_NAME, "MOBILE_NUMBER = '"+mobile_number+"'",null);

    }
    public void upgradedata(String search1,String name1,String email1){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("NAME",name1);
        contentValues.put("MAIL",email1);
        contentValues.put("MOBILE_NUMBER",search1);
        db.update(TABLE_NAME, contentValues, " WHERE MOBILE_NUMBER = '" + search1 +"'", null);
        db.close();

    }
}
