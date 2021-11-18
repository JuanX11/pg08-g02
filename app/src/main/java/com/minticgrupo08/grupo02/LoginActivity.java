package com.minticgrupo08.grupo02;



import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    /*declaracion variables*/
    private TextView t1;
    private  EditText et1, et2;
    private ImageView iv;
    private Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //ocultar actionbar
        //getSupportActionBar().hide();

        /*cargando valores a las variables*/
        t1 = (TextView) findViewById(R.id.textView2);
        iv = (ImageView) findViewById(R.id.imageView);
        b1 = (Button) findViewById((R.id.button2));
        et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        et2 = (EditText) findViewById(R.id.editTextTextPassword2);
        //String link = "<a href='https://imaster.academy/course/view.php?id=1001&section=3'>iMaster</a>";
        //t1.setMovementMethod(LinkMovementMethod.getInstance());
        String texto = "Recuperar contraseña";
        t1.setText(Html.fromHtml(texto));
        /*metodo de escucha para cueando el usuario haga clic en la opcion recuperar contraseña*/
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*condicion que dice que la contr es admin si el usuario es admin*/
                if(et1.getText().toString().equals("admin")) {
                    Toast.makeText( LoginActivity.this, "su contraseña es: admin",
                            Toast.LENGTH_SHORT).show();;

                }
                //if(et1.getText().toString().equals(settings.getString("user", ""))) {
                //Toast.makeText(, "", Toast.LENGTH_SHORT).show();.makeText(LoginActivity.this,
                //"Su contraseña es: " + settings.getString("pass", ""),
                // Toast.LENGTH_SHORT).show();

            }
        });


    }

    /*metodo asociaod al boton, este metodo se asocia al evento Onclicc en el atributo del Bottom*/
    /*estos metodos no tienen conexion a la bd aun*/
    public void iniciarSesion (View view){
        if(et1.getText().toString().equals("admin")&& et2.getText().toString().equals("admin")){
            /*si la condicion de arriba se cumple llame a la actividad principal*/
            Intent newIntent = new Intent(this,MainActivity.class);
            startActivity(newIntent);
            finish();
        }
        else { Toast.makeText( LoginActivity.this,"Datos Incorrectos", Toast.LENGTH_SHORT).show();
            et1.requestFocus();
        }

        /* si no dig usuario sale mensaje por favor ingrese usuario*/
        if (et1.getText().toString().equals("")){
            Toast.makeText( LoginActivity.this,"Por favor ingrese usuario", Toast.LENGTH_SHORT).show();
            et1.requestFocus(); /*coloca foco para que el cursor vuelva a et1*/
        }
        else if (et2.getText().toString().equals("")){
            Toast.makeText( LoginActivity.this,"Por favor ingrese contraseña", Toast.LENGTH_SHORT).show();
            et2.requestFocus(); /*coloca foco para que el cursor vuelva a et2*/
        }

    }
}

