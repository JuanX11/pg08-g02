package com.minticgrupo08.grupo02.Actividades.Ventanas_Principales;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.minticgrupo08.grupo02.R;

public class MiCuenta extends AppCompatActivity {
DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_cuenta);
        //nav
        drawerLayout= findViewById(R.id.drawerlayout);
    }
    public void ClickMenu (View view){
        //Open Drawer
        Inicio.openDrawer(drawerLayout);
    }


    public void ClickLogo(View view){
        //cerrar
        Inicio.closeDrawer(drawerLayout);
    }
    public void ClickHome(View view){
        //redicerrecion princopal
        Inicio.redirectActivity(this,Inicio.class);
    }


    public void ClickRegistro_Mascotas(View view){
        Inicio.redirectActivity(this,Registro_Mascotas.class);
    }
    public void ClickMiCuenta(View view){
        //Redireccionar a la 3ra actividad
        recreate();
    }
    public void ClickLogout(View view){
        //Cerrar Sesión
        Inicio.logout(this);
    }
    @Override
    protected void  onPause() {
        super.onPause();
        //Cerrar Drawer
        Inicio.closeDrawer(drawerLayout);

    }
}

