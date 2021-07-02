package com.example.myapplication.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class recipieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView title, release_date, duration;
    ImageView imageView;
    RatingBar ratingBar;

    // Click Listener
    onrecipielistener onMovieListener;




    public recipieViewHolder(@NonNull View itemView, onrecipielistener onMovieListener) {
        super(itemView);


        this.onMovieListener = onMovieListener;


        imageView = itemView.findViewById(R.id.movie_img);
        ratingBar = itemView.findViewById(R.id.rating_bar);

        itemView.setOnClickListener(this);

    }





    @Override
    public void onClick(View view) { onrecipielistener.onrecipieclick(getAdapterPosition());

    }
}
