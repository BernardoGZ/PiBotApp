package com.example.pibotapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class mainMenu extends AppCompatActivity {
    //Terminar de insertar los diferentes departamentos correspondientes a las diferentes areas
//    private Button puntoAzul;
//    private Button covid;
//    private Button pibot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Muestra la página correspondiente
        setContentView(R.layout.activity_menu1);

        // Relación del elemento de la página con la variable que lo representará
//        puntoAzul = (Button)findViewById(R.id.PAzul);
//        covid=(Button)findViewById(R.id.covid19);
//        pibot=(Button)findViewById(R.id.pibotstart);




        // Con esta función se hace que cada se vaya a una sección diferente cuando se haga click sobre el botón establecido
        /*puntoAzul.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                nextPARequest();
            }
        });
        covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextPAGRequest();
            }
        });
        pibot.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                nextPRequest();
            }
        });*/
    }

    // Función con la que se establece a qué página se dirigirá después
    /*private void nextPARequest () {
        Intent intent = new Intent(this, NextPA.class);
        startActivity(intent);
    }
    private void nextPAGRequest () {
        Intent intent = new Intent(this, NextPAG.class);
        startActivity(intent);
    }
    // funcion que nos permite ir a la pagina web indicada
    private void nextPRequest(){
        Intent intent = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://tec.mx/es"));
        startActivity(intent);
    }*/

}
