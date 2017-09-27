package com.example.usuario.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Activity principal. Pide un nombre de usuario
 * y un mensaje para enviarlo a la Activity ViewMessage,
 * que se lanza al pulsar el botón "OK".
 *
 * @author Enrique Casielles Lapeira
 * @version 1.0
 * @see android.app.Activity
 * @see android.support.v7.app.AppCompatActivity
 *
 */
public class SendMessageActivity extends AppCompatActivity {

    private EditText edtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        edtMessage = (EditText) findViewById(R.id.edtMessage);
    }

    public void getOnClick(View view) {

        switch (view.getId()){
            case R.id.btnOk:
                //1: Recoger el mensaje
                //2: Crear un objeto Bundle y añadir el mensaje
                Bundle bundle = new Bundle();
                bundle.putString("mensaje", edtMessage.getText().toString());

                //3: Crear un objeto Intent
                //Por nomenclatura se usa el nombre de la clase más this, aunque
                //sea obvio.
                Intent intent = new Intent(SendMessageActivity.this, ViewMessageActivity.class);

                //4: Añadir el objeto Bundle al objeto Intent
                intent.putExtras(bundle);
                //4: Iniciar la Activity ViewMessage
                startActivity(intent);
                break;
        }

    }
}
