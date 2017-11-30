package com.lexmat.thewalkforspotify;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Playlist.db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "playlists";

    public static final String COL_1 = "_id";
    public static final String COL_2 = "name";
    public static final String COL_3 = "uri";
    public static final String COL_4 = "time";
    public static final String COL_5 = "temp";
    public static final String COL_6 = "loc";
    public static final String COL_7 = "feel";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(new StringBuilder().append("CREATE TABLE ").append(TABLE_NAME).append(" (").append(COL_1).append(" INTEGER PRIMARY KEY AUTOINCREMENT, ").append(COL_2).append(" TEXT, ").append(COL_3).append(" TEXT, ").append(COL_4).append(" TEXT, ").append(COL_5).append(" TEXT, ").append(COL_6).append(" TEXT, ").append(COL_7).append(" TEXT)").toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertPlaylist(Playlist playlist){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COL_2, playlist.getName());
        contentValues.put(COL_3, playlist.getURI());
        contentValues.put(COL_4, playlist.getCatagories()[0]);
        contentValues.put(COL_5, playlist.getCatagories()[1]);
        contentValues.put(COL_6, playlist.getCatagories()[2]);
        contentValues.put(COL_7, playlist.getCatagories()[3]);

        return !(db.insert(TABLE_NAME,null,contentValues) == -1);
    }

    public boolean isEmpty(){
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM " + TABLE_NAME, null).getCount() > 0;
    }

    private Cursor getPlaylistCursor(String[] categories){
        String query = "SELECT * FROM " + TABLE_NAME
                + " WHERE " +
                " COL_4 = " + "\"" + categories[0] + "\"" +
                " COL_5 = " + "\"" + categories[1] + "\"" +
                " COL_6 = " + "\"" + categories[2] + "\"" +
                " COL_7 = " + "\"" + categories[3] + "\"";
        SQLiteDatabase db = this.getWritableDatabase();
        return db.rawQuery(query, null);
    }

    public ArrayList<Playlist> getPlaylists(String[] categories){
        Cursor cursor = getPlaylistCursor(categories);
        ArrayList<Playlist> playlists = new ArrayList<Playlist>();

        if(cursor.moveToFirst()){
            playlists.add(new Playlist(categories, cursor.getString(3), cursor.getString(2)));
        }

        while(cursor.moveToNext()){
            playlists.add(new Playlist(categories, cursor.getString(3), cursor.getString(2)));
        }

        return playlists;
    }


}
