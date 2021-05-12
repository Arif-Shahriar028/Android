package com.example.defeatcovid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView button1, button2, button3, button4;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("   মূল পাতা");
        /// to set logo on top bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.main2);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        button1 = (CardView) findViewById(R.id.buttonId1);
        button2 = (CardView) findViewById(R.id.buttonId2);
        button3 = (CardView) findViewById(R.id.buttonId3);
        button4 = (CardView) findViewById(R.id.buttonId4);
        //textView = (TextView) findViewById(R.id.marqueryText);
        //textView.setSelected(true);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.buttonId1)
        {
            Intent intent = new Intent(MainActivity.this, HealthCheck.class);
            startActivity(intent);
        }

        if(v.getId()== R.id.buttonId2)
        {
            Intent intent = new Intent(MainActivity.this, HealthAwareness.class);
            startActivity(intent);
        }
        if(v.getId()== R.id.buttonId3)
        {
            Intent intent = new Intent(MainActivity.this, CoronaMap.class);
            startActivity(intent);
        }
        if(v.getId()== R.id.buttonId4)
        {
            Intent intent = new Intent(MainActivity.this, OthersService.class);
            startActivity(intent);
        }

    }

    public void onBackPressed(){
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        /*if(item.getItemId()== R.id.logoutId)
        {
            Toast.makeText(MainActivity.this, "Logging out system is in under development ", Toast.LENGTH_SHORT).show();
        }*/

        if(item.getItemId()== R.id.feedbackId)
        {
            Intent intent = new Intent(MainActivity.this, FeedbackActivity.class);
            startActivity(intent);
        }

        if(item.getItemId()== R.id.aboutId)
        {
            Intent intent = new Intent(MainActivity.this, About.class);
            startActivity(intent);
        }

        if(item.getItemId()== R.id.shareId)
        {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject = "DefeatCovid app";
            String body = "Hello! \nDefeatCovid app is here for you ! \nYou can get regular corona updates and health services through this app." +
                    "\nHere is the drive link of the app :\nhttps://drive.google.com/drive/folders/1KNsIoJgwY3mBTtnhFSRoYUXO7tNVjNKd?usp=sharing";

            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, body);

            startActivity(Intent.createChooser(intent, "Share with"));

        }

        return super.onOptionsItemSelected(item);
    }

}