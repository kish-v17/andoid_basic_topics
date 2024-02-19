package com.example.all_in_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<view_holder> {
    Context c;
    List<item_model> itemList;

    public adapter(Context c, List<item_model> itemList) {
        this.c = c;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new view_holder(LayoutInflater.from(c).inflate(R.layout.rv,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder holder, int i) {
        holder.name.setText(itemList.get(i).getName());
        holder.email.setText(itemList.get(i).getMail());
        holder.i.setImageResource(itemList.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
