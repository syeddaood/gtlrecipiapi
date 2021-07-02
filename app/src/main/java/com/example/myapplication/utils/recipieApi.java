package com.example.myapplication.utils;

import com.example.myapplication.repositories.reciperesponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface recipieApi {

    @GET("/search/")
    Call<reciperesponse> searchMovie(
            @Query("api_key") String key,
            @Query("query") String query,
            @Query("page") int page
    );



}
