package com.clb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProgressbarActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private RatingBar rb;
    private TextView tv;
    private ProgressBar pb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);

        Button btn_download = findViewById(R.id.btn_download);
        progressBar = findViewById(R.id.pb);
        rb = findViewById(R.id.rb);
        tv = findViewById(R.id.tv_rating);
        pb2 = findViewById(R.id.pb2);

        // 点击下载按钮显示进度条
        btn_download.setOnClickListener(view -> progressBar.setVisibility(View.VISIBLE));

        // 点击进度条后隐藏，显示评分条
        progressBar.setOnClickListener(view -> {
            progressBar.setVisibility(View.GONE);
            rb.setVisibility(View.VISIBLE);
            tv.setVisibility(View.VISIBLE);
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        new Thread() {
            @Override
            public void run() {
                int max = pb2.getMax();
                Log.d("TAG", "run: " + max);
                while (pb2.getProgress() < max || pb2.getSecondaryProgress() < max) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    pb2.incrementProgressBy(3);
                    pb2.incrementSecondaryProgressBy(7);
                }
            }
        }.start();

    }
}