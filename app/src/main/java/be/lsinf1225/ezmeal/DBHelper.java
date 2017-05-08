package be.lsinf1225.ezmeal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

     public class DBHelper extends android.database.sqlite.SQLiteOpenHelper{
    SQLiteDatabase db;
    int old = db.getVersion();

         public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
             super(context, name, factory, version);
         }

         @Override  //Pour mettre à jour la version de la DB
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    private void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Utilisateur ()");
    }

    private void onOpen(SQLiteDatabase db){
        onUpgrade(db, old, old++);
    }




    //POur accéder à la DB de n'importe ou
    //SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    // context :
    // name : nom de la DB
    //factory : null
    //version : version de la DB (dispo variable public)

    //Pour écrire et lire dans la DB
    //SQLiteDatabase getWritableDatabase()
    // sin on veut faire des modif avant, il faut les faire dans void onOpen(SQLiteDatabase)


}