package com.example.defeatcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Intro extends AppCompatActivity {

    private int currentApiVersion;
    private ProgressBar progressBar;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_intro);

        getSupportActionBar().hide();  // hide action bar only for this activity

       // progressBar = (ProgressBar) findViewById(R.id.progressBarId);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                nextActivity();
                finish();
            }
        });

        thread.start();

    }

    public void doWork(){
        for(progress = 1; progress<=100; progress+=1)
        {
            try {
                Thread.sleep(10);
               // progressBar.setProgress(progress);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

    public void nextActivity()
    {
        Intent intent = new Intent(Intro.this, MainActivity.class);
        startActivity(intent);
    }
}