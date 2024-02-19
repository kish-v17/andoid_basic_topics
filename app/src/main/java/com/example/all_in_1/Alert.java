package com.example.all_in_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alert extends AppCompatActivity {

    Button exit;
    AlertDialog.Builder b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        exit=findViewById(R.id.exit);
        b=new AlertDialog.Builder(this);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b.setTitle("Alert!");
                b.setMessage("Do you really want to exit?").setCancelable(true).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).show();
            }
        });

    }
}