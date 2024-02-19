package com.example.all_in_1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class view_holder extends RecyclerView.ViewHolder{
    ImageView i;
    TextView name,email;


    public view_holder(@NonNull View itemView) {
        super(itemView);
        i=itemView.findViewById(R.id.pp);
        name=itemView.findViewById(R.id.name);
        email=itemView.findViewById(R.id.eml);
    }
}
