package com.example.mlhadmin.uvahacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    Button title_button_1, title_button_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title_button_1 = (Button) findViewById(R.id.title_button_1);
        title_button_2 = (Button) findViewById(R.id.title_button_2);

        title_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String redirectUri = "https://uvahacks-jean.herokuapp.com/callback";
                String url = "https://account-sandbox.safetrek.io/authorize?client_id=m5qXF5ztOdT4cdQtUbZT2grBhF187vw6&scope=openid%20phone%20offline_access&response_type=code&redirect_uri=" + redirectUri;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                System.out.println(url);
                startActivity(intent);
                MainActivity.super.onResume();
                Uri uri = getIntent().getData();
                System.out.println(uri);
                if (uri != null) {
                    final String accessToken = uri.getQueryParameter("access_token");
                    System.out.print("access_token" + accessToken);
            }

            }



        });

    }}



