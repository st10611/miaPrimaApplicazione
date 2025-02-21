package com.example.miaprimaapplicazione;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //visualizzare la grafica del file .xml
        setContentView(R.layout.activity_login);
    }
}