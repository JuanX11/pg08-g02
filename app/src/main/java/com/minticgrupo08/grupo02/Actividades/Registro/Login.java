package com.minticgrupo08.grupo02.Actividades.Registro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.minticgrupo08.grupo02.R;

import java.util.Arrays;
import java.util.List;

public class Login extends AppCompatActivity {
    FirebaseAuth mfirebaseAuth;

    //refernciamos los views
    EditText TextEmail = findViewById(R.id.EmailRegistro);
    EditText  TextPassword = findViewById(R.id.ContraseñaLogin);
    Button botonRegistrar =  findViewById(R.id.Boton_IniciarSesion);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void ClickLogin(View view) {
        //captura del email y contraseña de los edittext
        String email = TextEmail.getText().toString().trim();
        String password = TextPassword.getText().toString().trim();


    }
}