package com.example.evaluacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.evaluacion1.utilities.AppConstant.TEXT_EMAIL;
import static com.example.evaluacion1.utilities.AppConstant.TEXT_PR;
import static com.example.evaluacion1.utilities.AppConstant.TEXT_USUARIO;

public class Factura extends AppCompatActivity {

    private static LinearLayout ly_fac;

    private static TextView usuario, email, productos;
    private static Button btnCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);

        ly_fac = findViewById(R.id.ly_factura);

        usuario = findViewById(R.id.usuario_reci);
        email = findViewById(R.id.correo_reci);
        productos = findViewById(R.id.productos_reci);

        btnCompartir = findViewById(R.id.btn_compartir);

        Intent nIntent = getIntent();


        if(nIntent != null) {
            usuario.setText(nIntent.getStringExtra(TEXT_USUARIO));
            email.setText(nIntent.getStringExtra(TEXT_EMAIL));
            productos.setText(nIntent.getStringExtra(TEXT_PR));


        }

    }
}
