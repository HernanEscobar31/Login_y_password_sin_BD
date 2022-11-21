package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ventana2 extends AppCompatActivity {
    public TextView mensaje;
           Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        mensaje=findViewById(R.id.mensaje);
        datos=getIntent().getExtras();//REcibe la informacion enviada por el PutExtra y el Intent
        mensaje.setText(datos.getString("nombre"));
    }
    public void salir(View view){

        finish();
    }
}