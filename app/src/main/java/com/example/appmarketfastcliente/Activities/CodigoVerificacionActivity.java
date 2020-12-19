package com.example.appmarketfastcliente.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.appmarketfastcliente.R;
public class CodigoVerificacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_verificacion);
    }
    public void DatosUsuario(View view){
        Intent intent = new Intent(this, DatosUsuarioActivity.class);
        startActivity(intent);
    }
}