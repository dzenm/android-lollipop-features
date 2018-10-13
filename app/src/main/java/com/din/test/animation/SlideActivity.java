package com.din.test.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;

import com.din.test.R;

/**
 * @Description:滑动动画
 */
public class SlideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setEnterTransition(new Slide().setDuration(1000));
        getWindow().setExitTransition(new Slide().setDuration(1000));
        setContentView(R.layout.activity_transition_animation);
    }
}
