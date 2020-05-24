package com.nahidsaikat.ayat.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.nahidsaikat.ayat.MainActivity;
import com.nahidsaikat.ayat.R;
import com.nahidsaikat.ayat.SurahActivity;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ListView listView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_home, container, false);

        listView = (ListView) root.findViewById(R.id.surahListViewId);
        final String[] surahNames = getResources().getStringArray(R.array.surah_names);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(root.getContext(),
                R.layout.surah_text_view, R.id.surahTextViewId, surahNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(root.getContext(), SurahActivity.class);
                intent.putExtra("surah_index", String.valueOf(position));
                startActivity(intent);

            }
        });

        return root;
    }
}
