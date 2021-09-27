package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFunc(View view) {
        Log.i("Info","Button pressed");
        EditText enterNum1 = (EditText) findViewById(R.id.enterNum1);
        EditText enterNum2 = (EditText) findViewById(R.id.enterNum2);
        double num1 = Double.parseDouble(enterNum1.getText().toString());
        double num2 = Double.parseDouble(enterNum2.getText().toString());

        goToActivity2(num1+num2);
    }

    public void subtractFunc(View view) {
        Log.i("Info","Button pressed");
        EditText enterNum1 = (EditText) findViewById(R.id.enterNum1);
        EditText enterNum2 = (EditText) findViewById(R.id.enterNum2);
        double num1 = Double.parseDouble(enterNum1.getText().toString());
        double num2 = Double.parseDouble(enterNum2.getText().toString());

        goToActivity2(num1-num2);
    }

    public void multiplyFunc(View view) {
        Log.i("Info","Button pressed");
        EditText enterNum1 = (EditText) findViewById(R.id.enterNum1);
        EditText enterNum2 = (EditText) findViewById(R.id.enterNum2);
        double num1 = Double.parseDouble(enterNum1.getText().toString());
        double num2 = Double.parseDouble(enterNum2.getText().toString());

        goToActivity2(num1*num2);
    }

    public void divideFunc(View view) {
        Log.i("Info","Button pressed");
        EditText enterNum1 = (EditText) findViewById(R.id.enterNum1);
        EditText enterNum2 = (EditText) findViewById(R.id.enterNum2);
        double num1 = Double.parseDouble(enterNum1.getText().toString());
        double num2 = Double.parseDouble(enterNum2.getText().toString());

        goToActivity2(num1/num2);
    }

    public void goToActivity2(double num) {
        Double number = new Double(num);
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", number.toString());
        startActivity(intent);
    }
}