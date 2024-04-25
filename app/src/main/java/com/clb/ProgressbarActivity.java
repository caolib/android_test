package com.clb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProgressbarActivity extends AppCompatActivity {

    private Button btn_download;
    private ProgressBar progressBar;
    private RatingBar rb;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);

        btn_download = findViewById(R.id.btn_download);
        progressBar = findViewById(R.id.pb);
        rb = findViewById(R.id.rb);
        tv = findViewById(R.id.tv_rating);


        btn_download.setOnClickListener(view -> progressBar.setVisibility(View.VISIBLE));
        progressBar.setOnClickListener(view -> {
            progressBar.setVisibility(View.GONE);
            rb.setVisibility(View.VISIBLE);
            tv.setVisibility(View.VISIBLE);
        });

    }
}