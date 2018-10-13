package com.thousand.words.words;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Vocab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocab);


        Button oneBtn = findViewById(R.id.onehund);

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vocab.this,one.class);
                startActivity(intent);
            }
        });

        Button twoBtn = findViewById(R.id.twohund);

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vocab.this,two.class);
                startActivity(intent);
            }
        });

        Button threeBtn = findViewById(R.id.threehund);

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vocab.this,three.class);
                startActivity(intent);
            }
        });


        Button fourBtn = findViewById(R.id.fourhund);

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Vocab.this,four.class);
                startActivity(intent);
            }
        });
    }
}