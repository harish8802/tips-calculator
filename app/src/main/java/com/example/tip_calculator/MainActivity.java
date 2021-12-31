package com.example.tip_calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText amt = findViewById(R.id.bill_amt);
        final EditText tip = findViewById(R.id.bill_per);
        final TextView result = findViewById(R.id.res);

        Button calc = findViewById(R.id.button1);
        calc.setOnClickListener(v -> {
            // TODO Auto-generated method stub
            double amount = Double.parseDouble(amt.toString());
            double tip_per = Double.parseDouble(tip.toString());
            double tip_cal = (amount * tip_per) / 100;
            result.setText("Result : " + tip_cal);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.example_menu, menu);
        return true;
    }

}