package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.all_in_1.databinding.ActivityListviewDemoBinding;
import com.example.all_in_1.databinding.ActivityViewBindBinding;

public class ListviewDemo extends AppCompatActivity {
    ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_demo);
        lv1=findViewById(R.id.lv1);
        String[] ary=getResources().getStringArray(R.array.OP);
        ArrayAdapter a11=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,ary);
        lv1.setAdapter(a11);
    }
}