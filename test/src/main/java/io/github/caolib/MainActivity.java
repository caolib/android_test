package io.github.caolib;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "clb";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Activity-1 onCreate...");

        editText = findViewById(R.id.et);

        findViewById(R.id.btn_commit).setOnClickListener(v -> {
            // 获取Edittext文本内容长度
            String s = editText.getText().length() + "字";
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("count", s);
            startActivity(intent);
        });

        // 获取传回数据并显示
        Intent intent = getIntent();
        String str = intent.getStringExtra("return");
        editText.setText(str);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity-1 onStart...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity-1 onResume...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity-1 onPause...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity-1 onDestroy...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity-1 onStop...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Activity-1 onRestart...");
    }
}