package com.example.ios_razrab.serializable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, SecondActivity .class);
        intent .putExtra("serial", new PodSerializable(50, "Michael","trans"));
        startActivity(intent);
    }
}
