package com.exampleparticle;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.exampleparticle.library.ParticleView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ParticleView particleAnimator = new ParticleView(MainActivity.this,3000);
        particleAnimator.setOnAnimationListener(new ParticleView.OnAnimationListener() {
            @Override
            public void onAnimationStart(View view,Animator animation) {
                view.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onAnimationEnd(View view,Animator animation) {

            }
        });
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                particleAnimator.boom(v);//getWindow().getDecorView().findViewById(android.R.id.content)
            }
        });






    }
}
