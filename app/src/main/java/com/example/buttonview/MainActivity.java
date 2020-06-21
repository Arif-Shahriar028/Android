package com.example.buttonview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginButton, clearButton;
    private TextView textView;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.buttonId);
        textView = (TextView) findViewById(R.id.textId);
        clearButton = (Button) findViewById(R.id.clearId);

        Handler handler = new Handler();

        loginButton.setOnClickListener(handler);
        clearButton.setOnClickListener(handler);



    }

    class Handler implements View.OnClickListener {

        Toast toast1 = Toast.makeText(MainActivity.this, "Login button is clicked", Toast.LENGTH_SHORT);
        Toast toast2 = Toast.makeText(MainActivity.this, "Clear button is clicked", Toast.LENGTH_SHORT);

        @Override
        public void onClick(View v) {

            if (v.getId() == R.id.buttonId) {
                count++;
                textView.setText("Login button is clicked " + count + " times");
                toast2.cancel();
                toast1.show();
            } else {
                count = 0;
                textView.setText("Login count is set to 0");
                toast1.cancel();
                toast2.show();
            }
        }
    }
}
