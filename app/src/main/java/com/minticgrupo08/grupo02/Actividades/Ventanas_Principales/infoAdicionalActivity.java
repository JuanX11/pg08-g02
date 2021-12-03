package com.minticgrupo08.grupo02.Actividades.Ventanas_Principales;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.minticgrupo08.grupo02.R;

public class infoAdicionalActivity extends AppCompatActivity {
    ImageButton btnTerms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_adicional);

        btnTerms = findViewById(R.id.btnTermsyCond);

    }

    public void abrirTerminos(View view){
        String info="Ի՞նչ է Lorem Ipsum-ը\n" +
                "Lorem Ipsum-ը տպագրության և տպագրական արդյունաբերության համար նախատեսված մոդելային տեքստ է: Սկսած 1500-ականներից` Lorem Ipsum-ը հանդիսացել է տպագրական արդյունաբերության ստանդարտ մոդելային տեքստ, ինչը մի անհայտ տպագրիչի կողմից տարբեր տառատեսակների օրինակների գիրք ստեղծելու ջանքերի արդյունք է: Այս տեքստը ոչ միայն կարողացել է գոյատևել հինգ դարաշրջան, այլև ներառվել է էլեկտրոնային տպագրության մեջ` մնալով էապես անփոփոխ: Այն հայտնի է դարձել 1960-ականներին Lorem Ipsum բովանդակող Letraset էջերի թողարկման արդյունքում, իսկ ավելի ուշ համակարգչային տպագրության այնպիսի ծրագրերի թողարկման հետևանքով, ինչպիսին է Aldus PageMaker-ը, որը ներառում է Lorem Ipsum-ի տարատեսակներ:";
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

}