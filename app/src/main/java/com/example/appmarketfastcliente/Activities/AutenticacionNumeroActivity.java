package com.example.appmarketfastcliente.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.appmarketfastcliente.R;

public class AutenticacionNumeroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autenticacion_numero);
    }

    public void CodigoVerificacion(View view){
        Intent intent = new Intent(this, CodigoVerificacionActivity.class);
        startActivity(intent);
    }
}