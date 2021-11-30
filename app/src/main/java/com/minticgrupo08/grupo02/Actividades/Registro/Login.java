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
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.minticgrupo08.grupo02.Actividades.SplashActivity;
import com.minticgrupo08.grupo02.Actividades.Ventanas_Principales.Registro_Mascotas;
import com.minticgrupo08.grupo02.R;

public class Login extends AppCompatActivity implements  View.OnClickListener {

    private Button btnLogin, btnRegistrarse;
    private EditText TextEmail;
    private EditText TextPassword;

    //declaracion del objeto firebase
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //inicializacion del objeto firebase
        firebaseAuth = FirebaseAuth.getInstance();

        //refernciamos los views
        TextEmail = (EditText) findViewById(R.id.UsuarioLogin);
        TextPassword = (EditText) findViewById(R.id.ContraseñaLogin);


        btnLogin = (Button) findViewById(R.id.Boton_IniciarSesion);
        btnRegistrarse = (Button) findViewById(R.id.Boton_irARegistrar);

        //Lanzo el evento OnClick para los botones iniciar sesion y registrarse
        btnLogin.setOnClickListener(this);
        btnRegistrarse.setOnClickListener(this);
    }

    private void loguearUsuario () {
        //captura del email y contraseña de los edittext
        String email = TextEmail.getText().toString().trim();
        String password = TextPassword.getText().toString().trim();

        //validacion para entrada de datos
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, " Falta Email", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Falta contraseña", Toast.LENGTH_LONG).show();
            return;

        }

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Login.this, "Bienvenido ", Toast.LENGTH_LONG).show();

                            Intent intent = new Intent(Login.this,Registro_Mascotas.class);
                            startActivity(intent);
                            finish();

                        }
                        else{
                            Toast.makeText(Login.this, "Usuario no existe", Toast.LENGTH_LONG).show();
                        }
                    }


                });

    }

    //metodo para definir que accion se realiza o que metodo se llama de acuerdo al boton que presione el usuario
    @Override
    public void onClick(View v) {
        switch (v.getId()){                        //obtengo el id

            case R.id.Boton_IniciarSesion:
                loguearUsuario();
                break;

            case R.id.Boton_irARegistrar:
                Intent intent = new Intent(Login.this,RegistroUsuarios.class);
                startActivity(intent);


        }

    }

}

