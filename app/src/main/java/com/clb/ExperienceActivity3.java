package com.clb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

public class ExperienceActivity3 extends AppCompatActivity implements View.OnClickListener {

    EditText et_username;
    EditText et_pwd;
    Button btn_login;
    TextView tv_remember;
    Switch sw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience3);

        et_username = findViewById(R.id.username);
        et_pwd = findViewById(R.id.password);
        btn_login = findViewById(R.id.login_btn);
        tv_remember = findViewById(R.id.tv_remember);
        sw = findViewById(R.id.sw);

        // 设置图标大小
        int dimen = 100;
        Drawable drawable = et_username.getCompoundDrawables()[0];
        drawable.setBounds(0, 0, dimen, dimen);
        et_username.setCompoundDrawables(drawable, null, null, null);

        drawable = et_pwd.getCompoundDrawables()[0];
        drawable.setBounds(0, 0, dimen, dimen);
        et_pwd.setCompoundDrawables(drawable, null, null, null);

        et_username.setOnClickListener(this);
        et_pwd.setOnClickListener(this);
        btn_login.setOnClickListener(this);
        tv_remember.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == et_username.getId() || id == et_pwd.getId()) {
            // 显示键盘
            view.requestFocus();
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
        } else if (id == btn_login.getId()) {
            // 点击登录时显示用户名和密码
            String username = et_username.getText().toString();
            String pwd = et_pwd.getText().toString();
            String show = "用户名:" + username + "\n密码 :" + pwd;
            Toast.makeText(this, show, Toast.LENGTH_LONG).show();
        } else if (id == tv_remember.getId()) {
            sw.setChecked(!sw.isChecked());
        }
    }

}