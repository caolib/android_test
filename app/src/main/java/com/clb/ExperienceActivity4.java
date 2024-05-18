package com.clb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;

public class ExperienceActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience4);

        ImageView iv1 = findViewById(R.id.iv1);
        ImageView iv2 = findViewById(R.id.iv2);
        ImageView iv3 = findViewById(R.id.iv3);

        Glide.with(this)
                .load("https://img2.imgtp.com/2024/04/04/A1kg7et8.gif")
                .transform(new CircleCrop())
                .into(iv1);


        Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.img);
        RoundedBitmapDrawable bitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bm);
        bitmapDrawable.setCornerRadius(100);
        iv2.setImageDrawable(bitmapDrawable);


        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.flowers);
        RoundedBitmapDrawable round = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        round.setCircular(true);

        iv3.setImageDrawable(round);
        iv3.setScaleType(ImageView.ScaleType.CENTER_CROP);

    }
}