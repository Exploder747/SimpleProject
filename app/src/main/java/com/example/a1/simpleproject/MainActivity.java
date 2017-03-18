package com.example.a1.simpleproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void sendMessage(View view) {

        Intent intent = new Intent(getApplicationContext(), ItemActivity.class);
        intent.putExtra("key",value);
        startActivity(intent);
    }



}