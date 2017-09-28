package com.example.usuario.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Activity secundaria. Recibe un nombre de usuario
 * y un mensaje de la Activity principal.
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see android.app.Activity
 * @see android.support.v7.app.AppCompatActivity
 *
 */
public class ViewMessageActivity extends AppCompatActivity {

    private TextView txvViewMessage;
    private TextView txvViewUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
        txvViewMessage = (TextView) findViewById(R.id.txvViewMessage);
        txvViewUser = (TextView) findViewById(R.id.txvViewUser);
        //1: Recoger el Intent que se ha enviado
        //2: Recoger el mensaje del Bundle
        //3: Mostrar mensaje
        txvViewMessage.setText(getIntent().getExtras().getString("message"));
        txvViewUser.setText(
                String.format(
                    getResources().getString(R.string.txvViewUser),
                    getIntent().getExtras().getString("user")
                )
        );
        //Tenerlo en una sola línea de código reduce la cantidad de objetos duplicados

    }
}
