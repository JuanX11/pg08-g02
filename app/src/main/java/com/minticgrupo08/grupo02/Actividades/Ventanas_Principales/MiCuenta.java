package com.minticgrupo08.grupo02.Actividades.Ventanas_Principales;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.minticgrupo08.grupo02.R;

public class MiCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_cuenta);
        //Barra de Navegación
        //Iniciar y Crear Variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.barra_navegacion_inferior);
        //Selección Principal
        bottomNavigationView.setSelectedItemId(R.id.MiCuenta);
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


                    case R.id.Mascotas:
                        startActivity(new Intent(getApplicationContext()
                                , Registro_Mascotas.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.MiCuenta:
                        return true;

                }
                return false;
            }
        });
    }
}

