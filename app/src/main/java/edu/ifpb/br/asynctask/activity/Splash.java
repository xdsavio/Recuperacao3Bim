package edu.ifpb.br.asynctask.activity;

import java.util.Timer;
import java.util.TimerTask;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                finish();

                Intent intent = new Intent();
                intent.setClass(Splash.this, MainActivity.class);
                startActivity(intent);
            }
        }, 6000);
    }
}