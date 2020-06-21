package com.example.defeatcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class InfoPage2 extends AppCompatActivity {

    private Button submitButton;

    private EditText birthDate, meritalStatus, nid, presentAdress, permanentAdress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page2);

        getSupportActionBar().hide();
        this.setTitle("InfoPage2");

        submitButton = (Button) findViewById(R.id.submitButtonId);

        birthDate =(EditText) findViewById(R.id.birthDateId);
        meritalStatus =(EditText) findViewById(R.id.meritalStatusId);
        nid =(EditText) findViewById(R.id.nidNoId);
        presentAdress =(EditText) findViewById(R.id.presentAdressId);
        permanentAdress =(EditText) findViewById(R.id.permanentAdressId);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoPage2.this, ProfilePage.class);
                Bundle bundle = getIntent().getExtras();

                String s;
                s = bundle.getString("page1Info");

                intent.putExtra("page1info",(Serializable) s);
                intent.putExtra("birthDate", birthDate.getText().toString());
                intent.putExtra("meritalStatus", meritalStatus.getText().toString());
                intent.putExtra("nid", nid.getText().toString());
                intent.putExtra("presentAdress", presentAdress.getText().toString());
                intent.putExtra("permanentAdress", permanentAdress.getText().toString());

                startActivity(intent);
            }
        });
    }
}