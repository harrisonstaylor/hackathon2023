package com.example.catapp;

import androidx.appcompat.app.AppCompatActivity;
import android.bluetooth.*;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    BluetoothSocket phone;
    BluetoothDevice catBot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}