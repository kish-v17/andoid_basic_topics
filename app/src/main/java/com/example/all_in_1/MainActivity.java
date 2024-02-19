package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button bg,calc,vb,actv,lv,sp,ab,toggle,alert,rv;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg=findViewById(R.id.bg);
        calc=findViewById(R.id.calc);
        vb=findViewById(R.id.vb);
        actv=findViewById(R.id.actv);
        lv=findViewById(R.id.lv);
        sp=findViewById(R.id.sp);
        ab=findViewById(R.id.ab);
        toggle=findViewById(R.id.toggle);
        alert=findViewById(R.id.alert);
        rv=findViewById(R.id.rv);

        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(), bgChange.class);
                startActivity(i);
            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(), Calculator.class);
                startActivity(i);
            }
        });
        vb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(),ViewBind.class);
                startActivity(i);
            }
        });
        actv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(), AutoCompleteTextview1.class);
                startActivity(i);
            }
        });
        lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(),ListviewDemo.class);
                startActivity(i);
            }
        });
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(), shared_preference.class);
                startActivity(i);
            }
        });
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(), actionBar.class);
                startActivity(i);
            }
        });
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(), ToggleButton.class);
                startActivity(i);
            }
        });
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(), Alert.class);
                startActivity(i);
            }
        });
        rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(getApplicationContext(), Recycler_view.class);
                startActivity(i);
            }
        });
    }
}