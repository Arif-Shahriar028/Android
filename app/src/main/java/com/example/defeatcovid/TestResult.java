package com.example.defeatcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class TestResult extends AppCompatActivity {

    private TextView heading, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("ফলাফল");

        heading = (TextView) findViewById(R.id.headingId);
        description = (TextView) findViewById(R.id.descriptionId);

        Bundle bundle = getIntent().getExtras();
        String headline = bundle.getString("head");
        String body = bundle.getString("body");

        heading.setText(headline);
        description.setText(body);

    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()== android.R.id.home)
        {
            Intent intent = new Intent(TestResult.this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

   /* public void onBackPressed(){

        Intent intent = new Intent(TestResult.this,HealthCheck.class);
        startActivity(intent);

    }*/
}