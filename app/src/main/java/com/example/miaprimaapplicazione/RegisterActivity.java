package com.example.miaprimaapplicazione;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //visualizzare la grafica del file .xml
        setContentView(R.layout.activity_register);
        //collegamento con elementi grafici
        EditText nome = findViewById(R.id.txt_Nome);
        EditText cognome = findViewById(R.id.txt_Cognome);
        EditText email = findViewById(R.id.txte_Email);
        EditText password = findViewById(R.id.txtp_Password);
        EditText dataNascita = findViewById(R.id.td_DataNascita);
     //   Button registrati = findViewById(R.id.btn_register);

        Log.d("Registrazione","Nome: "+

    }


}