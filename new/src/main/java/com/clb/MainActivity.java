package com.clb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_dialog = findViewById(R.id.btn_dialog);

        btn_dialog.setOnClickListener(v -> {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.dialog_layout, null);

            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this, R.style.dialog)
                    .setView(view)
                    .create();

            alertDialog.show();
        });


    }
}