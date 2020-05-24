package com.nahidsaikat.ayat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SurahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String index = bundle.getString("surah_index");

        }
    }
}
