package com.example.ios_razrab.serializable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.Serializable;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       PodSerializable podSerializable =(PodSerializable) getIntent() .getSerializableExtra("serial");

        Log .i("Пришедшее имя ", podSerializable .name);
        Log .i("Пришедший возраст ", String.valueOf(podSerializable .age));
        Log .i("Непришедший трансиент ", String.valueOf(podSerializable .experimentalTransient));



    }
}
