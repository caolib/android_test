package io.github.caolib;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // 获取activity1传递的数据并显示
        Intent intent = getIntent();
        String count = intent.getStringExtra("count");
        TextView textView = findViewById(R.id.tv_count);
        textView.setText(count);

        findViewById(R.id.tv_ok).setOnClickListener(v -> {
            // 返回结果
            Intent i = new Intent(MainActivity2.this, MainActivity.class).putExtra("return", "感谢您的宝贵建议！");
            setResult(RESULT_OK, i);
            finish();
        });

    }
}