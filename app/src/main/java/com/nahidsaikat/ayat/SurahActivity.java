package com.nahidsaikat.ayat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class SurahActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String index = bundle.getString("surah_index");

            listView = findViewById(R.id.ayatListViewId);

            CustomAdapter adapter = new CustomAdapter(this, index);
            listView.setAdapter(adapter);
        }
    }
}
