package com.premsinghdaksha.rvscrollanimation;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class RvScrollAnimation {

    public void scrollrightToLeft(Context context, View view) {
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.rv_right_left_anim);
        view.startAnimation(animation);
    }

    public void scrollLeftToRight(Context context, View view) {
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.rv_left_right_anim);
        view.startAnimation(animation);
    }

    public void scrollTopToDown(Context context, View view) {
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.rv_up_to_down_anim);
        view.startAnimation(animation);
    }

    public void scrollDownToTop(Context context, View view) {
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.rv_down_to_up_anim);
        view.startAnimation(animation);
    }


}
