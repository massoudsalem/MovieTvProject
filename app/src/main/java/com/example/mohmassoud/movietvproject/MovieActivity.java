package com.example.mohmassoud.movietvproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MovieActivity extends AppCompatActivity {
    private List<Item> dataList = new ArrayList<Item>();;
    private RecyclerViewAdapter adapter;
    private RecyclerView currentRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        createDataList();
        currentRecyclerView = findViewById(R.id.tvRecyclerView);
        adapter=new RecyclerViewAdapter(this,dataList);
        currentRecyclerView.setAdapter(adapter);
        LinearLayoutManager currentLayoutManager = new LinearLayoutManager(this);
        currentRecyclerView.setLayoutManager(currentLayoutManager);
    }
    void createDataList(){
        dataList.add(new Item("movie 1", "movie des1", R.drawable.img_justice_league,1));
        dataList.add(new Item("movie 2", "movie des2", R.drawable.img_justice_league,2));
        dataList.add(new Item("movie 3", "movie des3", R.drawable.img_justice_league,3));
        dataList.add(new Item("movie 4", "movie des4", R.drawable.img_justice_league,4));
        dataList.add(new Item("movie 5", "movie des5", R.drawable.img_justice_league,5));
    }
}
