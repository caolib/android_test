package io.github.caolib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private List<Product> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView mLv = findViewById(R.id.lv);
        initProduct();
        mLv.setAdapter(new MyAdapter(this, list));
    }


    private void initProduct() {
        list = new ArrayList<>();
        Collections.addAll(list,
                new Product(R.drawable.kun, "kunkun"),
                new Product(R.drawable.man, "kobe"),
                new Product(R.drawable.messi, "messi"),
                new Product(R.drawable.trump, "trump"),
                new Product(R.drawable.biden, "biden"),
                new Product(R.drawable.bocchi, "bocchi"),
                new Product(R.drawable.cheems, "cheems")
        );
    }
}