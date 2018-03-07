package com.aman.myconstraintexp;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;

public class GuideAnimation extends AppCompatActivity {

    Guideline guideline;
    private ImageView img3;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide_animation);
        guideline=findViewById(R.id.guideline);
        final int end=((ConstraintLayout.LayoutParams)guideline.getLayoutParams()).guideEnd;

        layout = findViewById(R.id.constraintLayoutAnimation);


       /* ObjectAnimator anim=ObjectAnimator.ofInt(guideline,"GuidelineEnd",0,end);
        anim.setDuration(2000);
        anim.setInterpolator(new BounceInterpolator());
        anim.start();*/


/*
findViewById(R.id.imageView3).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        TransitionManager.beginDelayedTransition(layout);
        int count=layout.getChildCount();
        Log.e("check count=",count+"");
        View view=layout.getChildAt(3);


        view.setMinimumHeight(4000);


    }
});
*/


    }
}
