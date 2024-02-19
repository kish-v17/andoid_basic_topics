package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class shared_preference extends AppCompatActivity {
    EditText eml,pwd;
    Button sub;
    SharedPreferences sp;
    SharedPreferences.Editor e;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        eml=findViewById(R.id.eml);
        pwd=findViewById(R.id.pwd);
        sub=findViewById(R.id.reg);
        sp=getSharedPreferences("DB",MODE_PRIVATE);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=eml.getText().toString();
                String pass = pwd.getText().toString();

                e=sp.edit();
                e.putString("Email",email);
                e.putString("Pass",pass);
                e.apply();

                startActivity(new Intent(getApplicationContext(), loginSP.class));
                finish();
            }
        });








    }
}