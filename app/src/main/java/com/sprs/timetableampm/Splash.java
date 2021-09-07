package com.sprs.timetableampm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_splash);

/*
        ImageView image = (ImageView)findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.movetoright);
        image.startAnimation(animation);

        ImageView logo_splash = (ImageView)findViewById(R.id.logo_splash);
        Animation animation_fade = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade);
        logo_splash.startAnimation(animation_fade);

*/
        startActivity(new Intent(Splash.this, Dashboard.class));
        finish();

    }
}