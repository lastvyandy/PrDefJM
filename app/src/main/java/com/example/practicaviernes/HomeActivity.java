package com.example.practicaviernes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        if (getSupportActionBar() != null){
            getSupportActionBar().hide();}


    }
    public void btnSite (View View) {

        String url = "https://www.accuweather.com/es/cl/puerto-montt/821/daily-weather-forecast/821";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }


    public void btnReview (View View) {

        String url = "https://play.google.com/store/apps/details?id=com.marmalade.monopoly&hl=es_PE";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}