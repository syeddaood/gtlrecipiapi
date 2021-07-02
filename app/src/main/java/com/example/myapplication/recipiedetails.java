package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.recipiemodel.recipie;

public class recipiedetails {

    private ImageView imageViewDetails;
    private TextView titleDetails, descDetails;
    private RatingBar ratingBarDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipie_list_item);


        imageViewDetails = findViewById(R.id.imageView_details);
        titleDetails = findViewById(R.id.textView_title_details);
        descDetails = findViewById(R.id.textView_desc_details);
        ratingBarDetails = findViewById(R.id.ratingBar_details);


        GetDataFromIntent();

    }

    private void GetDataFromIntent() {
        if (getIntent().hasExtra("search")){
            recipie movieModel = getIntent().getParcelableExtra("search");

            titleDetails.setText(movieModel.getTitle());
            descDetails.setText(movieModel.getServings());





            Glide.with(this)
                    .load("https://image.tmdb.org/t/p/w500/"
                            +movieModel.getImage())
                    .into(imageViewDetails);




        }
    }



}
