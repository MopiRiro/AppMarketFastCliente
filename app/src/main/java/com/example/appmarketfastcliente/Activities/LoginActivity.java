package com.example.appmarketfastcliente.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.appmarketfastcliente.Fragments.MenuPrincipalFragment;
import com.example.appmarketfastcliente.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void AutenticacionNumero(View view){
        Intent intent = new Intent(this, AutenticacionNumeroActivity.class);
        startActivity(intent);
    }

    public void IngresoCorreo(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void IngresoCatalogo(View view){
        Intent intent = new Intent(this, CatalogoActivity.class);
        startActivity(intent);
    }

    public void Registrarse(View view){
        Intent intent = new Intent(this, DatosUsuarioActivity.class);
        startActivity(intent);
    }

}