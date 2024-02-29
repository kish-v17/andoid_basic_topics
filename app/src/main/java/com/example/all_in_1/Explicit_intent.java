package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.all_in_1.databinding.ActivityExplicitIntentBinding;

public class Explicit_intent extends AppCompatActivity {
    ActivityExplicitIntentBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b=ActivityExplicitIntentBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        b.phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_DIAL);

                i.setData(Uri.parse("tel:"+b.ed.getText().toString()));
                startActivity(i);
            }
        });
    }
}