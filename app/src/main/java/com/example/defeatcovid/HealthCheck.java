package com.example.defeatcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.Serializable;

public class HealthCheck extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup _1radioGroup, _2radioGroup, _3radioGroup, _6radioGroup, _8radioGroup, _9radioGroup;
    private RadioButton _1a, _1b, _1c, _1d, _1e, _1f;
    private RadioButton _2a, _2b, _2c;
    private RadioButton _3a, _3b, _3c, _3d;
    private RadioButton _6a, _6b, _6c, _6d, _6e;
    private RadioButton _8a, _8b;
    private RadioButton _9a, _9b;
    int x =0, a=0, b=0, c=0, buttonColor = 0;

    private RadioButton _1q, _2q, _3q, _6q, _8q, _9q;

    private CheckBox _4a, _4b, _4c, _4d, _4e, _4f;
    private CheckBox _5a, _5b, _5c, _5d, _5e, _5f, _5g, _5h, _5i;
    private CheckBox _7a, _7b, _7c, _7d, _7e, _7f, _7g;

    private Button submitButton;

    private int sum = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_check);

        setTitle("স্বাস্থ্য পরীক্ষা ");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        _1radioGroup = (RadioGroup) findViewById(R.id._1radioGroupId);
        _2radioGroup = (RadioGroup) findViewById(R.id._2radioGroupId);
        _3radioGroup = (RadioGroup) findViewById(R.id._3radioGroupId);
        _6radioGroup = (RadioGroup) findViewById(R.id._6radioGroupId);
        _8radioGroup = (RadioGroup) findViewById(R.id._8radioGroupId);
        _9radioGroup = (RadioGroup) findViewById(R.id._9radioGroupId);


        _1a = (RadioButton) findViewById(R.id._1a);
        _1b = (RadioButton) findViewById(R.id._1b);
        _1c = (RadioButton) findViewById(R.id._1c);
        _1d = (RadioButton) findViewById(R.id._1d);
        _1e = (RadioButton) findViewById(R.id._1e);
        _1f = (RadioButton) findViewById(R.id._1f);

        _2a = (RadioButton) findViewById(R.id._2a);
        _2b = (RadioButton) findViewById(R.id._2b);
        _2c = (RadioButton) findViewById(R.id._2c);

        _3a = (RadioButton) findViewById(R.id._3a);
        _3b = (RadioButton) findViewById(R.id._3b);
        _3c = (RadioButton) findViewById(R.id._3c);
        _3d = (RadioButton) findViewById(R.id._3d);

        _4a = (CheckBox) findViewById(R.id._4a);
        _4b = (CheckBox) findViewById(R.id._4b);
        _4c = (CheckBox) findViewById(R.id._4c);
        _4d = (CheckBox) findViewById(R.id._4d);
        _4e = (CheckBox) findViewById(R.id._4e);
        _4f = (CheckBox) findViewById(R.id._4f);

        _5a = (CheckBox) findViewById(R.id._5a);
        _5b = (CheckBox) findViewById(R.id._5b);
        _5c = (CheckBox) findViewById(R.id._5c);
        _5d = (CheckBox) findViewById(R.id._5d);
        _5e = (CheckBox) findViewById(R.id._5e);
        _5f = (CheckBox) findViewById(R.id._5f);
        _5g = (CheckBox) findViewById(R.id._5g);
        _5h = (CheckBox) findViewById(R.id._5h);
        _5i = (CheckBox) findViewById(R.id._5i);

        _6a = (RadioButton) findViewById(R.id._6a);
        _6b = (RadioButton) findViewById(R.id._6b);
        _6c = (RadioButton) findViewById(R.id._6c);
        _6d = (RadioButton) findViewById(R.id._6d);
        _6e = (RadioButton) findViewById(R.id._6e);

        _7a = (CheckBox) findViewById(R.id._7a);
        _7b = (CheckBox) findViewById(R.id._7b);
        _7c = (CheckBox) findViewById(R.id._7c);
        _7d = (CheckBox) findViewById(R.id._7d);
        _7e = (CheckBox) findViewById(R.id._7e);
        _7f = (CheckBox) findViewById(R.id._7f);
        _7g = (CheckBox) findViewById(R.id._7g);

        _8a = (RadioButton) findViewById(R.id._8a);
        _8b = (RadioButton) findViewById(R.id._8b);

        _9a = (RadioButton) findViewById(R.id._9a);
        _9b = (RadioButton) findViewById(R.id._9b);

        submitButton = (Button) findViewById(R.id.submitButtonId);

        submitButton.setOnClickListener(this);

      /*  submitButton.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    // reset the background color here
                    submitButton.setBackgroundColor(Color.LTGRAY);

                }else{
                    // Change the background color here
                    //submitButton.setBackgroundColor(Color.RED);

                }
                return false;
            }
        });*/

    }

    @Override
    public void onClick(View v) {


        sum = 0;
        int _1id = _1radioGroup.getCheckedRadioButtonId();
        int _2id = _2radioGroup.getCheckedRadioButtonId();
        int _3id = _3radioGroup.getCheckedRadioButtonId();
        int _6id = _6radioGroup.getCheckedRadioButtonId();
        int _8id = _8radioGroup.getCheckedRadioButtonId();
        int _9id = _9radioGroup.getCheckedRadioButtonId();

        if(_1id == R.id._1a)
        {sum += 1; x ++;}
        if(_1id == R.id._1b)
        {sum += 1; x ++;}
        if(_1id == R.id._1c)
        {   sum += 1; x ++;}
        if(_1id == R.id._1d)
        { sum += 1; x++;}
        if(_1id == R.id._1e)
        {   sum += 1; x++;}
        if(_1id == R.id._1f)
        { sum += 2; x++;}

        if(_2id == R.id._2a)
        {   sum += 1; x++;}
        if(_2id == R.id._2b)
        {sum += 1; x++;}
        if(_2id == R.id._2c)
        {    sum += 1; x++;}

        if(_3id == R.id._3a)
        {sum += 0; x++;}
        if(_3id == R.id._3b)
        {   sum += 2; x++;}
        if(_3id == R.id._3c)
        { sum += 3; x++;}
        if(_3id == R.id._3d)
        {   sum += 1; x++;}

        if(_6id == R.id._6a)
        {sum += 0; x++;}
        if(_6id == R.id._6b)
        {   sum += 2; x++;}
        if(_6id == R.id._6c)
        { sum += 2; x++;}
        if(_6id == R.id._6d)
        {   sum += 3; x++;}
        if(_6id == R.id._6e)
        { sum += 4; x++;}

        if(_8id == R.id._8a)
        {   sum += 3; x++;}
        if(_8id == R.id._8b)
        { sum += 0; x++;}

        if(_9id == R.id._9a)
        {   sum += 3; x++;}
        if(_9id == R.id._9b)
        {sum += 0; x++;}

        if(_4a.isChecked())
        {   sum += 4; a = 1;}
        if(_4b.isChecked())
        {  sum += 3; a = 1;}
        if(_4c.isChecked())
        {   sum += 2; a = 1;}
        if(_4d.isChecked())
        {sum += 2; a = 1;}
        if(_4e.isChecked())
        {   sum += 3; a = 1;}
        if(_4f.isChecked())
        { sum += 0; a = 1;}

        if(_5a.isChecked())
        {   sum += 1; b = 1;}
        if(_5b.isChecked())
        {   sum += 3; b = 1;}
        if(_5c.isChecked())
        {   sum += 1; b = 1;}
        if(_5d.isChecked())
        {sum += 3; b = 1;}
        if(_5e.isChecked())
        {   sum += 3; b = 1;}
        if(_5f.isChecked())
        {   sum += 2; b = 1;}
        if(_5g.isChecked())
        {   sum += 2; b = 1;}
        if(_5h.isChecked())
        { sum += 1; b = 1;}
        if(_5i.isChecked())
        {   sum += 0; b = 1;}

        if(_7a.isChecked())
        {sum += 3; c = 1;}
        if(_7b.isChecked())
        {   sum += 1; c = 1;}
        if(_7c.isChecked())
        { sum += 2; c = 1;}
        if(_7d.isChecked())
        {   sum += 2; c = 1;}
        if(_7e.isChecked())
        { sum += 2; c = 1;}
        if(_7f.isChecked())
        {   sum += 2; c = 1;}
        if(_7g.isChecked())
        {  sum += 0; c = 1;}


        String head = null;
        String body = null;

        if(sum<=10)
        {
            head = getString(R.string.heading1);
            body = getString(R.string.description1);
        }
        else if(sum>10 && sum<=15)
        {
            head = getString(R.string.heading2);
            body = getString(R.string.description2);
        }
        else if(sum>15 && sum<=23)
        {
            head = getString(R.string.heading3);
            body = getString(R.string.description3);
        }
        else if(sum>23 && sum<=30)
        {
            head = getString(R.string.heading4);
            body = getString(R.string.description4);
        }
        else if(sum>30)
        {
            head = getString(R.string.heading5);
            body = getString(R.string.description5);
        }


        if((x+a+b+c)>=9)
        {
            Intent intent = new Intent(HealthCheck.this, TestResult.class);
            intent.putExtra("head",(Serializable) head);
            intent.putExtra("body", (Serializable) body);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(HealthCheck.this, "You didn't fill all section", Toast.LENGTH_SHORT).show();
            a = 0;
            b = 0;
            c = 0;
            x = 0;
        }
    }


    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()== android.R.id.home)
        {
            Intent intent = new Intent(HealthCheck.this, MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}