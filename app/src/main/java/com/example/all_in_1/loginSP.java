package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class loginSP extends AppCompatActivity {
    EditText eml,pwd;
    Button sub;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sp);

        eml=findViewById(R.id.eml);
        pwd=findViewById(R.id.pwd);

    }
}