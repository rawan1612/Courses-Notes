package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.example.finalproject.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);
        Handler handler =new Handler();
        handler.postDelayed(() -> {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();

        },4000);
    }
}