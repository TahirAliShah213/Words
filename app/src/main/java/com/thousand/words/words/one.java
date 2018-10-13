package com.thousand.words.words;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.preference.PreferenceManager;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class one extends AppCompatActivity {

    int clickcount=0;


    private static final String SHARED_PREF_NAME = "mysharedpref";
    private static final String KEY_NAME = "keyname";

    TextView mean,mean2,mean3,mean4,mean5,mean6,mean7,mean8,mean9,mean10,mean11,mean12,mean13,mean14,mean15,mean16
            ,mean17,mean18,mean19,mean20,mean21,mean22,mean23,mean24,mean25,mean26,mean27,mean28,mean29,mean30,mean31,mean32;
    TextView word,word2,word3,word4,word5,word6,word7,word8,word9,word10,word11,word12,word13,word14,word15,word16
            ,word17,word18,word19,word20,word21,word22,word23,word24,word25,word26,word27,word28,word29,word30,word31,word32;
    String m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20,m21,m22,m23,m24,m25,m26,m27,m28,m29,m30
            ,m31,m32;
    String w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,w13,w14,w15,w16,w17,w18,w19,w20,w21,w22,w23,w24,w25,w26,w27,w28
            ,w29,w30,w31,w32;
    int i=0;

    Boolean isSwitch = false ;

    SharedPreferences sharedPref,sharedPref1,sharedPref2,sharedPref3,sharedPref4,sharedPref5,sharedPref6,sharedPref7;

    Button btn,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16
            ,btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30,btn31,btn32;

    Button share,share1,share2,share3,share4,share5,share6,share7,share8,share9,share10,share11,share12,share13,share14
            ,share15,share16,share17,share18,share19,share20,share21,share22,share23,share24,share25,share26,share27
            ,share28,share29,share30,share31;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Typeface fontText = Typeface.createFromAsset(getAssets(),"telfonts.otf");


        mean = findViewById(R.id.mean1);
        mean2 = findViewById(R.id.mean2);
        mean3 = findViewById(R.id.mean3);
        mean4 = findViewById(R.id.mean4);
        mean5 = findViewById(R.id.mean5);
        mean6 = findViewById(R.id.mean6);
        mean7 = findViewById(R.id.mean7);
        mean8 = findViewById(R.id.mean8);
        mean9 = findViewById(R.id.mean9);
        mean10 = findViewById(R.id.mean10);
        mean11 = findViewById(R.id.mean11);
        mean12 = findViewById(R.id.mean12);
        mean13 = findViewById(R.id.mean13);
        mean14 = findViewById(R.id.mean14);
        mean15 = findViewById(R.id.mean15);

        word = findViewById(R.id.word1);
        word2 = findViewById(R.id.word2);
        word3 = findViewById(R.id.word3);
        word4 = findViewById(R.id.word4);
        word5 = findViewById(R.id.word5);
        word6 = findViewById(R.id.word6);
        word7 = findViewById(R.id.word7);
        word8 = findViewById(R.id.word8);
        word9 = findViewById(R.id.word9);
        word10 = findViewById(R.id.word10);
        word11 = findViewById(R.id.word11);
        word12 = findViewById(R.id.word12);
        word13 = findViewById(R.id.word13);
        word14 = findViewById(R.id.word14);
        word15 = findViewById(R.id.word15);




        mean.setTypeface(fontText);
        mean2.setTypeface(fontText);
        mean3.setTypeface(fontText);
        mean4.setTypeface(fontText);
        mean5.setTypeface(fontText);
        mean6.setTypeface(fontText);
        mean7.setTypeface(fontText);
        mean8.setTypeface(fontText);
        mean9.setTypeface(fontText);
        mean10.setTypeface(fontText);
        mean11.setTypeface(fontText);
        mean12.setTypeface(fontText);
        mean13.setTypeface(fontText);
        mean14.setTypeface(fontText);
        mean15.setTypeface(fontText);


        word.setTypeface(fontText);
        word2.setTypeface(fontText);
        word3.setTypeface(fontText);
        word4.setTypeface(fontText);
        word5.setTypeface(fontText);
        word6.setTypeface(fontText);
        word7.setTypeface(fontText);
        word8.setTypeface(fontText);
        word9.setTypeface(fontText);
        word10.setTypeface(fontText);
        word11.setTypeface(fontText);
        word12.setTypeface(fontText);
        word13.setTypeface(fontText);
        word14.setTypeface(fontText);
        word15.setTypeface(fontText);


        btn = findViewById(R.id.save);
        btn2 = findViewById(R.id.save2);
        btn3 = findViewById(R.id.save3);
        btn4 = findViewById(R.id.save4);
        btn5 = findViewById(R.id.save5);
        btn6 = findViewById(R.id.save6);
        btn7 = findViewById(R.id.save7);
        btn8 = findViewById(R.id.save8);
        btn9 = findViewById(R.id.save9);
        btn10 = findViewById(R.id.save10);
        btn11 = findViewById(R.id.save11);
        btn12 = findViewById(R.id.save12);
        btn13 = findViewById(R.id.save13);
        btn14 = findViewById(R.id.save14);
        btn15 = findViewById(R.id.save15);

        share = findViewById(R.id.shareBtn);
        share1 = findViewById(R.id.shareBtn2);
        share2 = findViewById(R.id.shareBtn3);
        share3 = findViewById(R.id.shareBtn4);
        share4 = findViewById(R.id.shareBtn5);
        share5 = findViewById(R.id.shareBtn6);
        share6 = findViewById(R.id.shareBtn7);
        share7 = findViewById(R.id.shareBtn8);
        share8 = findViewById(R.id.shareBtn9);
        share9 = findViewById(R.id.shareBtn10);
        share10 = findViewById(R.id.shareBtn11);
        share11 = findViewById(R.id.shareBtn12);
        share12 = findViewById(R.id.shareBtn13);
        share13 = findViewById(R.id.shareBtn14);
        share14 = findViewById(R.id.shareBtn15);


        m1 = mean.getText().toString();
        m2 = mean2.getText().toString();
        m3 = mean3.getText().toString();
        m4 = mean4.getText().toString();
        m5 = mean5.getText().toString();
        m6 = mean6.getText().toString();
        m7 = mean7.getText().toString();
        m8 = mean8.getText().toString();
        m9 = mean9.getText().toString();
        m10 = mean10.getText().toString();
        m11 = mean11.getText().toString();
        m12 = mean12.getText().toString();
        m13 = mean13.getText().toString();
        m14 = mean14.getText().toString();
        m15 = mean15.getText().toString();



        w1 = word.getText().toString();
        w2 = word2.getText().toString();
        w3 = word3.getText().toString();
        w4 = word4.getText().toString();
        w5 = word5.getText().toString();
        w6 = word6.getText().toString();
        w7 = word7.getText().toString();
        w8 = word8.getText().toString();
        w9 = word9.getText().toString();
        w10 = word10.getText().toString();
        w11 = word11.getText().toString();
        w12 = word12.getText().toString();
        w13 = word13.getText().toString();
        w14 = word14.getText().toString();
        w15 = word15.getText().toString();



       /* SharedPreferences stringPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor = stringPrefs.edit();

        SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();

        sharedPref = getSharedPreferences("my_pref",Context.MODE_PRIVATE);
        sharedPref2 = getSharedPreferences("my",Context.MODE_PRIVATE);
        final boolean[] shouldDisplayCard = {sharedPref.getBoolean("switch", false)};
        final boolean[] shouldDisplayCard1 = {sharedPref2.getBoolean("swi", false)};

        if(shouldDisplayCard[0]){

            btn.setBackgroundResource(R.mipmap.savefav);
            stringEditor.putString("NameOfShared", (w1+ "\n"+m1));
            stringEditor.commit();

        }else{
            btn.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites
            stringEditor.clear();
            stringEditor.apply();

        }


        if(shouldDisplayCard1[0]){
            btn2.setBackgroundResource(R.mipmap.savefav);
            stringEditor2.putString("word2", (w2+ "\n"+m2));
            stringEditor2.commit();

        }else{
            btn2.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites

            stringEditor2.clear();
            stringEditor2.apply();

        }

//-- Code to be placed somewhere outside the onCreate --//


        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPref.edit();

                SharedPreferences stringPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor = stringPrefs.edit();

                if(shouldDisplayCard[0]){

                    editor.putBoolean("switch",false);
                    btn.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard[0] = false;

                    stringEditor.clear();
                    stringEditor.apply();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                    else
                        {
                    stringEditor.putString("NameOfShared", (w1+ "\n"+m1));


                    editor.putBoolean("switch",true);
                    btn.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor.commit();


                    }

                    editor.commit();

                }
                });

        btn2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor2 = sharedPref2.edit();

                SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();

                if(shouldDisplayCard1[0]){

                    editor2.putBoolean("swi",false);
                    btn2.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard1[0] = false;

                    stringEditor2.clear();
                    stringEditor2.apply();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor2.putString("word2", (w2+ "\n"+m2));


                    editor2.putBoolean("swi",true);
                    btn2.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard1[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor2.commit();


                }

                editor2.commit();

            }
        });

*/
       card1();
       card2();
       card3();
       card4();
       card5();
       card6();
       card7();
       card8();
        card9();
        card10();
        card11();
        card12();
        card13();
        card14();
        card15();




        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,w1+"\n"+m1);
                startActivity(Intent.createChooser(intent,"Send"));
            }
        });

        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,w2+"\n"+m2);
                startActivity(Intent.createChooser(intent,"Send"));
            }
        });


        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,w3+"\n"+m3);
                startActivity(Intent.createChooser(intent,"Send"));
            }
        });

        share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,w4+"\n"+m4);
                startActivity(Intent.createChooser(intent,"Send"));
            }
        });

        share4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,w5+"\n"+m5);
                startActivity(Intent.createChooser(intent,"Send"));
            }
        });

        share5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,w6+"\n"+m7);
                startActivity(Intent.createChooser(intent,"Send"));
            }
        });


        share6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,w7+"\n"+m7);
                startActivity(Intent.createChooser(intent,"Send"));
            }
        });

        share7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,w8+"\n"+m8);
                startActivity(Intent.createChooser(intent,"Send"));
            }
        });


  /*      SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        boolean shouldDisplayCard = sharedPref.getBoolean("switch", false);

        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {

                clickcount=clickcount+1;



                if(clickcount==1)
                {
                    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = prefs.edit();

                    editor.putString("NameOfShared", (val2+ "\n"+val));
                    editor.putBoolean("switch",false);
//        editor.putInt("counter", clickcount);
                    btn.setBackgroundResource(R.mipmap.savefav);

                    Toast.makeText(getApplicationContext(),"Button clicked first time!", Toast.LENGTH_LONG).show();

                    editor.commit();

                }*/
                /*else
                {


                    Toast.makeText(getApplicationContext(),"Button clicked count is "+clickcount, Toast.LENGTH_LONG).show();

                    btn.setBackgroundResource(R.mipmap.star);

                    SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

                    Boolean sw = app_preferences.getBoolean("switch", false);
                    btn.setBackgroundResource(R.mipmap.star);
                    editor.putBoolean("count",false);

                    clickcount = 0;

                    editor.clear();
                    editor.apply();

                }

                }
        });

*/


                    /*SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

                    Boolean sw = app_preferences.getBoolean("switch", false);
                    btn.setBackgroundResource(R.mipmap.savefav);
//                    editor.putBoolean("count",false);

                    editor.clear();
                    editor.apply();*/


      /*  btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("NameOfShared2", val2);
                editor.commit();
            }
        });*/







        /*SharedPreferences sp = getSharedPreferences("your_shared_pref_name", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.putString("stringkey", "value");
        editor.putBoolean("boolkey", true);
        editor.putFloat("floatkey", 4.3434f);
        editor.putLong("longkey", 343434343434343l);

        editor.apply();


        sp.getString("stringkey", "default value");
        sp.getBoolean("boolkey", false);
        sp.getFloat("floatkey", 0.0f);
        sp.getLong("longkey", 0l);


        editor.remove("keytoberemoved");

        //commiting the changes
        editor.apply();


        editor.clear();
        editor.apply();


        textView = findViewById(R.id.test);

      *//*  Button btn = findViewById(R.id.save);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveName();
            }
        });*//*




    }


    private void saveName() {
        String name = textView.getText().toString();

       *//* if (name.isEmpty()) {
            editText.setError("Name required");
            editText.requestFocus();
            return;
        }*//*

        SharedPreferences sp = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.putString(KEY_NAME, name);

        editor.apply();

//        editText.setText("");
    }

    private void displayName() {
        SharedPreferences sp = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        String name = sp.getString(KEY_NAME, null);

        if (name != null) {
            textView.setText("Welcome " + name);
        }
    }

    public void btnSave(View view){
        saveName();
        displayName();
    }

}*/

    }

  /*  public void btnSave(View view) {

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("NameOfShared", val);
        editor.commit();
    }*/

    public void card1(){


      SharedPreferences stringPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
      SharedPreferences.Editor stringEditor = stringPrefs.edit();

      sharedPref = getSharedPreferences("my_pref",Context.MODE_PRIVATE);

      final boolean[] shouldDisplayCard = {sharedPref.getBoolean("switch", false)};


      if(shouldDisplayCard[0]){

          btn.setBackgroundResource(R.mipmap.savefav);
          stringEditor.putString("NameOfShared", (w1+ "\n"+m1));
          stringEditor.commit();

      }else{
          btn.setBackgroundResource(R.mipmap.star);
          // your icon resource when not added to favourites
          stringEditor.remove("NameOfShared");
          stringEditor.commit();

      }


      btn.setOnClickListener(new View.OnClickListener() {
          @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
          @Override
          public void onClick(View v) {
              SharedPreferences.Editor editor = sharedPref.edit();

              SharedPreferences stringPrefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
              SharedPreferences.Editor stringEditor = stringPrefs.edit();

              if(shouldDisplayCard[0]){

                  editor.putBoolean("switch",false);
                  btn.setBackgroundResource(R.mipmap.star);
                  shouldDisplayCard[0] = false;

                  stringEditor.remove("NameOfShared");
                  stringEditor.commit();


                  Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
              }
              else
              {
                  stringEditor.putString("NameOfShared", (w1+ "\n"+m1));


                  editor.putBoolean("switch",true);
                  btn.setBackgroundResource(R.mipmap.savefav);
                  shouldDisplayCard[0] = true;

                  Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                  stringEditor.commit();


              }

              editor.commit();

          }
      });

  }

    public void card2(){


        sharedPref1 = getSharedPreferences("my",Context.MODE_PRIVATE);
        final boolean[] shouldDisplayCard1 = {sharedPref1.getBoolean("swi", false)};

        SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();


        if(shouldDisplayCard1[0]){
            btn2.setBackgroundResource(R.mipmap.savefav);
            stringEditor2.putString("word2", (w2+ "\n"+m2));
            stringEditor2.commit();

        }else{
            btn2.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites

            stringEditor2.remove("word2");
            stringEditor2.commit();

        }

        btn2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor2 = sharedPref1.edit();

                SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();

                if(shouldDisplayCard1[0]){

                    editor2.putBoolean("swi",false);
                    btn2.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard1[0] = false;

                    stringEditor2.remove("word2");
                    stringEditor2.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor2.putString("word2", (w2+ "\n"+m2));


                    editor2.putBoolean("swi",true);
                    btn2.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard1[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor2.commit();


                }

                editor2.commit();

            }
        });


    }

    public void card3(){


        sharedPref2 = getSharedPreferences("my",Context.MODE_PRIVATE);
        final boolean[] shouldDisplayCard2 = {sharedPref2.getBoolean("swi3", false)};

        SharedPreferences stringPrefs3 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor3 = stringPrefs3.edit();


        if(shouldDisplayCard2[0]){
            btn3.setBackgroundResource(R.mipmap.savefav);
            stringEditor3.putString("word3", (w3+ "\n"+m3));
            stringEditor3.commit();

        }else{
            btn3.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites

            stringEditor3.remove("word3");
            stringEditor3.commit();

        }

        btn3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor3 = sharedPref2.edit();

                SharedPreferences stringPrefs3 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor3 = stringPrefs3.edit();

                if(shouldDisplayCard2[0]){

                    editor3.putBoolean("swi3",false);
                    btn3.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard2[0] = false;

                    stringEditor3.remove("word3");
                    stringEditor3.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor3.putString("word3", (w3+ "\n"+m3));


                    editor3.putBoolean("swi3",true);
                    btn3.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard2[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor3.commit();


                }

                editor3.commit();

            }
        });


    }

    public void card4(){


        sharedPref3 = getSharedPreferences("my",Context.MODE_PRIVATE);
        final boolean[] shouldDisplayCard3 = {sharedPref3.getBoolean("swi4", false)};

        SharedPreferences stringPrefs4 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor4 = stringPrefs4.edit();


        if(shouldDisplayCard3[0]){
            btn4.setBackgroundResource(R.mipmap.savefav);
            stringEditor4.putString("word4", (w4+ "\n"+m4));
            stringEditor4.commit();

        }else{
            btn4.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites

            stringEditor4.remove("word4");
            stringEditor4.commit();

        }

        btn4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor4 = sharedPref3.edit();

                SharedPreferences stringPrefs4 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor4 = stringPrefs4.edit();

                if(shouldDisplayCard3[0]){

                    editor4.putBoolean("swi4",false);
                    btn4.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard3[0] = false;

                    stringEditor4.remove("word4");
                    stringEditor4.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor4.putString("word4", (w4+ "\n"+m4));


                    editor4.putBoolean("swi4",true);
                    btn4.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard3[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor4.commit();


                }

                editor4.commit();

            }
        });


    }

    public void card5(){




        sharedPref4 = getSharedPreferences("my_pref",Context.MODE_PRIVATE);

        final boolean[] shouldDisplayCard5 = {sharedPref4.getBoolean("swi5", false)};

        SharedPreferences stringPrefs5 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor5 = stringPrefs5.edit();


        if(shouldDisplayCard5[0]){

            btn5.setBackgroundResource(R.mipmap.savefav);
            stringEditor5.putString("word5", (w5+ "\n"+m5));
            stringEditor5.commit();

        }else{
            btn5.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites
            stringEditor5.remove("word5");
            stringEditor5.commit();

        }


        btn5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor5 = sharedPref.edit();

                SharedPreferences stringPrefs5 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor5 = stringPrefs5.edit();

                if(shouldDisplayCard5[0]){

                    editor5.putBoolean("swi5",false);
                    btn5.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard5[0] = false;

                    stringEditor5.remove("word5");
                    stringEditor5.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor5.putString("word5", (w5+ "\n"+m5));


                    editor5.putBoolean("swi5",true);
                    btn5.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard5[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor5.commit();


                }

                editor5.commit();

            }
        });

    }

    public void card6(){


        sharedPref1 = getSharedPreferences("my",Context.MODE_PRIVATE);
        final boolean[] shouldDisplayCard1 = {sharedPref1.getBoolean("swi6", false)};

        SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();


        if(shouldDisplayCard1[0]){
            btn6.setBackgroundResource(R.mipmap.savefav);
            stringEditor2.putString("word6", (w6+ "\n"+m6));
            stringEditor2.commit();

        }else{
            btn6.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites

            stringEditor2.remove("word6");
            stringEditor2.commit();

        }

        btn6.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor2 = sharedPref1.edit();

                SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();

                if(shouldDisplayCard1[0]){

                    editor2.putBoolean("swi6",false);
                    btn6.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard1[0] = false;

                    stringEditor2.remove("word6");
                    stringEditor2.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor2.putString("word6", (w6+ "\n"+m6));


                    editor2.putBoolean("swi6",true);
                    btn6.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard1[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor2.commit();


                }

                editor2.commit();

            }
        });


    }

    public void card7(){




        sharedPref4 = getSharedPreferences("my_pref",Context.MODE_PRIVATE);

        final boolean[] shouldDisplayCard5 = {sharedPref4.getBoolean("swi7", false)};

        SharedPreferences stringPrefs5 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor5 = stringPrefs5.edit();


        if(shouldDisplayCard5[0]){

            btn7.setBackgroundResource(R.mipmap.savefav);
            stringEditor5.putString("word7", (w7+ "\n"+m7));
            stringEditor5.commit();

        }else{
            btn7.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites
            stringEditor5.remove("word7");
            stringEditor5.commit();

        }


        btn7.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor5 = sharedPref.edit();

                SharedPreferences stringPrefs5 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor5 = stringPrefs5.edit();

                if(shouldDisplayCard5[0]){

                    editor5.putBoolean("swi7",false);
                    btn7.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard5[0] = false;

                    stringEditor5.remove("word7");
                    stringEditor5.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor5.putString("word7", (w7+ "\n"+m7));


                    editor5.putBoolean("swi7",true);
                    btn7.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard5[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor5.commit();


                }

                editor5.commit();

            }
        });

    }

    public void card8(){


        sharedPref1 = getSharedPreferences("my",Context.MODE_PRIVATE);
        final boolean[] shouldDisplayCard1 = {sharedPref1.getBoolean("swi8", false)};

        SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();


        if(shouldDisplayCard1[0]){
            btn8.setBackgroundResource(R.mipmap.savefav);
            stringEditor2.putString("word8", (w8+ "\n"+m8));
            stringEditor2.commit();

        }else{
            btn8.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites

            stringEditor2.remove("word8");
            stringEditor2.commit();

        }

        btn8.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor2 = sharedPref1.edit();

                SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();

                if(shouldDisplayCard1[0]){

                    editor2.putBoolean("swi8",false);
                    btn8.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard1[0] = false;

                    stringEditor2.remove("word8");
                    stringEditor2.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor2.putString("word8", (w8+ "\n"+m8));


                    editor2.putBoolean("swi8",true);
                    btn8.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard1[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor2.commit();


                }

                editor2.commit();

            }
        });


    }

    public void card9(){


        sharedPref1 = getSharedPreferences("my",Context.MODE_PRIVATE);
        final boolean[] shouldDisplayCard1 = {sharedPref1.getBoolean("swi9", false)};

        SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();


        if(shouldDisplayCard1[0]){
            btn9.setBackgroundResource(R.mipmap.savefav);
            stringEditor2.putString("word9", (w9+ "\n"+m9));
            stringEditor2.commit();

        }else{
            btn9.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites

            stringEditor2.remove("word9");
            stringEditor2.commit();

        }

        btn9.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor2 = sharedPref1.edit();

                SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();

                if(shouldDisplayCard1[0]){

                    editor2.putBoolean("swi9",false);
                    btn9.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard1[0] = false;

                    stringEditor2.remove("word9");
                    stringEditor2.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor2.putString("word9", (w9+ "\n"+m9));


                    editor2.putBoolean("swi9",true);
                    btn9.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard1[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor2.commit();


                }

                editor2.commit();

            }
        });


    }

    public void card10(){


        sharedPref2 = getSharedPreferences("my",Context.MODE_PRIVATE);
        final boolean[] shouldDisplayCard2 = {sharedPref2.getBoolean("swi10", false)};

        SharedPreferences stringPrefs3 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor3 = stringPrefs3.edit();


        if(shouldDisplayCard2[0]){
            btn10.setBackgroundResource(R.mipmap.savefav);
            stringEditor3.putString("word10", (w10+ "\n"+m10));
            stringEditor3.commit();

        }else{
            btn10.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites

            stringEditor3.remove("word10");
            stringEditor3.commit();

        }

        btn10.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor3 = sharedPref2.edit();

                SharedPreferences stringPrefs3 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor3 = stringPrefs3.edit();

                if(shouldDisplayCard2[0]){

                    editor3.putBoolean("swi10",false);
                    btn10.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard2[0] = false;

                    stringEditor3.remove("word10");
                    stringEditor3.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor3.putString("word10", (w10+ "\n"+m10));


                    editor3.putBoolean("swi10",true);
                    btn10.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard2[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor3.commit();


                }

                editor3.commit();

            }
        });


    }

    public void card11(){


        sharedPref3 = getSharedPreferences("my",Context.MODE_PRIVATE);
        final boolean[] shouldDisplayCard3 = {sharedPref3.getBoolean("swi11", false)};

        SharedPreferences stringPrefs4 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor4 = stringPrefs4.edit();


        if(shouldDisplayCard3[0]){
            btn11.setBackgroundResource(R.mipmap.savefav);
            stringEditor4.putString("word11", (w11+ "\n"+m11));
            stringEditor4.commit();

        }else{
            btn11.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites

            stringEditor4.remove("word11");
            stringEditor4.commit();

        }

        btn11.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor4 = sharedPref3.edit();

                SharedPreferences stringPrefs4 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor4 = stringPrefs4.edit();

                if(shouldDisplayCard3[0]){

                    editor4.putBoolean("swi11",false);
                    btn11.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard3[0] = false;

                    stringEditor4.remove("word11");
                    stringEditor4.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor4.putString("word4", (w11+ "\n"+m11));


                    editor4.putBoolean("swi11",true);
                    btn11.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard3[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor4.commit();


                }

                editor4.commit();

            }
        });


    }

    public void card12(){




        sharedPref4 = getSharedPreferences("my_pref",Context.MODE_PRIVATE);

        final boolean[] shouldDisplayCard5 = {sharedPref4.getBoolean("swi12", false)};

        SharedPreferences stringPrefs5 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor5 = stringPrefs5.edit();


        if(shouldDisplayCard5[0]){

            btn12.setBackgroundResource(R.mipmap.savefav);
            stringEditor5.putString("word12", (w12+ "\n"+m12));
            stringEditor5.commit();

        }else{
            btn12.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites
            stringEditor5.remove("word12");
            stringEditor5.commit();

        }


        btn12.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor5 = sharedPref.edit();

                SharedPreferences stringPrefs5 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor5 = stringPrefs5.edit();

                if(shouldDisplayCard5[0]){

                    editor5.putBoolean("swi12",false);
                    btn12.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard5[0] = false;

                    stringEditor5.remove("word12");
                    stringEditor5.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor5.putString("word12", (w12+ "\n"+m12));


                    editor5.putBoolean("swi12",true);
                    btn12.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard5[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor5.commit();


                }

                editor5.commit();

            }
        });

    }

    public void card13(){


        sharedPref1 = getSharedPreferences("my",Context.MODE_PRIVATE);
        final boolean[] shouldDisplayCard1 = {sharedPref1.getBoolean("swi13", false)};

        SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();


        if(shouldDisplayCard1[0]){
            btn13.setBackgroundResource(R.mipmap.savefav);
            stringEditor2.putString("word13", (w13+ "\n"+m13));
            stringEditor2.commit();

        }else{
            btn13.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites

            stringEditor2.remove("word13");
            stringEditor2.commit();

        }

        btn13.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor2 = sharedPref1.edit();

                SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();

                if(shouldDisplayCard1[0]){

                    editor2.putBoolean("swi13",false);
                    btn13.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard1[0] = false;

                    stringEditor2.remove("word13");
                    stringEditor2.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor2.putString("word13", (w13+ "\n"+m13));


                    editor2.putBoolean("swi13",true);
                    btn13.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard1[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor2.commit();


                }

                editor2.commit();

            }
        });


    }

    public void card14(){




        sharedPref4 = getSharedPreferences("my_pref",Context.MODE_PRIVATE);

        final boolean[] shouldDisplayCard5 = {sharedPref4.getBoolean("swi14", false)};

        SharedPreferences stringPrefs5 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor5 = stringPrefs5.edit();


        if(shouldDisplayCard5[0]){

            btn14.setBackgroundResource(R.mipmap.savefav);
            stringEditor5.putString("word14", (w14+ "\n"+m14));
            stringEditor5.commit();

        }else{
            btn14.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites
            stringEditor5.remove("word14");
            stringEditor5.commit();

        }


        btn14.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor5 = sharedPref.edit();

                SharedPreferences stringPrefs5 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor5 = stringPrefs5.edit();

                if(shouldDisplayCard5[0]){

                    editor5.putBoolean("swi14",false);
                    btn14.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard5[0] = false;

                    stringEditor5.remove("word14");
                    stringEditor5.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor5.putString("word14", (w14+ "\n"+m14));


                    editor5.putBoolean("swi14",true);
                    btn14.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard5[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor5.commit();


                }

                editor5.commit();

            }
        });

    }

    public void card15(){


        sharedPref1 = getSharedPreferences("my",Context.MODE_PRIVATE);
        final boolean[] shouldDisplayCard1 = {sharedPref1.getBoolean("swi15", false)};

        SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();


        if(shouldDisplayCard1[0]){
            btn15.setBackgroundResource(R.mipmap.savefav);
            stringEditor2.putString("word15", (w15+ "\n"+m15));
            stringEditor2.commit();

        }else{
            btn15.setBackgroundResource(R.mipmap.star);
            // your icon resource when not added to favourites

            stringEditor2.remove("word15");
            stringEditor2.commit();

        }

        btn15.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor2 = sharedPref1.edit();

                SharedPreferences stringPrefs2 = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor stringEditor2 = stringPrefs2.edit();

                if(shouldDisplayCard1[0]){

                    editor2.putBoolean("swi15",false);
                    btn15.setBackgroundResource(R.mipmap.star);
                    shouldDisplayCard1[0] = false;

                    stringEditor2.remove("word15");
                    stringEditor2.commit();


                    Toast.makeText(getApplicationContext(),"Removed from Favourites!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    stringEditor2.putString("word15", (w15+ "\n"+m15));


                    editor2.putBoolean("swi15",true);
                    btn15.setBackgroundResource(R.mipmap.savefav);
                    shouldDisplayCard1[0] = true;

                    Toast.makeText(getApplicationContext(),"Added to Favourites!", Toast.LENGTH_LONG).show();

                    stringEditor2.commit();


                }

                editor2.commit();

            }
        });


    }





}
