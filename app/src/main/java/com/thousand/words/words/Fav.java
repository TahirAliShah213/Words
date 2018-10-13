package com.thousand.words.words;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fav extends AppCompatActivity  {

    private static final String SHARED_PREF_NAME = "mysharedpref";
    private static final String KEY_NAME = "keyname";



    EditText editText;
    TextView textView;
    TextView textView2;


    ListView listView;

    private EditText editTxt;
    private Button btn;

    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

    SharedPreferences mSharedPreference,mSharedPreference1,mSharedPreference2,mSharedPreference3,mSharedPreference4
            ,mSharedPreference5,mSharedPreference6,mSharedPreference7,mSharedPreference8,mSharedPreference9,mSharedPreference10
            ,mSharedPreference11,mSharedPreference12,mSharedPreference13,mSharedPreference14,mSharedPreference15
            ,mSharedPreference16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav);


         mSharedPreference= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
         mSharedPreference1= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference2= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference3= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference4= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference5= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference6= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference7= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference8= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference9= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference10= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference11= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference12= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference13= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference14= PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        mSharedPreference15= PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        final SharedPreferences.Editor editor = mSharedPreference.edit();
        final SharedPreferences.Editor editor1 = mSharedPreference1.edit();
        final SharedPreferences.Editor editor2 = mSharedPreference2.edit();
        final SharedPreferences.Editor editor3 = mSharedPreference3.edit();

        String w1=(mSharedPreference.getString("NameOfShared", ""));
        String w2=(mSharedPreference1.getString("word2", ""));
        String w3=(mSharedPreference2.getString("word3", ""));
        String w4=(mSharedPreference3.getString("word4", ""));
        String w5=(mSharedPreference4.getString("word5", ""));
        String w6=(mSharedPreference5.getString("word6", ""));
        String w7=(mSharedPreference6.getString("word7", ""));
        String w8=(mSharedPreference7.getString("word8", ""));
        String w9=(mSharedPreference8.getString("word9", ""));
        String w10=(mSharedPreference9.getString("word10", ""));
        String w11=(mSharedPreference10.getString("word11", ""));
        String w12=(mSharedPreference11.getString("word12", ""));
        String w13=(mSharedPreference12.getString("word13", ""));
        String w14=(mSharedPreference13.getString("word14", ""));
        String w15=(mSharedPreference14.getString("word15", ""));

//        textView = findViewById(R.id.textView);
        listView = findViewById(R.id.list_item);



      /*  if (value.equals(null)){

        }
        else {
            listView.addView(value);
        }*/

//        textView.setText(value);

//        textView.setPadding(5,5,5,5);


//        textView2 = findViewById(R.id.textView2);

   //     Typeface fontsCustom = Typeface.createFromAsset(getAssets(),"telfonts.otf");



      /*  textView2.setText(value2);
        textView2.setTypeface(fontsCustom);
        textView2.setTextSize(30);

        Button bt = findViewById(R.id.buttn);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.clear();
          //      editor.remove("NameOfShared");
                textView.setText("");
                textView2.setText("");
                editor.apply();

            }
        });*/





        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, arrayList);

        // Here, you set the data in your ListView
        listView.setAdapter(adapter);





        arrayList.add(w1);
        arrayList.add(w2);
        arrayList.add(w3);
        arrayList.add(w4);
        arrayList.add(w5);
        arrayList.add(w6);
        arrayList.add(w7);
        arrayList.add(w8);
        arrayList.add(w9);
        arrayList.add(w10);
        arrayList.add(w11);
        arrayList.add(w12);
        arrayList.add(w13);
        arrayList.add(w14);
        arrayList.add(w15);
        
        // next thing you have to do is check if your adapter has changed
        adapter.notifyDataSetChanged();


        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);

        Collections.reverse(arrayList);

    }
}