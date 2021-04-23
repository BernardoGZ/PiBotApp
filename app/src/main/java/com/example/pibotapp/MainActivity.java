package com.example.pibotapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    // Variables usadas para poder acceder a los métodos de identificación de IDs
    // para cada uno de los elementos declarados en la actividad
    private EditText user;
    private EditText pwd;
    //public string usertext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Muestra la interfaz desarrollada para esta pantalla
        setContentView(R.layout.activity_main);
        //Corroborar la sincronización de cuentas con las bases de datos del tec
        // Cada uno de los siguientes corresponden a las diferentes elementos de entrada
        // que se tiene dentro de esta pantalla
        user = (EditText)findViewById(R.id.cuenta);
        pwd = (EditText)findViewById(R.id.pass);
        Button loginBtn = (Button)findViewById(R.id.login);


        // Con esta función se hace que cada se vaya a una sección diferente cuando se haga click sobre el botón establecido
        loginBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                setContentView(R.layout.activity_welcome_screen);
            }
        });

        Button menubtn1 = (Button)findViewById((R.id.menubtn1));
//        menubtn1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent nextpag = new Intent(v.getContext(), mainMenu.class);
//                startActivityForResult(nextpag, 0);
//            }
//        });

        /*menubtn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                setContentView(R.layout.activity_questionario);
            }
    });
        });*/
    }

    // Con esta función se puede insertar datos de acceso de tal manera que se pueda restringir el acceso
    // No está implementada
//    private void validate () {
//        if (usertext == "bernardo") {
//            return;
//        }
//    }
}
