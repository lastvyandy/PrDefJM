package com.example.practicaviernes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edt_email, edt_password;
    String correo = "admin@mail.com";
    String clave = "admin123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_email = (EditText) findViewById(R.id.edt_mail);
        edt_password = (EditText) findViewById(R.id.edt_pass);

        if (getSupportActionBar() != null){
            getSupportActionBar().hide();}

    }


    public void segundaPagina(View view) {
 String icorreo=edt_email.getText().toString();
 String iclave=edt_password.getText().toString();

 if (correo.equals(icorreo) && clave.equals(iclave)){
     Intent activity = new Intent(this, HomeActivity.class);
     startActivity(activity);

     Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();

 }else {Toast.makeText(this, "Datos erroneos", Toast.LENGTH_SHORT).show();}

    }

    public void paginaRegistro(View view) {

            Intent activity = new Intent(this, Register.class);
            startActivity(activity);}



}