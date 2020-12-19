package com.example.appmarketfastcliente.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmarketfastcliente.R;

public class SplashActivity extends AppCompatActivity {
    private final int DURACION_SPLASH= 10000;
    Animation topAnim, bottomAnim;
    ImageView ivSplashLogo;
    TextView tvMarketFast;
    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottomAnim=AnimationUtils.loadAnimation(this,R.anim.botom_anim);

        ivSplashLogo=findViewById(R.id.splashLogo);
        tvMarketFast=findViewById(R.id.MarketFast);

        ivSplashLogo.setAnimation(topAnim);
        tvMarketFast.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            };
        }, DURACION_SPLASH);

    }
}