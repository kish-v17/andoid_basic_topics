package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginSP extends AppCompatActivity {
    EditText eml,pwd;
    Button login;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sp);

        eml=findViewById(R.id.eml);
        pwd=findViewById(R.id.pwd);
        login=findViewById(R.id.login);

        sp=getSharedPreferences("DB",MODE_PRIVATE);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String logEml=eml.getText().toString();
                String logPwd=pwd.getText().toString();

                String spEml=sp.getString("Email","");
                String spPwd=sp.getString("Pass","");

                if(logEml.equals(spEml) && logPwd.equals(spPwd)){
                    startActivity(new Intent(getApplicationContext(), calc_red.class));
                }else{
                    Toast.makeText(getApplicationContext(), "Invalid Credential", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}