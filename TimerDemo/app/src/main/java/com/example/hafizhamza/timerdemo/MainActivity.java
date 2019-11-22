package com.example.hafizhamza.timerdemo;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new CountDownTimer(20000,1000){

            @Override
            public void onTick(long l) {

                Log.i("Timer",String.valueOf(l/1000));
            }

            @Override
            public void onFinish() {
                Log.i("Timer","Is up");
            }
        }.start();

    }
}
