package com.example.root.testlistapais;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class descripcion extends AppCompatActivity {

    ImageView icono;
    TextView nombre,notacion,descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        icono = findViewById(R.id.imageView);
        nombre = findViewById(R.id.nombreTxt);
        notacion = findViewById(R.id.dominioTxt);
        descripcion = findViewById(R.id.editText);


        Intent intent = getIntent();
        int iconos = intent.getIntExtra("icono",R.drawable.ic_launcher_foreground);
        String contenido = intent.getStringExtra("nombre");
        String extra = intent.getStringExtra("dominio");


        icono.setImageResource(iconos);
        nombre.setText(contenido);
        notacion.setText(extra);

    }
}
