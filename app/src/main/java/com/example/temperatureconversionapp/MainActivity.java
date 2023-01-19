package com.example.temperatureconversionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editF;
    EditText editC;
    Button buttonF;
    Button buttonC;
    TextView viewF;
    TextView viewC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editF = findViewById(R.id.editF);
        editC = findViewById(R.id.editC);
        buttonF = findViewById(R.id.buttonF);
        buttonC = findViewById(R.id.buttonC);
        viewF = findViewById(R.id.viewF);
        viewC = findViewById(R.id.viewC);

        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = editF.getText().toString();
                double x = Double.parseDouble(s);
                viewF.setText("Celsius: " + ((x - 32.0) * 5.0 / 9.0));

            }

        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String t = editC.getText().toString();
                double y = Double.parseDouble(t);
                viewC.setText("Fahrenheit: " + ((y * 9.0 / 5.0) + 32.0));


            }



        });

    }
}