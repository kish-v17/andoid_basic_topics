package com.example.all_in_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recycler_view extends AppCompatActivity {
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        rv = findViewById(R.id.rv);
        List<item_model> item = new ArrayList<>();

        item.add(new item_model("Kishan", "kish.v07@gmail.com", R.drawable.person));
        item.add(new item_model("Kishan", "kish.v07@gmail.com", R.drawable.person));
        item.add(new item_model("Kishan", "kish.v07@gmail.com", R.drawable.person));
        item.add(new item_model("Kishan", "kish.v07@gmail.com", R.drawable.person));
        item.add(new item_model("Kishan", "kish.v07@gmail.com", R.drawable.person));
        item.add(new item_model("Kishan", "kish.v07@gmail.com", R.drawable.person));
        item.add(new item_model("Kishan", "kish.v07@gmail.com", R.drawable.person));
        item.add(new item_model("Kishan", "kish.v07@gmail.com", R.drawable.person));
        item.add(new item_model("Kishan", "kish.v07@gmail.com", R.drawable.person));
        item.add(new item_model("Kishan", "kish.v07@gmail.com", R.drawable.person));
        item.add(new item_model("Kishan", "kish.v07@gmail.com", R.drawable.person));

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new adapter(getApplicationContext(),item));
    }
}