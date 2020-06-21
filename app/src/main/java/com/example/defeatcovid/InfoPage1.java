package com.example.defeatcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class InfoPage1 extends AppCompatActivity implements View.OnClickListener {

    private Button nextButton;
    private EditText yourName, fathersName, mothersName, nationality, gender;
    private TextView profileView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page1);

        setTitle("InfoPage1");

        getSupportActionBar().hide();

        nextButton = (Button) findViewById(R.id.nextButtonId);
        yourName =(EditText) findViewById(R.id.yourNameId);
        fathersName =(EditText) findViewById(R.id.fathersNameId);
        mothersName =(EditText) findViewById(R.id.mothersNameId);
        nationality =(EditText) findViewById(R.id.nationalityId);
        gender =(EditText) findViewById(R.id.genderId);

        nextButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.nextButtonId)
        {
            Intent intent = new Intent(InfoPage1.this, InfoPage2.class);
            StringBuilder s = new StringBuilder();

            String value = yourName.getText().toString();
            s.append("Your name : "+value+"\n\n");

            value = fathersName.getText().toString();
            s.append("Fathers name : "+value+"\n\n");

            value = mothersName.getText().toString();
            s.append("Mothers name : "+value+"\n\n");

            value = nationality.getText().toString();
            s.append("Nationality : "+value+"\n\n");

            value = gender.getText().toString();
            s.append("Gender : "+value+"\n\n");

            intent.putExtra("page1Info",(Serializable) s);

            startActivity(intent);
        }

    }
}