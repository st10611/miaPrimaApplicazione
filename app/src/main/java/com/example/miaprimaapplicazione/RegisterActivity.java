package com.example.miaprimaapplicazione;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

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
        Button register = findViewById(R.id.btn_register);

        //ClickListener
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Utente utente = new Utente(nome.getText().toString(), cognome.getText().toString(), dataNascita.getText().toString(), password.getText().toString(), email.getText().toString());
                Gson gson = new Gson();
                String utenteJson = gson.toJson(utente);
                Log.d("UtenteJson", utenteJson);

                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                intent.putExtra("utente", utenteJson);
                startActivity(intent)
                ;
                Log.d("Registrazione","Nome: "+ nome.getText().toString() + "Cognome: " + cognome.getText().toString() + "email: " + email.getText().toString() + "Password: " + password.getText().toString() + "Data di nascita: " + dataNascita.getText().toString());

                Toast.makeText(RegisterActivity.this, nome.getText() + " registrato",Toast.LENGTH_SHORT).show();
            }
        });


        //public void OnClick


    }


}