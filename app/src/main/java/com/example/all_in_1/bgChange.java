package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class bgChange extends AppCompatActivity {
    LinearLayout l1;
    RadioButton r;
    RadioGroup rgb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg_change);
        rgb=findViewById(R.id.rgb);
        l1=findViewById(R.id.l1);

        rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                r=findViewById(i);
                String col=r.getText().toString();
                if(col.equals("GRAY")){
                    l1.setBackgroundColor(Color.GRAY);
                }else{
                    l1.setBackgroundColor(Color.GREEN);
                }
            }
        });

    }
}