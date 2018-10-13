package com.thousand.words.words;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.NoAction);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        Thread myThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}