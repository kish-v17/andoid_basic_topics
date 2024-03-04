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

        b.send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_SEND);

                i.putExtra(Intent.EXTRA_EMAIL,new String[]{b.email.getText().toString()});
                i.putExtra(Intent.EXTRA_SUBJECT,b.sub.getText().toString());
                i.putExtra(Intent.EXTRA_TEXT,b.txt.getText().toString());

                i.setType("Message/rfc822");
                startActivity(Intent.createChooser(i,"Hello"));
            }
        });
    }
}