package com.minticgrupo08.grupo02.Actividades.Ventanas_Principales;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.textfield.TextInputEditText;
import com.minticgrupo08.grupo02.Actividades.Registro.Login;
import com.minticgrupo08.grupo02.R;

public class infoAdicionalActivity extends AppCompatActivity {
    ImageButton btnTerms;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_adicional);

        btnTerms = findViewById(R.id.btnTermsyCond);
        //nav
        drawerLayout= findViewById(R.id.drawerlayout);


    }
        public void abrirTerminos(View view) {
        String info= "Terminos y condiciones \n\n" +
                "Al acceder y utilizar este servicio, usted acepta y accede a estar obligado por los términos y disposiciones de este acuerdo. Asimismo, al utilizar estos servicios particulares, usted estará sujeto a toda regla o guía de uso correspondiente que se haya publicado para dichos servicios. Toda participación en este servicio constituirá la aceptación de este acuerdo. Si no acepta cumplir con lo anterior, por favor, no lo utilice.\n" +
                "Favor leer cuidadosamente los siguientes términos y condiciones de uso:\n" +
                "\n" +
                "Uso de la aplicación\n\n" +
                "Obtenemos derechos para negarnos a ofrecer MascotaApp como un servicio, y sin previo aviso o explicación, suspender el uso de la aplicación por cualquier periodo de tiempo. Esto significa que no podrá contribuir con ningún contenido a la aplicación.\n" +
                "Cambios\n\n" +
                "MascotaApp puede realizar cambios en el contenido disponible en los servicios en cualquier momento también puede cambiar, actualizar, agregar o eliminar disposiciones de estos Términos, en cualquier momento. Al utilizar los servicios después de que Missing Pets haya actualizado estos Términos, usted acepta todos los Términos actualizados; Si no está de acuerdo con alguno de los Términos actualizados, debe dejar de usar los servicios. Si utiliza los servicios, asegúrese de seguir y aceptar los Términos más recientes.\n" +
                "\n" +
                "Realimentación\n" +
                "\n" +
                "Si envía o transmite cualquier comunicación, comentario, pregunta, sugerencia o material relacionado con respecto a las Mascotas perdidas o los Servicios, ya sea por correo electrónico, dichos Comentarios son y serán tratados como no confidenciales y no propietario. Por la presente, usted asigna todos los derechos, títulos e intereses, y MascotaApp es de uso gratuito, sin ninguna atribución o compensación para usted, cualquier y todos los Comentarios para cualquier propósito. Usted comprende y acepta que MascotaApp no está obligada a usar, exhibir, reproducir o distribuir tales ideas, conocimientos, conceptos o técnicas contenidas en los Comentarios, y no tiene derecho a obligar dicho uso, exhibición, reproducción, o distribución.\n" +
                "\n" +
                "El contenido de la aplicación como texto, graficas, iconos e imágenes y demás contenido de la aplicación son únicamente con propósitos informativos y no pretende ser sustituto de la asesoría de un veterinario.\n" +
                "En ningún momento la aplicación será responsable por algún daño directo o indirecto, incidental o consecuente incluyendo perdidas de beneficios lesiones o daños que surjan por el uso de la aplicación.\n" +
                "\n" +
                "Responsabilidad del contenido\n" +
                "\n" +
                "MascotaApp no puede y no es responsable por el contenido que comparten los usuarios. Al utilizar los servicios, acepta asumir la responsabilidad total del contenido que publica en la aplicación. Si ve contenido que viola los términos, usted, como usuario de MascotaApp, puede y debe informar dicho contenido y / o contactarnos directamente en mascotaapp@gmail.com\n" +
                "\n" +
                "Información normativa y otra información\n" +
                "\n" +
                "Toda la información incluyendo la personal registrada o incluida en la aplicación por usted, el usuario, será almacenada en la nube como usted considere adecuado. Usted es responsable de cualquier dato personal ingresado a la aplicación, así como cualquier acceso ofrecido, ya sea de forma voluntaria e involuntaria, incluyendo perdida de cualquier información.\n";
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.terms)
                .setTitle("Terminos y condiciones")
                .setMessage(info )
                .setPositiveButton("Aceptar", null).show();

    }

    public void abrirDerechos(View view){
        String info="Considerando que todo animal posee derechos y que el desconocimiento y desprecio de dichos derechos han conducido y siguen conduciendo al hombre a cometer crímenes contra la naturaleza y los animales, se proclama lo siguiente:\n\n" +
                "Artículo No. 1\n" +
                "\n" +
                "Todos los animales nacen iguales ante la vida y tienen los mismos derechos a la existencia.\n" +
                "\n" +
                "Artículo No. 2\n" +
                "\n" +
                "a) Todo animal tiene derecho al respeto.\n" +
                "\n" +
                "b) El hombre, como especie animal, no puede atribuirse el derecho de exterminar a los otros animales o de explotarlos, violando ese derecho. Tiene la obligación de poner sus conocimientos al servicio de los animales.\n" +
                "\n" +
                "c) Todos los animales tienen derecho a la atención, a los cuidados y a la protección del hombre.\n" +
                "\n" +
                "Artículo No. 3\n" +
                "\n" +
                "a) Ningún animal será sometido a malos tratos ni a actos crueles.\n" +
                "\n" +
                "b) Si es necesaria la muerte de un animal, ésta debe ser instantánea, indolora y no generadora de angustia.\n" +
                "\n" +
                "Artículo No. 4\n" +
                "\n" +
                "a) Todo animal perteneciente a una especie salvaje tiene derecho a vivir libre en su propio ambiente natural, terrestre, aéreo o acuático y a reproducirse.\n" +
                "\n" +
                "b) Toda privación de libertad, incluso aquella que tenga fines educativos, es contraria a este derecho.\n" +
                "\n" +
                "Artículo No. 5\n" +
                "\n" +
                "a) Todo animal perteneciente a una especie que viva tradicionalmente en el entorno del hombre tiene derecho a vivir y crecer al ritmo y en las condiciones de vida y de libertad que sean propias de su especie.\n" +
                "\n" +
                "b) Toda modificación de dicho ritmo o dichas condiciones que fuera impuesta por el hombre con fines mercantiles es contraria a dicho derecho.\n" +
                "\n" +
                "Artículo No. 6\n" +
                "\n" +
                "a) Todo animal que el hombre haya escogido como compañero tiene derecho a que la duración de su vida sea conforme a su longevidad natural.\n" +
                "\n" +
                "b) El abandono de un animal es un acto cruel y degradante.\n" +
                "\n" +
                "Artículo No. 7\n" +
                "\n" +
                "Todo animal de trabajo tiene derecho a una limitación razonable del tiempo e intensidad del trabajo, a una alimentación reparadora y al reposo.\n" +
                "\n" +
                "Artículo No. 8\n" +
                "\n" +
                "a) La experimentación animal que implique un sufrimiento físico o psicológico es incompatible con los derechos del animal, tanto si se trata de experimentos médicos, científicos, comerciales, como de otra forma de experimentación.\n" +
                "\n" +
                "b) Las técnicas alternativas deben ser utilizadas y desarrolladas.\n" +
                "\n" +
                "Artículo No. 9\n" +
                "\n" +
                "Cuando un animal es criado para la alimentación debe ser nutrido, instalado y transportado, así como sacrificado, sin que ello resulte para él motivo de ansiedad o dolor.\n" +
                "\n" +
                "Artículo No. 10\n" +
                "\n" +
                "a) Ningún animal debe ser explotado para esparcimiento del hombre.\n" +
                "\n" +
                "b) Las exhibiciones de animales y los espectáculos que se sirvan de animales son incompatibles con la dignidad del animal.\n" +
                "\n" +
                "Artículo No. 11\n" +
                "\n" +
                "Todo acto que implique la muerte de un animal sin necesidad es un biocidio, es decir, un crimen contra la vida.\n" +
                "\n" +
                "Artículo No. 12\n" +
                "\n" +
                "a) Todo acto que implique la muerte de un gran número de animales salvajes es un genocidio, es decir, un crimen contra la especie.\n" +
                "\n" +
                "b) La contaminación y la destrucción del ambiente natural conducen al genocidio.\n" +
                "\n" +
                "Artículo No. 13\n" +
                "\n" +
                "a) Un animal muerto debe ser tratado con respeto.\n" +
                "\n" +
                "b) Las escenas de violencia, en las cuales los animales son víctimas, deben ser prohibidas en el cine y en la televisión, salvo si ellas tienen como fin dar muestra de los atentados contra los derechos del animal.\n" +
                "\n" +
                "Artículo No. 14\n" +
                "\n" +
                "a) Los organismos de protección y salvaguarda de los animales deben ser representados a nivel gubernamental.\n" +
                "\n" +
                "b) Los derechos del animal deben ser defendidos por la ley, como lo son los derechos del hombre.\n" +
                "\n" +
                "Esta declaración fue adoptada por La Liga Internacional de los Derechos del Animal en 1977, que la proclamó al año siguiente. Posteriormente, fue aprobada por la Organización de Naciones Unidas (ONU) y por la Organización de las Naciones Unidas para la Educación, la Ciencia y la Cultura (UNESCO).\n\n" +
                "Autor\n\n" +
                "Comisión Nacional de Áreas Naturales Protegidas\n" +
                "Fecha de publicación\n" +
                "15 de octubre de 2019";

        new AlertDialog.Builder(this)
                .setIcon(R.drawable.law_book)
                .setTitle("Derechos universales de los animales")
                .setMessage(info )
                .setPositiveButton("Aceptar", null).show();

    }

    public void abrirAcercade(View view){
        LayoutInflater li = LayoutInflater.from(this);
        View promptsView = li.inflate(R.layout.acercade_dialog, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setView(promptsView);
        //final EditText et1 =  promptsView.findViewById(R.id.input_buscar_img);
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Aceptar", null);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

    public void abrirRateapp(View view){

        LayoutInflater li = LayoutInflater.from(this);
        View promptsView = li.inflate(R.layout.rate_app_dialog, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setView(promptsView);
        final RatingBar ratingBar = promptsView.findViewById(R.id.ratingBar);
        final TextView txt_rating = promptsView.findViewById(R.id.txt_rating);
        txt_rating.setText("La seleccion es: ");
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float ratingValue, boolean fromUser) {
                String rating = "Las seleccion es: " + ratingValue;
                txt_rating.setText(rating);
            }
        });

        //final EditText et1 =  promptsView.findViewById(R.id.input_buscar_img);
        alertDialogBuilder
                .setCancelable(false)
                .setTitle("Calificacion")
                .setIcon(R.drawable.rating)
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        Toast.makeText(getApplicationContext(), "La valoracion es: " + ratingBar.getRating() , Toast.LENGTH_SHORT).show();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

    public void abrirMensaje(View view){
        LayoutInflater li = LayoutInflater.from(this);
        View promptsView = li.inflate(R.layout.contacto_dialog, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setView(promptsView);
        final TextInputEditText nombre = promptsView.findViewById(R.id.input_mensaje_nom)
                ,asunto = promptsView.findViewById(R.id.input_mensaje_asunto)
                ,correo = promptsView.findViewById(R.id.input_mensaje_correo)
                ,telefono = promptsView.findViewById(R.id.input_mensaje_telefono)
                ,mensaje = promptsView.findViewById(R.id.input_mensaje_mensaje);

        final Button limpiar = promptsView.findViewById(R.id.btn_mensaje_limpiar),
                enviar = promptsView.findViewById(R.id.btn_mensaje_enviar);

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText("");
                asunto.setText("");
                correo.setText("");
                telefono.setText("");
                mensaje.setText("");
            }
        });

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!nombre.getText().equals("") && !asunto.getText().equals("") && !correo.getText().equals("") && !telefono.getText().toString().equals("") && !mensaje.getText().equals("")) {
                    String info = "La informacion es:\n "
                            + nombre.getText() + "\n"
                            + asunto.getText() + "\n"
                            + correo.getText() + "\n"
                            + telefono.getText().toString() + "\n"
                            + mensaje.getText();
                    Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "¡Por favor llene todos los campos!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //final EditText et1 =  promptsView.findViewById(R.id.input_buscar_img);
        alertDialogBuilder
                .setCancelable(false)
                .setTitle("Contacto")
                .setIcon(R.drawable.mail)
                .setPositiveButton("Aceptar", null);
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }

    public void irFacebook(View view){
        Uri link = Uri.parse("https://www.facebook.com/");
        Intent i = new Intent(Intent.ACTION_VIEW, link);
        startActivity(i);
    }

    public void irInstagram(View view){
        Uri link = Uri.parse("https://www.instagram.com/");
        Intent i = new Intent(Intent.ACTION_VIEW, link);
        startActivity(i);
    }

    public void irYoutube(View view){
        Uri link = Uri.parse("https://www.youtube.com/");
        Intent i = new Intent(Intent.ACTION_VIEW, link);
        startActivity(i);
    }

    public void irLinkedin(View view){
        Uri link = Uri.parse("https://www.linkedin.com/");
        Intent i = new Intent(Intent.ACTION_VIEW, link);
        startActivity(i);
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
        Inicio.redirectActivity(this,infoAdicionalActivity.class);
    }
}












