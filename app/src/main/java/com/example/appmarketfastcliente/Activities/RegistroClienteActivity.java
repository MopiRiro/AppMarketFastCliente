package com.example.appmarketfastcliente.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.appmarketfastcliente.R;


public class RegistroClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_cliente);
    }

    public void MenuPrincipal(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}