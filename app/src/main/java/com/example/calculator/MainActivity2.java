package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewNum = (TextView) findViewById(R.id.textViewNum);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textViewNum.setText(str);
    }
}