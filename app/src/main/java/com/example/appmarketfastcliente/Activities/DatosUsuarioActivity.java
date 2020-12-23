package com.example.appmarketfastcliente.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.appmarketfastcliente.R;

public class DatosUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_usuario);
    }
    public void AsignarContrasena(View view){
        Intent intent = new Intent(this, AsignarContrasenaActivity.class);
        startActivity(intent);
    }

    public void MenuPrincipal(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}