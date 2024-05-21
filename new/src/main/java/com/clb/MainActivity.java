package com.clb;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_dialog = findViewById(R.id.btn_dialog);

        btn_dialog.setOnClickListener(v -> {
            View view = getLayoutInflater().inflate(R.layout.dialog_layout, null);

            new AlertDialog.Builder(MainActivity.this, R.style.dialog)
                    .setView(view)
                    .create()
                    .show();
        });




    }
}