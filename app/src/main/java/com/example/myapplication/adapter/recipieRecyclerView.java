package com.example.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.recipiemodel.recipie;

import java.util.List;

public class recipieRecyclerView extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<recipie> mMovies;
    private onrecipielistener onMovieListener;

    private static final int DISPLAY_POP = 1;
    private static final int DISPLAY_SEARCH = 2;

    public recipieRecyclerView(onrecipielistener onMovieListener) {
        this.onMovieListener = onMovieListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;

        if (viewType == DISPLAY_SEARCH) {

            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipie_list_item,
                    parent, false);
            return new recipieViewHolder(view, onMovieListener);
        }

        else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipiedetails,
                    parent, false);
            //return new Popular_view_holder(view, onMovieListener);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
