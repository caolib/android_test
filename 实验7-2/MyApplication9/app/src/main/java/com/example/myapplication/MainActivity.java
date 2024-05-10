package com.example.myapplication;

import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String[] mImages = {"image1", "image2", "image3", "image4", "image5", "image6"};
    private String[] mTexts = {"Android Studio", "网易云音乐", "VSCode", "IDEA", "Steam", "GitHub Desktop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter adapter = new CustomAdapter(this, mImages, mTexts);
        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
    }
}
