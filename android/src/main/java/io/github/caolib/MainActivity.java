package io.github.caolib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        iv = findViewById(R.id.layer_iv);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_1) {
            iv.setImageLevel(1);
        } else if (id == R.id.btn_2) {
            iv.setImageLevel(2);
        } else if (id == R.id.btn_3) {
            iv.setImageLevel(3);
        }
    }
}