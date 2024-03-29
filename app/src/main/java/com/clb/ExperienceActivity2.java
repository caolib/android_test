package com.clb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

public class ExperienceActivity2 extends AppCompatActivity {

    TextView first;
    TextView second;
    TextView secondText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_experience2);
        // 初始化
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        secondText = findViewById(R.id.second_text);

        // 设置图标大小
        int size = 150;

        Drawable chicken = first.getCompoundDrawables()[0];
        chicken.setBounds(0, 0, size, size);
        first.setCompoundDrawables(chicken, null, null, null);

        Drawable ball = second.getCompoundDrawables()[2];
        ball.setBounds(0, 0, size, size);
        second.setCompoundDrawables(null, null, ball, null);

        // 设置第二个文本为被选中状态
        secondText.setSelected(true);

    }
}