package com.gavankennedy.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView timer;
public CountDownTimer cTimer=new CountDownTimer(10000,1000) {
        public void onTick(long millisUntilFin)
        {
            timer.setText("Seconds Remaining:"+millisUntilFin/1000);
        }
        public void onFinish(){
            timer.setText("Times up");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer=findViewById((R.id.Timer));
    }
    public void  DoStart(View v) {

    }
    public void DoCancel(View v)
    {

    }
    public void DoPause(View v)
    {

    }
}