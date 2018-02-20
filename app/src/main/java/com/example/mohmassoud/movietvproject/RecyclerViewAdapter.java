package com.example.mohmassoud.movietvproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Moh.Massoud on 2/6/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private final Context currentActivity;
    private final List<Item> dataList;
    private final LayoutInflater inflater;
    public RecyclerViewAdapter(Context currentActivity, List<Item> dataList) {
        this.currentActivity = currentActivity;
        this.dataList = dataList;
        this.inflater = LayoutInflater.from(currentActivity);
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        Item currentItem = dataList.get(position);
        holder.nameTextviewJava.setText(currentItem.getName());
        holder.descTextviewJava.setText(currentItem.getDescription());
        holder.imageViewJava.setImageResource(currentItem.getImageID());
        holder.ratingBar.setRating(currentItem.getItemRating());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextviewJava;
        TextView descTextviewJava;
        ImageView imageViewJava;
        RatingBar ratingBar;
        public ViewHolder(View itemView) {
            super(itemView);
            nameTextviewJava=itemView.findViewById(R.id.nameTextView);
            descTextviewJava=itemView.findViewById(R.id.desTextView);
            imageViewJava=itemView.findViewById(R.id.imageView);
            ratingBar=itemView.findViewById(R.id.rating);
            ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    ratingBar.setRating(rating);
                }
            });
        }
    }
}