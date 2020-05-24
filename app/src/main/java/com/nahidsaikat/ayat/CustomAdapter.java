package com.nahidsaikat.ayat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

class CustomAdapter extends BaseAdapter {
    Context context;
    String index;
    LayoutInflater inflater;

    public CustomAdapter(Context context, String index) {
        this.context = context;
        this.index = index;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.ayat_view, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.ayatImaveViewId);
        imageView.setImageResource(R.drawable.ic_menu_camera);

        return convertView;
    }
}
