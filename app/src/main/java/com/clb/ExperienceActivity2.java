package com.clb;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExperienceActivity2 extends AppCompatActivity {

    TextView first_tv;
    TextView second_icon;
    TextView second_tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_experience2);

        first_tv = findViewById(R.id.first);
        second_icon = findViewById(R.id.second);

        // 图标大小
        int dimen = 150;

        Drawable chicken = first_tv.getCompoundDrawables()[0];
        chicken.setBounds(0, 0, dimen, dimen);
        first_tv.setCompoundDrawables(chicken, null, null, null);

        Drawable ball = second_icon.getCompoundDrawables()[2];
        ball.setBounds(0, 0, dimen, dimen);
        second_icon.setCompoundDrawables(null, null, ball, null);

        // 将第二段文本设置为选中状态
        second_tv = findViewById(R.id.second_text);
        second_tv.setSelected(true);
    }
}