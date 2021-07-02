package com.example.myapplication.recipieresponse;

import com.example.myapplication.recipiemodel.recipie;
import com.google.gson.annotations.Expose;

public class recipieresponse {


    @SerializedName("results")
    @Expose
    private recipie recipie;


    public recipie getRecipie() {
        return recipie;
    }

    @Override
    public String toString() {
        return "MovieResponse{" +
                "movie=" + recipie +
                '}';
    }


}
