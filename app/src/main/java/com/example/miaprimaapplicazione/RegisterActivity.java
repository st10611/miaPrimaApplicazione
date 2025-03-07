package com.example.miaprimaapplicazione;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //visualizzare la grafica del file .xml
        setContentView(R.layout.activity_register);
        //collegamento con elementi grafici
        EditText none = findViewById(R.id.txt_Nome);
    }


}