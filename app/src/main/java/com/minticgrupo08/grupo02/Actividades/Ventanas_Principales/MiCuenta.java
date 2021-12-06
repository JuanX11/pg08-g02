package com.minticgrupo08.grupo02.Actividades.Ventanas_Principales;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.minticgrupo08.grupo02.Actividades.Registro.Login;
import com.minticgrupo08.grupo02.R;

public class MiCuenta extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_cuenta);
        //nav
        drawerLayout = findViewById(R.id.drawerlayout);
    }

    public void ClickMenu(View view) {
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
        Toast.makeText(this, "Ya te encuentras en esta ventana.", Toast.LENGTH_SHORT).show();
    }
    public void ClickCerrarSesion(View view) {
        //Cerrar Sesión
        salir(this);
    }
    public void salir(Activity activity) {
        //Inicializar alert
        AlertDialog.Builder builder =new AlertDialog.Builder(activity);
        //TITULO
        builder.setTitle("Cerrar Sesión");
        //MENSAJE
        builder.setMessage("¿Seguro Quieres Cerrar Sesión?");

        //Boton Si
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finish activity
                activity.finishAffinity();
                //salir app
                Intent intent= new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });
        //Boton No
        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //dissmiss dialog
                dialog.dismiss();
            }
        });
        //show dialog
        builder.show();


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











