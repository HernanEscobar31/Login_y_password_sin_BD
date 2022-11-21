package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button enter;
    public Button exit;
    private TextView password;
    private TextView usuario;
    String lo = "Hernan", pass="1234", nombre= "Hernan Alexis Escobar Perez";
    private EditText login, passw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter=findViewById(R.id.button);
        exit=findViewById(R.id.button3);
        password=findViewById(R.id.pass);
        usuario=findViewById(R.id.user);
        login=findViewById(R.id.login);
        passw=findViewById(R.id.passw);
    }
    public void revision(View view){
            //Revisar que login y password sean iguales
            Intent v1 = new Intent(MainActivity.this,Ventana2.class);
            Intent v2 = new Intent(MainActivity.this,Ventana6.class);
            String l=login.getText().toString();//Se declaran las variables
            String p=passw.getText().toString();
            if(lo.equals(l) && pass.equals(p)){//Con variables
                // if(lo.equals(login.getText().toString() && passw.getText().toString())){
                v1.putExtra("nombre",nombre);//Se agrega como extra
                startActivity(v1);
            }
            else{
                startActivity(v2);
            }
        //view.setAction(Intent.ACTION_VIEW);
        //view.setData(Uri.parse());


    }
    public void salir(View view){
        //Revisar que login y password sean iguales
        Intent v2 = new Intent(MainActivity.this,Ventana3.class);
        //view.setAction(Intent.ACTION_VIEW);
        //view.setData(Uri.parse());
        startActivity(v2);

    }
    public void contraseña(View view){
        //Revisar que login y password sean iguales
        Intent v3 = new Intent(MainActivity.this,Ventana4.class);
        //view.setAction(Intent.ACTION_VIEW);
        //view.setData(Uri.parse());
        startActivity(v3);

    }
    public void usuario(View view){
        //Revisar que login y password sean iguales
        Intent v4 = new Intent(MainActivity.this,Ventana5.class);
        //view.setAction(Intent.ACTION_VIEW);
        //view.setData(Uri.parse());
        startActivity(v4);

    }

}