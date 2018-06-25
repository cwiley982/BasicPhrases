package com.caitlynwiley.basicphrases;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playSound(View view) {
        int id = view.getId();
        String idName = view.getResources().getResourceEntryName(id);
        int resId = getResources().getIdentifier(idName, "raw", getPackageName());
        MediaPlayer player = MediaPlayer.create(this, resId);
        player.start();
    }
}
