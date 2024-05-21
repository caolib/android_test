package com.clb;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //SharedPreferences sp = this.getPreferences(MODE_PRIVATE);
        //SharedPreferences.Editor edit = sp.edit();
        //edit.putString("name", "clb");
        //edit.putInt("age", 18);
        //if (edit.commit()) {
        //    Log.d("sp", "onCreate: 保存成功");
        //    return;
        //}
        //Log.w("sp", "onCreate: 保存失败");

        SharedPreferences sp = this.getPreferences(MODE_PRIVATE);
        String name = sp.getString("name", "默认值");
        int age = sp.getInt("age", 66);
        String address = sp.getString("address", "默认值");

        Log.d("debug", name);
        Log.d("debug", String.valueOf(age));
        Log.d("debug", address);

        findViewById(R.id.tv_mar).setOnClickListener(v -> {
            v.setSelected(true);
        });

    }

}