package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.example.all_in_1.databinding.ActivityAutoCompleteTextviewBinding;

import java.util.Collections;

public class AutoCompleteTextview1 extends AppCompatActivity {
    ActivityAutoCompleteTextviewBinding a1;
    int value1,value2;
    String operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        a1=ActivityAutoCompleteTextviewBinding.inflate(getLayoutInflater());
        setContentView(a1.getRoot());
        Integer[] ary1 = {1000,1001,1002,1003,1004,1005};
        Integer[] ary2 = {1006,1007,1008,1009,1010,1011};

        String[] op = getResources().getStringArray(R.array.OP);

        ArrayAdapter<String> c=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,op);
        a1.opr.setAdapter(c);

        ArrayAdapter<Integer> a=new ArrayAdapter<Integer>(getApplicationContext(),android.R.layout.simple_list_item_1,ary1);
        a1.actv.setAdapter(a);

        ArrayAdapter<Integer> b=new ArrayAdapter<Integer>(getApplicationContext(), android.R.layout.simple_list_item_1,ary2);
        a1.spin.setAdapter(b);

        a1.actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                value1= a.getItem(position);
            }
        });

        a1.opr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(AutoCompleteTextview1.this, "Operation:"+c.getItem(position), Toast.LENGTH_SHORT).show();
                operation=c.getItem(position);
                if(operation.equals("Addition")){
                    a1.add.setText("Addition");
                }
                if(operation.equals("Subtraction")){
                    a1.add.setText("Subtraction");
                }
                if(operation.equals("Multiplication")){
                    a1.add.setText("Multiplication");
                }
                if(operation.equals("Division")){
                    a1.add.setText("Division");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        a1.spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                value2 = b.getItem(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        a1.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Addition:"+(value1+value2), Toast.LENGTH_SHORT).show();
                    if(a1.add.getText().toString().equals("Addition")){
                        Toast.makeText(getApplicationContext(), "Addition:"+(value2+value1), Toast.LENGTH_SHORT).show();
                    }
                    if(a1.add.getText().toString().equals("Subtraction")){
                        Toast.makeText(getApplicationContext(), "Subtraction:"+(value2-value1), Toast.LENGTH_SHORT).show();
                    }
                    if(a1.add.getText().toString().equals("Multiplication")){
                        Toast.makeText(getApplicationContext(), "Subtraction:"+(value2*value1), Toast.LENGTH_SHORT).show();
                    }
                    if(a1.add.getText().toString().equals("Division")){
                        Toast.makeText(getApplicationContext(), "Subtraction:"+(value2/value1), Toast.LENGTH_SHORT).show();
                    }

            }
        });
    }
}