package com.din.test.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;

import com.din.test.R;

/**
 * @Description:淡入淡出动画
 */
public class FadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setEnterTransition(new Fade().setDuration(1000));
        getWindow().setExitTransition(new Fade().setDuration(1000));
        setContentView(R.layout.activity_transition_animation);
    }
}
