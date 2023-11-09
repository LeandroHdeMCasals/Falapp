package com.example.falapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer;

    ImageButton botaon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer aunao = MediaPlayer.create(this, R.raw.aunao);
        ImageButton botaon = (ImageButton) this.findViewById(R.id.botaon);

        botaon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aunao.start();
            }
        });


        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);
                finish();
            }
        }, 6000);




    }
}