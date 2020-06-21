package com.example.defeatcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class OthersService extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] webportals, websites, contacts;
    private Spinner spinner1 , spinner2, spinner3;
    private int check = 0;
    private Button button, button2, button3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others_service);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        setTitle("তথ্য সেবা");

         webportals = getResources().getStringArray(R.array.webportals);
         websites = getResources().getStringArray(R.array.websites);
         contacts = getResources().getStringArray(R.array.important_contacts);

         spinner1 = (Spinner) findViewById(R.id.spinner1Id);
         spinner2 = (Spinner) findViewById(R.id.spinner2Id);
         spinner3 = (Spinner) findViewById(R.id.spinner3Id);

         button = (Button) findViewById(R.id.ButtonId);
         button2 = (Button) findViewById(R.id.ButtonId2);
         button3 = (Button) findViewById(R.id.ButtonId3);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(OthersService.this, R.layout.spinner, webportals ){
            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }

            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView web = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    web.setTextColor(Color.WHITE);
                }
                else {
                    web.setTextColor(Color.BLACK);
                }
                return view;
            }
        };


        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(OthersService.this, R.layout.spinner, websites ){
            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }

            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView web = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    web.setTextColor(Color.WHITE);
                }
                else {
                    web.setTextColor(Color.BLACK);
                }
                return view;
            }
        };


        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(OthersService.this, R.layout.spinner, contacts ){
            public boolean isEnabled(int position){
                if(position == 0)
                {
                    // Disable the first item from Spinner
                    // First item will be use for hint
                    return false;
                }
                else
                {
                    return true;
                }
            }

            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView web = (TextView) view;
                if(position == 0){
                    // Set the hint text color gray
                    web.setTextColor(Color.WHITE);
                }
                else {
                    web.setTextColor(Color.BLACK);
                }
                return view;
            }
        };


        spinner1.setAdapter(adapter1);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);

        spinner1.setSelection(0,false);
        spinner2.setSelection(0,false);

        spinner1.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = 20;
                Intent intent = new Intent(OthersService.this, WebPortals.class);
                intent.putExtra("news portal", x);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OthersService.this, MythBuster.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OthersService.this, corona_recure.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if(parent.getId()==R.id.spinner1Id)
        {
            Intent intent = new Intent(OthersService.this, WebPortals.class);
            intent.putExtra("news portal", position);
            startActivity(intent);
        }
        if(parent.getId()==R.id.spinner2Id)
        {
            Intent intent = new Intent(OthersService.this, WebPortals.class);
            intent.putExtra("news portal", (position+20));
            startActivity(intent);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()== android.R.id.home)
        {
            Intent intent = new Intent(OthersService.this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}