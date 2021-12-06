package com.minticgrupo08.grupo02.Actividades.Ventanas_Principales;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
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
        drawerLayout= findViewById(R.id.drawerlayout);
    }

    public void ClickMenu (View view){
        //Open Drawer
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public void ClickLogo(View view){
        //CerrarDrawer
        closeDrawer(drawerLayout);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        //Close drawer layout
        //check condition
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            //when drawer is open, close drawer
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
    public void ClickHome(View view){
        //Redireccionar a la 3ra actividad
        redirectActivity(this, Inicio.class);

    }
    public void ClickRegistro_Mascotas(View view){
        redirectActivity(this,Registro_Mascotas.class);
    }
    public void ClickMiCuenta(View view){
        //Recargar actividad
        Toast.makeText(this, "Ya te encuentras en esta ventana.", Toast.LENGTH_SHORT).show();


    }
    public void ClickCerrarSesion(View view){
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
                Intent intent= new Intent(getApplicationContext(), Login.class);
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
        //Cerrar App
        logout(this);
    }



    public static void logout(Activity activity) {
        //Inicializar alert
        AlertDialog.Builder builder =new AlertDialog.Builder(activity);
        //TITULO
        builder.setTitle("Cerrar App");
        //MENSAJE
        builder.setMessage("¿Seguro Quieres Cerrar La Aplicación?");

        //Boton Si
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finish activity
                activity.finishAffinity();
                //salir app
                System.exit(0);
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

    public static void redirectActivity(Activity activity, Class aClass) {
        Intent intent = new Intent(activity, aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
    }
    @Override
    protected void  onPause() {
        super.onPause();
        //Cerrar Drawer
        closeDrawer(drawerLayout);

    }

    public void ClickA(View view) {
        Inicio.redirectActivity(this,MiCuenta.class);
    }
}














