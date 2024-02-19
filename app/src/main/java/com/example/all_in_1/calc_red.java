package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.all_in_1.databinding.ActivityCalcRedBinding;

public class calc_red extends AppCompatActivity {
    ActivityCalcRedBinding bind2;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind2=ActivityCalcRedBinding.inflate(getLayoutInflater());
        setContentView(bind2.getRoot());

        sp=getSharedPreferences("DB",MODE_PRIVATE);
        String eml=sp.getString("Email","");
        String pass=sp.getString("Pass","");
        bind2.show.setText("Email :"+eml+"\nPassword :"+pass);
    }
}