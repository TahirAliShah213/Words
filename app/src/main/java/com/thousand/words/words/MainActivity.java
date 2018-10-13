package com.thousand.words.words;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.FirebaseApiNotAvailableException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface font = Typeface.createFromAsset(getAssets(),"telfonts.otf");

        TextView textvocab = findViewById(R.id.vocabText);
        textvocab.setTypeface(font);

        TextView textfav = findViewById(R.id.favText);
        textfav.setTypeface(font);

        TextView textidm = findViewById(R.id.idiomsText);
        textidm.setTypeface(font);

        TextView textshare = findViewById(R.id.shareText);
        textshare.setTypeface(font);

        TextView textrate = findViewById(R.id.rateText);
        textrate.setTypeface(font);

        TextView textmore = findViewById(R.id.moreText);
        textmore.setTypeface(font);


        CardView cardVocab = findViewById(R.id.vocab);
        cardVocab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Vocab.class);
                startActivity(intent);
            }
        });

        CardView cardFav = findViewById(R.id.fav);
        cardFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Fav.class);
                startActivity(intent);
            }
        });

    }
}
