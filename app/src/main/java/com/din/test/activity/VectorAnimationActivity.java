package com.din.test.activity;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.din.test.R;

/**
 * 矢量图动画
 * */
public class VectorAnimationActivity extends AppCompatActivity {
    private View vectorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_animation);

        vectorView = (View) findViewById(R.id.view_vector);
        Drawable bgDrawable = vectorView.getBackground();
        if (bgDrawable instanceof Animatable) {
            ((Animatable) bgDrawable).start();
        }
    }
}