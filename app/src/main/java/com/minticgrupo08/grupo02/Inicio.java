package com.minticgrupo08.grupo02;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        //Barra de Navegación
        //Iniciar y Crear Variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.barra_navegacion_inferior);
        //Selección Principal
        bottomNavigationView.setSelectedItemId(R.id.Inicio);

        //Item Select Listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.Buscador:
                        startActivity(new Intent(getApplicationContext()
                                ,Buscador.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Inicio:

                        return true;

                    case R.id.Mascotas:
                        startActivity(new Intent(getApplicationContext()
                                ,Mascotas.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

    }
}