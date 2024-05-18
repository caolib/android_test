package io.github.caolib;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    public static final String TAG = "clb";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d(TAG, "Activity-2 onCreate...");

        Intent intent = getIntent();
        String count = intent.getStringExtra("count");

        TextView textView = findViewById(R.id.tv_count);
        textView.setText(count);

        findViewById(R.id.tv_ok).setOnClickListener(v -> {
            Intent i = new Intent(MainActivity2.this, MainActivity.class);
            i.putExtra("return", "感谢您的宝贵建议！");
            startActivity(i);
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity-2 onStart...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity-2 onResume...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity-2 onPause...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity-2 onDestroy...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity-2 onStop...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Activity-2 onRestart...");
    }
}