package com.minticgrupo08.grupo02.Actividades.Registro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.minticgrupo08.grupo02.Actividades.Ventanas_Principales.Inicio;
import com.minticgrupo08.grupo02.R;

public class RegistroUsuarios extends AppCompatActivity implements  View.OnClickListener{

    //defino variables
    private EditText TextEmail;
    private  EditText TextPassword;
    private Button botonRegistrar;
    private ProgressDialog progressDialog;

    //declaracion del objeto firebase
    private  FirebaseAuth firebaseAuth;
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();
        if(currentUser != null){
            reload();
        }
    }

    private void reload() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuarios);

        //inicializacion del objeto firebase
        firebaseAuth = FirebaseAuth.getInstance();

        //refernciamos los views
        TextEmail = (EditText) findViewById(R.id.EmailRegistro);
        TextPassword = (EditText) findViewById(R.id.ContraseñaRegistro);
        botonRegistrar = (Button) findViewById(R.id.Boton_Registrar);

        //dialogo que indica el progreso del registro
        progressDialog = new ProgressDialog(this);

        //lanzamos el evento onClic para el boton registrar
        botonRegistrar.setOnClickListener(this);


    }

    private void registrarUsuario() {
        //captura del email y contraseña de los edittext
        String email = TextEmail.getText().toString().trim();
        String password = TextPassword.getText().toString().trim();

        //validacion para entrada de datos
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Debe Ingresar Email", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Debe Ingresar la contraseña", Toast.LENGTH_LONG).show();
            return;

        }

        progressDialog.setMessage("Realizando registro...");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(RegistroUsuarios.this, "Usuario registrado ", Toast.LENGTH_LONG).show();
                            Intent intent= new Intent(getApplicationContext(), Inicio.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(RegistroUsuarios.this, "No se pudo registrar el usuario", Toast.LENGTH_LONG).show();
                        }
                        progressDialog.dismiss();

                    }
                });

    }

    @Override
    public void onClick(View v) {
        registrarUsuario();

    }


}