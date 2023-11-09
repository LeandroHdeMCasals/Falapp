package com.example.falapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class NewActivity extends AppCompatActivity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        MediaPlayer ausim = MediaPlayer.create(this, R.raw.ausim);
        ImageButton botaos = (ImageButton) this.findViewById(R.id.botaos);

        botaos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ausim.start();
            }
        });


        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(NewActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 6000);

    }
}