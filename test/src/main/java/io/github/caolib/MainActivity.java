package io.github.caolib;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.et);

        ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            // 获取返回的结果
            Intent data = result.getData();
            if (result.getResultCode() == RESULT_OK && data != null) {
                editText.setText(data.getStringExtra("return"));
            }
        });

        findViewById(R.id.btn_commit).setOnClickListener(v -> {
            // 获取EditText文本内容长度,发送给Activity2
            String s = editText.getText().length() + "字";
            Intent intent = new Intent(MainActivity.this, MainActivity2.class).putExtra("count", s);
            launcher.launch(intent);
        });

    }
}
