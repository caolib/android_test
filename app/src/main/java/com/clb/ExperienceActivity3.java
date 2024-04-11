package com.clb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExperienceActivity3 extends AppCompatActivity {

    EditText et_username;
    EditText et_pwd;

    Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience3);

        et_username = findViewById(R.id.username);
        et_pwd = findViewById(R.id.password);
        btn_login = findViewById(R.id.login_btn);

        // 设置图标大小
        int dimen = 100;
        Drawable drawable = et_username.getCompoundDrawables()[0];
        drawable.setBounds(0, 0, dimen, dimen);
        et_username.setCompoundDrawables(drawable, null, null, null);

        drawable = et_pwd.getCompoundDrawables()[0];
        drawable.setBounds(0, 0, dimen, dimen);
        et_pwd.setCompoundDrawables(drawable, null, null, null);

        // 点击编辑框,显示键盘
        et_username.setOnClickListener(v -> showKeyboard(et_username));
        et_pwd.setOnClickListener(v -> showKeyboard(et_pwd));


        // 点击登录显示用户名和密码
        btn_login.setOnClickListener(v -> {
            String username = et_username.getText().toString();
            String pwd = et_pwd.getText().toString();
            String show = "用户名:" + username + "\n密码 :" + pwd;
            Toast.makeText(this, show, Toast.LENGTH_LONG).show();
        });

    }

    /**
     * 显示键盘
     */
    private void showKeyboard(EditText editText) {
        editText.requestFocus();
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
    }
}