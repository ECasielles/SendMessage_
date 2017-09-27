package com.example.usuario.sendmessage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
    }
}
