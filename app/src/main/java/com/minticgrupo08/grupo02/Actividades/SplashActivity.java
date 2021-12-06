package com.minticgrupo08.grupo02.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;
import com.minticgrupo08.grupo02.Actividades.Registro.Login;
import com.minticgrupo08.grupo02.Actividades.Registro.RegistroUsuarios;
import com.minticgrupo08.grupo02.Actividades.Ventanas_Principales.Inicio;
import com.minticgrupo08.grupo02.Actividades.Ventanas_Principales.Registro_Mascotas;
import com.minticgrupo08.grupo02.R;

public class SplashActivity extends AppCompatActivity {
    private final int DURACION_SPLASH= 3000;

    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        lottieAnimationView =findViewById(R.id.lottie);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, Inicio.class);
                startActivity(intent);
                finish();
            }
        }, DURACION_SPLASH);
    }
}