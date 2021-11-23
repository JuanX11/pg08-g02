package com.minticgrupo08.grupo02.Actividades.Ventanas_Principales;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import com.minticgrupo08.grupo02.Adapter.Adapter;
import com.minticgrupo08.grupo02.Adapter.Mascota;
import com.minticgrupo08.grupo02.R;

import java.util.ArrayList;


public class Inicio extends AppCompatActivity {
RecyclerView recyclerView;
DatabaseReference database;
Adapter adapter;
ArrayList<Mascota> list;
    //Inicializar variable Nav
    DrawerLayout drawerLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        //nav
        drawerLayout= findViewById(R.id.drawerlayout);

//cards
        recyclerView = findViewById(R.id.mascotlist);
        database = FirebaseDatabase.getInstance().getReference("Mascota");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        adapter = new Adapter(this, list);
        recyclerView.setAdapter(adapter);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    Mascota mascota = dataSnapshot.getValue(Mascota.class);
                    list.add(mascota);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

/*
        //Barra de Navegación
        //Iniciar y Crear Variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.barra_navegacion_inferior);
        //Selección Principal
        bottomNavigationView.setSelectedItemId(R.id.Inicio);
        //Desing
        bottomNavigationView.setBackground(null);
        //Item Select Listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.Inicio:
                        return true;


                    case R.id.Mascotas:
                        startActivity(new Intent(getApplicationContext()
                                , Registro_Mascotas.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.MiCuenta:
                        startActivity(new Intent(getApplicationContext()
                                , MiCuenta.class));
                        overridePendingTransition(0, 0);
                        return true;

                }
                return false;*/
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
        //Recargar actividad
        recreate();
    }
    public void ClickRegistro_Mascotas(View view){
        redirectActivity(this,Registro_Mascotas.class);
    }
    public void ClickMiCuenta(View view){
        //Redireccionar a la 3ra actividad
        redirectActivity(this,MiCuenta.class);
    }
    public void ClickLogout(View view){
        //Cerrar Sesión
        logout(this);
    }

    public static void logout(Activity activity) {
    //Inicializar alert
        AlertDialog.Builder builder =new AlertDialog.Builder(activity);
    //TITULO
        builder.setTitle("Cerrar Sesión");
    //MENSAJE
        builder.setMessage("¿Seguro quieres Cerrar Sesión?");

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

}





