package com.minticgrupo08.grupo02.Actividades.Ventanas_Principales;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.minticgrupo08.grupo02.Adapter.Mascota;
import com.minticgrupo08.grupo02.R;


public class Registro_Mascotas extends AppCompatActivity {
    EditText txtnombre, txtdescripcion;
    private Button aStorage;
    private StorageReference myStorage;
    private static final int GALLERY_INTENT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_mascotas); //Barra de Navegación
        //Iniciar y Crear Variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.barra_navegacion_inferior);
        //Selección Principal
        bottomNavigationView.setSelectedItemId(R.id.Mascotas);
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
        txtnombre = findViewById(R.id.txtNombreMascota);
        txtdescripcion = findViewById(R.id.txtDescripcion);

        //storage imagenes
        myStorage = FirebaseStorage.getInstance().getReference();
             /////////BOTON
              aStorage = (Button) findViewById(R.id.aStorage);

                aStorage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //imagen
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, GALLERY_INTENT);
            }
        });
    }
    public void atexto(View view) {
        Mascota mascota = new Mascota();
        mascota.setNombreMascota(txtnombre.getText().toString());
        mascota.setDescripciontxt(txtdescripcion.getText().toString());

        //Insercion
        FirebaseDatabase database =  FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference("Mascota");
        reference.push().setValue(mascota);
    }




           @Override
           protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
               super.onActivityResult(requestCode, resultCode, data);

               if (requestCode == GALLERY_INTENT && resultCode == RESULT_OK) {

                   Uri uri = data.getData();

                   StorageReference filePath = myStorage.child("fotos").child(uri.getLastPathSegment());
                   filePath.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                       @Override
                       public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                           Toast.makeText(Registro_Mascotas.this, "Subida Correctamente", Toast.LENGTH_SHORT).show();
                       }
                   });
               }
           }


}