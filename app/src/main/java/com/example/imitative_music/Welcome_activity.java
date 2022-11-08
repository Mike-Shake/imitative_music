package com.example.imitative_music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

public class Welcome_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏标题栏
//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
//        getWindow().setStatusBarColor(Color.TRANSPARENT);
//        getSupportActionBar().hide();

        setContentView(R.layout.activity_welcome);
    }


    @Override
    protected void onStart() {
        super.onStart();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Welcome_activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}