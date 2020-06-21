package com.example.defeatcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProfilePage extends AppCompatActivity implements View.OnClickListener {

    private Button homeButton, editInfo;
    private EditText yourName, fathersName, mothersName, nationality, gender;
    private EditText birthDate, meritalStatus, nid, presentAdress, permanentAdress;
    private TextView profileView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        setTitle("Profile");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        profileView = (TextView) findViewById(R.id.profileViewId);
        homeButton = (Button) findViewById(R.id.home);
        editInfo = (Button) findViewById(R.id.editInfo);

        homeButton.setOnClickListener(this);
        editInfo.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();
        String value = bundle.getString("result");
        profileView.setText(value);

        /*StringBuilder s = new StringBuilder();
        String ss = "";

        if(bundle != null){

            String value = bundle.getString("page1info");
            s.append(value);

            value = bundle.getString("birthDate");
            s.append("Birth date : "+value+"\n\n");

            value = bundle.getString("meritalStatus");
            s.append("Merital status : "+value+"\n\n");

            value = bundle.getString("nid");
            s.append("NID no : "+value+"\n\n");

            value = bundle.getString("presentAdress");
            s.append("Present adress : "+value+"\n\n");

            value = bundle.getString("permanentAdress");
            s.append("Permanent adress : "+value+"\n\n");

            ss = s.toString();
        }

        if(!ss.equals(""))
        {
            SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("userInfoKey", ss);
            editor.commit();
        }

        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        if(sp.contains("userInfoKey"))
        {
            String value = sp.getString("userInfoKey", "Data not found");
            profileView.setText(value);
        }*/




    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.home)
        {
            Intent intent = new Intent(ProfilePage.this, MainActivity.class);
            startActivity(intent);
        }

        if(v.getId()==R.id.editInfo)
        {
            Intent intent = new Intent(ProfilePage.this, InfoPage1.class);
            startActivity(intent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()== android.R.id.home)
        {
            Intent intent = new Intent(ProfilePage.this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}