package com.example.mohmassoud.movietvproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goMovie(View view) {
        Intent goMovie = new Intent(this,MovieActivity.class);
        startActivity(goMovie);
    }

    public void goTV(View view) {
        Intent goTV=new Intent (this,TvActivity.class);
        startActivity(goTV);
    }
}
