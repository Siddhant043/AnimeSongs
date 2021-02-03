package com.example.animesongs;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static String currentTag = "";
    public void playSound(View view) {
        Button buttonPressed = (Button) view;
        Log.i("Button Pressed", buttonPressed.getTag().toString());
        String playedTag = buttonPressed.getTag().toString();
        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(playedTag, "raw", getPackageName()));
        mediaPlayer.start();
    }
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}