package com.example.defeatcovid;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class corona_recure extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_recure);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("করোনা জয়ের গল্প !");
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()== android.R.id.home)
        {
            Intent intent = new Intent(corona_recure.this, OthersService.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
