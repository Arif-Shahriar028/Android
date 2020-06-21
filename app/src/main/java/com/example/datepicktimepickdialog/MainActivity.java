package com.example.datepicktimepickdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView birthdate, timeshow ;
    private Button check, timeCheck, exitButton;
    private DatePickerDialog datePickerDialog;
    private TimePicker timePicker;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        birthdate =(TextView) findViewById(R.id.birthDateShow);
        timeshow =(TextView) findViewById(R.id.timeShow);
        check =(Button) findViewById(R.id.birthdateCheck);
        timeCheck =(Button) findViewById(R.id.timeCheck);
        exitButton =(Button) findViewById(R.id.exitButtonId);
        timePicker = (TimePicker) findViewById(R.id.timePickerId);

        timePicker.setIs24HourView(true);

        check.setOnClickListener(this);
        timeCheck.setOnClickListener(this);
        exitButton.setOnClickListener(this);
        birthdate.setText("Your Birthdate : ");
        timeshow.setText("Now time : ");

    }

    public void onClick(View v)
    {
        if(v.getId()==R.id.birthdateCheck)
        {
            DatePicker datePicker = new DatePicker(this);
            int curday = datePicker.getDayOfMonth();
            int curmonth = datePicker.getMonth()+1;
            int curyear = datePicker.getYear();


            datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    birthdate.setText("Your Birthdate : "+dayOfMonth+"/"+(month+1)+"/"+year);
                }
            }, curyear, curmonth, curday);

            datePickerDialog.show();
        }

        if(v.getId()==R.id.timeCheck)
        {
            String hour = timePicker.getCurrentHour().toString();
            String minit = timePicker.getCurrentMinute().toString();

            if(timePicker.getCurrentHour()<10)
                hour = "0"+hour;
            if(timePicker.getCurrentMinute()<10)
                minit = "0"+ minit;
            StringBuilder time = new StringBuilder();
            time.append("Now time : "+hour+":"+minit);
            timeshow.setText(time);
        }

       if(v.getId()==R.id.exitButtonId)
        {
            alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setTitle(R.string.title);
            alertDialogBuilder.setMessage(R.string.message);
           // alertDialogBuilder.setIcon(R.drawable.quit);
            alertDialogBuilder.setCancelable(false);

            alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(MainActivity.this, "Cancelled", Toast.LENGTH_SHORT).show();
                }
            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

    }
}