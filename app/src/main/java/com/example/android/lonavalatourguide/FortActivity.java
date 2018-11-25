package com.example.android.lonavalatourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class FortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FortFragment())
                .commit();
    }
}
