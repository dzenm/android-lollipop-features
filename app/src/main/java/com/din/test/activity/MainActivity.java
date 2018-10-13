package com.din.test.activity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.din.test.R;
import com.din.test.animation.ExplodeActivity;
import com.din.test.animation.FadeActivity;
import com.din.test.animation.ShareActivity;
import com.din.test.animation.SlideActivity;
import com.din.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.animationBtn) {
            startActivity(new Intent(this, AnimationActivity.class));
        }
        if (view.getId() == R.id.changeThemeBtn) {
            startActivity(new Intent(this, ChangeThemeActivity.class));
        }
        if (view.getId() == R.id.dragLayoutBtn) {
            startActivity(new Intent(this, DragLayoutActivity.class));
        }
        if (view.getId() == R.id.floatBubbleBtn) {
            startActivity(new Intent(this, FloatBubbleActivity.class));
        }
        if (view.getId() == R.id.updateColorBtn) {
            startActivity(new Intent(this, UpdateColorActivity.class));
        }
        if (view.getId() == R.id.selectorBtn) {
            startActivity(new Intent(this, SelectorActivity.class));
        }
        if (view.getId() == R.id.paletteBtn) {
            startActivity(new Intent(this, PaletteActivity.class));
        }
        if (view.getId() == R.id.shadowBtn) {
            startActivity(new Intent(this, ShadowActivity.class));
        }
        if (view.getId() == R.id.vectorBtn) {
            startActivity(new Intent(this, VectorAnimationActivity.class));
        }
        if (view.getId() == R.id.explodeBtn) {
            transitionAnimation(ExplodeActivity.class);
        }
        if (view.getId() == R.id.slideBtn) {
            transitionAnimation(SlideActivity.class);
        }
        if (view.getId() == R.id.fadeBtn) {
            transitionAnimation(FadeActivity.class);
        }
        if (view.getId() == R.id.shareBtn) {
            shareElementAnimation(ShareActivity.class);
        }

    }

    /**
     * 三个普通转场动画跳转到另一个Activity
     */
    private void transitionAnimation(Class otherActivity) {
        Intent intent = new Intent(MainActivity.this, otherActivity);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    /**
     * 共享元素转场动画
     *
     * @param otherActivity
     */
    private void shareElementAnimation(Class otherActivity) {
        Intent intent = new Intent(MainActivity.this, otherActivity);
        //多个共享元素的话:
        // ActivityOptions.makeSceneTransitionAnimation(this, Pair.create(((View) iv1),"share1"), create(((View) textView),"share2")
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this, binding.shareBtn, "shareView").toBundle();
        startActivity(intent, bundle);
    }
}