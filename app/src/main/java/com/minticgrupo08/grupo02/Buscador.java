package com.minticgrupo08.grupo02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Buscador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);
        //Barra de Navegación
        //Iniciar y Crear Variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.barra_navegacion_inferior);
        //Selección Principal
        bottomNavigationView.setSelectedItemId(R.id.Buscador);
        //Desing
        bottomNavigationView.setBackground(null);
        //Item Select Listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.Inicio:
                        startActivity(new Intent(getApplicationContext()
                                ,Inicio.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Buscador:
                        return true;




                    case R.id.Mascotas:
                        startActivity(new Intent(getApplicationContext()
                                ,Mascotas.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.MiCuenta:
                        startActivity(new Intent(getApplicationContext()
                                ,MiCuenta.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}