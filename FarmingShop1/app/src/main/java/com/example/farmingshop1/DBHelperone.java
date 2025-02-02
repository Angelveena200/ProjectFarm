package com.example.farmingshop1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelperone extends SQLiteOpenHelper {
    private Context context;
    public DBHelperone(@Nullable Context context)
    {
        super(context, "Order.db", null , 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE TABLE \"orders\" (\n" +
                "\t\"pname\"\tTEXT,\n" +
                "\t\"pqt\"\tTEXT,\n" +
                "\t\"pprice\"\tTEXT,\n" +
                "\t\"eqty\"\tTEXT,\n" +
                "\t\"mobile\"\tTEXT,\n" +
                "\t\"email\"\tTEXT,\n" +
                "\t\"address\"\tTEXT);");
        DB.execSQL("CREATE TABLE \"contactus\" (\n" +
                "\t\"name\"\tTEXT,\n" +
                "\t\"email\"\tTEXT,\n" +
                "\t\"message\"\tTEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int oldVersion, int newVersion) {
        DB.execSQL("drop Table if exists orders");
        DB.execSQL("drop Table if exists contactus");

    }
    public void addorder(String pname, String pquantity, String pprice, String equantity, String pmobile, String email, String paddress) {

        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("pname", pname);
        values.put("pquantity", pquantity);
        values.put("pprice", pprice);
        values.put("equantity", equantity);
        values.put("pmobile",pmobile);
        values.put("email", email);
        values.put("paddress", paddress);
        DB.insert("OrderData", null, values);
        DB.close();
    }
    public void addmsg(String name, String email, String message) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("name", name);
        values.put("email", email);
        values.put("message", message);
        db.insert("contactus", null, values);
        db.close();
    }
    public void addorders(String pname, String pqt, String pprice,String eqty,String mobile,String email,String address) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("pname", pname);
        values.put("pqt", pqt);
        values.put("pprice", pprice);
        values.put("eqty", eqty);
        values.put("mobile", mobile);
        values.put("email", email);
        values.put("address", address);
        db.insert("orders", null, values);
        db.close();
    }
    public Boolean delete (String email)
    {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from orders where email = ?", new String[]{email});
        if (cursor.getCount() > 0) {
            long result = DB.delete("orders", "email=?", new String[]{email});
            if (result == -1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public Cursor getdata() {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("select * from orders", null);
        return  cursor;
    }
}
