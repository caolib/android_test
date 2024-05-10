package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<String> {
    private Context mContext;
    private String[] mImages;
    private String[] mTexts;

    public CustomAdapter(Context context, String[] images, String[] texts) {
        super(context, R.layout.grid_item_layout, texts);
        this.mContext = context;
        this.mImages = images;
        this.mTexts = texts;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View gridView = convertView;
        if (gridView == null) {
            gridView = inflater.inflate(R.layout.grid_item_layout, parent, false);
        }

        ImageView imageView = gridView.findViewById(R.id.imageView);
        TextView textView = gridView.findViewById(R.id.textView);

        int imageResource = mContext.getResources().getIdentifier(mImages[position], "drawable", mContext.getPackageName());
        imageView.setImageResource(imageResource);
        textView.setText(mTexts[position]);

        return gridView;
    }
}
