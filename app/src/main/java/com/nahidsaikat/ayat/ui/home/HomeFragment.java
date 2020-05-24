package com.nahidsaikat.ayat.ui.home;

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

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ListView listView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_home, container, false);

        listView = (ListView) root.findViewById(R.id.surah_list_view_id);
        final String[] surahNames = getResources().getStringArray(R.array.surah_names);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(root.getContext(),
                R.layout.surah_text_view, R.id.surah_text_view_id, surahNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = surahNames[position];
                Toast.makeText(root.getContext(), value, Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}
