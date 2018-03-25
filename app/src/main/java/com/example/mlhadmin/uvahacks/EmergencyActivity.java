package com.example.mlhadmin.uvahacks;

/**
 * Created by MLH Admin on 3/24/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;
import android.net.Uri;

public class EmergencyActivity extends AppCompatActivity {

    Button title_button_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri appLinkUri = Uri.parse(getIntent().getDataString());
        String responseCode = appLinkUri.getQueryParameter("access_token");
        title_button_3 = (Button) findViewById(R.id.title_button_3);
        title_button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://api-sandbox.safetrek.io/v1"));
                startActivity(intent);

            }
        });

    }


}
