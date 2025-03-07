package com.example.miaprimaapplicazione;

public class Utente {
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String dataNascita;

    Utente(String nome, String cognome, String email, String password, String dataNascita){
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.dataNascita = dataNascita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

}
