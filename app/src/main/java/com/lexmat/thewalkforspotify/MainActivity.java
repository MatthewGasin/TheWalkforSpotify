package com.lexmat.thewalkforspotify;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity {

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db = new DatabaseHelper(this);
        if(db.isEmpty()){
            fillDatabase();
        }


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, ChoiceActivity.class);
        String[] start = {"empty", "empty", "empty", "empty"};
        intent.putExtra("categories", start);
        startActivity(intent);
    }

    private void fillDatabase(){
        db.insertPlaylist(new Playlist(new String[]{"Day", "Fire", "Nature", "Calm"}, "Afternoon Acoustic", "spotify:user:spotify:playlist:37i9dQZF1DX4E3UdUs7fUx"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Fire", "Nature", "Calm"}, "Afternoon Acoustic", "spotify:user:spotify:playlist:37i9dQZF1DX4E3UdUs7fUx"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Ice", "Beach", "Melancholy"}, "Peaceful Piano", "spotify:user:spotify:playlist:37i9dQZF1DX4sWSpwq3LiO"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Fire", "Beach", "Melancholy"}, "Peaceful Piano", "spotify:user:spotify:playlist:37i9dQZF1DX4sWSpwq3LiO"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Ice", "City", "Melancholy"}, "Peaceful Piano", "spotify:user:spotify:playlist:37i9dQZF1DX4sWSpwq3LiO"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "Beach", "Melancholy"}, "Epic Wall of sound", "spotify:user:spotify:playlist:37i9dQZF1DX6ujZpAN0v9r"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Ice", "Nature", "Melancholy"}, "Epic Wall of sound", "spotify:user:spotify:playlist:37i9dQZF1DX6ujZpAN0v9r"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "Nature", "Melancholy"}, "Epic Wall of sound", "spotify:user:spotify:playlist:37i9dQZF1DX6ujZpAN0v9r"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "Nature", "Cheerful"}, "Country nights", "spotify:user:spotify:playlist:37i9dQZF1DWXi7h4mmmkzD"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "Nature", "Cheerful"}, "Country nights", "spotify:user:spotify:playlist:37i9dQZF1DWXi7h4mmmkzD"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "City", "Calm"}, "Chilled R&B", "spotify:user:spotify:playlist:37i9dQZF1DX2UgsUIg75Vg"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "City", "Calm"}, "Chilled R&B", "spotify:user:spotify:playlist:37i9dQZF1DX2UgsUIg75Vg"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Fire", "City", "Melancholy"}, "Soul revived", "spotify:user:spotify:playlist:37i9dQZF1DWY12BqhkMFW2"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "City", "Cheerful"}, "Soul revived", "spotify:user:spotify:playlist:37i9dQZF1DWY12BqhkMFW2"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Transition", "City", "Calm"}, "Chill tracks", "spotify:user:spotify:playlist:37i9dQZF1DX6VdMW310YC7"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "City", "Calm"}, "Chill tracks", "spotify:user:spotify:playlist:37i9dQZF1DX6VdMW310YC7"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Ice", "Beach", "Melancholy"}, "Chill.out.brain", "spotify:user:spotify:playlist:37i9dQZF1DX3PIPIT6lEg5"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Ice", "Nature", "Melancholy"}, "Chill.out.brain", "spotify:user:spotify:playlist:37i9dQZF1DX3PIPIT6lEg5"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Fire", "City", "Cheerful"}, "Creamy Tracks", "spotify:user:spotify:playlist:37i9dQZF1DXdgz8ZB7c2CP"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "City", "Cheerful"}, "Creamy Tracks", "spotify:user:spotify:playlist:37i9dQZF1DXdgz8ZB7c2CP"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "Beach", "Calm"}, "Deep House Relax", "spotify:user:spotify:playlist:37i9dQZF1DX2TRYkJECvfC"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Transition", "Beach", "Calm"}, "Deep House Relax", "spotify:user:spotify:playlist:37i9dQZF1DX2TRYkJECvfC"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "City", "Calm"}, "Gentle Classical", "spotify:user:spotify:playlist:37i9dQZF1DX7cBprxbt1Fn"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Ice", "City", "Calm"}, "Gentle Classical", "spotify:user:spotify:playlist:37i9dQZF1DX7cBprxbt1Fn"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Transition", "Nature", "Melancholy"}, "Gentle Classical", "spotify:user:spotify:playlist:37i9dQZF1DX7cBprxbt1Fn"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Transition", "Beach", "Melancholy"}, "Gentle Classical", "spotify:user:spotify:playlist:37i9dQZF1DX7cBprxbt1Fn"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Ice", "Beach", "Calm"}, "Jazz Classical Crossings", "spotify:user:spotify:playlist:37i9dQZF1DX2mmt7R81K2b"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "Beach", "Calm"}, "Jazz Classical Crossings", "spotify:user:spotify:playlist:37i9dQZF1DX2mmt7R81K2b"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "Beach", "Calm"}, "Namaste", "spotify:user:spotify:playlist:0op6xwVK9pVhcxozSQPEsJ"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "Nature", "Calm"}, "Namaste", "spotify:user:spotify:playlist:0op6xwVK9pVhcxozSQPEsJ"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "Nature", "Melancholy"}, "Lush + Atmospheric", "spotify:user:spotify:playlist:37i9dQZF1DX79Y9Kr2M2tM"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "Nature", "Melancholy"}, "Lush + Atmospheric", "spotify:user:spotify:playlist:37i9dQZF1DX79Y9Kr2M2tM"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "Nature", "Melancholy"}, "Evening chill", "spotify:user:spotify:playlist:37i9dQZF1DWZ0OzPeadl0h"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "City", "Melancholy"}, "Evening chill", "spotify:user:spotify:playlist:37i9dQZF1DWZ0OzPeadl0h"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "Nature", "Cheerful"}, "Autumn Acoustic", "spotify:user:spotify:playlist:37i9dQZF1DWUNIrSzKgQbP"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "City", "Cheerful"}, "Autumn Acoustic", "spotify:user:spotify:playlist:37i9dQZF1DWUNIrSzKgQbP"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Fire", "City", "Calm"}, "Morning Acoustic", "spotify:user:spotify:playlist:37i9dQZF1DXdd3gw5QVjt9"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Fire", "Nature", "Melancholy"}, "Morning Acoustic", "spotify:user:spotify:playlist:37i9dQZF1DXdd3gw5QVjt9"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "Beach", "Cheerful"}, "Soft Rock", "spotify:user:spotify:playlist:37i9dQZF1DX6xOPeSOGone"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "City", "Cheerful"}, "Soft Rock", "spotify:user:spotify:playlist:37i9dQZF1DX6xOPeSOGone"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "City", "Calm"}, "Acoustic Calm", "spotify:user:spotify:playlist:37i9dQZF1DXaImRpG7HXqp"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Fire", "City", "Cheerful"}, "Acoustic Calm", "spotify:user:spotify:playlist:37i9dQZF1DXaImRpG7HXqp"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "Beach", "Cheerful"}, "Under the stars", "spotify:user:spotify:playlist:37i9dQZF1DWTRnup1IgL4a"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "Nature", "Cheerful"}, "Under the stars", "spotify:user:spotify:playlist:37i9dQZF1DWTRnup1IgL4a"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "Beach", "Calm"}, "Calm Vibes", "spotify:user:spotify:playlist:37i9dQZF1DX1s9knjP51Oa"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Fire", "Nature", "Calm"}, "Calm Vibes", "spotify:user:spotify:playlist:37i9dQZF1DX1s9knjP51Oa"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "Nature", "Calm"}, "Hawaiian Dreams", "spotify:user:spotify:playlist:37i9dQZF1DX5FuBDzVtEFX"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "City", "Calm"}, "Hawaiian Dreams", "spotify:user:spotify:playlist:37i9dQZF1DX5FuBDzVtEFX"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "City", "Calm"}, "Jazz vibes", "spotify:user:spotify:playlist:37i9dQZF1DX0SM0LYsmbMT"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "Beach", "Calm"}, "Jazz vibes", "spotify:user:spotify:playlist:37i9dQZF1DX0SM0LYsmbMT"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Fire", "Beach", "Cheerful"}, "Jazz vibes", "spotify:user:spotify:playlist:37i9dQZF1DX0SM0LYsmbMT"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Ice", "City", "Cheerful"}, "Jazz vibes", "spotify:user:spotify:playlist:37i9dQZF1DX0SM0LYsmbMT"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "City", "Cheerful"}, "Jazz vibes", "spotify:user:spotify:playlist:37i9dQZF1DX0SM0LYsmbMT"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "Beach", "Cheerful"}, "Jazz vibes", "spotify:user:spotify:playlist:37i9dQZF1DX0SM0LYsmbMT"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "Nature", "Calm"}, "Quiet evening", "spotify:user:spotify:playlist:37i9dQZF1DWTQwRw56TKNc"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "Beach", "Calm"}, "Quiet evening", "spotify:user:spotify:playlist:37i9dQZF1DWTQwRw56TKNc"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "City", "Melancholy"}, "Mellow Nights", "spotify:user:spotify:playlist:37i9dQZF1DWUACcBjzMiIY"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "City", "Melancholy"}, "Mellow Nights", "spotify:user:spotify:playlist:37i9dQZF1DWUACcBjzMiIY"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "City", "Melancholy"}, "Mellow Nights", "spotify:user:spotify:playlist:37i9dQZF1DWUACcBjzMiIY"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "Nature", "Cheerful"}, "Warm Fuzzy feeling", "spotify:user:spotify:playlist:37i9dQZF1DX5IDTimEWoTd"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "Beach", "Cheerful"}, "Warm Fuzzy feeling", "spotify:user:spotify:playlist:37i9dQZF1DX5IDTimEWoTd"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Fire", "Nature", "Cheerful"}, "Warm Fuzzy feeling", "spotify:user:spotify:playlist:37i9dQZF1DX5IDTimEWoTd"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "Nature", "Calm"}, "Calm down", "spotify:user:spotify:playlist:37i9dQZF1DX5bjCEbRU4SJ"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "Nature", "Calm"}, "Calm down", "spotify:user:spotify:playlist:37i9dQZF1DX5bjCEbRU4SJ"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "Nature", "Cheerful"}, "Jazz for Autumn", "spotify:user:spotify:playlist:37i9dQZF1DX7UE7qrnkvsf"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "Beach", "Cheerful"}, "Jazz for Autumn", "spotify:user:spotify:playlist:37i9dQZF1DX7UE7qrnkvsf"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Fire", "Beach", "Cheerful"}, "Barefoot at the Beach", "spotify:user:spotify:playlist:37i9dQZF1DWSFQkW2hnAts"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "Beach", "Cheerful"}, "Barefoot at the Beach", "spotify:user:spotify:playlist:37i9dQZF1DWSFQkW2hnAts"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Ice", "Beach", "Cheerful"}, "Barefoot at the Beach", "spotify:user:spotify:playlist:37i9dQZF1DWSFQkW2hnAts"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Transition", "City", "Cheerful"}, "Laidback Acoustic", "spotify:user:spotify:playlist:37i9dQZF1DXc3FQfFV3K6V"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Transition", "Beach", "Cheerful"}, "Laidback Acoustic", "spotify:user:spotify:playlist:37i9dQZF1DXc3FQfFV3K6V"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Transition", "Nature", "Cheerful"}, "Laidback Acoustic", "spotify:user:spotify:playlist:37i9dQZF1DXc3FQfFV3K6V"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Fire", "Nature", "Cheerful"}, "Morning Rhythm", "spotify:user:spotify:playlist:37i9dQZF1DX3ohNxI5tB79"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Fire", "City", "Cheerful"}, "Morning Rhythm", "spotify:user:spotify:playlist:37i9dQZF1DX3ohNxI5tB79"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "Beach", "Melancholy"}, "Lofi House", "spotify:user:spotify:playlist:37i9dQZF1DXbXD9pMSZomS"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Fire", "Beach", "Melancholy"}, "Lofi House", "spotify:user:spotify:playlist:37i9dQZF1DXbXD9pMSZomS"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Transition", "City", "Cheerful"}, "Lo-fi Love", "spotify:user:spotify:playlist:37i9dQZF1DWVqJMsgEN0F4"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "City", "Cheerful"}, "Lo-fi Love", "spotify:user:spotify:playlist:37i9dQZF1DWVqJMsgEN0F4"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Ice", "Beach", "Calm"}, "Lo-fi Sounds", "spotify:user:spotify:playlist:37i9dQZF1DWYbaqDZKtWiw"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Fire", "Beach", "Calm"}, "Lo-fi Sounds", "spotify:user:spotify:playlist:37i9dQZF1DWYbaqDZKtWiw"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "Nature", "Calm"}, "Deep Sleep", "spotify:user:spotify:playlist:37i9dQZF1DWYcDQ1hSjOpY"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "Nature", "Melancholy"}, "Deep Sleep", "spotify:user:spotify:playlist:37i9dQZF1DWYcDQ1hSjOpY"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Ice", "Nature", "Calm"}, "Sleep", "spotify:user:spotify:playlist:37i9dQZF1DWZd79rJ6a7lp"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Transition", "Nature", "Calm"}, "Sleep", "spotify:user:spotify:playlist:37i9dQZF1DWZd79rJ6a7lp"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Ice", "City", "Calm"}, "Rock & Relax", "spotify:user:spotify:playlist:37i9dQZF1DXcWTUcQb4GQL"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Ice", "Nature", "Calm"}, "Rock & Relax", "spotify:user:spotify:playlist:37i9dQZF1DXcWTUcQb4GQL"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Fire", "Beach", "Calm"}, "License To Chill", "spotify:user:spotify:playlist:37i9dQZF1DXa9xHlDa5fc6"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Fire", "City", "Calm"}, "License To Chill", "spotify:user:spotify:playlist:37i9dQZF1DXa9xHlDa5fc6"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Ice", "Nature", "Cheerful"}, "Indie Sunshine", "spotify:user:spotify:playlist:37i9dQZF1DWUWC0NIJDJKL"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Ice", "Beach", "Cheerful"}, "Indie Sunshine", "spotify:user:spotify:playlist:37i9dQZF1DWUWC0NIJDJKL"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Ice", "City", "Cheerful"}, "Indie Sunshine", "spotify:user:spotify:playlist:37i9dQZF1DWUWC0NIJDJKL"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Ice", "Nature", "Cheerful"}, "Essential Indie", "spotify:user:spotify:playlist:37i9dQZF1DX26DKvjp0s9M"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "Nature", "Cheerful"}, "Essential Indie", "spotify:user:spotify:playlist:37i9dQZF1DX26DKvjp0s9M"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Fire", "City", "Melancholy"}, "A Soft Backdrop", "spotify:user:spotify:playlist:37i9dQZF1DXc6Umi4GHdr1"));
        db.insertPlaylist(new Playlist(new String[]{"Morning", "Transition", "City", "Melancholy"}, "A Soft Backdrop", "spotify:user:spotify:playlist:37i9dQZF1DXc6Umi4GHdr1"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "City", "Melancholy"}, "A Soft Backdrop", "spotify:user:spotify:playlist:37i9dQZF1DXc6Umi4GHdr1"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Ice", "Beach", "Melancholy"}, "Chilled Jazz", "spotify:user:spotify:playlist:37i9dQZF1DX2vYju3i0lNX"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Transition", "Beach", "Melancholy"}, "Chilled Jazz", "spotify:user:spotify:playlist:37i9dQZF1DX2vYju3i0lNX"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Fire", "Nature", "Melancholy"}, "Jazztronica", "spotify:user:spotify:playlist:37i9dQZF1DX55dNU0PWnO5"));
        db.insertPlaylist(new Playlist(new String[]{"Day", "Fire", "Beach", "Melancholy"}, "Jazztronica", "spotify:user:spotify:playlist:37i9dQZF1DX55dNU0PWnO5"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "City", "Melancholy"}, "Tender", "spotify:user:spotify:playlist:37i9dQZF1DXarebqD2nAVg"));
        db.insertPlaylist(new Playlist(new String[]{"Evening", "Ice", "Beach", "Melancholy"}, "Tender", "spotify:user:spotify:playlist:37i9dQZF1DXarebqD2nAVg"));    }

  }