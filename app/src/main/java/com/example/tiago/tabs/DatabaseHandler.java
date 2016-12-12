package com.example.tiago.tabs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Tiago on 09/12/16.
 */

public class DatabaseHandler extends SQLiteOpenHelper {
    public DatabaseHandler(Tab2Veiculos tabe2veiculos, Object object, Context context) {
        // TODO Auto-generated constructor stub
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    String matricula;
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "Mydatabase.db";

    // Table name
    private static final String TABLE_VEICULOS = "veiculos";
    public static final String KEY_ID = "id";
    public static final String KEY_MARCA = "marca";
    public static final String KEY_MODELO = "modelo";
    public static final String KEY_MATRICULA = "matricula";
    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_VEICULOS + "("
            + KEY_ID + " INTEGER PRIMARY KEY," + KEY_MARCA + " TEXT," + KEY_MODELO + " TEXT," + KEY_MATRICULA + " TEXT," + ")";

    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_VEICULOS);

        // Create tables again
        onCreate(db);
    }

    public void addveiculos(Veiculosdata veiculosdata)
    // code to add the new register
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_MARCA, veiculosdata.getMarca()); // register marca
        values.put(KEY_MODELO, veiculosdata.getModelo()); // register modelo
        values.put(KEY_MATRICULA, veiculosdata.getMatricula()); //register matricula

        // Inserting Row
        db.insert(TABLE_VEICULOS, null, values);
        db.close(); // Closing database connection
    }

    //code to get the Veiculos
    public String getVeiculos(String marca) {
        SQLiteDatabase db = this.getReadableDatabase();
        //String selectquery="SELECT * FROM TABLE_VEICULOS";
        Cursor cursor = db.query(TABLE_VEICULOS, null, "marca=?", new String[]{marca}, null, null, null, null);

        if (cursor.getCount() < 1) {
            cursor.close();
            return "Not Exist";
        } else if (cursor.getCount() >= 1 && cursor.moveToFirst()) {

            matricula = cursor.getString(cursor.getColumnIndex(KEY_MATRICULA));
            cursor.close();
        }
        return matricula;


    }
}
