package com.minticgrupo08.grupo02.Actividades.Ventanas_Principales;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
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
                return false;
            }
        });


    }

        }
