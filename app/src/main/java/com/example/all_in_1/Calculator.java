package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.all_in_1.databinding.ActivityCalculatorBinding;

public class Calculator extends AppCompatActivity {
    ActivityCalculatorBinding bind3;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind3=ActivityCalculatorBinding.inflate(getLayoutInflater());
        setContentView(bind3.getRoot());

        bind3.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(bind3.val1.getText().toString());
                int b=Integer.parseInt(bind3.val2.getText().toString());
                Toast.makeText(getApplicationContext(),"Addition:"+(a+b),Toast.LENGTH_LONG).show();
            }
        });

        bind3.sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(bind3.val1.getText().toString());
                int b=Integer.parseInt(bind3.val2.getText().toString());
                Toast.makeText(getApplicationContext(),"Subtraction:"+(a-b),Toast.LENGTH_LONG).show();
            }
        });

        bind3.mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(bind3.val1.getText().toString());
                int b=Integer.parseInt(bind3.val2.getText().toString());
                Toast.makeText(getApplicationContext(),"Multiplication:"+(a*b),Toast.LENGTH_LONG).show();
            }
        });

        bind3.div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(bind3.val1.getText().toString());
                int b=Integer.parseInt(bind3.val2.getText().toString());
                Toast.makeText(getApplicationContext(),"Division:"+(a/b),Toast.LENGTH_LONG).show();
            }
        });
    }
}