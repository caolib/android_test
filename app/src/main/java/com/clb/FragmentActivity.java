package com.clb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        findViewById(R.id.btn_add).setOnClickListener(v -> {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.ll_container, new MyFragment())
                    .commit();

        });
    }
}