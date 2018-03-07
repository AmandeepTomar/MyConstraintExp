package com.aman.myconstraintexp;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ConstraintSet constraintSet1,constraintSet2;
    private ConstraintLayout constraintLayout;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout=findViewById(R.id.root);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                animateStart();
            }
        },2000);


        imageView=findViewById(R.id.imageView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,GuideAnimation.class));
            }
        });




    }

    private void animateStart() {
        boolean set=false;
        constraintSet1=new ConstraintSet();
        constraintSet1.clone(constraintLayout);
        constraintSet2=new ConstraintSet();
        constraintSet2.clone(MainActivity.this,R.layout.activity_main_copy);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            TransitionManager.beginDelayedTransition(constraintLayout);
            constraintSet2.applyTo(constraintLayout);

        }

    }
}
