package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.all_in_1.databinding.ActivityMainBinding;
import com.example.all_in_1.databinding.ActivityViewBindBinding;

public class ViewBind extends AppCompatActivity {
    ActivityViewBindBinding bind1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind1=ActivityViewBindBinding.inflate(getLayoutInflater());
        setContentView(bind1.getRoot());

        bind1.nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unm=bind1.nm.getText().toString();
                String eml=bind1.eml.getText().toString();
                String pwd=bind1.pwd.getText().toString();
                Intent i=new Intent(getApplicationContext(), calc_red.class);
                i.putExtra("nm",unm);
                i.putExtra("eml",eml);
                i.putExtra("pwd",pwd);
                startActivity(i);
            }
        });


    }
}